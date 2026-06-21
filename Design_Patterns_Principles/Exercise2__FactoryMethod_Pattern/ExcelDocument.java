package Design_Patterns_Principles.Exercise2__FactoryMethod_Pattern;
public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel Document");
    }
}
