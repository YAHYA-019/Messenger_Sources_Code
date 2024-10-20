package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: Clk.class */
public final class Clk implements DH6 {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ DH4 A01;
    public final /* synthetic */ CGd A02;
    public final /* synthetic */ ThreadKey A03;
    public final /* synthetic */ String A04;

    public Clk(FbUserSession fbUserSession, DH4 dh4, CGd cGd, ThreadKey threadKey, String str) {
        this.A02 = cGd;
        this.A00 = fbUserSession;
        this.A01 = dh4;
        this.A03 = threadKey;
        this.A04 = str;
    }

    @Override // X.DH6
    public void C46() {
    }

    @Override // X.DH6
    public void C4V(MessagesCollection messagesCollection) {
        ImmutableList immutableList = messagesCollection.A01;
        if (immutableList.isEmpty()) {
            return;
        }
        CGd cGd = this.A02;
        FbUserSession fbUserSession = this.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            A0s.add(4YU.A0V(it).A1V);
        }
        CGd.A00(fbUserSession, this.A01, cGd, this.A03, ImmutableList.of(), this.A04, A0s);
    }
}
