using System;
using Laba_1;

namespace ConsoleApp
{
    public class Program
    {
        static void Main(string[] args)
        {
            var triangle = new Triangle { A = 10, B = 10, C = 5 };

            var rectangle = new Rectangle { A = 10, B = 15 };

            var cuboid = new Cuboid { A = 10, B = 15, C = 20 };

            var cone = new Cone { R = 10, H = 5 };

            Console.WriteLine(triangle);
            Console.WriteLine(rectangle);
            Console.WriteLine(cone);
            Console.WriteLine(cuboid);
        }
    }
}