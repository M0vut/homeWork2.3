public class MeansOfTransport {
    private String modelName;
    private int wheelsCount;
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    public void check(MeansOfTransport meansOfTransport) {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            meansOfTransport.updateTyre();
        }
    }
        public void checkEngine() {
            System.out.println("Проверяем двигатель");
        }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public MeansOfTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}
