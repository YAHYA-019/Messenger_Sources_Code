package X;

import android.os.Looper;
import android.os.Message;

/* renamed from: X.0vf, reason: invalid class name */
/* loaded from: 0vf.class */
public final class C0vf implements 0Wr {
    public final 0Wr[] A00;

    public C0vf(0Wr... r302) {
        this.A00 = r302;
    }

    public void AT4(Message message) {
        0Wr[] r0 = this.A00;
        int length = r0.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            r0[i2].AT4(message);
            i = i2 + 1;
        }
    }

    public void AT7() {
        0Wr[] r0 = this.A00;
        int length = r0.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            r0[i2].AT7();
            i = i2 + 1;
        }
    }

    public void D1b(Message message) {
        0Wr[] r0 = this.A00;
        int length = r0.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            r0[i2].D1b(message);
            i = i2 + 1;
        }
    }

    public void D1n(Looper looper, String str) {
        0Wr[] r0 = this.A00;
        int length = r0.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            r0[i2].D1n(looper, str);
            i = i2 + 1;
        }
    }

    public void D1x() {
        0Wr[] r0 = this.A00;
        int length = r0.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            r0[i2].D1x();
            i = i2 + 1;
        }
    }
}
