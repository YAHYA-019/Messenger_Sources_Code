package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.549, reason: invalid class name */
/* loaded from: 549.class */
public final class AnonymousClass549 extends 54A {
    public final 54B A00;
    public final 54C A01;
    public final 54C A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 54D A05;
    public final 54F A06;
    public final AtomicBoolean A07;
    public final Context A08;
    public final 1H2 A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass549(FbUserSession fbUserSession) {
        super(fbUserSession);
        11T.A0F(fbUserSession, 1);
        this.A03 = 1Bq.A00(16387);
        this.A04 = 1Bq.A00(16457);
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        this.A08 = A00;
        C0dp c0dp = (C0dp) 1Bi.A03(99390);
        C0dr c0dr = (C0dr) 1Bi.A03(84488);
        11T.A0F(c0dp, 0);
        11T.A0F(c0dr, 1);
        54B r0 = new 54B(c0dp, c0dr);
        this.A00 = r0;
        this.A01 = new 54C(r0);
        this.A02 = new 54C(this.A00);
        this.A05 = new 54D(fbUserSession, A00);
        this.A07 = new AtomicBoolean(false);
        1H2 r02 = (1H2) 1Bi.A03(33032);
        this.A09 = r02;
        54B r03 = this.A00;
        ExecutorService executorService = (ExecutorService) this.A04.A00.get();
        1Vd A01 = ((DKN) 1Bn.A0E(A00, (1BY) null, 68643)).A01();
        11T.A0A(A01);
        this.A06 = new 54F(fbUserSession, r03, this.A01, this.A02, r02, A01, executorService);
    }
}
