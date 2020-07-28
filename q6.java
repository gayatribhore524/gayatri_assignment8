class Z extends Thread
{
public void run()
{

for(int i=0;i<10;i++)
{
System.out.println(i);
}
}
}
class X extends Thread
{
public void run()
{
for(int j=20;j<30;j++)
{
System.out.println(j);
}
}
}
class q6 
{
public static void main(String args[])
{
Z z1=new Z();
X x1=new X();
z1.start();
x1.start();
}
}