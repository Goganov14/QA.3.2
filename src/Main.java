public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double Petya = service.calculate(100, 1.90);
        System.out.println("ИМТ Пети: " + Petya);

        double Medelyn = service.calculate(56, 1.70);
        System.out.println("ИМТ Меделин: " + Medelyn);

        double Ingrid = service.calculate(42, 1.60);
        System.out.println("ИМТ Ингрид: " + Ingrid);
    }
}
