package mediator;

public class Client {

	public static void main(String[] args) {
		CQQGroup qqgroup = new CQQGroup();
		
		CStudent s1 = new CStudent("张小三");
		s1.setQqgroup(qqgroup);
		CStudent s2 = new CStudent("李小四");
		s2.setQqgroup(qqgroup);
		CStudent s3 = new CStudent("王小五");
		s3.setQqgroup(qqgroup);
		
		s1.notifyAllColleagues("明天放假！");
		s1.notifyColleague("李小四", "你不能放假！");
	

	}

}
