package kz.onggar.pattern.adapter;

public class MegaProtocol implements OldMegaProtocol {
    @Override
    public void getData() {
        System.out.println("Receiving data");
    }

    @Override
    public void sendData() {
        System.out.println("Sending data");
    }

    @Override
    public void handshake() {
        System.out.println("Performing handshake");
    }

    @Override
    public void handshakeStep(int step) {
        System.out.println("Step " + step);
    }
}
