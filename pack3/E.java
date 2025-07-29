//class E intantiates class A outside the package
//E.java
import pack2.A;
public class E{
public void print(){
A a = new A();
//System.out.println(a.a);
//System.out.println(a.b);
//System.out.println(a.c);
System.out.println(a.d);
}
}