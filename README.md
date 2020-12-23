# Shiyan2Xuanke

实验目的：
1.掌握对象类的设计方法（属性）
2.掌握对象类的继承方法，用构造方法实例化对象
3.掌握使用super（），用于实例化子类。

实验要求：
1.编写上述实体类和测试类
2.实例化多个实体，模拟学生选课操作、打印课程信息、模拟学生退课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课老师 等）
3.编写实验报告

核心代码：

public class Student extends Shiyan2Xuanke {
	byte Shiyan2Xuanke;

	public abstract class Student {
		private String name;                                              //姓名
		private String sex;                                              //性别
		private int age;                                                //年龄
		private String zhuanye;                                        //专业
		private String banji;                                         //班级
		private float xuefeiOfTerm;                                  //每学期学费
		private float xinshuiOfMonth;                               //每月薪水
		private float money = 0;                                   //剩余金额
		private float lessons = 0; 								  //课程
		public DRStudent(String name, String sex, int age,String zhuanye,String banji, float xuefeiOfTerm, float xinshuiOfMonth, float lessons) {
			this.name = name;
			this.sex = sex;
			this.age = age;
			this.zhuanye = zhuanye;
			this.banji =banji;
			this.xuefeiOfTerm = xuefeiOfTerm;
			this.xinshuiOfMonth = xinshuiOfMonth;
			this.lessons = lessons;
		}

实验心得：
1.逐渐熟练掌握Java的设计编程
2.能够熟练实例化对象
3.获得满满的成就感
4.学习过 C语言、Python 后，学到了新的一门编程语言
