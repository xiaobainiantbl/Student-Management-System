import java.util.Scanner;
/*
学生管理系统
*/
class StudentSystem{
		//学生的人数
		static int count=2;
		//判断循环
		static boolean nuc=true;
		//创建学生数组
		static Students [] arr=new Students[5];
	public static void main(String args[]){
		//赋初值
		Students s=new Students(100,"zhangsan","2013-11-1",23);
		Students s1=new Students(101,"李四","2013-11-1",23);
		arr[0]=s;
		arr[1]=s1;
		//循环程序
		while(nuc){
			Scanner scan=new Scanner(System.in);
			System.out.println("==============================请根据提示输入相关数子，执行操作=================================");
			System.out.println("输入数字1,退出程序;");
			System.out.println();
			System.out.println("输入数字2,增加学生信息");
			System.out.println();
			System.out.println("输入数字3，删除学生信息");
			System.out.println();
			System.out.println("输入数字4，修改学生信息");
			System.out.println();
			System.out.println("输入数字5，查询学生信息");
			switch(scan.nextInt()){
				case 1:
						nuc=false;
						System.out.println("退出程序成功！");
						break;
				case 2:
						addStudent();
						System.out.println("操作成功！");	
						System.out.println();
						break;
				case 3:
						deleteStudent();
						System.out.println("操作成功！");
						System.out.println();
						break;
				case 4:
						setStudent();
						System.out.println("操作成功！");
						System.out.println();
						break;
				case 5:
						selectStudent();
						System.out.println("操作成功！");
						System.out.println();
						break;
				 default:
						System.out.println("请按照提示输入指令");
						System.out.println();
						break;
			}
		}
		/*arr[0]=s;
		arr[1]=s1;
		SetStudent();
		SelectStudent(arr);*/
		
		
		
		
			
	}
	//增加学生信息
	public static void   addStudent(){
		//创建新的数组接收
		//Students [] Narr=new Students[(StudentSystem.arr.length)+1];
		//获取新增加的学生信息
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入新增的学生的学号，按回车键结束");
		int id=scan.nextInt();
		//获取学生名字
		System.out.println("请输入新增学生的名字，按回车键结束：");
		String name=scan.next();
		//获取学生班级
		System.out.println("请输入新增学生的班级，按回车键结束：");
		String number=scan.next();
		//获取学生年龄
		System.out.println("请输入新增学生的年龄，按回车键结束：");
		int age=scan.nextInt();		
		arr[count]=new Students(id,name,number,age);
		//数组元素+1
		count++;
		//复制数组
		/*
		for (Students x:arr){
			int i=0;
			Narr[i]=x;
			i++;
		}
		StudentSystem.arr=null;*/
		
	}
	//删除学生信息
	public static  void deleteStudent(){
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入想要删除的学生的学号");
		int n=scan.nextInt();
		//将要删除的元素覆盖
		for(int i=0;i<count;i++){
			if(arr[i].getId()==n){
				for (int j=i;i<count ;j++){
					if(arr[j]!=null){
						arr[j]=arr[j+1];
					}
					
					else{
						count--;
						break;
					}
				}
				
			}
			
			
			
		}
	}
	//更改学生信息
	public static void setStudent(){
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入想要修改的学生的学号");
		int x=scan.nextInt();
		for (int i=0;i<count;i++){
			//获取相应元素
			if(arr[i].getId()==x){
				System.out.println("请输入新学号");
				arr[i].setId(scan.nextInt());
					System.out.println("请输入新姓名");
				arr[i].setName(scan.next());
					System.out.println("请输入新班级");
				arr[i].setNumber(scan.next());
					System.out.println("请输入新年龄");
				arr[i].setAge(scan.nextInt());
			}
		}
	}
	//查询学生信息
	public static  void selectStudent(){
		for(Students x: StudentSystem.arr ){
			if(x==null)break;
			System.out.println(x.toString());
			System.out.println();
		}
	}
	//更新
	public static void UpdateStudent(){
		
	}
	//判断是否
	

	
	
}