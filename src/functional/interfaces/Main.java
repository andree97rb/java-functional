package functional.interfaces;

public class Main{
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public float operation() {
                var number1=3;
                var number2=5;
                return number1+number2;
            }

            public void print(String value){
                System.out.println(value);
            }
        };

        printResult(myInterface);
    }

    public static void printResult(MyInterface myInterface){
        System.out.println(myInterface.operation());
    }
}


