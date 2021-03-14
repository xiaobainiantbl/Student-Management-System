public class Students{
	//封装
	private  int Id;
	  private String Name;
	 private String Number;
	private int Age;
	 public Students(){
		 
	 }
	public  Students (int Id,String Name,String Number,int Age){
		this.Id=Id;
		this.Name=Name;
		this.Number=Number;
		this.Age=Age;
	}
	//修改Id
	public void  setId(int Id){
		this.Id=Id;
	}
	public  void  setAge(int Age){
		this.Age=Age;
	}
	public void   setName(String Name){
		this.Name=Name;
	}
	public void  setNumber(String Number){
		this.Number=Number;
	}
	//获取Id
	public  int   getId(){
		return Id;
	}
	public  int   getAge(){
		return Age;
	}
	public  String   getName(){
		return Name;
	}
	public  String    getNumber(){
		return Number;
	}
	public String toString() {
		return "[-----学号: "+Id+" ,名字: "+Name+" ,班级: "+Number+" ,年龄: "+Age+"-----]";
	}
}