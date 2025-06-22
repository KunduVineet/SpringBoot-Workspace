package in.vk.main;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
    
    private final ChatClient chatClient;

    public ChatController(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    @GetMapping("/get")
    public String generate(@RequestParam(value = "message", defaultValue = "Tell me something") String message) {
        try {
            return chatClient.prompt().user(message).call().content();
        } catch (Exception e) {
            return "Error processing request: " + e.getMessage();
        }
    }
}