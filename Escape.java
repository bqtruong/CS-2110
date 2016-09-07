//Brian Truong (bt7tg)
//CS 2110-001
public class Escape {
	public static String escape(double v) {
		double si = v * 0.44704;
		double vEscape = Math.sqrt(2*(6.67*Math.pow(10,-11))*(1.3*Math.pow(10,22))/(1.153*Math.pow(10,6)));
		String ret = "";
		if (si > vEscape) {
			double massEscape = Math.pow(si,2)*(1.153*Math.pow(10,6))/(2*6.67*Math.pow(10,-11));
			ret = "The astronaut will not return to Halley’s Comet. In order for the astronaut to return, the comet would need to have a mass larger than " + massEscape;
		} else {
			ret = "The astronaut will return to Halley's Comet.";
		}
		return ret;
	}
	public static void main(String[] args) {
		System.out.println(escape(6000));
	}

}
