package atividade7_Template_Builder;

public class SedanBuilder extends CarBuilder{
    public String buildCar(){
        buildChassis();
        installEngine();
        setupFeatures();

        return toString();
    }

    public  void buildChassis(){
        setChassi("Feito de Aço");
    }

    public  void installEngine(){
        setEngine("2000 cilindradas e 150 cavalos");

    }

    public  void setupFeatures(){
        setFeatures("Assento em couro preto");
    }
}
