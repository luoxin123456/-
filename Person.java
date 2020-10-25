package 学生模拟选课系统;
public class Person{
int Number;
String Name;
String Gender;
Person(){
}
Person(int number,String name,String gender){
	this.Number=number;
	this.Name=name;
	this.Gender=gender;
System.out.println("我的编码是:"+number+"名字是："+name+"性别是："+gender);
}
class Teacher extends Person{
	boolean 婚否;
	Teacher(int number,String name,String gender,boolean a){
		super(number,name,gender);
		婚否=a;
		System.out.println("婚否="+婚否);
}
}
class Student extends Person{
	boolean 成绩好;
	Student(int number,String name,String gender,boolean b){
		super(number,name,gender);
		成绩好=b;
		System.out.println("成绩好="+成绩好);
	}
}
}