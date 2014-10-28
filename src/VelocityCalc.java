public class VelocityCalc {

	public static void main(String[] args) {
		double v0 = 0;
		double acc = 2.5;
		for (int t = 0; t <= 10; t++) {
			for (int a = 1; a <= 10; a++) {
				velocity(t, a, v0);
			}
		}
		// TODO Auto-generated method stub

	}

	public static void velocity(double t, double acc, double v0) {

		System.out.println(v0 + acc * t);
	}

}
