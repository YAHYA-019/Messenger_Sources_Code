package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: J2y.class */
public final class J2y implements Runnable {
    public static final String __redex_internal_original_name = "TincanServiceHandler$2";
    public final /* synthetic */ ThreadKey A00;
    public final /* synthetic */ ISC A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public J2y(ThreadKey threadKey, ISC isc, boolean z, boolean z2, boolean z3) {
        this.A01 = isc;
        this.A00 = threadKey;
        this.A02 = z;
        this.A03 = z2;
        this.A04 = z3;
    }

    @Override // java.lang.Runnable
    public void run() {
        C3Qu c3Qu = (C3Qu) this.A01.A04.get();
        ThreadKey threadKey = this.A00;
        boolean z = this.A02;
        boolean z2 = this.A03;
        boolean z3 = this.A04;
        Cbd A00 = C3Qu.A00(c3Qu);
        5Xd A002 = Cbd.A00(A00);
        Long A0l = 4YU.A0l(threadKey);
        1Um A0O = 1BK.A0O(A002, 0);
        MailboxFutureImpl A0P = 1BK.A0P(A0O);
        1Um.A02(A0O, new N7H(A0P, A002, A0l, z, z2, z3), A0P, false);
        Iby.A00(A0P, A00, 25);
    }
}
