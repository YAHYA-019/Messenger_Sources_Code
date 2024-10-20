package com.facebook.widget;

import X.0FI;
import X.0Pz;
import X.0Q8;
import X.C00j;
import X.C1km;
import X.C1oo;
import X.C3jn;
import X.C3ll;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import com.facebook.resources.ui.FbFrameLayout;
import com.facebook.systrace.Systrace;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: CustomFrameLayout.class */
public class CustomFrameLayout extends FbFrameLayout {
    public CopyOnWriteArrayList A00;
    public int A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;

    public CustomFrameLayout(Context context) {
        super(context);
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        this.A05 = true;
    }

    public CustomFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        this.A05 = true;
        A00(context, attributeSet, 0);
    }

    public CustomFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        this.A05 = true;
        A00(context, attributeSet, i);
    }

    private final void A00(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0W, i, i);
            this.A04 = obtainStyledAttributes.getString(0);
            obtainStyledAttributes.recycle();
            String str = this.A04;
            if (str != null) {
                this.A03 = 0Pz.A0W(str, ".onMeasure");
                this.A02 = 0Pz.A0W(str, ".onLayout");
            }
        }
    }

    public void A0U(int i) {
        this.A01 = i;
        Systrace.A0E(32);
        String str = this.A04;
        if (str == null) {
            str = C1km.A00(getClass());
        }
        C00j.A07("%s.setContentView", str, 281185178);
        try {
            try {
                LayoutInflater.from(getContext()).inflate(i, this);
                C00j.A01(379809121);
            } catch (RuntimeException e) {
                C3jn.A01(this, e, this.A01);
                throw 0Q8.createAndThrow();
            } catch (StackOverflowError e2) {
                C3jn.A01(this, e2, this.A01);
                throw 0Q8.createAndThrow();
            }
        } catch (Throwable th) {
            C00j.A01(1128137987);
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
            CopyOnWriteArrayList copyOnWriteArrayList = this.A00;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                C3ll c3ll = (C3ll) it.next();
                c3ll.BuL();
                this.A00.remove(c3ll);
            }
        } catch (RuntimeException | StackOverflowError e) {
            C3jn.A01(this, e, this.A01);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        if (this.A05) {
            super.dispatchRestoreInstanceState(sparseArray);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        if (this.A05) {
            super.dispatchSaveInstanceState(sparseArray);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1337125802);
        super.onAttachedToWindow();
        0FI.A0C(-1525131183, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-1646192049);
        super.onDetachedFromWindow();
        0FI.A0C(1938844599, A06);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        String str = this.A02;
        boolean z2 = false;
        if (str != null) {
            z2 = true;
            C00j.A05(str, 237563777);
        }
        try {
            try {
                try {
                    super.onLayout(z, i, i2, i3, i4);
                    if (z2) {
                        C00j.A01(-1760800179);
                    }
                } catch (StackOverflowError e) {
                    C3jn.A01(this, e, this.A01);
                    throw 0Q8.createAndThrow();
                }
            } catch (RuntimeException e2) {
                C3jn.A01(this, e2, this.A01);
                throw 0Q8.createAndThrow();
            }
        } catch (Throwable th) {
            if (z2) {
                C00j.A01(1425475279);
            }
            throw th;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        String str = this.A03;
        boolean z = false;
        if (str != null) {
            z = true;
            C00j.A05(str, -848304154);
        }
        try {
            try {
                super.onMeasure(i, i2);
                if (z) {
                    C00j.A01(1675391452);
                }
            } catch (RuntimeException e) {
                C3jn.A01(this, e, this.A01);
                throw 0Q8.createAndThrow();
            } catch (StackOverflowError e2) {
                C3jn.A01(this, e2, this.A01);
                throw 0Q8.createAndThrow();
            }
        } catch (Throwable th) {
            if (z) {
                C00j.A01(-1941686848);
            }
            throw th;
        }
    }

    @Override // android.view.View
    public void restoreHierarchyState(SparseArray sparseArray) {
        super.dispatchRestoreInstanceState(sparseArray);
    }

    @Override // android.view.View
    public void saveHierarchyState(SparseArray sparseArray) {
        super.dispatchSaveInstanceState(sparseArray);
    }
}
