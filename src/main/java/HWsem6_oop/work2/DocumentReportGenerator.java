package HWsem6_oop.work2;

public class DocumentReportGenerator implements JsonReportGenerator, XmlReportGenerator{
    @Override
    public String generateJson() {
        String report = "jsonjson";
        // todo Logic
        return report;
    }

    @Override
    public String generateXml() {
        String report = "xml,sfsdf";
        // todo Logic
        return report;
    }
}
