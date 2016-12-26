package mockito.demo;

public class TestService
{

    public int getUniqueId() {
        System.out.print("Never invoke the real method.");
        return 0;
    }

    public void someMethod(String s){
       System.out.print("Never invoke the real method.");
    }

    public void testing(int i){
        System.out.print("Never invoke the real method.");
    }
}
