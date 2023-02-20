public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
        //задание 1
        public static void task1 () {
        int clientOC = 0;
        if (clientOC == 0) {
            System.out.println(" установите версию приложения для iOS по ссылке.");
        } else if (clientOC == 1) {
            System.out.println(" установите версию приложения для Android по ссылке .");

        }
    }


        //задание 2
        public static void task2 () {
        int clientDivaiceYear = 2019;
        int clientOC = 0;

        if (clientOC == 0) {
            if (clientDivaiceYear < 2015) {
                System.out.println(" установите облегченную верси приложения для iOS, по ссылке.");
            } else {
                System.out.println("установите  верси приложения для iOS, по ссылке. ");
            }
        } else {
            if (clientDivaiceYear < 2015) {
                System.out.println(" установите облегченную верси приложения для android, по ссылке.");
            } else {
                System.out.println("установите  верси приложения для android, по ссылке. ");

            }
        }
    }
        //задание 3
        public static void task3 () {
        int year = 2021;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(" год  является высокосным !");
        } else {
            System.out.println(" год не является высокосным!");
        }
    }
        // задание 4
         public static void task4 () {
             int deliveryDistance = 95;
             int deliveryDays = 1;

             if (deliveryDistance > 20) {
                 deliveryDays++;
             }
             if (deliveryDistance > 60) {
                 deliveryDays++;
             }
             if (deliveryDistance > 100) {
                 deliveryDays++;
             }
             System.out.println(" потребуется дней:" + deliveryDays);
         }
         public static void task5 () {
             int montNamber = 12;
             switch (montNamber) {
                 case 12:
                 case 1:
                 case 2:
                     System.out.println(" зима ");
                     break;
                 case 3:
                 case 4:
                 case 5:
                     System.out.println(" весна ");
                     break;
                 case 6:
                 case 7:
                 case 8:
                     System.out.println(" лето ");
                     break;
                 case 9:
                 case 10:
                 case 11:
                     System.out.println(" осень ");
                     break;
                 default:
                     System.out.println(" некоректный месяц .");


             }
         }      }