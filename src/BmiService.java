public class BmiService {
    public float calculate(float weight, float growth) {
        float imt = weight / ( growth * growth) * 100;
        return  imt;
    }
}
