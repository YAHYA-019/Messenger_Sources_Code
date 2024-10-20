package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.75h, reason: invalid class name */
/* loaded from: 75h.class */
public final class C75h implements 74E {
    public final 74E[] A00;

    public C75h(74E... r302) {
        this.A00 = r302;
    }

    public boolean BQh(5vW r302) {
        11T.A0F(r302, 0);
        74E[] r0 = this.A00;
        int length = r0.length;
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                break;
            }
            if (r0[i2].BQh(r302)) {
                z = true;
                break;
            }
            i = i2 + 1;
        }
        return z;
    }

    public void BoE(Context context, View view, 5vW r304) {
        11T.A0F(context, 0);
        11T.A0F(view, 1);
        11T.A0F(r304, 2);
        74E[] r0 = this.A00;
        int length = r0.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            74E r02 = r0[i2];
            if (r02.BQh(r304)) {
                r02.BoE(context, view, r304);
                return;
            }
            i = i2 + 1;
        }
    }
}
