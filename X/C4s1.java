package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: X.4s1, reason: invalid class name */
/* loaded from: 4s1.class */
public class C4s1 {
    public DisplayMetrics A00;
    public DisplayMetrics A01;
    public DisplayMetrics A02;
    public DisplayMetrics A03;
    public Display A04;
    public final Context A05;

    public C4s1(Context context) {
        this.A05 = context;
        A01(this, true);
    }

    public static int A01(C4s1 c4s1, boolean z) {
        if (c4s1.A04 == null) {
            c4s1.A04 = ((WindowManager) c4s1.A05.getSystemService("window")).getDefaultDisplay();
        }
        int i = c4s1.A05.getResources().getConfiguration().orientation;
        DisplayMetrics displayMetrics = i == 1 ? c4s1.A02 : c4s1.A00;
        if (c4s1.A04 != null && (z || displayMetrics == null)) {
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            Display display = c4s1.A04;
            display.getClass();
            display.getMetrics(displayMetrics2);
            DisplayMetrics displayMetrics3 = new DisplayMetrics();
            c4s1.A04.getRealMetrics(displayMetrics3);
            if (i != 1) {
                c4s1.A01 = displayMetrics3;
                c4s1.A00 = displayMetrics2;
                return i;
            }
            int i2 = displayMetrics2.widthPixels;
            int i3 = displayMetrics2.heightPixels;
            if (i2 > i3) {
                displayMetrics2.widthPixels = i3;
                displayMetrics2.heightPixels = i2;
                i3 = i2;
            }
            int i4 = displayMetrics3.widthPixels;
            if (i4 > i3) {
                displayMetrics3.widthPixels = displayMetrics3.heightPixels;
                displayMetrics3.heightPixels = i4;
            }
            c4s1.A03 = displayMetrics3;
            c4s1.A02 = displayMetrics2;
        }
        return i;
    }

    public float A02() {
        float f;
        synchronized (this) {
            f = (A01(this, false) == 1 ? this.A02 : this.A00).density;
        }
        return f;
    }

    public int A03() {
        int i;
        synchronized (this) {
            i = (A01(this, false) == 1 ? this.A03 : this.A01).heightPixels;
        }
        return i;
    }

    public int A04() {
        int i;
        synchronized (this) {
            i = (A01(this, false) == 1 ? this.A03 : this.A01).widthPixels;
        }
        return i;
    }

    public int A05() {
        int i;
        synchronized (this) {
            i = (A01(this, false) == 1 ? this.A02 : this.A00).densityDpi;
        }
        return i;
    }

    public int A06() {
        int i;
        synchronized (this) {
            i = (A01(this, false) == 1 ? this.A02 : this.A00).heightPixels;
        }
        return i;
    }

    public int A07() {
        int max;
        synchronized (this) {
            max = Math.max(A08(), A06());
        }
        return max;
    }

    public int A08() {
        int i;
        synchronized (this) {
            i = (A01(this, false) == 1 ? this.A02 : this.A00).widthPixels;
        }
        return i;
    }

    public int A09() {
        int min;
        synchronized (this) {
            min = Math.min(A08(), A06());
        }
        return min;
    }
}
