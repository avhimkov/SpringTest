public class Main {

    public static void main(String[] args) {
        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorlMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
