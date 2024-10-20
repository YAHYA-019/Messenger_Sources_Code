package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Gg9, reason: case insensitive filesystem */
/* loaded from: Gg9.class */
public final class C2525Gg9 extends IRQ {
    public final int A00;
    public final Object A01;

    public C2525Gg9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C3t() {
        switch (this.A00) {
            case 0:
                I2x i2x = (I2x) this.A01;
                ImmutableList immutableList = i2x.A01;
                if (immutableList == null) {
                    I2x.A00(i2x, immutableList);
                    immutableList = ImmutableList.of();
                }
                I2x.A00(i2x, immutableList);
                return;
            case 1:
                DKC.A1I((Context) this.A01, "Effects refreshed", 1);
                return;
            case 2:
                ((IMJ) this.A01).A07();
                return;
            default:
                IML iml = (IML) this.A01;
                IML.A03(iml.A0D(), iml);
                return;
        }
    }
}
