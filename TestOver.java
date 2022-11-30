class Test
{

 void disp(int a)
{

System.out.printf("int"+a);
}
void disp(Integer a)
{

System.out.printf("Integer"+a);
}
public static void main(String  [] a)
{
Test t = new Test();
Integer i=10;//AutoBoxing
int a =i; //AutoUnboxing
t.disp(i);

}

}