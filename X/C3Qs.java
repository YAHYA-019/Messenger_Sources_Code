package X;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import com.facebook.inject.FbInjector;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.3Qs, reason: invalid class name */
/* loaded from: 3Qs.class */
public final class C3Qs {
    public 1BY A00;
    public final Context A01 = FbInjector.A00();
    public final C00i A02 = 1BQ.A02(16839);
    public static final int[] A05 = {R.attr.state_selected};
    public static final int[] A03 = {R.attr.state_enabled};
    public static final int[] A04 = StateSet.WILD_CARD;

    public C3Qs(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public JU2 A00(2MQ r302) {
        MigColorScheme migColorScheme = (MigColorScheme) 1Bn.A0E((Context) null, this.A00, 16979);
        Drawable A052 = ((C1u2) this.A02.get()).A05(r302, 2Re.A05);
        int B4h = migColorScheme.B4h();
        int B9O = migColorScheme.B9O();
        6Q6 r0 = new 6Q6();
        r0.A01(A052, Integer.valueOf(B4h), A05);
        int[] iArr = A03;
        Integer valueOf = Integer.valueOf(B9O);
        r0.A01(A052, valueOf, iArr);
        r0.A01(A052, valueOf, A04);
        return new JU2(this.A01.getResources(), r0, migColorScheme.BDl());
    }
}
