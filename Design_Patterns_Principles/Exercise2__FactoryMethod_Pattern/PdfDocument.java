package Design_Patterns_Principles.Exercise2__FactoryMethod_Pattern;
public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF Document");
    }
}
