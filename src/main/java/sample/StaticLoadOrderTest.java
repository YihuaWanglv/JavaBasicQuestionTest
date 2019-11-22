package sample;

public class StaticLoadOrderTest {
    public static void main(String[] args) {
        Son son = new Son();
    }
}
class Father {
    {
        System.out.println("Father构造块");
    }
    static {
        System.out.println("Father静态块");
    }
    public Father() {
        System.out.println("Father构造函数");
    }
}

class Son extends Father {
    {
        System.out.println("Son构造块");
    }
    static {
        System.out.println("Son静态块");
    }
    public Son () {
        System.out.println("Son构造函数");
    }
}
