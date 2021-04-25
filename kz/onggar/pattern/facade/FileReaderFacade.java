package kz.onggar.pattern.facade;

public class FileReaderFacade implements EasyToUseFacade {

    private final HardToUseInterface complexFileReader;

    public FileReaderFacade(HardToUseInterface complexFileReader) {
        this.complexFileReader = complexFileReader;
    }

    @Override
    public String readFileData() {
        complexFileReader.openFile();
        StringBuilder result = new StringBuilder();
        while (complexFileReader.hasNext()) {
            result.append(complexFileReader.readByte()).append(" ");
        }
        complexFileReader.closeFile();
        return result.toString();
    }
}
