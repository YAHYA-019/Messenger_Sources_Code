package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: X.JhD, reason: case insensitive filesystem */
/* loaded from: JhD.class */
public final class C3044JhD extends L94 {
    public String A00;

    @Override // X.L94
    public void A04(Context context, AttributeSet attributeSet) {
        super.A04(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, KcU.A01);
        11T.A0A(obtainAttributes);
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.A00 = string;
        }
        obtainAttributes.recycle();
    }

    @Override // X.L94
    public boolean equals(Object obj) {
        return this == obj || (obj != null && (obj instanceof C3044JhD) && super.equals(obj) && 11T.A0O(this.A00, ((C3044JhD) obj).A00));
    }

    @Override // X.L94
    public int hashCode() {
        return (super.hashCode() * 31) + 1BL.A06(this.A00);
    }

    @Override // X.L94
    public String toString() {
        String l94 = super.toString();
        String str = this.A00;
        if (str == null) {
            str = "null";
        }
        String A0j = 0Pz.A0j(l94, " class=", str);
        11T.A0A(A0j);
        return A0j;
    }
}
