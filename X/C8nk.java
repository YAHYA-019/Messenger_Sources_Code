package X;

import android.content.Context;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8nk, reason: invalid class name */
/* loaded from: 8nk.class */
public final class C8nk extends C1rj {
    public static final C1rp A04 = C1rp.CENTER;
    public int A00;
    public int A01;
    public MigColorScheme A02;
    public C1rp A03;

    public C8nk() {
        super("MigSectionLoadingProgress");
        this.A03 = A04;
        this.A01 = -1;
    }

    public static 8TA A00(1Iw r301) {
        return new 8TA(r301, new C8nk());
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A03, Integer.valueOf(this.A00), Integer.valueOf(this.A01), 7zN.A0h()};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A02;
        int i = this.A01;
        C1rp c1rp = this.A03;
        int i2 = this.A00;
        Context context = r302.A0D;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2RH.A04.sizeRes);
        if (i == -1) {
            i = C0A8.A00(context, 24.0f);
        }
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A0S();
        A01.A2f(C1ro.FLEX_START);
        A01.A2h(c1rp);
        A01.A2b();
        A01.A2C(C26z.VERTICAL, dimensionPixelSize);
        8Tj A00 = C8m4.A00(r302);
        A00.A2Z(migColorScheme);
        A00.A01.A01 = i;
        A00.A2Y(i2);
        return 7zL.A0U(A01, A00);
    }
}
