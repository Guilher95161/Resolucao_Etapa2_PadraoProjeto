package atividade7_Template_Builder;

public abstract class CarBuilder {
    private String chassi;
    private String engine;
    private String features;
    public abstract String buildCar();

    public abstract void buildChassis();

    public abstract void installEngine();

    public abstract void setupFeatures();

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String toString(){
        return "Chassi: "+ getChassi()+"\n"+"Engine: "+getEngine()+"\n"+"Features: "+getFeatures();
    }
}
