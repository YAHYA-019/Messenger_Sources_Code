package X;

import java.lang.ref.WeakReference;

/* renamed from: X.4D5, reason: invalid class name */
/* loaded from: 4D5.class */
public final class C4D5 implements 0J1 {
    public 1Up A00;

    public C4D5() {
        this.A00 = null;
        synchronized (this) {
            if (this.A00 == null) {
                this.A00 = new 1Up(40);
                C0ft.A03(this);
            }
        }
    }

    public void A00(StringBuilder sb) {
        synchronized (this) {
            1Up r0 = this.A00;
            if (r0 != null) {
                boolean z = true;
                int i = 0;
                while (true) {
                    if (i >= r0.A00()) {
                        break;
                    }
                    if (!z) {
                        sb.append(',');
                    }
                    sb.append((String) r0.A02(i));
                    i++;
                    z = false;
                }
            }
        }
    }

    public boolean A01() {
        long j;
        C0fk c0fk = C0ft.A04 == null ? null : C0ft.A04.A02;
        boolean z = false;
        if (c0fk != null) {
            synchronized (c0fk) {
                try {
                    j = c0fk.A02;
                } finally {
                    C0fk c0fk2 = c0fk;
                }
            }
            if (j > 0) {
                z = true;
            }
        }
        return z;
    }

    public /* synthetic */ void Bw1(String str, String str2, WeakReference weakReference) {
        synchronized (this) {
            1Up r0 = this.A00;
            if (r0 != null) {
                r0.A04(str2);
            }
        }
    }
}
