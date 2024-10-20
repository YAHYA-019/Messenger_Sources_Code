package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: B4w.class */
public final class B4w extends H4B {
    public 06Z A00;
    public 6Qb A01;
    public BId A02;
    public MigColorScheme A03;
    public final 1Br A04;
    public final LithoView A05;

    public B4w(Context context) {
        super(context, null, 0);
        this.A04 = 7zM.A0f(context);
        BId bId = new BId(context);
        this.A02 = bId;
        View findViewById = bId.findViewById(2131362708);
        11T.A0A(findViewById);
        LithoView lithoView = (LithoView) findViewById;
        this.A05 = lithoView;
        this.A03 = 7zQ.A0m(this.A04);
        A00();
        View view = this.A02;
        ((BId) view).A01 = new AKO(this, 42);
        A0c(view, lithoView);
    }

    private final void A00() {
        LithoView lithoView = this.A05;
        1Iw r0 = lithoView.A09;
        Resources A0E = 4YU.A0E(r0);
        C9lC A00 = C9lC.A00();
        A00.A03 = 4YU.A0t(A0E, 2131953272);
        MigColorScheme migColorScheme = this.A03;
        11T.A0F(migColorScheme, 0);
        A00.A01 = migColorScheme;
        C5z2 A002 = Cx1.A00(A00, this, 28);
        C5yw A003 = C5yv.A00(r0);
        A003.A2b(this.A03);
        A003.A2a(2131953273);
        A003.A2c(2MG.A04);
        CxE.A01(A003, this, 70);
        A003.A2e(A002);
        A003.A2i(true);
        AbH.A1R(lithoView, A003);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(B4w b4w) {
        6Qa r0;
        6fA r02;
        if (b4w.A00 == null || (r0 = b4w.A01) == null || (r02 = r0.A00.A0H) == null) {
            return;
        }
        long j = r02.A02.A02;
        DKT A0P = 7zQ.A0P();
        CP0 A00 = CP0.A00("com.bloks.www.bloks.biim.order_creation");
        A00.A05("buyer_id", String.valueOf(j));
        Context A08 = 4YU.A08(b4w);
        06Z r03 = b4w.A00;
        if (r03 == null) {
            11T.A0L("fragmentManager");
            throw 0Q8.createAndThrow();
        }
        DKT.A04(A08, r03, A0P, A00.A03(), 90);
    }

    @Override // X.H4B
    public void A0f(MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 0);
        super.A0f(migColorScheme);
        if (migColorScheme.equals(this.A03)) {
            return;
        }
        this.A03 = migColorScheme;
        BId bId = this.A02;
        if (!migColorScheme.equals(bId.A00)) {
            bId.A00 = migColorScheme;
            BId.A00(bId);
        }
        A00();
    }
}
