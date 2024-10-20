package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: X.Dex, reason: case insensitive filesystem */
/* loaded from: Dex.class */
public final class C2141Dex extends DP9 {
    public Integer A00;

    public C2141Dex() {
        super(-2, -2);
        ((DP9) this).A00 = -1;
        this.A00 = 0S2.A0N;
    }

    public C2141Dex(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 0S2.A0N;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0T);
        this.A00 = 0S2.A00(4)[obtainStyledAttributes.getInt(0, 3)];
        obtainStyledAttributes.recycle();
    }
}
