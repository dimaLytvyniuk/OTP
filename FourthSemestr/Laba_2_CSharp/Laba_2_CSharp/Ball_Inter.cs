using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Laba_2_CSharp
{
    class Ball_Inter : Figure_Inter
    {
        private double r;

        public Ball_Inter()
        {
            r = 0;
        }

        public Ball_Inter(double r)
        {
            this.r = r;
        }

        public double R
        {
            get { return r; }
            set { r = value; }
        }

        public double Area()
        {
            return 4 * Math.PI * Math.Pow(r, 2);
        }

        public double Volume()
        {
            return (4 / 3) * Math.PI * Math.Pow(r, 3);
        }

        public static Ball_Inter operator +(Ball_Inter b1, Ball_Inter b2)
        {
            b1.R += b2.R;

            return b1;
        }

        public static Ball_Inter operator *(Ball_Inter b1, Ball_Inter b2)
        {
            b1.R *= b2.R;

            return b1;
        }

        public static Ball_Inter operator -(Ball_Inter b1, Ball_Inter b2)
        {
            b1.R -= b2.R;

            return b1;
        }

        public static Ball_Inter operator /(Ball_Inter b1, Ball_Inter b2)
        {
            b1.R /= b2.R;

            return b1;
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
                Ball_Inter p = (Ball_Inter)obj;
                return this.R == p.R;
            }
        }


        public static bool operator ==(Ball_Inter b1, Ball_Inter b2)
        {
            return b1.Equals(b2);
        }

        public static bool operator !=(Ball_Inter b1, Ball_Inter b2)
        {
            return !b1.Equals(b2);
        }

        public override int GetHashCode()
        {
            return (int)(base.GetHashCode() * r);
        }

        public override string ToString()
        {
            return "Radius = " + r + " ";
        }
    }
}
