package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.4ka, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ka.class */
public final class C07644ka extends AbstractC07504k2 implements InterfaceC07554k7 {
    public boolean A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 7Hy A04;
    public final 7Hv A05;
    public final ThreadKey A06;
    public final 1HN A07;
    public final 1G2 A08;
    public final 1G2 A09;
    public final FbUserSession A0A;
    public final 1De A0B;

    public C07644ka(FbUserSession fbUserSession, 1De r303, ThreadKey threadKey) {
        this.A0B = r303;
        this.A0A = fbUserSession;
        this.A06 = threadKey;
        1BY r0 = r303.A00;
        this.A01 = 1Bu.A03(r0, 65589);
        this.A02 = 1Bq.A00(33013);
        this.A03 = 1Bu.A03(r0, 17010);
        C1F6 c1f6 = (C1F6) this.A01.A00.get();
        Context context = (Context) 1Bn.A0E((Context) null, r0, 83719);
        Context A01 = FbInjector.A01();
        FbInjector.A04(c1f6.B92().Aqm());
        1Bn.A0M(c1f6);
        try {
            7Hv r02 = new 7Hv(context, fbUserSession, new 1De(c1f6, new int[0]), threadKey);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A05 = r02;
            this.A07 = new A1t(this, 1);
            this.A04 = new 7Hy(this);
            1G2 r03 = 1NK.A05;
            this.A09 = AbstractC03303xn.A06(threadKey);
            this.A08 = AbstractC03303xn.A04(threadKey);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    @Override // X.InterfaceC07554k7
    public AnonymousClass207 Asi() {
        return 7I0.A00;
    }
}
