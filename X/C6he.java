package X;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.6he, reason: invalid class name */
/* loaded from: 6he.class */
public final class C6he {
    public Lifecycle A00;
    public ThreadKey A01;
    public final C00i A02;
    public final AnonymousClass475 A03;
    public final C6hd A04;

    public /* synthetic */ C6he(Lifecycle lifecycle, C00i c00i, C6hd c6hd, ThreadKey threadKey, int i) {
        AnonymousClass475 anonymousClass475 = (i & 4) != 0 ? (AnonymousClass475) 1Bi.A03(66234) : null;
        lifecycle = (i & 128) != 0 ? C2sa.A00 : lifecycle;
        11T.A0F(c6hd, 1);
        11T.A0F(c00i, 2);
        11T.A0F(anonymousClass475, 3);
        11T.A0F(lifecycle, 8);
        this.A04 = c6hd;
        this.A02 = c00i;
        this.A03 = anonymousClass475;
        this.A01 = threadKey;
        this.A00 = lifecycle;
    }

    public static final 2FR A00(C6he c6he) {
        C6hh c6hh = new C6hh(c6he.A00, c6he.A01);
        1BY r0 = c6he.A04.A00.A00;
        1Br A03 = 1Bu.A03(r0, 67581);
        5Vk r02 = (5Vk) 1Bn.A0E((Context) null, r0, 82763);
        ThreadKey threadKey = c6hh.A01;
        Lifecycle lifecycle = c6hh.A00;
        ListenableFuture A00 = 2FP.A00(new 85K(A03, c6hh, 0), 5Vk.A01(lifecycle, CallerContext.A0B("OpFetchThreadSummary"), r02, threadKey, false, false).A01(), 2eQ.A01);
        if (!11T.A0O(lifecycle, C2sa.A00)) {
            A00 = BTa.A00(lifecycle, A00);
        }
        2FR A032 = 2FR.A03(47F.A00(c6he.A02, A00, "OpFetchThreadUsers failed", "OpFetchThreadUsers failed", new 85L(c6he.A03, 1)));
        11T.A0A(A032);
        return A032;
    }

    public final void A01(C6hg c6hg) {
        1Kd.A0F(new JTm(c6hg, this, 0), A00(this), 2eQ.A01);
    }
}
