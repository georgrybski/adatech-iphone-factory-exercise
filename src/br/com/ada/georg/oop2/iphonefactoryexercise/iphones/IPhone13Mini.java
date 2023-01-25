package br.com.ada.georg.oop2.iphonefactoryexercise.iphones;

public class IPhone13Mini implements IPhone{
    @Override
    public void showDetails() {
        System.out.println(
                """
                +-----------------------------------------------------+
                | IPhone 13 mini                                      |
                +-----------------------------------------------------+
                | Processor: A15 Bionic chip                          |
                | Memory: 3 GB RAM                                    |
                | Storage: 128GB - 512GB                              |
                | Display: 5.4 inches, 2340 x 1080 px, OLED display   |
                | Rear Camera: 12 MP                                  |
                | Front Camera: 7 MP                                  |
                | Dimensions: 67.3 x 138.4 x 7.3 mm                   |
                | Weight: 4.97 ounces (141 grams)                     |
                | Battery: 2050 mAh Battery with Fast                 |
                | OS: iOS v13.0                                       |
                +-----------------------------------------------------+
                """
        );
    }
}
