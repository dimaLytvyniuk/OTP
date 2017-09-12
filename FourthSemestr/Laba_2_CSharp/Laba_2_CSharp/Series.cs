using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Laba_2_CSharp
{
    class Series
    {
        List<Figure> figures;
        EventListener listener;

        public Series()
        {
            figures = new List<Figure>();
            listener = new EventListener();
        }

        public void AddCone(Cone cone)
        {
            figures.Add(cone);
            listener.CallAddEvent();
        }

        public void AddPararl(Parallelepiped paral)
        {
            figures.Add(paral);
            listener.CallAddEvent();
        }

        public void AddBall(Ball ball)
        {
            figures.Add(ball);
            listener.CallAddEvent();
        }

        public void PrintFigures()
        {
            for (int i = 0, len = figures.Count; i < len; i++)
                Console.WriteLine(figures[i]);
        }
    }
}
