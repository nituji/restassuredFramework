package apiConfigs;

public class APIPath {
	public static final class apiPath{
	//GET
		public static final String GET_LIST_OF_POSTS="posts";
		public static final String GET_SINGLE_POST="post/1";
		
	//POST
	public static final String	CREATE_USERS="/api/users";
	
	//DELETE
	public static final String DELETE_USER="/api/users/2";	
		
	}
	public static void main(String[]args) {
		
		System.out.println(APIPath.apiPath.CREATE_USERS);
	}

}
