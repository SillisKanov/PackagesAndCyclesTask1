public class Main {

    public static void main(String[] args) {
        System.out.println("\n Пример 1");
        Service service1 = new Service(10000, 3000, 20000);
        Service service2 = new Service(100000, 60000, 150000);
        System.out.println("количество месяцев отдыха, которые будут в следующем году = " + service1.calculate());
        System.out.println("\n Пример 2");
        System.out.println("количество месяцев отдыха, которые будут в следующем году = " + service2.calculate());
    }
}
