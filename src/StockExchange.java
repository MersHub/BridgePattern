public class StockExchange extends Program{

    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {

        System.out.println("StockExchange system in progress....");
        developer.writeCode();
    }
}
