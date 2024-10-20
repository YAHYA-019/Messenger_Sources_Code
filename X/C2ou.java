package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.2ou, reason: invalid class name */
/* loaded from: 2ou.class */
public final class C2ou extends C1rj {
    public MigColorScheme A00;
    public C2fr A01;
    public String A02;

    public C2ou() {
        super("ThreadProfileImageComponent");
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C2fr c2fr = this.A01;
        String str = this.A02;
        MigColorScheme migColorScheme = this.A00;
        11T.A0F(c2fr, 1);
        11T.A0F(migColorScheme, 3);
        C2pz A00 = C2px.A00(r302);
        A00.A2X(C2q0.A08);
        A00.A2Z(c2fr);
        C2px c2px = A00.A01;
        c2px.A0A = str;
        A00.A0F("android.view.View");
        c2px.A09 = "ThreadListImage";
        A00.A2Y(migColorScheme);
        return A00.A2W();
    }
}
