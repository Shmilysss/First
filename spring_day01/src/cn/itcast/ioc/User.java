package cn.itcast.ioc;

public class User {

	public void add(){
		System.out.println("hello world!");
	}
	public static void main(String[] args){
		//ԭʼ����
		User user = new User();
		user.add();
	}
}
