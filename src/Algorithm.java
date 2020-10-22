public abstract class Algorithm {

    public void start() {
        loadData();
        calculateStepOne();
        calculateStepTwo();
        calculateStepThree();
        saveResults();
    }

    abstract public void loadData();

    private void calculateStepOne() {
        System.out.println("Jakies obliczenia 1");
    }

    private void calculateStepTwo() {
        System.out.println("Jakies obliczenia 2");
    }

    private void calculateStepThree() {
        System.out.println("Jakies obliczenia 3");
    }

    abstract void saveResults();
}
