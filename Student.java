package Shiyan2Xuanke;

public class Student extends Shiyan2Xuanke {
	byte Shiyan2Xuanke;

	public abstract class Student {
		private String name;                                              //����
		private String sex;                                              //�Ա�
		private int age;                                                //����
		private String zhuanye;                                        //רҵ
		private String banji;                                         //�༶
		private float xuefeiOfTerm;                                  //ÿѧ��ѧ��
		private float xinshuiOfMonth;                               //ÿ��нˮ
		private float money = 0;                                   //ʣ����
		private float lessons = 0; 								  //�γ�
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

		public String getName() {                                          //�������
			return name;
		}

		public void setName(String name) {                                //��������
			this.name = name;
		}

		public String getSex() {                                          //����Ա�
			return sex;
		}

		public void setSex(String sex) {                                 //�����Ա�
			this.sex = sex;
		}

		public int getAge() {                                            //�������
			return age;
		}

		public void setAge(int age) {                                   //��������
			this.age = age;
		}

		public String getZhuanye() {                                    //����רҵ
			return zhuanye;
		}

		public void setZhuanye(String zhuanye) {                        //�õ�רҵ
			this.zhuanye = zhuanye;
		}

	public String getBanji() {											//�õ��༶
			return banji;
		}

		public void setBanji(String banji) {							//���ð༶
			this.banji = banji;
		}

		public float getXuefeiOfTerm() {								//�õ�ÿѧ��ѧ��
			return xuefeiOfTerm;
		}

		public void setXuefeiOfTerm(float xuefeiOfTerm) {				//����ÿѧ��ѧ��
			this.xuefeiOfTerm = xuefeiOfTerm;
		}

		public float getxinshuiOfMonth() {								//�õ�ÿ��нˮ
			return xinshuiOfMonth;
		}

		public void setXinshuiOfMonth(float xinshuiOfMonth) {			//����ÿ��нˮ
			this.xinshuiOfMonth = xinshuiOfMonth;
		}

		public float getMoney() {										//�õ�ʣ����
			return money;
		}

		public void setMoney(float money) {								//���õ�ǰ�����
			this.money = money;
		}

		public void getfee() {											//�õ�ʣ����
		        money = money - xuefeiOfTerm;
		    }


		public float xuefeiOfYear() {								//����ÿ���ѧ��  ÿ���ѧ��=ÿѧ�ڵ�ѧ��*2
		        return xuefeiOfTerm * 2;
		    }


		public void getXinshui() {
		        money = money + xinshuiOfMonth;
		    }


		public float salaryOfYear() {								//����ÿ���нˮ ÿ���нˮ=ÿ���µ�нˮ*12
		        return xinshuiOfMonth * 12;
		         
		    }
		public float lessons() {
				lessons = lessons +1;
		}

	  public String toString() {										//���ѧ����Ϣ
	      return "ѧ����Ϣ {" + "\n" +
	              "����='" + name + '\'' + "\n" +
	              "�Ա�='" + sex + '\'' + "\n" +
	              "����=" + age + " ��\n" +
	              "רҵ='" + zhuanye + '\'' + "\n" +
	              "�༶='" + banji + '\'' + "\n" +
	              "ѧ��=" + xuefeiOfTerm + " Ԫ/ѧ��\n" +
	              "����=" + xinshuiOfMonth+ " Ԫ/��\n" +
	              "���=" + money + " Ԫ\n" +
	              "�γ�=" + lessons + "��/��\n"+
	              '}';
	  }
		
		public void statistics() {
			float tax = Zhujiao.getTax(getMoney());
			System.out.println("��Ϣͳ�ƣ�\nѧ����" + getName() + "\n" + 
			"ÿѧ��ѧ�ѣ�" +getXuefeiOfTerm() + "\n" + 
			"ÿѧ��ѧ�ѣ�"+ xuefeiOfYear() +"\n"+
			"ÿ��нˮ��" + getxinshuiOfMonth() + "\n" + 
			"ÿ��нˮ��" + xuefeiOfYear() + "\n"+ 
			"˰ǰ�����룺" + getMoney() + "\n" + 
			"�轻˰��" + tax + "\n" +
			"�γ̣�" + lessons() +"\n"+
			"˰�������룺" + (money - tax));
			
		}


	}
}
