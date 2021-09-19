public class BmiService {
    public long calculate(int mass, int heigh) {
        int heighSquare = (int) Math.pow(heigh, 2);
        int index = mass * 10_000 / (heighSquare);
        return index;
    }
}
