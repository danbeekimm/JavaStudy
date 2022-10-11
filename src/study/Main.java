package study;

public class Main {

	public static void main(String[] args) {
		Programmer programmer = new Programmer("danbee", "korea");
		String name = programmer.getName();
		String team = programmer.getTeam();
		System.out.println(name + team+"team");
		

	}

}
