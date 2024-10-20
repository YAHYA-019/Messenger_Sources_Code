package X;

import android.graphics.drawable.Drawable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: X.5i6, reason: invalid class name */
/* loaded from: 5i6.class */
public final class C5i6 extends C5i7 {
    public final C26n A00 = new C26n();
    public final C2jo A01;

    public C5i6(C26n c26n, C2jo c2jo) {
        A00(c26n, this);
        this.A01 = c2jo;
    }

    public static void A00(C26n c26n, C5i6 c5i6) {
        C26n c26n2 = c5i6.A00;
        int i = 0;
        while (true) {
            int i2 = i;
            Object[] objArr = c26n2.A01;
            if (i2 >= 5) {
                break;
            }
            objArr[i2] = null;
            i = i2 + 1;
        }
        c26n2.A00 = (short) 0;
        if (c26n != null) {
            short s = c26n.A00;
            for (int i3 = 0; i3 < s; i3++) {
                c26n2.A03(c26n.A01(i3), new WeakReference(c26n.A01[c26n.A01(i3)]));
            }
        }
    }

    public static void A01(C5i6 c5i6, float f) {
        Object obj;
        C26n c26n = c5i6.A00;
        short s = c26n.A00;
        for (int i = 0; i < s; i++) {
            Reference reference = (Reference) c26n.A01[c26n.A01(i)];
            if (reference != null && (obj = reference.get()) != null) {
                if ((obj instanceof Drawable) && ((Drawable) obj).getCallback() == null) {
                    reference.clear();
                } else {
                    c5i6.A01.ClN(obj, f);
                }
            }
        }
    }
}
