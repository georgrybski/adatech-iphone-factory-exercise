package br.com.ada.georg.oop2.iphonefactoryexercise;

import br.com.ada.georg.oop2.iphonefactoryexercise.factories.IPhone13MiniFactory;
import br.com.ada.georg.oop2.iphonefactoryexercise.factories.IPhone9Factory;
import br.com.ada.georg.oop2.iphonefactoryexercise.factories.IPhoneFactory;
import br.com.ada.georg.oop2.iphonefactoryexercise.factories.IPhoneXFactory;
import br.com.ada.georg.oop2.iphonefactoryexercise.iphones.IPhone;

public enum TypeIPhoneEnum {
    IPHONE_9(new IPhone9Factory(), "iphone9"),
    IPHONE_13_MINI(new IPhone13MiniFactory(), "iphone13mini"),
    IPHONE_X(new IPhoneXFactory(), "iphonex");

    private final IPhoneFactory FACTORY;
    private final String MODEL_NAME;

    TypeIPhoneEnum(IPhoneFactory iPhoneFactory, String modelName) {
        FACTORY = iPhoneFactory;
        MODEL_NAME = modelName;
    }

    public IPhone create() {
        return this.getFactory().createIphone();
    }

    public IPhoneFactory getFactory() {
        return FACTORY;
    }

    public String getModelName() {
        return MODEL_NAME;
    }
}
