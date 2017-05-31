using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace Laba_1_CSharp
{
    class ControlClass
    {
        int[][] mainMassive;
        int n, m;

        public void Input()
        {
            using (StreamReader reader = new StreamReader("graph.txt"))
            {
                string str = reader.ReadLine();
                
                //Вибірка чисел з рядка
                int[] k = Cutting(str);

                n = k[0];//к-сть вершин графа
                m = k[1];//к-ст ребер

                mainMassive = new int[m + 1][];//масив який зберігає вхідні дані
                mainMassive[0] = k;

                int j = 0;

                while ((str = reader.ReadLine()) != null)
                {
                    j++;
                    k = Cutting(str);
                    mainMassive[j] = k;
                }

                Console.WriteLine("{0} {1}", mainMassive[0][0], mainMassive[0][1]);

                for (int i = 1; i < m + 1; i++)
                    Console.WriteLine("{0} {1} {2}", mainMassive[i][0], mainMassive[i][1], mainMassive[i][2]);

                Console.WriteLine();

                int[][] result = SearchResult();//масив з маршрутом довжиною

                Console.WriteLine("Road: ");
                for (int i = 0, len = n - 1; i < len; i++)
                    Console.WriteLine("{0} {1}", result[i][0], result[i][1]);

                Console.WriteLine("Length: {0}",result[n - 1][0]);
            }
        }

        //повертає масив чисел з рядка розділених пробілом
        private int[] Cutting(string input)
        {
            string[] words = input.Split(' ');
            int[] res = new int[words.Length];

            res[0] = Convert.ToInt32(words[0]);
            res[1] = Convert.ToInt32(words[1]);
            if (words.Length > 2)
                res[2] = Convert.ToInt32(words[2]);

            return res;
        }

        //сортування ребр графа за вагою
        private void Sort()
        {
            for(int i = 1; i < m; i++)
            {
                for (int j = i; j < m; j++)
                {
                    if (mainMassive[j][2] > mainMassive[j + 1][2])
                    {
                        int[] prom = mainMassive[j];
                        mainMassive[j] = mainMassive[j + 1];
                        mainMassive[j + 1] = prom;
                    }
                }
            }
        }

        /*
         * повертає масив який містить
         * ребра у другому за вагою кістяеовому
         * графі та в першій комірці останього рядка
         * вагу дерева
         */
        private int[][] SearchResult()
        {
            int len = 0;//вага дерева
            List<int> minRibs = new List<int>();//містить ребра мінімального кістякового дерева

            Sort();//сортування ребр графа

            //прохід по всім ребрам
            for (int i = 1; i < m + 1; i++)
            {
                minRibs.Add(i);//додається поточне ребро у кістякове дерево

                /*
                 * Якщо потчне ребро не утворює цикл
                 * то його вага додається до загальної ваги
                 * інакше видаляється з дерева
                 */
                if (SearchCircles(minRibs))
                    len += mainMassive[i][2];
                else
                    minRibs.RemoveAt(minRibs.Count - 1);
            }

            List<int[][]> allRoads = new List<int[][]>();//містить усі кістякові дерева в яких не використовується одне з ребр мінімального

            //Цикл проходить усі ребра мінімального кістякового дерева 
            for (int j = 0; j < minRibs.Count; j++)
            {
                List<int> ribs = new List<int>();//поточне кістякове дерево
                len = 0;//встановлення початкової ваги графа

                /*
                 * Цикл проходить усі ребра графу і шукає кістякове дерево
                 * без використання j ребра у кістяковому дереві
                 */
                for (int i = 1; i < m + 1; i++)
                {
                    if (i != minRibs[j])
                    {
                        ribs.Add(i);

                        if (SearchCircles(ribs))
                            len += mainMassive[i][2];
                        else
                            ribs.RemoveAt(ribs.Count - 1);
                    }
                }

                int[][] road = new int[ribs.Count + 1][];//ребра поточного кістякового дерева

                for (int i = 0; i < ribs.Count; i++)
                {
                    road[i] = new int[2];
                    road[i][0] = mainMassive[ribs[i]][0];
                    road[i][1] = mainMassive[ribs[i]][1];
                }

                road[road.Length - 1] = new int[1];
                road[road.Length - 1][0] = len;

                allRoads.Add(road);
            }

            int minInd = -1,
                min = -1;

            //пошук початкової мінімальної ваги серед дерев довжина який дорівнює довжині мінімального кістякового
            for(int i = 0; i < allRoads.Count; i++)
            {
                if (allRoads[i].Length == minRibs.Count + 1)
                {
                    min = allRoads[i][minRibs.Count][0];
                    minInd = i + 1;
                    break;
                }    
            }

            //пошук початкової мінімальної ваги серед дерев, віідкидаються дерева з довжиною меншою ніж у мінімального кістякового
            for (int i = minInd; i < allRoads.Count; i++)
            {
                if (allRoads[i].Length == minRibs.Count + 1 && min > allRoads[i][minRibs.Count][0])
                {
                    min = allRoads[i][minRibs.Count][0];
                    minInd = i;
                }
            }

            return allRoads[minInd];//повертається друге за вагою кістякове дерева
        }

        //створення матриці симіжності для поточного дерева, передаються ребра у дереві
        private int[][] CreateSumig(List<int> ribs)
        {
            int[][]sumig = new int[n][];

            for (int i = 0; i < n; i++)
                sumig[i] = new int[n];

            for (int i = 0; i < m; i++)
            {
                if (ribs.Contains(i + 1))
                {
                    sumig[mainMassive[i + 1][0] - 1][mainMassive[i + 1][1] - 1] = 1;
                    sumig[mainMassive[i + 1][1] - 1][mainMassive[i + 1][0] - 1] = 1;
                }
            }

            return sumig;
        }

        /*
         * шукає цикли у дереві, яке передається використовуючи
         * обхід вглиб
         */ 
        private bool SearchCircles(List<int> ribs)
        {
            int[][] sumig = CreateSumig(ribs);//створює матрицю суміжності

            bool[][] visitR = new bool[n][];//матриця ребер, яких вже обійшли

            for (int i = 0; i < n; i++)
                visitR[i] = new bool[n];

            //повертається результат обходу вглиб
            return dfs(mainMassive[ribs[ribs.Count - 1]][0] - 1, sumig, visitR,-1);
        }


        /*
         * Обхід вглиб
         * передається поточна вершина,
         * матриця суміжності для поточного дерева,
         * матриця відвіданих ребер,
         * поперелня вершина
         */
        private bool dfs(int v, int[][] sumig,bool[][] visitR, int last)
        {
            //цикл проходить усі вешиши графа
            for (int i = 0; i < n; i++)
            {   
                /*
                 * якщо вершина v суміжна з вершиною i та їх ребро, ще не ппроходили
                 *  то поставити ребро відвіданим і почати обхід вглиб з вершини i
                 *  та повернути false, якщо обхід повернув false
                 * Якщо ребро було вже пройдено та попередня вершина не дорівнює i
                 * то повернути false
                */
                if (sumig[v][i] == 1 && !visitR[v][i])
                {
                    visitR[v][i] = true;
                    visitR[i][v] = true;
                    if (!dfs(i, sumig, visitR, v))
                        return false;
                }
                else if (visitR[v][i] == true && last != i)
                    return false;
            }
            return true;
        }
    }

}
