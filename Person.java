package ѧ��ģ��ѡ��ϵͳ;
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
System.out.println("�ҵı�����:"+number+"�����ǣ�"+name+"�Ա��ǣ�"+gender);
}
class Teacher extends Person{
	boolean ���;
	Teacher(int number,String name,String gender,boolean a){
		super(number,name,gender);
		���=a;
		System.out.println("���="+���);
}
}
class Student extends Person{
	boolean �ɼ���;
	Student(int number,String name,String gender,boolean b){
		super(number,name,gender);
		�ɼ���=b;
		System.out.println("�ɼ���="+�ɼ���);
	}
}
}