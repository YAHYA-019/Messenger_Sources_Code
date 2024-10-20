package X;

import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.6ue, reason: invalid class name */
/* loaded from: 6ue.class */
public final class C6ue implements 6OB {
    public final /* synthetic */ 6uY A00;
    public final /* synthetic */ 6uM A01;

    public C6ue(6uY r302, 6uM r303) {
        this.A00 = r302;
        this.A01 = r303;
    }

    public final void C7W(long j) {
        6uY r0 = this.A00;
        6uV r02 = r0.A05;
        FbUserSession fbUserSession = r0.A01;
        IAa A02 = r02.A02(fbUserSession, 7Mg.A0O);
        A02.A0F = 11T.A03(String.valueOf(j));
        A02.A03 = r0.A03;
        A02.A03(r0.A00);
        6uM r03 = this.A01;
        6uW r04 = r0.A04;
        String str = r03.A06;
        if (str == null) {
            str = "";
        }
        r04.A01(fbUserSession, str);
    }
}
