package Inputoutput1;

public class TextMarksEXTER {
    public static void main(String[] args) {
		MarksheetEXTERNAL mark = new MarksheetEXTERNAL("monti",55,45,35);
		
		MarksheetEXTERNAL newmark = null;
		
		
		
		System.out.println(mark.getName());
		System.out.println(mark.getMaths());
		System.out.println(mark.getPhysics());
		System.out.println(mark.getChemistry());
		System.out.println(mark.getTemp());
				
	}
}
