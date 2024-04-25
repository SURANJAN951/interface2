interface A{
    void show();
}

class B implements A{
    public void show(){
        System.out.println("hellow");
    }
}

public class Interface2 {
    public static void main(String[] args) {
        System.out.println("running");
        B objj = new B();
        objj.show();

    }
}
