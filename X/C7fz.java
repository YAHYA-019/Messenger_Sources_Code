package X;

import android.content.Context;
import android.view.ViewOutlineProvider;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.7fz, reason: invalid class name */
/* loaded from: 7fz.class */
public final class C7fz extends C1rj {
    public 6Kc A00;
    public MigColorScheme A01;
    public String A02;
    public boolean A03;

    public C7fz() {
        super("BannedFromPageHintCardComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, Boolean.valueOf(this.A03), this.A00, this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String str = this.A02;
        MigColorScheme migColorScheme = this.A01;
        boolean z = this.A03;
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A2b();
        A01.A0e();
        A01.A1B(18.0f);
        A01.A1C(24.0f);
        2KD A012 = 2K3.A01(r302, 0);
        A012.A32(false);
        int i = 2131953404;
        if (z) {
            i = 2131953193;
        }
        A012.A2z(r302.A0E(i, new Object[]{str}));
        A012.A2k();
        A012.A2c();
        A012.A2X();
        A012.A2x(migColorScheme);
        4YU.A1K(A01, A012);
        2KD A013 = 2K3.A01(r302, 0);
        A013.A32(false);
        int i2 = 2131953403;
        if (z) {
            i2 = 2131953192;
        }
        A013.A2z(r302.A0E(i2, new Object[]{str}));
        A013.A2i();
        A013.A2c();
        A013.A2X();
        A013.A2x(migColorScheme);
        4YU.A1K(A01, A013);
        8TV A00 = C8ns.A00(r302);
        A00.A0e();
        int i3 = 2131953405;
        if (z) {
            i3 = 2131953194;
        }
        A00.A2Z(r302.A0D(i3));
        4YU.A1N(A00, 2RH.A05);
        A00.A2T(1LI.A09(r302, C7fz.class, "BannedFromPageHintCardComponent", 1446261331));
        A00.A2Y(migColorScheme);
        A01.A2e(A00.A2W());
        A01.A0w(4YU.A00(2RH.A04));
        A01.A1g(ViewOutlineProvider.BOUNDS);
        A01.A1H(migColorScheme.Abp());
        return A01.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        6Kb r0;
        6IS r02;
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 1446261331 || (r02 = (r0 = ((C7fz) r302.A00.A01).A00.A00).A02) == null) {
            return null;
        }
        Context context = r0.A00;
        Context context2 = r02.A03;
        6Su r03 = (6Su) 1Bn.A0E(context2, (1BY) null, 50104);
        ((1Fv) 1Bi.A03(66351)).A04();
        if (r02.A01 == null) {
            return null;
        }
        ThreadSummary threadSummary = r02.A00;
        if (threadSummary == null || !r03.A00(threadSummary)) {
            ((CbV) 1Bn.A0E(context2, (1BY) null, 83004)).A00(context, 4YV.A0D(context), r02.A00, r02.A04, r02.A01);
            return null;
        }
        Object obj2 = ((6Hk) r02).A00;
        if (obj2 == null) {
            return null;
        }
        6Kb r04 = (6Kb) obj2;
        ((7EN) r04.A04.get()).A07(r04.A01, r02.A00, BNT.A0f, r02.A01);
        return null;
    }
}
