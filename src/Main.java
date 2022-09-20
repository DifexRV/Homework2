public class Main {
    public static void main(String[] args) {
   var boxer1 = 78.2;
   var boxer2 = 82.7;
   var totalWeight = boxer1 + boxer2;
   System.out.println("Общий вес двух боксеров " + totalWeight + " кг!");

   var difference1 = boxer2 - boxer1;
   System.out.println("Способ 1. Разница в весе составляет " + difference1 + " кг!");

   var difference2 = (boxer2 % boxer1);
   System.out.println("Способ 2. Разница в весе составляет " + difference2 + " кг!");



   var totalWH = 640;
   var empWH = 8;
   var totalNumbEmp = totalWH / empWH;
   System.out.println("Всего работников в компании " + totalNumbEmp + " человек");

   var totalNumbEmp2 = totalNumbEmp + 94;
   var totalWH2 = totalWH  / totalNumbEmp2;
    System.out.println("Если в компании работает " + totalNumbEmp2 + " человек, то всего " + totalWH2 + " часов работы может быть поделено между сотрудниками");
    }
}