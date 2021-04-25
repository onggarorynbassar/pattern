package kz.onggar.pattern.adapter;

public class Main {
    public static void main(String[] args) {
        OldMegaProtocol oldProtocol = new MegaProtocol();
        NewMegaProtocol megaProtocol = new OldMegaProtocolToNewMegaProtocolAdapter(oldProtocol);

        megaProtocol.handshake();
        megaProtocol.handshakeStep(NewMegaProtocolHandshakeStep.FIRST);
        megaProtocol.handshakeStep(NewMegaProtocolHandshakeStep.SECOND);
        megaProtocol.handshakeStep(NewMegaProtocolHandshakeStep.THIRD);

        megaProtocol.sendDataFast();
        megaProtocol.getDataFast();
    }
}
