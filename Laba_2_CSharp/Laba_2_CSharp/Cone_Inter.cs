﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Laba_2_CSharp
{
    class Cone_Inter : Figure_Inter
    {
        private double r, l, h;

        public Cone_Inter()
        {
            r = 0;
            l = 0;
            h = 0;
        }

        public Cone_Inter(double r, double h, double l)
        {
            this.r = r;
            this.l = l;
            this.h = h;

            if (Math.Pow(l, 2) != (Math.Pow(r, 2) + Math.Pow(h, 2)))
                throw new IncorrectTriangle("Sum of square katetiv obediently dorivnyuati square gipotenuzi");
        }

        public double H
        {
            get { return h; }
            set { h = value; }
        }

        public double L
        {
            get { return l; }
            set { l = value; }
        }

        public double R
        {
            get { return r; }
            set { r = value; }
        }

        public double Area()
        {
            return Math.PI * Math.Pow(r, 2) + Math.PI * r * l;
        }

        public double Volume()
        {
            return (1 / 3) * Math.PI * Math.Pow(r, 2) * h;
        }

        public static Cone_Inter operator +(Cone_Inter c1, Cone_Inter c2)
        {
            c1.H += c2.H;
            c1.L += c2.L;
            c1.R += c2.R;

            return c1;
        }

        public static Cone_Inter operator -(Cone_Inter c1, Cone_Inter c2)
        {
            c1.H -= c2.H;
            c1.L -= c2.L;
            c1.R -= c2.R;

            return c1;
        }

        public static Cone_Inter operator *(Cone_Inter c1, Cone_Inter c2)
        {
            c1.H *= c2.H;
            c1.L *= c2.L;
            c1.R *= c2.R;

            return c1;
        }

        public static Cone_Inter operator /(Cone_Inter c1, Cone_Inter c2)
        {
            try
            {
                c1.H /= c2.H;
                c1.L /= c2.L;
                c1.R /= c2.R;
            }
            catch (DivideByZeroException e)
            {
                Console.WriteLine(e.Message);
            }
            return c1;
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
                Cone_Inter p = (Cone_Inter)obj;
                return (this.R == p.R) && (this.H == p.H) && (this.L == p.L);
            }
        }

        public override int GetHashCode()
        {
            return (int)(base.GetHashCode() * h);
        }

        public override string ToString()
        {
            return String.Format("R = {0} H = {1} L = {2} {3}", r, h, l, base.ToString());
        }
    }
}
