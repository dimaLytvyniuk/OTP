using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Laba_2_CSharp
{
    class Program
    {
        static void Main(string[] args)
        {
            Series series = new Series();

            Console.WriteLine("Events: ");
            series.AddBall(new Ball(6));
            try
            {
                series.AddCone(new Cone(3, 4, 5));
            }
            catch (IncorrectTriangle e)
            {
                Console.WriteLine("MyException");
                Console.WriteLine(e.Message);
            }
            series.AddPararl(new Parallelepiped(2, 2, 2));
            series.AddBall(new Ball(8.9));
            try
            {
                series.AddCone(new Cone(3.6, 4.9, 6.7));
            }
            catch (IncorrectTriangle e)
            {
                Console.WriteLine("MyException");
                Console.WriteLine(e.Message);
            }
            series.AddPararl(new Parallelepiped(5.5, 2.3, 7.8));
            series.AddBall(new Ball(7.6));
            try
            {
                series.AddCone(new Cone(1.24, 4.78, 9.01));
            }
            catch (IncorrectTriangle e)
            {
                Console.WriteLine("MyException");
                Console.WriteLine(e.Message);
            }
            series.AddPararl(new Parallelepiped(6, 3, 8));
            series.AddBall(new Ball());
            series.AddCone(new Cone());
            series.AddPararl(new Parallelepiped());

            Console.WriteLine("Print collection:");
            series.PrintFigures();

            Ball ball = new Ball(9);
            Console.WriteLine("Equals: ball(9) ball(9)");
            Console.WriteLine(ball.Equals(new Ball(9)));
            Console.WriteLine("ball(9) != ball(8)");
            Console.WriteLine(ball != new Ball(8));
            Console.WriteLine("ball(9) + ball(8)");
            Console.WriteLine(ball + new Ball(8));

        }
    }
}
