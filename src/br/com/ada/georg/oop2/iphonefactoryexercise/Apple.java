package br.com.ada.georg.oop2.iphonefactoryexercise;

import br.com.ada.georg.oop2.iphonefactoryexercise.factories.IPhoneFactory;
import br.com.ada.georg.oop2.iphonefactoryexercise.iphones.IPhone;

import java.util.HashMap;

public class Apple {
    private final FactoryHashmapInitializer factoryHashmapInitializer = new FactoryHashmapInitializer();
    private final HashMap<String, IPhoneFactory> PRODUCT_NAME_FACTORY_HASHMAP = factoryHashmapInitializer.createProductNameFactoryHashMap();

    public IPhone deliverIphone(String requestedModel) {
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
