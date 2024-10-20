package X;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: X.0uv, reason: invalid class name */
/* loaded from: 0uv.class */
public final class C0uv implements 0Wr {
    public final int A00;
    public final 0Wp A01 = new 0Wp();

    public C0uv(int i) {
        this.A00 = i;
    }

    public void AT4(Message message) {
        0Wp r305;
        int i = this.A00;
        if (i == 1) {
            r305 = this.A01;
        } else {
            if (i != 2) {
                return;
            }
            r305 = this.A01;
            r305.A03();
        }
        r305.A05 = SystemClock.uptimeMillis();
        r305.A04 = SystemClock.currentThreadTimeMillis();
    }

    public void AT7() {
        0Wp r304;
        int i = this.A00;
        if (i == 1) {
            r304 = this.A01;
        } else {
            if (i != 2) {
                return;
            }
            r304 = this.A01;
            r304.A03();
        }
        r304.A05 = SystemClock.uptimeMillis();
        r304.A04 = SystemClock.currentThreadTimeMillis();
    }

    public void D1b(Message message) {
        0Wp r303;
        11T.A0F(message, 0);
        int i = this.A00;
        if (i == 1) {
            r303 = this.A01;
        } else {
            if (i != 2) {
                return;
            }
            r303 = this.A01;
            r303.A04(message);
        }
        r303.A02();
    }

    public void D1n(Looper looper, String str) {
    }

    public void D1x() {
        0Wp r304;
        int i = this.A00;
        if (i == 1) {
            r304 = this.A01;
        } else {
            if (i != 2) {
                return;
            }
            r304 = this.A01;
            r304.A0A = true;
        }
        r304.A02();
    }
}
