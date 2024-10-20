package X;

import android.graphics.Rect;

/* loaded from: I3b.class */
public final class I3b {
    public Rect A00;
    public boolean A02;
    public static final HX9 A08 = new HX9(1);
    public static final HX9 A04 = new HX9(2);
    public static final HX9 A07 = new HX9(3);
    public static final HX9 A06 = new HX9(4);
    public static final HX9 A05 = new HX9(5);
    public boolean A01 = false;
    public boolean A03 = true;

    public Object A00(HX9 hx9) {
        int i = hx9.A00;
        if (i != 1) {
            return Boolean.valueOf(i != 2 ? i != 3 ? i != 4 ? false : this.A02 : this.A03 : this.A01);
        }
        return this.A00;
    }

    public void A01(HX9 hx9, Object obj) {
        int i = hx9.A00;
        if (i == 1) {
            this.A00 = (Rect) obj;
            return;
        }
        if (i == 2) {
            this.A01 = AnonymousClass001.A1V(obj);
        } else if (i != 3) {
            this.A02 = AnonymousClass001.A1V(obj);
        } else {
            this.A03 = AnonymousClass001.A1V(obj);
        }
    }
}
