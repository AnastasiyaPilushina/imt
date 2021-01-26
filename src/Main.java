public class Main {
    public static void main(String[] args) {
      BmiService service = new BmiService();
      float imt = service.calculate(60_00, 1_70);
        System.out.println(imt);

    }





}
