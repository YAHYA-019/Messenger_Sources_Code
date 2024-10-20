package X;

import android.graphics.drawable.Drawable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.8d7, reason: invalid class name */
/* loaded from: 8d7.class */
public final class C8d7 extends 1LH {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final ThreadKey A04;
    public final C2mr A05;
    public final boolean A06;

    public C8d7(ThreadKey threadKey, C2mr c2mr, int i, int i2, long j, long j2, boolean z) {
        1BL.A1G(threadKey, c2mr);
        this.A01 = i;
        this.A00 = i2;
        this.A02 = j;
        this.A03 = j2;
        this.A04 = threadKey;
        this.A05 = c2mr;
        this.A06 = z;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        Drawable drawable = (Drawable) AQs.A01(c2k5, this, new Object[]{Long.valueOf(this.A02)}, 5);
        2lQ r0 = 2lO.A02;
        2lO A0Z = 7zQ.A0Z((2lO) null, 0S2.A00, AV5.A00(this, c2k5, 35));
        C2sn A0L = 7zR.A0L(c2k5);
        C2cq A0V = 7zP.A0V(drawable, A0L, 0);
        A0V.A0s(drawable.getIntrinsicWidth());
        A0V.A0r(20.0f);
        7zN.A1O(A0L, A0V);
        return C2so.A02(A0L, c2k5, A0Z);
    }
}
