package message2;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String getMessage(){
        return "Hello from MessageService";
    }
}
