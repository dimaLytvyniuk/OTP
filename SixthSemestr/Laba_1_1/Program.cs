using System;

namespace Laba_1_1
{
    class Program
    {
        static void Main(string[] args)
        {
            var triangle = new Triangle 
            {
                A = 10,
                B = 10,
                C = 5
            };

            var rectangle = new Rectangle
            {
                A = 10,
                B = 15
            };

            var cuboid = new Cuboid 
            {
                A = 10,
                B = 15,
                C = 20
            };

            var cone = new Cone
            {
                R = 10,
                H = 5
            };

            Console.WriteLine(triangle);
            Console.WriteLine(rectangle);
            Console.WriteLine(cone);
            Console.WriteLine(cuboid);
        }
    }

    public interface ITwoDimensionalShape
    {
        double Perimeter { get; }
        double Area { get; }
    }

    public interface IThreeDimensionalShape
    {
        double Volume { get; }
        double SurfaceArea { get; }
    }

    public class Triangle : ITwoDimensionalShape
    {
        public double A { get; set; }
        public double B { get; set; }
        public double C { get; set; }
        public double Perimeter => A + B + C;
        public double Area 
        { 
            get 
            {
                double p = Perimeter / 2;
                double area = p * (p - A) * (p - B) * (p - C); 
                return Math.Sqrt(area);
            } 
        }

        public override string ToString() 
        {
            return $"Triangle Area: {Area}, Perimetr: {Perimeter}";
        }
    }

    public class Rectangle : ITwoDimensionalShape
    {
        public double A { get; set; }
        public double B { get; set; }
        public double Perimeter => (A + B) * 2;
        public double Area => A * B;
        
        public override string ToString() 
        {
            return $"Rectangle Area: {Area}, Perimetr: {Perimeter}";
        }
    }

    public class Cuboid: IThreeDimensionalShape
    {
        public double A { get; set; }
        public double B { get; set; }
        public double C { get; set; }

        public double Volume => A * B * C;

        public double SurfaceArea => (A * B + A * C + B * C) * 2;

        
        public override string ToString() 
        {
            return $"Cuboid SurfaceArea: {SurfaceArea}, Volume: {Volume}";
        }
    }

    public class Cone : IThreeDimensionalShape
    {
        public double R { get; set; }
        public double H { get; set; }
        public double Volume => Math.PI * Math.Pow(R, 2) * H / 3;

        public double SurfaceArea => Math.PI * Math.Pow(R, 2) + 
            Math.PI * R * Math.Sqrt(R * R + H * H);
        
        public override string ToString() 
        {
            return $"Cone SurfaceArea: {SurfaceArea}, Volume: {Volume}";
        }
    }
}
