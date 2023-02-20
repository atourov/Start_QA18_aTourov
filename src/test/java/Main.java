public class Main {
    public static void main(String[] args) {

        SeleniumStart var = new SeleniumStart();
        SeleniumStart var1 = new SeleniumStart();
        var1.i = 5;
        SeleniumStart var2 = new SeleniumStart();
        var2.i = 7;
        var1.nonStatic();

        Calculator cl = new Calculator();
            cl.calc(4, 0, '/');


        String res = "This is a calculator";
            Calculator.printCalc(res);
    }
}
