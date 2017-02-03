/**
 * Created by adl on 03.02.17.
 */
public class ConfigurableMessageProvider implements MessageProvider{
    private String message;
    public ConfigurableMessageProvider(String message){
        this.message = message;
    }
    @Override
    public String getMessage(){
        return message;
    }
}
