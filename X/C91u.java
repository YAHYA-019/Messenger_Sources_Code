package X;

import android.content.Intent;
import java.util.List;

/* renamed from: X.91u, reason: invalid class name */
/* loaded from: 91u.class */
public final class C91u extends C5ij {
    public final /* synthetic */ 82C A00;

    public C91u(82C r302) {
        this.A00 = r302;
    }

    @Override // X.C5ij, X.C1ph
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1337) {
            82C r0 = this.A00;
            2Ov r02 = r0.A03;
            if (r02.A0D) {
                2Ov.A0D(this, r02);
            } else {
                synchronized (r02.A07) {
                    if (r02.A0D) {
                        2Ov.A0D(this, r02);
                    } else {
                        List list = r02.A03;
                        if (list != null) {
                            list.remove(this);
                        }
                    }
                }
            }
            if (i2 == -1) {
                82C.A00(intent, r0);
            }
        }
    }
}
