
This is a repository testing java base basic questions, such as "String equals and '=='?"

We will write code to test the questions:

## 1.请问一下关于String对比的程序输出
```java
public class StringCompareTest {

    public static void main(String[] args) {
        String a = "Programming";
        String b = new String("Programming");
        String c = "Program" + "ming";

        System.out.println(a == b);//false
        System.out.println(a == c);//true
        System.out.println(a.equals(b));//true
        System.out.println(a.equals(c));//true
        System.out.println(a.intern() == b.intern());//true
    }
}
```
结果：
```
false
true
true
true
true
```

- 关联测试代码
[StringCompareTest.java](src/main/java/sample/StringCompareTest.java)

## 2.Java 静态块 、构造块、构造函数执行顺序

说明：

- 静态块：用static申明，JVM加载类时执行，仅执行一次
- 构造块：类中直接用{}定义，每一次创建对象时执行
- 执行顺序优先级：静态块>main()>构造块>构造方法
- 静态块和静态属性优先执行，谁在前就先执行谁

注意：
- 1、每调用一次构造方法，则执行一次构造块
- 2、静态块只在类加载的时候加载一次
- 3、有多个静态变量或块时，按声明顺序加载

- 关联测试代码
[StaticLoadOrderTest.java](src/main/java/sample/StaticLoadOrderTest.java)

结果：

```
Father静态块
Son静态块
Father构造块
Father构造函数
Son构造块
Son构造函数
```

## 3.用递归实现字符串反转

[StringReverse.java](src/main/java/sample/StringReverse.java)

```java
public class StringReverse {

    public static void main(String[] args) {
        String str = "012345";
        System.out.println(reverse(str));
    }

    public static String reverse(String originStr) {
        if (originStr == null || originStr.length() <= 1)
            return originStr;
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }

}
```