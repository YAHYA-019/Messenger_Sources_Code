package X;

import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: A2f.class */
public final class A2f implements C2lr {
    public final float A00;
    public final MigColorScheme A01;

    public A2f(MigColorScheme migColorScheme, float f) {
        11T.A0F(migColorScheme, 2);
        this.A00 = f;
        this.A01 = migColorScheme;
    }

    @Override // X.C2lr
    public boolean BSE(C2lr c2lr) {
        return 7zR.A1Z(c2lr, this);
    }

    public /* bridge */ /* synthetic */ boolean BSF(Object obj) {
        return 7zR.A1Z(obj, this);
    }

    @Override // X.C2lr
    public C2m0 BY9(C2ly c2ly, long j) {
        11T.A0F(c2ly, 0);
        A2J a2j = new A2J(this.A01);
        11T.A0F(C29N.A00, 3);
        View view = (View) a2j.A7y(c2ly.A00.A04);
        view.measure(26N.A01(j), 26N.A00(j));
        return new C2m0((int) this.A00, Math.max(C26P.A02(j), view.getMeasuredHeight()), null);
    }
}
