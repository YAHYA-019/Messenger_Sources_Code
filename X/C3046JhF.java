package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: X.JhF, reason: case insensitive filesystem */
/* loaded from: JhF.class */
public final class C3046JhF extends L94 implements MBv {
    public String A00;

    @Override // X.L94
    public void A04(Context context, AttributeSet attributeSet) {
        super.A04(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, KcU.A00);
        11T.A0A(obtainAttributes);
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.A00 = string;
        }
        obtainAttributes.recycle();
    }

    @Override // X.L94
    public boolean equals(Object obj) {
        return this == obj || (obj != null && (obj instanceof C3046JhF) && super.equals(obj) && 11T.A0O(this.A00, ((C3046JhF) obj).A00));
    }

    @Override // X.L94
    public int hashCode() {
        return (super.hashCode() * 31) + 1BL.A06(this.A00);
    }
}
