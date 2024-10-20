package com.facebook.picassolike;

import X.1BL;
import X.1Bn;
import X.AbG;
import X.AnonymousClass001;
import X.DKD;
import X.FcO;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: PicassoLikeViewStub.class */
public class PicassoLikeViewStub extends View {
    public FcO A00;

    public PicassoLikeViewStub(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PicassoLikeViewStub(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = (FcO) 1Bn.A0A(98460);
    }

    public View A00() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw 1BL.A0h(parent, "PicassoLikeViewStub must have a non-null ViewGroup viewParent: ", AnonymousClass001.A0k());
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater A0A = DKD.A0A(this);
        this.A00.getClass();
        View A08 = AbG.A08(A0A, viewGroup, 2132541867);
        A08.setId(getId());
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(A08, indexOfChild, layoutParams);
            return A08;
        }
        viewGroup.addView(A08, indexOfChild);
        return A08;
    }
}
