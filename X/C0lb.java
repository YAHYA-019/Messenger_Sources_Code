package X;

import java.io.File;

/* renamed from: X.0lb, reason: invalid class name */
/* loaded from: 0lb.class */
public final class C0lb {
    public File A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final 0So A04 = new 0jS(this);

    public C0lb(String str) {
        this.A01 = str;
    }

    public File A00() {
        File file;
        synchronized (this) {
            file = this.A00;
        }
        return file;
    }

    public void A01() {
        synchronized (this) {
            if (!this.A03) {
                0Gw A00 = 0Gw.A00();
                this.A03 = true;
                if (this.A02) {
                    File file = this.A00;
                    if (file != null) {
                        A00.A03.A05(file, true);
                        A00.A09();
                    }
                }
            }
        }
    }

    public void A02(long j) {
        synchronized (this) {
            long nanoTime = System.nanoTime() + (j * 1000000);
            while (!this.A02) {
                long nanoTime2 = nanoTime - System.nanoTime();
                if (nanoTime2 <= 0) {
                    break;
                } else {
                    wait(nanoTime2);
                }
            }
        }
    }
}
