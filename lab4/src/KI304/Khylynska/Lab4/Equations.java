package KI304.Khylynska.Lab4;
/**
 * The <code>Equations</code> class implements a method for calculating the expression ((2 / tg(x)) / x).
 * @author EOM Stuff
 * @version 1.0
 */
class Equations {
    /**
     * Method calculates the ((2 / tg(x)) / x) expression.
     * @param x Angle in degrees
     * @throws CalcException
     */
    public double calculate(int x) throws CalcException {
        double y, angle, rad;
        angle = 8 * x;
        rad = angle * Math.PI / 180.0;
        try {
            y = ( Math.cos(rad)) / (Math.sin(rad) * x);
            // If the result is not a number, throw an exception
            if (x == 0 || angle % 180 == 0 ) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException ex) {
            // Create a higher-level exception with an explanation of the error
        	if (x == 0) {
                throw new CalcException("Exception reason: X = 0");
        	} else if (angle % 180 == 0) {
                throw new CalcException("Exception reason: Illegal value of X for cotangent calculation");
            } else {
                throw new CalcException("Unknown reason of the exception during exception calculation");
            }
        }
        return y;
    }
}
