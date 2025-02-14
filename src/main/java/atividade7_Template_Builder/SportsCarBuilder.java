package atividade7_Template_Builder;

public class SportsCarBuilder extends CarBuilder{

    public String buildCar(){
        buildChassis();
        installEngine();
        setupFeatures();

        return toString();
    }

    public  void buildChassis(){
        setChassi("Feito de Fibra de Carbono");
    }

    public  void installEngine(){
        setEngine("3000 cilindradas e 400 cavalos");

    }

    public  void setupFeatures(){
        setFeatures("Assento em couro com ajuste eletrônico");
    }
}
