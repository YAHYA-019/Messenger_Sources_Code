package X;

import com.facebook.messaging.integrity.frx.selectmessages.ReviewSelectedMessagesFragment;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import java.util.ArrayList;

/* loaded from: Clj.class */
public final class Clj implements DH6 {
    public final /* synthetic */ B5L A00;
    public final /* synthetic */ ThreadKey A01;
    public final /* synthetic */ ThreadSummary A02;

    public Clj(B5L b5l, ThreadKey threadKey, ThreadSummary threadSummary) {
        this.A00 = b5l;
        this.A01 = threadKey;
        this.A02 = threadSummary;
    }

    @Override // X.DH6
    public void C46() {
        0fH.A0o("ReviewSelectedMessagesPresenter", "message load failed");
        Object obj = ((6Hk) this.A00).A00;
        if (obj != null) {
            ((ReviewSelectedMessagesFragment) obj).A1C();
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.QyF, java.lang.Object] */
    @Override // X.DH6
    public void C4V(MessagesCollection messagesCollection) {
        ArrayList arrayList;
        B5L b5l = this.A00;
        Object obj = ((6Hk) b5l).A00;
        if (obj == null || (arrayList = b5l.A07) == null) {
            return;
        }
        ThreadKey threadKey = this.A01;
        ?? obj2 = new Object();
        ((QyF) obj2).A01 = threadKey;
        ((QyF) obj2).A02 = arrayList;
        ((QyF) obj2).A00 = messagesCollection;
        b5l.A02 = obj2;
        ((ReviewSelectedMessagesFragment) obj).A1D(obj2.A00(), this.A02, false);
    }
}
