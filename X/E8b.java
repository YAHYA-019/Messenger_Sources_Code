package X;

import android.content.Context;
import android.graphics.Rect;

/* loaded from: E8b.class */
public class E8b extends E8c implements GOZ {
    public 2AS A00;
    public final C1rF A01;

    public E8b(Context context) {
        super(context);
        this.A01 = new C1rF(this, 1kF.A01);
    }

    @Override // X.C1r0
    public void Bgo() {
        C1rF c1rF = this instanceof E8e ? ((E8e) this).A00 : this.A01;
        11T.A0F(c1rF, 0);
        1sW r0 = c1rF.A01;
        if (r0 != null) {
            Rect A0C = DKC.A0C();
            getLocalVisibleRect(A0C);
            r0.A04(A0C);
        }
    }

    @Override // X.GOZ
    public void Ctt(2AS r302) {
        if (this.A00 != r302) {
            if (r302 == null) {
                (this instanceof E8e ? ((E8e) this).A00 : this.A01).A0F();
            }
            this.A00 = r302;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void offsetLeftAndRight(int i) {
        if (i != 0) {
            super.offsetLeftAndRight(i);
            Bgo();
        }
    }

    @Override // android.view.View
    public void offsetTopAndBottom(int i) {
        if (i != 0) {
            super.offsetTopAndBottom(i);
            Bgo();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1115170156);
        super.onAttachedToWindow();
        (this instanceof E8e ? ((E8e) this).A00 : this.A01).A0D();
        0FI.A0C(-1519291372, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-2004419988);
        super.onDetachedFromWindow();
        (this instanceof E8e ? ((E8e) this).A00 : this.A01).A0E();
        0FI.A0C(1180704309, A06);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        2AS r0 = this.A00;
        if (r0 == null) {
            setMeasuredDimension(0, 0);
        } else {
            setMeasuredDimension(r0.A01(), r0.A00());
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        if (f != getTranslationX()) {
            super.setTranslationX(f);
            Bgo();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            Bgo();
        }
    }
}
