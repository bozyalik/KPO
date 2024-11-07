using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1_Lab1
{
    class Person
    {
        // Определение полей
        private string name = "Undefined";
        private string surname = "Undefined";
        private System.DateTime birthdate;
        // Определение конструктора без параметров
        public Person()
        {
            Console.WriteLine("Создание объекта Person");
            name = "Ivan";
            surname = "Smirnov";
            birthdate = new DateTime(2001, 09, 11, 10, 59, 59);
        }
        // Определение конструктора с тремя параметрами
        public Person(string n, string s, System.DateTime d)
        {
            Console.WriteLine("Создание объекта Person");
            name = n;
            surname = s;
            birthdate = d;
        }
        public void Print()
        {
            Console.WriteLine($"Имя: {name}  Возраст: {surname}  Дата и время рождения: {birthdate}");
        }
        // Определение свойств
        public string Name
        {
            get
            {
                return name;
            }
            set
            {
                name = value;
            }
        }
        public string Surname
        {
            get
            {
                return surname;
            }
            set
            {
                surname = value;
            }
        }
        public System.DateTime BirthDate
        {
            get
            {
                return birthdate;
            }
            set
            {
                birthdate = value;
            }
        }
        public int Year
        {
            get
            {
                return birthdate.Year;
            }
            set
            {
                var dt = new DateTime(value, birthdate.Month, birthdate.Day, birthdate.Hour, birthdate.Minute, birthdate.Second);
                birthdate = dt;
            }
        }
        // Определение методов
        public string ToShortString()
        {

        }
    }
}
