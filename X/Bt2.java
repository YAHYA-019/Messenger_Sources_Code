package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Bt2.class */
public final class Bt2 {
    public final 1Br A00;
    public final CMJ A01;
    public final MigColorScheme A02;
    public final 1Br A03;

    public Bt2(Context context, MigColorScheme migColorScheme) {
        this.A02 = migColorScheme;
        1Br A00 = 1Bu.A00(1014);
        this.A03 = A00;
        C1F6 c1f6 = (C1F6) A00.get();
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            CMJ cmj = new CMJ(context, migColorScheme);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A01 = cmj;
            this.A00 = 1Bq.A00(115034);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
