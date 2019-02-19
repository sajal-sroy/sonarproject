package sonardemo_codecoverage.business;

public class Demo {

	public static boolean check(String username,
			String password){
		if(username=="admin" && password=="admin"){
			return true;
		}
		else
			return false;
	}
	
}
