package androidx.preference;

import X.JR1;
import X.KdO;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* loaded from: DialogPreference.class */
public abstract class DialogPreference extends Preference {
    public int A00;
    public Drawable A01;
    public CharSequence A02;
    public CharSequence A03;
    public CharSequence A04;
    public CharSequence A05;

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, JR1.A0Y(context, 2130969352).resourceId != 0 ? 2130969352 : 16842897);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, KdO.A02, i, 0);
        String A0t = JR1.A0t(obtainStyledAttributes, 9, 0);
        this.A03 = A0t;
        if (A0t == null) {
            this.A03 = this.A0D;
        }
        this.A02 = JR1.A0t(obtainStyledAttributes, 8, 1);
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.A01 = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        this.A05 = JR1.A0t(obtainStyledAttributes, 11, 3);
        this.A04 = JR1.A0t(obtainStyledAttributes, 10, 4);
        this.A00 = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }
}
