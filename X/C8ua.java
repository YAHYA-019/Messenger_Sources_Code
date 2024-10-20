package X;

import com.facebook.messaging.model.messages.MessagesCollection;

/* renamed from: X.8ua, reason: invalid class name */
/* loaded from: 8ua.class */
public final class C8ua extends C99e {
    public final MessagesCollection A00;

    public C8ua(MessagesCollection messagesCollection) {
        this.A00 = messagesCollection;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C8ua) && 11T.A0O(this.A00, ((C8ua) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
