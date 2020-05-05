package Homework_lesson2;

public class Main {
    public static void main(String[] args) {
        //- нельзя установить значение age меньше нуля
        Task1 human1 = new Task1("oleg", -4);
        System.out.println(human1.getAge());

        //- максимальныое значение для возраста - 100
        Task1 human2 = new Task1("oleg", 101);
        System.out.println(human2.getAge());

        //- значение name не может быть короче чем 3 символа и длиннее чем 50 символов
        Task1 human3 = new Task1("oz", 35);
        System.out.println(human3.getName());

        Task1 human4 = new Task1("QWERTYUIOPQWERTYUIOPQWERTYUIOPQWERTYUIOPQWERTYUIOP1", 35);
        System.out.println(human4.getName());

        /*- не зависимо от того ввел пользователь имя с большой или с маленькой буквы,
        оно должно быть записано в переменную name с большой буквы*/
        Task1 human5 = new Task1("oleg", 35);
        System.out.println(human5.getName());

        Task1 human6 = new Task1("ARTUR", 35);
        System.out.println(human6.getName());

        //- name не может состоять из одних только пробелов
        Task1 human7 = new Task1("  ", 25);
        System.out.println(human7.getName());
        Task1 human8 = new Task1(" Jaja ", 35); //обрезает пробелы по краям.
        System.out.println(human8.getName());

        //ageGroup должен устанавливаться автоматически при установке возраста
        Task1 human9 = new Task1("oleg", 0); //Не считывает 0 (не валидны возраст).
        System.out.println(human9.getAgeGroup());

        Task1 human10 = new Task1("oleg", 14); //Child
        System.out.println(human10.getAgeGroup());

        Task1 human11 = new Task1("oleg", 25);//Student
        System.out.println(human11.getAgeGroup());

        Task1 human12 = new Task1("oleg", 65);//Worker
        System.out.println(human12.getAgeGroup());

        Task1 human13 = new Task1("oleg", 67);//Pensioner
        System.out.println(human13.getAgeGroup());
    }
}
