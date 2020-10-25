＃计191罗鑫2019311215
＃#实验目的
1。掌握针对对象的类设计方法
2。掌握类的继承用法
3．学会使用super（），应用在实例化对象
4．掌握使用对象根类的toString（）方法，应用在相关实例中
＃#实验过程
说明：学校中有“人员”，人员分为“教师”和“学生”，
老师讲授“课程”，学生选择“课程”。
从简化系统考虑，每一个老师讲授一个课程，每一个课程的讲课老师也只有一个，每一个学生只能选择一门课程
##核心方法
1。最初定义一个父类
```
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
```
2。在子类中引用父类的方法
```
class Teacher extends Person{
	boolean 婚否;
	Teacher(int number,String name,String gender,boolean a){
		super(number,name,gender);
		婚否=a;
		System.out.println("婚否="+婚否);
}
}
```
3。熟练掌握super（）的方法
```
Student(int number,String name,String gender,boolean b){
		super(number,name,gender);
		成绩好=b;
		System.out.println("成绩好="+成绩好);
	}
}
```
##实验结果
利用java简单设计一种学生选课模拟系统
##实验感想
在这次实验中，我通过不断的练习可以熟练的掌握课堂上子类如何继承父类的方法，多次利用super（）的方法让我对java中继承这一特性能够熟练运用，在将来的学习中，我会更加熟练，并了解面向对象java这一语言的各种特性。
