package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.64k, reason: invalid class name */
/* loaded from: 64k.class */
public final class C64k {
    public final C00i A00;
    public final 1Br A01;
    public final 1Br A02;

    public C64k(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A01 = 1Bq.A00(49956);
        this.A02 = 1Bq.A00(32769);
        this.A00 = 1Lm.A01(fbUserSession, 49957);
    }

    public static final int A00(Context context, int i, int i2, long j, boolean z) {
        11T.A0F(context, 0);
        int max = Math.max(C0A8.A00(context, 100.0f), i2);
        if (i > 0) {
            if (j == -1) {
                j = 0;
            }
            int pow = ((int) ((1.0d - Math.pow(10.0d, (Math.max(4000.0f, (float) j) / 1000.0d) / (-55.0d))) * (i - max))) + max;
            if (z) {
                pow += (int) context.getResources().getDimension(2132279378);
            }
            max = Math.min(Math.max(max, pow), i);
        }
        return max;
    }
}
