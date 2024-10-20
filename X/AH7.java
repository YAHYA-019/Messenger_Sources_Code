package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: AH7.class */
public final class AH7 implements Runnable {
    public static final String __redex_internal_original_name = "AdapterSender$1";
    public final /* synthetic */ ThreadKey A00;
    public final /* synthetic */ 7NH A01;
    public final /* synthetic */ C5fv A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public AH7(ThreadKey threadKey, 7NH r303, C5fv c5fv, String str, boolean z) {
        this.A01 = r303;
        this.A02 = c5fv;
        this.A00 = threadKey;
        this.A03 = str;
        this.A04 = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        7NH r0 = this.A01;
        1Du it = r0.A03.iterator();
        while (it.hasNext()) {
            76D r02 = (76D) it.next();
            C5fv c5fv = this.A02;
            ThreadKey threadKey = this.A00;
            Message A4v = r02.A4v(threadKey, c5fv);
            if (A4v != null) {
                r0.A02.Ckp(A4v, threadKey, r0.A01, c5fv, this.A03, this.A04);
                return;
            }
        }
        0fH.A0o(4YT.A00(518), "No message builder found to handle message");
    }
}
