package androidx.constraintlayout.widget;

import X.5Wi;
import X.5Wl;
import X.5XG;
import X.AnonymousClass001;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: Barrier.class */
public class Barrier extends 5Wl {
    public int A00;
    public 5XG A01;

    /* JADX WARN: Multi-variable type inference failed */
    public Barrier(Context context) {
        super(context);
        ((5Wl) this).A05 = new int[32];
        ((5Wl) this).A04 = AnonymousClass001.A0u();
        ((5Wl) this).A01 = context;
        A07((AttributeSet) null);
        super/*android.view.View*/.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((5Wl) this).A05 = new int[32];
        ((5Wl) this).A04 = AnonymousClass001.A0u();
        ((5Wl) this).A01 = context;
        A07(attributeSet);
        super/*android.view.View*/.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((5Wl) this).A05 = new int[32];
        ((5Wl) this).A04 = AnonymousClass001.A0u();
        ((5Wl) this).A01 = context;
        A07(attributeSet);
        super/*android.view.View*/.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A07(AttributeSet attributeSet) {
        super.A07(attributeSet);
        this.A01 = new 5XG();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, 5Wi.A01);
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= indexCount) {
                    break;
                }
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 26) {
                    this.A00 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 25) {
                    this.A01.A02 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.A01.A01 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
                i = i2 + 1;
            }
            obtainStyledAttributes.recycle();
        }
        ((5Wl) this).A02 = this.A01;
        A06();
    }
}
