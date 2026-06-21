package Design_Patterns_Principles.Exercise2__FactoryMethod_Pattern;
public class ExcelDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
