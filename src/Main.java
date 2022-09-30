public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1 ");
        System.out.println();
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println(" Установите приложение для IOS по ссылке ");
        } else {
            System.out.println(" Установите приложение для Android по ссылке ");
        }
        System.out.println();
        System.out.println("Задание № 2");
        System.out.println();
        int cliDev = 2013;
        if (clientOS == 0) {
            if (cliDev < 2015) {
                System.out.println(" Установите легкую версию  приложение для IOS по ссылке  ");
            } else {
                System.out.println(" Установите приложение для IOS по ссылке");
            }
        } else {
            if (cliDev < 2015) {
                System.out.println(" Установите легкую версию  приложение для Android по ссылке  ");
            } else {
                System.out.println(" Установите приложение для Android по ссылке");
            }
            System.out.println();
            System.out.println("Задание №3 ");
            System.out.println();
            int year = 1976;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " високосный");
            } else {
                System.out.println(year + "  не високосный");
            }
            System.out.println(" Задание № 4 ");
            System.out.println();
            int deliveryDistance = 95;
            int deliveryDays =1;
            if (deliveryDistance>20) {
                deliveryDays++;
            }
            if (deliveryDistance>60){
                deliveryDays++;
            }
            System.out.println(" Потребуеться дней :"+deliveryDays);
        }
        System.out.println(" Задание № 5 ");
        System.out.println();

        int montNumber = 2;
        switch (montNumber) {
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
                System.out.println( " лето  ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println( " осень");
                break;
            default:
                System.out.println( " некоректный месяц "+ montNumber);

        }
    }
}







