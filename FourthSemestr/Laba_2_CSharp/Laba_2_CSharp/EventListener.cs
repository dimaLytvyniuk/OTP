using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Laba_2_CSharp
{
    delegate void AddEvent();

    class EventListener
    {
        private event AddEvent AddFigureEvent;

        public EventListener()
        {
            AddFigureEvent = EventMessage;
        }

        public void CallAddEvent()
        {
            AddFigureEvent();
        }

        private void EventMessage()
        {
            Console.WriteLine("Method Add");
        }
    }
}
