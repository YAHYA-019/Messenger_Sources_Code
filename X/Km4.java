package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* loaded from: Km4.class */
public final class Km4 {
    public final Paint A00;
    public final L2U A01;
    public final L2U A02;
    public final L2U A03;
    public final L2U A04;
    public final L2U A05;
    public final L2U A06;
    public final L2U A07;

    public Km4(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Kwa.A00(context, K87.class.getCanonicalName(), 2130971080), 6Ld.A0E);
        this.A01 = L2U.A00(context, obtainStyledAttributes.getResourceId(3, 0));
        this.A02 = L2U.A00(context, obtainStyledAttributes.getResourceId(1, 0));
        this.A03 = L2U.A00(context, obtainStyledAttributes.getResourceId(2, 0));
        this.A05 = L2U.A00(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList A00 = L6H.A00(context, obtainStyledAttributes, 6);
        this.A07 = L2U.A00(context, obtainStyledAttributes.getResourceId(8, 0));
        this.A04 = L2U.A00(context, obtainStyledAttributes.getResourceId(7, 0));
        this.A06 = L2U.A00(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint A09 = DKC.A09();
        this.A00 = A09;
        A09.setColor(A00.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
