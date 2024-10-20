package X;

import android.graphics.drawable.Animatable;

/* renamed from: X.Gfq, reason: case insensitive filesystem */
/* loaded from: Gfq.class */
public final class C2510Gfq extends 4gM {
    public long A00 = -1;
    public final JCo A01;

    public C2510Gfq(JCo jCo) {
        this.A01 = jCo;
    }

    public void Byc(Animatable animatable, Object obj, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        GSk gSk = this.A01;
        if (gSk != null) {
            long j = currentTimeMillis - this.A00;
            GSk gSk2 = gSk;
            gSk2.A07 = j;
            gSk2.invalidateSelf();
        }
    }

    public void COC(String str, Object obj) {
        this.A00 = System.currentTimeMillis();
    }
}
