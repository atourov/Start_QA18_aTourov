public class Calculator {
    int a;
    int b;
    char action;
    String res;

    public static void printCalc(String res){
        System.out.println(res);
    }
    public void calc(int a, int b, char action){
        switch (action){
            case '+':
                    System.out.println(a+b);
                break;
            case '-':
                    System.out.println(a-b);
                break;
            case '*':
                    System.out.println(a*b);
                break;
            case '/':
                if(b !=0)
                    System.out.println(a/b);
                else
                    System.out.println("ERROR");

        }
    }

}
