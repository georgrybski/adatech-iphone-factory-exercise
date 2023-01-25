package br.com.ada.georg.oop2.iphonefactoryexercise.factories;

import br.com.ada.georg.oop2.iphonefactoryexercise.iphones.IPhone;
import br.com.ada.georg.oop2.iphonefactoryexercise.iphones.IPhone9;

public class IPhone9Factory implements IPhoneFactory {
    @Override
    public IPhone createIphone() {
        return new IPhone9();
    }
}
