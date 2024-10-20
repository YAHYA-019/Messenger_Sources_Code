package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;

/* loaded from: Fz5.class */
public final class Fz5 implements Cloneable {
    public int A0F;
    public int A0G;
    public int A0I;
    public int A0J;
    public int A0L;
    public ColorStateList A0R;
    public Typeface A0S;
    public TextUtils.TruncateAt A0T;
    public 2K8 A0U;
    public CharSequence A0Y;
    public String A0Z;
    public boolean A0c;
    public boolean A0a = true;
    public int A0K = -1;
    public int A0H = -1;
    public int A0M = 0;
    public float A08 = 0.0f;
    public float A06 = 0.0f;
    public float A07 = 0.0f;
    public int A0N = -7829368;
    public boolean A0b = false;
    public int A0O = -16777216;
    public int A0E = -16776961;
    public int A0P = -1;
    public float A05 = 0.0f;
    public float A03 = Float.MAX_VALUE;
    public float A04 = 1.0f;
    public float A02 = 0.0f;
    public int A0Q = Typeface.DEFAULT.getStyle();
    public ELv A0V = ELv.A07;
    public int A09 = -1;
    public int A0C = 0;
    public int A0D = 0;
    public EL4 A0X = EL4.A03;
    public int A0A = 0;
    public int A0B = 0;
    public boolean A0d = false;
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public EmE A0W = null;

    public Fz5() {
        int i = (-1) << (-1);
        this.A0L = i;
        int i2 = (-1) >>> 1;
        this.A0I = i2;
        this.A0J = i2;
        this.A0F = i;
        this.A0G = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.Fz5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.Fz5] */
    public static Fz5 A00(Context context) {
        ?? A01 = FGZ.A01(context);
        try {
            A01 = (Fz5) super.clone();
            A01.A0d = true;
            A01.A0A = 0;
            return A01;
        } catch (CloneNotSupportedException unused) {
            throw AnonymousClass001.A0U(A01);
        }
    }

    public static void A01(Fz5 fz5, Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            fz5.A0V = intValue != 1 ? (intValue == 8388611 || intValue != 8388613) ? ELv.A07 : ELv.A06 : ELv.A01;
        }
    }
}
