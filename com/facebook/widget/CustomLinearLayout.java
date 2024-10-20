package com.facebook.widget;

import X.0FI;
import X.0Pz;
import X.0Q8;
import X.AbstractC00793on;
import X.AnonymousClass001;
import X.C00j;
import X.C1km;
import X.C1oo;
import X.C3jn;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import com.facebook.resources.ui.FbLinearLayout;
import com.facebook.systrace.Systrace;

/* loaded from: CustomLinearLayout.class */
public class CustomLinearLayout extends FbLinearLayout {
    public int A00;
    public Drawable A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;

    public CustomLinearLayout(Context context) {
        super(context);
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        this.A05 = true;
        this.A06 = true;
    }

    public CustomLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        this.A05 = true;
        this.A06 = true;
        A00(context, attributeSet, 0);
    }

    public CustomLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        this.A05 = true;
        this.A06 = true;
        A00(context, attributeSet, i);
    }

    private void A00(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0Y, i, 0);
            this.A04 = AbstractC00793on.A01(context, obtainStyledAttributes, 0);
            obtainStyledAttributes.recycle();
            String str = this.A04;
            if (str != null) {
                this.A03 = 0Pz.A0W(str, ".onMeasure");
                this.A02 = 0Pz.A0W(str, ".onLayout");
            }
        }
    }

    public void A0D(int i) {
        Systrace.A0E(32);
        this.A00 = i;
        String str = this.A04;
        if (str == null) {
            str = C1km.A00(getClass());
        }
        Context context = getContext();
        if (context == null || context.getResources() == null) {
            C00j.A07("%s.setContentView", str, 1504134084);
        } else {
            C00j.A04(str, context.getResources().getResourceName(i), "%s.setContentView(%s)", 1369981503);
        }
        try {
            try {
                LayoutInflater.from(context).inflate(i, this);
                C00j.A01(-794293868);
            } catch (RuntimeException e) {
                C3jn.A01(this, e, this.A00);
                throw 0Q8.createAndThrow();
            } catch (StackOverflowError e2) {
                C3jn.A01(this, e2, this.A00);
                throw 0Q8.createAndThrow();
            }
        } catch (Throwable th) {
            C00j.A01(1363444684);
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (RuntimeException | StackOverflowError e) {
            C3jn.A01(this, e, this.A00);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        if (this.A06) {
            super.dispatchRestoreInstanceState(sparseArray);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        if (this.A06) {
            super.dispatchSaveInstanceState(sparseArray);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.A01;
        if (drawable != null) {
            if (this.A05) {
                this.A05 = false;
                drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            }
            this.A01.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A01;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.A01.setState(getDrawableState());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        String str = this.A02;
        boolean z2 = false;
        if (str != null) {
            z2 = true;
            C00j.A05(str, 1897558862);
        }
        try {
            try {
                try {
                    super.onLayout(z, i, i2, i3, i4);
                    if (z2) {
                        C00j.A01(-1135152635);
                    }
                } catch (StackOverflowError e) {
                    C3jn.A01(this, e, this.A00);
                    throw 0Q8.createAndThrow();
                }
            } catch (RuntimeException e2) {
                C3jn.A01(this, e2, this.A00);
                throw 0Q8.createAndThrow();
            }
        } catch (Throwable th) {
            if (z2) {
                C00j.A01(-1357054523);
            }
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        String str = this.A03;
        boolean z = false;
        if (str != null) {
            z = true;
            C00j.A05(str, -148907672);
        }
        try {
            try {
                super.onMeasure(i, i2);
                if (z) {
                    C00j.A01(-441725254);
                }
            } catch (RuntimeException e) {
                C3jn.A01(this, e, this.A00);
                throw 0Q8.createAndThrow();
            } catch (StackOverflowError e2) {
                C3jn.A01(this, e2, this.A00);
                throw 0Q8.createAndThrow();
            }
        } catch (Throwable th) {
            if (z) {
                C00j.A01(420976946);
            }
            throw th;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(-1915595218);
        super.onSizeChanged(i, i2, i3, i4);
        this.A05 = true;
        0FI.A0C(454517865, A06);
    }

    @Override // android.view.View
    public void restoreHierarchyState(SparseArray sparseArray) {
        try {
            super.dispatchRestoreInstanceState(sparseArray);
        } catch (RuntimeException e) {
            C3jn.A01(this, e, this.A00);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // android.view.View
    public void saveHierarchyState(SparseArray sparseArray) {
        super.dispatchSaveInstanceState(sparseArray);
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.A01;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.A01);
            }
            this.A01 = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
            } else {
                setWillNotDraw(true);
            }
            this.A05 = true;
            invalidate();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.setVisible(AnonymousClass001.A1O(i), false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r302 == r301.A01) goto L6;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean verifyDrawable(android.graphics.drawable.Drawable r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            boolean r0 = super.verifyDrawable(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L16
            r0 = r301
            android.graphics.drawable.Drawable r0 = r0.A01
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L18
        L16:
            r0 = 1
            r303 = r0
        L18:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.CustomLinearLayout.verifyDrawable(android.graphics.drawable.Drawable):boolean");
    }
}
