package test;

class Entry {
	private String word;
	
	public Entry() {
		System.out.println("*** 약어 사전 ***");
	}
	public Entry(String word) {
		this();
		this.word=word;
	}
	public void writeView() {
		System.out.println("약어: "+word);	
	}
}
class SubEntry extends Entry {
	private String definition;
	private int year;
	
	public SubEntry(String word) {
		super(word);
	}
	public SubEntry(String word, String definition, int year) {
		this(word);
		this.definition=definition;
		this.year=year;
	}
	public void writeView() {
		System.out.println("\n원어: "+definition+
						   "\n시기: "+year);
	}
}
public class Test9 {
	public static void main(String[] args) {
		new SubEntry("OOP","Object Oriented Programming", 1991).writeView();
	}
}
