package functional.interfaces2;

import functional.interfaces.MyInterface;

public class Main {
    public static void main(String[] args) {
        prinResult(()-> 4*2);
    }

    public static void prinResult(MyInterface myInterface){
        System.out.println(myInterface.operation());
    }
}
