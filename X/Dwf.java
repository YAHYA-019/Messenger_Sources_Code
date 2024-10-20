package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Dwf.class */
public final class Dwf extends C1rj {
    public AnonymousClass553 A00;
    public AnonymousClass553 A01;

    public Dwf() {
        super("CustomReactionsToolbar");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        AnonymousClass553 anonymousClass553 = this.A01;
        AnonymousClass553 anonymousClass5532 = this.A00;
        C1u2 A0R = 7zP.A0R();
        Context context = r302.A0D;
        MigColorScheme A0o = AbF.A0o(context, 16980);
        C5yw A0b = 7zN.A0b(r302, false);
        A0b.A2a(2131955346);
        A0b.A2c(2MG.A06);
        A0b.A2b(A0o);
        A0b.A2h(false);
        A0b.A2i(false);
        int i = C5yu.A00;
        6T0 r0 = new 6T0();
        r0.A00(A0o);
        r0.A00 = A0R.A03(C1u3.A5R);
        r0.A04 = anonymousClass553;
        Resources resources = context.getResources();
        r0.A07 = resources.getString(2131955345);
        A0b.A2e(new C5z1(r0));
        6T0 r02 = new 6T0();
        r02.A00(A0o);
        r02.A00 = A0R.A03(C1u3.A1U);
        r02.A04 = anonymousClass5532;
        r02.A07 = resources.getString(2131955344);
        A0b.A2e(new C5z1(r02));
        return A0b.A2V();
    }
}
