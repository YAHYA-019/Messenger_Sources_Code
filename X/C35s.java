package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.executor.OfflineMutationsManager;

/* renamed from: X.35s, reason: invalid class name */
/* loaded from: 35s.class */
public final class C35s extends 1Vd {
    public 1BY A00;
    public final FbUserSession A01;
    public final C01603rp A0D;
    public final C00i A0G;
    public final C00i A0I;
    public final C00i A0J;
    public final 1Wk A0E = (1Wk) 1Bn.A0E((Context) null, (1BY) null, 65704);
    public final 1Wo A0C = (1Wo) 1Bn.A0E((Context) null, (1BY) null, 16694);
    public final C0dp A07 = (C0dp) 1Bi.A03(99390);
    public final 1Wu A09 = (1Wu) 1Bn.A0E((Context) null, (1BY) null, 65703);
    public final 1Qc A04 = (1Qc) 1Bi.A03(65837);
    public final 1Wx A0F = (1Wx) 1Bi.A03(16695);
    public final 1QB A03 = (1QB) 1Bn.A0E((Context) null, (1BY) null, 65841);
    public final C01s A05 = 1BL.A0I();
    public final 1EZ A02 = (1EZ) 1Bn.A0E((Context) null, (1BY) null, 16428);
    public final 1Wz A06 = (1Wz) 1Bn.A0E((Context) null, (1BY) null, 66362);
    public final 1X1 A08 = (1X1) 1Bi.A03(16696);
    public final 1X4 A0A = (1X4) 1Bn.A0E((Context) null, (1BY) null, 16697);
    public final OfflineMutationsManager A0B = (OfflineMutationsManager) 1Bi.A03(16698);
    public final C00i A0H = 1BQ.A02(16442);

    public C35s(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        this.A01 = fbUserSession;
        this.A0D = (C01603rp) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 67426);
        this.A0J = new 1MV(fbUserSession, (1BY) null, 99904);
        this.A0I = new 1MV(fbUserSession, (1BY) null, 68051);
        this.A0G = new 1MV(fbUserSession, (1BY) null, 68052);
    }

    public static final C35s A02(1BO r301, Object obj) {
        return new C35s(r301, (FbUserSession) obj);
    }
}
