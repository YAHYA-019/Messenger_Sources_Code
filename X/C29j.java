package X;

import android.graphics.Rect;

/* renamed from: X.29j, reason: invalid class name */
/* loaded from: 29j.class */
public final class C29j {
    public boolean A00;
    public Rect A01;
    public final int A02;
    public final long A03;
    public final Rect A04;
    public final C29j A05;

    public C29j(Rect rect, C29j c29j, int i, long j, boolean z) {
        this.A03 = j;
        this.A02 = i;
        this.A04 = new Rect(rect);
        this.A05 = c29j;
        this.A00 = z;
        if (c29j != null) {
            A01(this, c29j);
        }
    }

    public static void A00(C29j c29j) {
        if (c29j.A01 == null) {
            c29j.A01 = new Rect(c29j.A04);
        }
    }

    public static void A01(C29j c29j, C29j c29j2) {
        if (c29j2 != null) {
            Rect rect = c29j.A04;
            Rect rect2 = c29j2.A04;
            boolean z = false;
            if (c29j.A00) {
                c29j2.A00 = true;
                z = true;
            }
            if (rect.top < rect2.top) {
                A00(c29j2);
                rect2.top = rect.top;
                z = true;
            }
            if (rect.bottom > rect2.bottom) {
                A00(c29j2);
                rect2.bottom = rect.bottom;
                z = true;
            }
            if (rect.left < rect2.left) {
                A00(c29j2);
                rect2.left = rect.left;
                z = true;
            }
            if (rect.right > rect2.right) {
                A00(c29j2);
                rect2.right = rect.right;
            } else if (!z) {
                return;
            }
            A01(c29j2, c29j2.A05);
        }
    }
}
