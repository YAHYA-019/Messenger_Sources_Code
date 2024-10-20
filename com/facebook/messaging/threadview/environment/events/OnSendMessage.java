package com.facebook.messaging.threadview.environment.events;

import X.1Q5;
import com.facebook.messaging.model.messages.Message;
import java.util.List;

/* loaded from: OnSendMessage.class */
public final class OnSendMessage implements 1Q5 {
    public final Message A00;

    public OnSendMessage(Message message) {
        this.A00 = message;
    }

    public String A3Z() {
        return "com.facebook.messaging.threadview.environment.events.OnSendMessage";
    }

    public List B1L() {
        return null;
    }
}
