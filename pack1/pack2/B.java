package pack2;
public class B extends A{
public void print(){
// System.out.println(a); NO,PRIVATE VARIABLE CAN'T ACCESS IN ITS SUB CLASS
System.out.println(b);//YES
System.out.println(c);//YES
System.out.println(d);//YES
}
}