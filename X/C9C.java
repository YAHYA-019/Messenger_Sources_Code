package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: C9C.class */
public final class C9C {
    public final Context A00;
    public final FbUserSession A01;
    public final CN8 A06;
    public final Bq6 A07;
    public final C00i A03 = 1Bi.A02(C1gb.class, (Class) null);
    public final C00i A05 = 1Bi.A02(C1qx.class, (Class) null);
    public final C00i A02 = 1Bi.A02(C8k.class, (Class) null);
    public final C00i A04 = 1Bi.A02(C1yf.class, (Class) null);

    public C9C(Context context, FbUserSession fbUserSession) {
        1Bn.A0F(context, BUf.class, (Class) null);
        this.A07 = new Bq6(context, fbUserSession);
        1Bn.A0F(context, BUi.class, (Class) null);
        this.A06 = new CN8(context, fbUserSession);
        this.A00 = context;
        this.A01 = fbUserSession;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0305, code lost:
    
        throw r324;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.collect.ImmutableList A00(java.lang.String r302, int r303, int r304) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9C.A00(java.lang.String, int, int):com.google.common.collect.ImmutableList");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fd  */
    /* JADX WARN: Type inference failed for: r0v242, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r313v1, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.collect.ImmutableList A01(java.lang.String r302, int r303, int r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9C.A01(java.lang.String, int, int, boolean):com.google.common.collect.ImmutableList");
    }

    public void A02(String str) {
        Bq6 bq6 = this.A07;
        1Br.A0C(bq6.A02);
        Context context = bq6.A00;
        FbUserSession fbUserSession = bq6.A01;
        C1gb.A01(this.A03).AZk(36318088837279821L);
        1Lo.A03(context, fbUserSession, 67629);
        11T.A0D(str);
        5O7.A00(str);
        11T.A0D((Object) null);
        throw 0Q8.createAndThrow();
    }
}
