package br.com.ada.georg.oop2.iphonefactoryexercise;

import br.com.ada.georg.oop2.iphonefactoryexercise.iphones.IPhone;

import java.util.stream.Stream;

public class IPhoneFactoryExerciseApplication {
    public static void main(String[] args) {
        var apple = new Apple();
        Stream.of(TypeIPhoneEnum.values())
                .map(TypeIPhoneEnum::getModelName)
                .map(apple::deliverIphone)
                .forEach(IPhone::showDetails);
    }
}
