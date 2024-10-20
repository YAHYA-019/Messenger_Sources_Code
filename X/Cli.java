package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.google.common.collect.ImmutableList;

/* loaded from: Cli.class */
public final class Cli implements DH6 {
    public final /* synthetic */ C4f A00;
    public final /* synthetic */ DH6 A01;

    public Cli(C4f c4f, DH6 dh6) {
        this.A00 = c4f;
        this.A01 = dh6;
    }

    @Override // X.DH6
    public void C46() {
        this.A01.C46();
    }

    @Override // X.DH6
    public void C4V(MessagesCollection messagesCollection) {
        ImmutableList immutableList = messagesCollection.A01;
        if (immutableList.size() <= 0) {
            this.A01.C46();
            return;
        }
        C4f c4f = this.A00;
        c4f.A02 = ((Message) 1BK.A0r(immutableList)).A1V;
        c4f.A00 = immutableList.size();
        c4f.A01 = messagesCollection;
        this.A01.C4V(messagesCollection);
    }
}
