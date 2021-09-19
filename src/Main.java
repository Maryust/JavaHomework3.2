public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        //Введите вес
        int mass = 70;
        //Введите рост
        int heigh = 170;
        int index = (int) service.calculate(mass, heigh);
        System.out.println("Ваш индекс массы тела:" + ' ' + index);
    }
}
