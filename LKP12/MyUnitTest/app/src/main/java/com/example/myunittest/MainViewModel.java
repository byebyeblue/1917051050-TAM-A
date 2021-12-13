package com.example.myunittest;

public class MainViewModel {
    public final CuboidModel cuboidModel;

    MainViewModel(CuboidModel cuboidModel){
        this.cuboidModel = cuboidModel;
    }

    void save(double w, double l, double h){
        cuboidModel.save(w, l, h);
    }

    double getCircumference(){
        return cuboidModel.getCircumference();
    }

    double getSurfaceArea(){
        return cuboidModel.getSurfaceArea();
    }

    double getVolume(){
        return cuboidModel.getVolume();
    }
}
