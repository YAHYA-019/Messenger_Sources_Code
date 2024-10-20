package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxCallback;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: I43.class */
public final class I43 {
    public 1BY A00;
    public HSQ A01;
    public ThreadKey A02;
    public ListenableFuture A03;
    public Long A04;
    public boolean A06;
    public final FbUserSession A07;
    public final 7V5 A0B;
    public final 7V1 A0D;
    public final C00i A08 = 1BQ.A02(16477);
    public final IaA A0C = new IaA(this);
    public String A05 = "";
    public final C00i A0A = 1BQ.A02(66270);
    public final C00i A09 = 1BV.A01((1BY) null, 82763);
    public final 7V3 A0E = (7V3) 1Bn.A0E((Context) null, (1BY) null, 50209);
    public final C03853z9 A0F = (C03853z9) 1Bi.A03(67389);

    public I43(1BO r302, FbUserSession fbUserSession) {
        this.A00 = 7zL.A0Q(r302);
        this.A07 = fbUserSession;
        this.A0D = (7V1) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 50208);
        this.A0B = (7V5) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 67951);
    }

    public static void A00(I43 i43, ListenableFuture listenableFuture) {
        47I A0A;
        Object A16 = GOn.A16();
        ThreadKey threadKey = i43.A02;
        Long l = i43.A04;
        if (l == null) {
            if (threadKey != null) {
                Executor A1E = 1BK.A1E(i43.A08);
                A0A = 47H.A00(new Imb(i43, 7), 2FP.A02(new Imb(i43, 8), ((5Vk) i43.A09.get()).A02(threadKey).A01(), A1E), Throwable.class, A1E);
                1Kd.A0D(i43.A08, new ABt(9, i43, threadKey, A16), 1Kd.A02(new ListenableFuture[]{A0A, listenableFuture}));
            }
            l = null;
        }
        A0A = 1Kd.A0A(l);
        1Kd.A0D(i43.A08, new ABt(9, i43, threadKey, A16), 1Kd.A02(new ListenableFuture[]{A0A, listenableFuture}));
    }

    public void A01() {
        ThreadKey threadKey = this.A02;
        if (threadKey != null) {
            this.A0E.A07.A06(threadKey.A0u());
        }
        ListenableFuture listenableFuture = this.A03;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.A03 = null;
        }
        this.A06 = false;
        this.A05 = "";
        this.A02 = null;
        this.A04 = null;
    }

    public void A02(JF0 jf0, ThreadKey threadKey) {
        if (threadKey != null) {
            1FV A01 = this.A0B.A01(threadKey, (MailboxCallback) null);
            1Kd.A0D(this.A08, Inf.A00(jf0, this, 12), A01);
        }
    }
}
