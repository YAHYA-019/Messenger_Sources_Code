package X;

import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9zd, reason: invalid class name */
/* loaded from: 9zd.class */
public final class C9zd implements C1sy {
    public final int A00;
    public final Object A01;

    public C9zd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C1sy
    public final void CfN() {
        String str;
        Object value;
        8Lu r0;
        switch (this.A00) {
            case 0:
                8HA r02 = (8HA) this.A01;
                r02.A07 = 7zS.A0j(r02);
                if (r02.A00 == 0) {
                    8HA.A07(r02, 1BK.A0b());
                    return;
                } else {
                    8HA.A06(r02);
                    return;
                }
            case 1:
                8Gf r03 = (8Gf) this.A01;
                MigColorScheme migColorScheme = (MigColorScheme) 7zO.A0l(r03, 16979);
                MigColorScheme migColorScheme2 = r03.A0K;
                if (migColorScheme2 != null) {
                    if (migColorScheme2.equals(migColorScheme)) {
                        return;
                    }
                    r03.A0K = migColorScheme;
                    8Gf.A06(r03);
                    return;
                }
                str = "userColorScheme";
                break;
            case 2:
                8GR r04 = (8GR) this.A01;
                View view = r04.mView;
                str = "colorScheme";
                if (view != null) {
                    MigColorScheme migColorScheme3 = r04.A05;
                    if (migColorScheme3 != null) {
                        MigColorScheme.A00(view, migColorScheme3);
                    }
                }
                2SP r05 = r04.A02;
                if (r05 == null) {
                    str = "jewelDataProvider";
                    break;
                } else {
                    MigColorScheme migColorScheme4 = r04.A05;
                    if (migColorScheme4 != null) {
                        r05.A04 = migColorScheme4;
                        0Xs r06 = ((8DA) r04.A09.getValue()).A01;
                        do {
                            value = r06.getValue();
                            r0 = (8Lu) value;
                        } while (!r06.AGt(value, 8Lu.A00((ImmutableList) r0.A00, (Integer) r0.A01)));
                        return;
                    }
                }
                break;
            default:
                ((6tW) ((8GW) this.A01).A0A.get()).A02();
                return;
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
