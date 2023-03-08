public class Truck extends MeansOfTransport {
    @Override
    public void check(MeansOfTransport meansOfTransport) {
        super.check(meansOfTransport);
        super.checkEngine();
        checkTrailer();


    }

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

}

