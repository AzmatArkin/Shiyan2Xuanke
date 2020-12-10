package Shiyan2Xuanke;

public class Shiyan2Xuanke {
		private String courseName; 																	// 课程
		private float courseId; 																	// 编号
		private Teacher teacher;																	// 教课教师
		private float credit;																		// 学分
		private Student[] students;																	// 选课学生
		private float time;																			// 上课时间
		private float room;																			// 上课教室

	
		public void Course(float courseId, String courseName, Teacher teacher, float time, float room, float credit) {						
			this.courseName = courseName;															// 初始化课程
			this.courseId = courseId;
			this.teacher = teacher;
			this.credit = credit;
			this.students = new Student[10];  														//设置选课人数上限
			this.time = time;
			this.room = room;
		}

																										
		public String getCourseName() {																//获得课程名
			return courseName;
		}

																								
		public void setCourseName(String courseName) {												//设置课程名
			this.courseName = courseName;
		}


		public float getCourseId() {																//获得课程编号
			return courseId;
		}



		public void setCourseId(int courseId) {														//设置课程编号
			this.courseId = courseId;
		}
		

		public Teacher getTeacher() {																//获得教课教师
			return teacher;
		}
		

		public void setTeacher(Teacher teacher) {													//设置教课教师
			this.teacher = teacher;
		}


		public float getCredit() {																	//设置学分
			return credit;
		}


		public void setCredit(float credit) {														//获得学分
			this.credit = credit;
		}
		

		public Student[] getStudents() {															//获得选课学生
			return students;
		}	
		

		public void setStudents(Student[] students) {												//设置选课学生
			this.students = students;
		}
		

		public float getTime() {																	//获得上课时间
			return time;
		}
		

		public void setTime(float time) {															//设置上课时间
			this.time = time;
		}	


		public float getRoom() {																	//获得上课教室
			return room;
		}


		public void setRoom(float room) {															//设置上课教室
			this.room = room;
		}


		public boolean addStudent(Student stu) {													//添加学生到课程
			for (int i = 0; i < students.length; i++) {
				if (students[i] == null) {
					students[i] = stu;
					return true;
				}

			}
			return false;
		}


		public boolean rmStudent(Student stu) {														//删除学生到课程
			for (int i = 0; i < students.length; i++) {
				if (students[i] == stu) {
					students[i] = null;
					return true;
				}
			}
			return false;
		}


		public String toString() {																	//获得选课学生列表
			return "课程信息 {" + 
					"课程编号:" + courseId + 
					"，课程名称:'" + courseName + '\'' + 
					"，所在教室:'" + room + '\''+ "教学楼"+
					"，上课时间:'" + time + '\'' + 
					"，授课教师:'" + teacher+ '\'' + "老师"+
					"，人数上限:'" + 10 + "'" +"人"+ 
					"，学分:'" + credit + "学分" +
					+ '\'' + "}\n";
		}
	}