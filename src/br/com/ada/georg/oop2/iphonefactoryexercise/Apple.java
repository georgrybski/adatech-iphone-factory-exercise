package br.com.ada.georg.oop2.iphonefactoryexercise;

import br.com.ada.georg.oop2.iphonefactoryexercise.factories.IPhoneFactory;
import br.com.ada.georg.oop2.iphonefactoryexercise.iphones.IPhone;
import br.com.ada.georg.oop2.iphonefactoryexercise.util.FactoryHashmapInitializer;

import java.util.HashMap;

public class Apple {
    private final FactoryHashmapInitializer factoryHashmapInitializer = new FactoryHashmapInitializer();
    private final HashMap<String, IPhoneFactory> PRODUCT_NAME_FACTORY_HASHMAP = factoryHashmapInitializer.createProductNameFactoryHashMap();

    public IPhone deliverIPhone(TypeIPhoneEnum iPhoneType) {
        return iPhoneType.create();
    }

    public IPhone deliverIPhone(String requestedModel) {
        IPhone iphone = null;
        if (modelInProduction(requestedModel)) {
            iphone = assembleIphone(requestedModel);
        }
        return iphone;
    }
    private IPhone assembleIphone(String model) {
        return PRODUCT_NAME_FACTORY_HASHMAP.get(model).createIphone();
    }

    private boolean modelInProduction(String requestedModel) {
        return PRODUCT_NAME_FACTORY_HASHMAP.containsKey(requestedModel);
    }
}
