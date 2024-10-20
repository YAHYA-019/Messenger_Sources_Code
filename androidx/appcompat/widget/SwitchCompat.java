package androidx.appcompat.widget;

import X.0FI;
import X.0K6;
import X.0uK;
import X.4YU;
import X.4YV;
import X.53Y;
import X.53Z;
import X.C0Ad;
import X.C53d;
import X.C53g;
import X.DKC;
import X.DKD;
import X.DKE;
import X.DKI;
import X.DLV;
import X.DRk;
import X.Esh;
import X.FX8;
import X.JXK;
import X.L8x;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.facebook.acra.constants.ActionId;

/* loaded from: SwitchCompat.class */
public class SwitchCompat extends CompoundButton {
    public static final Property A0i = new JXK(0);
    public static final int[] A0j = {R.attr.state_checked};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public ObjectAnimator A08;
    public ColorStateList A09;
    public ColorStateList A0A;
    public ColorStateList A0B;
    public Drawable A0C;
    public Drawable A0D;
    public TransformationMethod A0E;
    public VelocityTracker A0F;
    public Esh A0G;
    public CharSequence A0H;
    public CharSequence A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public float A0M;
    public float A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public PorterDuff.Mode A0U;
    public PorterDuff.Mode A0V;
    public Layout A0W;
    public Layout A0X;
    public DRk A0Y;
    public CharSequence A0Z;
    public CharSequence A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public final Rect A0f;
    public final TextPaint A0g;
    public final DLV A0h;

    public SwitchCompat(Context context) {
        this(context, null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971896);
    }

    /* JADX WARN: Type inference failed for: r309v8, types: [java.lang.Object, X.FX8] */
    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TransformationMethod transformationMethod;
        this.A0A = null;
        this.A0U = null;
        this.A0J = false;
        this.A0c = false;
        this.A0B = null;
        this.A0V = null;
        this.A0K = false;
        this.A0d = false;
        this.A0F = VelocityTracker.obtain();
        this.A0b = true;
        this.A0f = DKC.A0C();
        Context context2 = getContext();
        C53g.A03(context2, this);
        TextPaint textPaint = new TextPaint(1);
        this.A0g = textPaint;
        textPaint.density = DKD.A09(this).density;
        int[] iArr = 53Y.A0M;
        53Z A0D = DKD.A0D(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = A0D.A02;
        C0Ad.A07(context, typedArray, attributeSet, this, iArr, i, 0);
        Drawable A01 = A0D.A01(2);
        this.A0C = A01;
        if (A01 != null) {
            A01.setCallback(this);
        }
        Drawable A012 = A0D.A01(11);
        this.A0D = A012;
        if (A012 != null) {
            A012.setCallback(this);
        }
        A09(this, typedArray.getText(0));
        A08(this, typedArray.getText(1));
        this.A0L = typedArray.getBoolean(3, true);
        this.A0T = typedArray.getDimensionPixelSize(8, 0);
        this.A0P = typedArray.getDimensionPixelSize(5, 0);
        this.A0Q = typedArray.getDimensionPixelSize(6, 0);
        this.A0e = typedArray.getBoolean(4, false);
        ColorStateList A00 = A0D.A00(9);
        if (A00 != null) {
            this.A0A = A00;
            this.A0J = true;
        }
        PorterDuff.Mode A002 = C53d.A00(null, typedArray.getInt(10, -1));
        if (this.A0U != A002) {
            this.A0U = A002;
            this.A0c = true;
        }
        if (this.A0J || this.A0c) {
            A03(this);
        }
        ColorStateList A003 = A0D.A00(12);
        if (A003 != null) {
            this.A0B = A003;
            this.A0K = true;
        }
        PorterDuff.Mode A004 = C53d.A00(null, typedArray.getInt(13, -1));
        if (this.A0V != A004) {
            this.A0V = A004;
            this.A0d = true;
        }
        if (this.A0K || this.A0d) {
            A04(this);
        }
        int resourceId = typedArray.getResourceId(7, 0);
        if (resourceId != 0) {
            53Z r0 = new 53Z(context, context.obtainStyledAttributes(resourceId, 53Y.A0N));
            ColorStateList A005 = r0.A00(3);
            this.A09 = A005 == null ? getTextColors() : A005;
            TypedArray typedArray2 = r0.A02;
            int dimensionPixelSize = typedArray2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                TextPaint textPaint2 = this.A0g;
                if (f != textPaint2.getTextSize()) {
                    textPaint2.setTextSize(f);
                    requestLayout();
                }
            }
            int i2 = typedArray2.getInt(1, -1);
            int i3 = typedArray2.getInt(2, -1);
            Typeface typeface = i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            float f2 = 0.0f;
            boolean z = false;
            if (i3 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i3) : Typeface.create(typeface, i3);
                A02(defaultFromStyle);
                int style = ((defaultFromStyle != null ? defaultFromStyle.getStyle() : 0) ^ (-1)) & i3;
                TextPaint textPaint3 = this.A0g;
                textPaint3.setFakeBoldText((style & 1) != 0 ? true : z);
                textPaint3.setTextSkewX((style & 2) != 0 ? -0.25f : f2);
            } else {
                TextPaint textPaint4 = this.A0g;
                textPaint4.setFakeBoldText(false);
                textPaint4.setTextSkewX(0.0f);
                A02(typeface);
            }
            if (typedArray2.getBoolean(14, false)) {
                ?? obj = new Object();
                ((FX8) obj).A00 = 4YU.A0B(context2).locale;
                transformationMethod = obj;
            } else {
                transformationMethod = null;
            }
            this.A0E = transformationMethod;
            A09(this, this.A0I);
            A08(this, this.A0H);
            typedArray2.recycle();
        }
        DLV dlv = new DLV(this);
        this.A0h = dlv;
        dlv.A07(attributeSet, i);
        typedArray.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A07 = viewConfiguration.getScaledTouchSlop();
        this.A01 = viewConfiguration.getScaledMinimumFlingVelocity();
        Esh esh = this.A0G;
        if (esh == null) {
            esh = new Esh(this);
            this.A0G = esh;
        }
        esh.A00(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private int A00() {
        Drawable drawable = this.A0D;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.A0f;
        drawable.getPadding(rect);
        Drawable drawable2 = this.A0C;
        return DKD.A01(DKD.A01(this.A0S - this.A05, rect), drawable2 != null ? C53d.A01(drawable2) : C53d.A00);
    }

    private StaticLayout A01(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.A0g, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r0)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void A02(Typeface typeface) {
        TextPaint textPaint = this.A0g;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public static void A03(SwitchCompat switchCompat) {
        Drawable drawable = switchCompat.A0C;
        if (drawable != null) {
            if (switchCompat.A0J || switchCompat.A0c) {
                Drawable mutate = drawable.mutate();
                switchCompat.A0C = mutate;
                if (switchCompat.A0J) {
                    mutate.setTintList(switchCompat.A0A);
                }
                if (switchCompat.A0c) {
                    switchCompat.A0C.setTintMode(switchCompat.A0U);
                }
                if (switchCompat.A0C.isStateful()) {
                    DKC.A1O(switchCompat.A0C, switchCompat);
                }
            }
        }
    }

    public static void A04(SwitchCompat switchCompat) {
        Drawable drawable = switchCompat.A0D;
        if (drawable != null) {
            if (switchCompat.A0K || switchCompat.A0d) {
                Drawable mutate = drawable.mutate();
                switchCompat.A0D = mutate;
                if (switchCompat.A0K) {
                    mutate.setTintList(switchCompat.A0B);
                }
                if (switchCompat.A0d) {
                    switchCompat.A0D.setTintMode(switchCompat.A0V);
                }
                if (switchCompat.A0D.isStateful()) {
                    DKC.A1O(switchCompat.A0D, switchCompat);
                }
            }
        }
    }

    public static void A05(SwitchCompat switchCompat) {
        if (Build.VERSION.SDK_INT >= 30) {
            Object obj = switchCompat.A0H;
            if (obj == null) {
                obj = switchCompat.getResources().getString(2131952101);
            }
            new 0uK(2).A01(switchCompat, obj);
        }
    }

    public static void A06(SwitchCompat switchCompat) {
        if (Build.VERSION.SDK_INT >= 30) {
            Object obj = switchCompat.A0I;
            if (obj == null) {
                obj = switchCompat.getResources().getString(2131952102);
            }
            new 0uK(2).A01(switchCompat, obj);
        }
    }

    public static void A07(SwitchCompat switchCompat) {
        if (switchCompat.A0Y == null && switchCompat.A0G.A00.A00.A00.A00 && L8x.A09 != null) {
            L8x A00 = L8x.A00();
            int A01 = A00.A01();
            if (A01 == 3 || A01 == 0) {
                DRk dRk = new DRk(switchCompat);
                switchCompat.A0Y = dRk;
                A00.A04(dRk);
            }
        }
    }

    public static void A08(SwitchCompat switchCompat, CharSequence charSequence) {
        switchCompat.A0H = charSequence;
        Esh esh = switchCompat.A0G;
        if (esh == null) {
            esh = new Esh(switchCompat);
            switchCompat.A0G = esh;
        }
        TransformationMethod A00 = esh.A00.A00.A00(switchCompat.A0E);
        if (A00 != null) {
            charSequence = A00.getTransformation(charSequence, switchCompat);
        }
        switchCompat.A0Z = charSequence;
        switchCompat.A0W = null;
        if (switchCompat.A0L) {
            A07(switchCompat);
        }
    }

    public static void A09(SwitchCompat switchCompat, CharSequence charSequence) {
        switchCompat.A0I = charSequence;
        Esh esh = switchCompat.A0G;
        if (esh == null) {
            esh = new Esh(switchCompat);
            switchCompat.A0G = esh;
        }
        TransformationMethod A00 = esh.A00.A00.A00(switchCompat.A0E);
        if (A00 != null) {
            charSequence = A00.getTransformation(charSequence, switchCompat);
        }
        switchCompat.A0a = charSequence;
        switchCompat.A0X = null;
        if (switchCompat.A0L) {
            A07(switchCompat);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rect = this.A0f;
        int i = this.A03;
        int i2 = this.A04;
        int i3 = this.A0R;
        int i4 = this.A02;
        int A00 = ((int) (((getLayoutDirection() == 1 ? 1.0f - this.A00 : this.A00) * A00()) + 0.5f)) + i;
        Drawable drawable = this.A0C;
        Rect A01 = drawable != null ? C53d.A01(drawable) : C53d.A00;
        Drawable drawable2 = this.A0D;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i5 = rect.left;
            A00 += i5;
            int i6 = A01.left;
            if (i6 > i5) {
                i += i6 - i5;
            }
            int i7 = A01.top;
            int i8 = rect.top;
            int i9 = i2;
            if (i7 > i8) {
                i9 = (i7 - i8) + i2;
            }
            int i10 = A01.right;
            int i11 = rect.right;
            if (i10 > i11) {
                i3 -= i10 - i11;
            }
            int i12 = A01.bottom;
            int i13 = rect.bottom;
            int i14 = i4;
            if (i12 > i13) {
                i14 = i4 - (i12 - i13);
            }
            this.A0D.setBounds(i, i9, i3, i14);
        }
        Drawable drawable3 = this.A0C;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = A00 - rect.left;
            int i16 = A00 + this.A05 + rect.right;
            this.A0C.setBounds(i15, i2, i16, i4);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i2, i16, i4);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.A0C;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.A0D;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A0C;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.A0D;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean A1U = 4YV.A1U(getLayoutDirection());
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        if (A1U) {
            compoundPaddingLeft += this.A0S;
            if (!TextUtils.isEmpty(getText())) {
                compoundPaddingLeft += this.A0Q;
            }
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean A1U = 4YV.A1U(getLayoutDirection());
        int compoundPaddingRight = super.getCompoundPaddingRight();
        if (!A1U) {
            compoundPaddingRight += this.A0S;
            if (!TextUtils.isEmpty(getText())) {
                compoundPaddingRight += this.A0Q;
            }
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A0C;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.A0D;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.A08;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.A08.end();
        this.A08 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0j);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.A0f;
        Drawable drawable = this.A0D;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.A04;
        int i2 = this.A02;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.A0C;
        if (drawable != null) {
            if (!this.A0e || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect A01 = C53d.A01(drawable2);
                drawable2.copyBounds(rect);
                rect.left += A01.left;
                rect.right -= A01.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = this.A00 > 0.5f ? this.A0X : this.A0W;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.A09;
            if (colorStateList != null) {
                this.A0g.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.A0g.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            DKI.A0R(accessibilityNodeInfo, isChecked() ? this.A0I : this.A0H);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int A09;
        int i6;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i, i2, i3, i4);
        int i10 = 0;
        if (this.A0C != null) {
            Rect rect = this.A0f;
            Drawable drawable = this.A0D;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect A01 = C53d.A01(this.A0C);
            i5 = Math.max(0, A01.left - rect.left);
            i10 = Math.max(0, A01.right - rect.right);
        } else {
            i5 = 0;
        }
        if (getLayoutDirection() == 1) {
            i6 = getPaddingLeft() + i5;
            A09 = ((this.A0S + i6) - i5) - i10;
        } else {
            A09 = DKE.A09(this) - i10;
            i6 = (A09 - this.A0S) + i5 + i10;
        }
        int gravity = getGravity() & ActionId.MISSED_EVENT;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i7 = this.A0O;
            i8 = paddingTop - (i7 / 2);
        } else {
            if (gravity == 80) {
                i9 = DKE.A08(this);
                i8 = i9 - this.A0O;
                this.A03 = i6;
                this.A04 = i8;
                this.A02 = i9;
                this.A0R = A09;
            }
            i8 = getPaddingTop();
            i7 = this.A0O;
        }
        i9 = i7 + i8;
        this.A03 = i6;
        this.A04 = i8;
        this.A02 = i9;
        this.A0R = A09;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int A06 = 0FI.A06(1754638480);
        if (this.A0L) {
            if (this.A0X == null) {
                this.A0X = A01(this.A0a);
            }
            if (this.A0W == null) {
                this.A0W = A01(this.A0Z);
            }
        }
        Rect rect = this.A0f;
        Drawable drawable = this.A0C;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = DKD.A01(this.A0C.getIntrinsicWidth(), rect);
            i4 = this.A0C.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        this.A05 = Math.max(this.A0L ? Math.max(this.A0X.getWidth(), this.A0W.getWidth()) + (this.A0T * 2) : 0, i3);
        Drawable drawable2 = this.A0D;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.A0D.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.A0C;
        if (drawable3 != null) {
            Rect A01 = C53d.A01(drawable3);
            i6 = Math.max(i6, A01.left);
            i7 = Math.max(i7, A01.right);
        }
        int max = this.A0b ? Math.max(this.A0P, (this.A05 * 2) + i6 + i7) : this.A0P;
        int max2 = Math.max(i5, i4);
        this.A0S = max;
        this.A0O = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
        0FI.A0C(1799498547, A06);
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.A0I : this.A0H;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x01cb, code lost:
    
        if (isEnabled() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
    
        if (r0 != 3) goto L10;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        Esh esh = this.A0G;
        if (esh == null) {
            esh = new Esh(this);
            this.A0G = esh;
        }
        esh.A00.A00.A01(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            A06(this);
        } else {
            A05(this);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.A08;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            float f = 0.0f;
            if (isChecked) {
                f = 1.0f;
            }
            this.A00 = f;
            invalidate();
            return;
        }
        float f2 = 0.0f;
        if (isChecked) {
            f2 = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) A0i, f2);
        this.A08 = ofFloat;
        ofFloat.setDuration(250L);
        this.A08.setAutoCancel(true);
        0K6.A00(this.A08);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        Esh esh = this.A0G;
        if (esh == null) {
            esh = new Esh(this);
            this.A0G = esh;
        }
        super.setFilters(esh.A00.A00.A03(inputFilterArr));
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r302 == r301.A0D) goto L8;
     */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
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
            if (r0 != 0) goto L24
            r0 = r301
            android.graphics.drawable.Drawable r0 = r0.A0C
            r304 = r0
            r0 = r302
            r1 = r304
            if (r0 == r1) goto L24
            r0 = r301
            android.graphics.drawable.Drawable r0 = r0.A0D
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.verifyDrawable(android.graphics.drawable.Drawable):boolean");
    }
}
