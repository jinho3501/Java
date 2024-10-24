package 핸드폰예제;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===핸드폰===");
		Phone p = new Phone();
		p.call();
		p.text();
		
		System.out.println("===피처폰===");
		FeaturePhone fp = new FeaturePhone();
		fp.call();
		fp.text();
		fp.camera();
		
		System.out.println("===스마트폰===");
		
		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.text();
		sp.camera();
		sp.internet();
		

	}

}
