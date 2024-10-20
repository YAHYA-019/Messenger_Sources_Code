package com.facebook.widget;

import X.0FI;
import X.4YU;
import X.4YV;
import X.5Wo;
import X.C1oo;
import X.DKC;
import X.DKD;
import X.DKE;
import X.DKI;
import X.DPi;
import X.F92;
import X.FX8;
import X.Q0n;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.acra.constants.ActionId;

/* loaded from: SwitchCompat.class */
public class SwitchCompat extends DPi {
    public static final int[] A0U = {R.attr.state_checked};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public ColorStateList A09;
    public Drawable A0A;
    public Drawable A0B;
    public TextPaint A0C;
    public TransformationMethod A0D;
    public VelocityTracker A0E;
    public Animation A0F;
    public CharSequence A0G;
    public CharSequence A0H;
    public float A0I;
    public float A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public Layout A0P;
    public Layout A0Q;
    public boolean A0R;
    public final Rect A0S;
    public final F92 A0T;

    public SwitchCompat(Context context) {
        this(context, null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971888);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r307v9, types: [java.lang.Object, X.FX8] */
    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable;
        Drawable drawable2;
        TransformationMethod transformationMethod;
        int resourceId;
        int resourceId2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A15);
        DKE.A1D(context, obtainStyledAttributes, this);
        obtainStyledAttributes.recycle();
        this.A0E = VelocityTracker.obtain();
        this.A0S = DKC.A0C();
        TextPaint textPaint = new TextPaint(1);
        this.A0C = textPaint;
        textPaint.density = DKD.A09(this).density;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C1oo.A2c, i, 2132608895);
        F92 f92 = null;
        if (!obtainStyledAttributes2.hasValue(2) || (resourceId2 = obtainStyledAttributes2.getResourceId(2, 0)) == 0) {
            drawable = obtainStyledAttributes2.getDrawable(2);
        } else {
            f92 = new F92(context);
            drawable = f92.A00(resourceId2);
        }
        this.A0A = drawable;
        if (!obtainStyledAttributes2.hasValue(11) || (resourceId = obtainStyledAttributes2.getResourceId(11, 0)) == 0) {
            drawable2 = obtainStyledAttributes2.getDrawable(11);
        } else {
            f92 = f92 == null ? new F92(context) : f92;
            drawable2 = f92.A00(resourceId);
        }
        this.A0B = drawable2;
        this.A0H = obtainStyledAttributes2.getText(0);
        this.A0G = obtainStyledAttributes2.getText(1);
        this.A0R = obtainStyledAttributes2.getBoolean(3, true);
        this.A0O = obtainStyledAttributes2.getDimensionPixelSize(8, 0);
        this.A0L = obtainStyledAttributes2.getDimensionPixelSize(5, 0);
        this.A0M = obtainStyledAttributes2.getDimensionPixelSize(6, 0);
        obtainStyledAttributes2.getBoolean(4, false);
        this.A0T = f92 == null ? new F92(context) : f92;
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, C1oo.A2e, i, 2132608895);
        int resourceId3 = obtainStyledAttributes3.getResourceId(0, 0);
        if (resourceId3 != 0) {
            TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(resourceId3, C1oo.A2d);
            ColorStateList A00 = 5Wo.A00(context, obtainStyledAttributes4, 1);
            this.A09 = A00 == null ? getTextColors() : A00;
            int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                TextPaint textPaint2 = this.A0C;
                if (f != textPaint2.getTextSize()) {
                    textPaint2.setTextSize(f);
                    requestLayout();
                }
            }
            if (obtainStyledAttributes4.getBoolean(2, false)) {
                Context context2 = getContext();
                ?? obj = new Object();
                ((FX8) obj).A00 = 4YU.A0B(context2).locale;
                transformationMethod = obj;
            } else {
                transformationMethod = null;
            }
            this.A0D = transformationMethod;
            obtainStyledAttributes4.recycle();
        }
        obtainStyledAttributes3.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A08 = viewConfiguration.getScaledTouchSlop();
        this.A01 = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
        setClickable(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int A00() {
        int i;
        float f = getLayoutDirection() == 1 ? 1.0f - this.A00 : this.A00;
        Drawable drawable = this.A0B;
        if (drawable != null) {
            Rect rect = this.A0S;
            drawable.getPadding(rect);
            i = DKD.A01(this.A05 - this.A06, rect);
        } else {
            i = 0;
        }
        return (int) ((f * i) + 0.5f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private StaticLayout A01(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            charSequence2 = "";
        }
        TransformationMethod transformationMethod = this.A0D;
        if (transformationMethod != null) {
            charSequence2 = transformationMethod.getTransformation(charSequence2, this);
        }
        return new StaticLayout(charSequence2, this.A0C, (int) Math.ceil(Layout.getDesiredWidth(charSequence2, r0)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A02(boolean z) {
        super/*android.widget.CompoundButton*/.setChecked(z);
        boolean isChecked = isChecked();
        if (this.A0F != null) {
            clearAnimation();
            this.A0F = null;
        }
        float f = 0.0f;
        if (isChecked) {
            f = 1.0f;
        }
        this.A00 = f;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void draw(Canvas canvas) {
        Rect rect = this.A0S;
        int i = this.A03;
        int i2 = this.A04;
        int i3 = this.A0N;
        int i4 = this.A02;
        int A00 = A00() + i;
        Drawable drawable = this.A0B;
        if (drawable != null) {
            drawable.getPadding(rect);
            A00 += rect.left;
            this.A0B.setBounds(i, i2, i3, i4);
        }
        Drawable drawable2 = this.A0A;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i5 = A00 - rect.left;
            int i6 = A00 + this.A06 + rect.right;
            this.A0A.setBounds(i5, i2, i6, i4);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i5, i2, i6, i4);
            }
        }
        super/*android.view.View*/.draw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawableHotspotChanged(float f, float f2) {
        super/*android.widget.CompoundButton*/.drawableHotspotChanged(f, f2);
        Drawable drawable = this.A0A;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.A0B;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawableStateChanged() {
        super/*android.widget.CompoundButton*/.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A0A;
        if (drawable != null) {
            drawable.setState(drawableState);
        }
        Drawable drawable2 = this.A0B;
        if (drawable2 != null) {
            drawable2.setState(drawableState);
        }
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getCompoundPaddingLeft() {
        boolean A1U = 4YV.A1U(getLayoutDirection());
        int compoundPaddingLeft = super/*android.widget.CompoundButton*/.getCompoundPaddingLeft();
        if (A1U) {
            compoundPaddingLeft += this.A05;
            if (!TextUtils.isEmpty(getText())) {
                compoundPaddingLeft += this.A0M;
            }
        }
        return compoundPaddingLeft;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getCompoundPaddingRight() {
        boolean A1U = 4YV.A1U(getLayoutDirection());
        int compoundPaddingRight = super/*android.widget.CompoundButton*/.getCompoundPaddingRight();
        if (!A1U) {
            compoundPaddingRight += this.A05;
            if (!TextUtils.isEmpty(getText())) {
                compoundPaddingRight += this.A0M;
            }
        }
        return compoundPaddingRight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void jumpDrawablesToCurrentState() {
        super/*android.widget.CompoundButton*/.jumpDrawablesToCurrentState();
        Drawable drawable = this.A0A;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.A0B;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Animation animation = this.A0F;
        if (animation == null || !animation.hasStarted() || this.A0F.hasEnded()) {
            return;
        }
        clearAnimation();
        this.A0F = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super/*android.widget.CompoundButton*/.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0U);
        }
        return onCreateDrawableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        int width;
        super/*android.widget.CompoundButton*/.onDraw(canvas);
        Rect rect = this.A0S;
        Drawable drawable = this.A0B;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.A04;
        int i2 = this.A02;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.A0A;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        int save = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = this.A00 > 0.5f ? this.A0Q : this.A0P;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.A09;
            if (colorStateList != null) {
                this.A0C.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.A0C.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super/*android.view.View*/.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(SwitchCompat.class.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SwitchCompat.class.getName());
        CharSequence charSequence = isChecked() ? this.A0H : this.A0G;
        new AccessibilityNodeInfoCompat(accessibilityNodeInfo).A09(charSequence);
        DKI.A0R(accessibilityNodeInfo, charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int A09;
        int i5;
        int i6;
        int i7;
        int i8;
        super/*android.widget.TextView*/.onLayout(z, i, i2, i3, i4);
        if (this.A0A != null) {
            Rect rect = this.A0S;
            Drawable drawable = this.A0B;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
        }
        if (getLayoutDirection() == 1) {
            i5 = getPaddingLeft();
            A09 = this.A05 + i5;
        } else {
            A09 = DKE.A09(this);
            i5 = A09 - this.A05;
        }
        int gravity = getGravity() & ActionId.MISSED_EVENT;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i6 = this.A0K;
            i7 = paddingTop - (i6 / 2);
        } else {
            if (gravity == 80) {
                i8 = DKE.A08(this);
                i7 = i8 - this.A0K;
                this.A03 = i5;
                this.A04 = i7;
                this.A02 = i8;
                this.A0N = A09;
            }
            i7 = getPaddingTop();
            i6 = this.A0K;
        }
        i8 = i6 + i7;
        this.A03 = i5;
        this.A04 = i7;
        this.A02 = i8;
        this.A0N = A09;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int A06 = 0FI.A06(-2109127893);
        boolean z = this.A0R;
        if (z) {
            if (this.A0Q == null) {
                this.A0Q = A01(this.A0H);
            }
            if (this.A0P == null) {
                this.A0P = A01(this.A0G);
            }
        }
        Rect rect = this.A0S;
        Drawable drawable = this.A0A;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = DKD.A01(this.A0A.getIntrinsicWidth(), rect);
            i4 = this.A0A.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        this.A06 = Math.max(z ? Math.max(this.A0Q.getWidth(), this.A0P.getWidth()) + (this.A0O * 2) : 0, i3);
        Drawable drawable2 = this.A0B;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.A0B.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int max = Math.max(this.A0L, (this.A06 * 2) + rect.left + rect.right);
        int max2 = Math.max(i5, i4);
        this.A05 = max;
        this.A0K = max2;
        super/*android.widget.TextView*/.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
        0FI.A0C(-1366973374, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super/*android.view.View*/.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.A0H : this.A0G;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
    
        if (r0 != 3) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 915
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setChecked(boolean z) {
        super/*android.widget.CompoundButton*/.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() != null) {
            float f = this.A00;
            float f2 = 0.0f;
            if (isChecked) {
                f2 = 1.0f;
            }
            Q0n q0n = new Q0n(this, f, f2 - f);
            this.A0F = q0n;
            q0n.setDuration(250L);
            startAnimation(this.A0F);
            return;
        }
        if (this.A0F != null) {
            clearAnimation();
            this.A0F = null;
        }
        float f3 = 0.0f;
        if (isChecked) {
            f3 = 1.0f;
        }
        this.A00 = f3;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r302 == r301.A0B) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean verifyDrawable(android.graphics.drawable.Drawable r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            boolean r0 = super/*android.widget.CompoundButton*/.verifyDrawable(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L24
            r0 = r301
            android.graphics.drawable.Drawable r0 = r0.A0A
            r304 = r0
            r0 = r302
            r1 = r304
            if (r0 == r1) goto L24
            r0 = r301
            android.graphics.drawable.Drawable r0 = r0.A0B
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r302
            r1 = r305
            if (r0 != r1) goto L26
        L24:
            r0 = 1
            r303 = r0
        L26:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.SwitchCompat.verifyDrawable(android.graphics.drawable.Drawable):boolean");
    }
}
