using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Laba_2_CSharp
{
    abstract class Figure
    {
        public abstract double Volume();
        public abstract double Area();

        public override string ToString()
        {
            return "Volume = " + Volume() + " Area = " + Area();
        }

        public override int GetHashCode()
        {
            return (int)(Area() * Volume());
        }
    }
}
