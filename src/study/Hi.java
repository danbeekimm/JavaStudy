package study;

public class Hi {
	 interface Animal { void makeNoise(); }

	 class Horse implements Animal {
	   Long weight = 1200L;
	    public void makeNoise() { System.out.println("whinny"); }
	 }

	    
}
 class Icelandic extends Hi {
	      public void makeNoise() { System.out.println("vinny"); }
	      public static void main(String[] args) {
	        Icelandic i1 = new Icelandic();
	         Icelandic i2 = new Icelandic();
	         Icelandic i3 = new Icelandic();
	        i3 = i1; i1 = i2; i2 = null; i3 = i1;
	    }
	 }