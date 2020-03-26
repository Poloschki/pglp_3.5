package org.example;

import java.time.LocalDateTime;

public class Login implements LogMessage {

    @Override
    public void afficheLogMessage(String message) {
        System.out.println(LocalDateTime.now() + message);
    }
}
