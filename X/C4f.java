package X;

import android.content.Context;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: C4f.class */
public final class C4f {
    public int A00;
    public MessagesCollection A01;
    public String A02;
    public final CDu A03;

    public C4f(Context context) {
        this.A03 = (CDu) 1Bn.A0E(context, (1BY) null, 84541);
    }

    public void A00(DH6 dh6, ThreadKey threadKey) {
        Byg A00;
        int i;
        MessagesCollection messagesCollection = this.A01;
        if (messagesCollection != null) {
            dh6.C4V(messagesCollection);
            return;
        }
        CDu cDu = this.A03;
        cDu.A03.add(new Cli(this, dh6));
        String str = this.A02;
        if (str == null || (i = this.A00) <= 0) {
            A00 = CDu.A00(cDu, threadKey);
        } else {
            A00 = CDu.A00(cDu, threadKey);
            A00.A00 = i;
            A00.A07 = str;
        }
        cDu.A02.A0J(new CHi(A00));
    }
}
