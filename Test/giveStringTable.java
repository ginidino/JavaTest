public class Test6 {
  public static void main(String[] args) {
    String[] teachers = giveStringTable();
		for (String teacher : teachers)
	        System.out.println(teacher);
	}

	public static String[] giveStringTable() {
		String[] tchrs = new String[3];
		
		tchrs[0] = "Bonus";
	  	tchrs[1] = "Ihq";
	  	tchrs[2] = "Lennon";
	    
		return tchrs;
	}
}
