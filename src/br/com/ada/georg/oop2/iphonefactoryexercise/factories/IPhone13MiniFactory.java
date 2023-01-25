package br.com.ada.georg.oop2.iphonefactoryexercise.factories;

import br.com.ada.georg.oop2.iphonefactoryexercise.iphones.IPhone;
import br.com.ada.georg.oop2.iphonefactoryexercise.iphones.IPhone13Mini;

public class IPhone13MiniFactory implements IPhoneFactory {
    @Override
    public IPhone createIphone() {
        return new IPhone13Mini();
    }
}
