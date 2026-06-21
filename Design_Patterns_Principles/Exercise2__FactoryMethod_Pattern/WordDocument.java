package Design_Patterns_Principles.Exercise2__FactoryMethod_Pattern;
public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word Document");
    }
}
