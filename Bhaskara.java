import java.lang.Math;

public class Bhaskara {
    public static float[] roots(float a, float b, float c){
        float delta = (b * b) - (4 * a * c);
        float[] roots = new float[2];
        roots[0] = (-b + (float)Math.sqrt(delta)) / (2 * a);
        roots[1] = (-b - (float)Math.sqrt(delta)) / (2 * a);
        return roots;
    }
}
