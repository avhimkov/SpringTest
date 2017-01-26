/**
 * Created by adl on 26.01.17.
 */
public interface MessageRenderer {
    void render();
    void setMessageProvider (MessageProvider provider);
    MessageProvider getMessageProvider();
}
