package Design_Patterns_Principles.Exercise2__FactoryMethod_Pattern;
public class PdfDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
