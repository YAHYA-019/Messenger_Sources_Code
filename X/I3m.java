package X;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: I3m.class */
public final class I3m {
    public static final QzJ A06 = new QzJ();
    public static final C0dp A07 = new RnM();
    public int A00;
    public Queue A01;
    public final int A02;
    public final int A03;
    public final QzJ A04;
    public final C0dp A05;

    public I3m(int i, int i2) {
        C0dp c0dp = A07;
        QzJ qzJ = A06;
        this.A03 = i;
        this.A02 = i2;
        this.A05 = c0dp;
        this.A04 = qzJ;
        synchronized (this) {
            this.A01 = new ArrayDeque();
            this.A00 = 0;
        }
    }

    public void A00(String str) {
        Queue queue;
        synchronized (this) {
            int i = this.A02;
            while (true) {
                queue = this.A01;
                if (queue.size() + 1 <= i) {
                    break;
                }
                this.A00 -= ((RQp) queue.remove()).A01.length();
            }
            int i2 = this.A03;
            if (str.length() > i2) {
                str = "overly large log entry skipped";
            }
            while (this.A00 + str.length() > i2) {
                this.A00 -= ((RQp) queue.remove()).A01.length();
            }
            RQp rQp = new RQp(this.A04, str, this.A05.now());
            queue.offer(rQp);
            this.A00 += rQp.A01.length();
        }
    }

    public String toString() {
        String obj;
        synchronized (this) {
            int i = this.A00;
            Queue<RQp> queue = this.A01;
            StringBuilder sb = new StringBuilder(i + (queue.size() * 30));
            boolean z = true;
            for (RQp rQp : queue) {
                if (z) {
                    z = false;
                } else {
                    sb.append('\n');
                }
                sb.append(rQp);
            }
            obj = sb.toString();
        }
        return obj;
    }
}
