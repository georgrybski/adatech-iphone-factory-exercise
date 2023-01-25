package br.com.ada.georg.oop2.iphonefactoryexercise.iphones;

public class IPhoneX implements IPhone {
    @Override
    public void showDetails() {
        System.out.println(
                """
                +-----------------------------------------------------+
                | IPhone X                                            |
                +-----------------------------------------------------+
                | Processor: A15 Bionic chip                          |
                | Memory: 3 GB RAM                                    |
                | Storage: 64 GB - 256 GB                              |
                | Display: 5.4 inches, 2436 x 1125 px, OLED display   |
                | Rear Camera: 12 MP                                  |
                | Front Camera: 7 MP                                  |
                | Dimensions: 70,9 x 143,6 x 7,7 mm                   |
                | Weight: 6,14 ounces (174 grams)                     |
                | Battery: 2438 mAh Battery with Fast                 |
                | OS: iOS v16.0                                       |
                +-----------------------------------------------------+
                """
        );
    }
}
