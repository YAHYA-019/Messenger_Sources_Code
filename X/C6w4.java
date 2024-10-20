package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.6w4, reason: invalid class name */
/* loaded from: 6w4.class */
public final class C6w4 {
    public C5o5 A00;
    public C6va A01;
    public ListenableFuture A02;
    public final 1Br A03;
    public final ThreadKey A07;
    public final C6w5 A08;
    public final C6vd A09;
    public final 1Br A05 = 1Bu.A00(147840);
    public final 1Br A04 = 1Bu.A00(147851);
    public final 1Br A06 = 1Bu.A00(147841);

    public C6w4(FbUserSession fbUserSession, ThreadKey threadKey) {
        this.A07 = threadKey;
        this.A09 = ((C6vc) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 67184)).A00(threadKey);
        this.A03 = 1Lm.A01(fbUserSession, 115302);
        C1F6 c1f6 = (C1F6) 1Bn.A0A(999);
        Context A01 = FbInjector.A01();
        FbInjector.A04(c1f6.B92().Aqm());
        1Bn.A0M(c1f6);
        try {
            C6w5 c6w5 = new C6w5(fbUserSession);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A08 = c6w5;
            this.A00 = C5o5.A02;
            this.A01 = C6va.A06;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
