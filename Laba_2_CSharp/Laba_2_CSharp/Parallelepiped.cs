using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Laba_2_CSharp
{
    class Parallelepiped : Figure
    {
        private double height, width, depth;

        public Parallelepiped()
        {
            height = 0;
            width = 0;
            depth = 0;
        }

        public Parallelepiped(double height, double width, double depth)
        {
            this.height = height;
            this.width = width;
            this.depth = depth;
        }

        public double Height
        {
            get { return height; }
            set { height = value; }
        }

        public double Width
        {
            get { return width; }
            set { width = value; }
        }

        public double Depth
        {
            get { return depth; }
            set { depth = value; }
        }

        public override double Area()
        {
            return (height * width + height * depth + width * depth);
        }

        public override double Volume()
        {
            return height * width * depth;
        }

        public static Parallelepiped operator + (Parallelepiped p1, Parallelepiped p2)
        {
            p1.Height += p2.Height;
            p1.Width += p2.Width;
            p1.Depth += p2.Depth;

            return p1;
        }

        public static Parallelepiped operator - (Parallelepiped p1, Parallelepiped p2)
        {
            p1.Height -= p2.Height;
            p1.Width -= p2.Width;
            p1.Depth -= p2.Depth;

            return p1;
        }

        public static Parallelepiped operator * (Parallelepiped p1, Parallelepiped p2)
        {
            p1.Height *= p2.Height;
            p1.Width *= p2.Width;
            p1.Depth *= p2.Depth;

            return p1;
        }

        public static Parallelepiped operator / (Parallelepiped p1, Parallelepiped p2)
        {
            try
            {
                p1.Height /= p2.Height;
                p1.Width /= p2.Width;
                p1.Depth /= p2.Depth;
            }
            catch (DivideByZeroException e)
            {
                Console.WriteLine(e.Message);
            }

            return p1;
        }

        public override bool Equals(Object obj)
        {
            //Check for null and compare run-time types.
            if ((obj == null) || !this.GetType().Equals(obj.GetType()))
            {
                return false;
            }
            else
            {
                Parallelepiped p = (Parallelepiped)obj;
                return (this.Height == p.Height) && (this.Width == p.Width) && (this.Depth == p.Depth);
            }
        }

        public override int GetHashCode()
        {
            return (int)(base.GetHashCode() * height);
        }

        public override string ToString()
        {
            return String.Format("Height = {0} Width = {1} Depth = {2} {3}", height, width, depth, base.ToString());
        }
    }
}
