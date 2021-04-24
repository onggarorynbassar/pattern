package kz.onggar.pattern.observer;

public class Main {
    public static void main(String[] args) {
        Chat chat = new Chat();

        Observer user1 = new User();
        chat.addObserver(user1);
        chat.setNewDataChunk(new DataChunk(1, "kek"));
        Observer user2 = new User();
        chat.addObserver(user2);
        Observer user3 = new User();
        chat.addObserver(user3);
        Observer user4 = new User();
        chat.setNewDataChunk(new DataChunk(2, "lul"));
        chat.addObserver(user4);
        Observer user5 = new User();
        chat.addObserver(user5);
        Observer user6 = new User();
        chat.addObserver(user6);
    }
}
