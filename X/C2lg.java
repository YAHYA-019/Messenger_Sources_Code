package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: X.2lg, reason: invalid class name */
/* loaded from: 2lg.class */
public class C2lg extends ViewGroup.MarginLayoutParams {
    public boolean A00;
    public boolean A01;
    public final Rect A02;
    public C2lb mViewHolder;

    public C2lg(int i, int i2) {
        super(i, i2);
        this.A02 = new Rect();
        this.A00 = true;
        this.A01 = false;
    }

    public C2lg(C2lg c2lg) {
        super((ViewGroup.LayoutParams) c2lg);
        this.A02 = new Rect();
        this.A00 = true;
        this.A01 = false;
    }

    public C2lg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = new Rect();
        this.A00 = true;
        this.A01 = false;
    }

    public C2lg(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A02 = new Rect();
        this.A00 = true;
        this.A01 = false;
    }

    public C2lg(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.A02 = new Rect();
        this.A00 = true;
        this.A01 = false;
    }

    public int A00() {
        C2lb c2lb = this.mViewHolder;
        int i = c2lb.A05;
        if (i == -1) {
            i = c2lb.A04;
        }
        return i;
    }

    public boolean A01() {
        boolean z = false;
        if ((this.mViewHolder.A00 & 2) != 0) {
            z = true;
        }
        return z;
    }
}
