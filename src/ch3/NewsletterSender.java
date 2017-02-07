package ch3;

/**
 * Created by adl on 01.02.17.
 */
public interface NewsletterSender {
    void setSmtpServer(String smtpServer);
    String getSmtServer();
    void setFromAddress(String fromAddress);
    String getFromeAddress();
    void send();
}
