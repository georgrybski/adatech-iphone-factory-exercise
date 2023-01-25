package br.com.ada.georg.oop2.iphonefactoryexercise;

import br.com.ada.georg.oop2.iphonefactoryexercise.factories.IPhoneFactory;

import java.util.HashMap;
import java.util.stream.Stream;

public class FactoryHashmapInitializer {
    public HashMap<String, IPhoneFactory> createProductNameFactoryHashMap() {
        HashMap<String, IPhoneFactory> factoryHashMap = new HashMap<>();
        Stream.of(TypeIPhoneEnum.values()).map(enumerator -> factoryHashMap.put(enumerator.getModelName(), enumerator.getFactory()));
        return factoryHashMap;
    }
}
