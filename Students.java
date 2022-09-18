package javaoops;

public class Students {

	public void getStudentInfo(String s,int i) {
		//System.out.println("name "+s"-"+i);
		System.out.println(s +i);
		}
	public void getStudentInfo(String s) {
		System.out.println(s);
	}
	public void getStudentInfo(int j) {
		System.out.println(j);
	}
	public static void main(String[] args) {
		Students s=new Students();
		s.getStudentInfo(1);
		s.getStudentInfo("viji");
		s.getStudentInfo("laxmi", 2);
	}
	
}
