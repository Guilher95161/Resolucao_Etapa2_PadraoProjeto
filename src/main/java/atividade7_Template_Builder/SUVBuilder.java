package atividade7_Template_Builder;

public class SUVBuilder extends CarBuilder {
    public String buildCar(){
        buildChassis();
        installEngine();
        setupFeatures();

        return toString();
    }

    public  void buildChassis(){
        setChassi("Feito de Alumínio");
    }

    public  void installEngine(){
        setEngine("3000 cilindradas e 250 cavalos");

    }

    public  void setupFeatures(){
        setFeatures("Assento em tecido com ajuste manual e Sistema de tração nas quatro rodas");
    }
}
