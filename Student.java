package Shiyan2Xuanke;

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

		public String getName() {                                          //获得姓名
			return name;
		}

		public void setName(String name) {                                //设置姓名
			this.name = name;
		}

		public String getSex() {                                          //获得性别
			return sex;
		}

		public void setSex(String sex) {                                 //设置性别
			this.sex = sex;
		}

		public int getAge() {                                            //获得年龄
			return age;
		}

		public void setAge(int age) {                                   //设置年龄
			this.age = age;
		}

		public String getZhuanye() {                                    //设置专业
			return zhuanye;
		}

		public void setZhuanye(String zhuanye) {                        //得到专业
			this.zhuanye = zhuanye;
		}

	public String getBanji() {											//得到班级
			return banji;
		}

		public void setBanji(String banji) {							//设置班级
			this.banji = banji;
		}

		public float getXuefeiOfTerm() {								//得到每学期学费
			return xuefeiOfTerm;
		}

		public void setXuefeiOfTerm(float xuefeiOfTerm) {				//设置每学期学费
			this.xuefeiOfTerm = xuefeiOfTerm;
		}

		public float getxinshuiOfMonth() {								//得到每月薪水
			return xinshuiOfMonth;
		}

		public void setXinshuiOfMonth(float xinshuiOfMonth) {			//设置每月薪水
			this.xinshuiOfMonth = xinshuiOfMonth;
		}

		public float getMoney() {										//得到剩余金额
			return money;
		}

		public void setMoney(float money) {								//设置当前的余额
			this.money = money;
		}

		public void getfee() {											//得到剩余金额
		        money = money - xuefeiOfTerm;
		    }


		public float xuefeiOfYear() {								//计算每年的学费  每年的学费=每学期的学费*2
		        return xuefeiOfTerm * 2;
		    }


		public void getXinshui() {
		        money = money + xinshuiOfMonth;
		    }


		public float salaryOfYear() {								//计算每年的薪水 每年的薪水=每个月的薪水*12
		        return xinshuiOfMonth * 12;
		         
		    }
		public float lessons() {
				lessons = lessons +1;
		}

	  public String toString() {										//获得学生信息
	      return "学生信息 {" + "\n" +
	              "姓名='" + name + '\'' + "\n" +
	              "性别='" + sex + '\'' + "\n" +
	              "年龄=" + age + " 岁\n" +
	              "专业='" + zhuanye + '\'' + "\n" +
	              "班级='" + banji + '\'' + "\n" +
	              "学费=" + xuefeiOfTerm + " 元/学期\n" +
	              "工资=" + xinshuiOfMonth+ " 元/月\n" +
	              "余额=" + money + " 元\n" +
	              "课程=" + lessons + "次/周\n"+
	              '}';
	  }
		
		public void statistics() {
			float tax = Zhujiao.getTax(getMoney());
			System.out.println("信息统计：\n学生：" + getName() + "\n" + 
			"每学期学费：" +getXuefeiOfTerm() + "\n" + 
			"每学年学费："+ xuefeiOfYear() +"\n"+
			"每月薪水：" + getxinshuiOfMonth() + "\n" + 
			"每年薪水：" + xuefeiOfYear() + "\n"+ 
			"税前年收入：" + getMoney() + "\n" + 
			"需交税：" + tax + "\n" +
			"课程：" + lessons() +"\n"+
			"税后年收入：" + (money - tax));
			
		}


	}
}
