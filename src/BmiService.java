public class BmiService {
    public double calculate(double weightKg, double heightCm) {
        double bmi = weightKg / (heightCm * heightCm);
        double scale = Math.pow(10, 2);
        double result = Math.ceil(bmi * scale) / scale;
        return result;
    }
}
