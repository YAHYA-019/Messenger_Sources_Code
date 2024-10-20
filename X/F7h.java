package X;

import android.content.Context;

/* loaded from: F7h.class */
public final class F7h {
    public final int A00;
    public final int A01;
    public final 2MR A02;

    public F7h(int i, int i2) {
        this.A02 = null;
        this.A01 = i;
        this.A00 = i2;
    }

    public F7h(2MR r302) {
        11T.A0F(r302, 1);
        this.A02 = r302;
        this.A01 = 0;
        this.A00 = 0;
    }

    public final int A00(Context context) {
        2MR r0 = this.A02;
        if (r0 != null) {
            return 7zM.A02(context, r0);
        }
        return EVf.A00(context, 2Mg.A00) ? this.A00 : this.A01;
    }
}
