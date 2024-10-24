package 캐릭터예제;

public class Zyra extends Character {
	
	public Zyra(String name, String position) {
		super(name, position);
	}

	@Override
	public void q() {
		System.out.println("가시 덩굴 공격!");
	}
	
	@Override
	public void w() {
		System.out.println("씨앗뿌리기");
		
	}

	@Override
	public void e() {
		System.out.println("가시 덩굴로 속박!");
	}

	@Override
	public void r() {
		System.out.println("가시 덩굴들로 공중에 띄우고 공격!");
	}
	
	

	

}
