package encasulation;

public class TestCollage {
public static void main(String[] args) {
	Collage clg= new Collage();
	clg.setClgName("amgoi");
	clg.getClgName();
	clg.myname = "Sudhakar";
	clg.setRollNo(10);
	//clg.getRollNo();
	System.out.println(clg.getRollNo());
	System.out.println(clg.myname);
	System.out.println(clg.getClgName());
}
}
