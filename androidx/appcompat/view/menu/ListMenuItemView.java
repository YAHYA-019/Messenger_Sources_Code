package androidx.appcompat.view.menu;

import X.0FI;
import X.53Y;
import X.53Z;
import X.AbF;
import X.DKC;
import X.DKD;
import X.GOn;
import X.LQF;
import X.MHk;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

/* loaded from: ListMenuItemView.class */
public class ListMenuItemView extends LinearLayout implements MHk, AbsListView.SelectionBoundsAdjuster {
    public LayoutInflater A00;
    public CheckBox A01;
    public ImageView A02;
    public ImageView A03;
    public ImageView A04;
    public LinearLayout A05;
    public RadioButton A06;
    public TextView A07;
    public TextView A08;
    public LQF A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public int A0D;
    public Context A0E;
    public Drawable A0F;
    public Drawable A0G;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970849);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        53Z A0D = DKD.A0D(getContext(), attributeSet, 53Y.A0H, i, 0);
        this.A0F = A0D.A01(5);
        TypedArray typedArray = A0D.A02;
        this.A0D = typedArray.getResourceId(1, -1);
        this.A0C = typedArray.getBoolean(7, false);
        this.A0E = context;
        this.A0G = A0D.A01(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, 2130969400, 0);
        this.A0B = obtainStyledAttributes.hasValue(0);
        typedArray.recycle();
        obtainStyledAttributes.recycle();
    }

    @Override // X.MHk
    public LQF AsP() {
        return this.A09;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0123, code lost:
    
        if (r301.A0C == false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0206  */
    /* JADX WARN: Type inference failed for: r0v123 */
    /* JADX WARN: Type inference failed for: r0v32, types: [android.widget.RadioButton] */
    /* JADX WARN: Type inference failed for: r0v78, types: [android.widget.RadioButton] */
    /* JADX WARN: Type inference failed for: r301v0, types: [android.view.View, androidx.appcompat.view.menu.ListMenuItemView, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r315v0 */
    /* JADX WARN: Type inference failed for: r315v1 */
    /* JADX WARN: Type inference failed for: r315v2 */
    @Override // X.MHk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BPH(X.LQF r302, int r303) {
        /*
            Method dump skipped, instructions count: 1295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.BPH(X.LQF, int):void");
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.A02;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        ViewGroup.MarginLayoutParams A0I = DKC.A0I(this.A02);
        rect.top += this.A02.getHeight() + A0I.topMargin + A0I.bottomMargin;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        int A06 = 0FI.A06(-955915171);
        super.onFinishInflate();
        setBackground(this.A0F);
        TextView A062 = AbF.A06(this, 2131368067);
        this.A08 = A062;
        int i = this.A0D;
        if (i != -1) {
            A062.setTextAppearance(this.A0E, i);
        }
        this.A07 = AbF.A06(this, 2131367381);
        ImageView A0I = GOn.A0I(this, 2131367708);
        this.A04 = A0I;
        if (A0I != null) {
            A0I.setImageDrawable(this.A0G);
        }
        this.A02 = GOn.A0I(this, 2131364394);
        this.A05 = (LinearLayout) findViewById(2131363332);
        0FI.A0C(-1280611747, A06);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.A03 != null && this.A0C) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = this.A03.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }
}
