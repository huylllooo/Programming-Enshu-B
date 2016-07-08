package enshu4;

public class StringSample {

	public StringSample() {
		String source = "  Hello   3   ";
		String[] spt = source.trim().split(" ");
		String key = spt[0].trim();
		String val = spt[spt.length-1];
		System.out.println("["+key+" "+val+"]");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StringSample();
	}

}
