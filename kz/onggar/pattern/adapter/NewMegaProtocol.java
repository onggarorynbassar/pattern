package kz.onggar.pattern.adapter;

public interface NewMegaProtocol {
    void getDataFast();

    void sendDataFast();

    void handshake();

    void handshakeStep(NewMegaProtocolHandshakeStep step);
}
