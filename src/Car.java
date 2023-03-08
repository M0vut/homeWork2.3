public class Car extends MeansOfTransport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check(MeansOfTransport meansOfTransport) {
        super.check(meansOfTransport);
        checkEngine();
    }


}
