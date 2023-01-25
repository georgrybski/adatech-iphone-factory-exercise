package br.com.ada.georg.oop2.iphonefactoryexercise.iphones;

public class IPhone9 implements IPhone {
    @Override
    public void showDetails() {
        System.out.println(
                """
                +-----------------------------------------------------+
                | IPhone 9                                            |
                +-----------------------------------------------------+
                | Processor: A13 Bionic                               |
                | Memory: 3 GB RAM                                    |
                | Storage: 64 GB inbuilt, Memory Card Not Supported   |
                | Display: 4,7 inches, 750 x 1334 px, IPS             |
                | Rear Camera: 12 MP                                  |
                | Front Camera: 7 MP                                  |
                | Dimensions: 67.3 x 138.4 x 7.3 mm                   |
                | Weight: 5.22 ounces (148 grams)                     |
                | Battery: 2050 mAh Battery with Fast                 |
                | OS: iOS v13.0                                       |
                +-----------------------------------------------------+
                """
        );
    }
}
