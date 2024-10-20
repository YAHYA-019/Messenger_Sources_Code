package X;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* loaded from: Jwi.class */
public abstract class Jwi extends Jwf {
    public final float A00;
    public final int A01;
    public final int A02;

    public Jwi(DisplayMetrics displayMetrics, int i, int i2, int i3) {
        super(displayMetrics, i + 1);
        this.A02 = 4;
        this.A01 = i2;
        ((LJo) this).A01 = i3;
        this.A00 = TypedValue.applyDimension(2, 23.0f, displayMetrics);
    }

    public static String A00(Jwi jwi) {
        int i = jwi.A02;
        StringBuilder A0k = AnonymousClass001.A0k();
        int i2 = jwi.A01;
        if (i == 4) {
            A0k.append(i2);
        } else {
            StringBuilder A0k2 = AnonymousClass001.A0k();
            while (i2 > 0) {
                int i3 = i2 - 1;
                A0k2.append((char) ((i3 % 26) + 97));
                i2 = i3 / 26;
            }
            A0k2.reverse();
            1BK.A1R(A0k, A0k2);
        }
        return AnonymousClass001.A0d(".", A0k);
    }
}
