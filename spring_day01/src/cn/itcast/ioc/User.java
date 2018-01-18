package cn.itcast.ioc;

public class User {

	public void add(){
		System.out.println("hello world!");
	}
	public static void main(String[] args){
		//原始方法
		User user = new User();
		user.add();
	}
}
