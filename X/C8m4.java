package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.8m4, reason: invalid class name */
/* loaded from: 8m4.class */
public final class C8m4 extends C1rj {
    public int A00;
    public int A01;
    public MigColorScheme A02;

    public C8m4() {
        super("MigLoadingProgress");
        this.A01 = -1;
    }

    public static 8Tj A00(1Iw r301) {
        return new 8Tj(r301, new C8m4());
    }

    public final Object[] A0k() {
        return 1BK.A1a(this.A02, Integer.valueOf(this.A00), this.A01);
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        float f = 0.0f / 0.0f;
        if (i == -1) {
            i = C0A8.A00(r302.A0D, 50.0f);
        }
        if (i2 == 0) {
            i2 = migColorScheme.AZc();
        }
        8SU r0 = new 8SU(r302, new 8jO());
        8jO r02 = r0.A01;
        r02.A01 = i;
        BitSet bitSet = r0.A02;
        bitSet.set(1);
        r02.A00 = i2;
        bitSet.set(0);
        return r0.A2W();
    }
}
