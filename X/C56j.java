package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.56j, reason: invalid class name */
/* loaded from: 56j.class */
public final class C56j implements 55Q {
    public 1BY A00;
    public final C00i A01 = new 1BV((1BY) null, 16980);
    public final C00i A02 = new 1BV((1BY) null, 147952);

    public C56j(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public static 2KW A00(1Iw r301, String str, int i) {
        5Os A00 = 2KW.A00(r301, 0);
        A00.A2f(str);
        A00.A00.A0S = 2KG.A04;
        A00.A2a(i);
        A00.A2Y(2KV.A04.textSizeSp);
        A00.A0X();
        A00.A19(16.0f);
        A00.A0R();
        return A00.A2W();
    }

    public /* bridge */ /* synthetic */ 1LI AJD(1Iw r302, AnonymousClass544 anonymousClass544) {
        int B9Q = ((MigColorScheme) this.A01.get()).B9Q();
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        boolean z = ((C56k) anonymousClass544).A00;
        C00i c00i = this.A02;
        c00i.get();
        int i = 2131962054;
        if (z) {
            i = 2131962053;
        }
        A01.A2e(A00(r302, r302.A0D(i), B9Q));
        c00i.get();
        c00i.get();
        A01.A2e(A00(r302, r302.A0D(2131962055), B9Q));
        return A01.A00;
    }

    public Class BDi() {
        return C56k.class;
    }
}
