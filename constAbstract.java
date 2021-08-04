abstract class base
{
base (int x,int y)
{
System.out.print("base class");
}
abstract void fun();
}
class derived extends base
{
derived (int x,int y)
{
super(x,y);
System.out.print("derived");
}
void fun()
{
System.out.print("fun");
}
}
class consabs
{
public static void main(String ar[])
{
derived obj=new derived(3,4);
obj.fun();
}
}
