package androidx.cardview.widget;

import X.DKC;
import X.GSg;
import X.HMB;
import X.ILJ;
import X.ILK;
import X.JCW;
import X.JDq;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: CardView.class */
public class CardView extends FrameLayout {
    public boolean A00;
    public boolean A01;
    public final Rect A02;
    public final Rect A03;
    public final JCW A04;
    public static final int[] A06 = {R.attr.colorBackground};
    public static final JDq A05 = new Object();

    public CardView(Context context) {
        this(context, null);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968917);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList valueOf;
        Rect A0C = DKC.A0C();
        this.A02 = A0C;
        this.A03 = DKC.A0C();
        ILJ ilj = new ILJ(this);
        this.A04 = ilj;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, HMB.A00, i, 2132607214);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(A06);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(getResources().getColor(fArr[2] > 0.5f ? 2132213766 : 2132213896));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.A00 = obtainStyledAttributes.getBoolean(7, false);
        this.A01 = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        A0C.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        A0C.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        A0C.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        A0C.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        ILK ilk = A05;
        Drawable gSg = new GSg(valueOf, dimension);
        ilj.A00 = gSg;
        CardView cardView = ilj.A01;
        cardView.setBackgroundDrawable(gSg);
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        ilk.Cr0(ilj, dimension3);
    }

    public void A01(float f) {
        GSg gSg = this.A04.A00;
        if (f != gSg.A01) {
            gSg.A01 = f;
            GSg.A00((Rect) null, gSg);
            gSg.invalidateSelf();
        }
    }

    public void A02(int i) {
        ILJ ilj = this.A04;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        GSg gSg = ilj.A00;
        if (valueOf == null) {
            valueOf = ColorStateList.valueOf(0);
        }
        gSg.A02 = valueOf;
        gSg.A08.setColor(valueOf.getColorForState(gSg.getState(), gSg.A02.getDefaultColor()));
        gSg.invalidateSelf();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
