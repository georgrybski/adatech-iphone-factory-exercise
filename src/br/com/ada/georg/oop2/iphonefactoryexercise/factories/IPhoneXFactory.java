package br.com.ada.georg.oop2.iphonefactoryexercise.factories;

import br.com.ada.georg.oop2.iphonefactoryexercise.iphones.IPhone;
import br.com.ada.georg.oop2.iphonefactoryexercise.iphones.IPhoneX;

public class IPhoneXFactory implements IPhoneFactory {
    @Override
    public IPhone createIphone() {
        return new IPhoneX();
    }
}
