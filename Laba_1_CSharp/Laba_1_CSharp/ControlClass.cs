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
        int[,] mainMassive;
        int n, m;

        public void Input()
        {
            using (StreamReader reader = new StreamReader("graph.txt"))
            {
                string str = reader.ReadLine();
                int[] k = Cutting(str);

                n = k[0];
                m = k[1];

                mainMassive = new int[m + 1, 3];
                mainMassive[0, 0] = n;
                mainMassive[0, 1] = m;

                int j = 0;

                while ((str = reader.ReadLine()) != null)
                {
                    j++;
                    k = Cutting(str);
                    mainMassive[j, 0] = k[0];
                    mainMassive[j, 1] = k[1];
                    mainMassive[j, 2] = k[2];
                }

                Console.WriteLine("{0} {1}", mainMassive[1, 0], mainMassive[1, 1]);

                for (int i = 1; i < m + 1; i++)
                    Console.WriteLine("{0} {1} {2}", mainMassive[i, 0], mainMassive[i, 1], mainMassive[i, 2]);
            }
        }

        private int[] Cutting(string input)
        {
            int len;
            string[] words = input.Split(' ');

            len = words.Length;
            int[] res = new int[len];

            res[0] = Convert.ToInt32(words[0]);
            res[1] = Convert.ToInt32(words[1]);
            if (len > 2)
                res[2] = Convert.ToInt32(words[2]);

            return res;
        }
    }
}
