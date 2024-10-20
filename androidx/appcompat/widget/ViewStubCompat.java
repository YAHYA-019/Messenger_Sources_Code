package androidx.appcompat.widget;

import X.53Y;
import X.7zL;
import X.AbG;
import X.AnonymousClass001;
import X.DKC;
import X.DKD;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* loaded from: ViewStubCompat.class */
public final class ViewStubCompat extends View {
    public LayoutInflater A00;
    public int A01;
    public int A02;
    public WeakReference A03;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 53Y.A0R, i, 0);
        this.A01 = obtainStyledAttributes.getResourceId(2, -1);
        this.A02 = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View A00() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw AnonymousClass001.A0N("ViewStub must have a non-null ViewGroup viewParent");
        }
        int i = this.A02;
        if (i == 0) {
            throw AnonymousClass001.A0L("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.A00;
        if (layoutInflater == null) {
            layoutInflater = DKD.A0A(this);
        }
        View A08 = AbG.A08(layoutInflater, viewGroup, i);
        int i2 = this.A01;
        if (i2 != -1) {
            A08.setId(i2);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(A08, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(A08, indexOfChild);
        }
        this.A03 = 7zL.A14(A08);
        return A08;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.A03;
        if (weakReference != null) {
            View A0G = DKC.A0G(weakReference);
            if (A0G == null) {
                throw AnonymousClass001.A0N("setVisibility called on un-referenced view");
            }
            A0G.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            A00();
        }
    }
}
