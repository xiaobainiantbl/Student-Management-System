import java.util.Scanner;
/*
ѧ������ϵͳ
*/
class StudentSystem{
		//ѧ��������
		static int count=2;
		//�ж�ѭ��
		static boolean nuc=true;
		//����ѧ������
		static Students [] arr=new Students[5];
	public static void main(String args[]){
		//����ֵ
		Students s=new Students(100,"zhangsan","2013-11-1",23);
		Students s1=new Students(101,"����","2013-11-1",23);
		arr[0]=s;
		arr[1]=s1;
		//ѭ������
		while(nuc){
			Scanner scan=new Scanner(System.in);
			System.out.println("==============================�������ʾ����������ӣ�ִ�в���=================================");
			System.out.println("��������1,�˳�����;");
			System.out.println();
			System.out.println("��������2,����ѧ����Ϣ");
			System.out.println();
			System.out.println("��������3��ɾ��ѧ����Ϣ");
			System.out.println();
			System.out.println("��������4���޸�ѧ����Ϣ");
			System.out.println();
			System.out.println("��������5����ѯѧ����Ϣ");
			switch(scan.nextInt()){
				case 1:
						nuc=false;
						System.out.println("�˳�����ɹ���");
						break;
				case 2:
						addStudent();
						System.out.println("�����ɹ���");	
						System.out.println();
						break;
				case 3:
						deleteStudent();
						System.out.println("�����ɹ���");
						System.out.println();
						break;
				case 4:
						setStudent();
						System.out.println("�����ɹ���");
						System.out.println();
						break;
				case 5:
						selectStudent();
						System.out.println("�����ɹ���");
						System.out.println();
						break;
				 default:
						System.out.println("�밴����ʾ����ָ��");
						System.out.println();
						break;
			}
		}
		/*arr[0]=s;
		arr[1]=s1;
		SetStudent();
		SelectStudent(arr);*/
		
		
		
		
			
	}
	//����ѧ����Ϣ
	public static void   addStudent(){
		//�����µ��������
		//Students [] Narr=new Students[(StudentSystem.arr.length)+1];
		//��ȡ�����ӵ�ѧ����Ϣ
		Scanner scan=new Scanner(System.in);
		System.out.println("������������ѧ����ѧ�ţ����س�������");
		int id=scan.nextInt();
		//��ȡѧ������
		System.out.println("����������ѧ�������֣����س���������");
		String name=scan.next();
		//��ȡѧ���༶
		System.out.println("����������ѧ���İ༶�����س���������");
		String number=scan.next();
		//��ȡѧ������
		System.out.println("����������ѧ�������䣬���س���������");
		int age=scan.nextInt();		
		arr[count]=new Students(id,name,number,age);
		//����Ԫ��+1
		count++;
		//��������
		/*
		for (Students x:arr){
			int i=0;
			Narr[i]=x;
			i++;
		}
		StudentSystem.arr=null;*/
		
	}
	//ɾ��ѧ����Ϣ
	public static  void deleteStudent(){
		Scanner scan=new Scanner(System.in);
		System.out.println("��������Ҫɾ����ѧ����ѧ��");
		int n=scan.nextInt();
		//��Ҫɾ����Ԫ�ظ���
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
	//����ѧ����Ϣ
	public static void setStudent(){
		Scanner scan=new Scanner(System.in);
		System.out.println("��������Ҫ�޸ĵ�ѧ����ѧ��");
		int x=scan.nextInt();
		for (int i=0;i<count;i++){
			//��ȡ��ӦԪ��
			if(arr[i].getId()==x){
				System.out.println("��������ѧ��");
				arr[i].setId(scan.nextInt());
					System.out.println("������������");
				arr[i].setName(scan.next());
					System.out.println("�������°༶");
				arr[i].setNumber(scan.next());
					System.out.println("������������");
				arr[i].setAge(scan.nextInt());
			}
		}
	}
	//��ѯѧ����Ϣ
	public static  void selectStudent(){
		for(Students x: StudentSystem.arr ){
			if(x==null)break;
			System.out.println(x.toString());
			System.out.println();
		}
	}
	//����
	public static void UpdateStudent(){
		
	}
	//�ж��Ƿ�
	

	
	
}