package X;

import com.facebook.auth.usersession.FbUserSession;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: D9l.class */
public final class D9l implements Runnable {
    public static final String __redex_internal_original_name = "GQLProfileContextHelper$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ C3sa A01;
    public final /* synthetic */ CbA A02;
    public final /* synthetic */ SettableFuture A03;

    public D9l(FbUserSession fbUserSession, C3sa c3sa, CbA cbA, SettableFuture settableFuture) {
        this.A02 = cbA;
        this.A03 = settableFuture;
        this.A00 = fbUserSession;
        this.A01 = c3sa;
    }

    @Override // java.lang.Runnable
    public void run() {
        SettableFuture settableFuture = this.A03;
        CbA cbA = this.A02;
        C3sa c3sa = this.A01;
        C00i c00i = cbA.A01;
        c00i.get();
        c3sa.A0A(86400L);
        c00i.get();
        c3sa.A09(86400L);
        c3sa.A01 = AbH.A0B(cbA);
        settableFuture.setFuture(2FP.A02(D3J.A01(cbA, 10), AbK.A0I(cbA.A00).A09(c3sa), cbA.A03));
    }
}
