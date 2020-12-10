package Shiyan2Xuanke;

public class Shiyan2Xuanke {
		private String courseName; 																	// �γ�
		private float courseId; 																	// ���
		private Teacher teacher;																	// �̿ν�ʦ
		private float credit;																		// ѧ��
		private Student[] students;																	// ѡ��ѧ��
		private float time;																			// �Ͽ�ʱ��
		private float room;																			// �Ͽν���

	
		public void Course(float courseId, String courseName, Teacher teacher, float time, float room, float credit) {						
			this.courseName = courseName;															// ��ʼ���γ�
			this.courseId = courseId;
			this.teacher = teacher;
			this.credit = credit;
			this.students = new Student[10];  														//����ѡ����������
			this.time = time;
			this.room = room;
		}

																										
		public String getCourseName() {																//��ÿγ���
			return courseName;
		}

																								
		public void setCourseName(String courseName) {												//���ÿγ���
			this.courseName = courseName;
		}


		public float getCourseId() {																//��ÿγ̱��
			return courseId;
		}



		public void setCourseId(int courseId) {														//���ÿγ̱��
			this.courseId = courseId;
		}
		

		public Teacher getTeacher() {																//��ý̿ν�ʦ
			return teacher;
		}
		

		public void setTeacher(Teacher teacher) {													//���ý̿ν�ʦ
			this.teacher = teacher;
		}


		public float getCredit() {																	//����ѧ��
			return credit;
		}


		public void setCredit(float credit) {														//���ѧ��
			this.credit = credit;
		}
		

		public Student[] getStudents() {															//���ѡ��ѧ��
			return students;
		}	
		

		public void setStudents(Student[] students) {												//����ѡ��ѧ��
			this.students = students;
		}
		

		public float getTime() {																	//����Ͽ�ʱ��
			return time;
		}
		

		public void setTime(float time) {															//�����Ͽ�ʱ��
			this.time = time;
		}	


		public float getRoom() {																	//����Ͽν���
			return room;
		}


		public void setRoom(float room) {															//�����Ͽν���
			this.room = room;
		}


		public boolean addStudent(Student stu) {													//���ѧ�����γ�
			for (int i = 0; i < students.length; i++) {
				if (students[i] == null) {
					students[i] = stu;
					return true;
				}

			}
			return false;
		}


		public boolean rmStudent(Student stu) {														//ɾ��ѧ�����γ�
			for (int i = 0; i < students.length; i++) {
				if (students[i] == stu) {
					students[i] = null;
					return true;
				}
			}
			return false;
		}


		public String toString() {																	//���ѡ��ѧ���б�
			return "�γ���Ϣ {" + 
					"�γ̱��:" + courseId + 
					"���γ�����:'" + courseName + '\'' + 
					"�����ڽ���:'" + room + '\''+ "��ѧ¥"+
					"���Ͽ�ʱ��:'" + time + '\'' + 
					"���ڿν�ʦ:'" + teacher+ '\'' + "��ʦ"+
					"����������:'" + 10 + "'" +"��"+ 
					"��ѧ��:'" + credit + "ѧ��" +
					+ '\'' + "}\n";
		}
	}