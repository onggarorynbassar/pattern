package kz.onggar.pattern.adapter;

public class OldMegaProtocolToNewMegaProtocolAdapter implements NewMegaProtocol {

    private final OldMegaProtocol megaProtocol;

    public OldMegaProtocolToNewMegaProtocolAdapter(OldMegaProtocol megaProtocol) {
        this.megaProtocol = megaProtocol;
    }

    @Override
    public void getDataFast() {
        megaProtocol.getData();
        System.out.println("But trying to do it faster");
    }

    @Override
    public void sendDataFast() {
        megaProtocol.sendData();
        System.out.println("But trying to do it faster");
    }

    @Override
    public void handshake() {
        megaProtocol.handshake();
        System.out.println("But trying to do it faster");
    }

    @Override
    public void handshakeStep(NewMegaProtocolHandshakeStep step) {
        if (step == NewMegaProtocolHandshakeStep.FIRST) {
            megaProtocol.handshakeStep(1);
        }
        if (step == NewMegaProtocolHandshakeStep.SECOND) {
            megaProtocol.handshakeStep(2);
        }
        if (step == NewMegaProtocolHandshakeStep.THIRD) {
            megaProtocol.handshakeStep(3);
        }
    }
}
