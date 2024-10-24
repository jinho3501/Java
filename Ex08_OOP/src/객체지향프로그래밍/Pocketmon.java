package 객체지향프로그래밍;

public class Pocketmon {
	
	// 포켓몬을 설계
	// 포켓몬의 속성(필드) : 이름, 공격 타입, 레벨, 공격력, 방어력, 체력
	private String name;
	private String type;
	private int level;
	private int attack_power;
	private int defense_power;
	private int hp;
	
	// 생성자 메소드
	public Pocketmon(String name, String type, int level, int attack_power, int defense_power, int hp) {
		this.name = name;
		this.type = type;
		this.level = level;
		this.attack_power = attack_power;
		this.defense_power = defense_power;
		this.hp = hp;
	}
	
	// 포켓몬의 기능(메소드) : 공격하기, 방어하기, 포켓몬의 정보출력
	public void attack() {
		System.out.println(name+"의 공격~! 공격력 "+attack_power);
	}
	
	public void defense() {
		System.out.println(defense_power+"만큼 쉴드! "+name+"의 방어성공!");
	}

	@Override
	public String toString() {
		return "Pocketmon [name=" + name + ", type=" + type + ", level=" + level + ", attack_power=" + attack_power
				+ ", defense_power=" + defense_power + ", hp=" + hp + "]";
	}

	// Getter/Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getAttack_power() {
		return attack_power;
	}

	public void setAttack_power(int attack_power) {
		this.attack_power = attack_power;
	}

	public int getDefense_power() {
		return defense_power;
	}

	public void setDefense_power(int defense_power) {
		this.defense_power = defense_power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	

	
	

}













