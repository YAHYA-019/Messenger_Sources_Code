package X;

import com.facebook.messaging.communitymessaging.plugins.memberactions.leavechat.LeaveChatImplementation;

/* loaded from: Ciq.class */
public final class Ciq implements DEq {
    public final /* synthetic */ LeaveChatImplementation A00;

    public Ciq(LeaveChatImplementation leaveChatImplementation) {
        this.A00 = leaveChatImplementation;
    }

    @Override // X.DEq
    public void C8L() {
        this.A00.A07.Bu9("close_button");
    }
}
