package X;

import android.content.Context;
import android.util.DisplayMetrics;
import com.facebook.inject.FbInjector;

/* renamed from: X.9fq, reason: invalid class name */
/* loaded from: 9fq.class */
public final class C9fq {
    public int A00;
    public int A01;
    public int A02;
    public final Context A03;

    public C9fq() {
        Context A00 = FbInjector.A00();
        this.A03 = A00;
        A00.getResources().getDimensionPixelSize(2132279345);
        DisplayMetrics A0I = 7zO.A0I(A00);
        int i = A0I.widthPixels;
        this.A02 = i;
        this.A01 = A0I.heightPixels;
        this.A00 = i;
    }

    public static final void A00(C9fq c9fq) {
        Context context = c9fq.A03;
        DisplayMetrics A0I = 7zO.A0I(context);
        if (c9fq.A02 == A0I.widthPixels && c9fq.A01 == A0I.heightPixels) {
            return;
        }
        context.getResources().getDimensionPixelSize(2132279345);
        DisplayMetrics A0I2 = 7zO.A0I(context);
        int i = A0I2.widthPixels;
        c9fq.A02 = i;
        c9fq.A01 = A0I2.heightPixels;
        c9fq.A00 = i;
    }
}
