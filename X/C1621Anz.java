package X;

import com.facebook.auth.usersession.FbUserSession;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.Anz, reason: case insensitive filesystem */
/* loaded from: Anz.class */
public final class C1621Anz extends 2UV {
    public 1BY A00;
    public final FbUserSession A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;

    public C1621Anz(1BO r302) {
        super(AbJ.A1D());
        this.A04 = 1BV.A01((1BY) null, 68173);
        this.A03 = 1BQ.A01();
        this.A05 = 1BV.A01((1BY) null, 84482);
        this.A02 = AbH.A0G();
        this.A00 = 7zL.A0Q(r302);
        this.A01 = 1Fw.A05((1BY) null);
    }

    public /* bridge */ /* synthetic */ 2UW A02(Object obj) {
        2UW r0 = 2UV.A03;
        11T.A0I(r0, 4YT.A00(26));
        return r0;
    }

    public /* bridge */ /* synthetic */ ListenableFuture A03(2UW r302, Object obj) {
        return DBF.A00(AbF.A13(this.A02), obj, this, 5);
    }
}
