package com.facebook.uicontrib.fab;

import X.1Bn;
import X.5Wo;
import X.AnonymousClass001;
import X.C1oo;
import X.C2rp;
import X.DKC;
import X.DKI;
import X.DN3;
import X.EP3;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.resources.ui.FbView;

/* loaded from: FabView.class */
public class FabView extends FbView {
    public static final EP3 A04 = EP3.A01;
    public int A00;
    public DN3 A01;
    public Integer A02;
    public Integer A03;

    public FabView(Context context) {
        super(context);
        A01(null);
    }

    public FabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(attributeSet);
    }

    public FabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(attributeSet);
    }

    private void A00() {
        DN3 dn3;
        int intValue;
        if (isPressed()) {
            Integer num = this.A03;
            DN3 dn32 = this.A01;
            dn32.getClass();
            if (num != null) {
                dn32.A08.setColor(this.A03.intValue());
                return;
            } else {
                dn32.A08.setColor(this.A00);
                dn3 = this.A01;
                dn3.getClass();
                intValue = this.A02.intValue();
            }
        } else {
            DN3 dn33 = this.A01;
            dn33.getClass();
            dn33.A08.setColor(this.A00);
            dn3 = this.A01;
            dn3.getClass();
            intValue = 255;
        }
        dn3.setAlpha(intValue);
    }

    private void A01(AttributeSet attributeSet) {
        this.A01 = (DN3) 1Bn.A0A(99912);
        setClickable(true);
        A02(attributeSet);
        DN3 dn3 = this.A01;
        dn3.getClass();
        dn3.setCallback(this);
        C2rp.A01(this);
    }

    public void A02(AttributeSet attributeSet) {
        EP3 ep3;
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0w, 0, 0);
        try {
            DN3 dn3 = this.A01;
            dn3.getClass();
            dn3.A05 = obtainStyledAttributes.getBoolean(6, true);
            DN3.A02(dn3);
            DN3 dn32 = this.A01;
            dn32.getClass();
            int i = obtainStyledAttributes.getInt(0, -1);
            EP3[] values = EP3.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    ep3 = A04;
                    break;
                }
                ep3 = values[i2];
                if (i == ep3.attrEnumValue) {
                    break;
                } else {
                    i2++;
                }
            }
            dn32.A03(ep3);
            ColorStateList A00 = 5Wo.A00(context, obtainStyledAttributes, 1);
            this.A00 = A00 != null ? A00.getDefaultColor() : context.getColor(2132214206);
            A00();
            this.A03 = A00 != null ? Integer.valueOf(5Wo.A00(context, obtainStyledAttributes, 5).getDefaultColor()) : null;
            this.A02 = Integer.valueOf(obtainStyledAttributes.getInt(4, 200));
            ColorStateList A002 = 5Wo.A00(context, obtainStyledAttributes, 3);
            if (A002 != null) {
                DN3 dn33 = this.A01;
                dn33.getClass();
                dn33.A04 = Integer.valueOf(A002.getDefaultColor());
                Drawable drawable = dn33.A02;
                if (drawable != null) {
                    DKC.A1N(drawable.mutate(), dn33.A04.intValue());
                }
            }
            DN3 dn34 = this.A01;
            dn34.getClass();
            int resourceId = obtainStyledAttributes.getResourceId(2, 0);
            if (dn34.A01 != resourceId) {
                if (resourceId == 0) {
                    dn34.A02 = null;
                } else {
                    Drawable drawable2 = dn34.A07.getDrawable(resourceId);
                    dn34.A02 = drawable2;
                    if (drawable2 == null) {
                        throw AnonymousClass001.A0Q("mGlyphDrawable is null!");
                    }
                    Drawable mutate = drawable2.mutate();
                    Integer num = dn34.A04;
                    DKC.A1N(mutate, num != null ? num.intValue() : -1);
                    Drawable drawable3 = dn34.A02;
                    if (drawable3 != null) {
                        DKI.A0O(drawable3, dn34, drawable3.getIntrinsicHeight());
                    }
                }
                dn34.A01 = resourceId;
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        A00();
        invalidate();
    }

    public EP3 getSize() {
        DN3 dn3 = this.A01;
        dn3.getClass();
        return dn3.A03;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        DN3 dn3 = this.A01;
        dn3.getClass();
        dn3.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        DN3 dn3 = this.A01;
        dn3.getClass();
        int A00 = dn3.A03.A00(getResources());
        setMeasuredDimension(View.resolveSize(A00, i), View.resolveSize(A00, i2));
        DN3 dn32 = this.A01;
        dn32.getClass();
        dn32.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setSize(EP3 ep3) {
        DN3 dn3 = this.A01;
        dn3.getClass();
        dn3.A03(ep3);
        requestLayout();
    }
}
