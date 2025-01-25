package atividade1_Strategy;

public class ImageManager {
//    private Object renderer;
    private DispositiveRenderer renderer;
    public void setRenderer(DispositiveRenderer renderer) {
        this.renderer = renderer;
    }

//    public void show() {
//        if(renderer instanceof TVRenderer) {
//            TVRenderer tvRenderer = (TVRenderer) renderer;
//            tvRenderer.mostrarImagem();
//        } else if(renderer instanceof LaptopRenderer) {
//            LaptopRenderer laptopRenderer = (LaptopRenderer) renderer;
//            laptopRenderer.mostrarImagem();
//        } else if(renderer instanceof SmartphoneRenderer) {
//            SmartphoneRenderer smartphoneRenderer = (SmartphoneRenderer) renderer;
//            smartphoneRenderer.mostrarImagem();
//        }
//    }

    public void show(){
        renderer.mostrarImagem();
    }
}

