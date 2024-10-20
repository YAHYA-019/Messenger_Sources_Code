package X;

import java.util.Arrays;
import java.util.TimerTask;

/* renamed from: X.Ddv, reason: case insensitive filesystem */
/* loaded from: Ddv.class */
public final class C2109Ddv extends 5C0 {
    public int A00;
    public TimerTask A01;

    public void A05() {
        TimerTask timerTask = this.A01;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.A01 = null;
        super.A05();
        this.A00 = 0;
    }

    public final 5C4 A0A() {
        5C4 A01 = A01((this.A00 + 1) % ((5C1) this).A04.length);
        if (A01 != null) {
            return A01;
        }
        throw 1BK.A0h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0B() {
        int i = this.A00;
        int i2 = i - 1;
        int length = ((5C1) this).A04.length;
        int i3 = (i2 + length) % length;
        int i4 = (i + 1) % length;
        ((5C0) this).A02++;
        ((5C0) this).A03 = 0;
        boolean[] zArr = ((5C0) this).A0A;
        int i5 = i4 + 1;
        Arrays.fill(zArr, 0, i5, true);
        Arrays.fill(zArr, i5, ((5C0) this).A0C.length, false);
        invalidateSelf();
        A07(i3);
        A03();
        this.A00 = i4;
    }
}
