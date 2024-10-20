package androidx.appcompat.view.menu;

import X.0FI;
import X.7zO;
import X.DKG;
import X.DQw;
import X.JQx;
import X.JaB;
import X.Kz8;
import X.LKe;
import X.LQF;
import X.MDt;
import X.MHk;
import X.MHl;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/* loaded from: ActionMenuItemView.class */
public class ActionMenuItemView extends DQw implements View.OnClickListener, MHk, MHl {
    public int A00;
    public Drawable A01;
    public MDt A02;
    public LQF A03;
    public Kz8 A04;
    public CharSequence A05;
    public int A06;
    public int A07;
    public LKe A08;
    public boolean A09;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0041, code lost:
    
        if (r0.orientation == 2) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ActionMenuItemView(android.content.Context r302, android.util.AttributeSet r303, int r304) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r304
            r0.<init>(r1, r2, r3)
            r0 = r302
            android.content.res.Resources r0 = r0.getResources()
            r305 = r0
            r0 = r301
            android.content.Context r0 = r0.getContext()
            r306 = r0
            r0 = r306
            android.content.res.Configuration r0 = X.4YU.A0B(r0)
            r307 = r0
            r0 = r307
            int r0 = r0.screenWidthDp
            r308 = r0
            r0 = 480(0x1e0, float:6.73E-43)
            r309 = r0
            r0 = r308
            r1 = r309
            if (r0 >= r1) goto L44
            r0 = r307
            int r0 = r0.orientation
            r310 = r0
            r0 = 2
            r308 = r0
            r0 = 0
            r309 = r0
            r0 = 0
            r306 = r0
            r0 = r310
            r1 = r308
            if (r0 != r1) goto L47
        L44:
            r0 = 1
            r309 = r0
        L47:
            r0 = r301
            r1 = r309
            r0.A09 = r1
            int[] r0 = X.53Y.A02
            r306 = r0
            r0 = r302
            r1 = r303
            r2 = r306
            r3 = r304
            r4 = 0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            r311 = r0
            r0 = r311
            r1 = 0
            r2 = 0
            int r0 = r0.getDimensionPixelSize(r1, r2)
            r309 = r0
            r0 = r301
            r1 = r309
            r0.A06 = r1
            r0 = r311
            r0.recycle()
            r0 = r305
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1107296256(0x42000000, float:32.0)
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r309 = r0
            r0 = r301
            r1 = r309
            r0.A00 = r1
            r0 = r301
            r1 = r301
            r0.setOnClickListener(r1)
            r0 = r301
            r1 = -1
            r0.A07 = r1
            r0 = r301
            r1 = 0
            r0.setSaveEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.A05);
        if (this.A01 != null && ((this.A03.A05 & 4) != 4 || !this.A09)) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.A05 : null);
        CharSequence contentDescription = this.A03.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.A03.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.A03.getTooltipText();
        if (!TextUtils.isEmpty(tooltipText)) {
            setTooltipText(tooltipText);
            return;
        }
        if (!z3) {
            charSequence = this.A03.getTitle();
        }
        setTooltipText(charSequence);
    }

    @Override // X.MHk
    public LQF AsP() {
        return this.A03;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.MHk
    public void BPH(LQF lqf, int i) {
        this.A03 = lqf;
        Drawable icon = lqf.getIcon();
        this.A01 = icon;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i2 = this.A00;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            icon.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(icon, (Drawable) null, (Drawable) null, (Drawable) null);
        A00();
        this.A05 = lqf.getTitleCondensed();
        A00();
        setId(lqf.getItemId());
        setVisibility(DKG.A00(lqf.isVisible() ? 1 : 0));
        setEnabled(lqf.isEnabled());
        if (lqf.hasSubMenu() && this.A08 == null) {
            this.A08 = new JaB(this);
        }
    }

    @Override // X.MHl
    public boolean Bf2() {
        return JQx.A1V(getText());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r301.A03.getIcon() != null) goto L6;
     */
    @Override // X.MHl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Bf3() {
        /*
            r301 = this;
            r0 = r301
            java.lang.CharSequence r0 = r0.getText()
            r302 = r0
            r0 = r302
            boolean r0 = X.JQx.A1V(r0)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1e
            r0 = r301
            X.LQF r0 = r0.A03
            r302 = r0
            r0 = r302
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L22
        L1e:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L22:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.Bf3():boolean");
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int A05 = 0FI.A05(-1268696158);
        MDt mDt = this.A02;
        if (mDt != null) {
            mDt.BQD(this.A03);
        }
        0FI.A0B(-1262562698, A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0033, code lost:
    
        if (r0.orientation == 2) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onConfigurationChanged(android.content.res.Configuration r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            super/*android.widget.TextView*/.onConfigurationChanged(r1)
            r0 = r301
            android.content.Context r0 = r0.getContext()
            r303 = r0
            r0 = r303
            android.content.res.Configuration r0 = X.4YU.A0B(r0)
            r304 = r0
            r0 = r304
            int r0 = r0.screenWidthDp
            r305 = r0
            r0 = 480(0x1e0, float:6.73E-43)
            r306 = r0
            r0 = r305
            r1 = r306
            if (r0 >= r1) goto L36
            r0 = r304
            int r0 = r0.orientation
            r307 = r0
            r0 = 2
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r303 = r0
            r0 = r307
            r1 = r305
            if (r0 != r1) goto L39
        L36:
            r0 = 1
            r306 = r0
        L39:
            r0 = r301
            r1 = r306
            r0.A09 = r1
            r0 = r301
            r0.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.onConfigurationChanged(android.content.res.Configuration):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int A06 = 0FI.A06(1845867706);
        boolean A1V = JQx.A1V(getText());
        if (A1V && (i5 = this.A07) >= 0) {
            super/*android.widget.TextView*/.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == ((-1) << (-1))) {
            i4 = this.A06;
            i3 = Math.min(size, i4);
        } else {
            i3 = this.A06;
            i4 = i3;
        }
        if (mode != 1073741824 && i4 > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!A1V && this.A01 != null) {
            super/*android.widget.TextView*/.setPadding((getMeasuredWidth() - 7zO.A02(this.A01)) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        0FI.A0C(1295482007, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onRestoreInstanceState(Parcelable parcelable) {
        super/*android.widget.TextView*/.onRestoreInstanceState(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int i;
        LKe lKe;
        int A05 = 0FI.A05(1971064676);
        if (this.A03.hasSubMenu() && (lKe = this.A08) != null && lKe.onTouch(this, motionEvent)) {
            onTouchEvent = true;
            i = -1481508837;
        } else {
            onTouchEvent = super/*android.widget.TextView*/.onTouchEvent(motionEvent);
            i = -543317402;
        }
        0FI.A0B(i, A05);
        return onTouchEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPadding(int i, int i2, int i3, int i4) {
        this.A07 = i;
        super/*android.widget.TextView*/.setPadding(i, i2, i3, i4);
    }
}
