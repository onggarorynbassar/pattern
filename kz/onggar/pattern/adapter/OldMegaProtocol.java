package kz.onggar.pattern.adapter;

public interface OldMegaProtocol {
    void getData();
    void sendData();

    void handshake();
    void handshakeStep(int step);
}
