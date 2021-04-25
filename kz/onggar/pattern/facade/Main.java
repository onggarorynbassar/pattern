package kz.onggar.pattern.facade;

public class Main {
    public static void main(String[] args) {
        HardToUseInterface hardToUseInterface = new ComplexFileReader();
        EasyToUseFacade fileReaderFacade = new FileReaderFacade(hardToUseInterface);
        System.out.println(fileReaderFacade.readFileData());;
    }
}
