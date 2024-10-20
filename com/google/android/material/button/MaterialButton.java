package com.google.android.material.button;

import X.0FI;
import X.4YV;
import X.6LS;
import X.6Lc;
import X.6Ld;
import X.6Le;
import X.6Lf;
import X.6Lg;
import X.6Lz;
import X.6QO;
import X.7rK;
import X.7zL;
import X.AnonymousClass001;
import X.C53a;
import X.C53h;
import X.DKC;
import X.DPc;
import X.KwZ;
import X.Kwa;
import X.L6H;
import X.LAB;
import X.LGb;
import X.LeI;
import X.LeJ;
import X.MDB;
import X.MDC;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.customview.view.AbsSavedState;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: MaterialButton.class */
public class MaterialButton extends DPc implements Checkable, 6Lf {
    public static final int[] A0D = {R.attr.state_checkable};
    public static final int[] A0E = {R.attr.state_checked};
    public int A00;
    public Drawable A01;
    public MDC A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ColorStateList A07;
    public PorterDuff.Mode A08;
    public boolean A09;
    public boolean A0A;
    public final LAB A0B;
    public final LinkedHashSet A0C;

    /* loaded from: MaterialButton$SavedState.class */
    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new LGb(3);
        public boolean A00;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00 ? 1 : 0);
        }
    }

    public MaterialButton(Context context) {
        this(context, null);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971067);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v75, types: [com.google.android.material.button.MaterialButton, android.view.View, X.DPc] */
    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(6LS.A00(context, attributeSet, i, 2132608574), attributeSet, i);
        this.A0C = 7zL.A15();
        boolean z = false;
        this.A0A = false;
        this.A09 = false;
        Context context2 = getContext();
        TypedArray A00 = 6Lc.A00(context2, attributeSet, 6Ld.A0C, new int[0], i, 2132608574);
        this.A04 = A00.getDimensionPixelSize(12, 0);
        int i2 = A00.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.A08 = KwZ.A01(mode, i2);
        this.A07 = L6H.A00(context2, A00, 14);
        this.A01 = L6H.A01(context2, A00, 10);
        this.A00 = A00.getInteger(11, 1);
        this.A05 = A00.getDimensionPixelSize(13, 0);
        LAB lab = new LAB(this, new 6Lg(6Lg.A01(context2, attributeSet, i, 2132608574)));
        this.A0B = lab;
        lab.A03 = A00.getDimensionPixelOffset(1, 0);
        lab.A04 = A00.getDimensionPixelOffset(2, 0);
        lab.A05 = A00.getDimensionPixelOffset(3, 0);
        lab.A02 = A00.getDimensionPixelOffset(4, 0);
        if (A00.hasValue(8)) {
            int dimensionPixelSize = A00.getDimensionPixelSize(8, -1);
            lab.A00 = dimensionPixelSize;
            6Lg r0 = lab.A0D;
            float f = dimensionPixelSize;
            6QO r02 = new 6QO(r0);
            r02.A00(f);
            lab.A03(new 6Lg(r02));
            lab.A0G = true;
        }
        lab.A06 = A00.getDimensionPixelSize(20, 0);
        lab.A0A = KwZ.A01(mode, A00.getInt(7, -1));
        ?? r03 = lab.A0I;
        Context context3 = r03.getContext();
        lab.A07 = L6H.A00(context3, A00, 6);
        lab.A09 = L6H.A00(context3, A00, 19);
        lab.A08 = L6H.A00(context3, A00, 16);
        lab.A0F = A00.getBoolean(5, false);
        lab.A01 = A00.getDimensionPixelSize(9, 0);
        int paddingStart = r03.getPaddingStart();
        int paddingTop = r03.getPaddingTop();
        int paddingEnd = r03.getPaddingEnd();
        int paddingBottom = r03.getPaddingBottom();
        if (A00.hasValue(0)) {
            lab.A0E = true;
            r03.A03(lab.A07);
            r03.A04(lab.A0A);
        } else {
            Drawable drawable = new 6Le(lab.A0D);
            drawable.A0G(context3);
            drawable.setTintList(lab.A07);
            PorterDuff.Mode mode2 = lab.A0A;
            if (mode2 != null) {
                drawable.setTintMode(mode2);
            }
            float f2 = lab.A06;
            ColorStateList colorStateList = lab.A09;
            ((6Le) drawable).A00.A04 = f2;
            drawable.invalidateSelf();
            drawable.A0I(colorStateList);
            Drawable drawable2 = new 6Le(lab.A0D);
            drawable2.setTint(0);
            float f3 = lab.A06;
            int A01 = lab.A0H ? Kwa.A01(r03, 2130969162) : 0;
            ((6Le) drawable2).A00.A04 = f3;
            drawable2.invalidateSelf();
            drawable2.A0I(ColorStateList.valueOf(A01));
            6Le r04 = new 6Le(lab.A0D);
            lab.A0B = r04;
            r04.setTint(-1);
            ColorStateList colorStateList2 = lab.A08;
            RippleDrawable rippleDrawable = new RippleDrawable(colorStateList2 == null ? ColorStateList.valueOf(0) : colorStateList2, new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{drawable2, drawable}), lab.A03, lab.A05, lab.A04, lab.A02), lab.A0B);
            lab.A0C = rippleDrawable;
            super.setBackgroundDrawable(rippleDrawable);
            6Le A002 = LAB.A00(lab, false);
            if (A002 != null) {
                A002.A0F(lab.A01);
            }
        }
        r03.setPaddingRelative(paddingStart + lab.A03, paddingTop + lab.A05, paddingEnd + lab.A04, paddingBottom + lab.A02);
        A00.recycle();
        setCompoundDrawablePadding(this.A04);
        A01(this.A01 != null ? true : z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00(int i, int i2) {
        if (this.A01 == null || getLayout() == null) {
            return;
        }
        int i3 = this.A00;
        boolean z = true;
        if (i3 != 1 && i3 != 2) {
            z = false;
        }
        if (z || i3 == 3 || i3 == 4) {
            this.A06 = 0;
            boolean z2 = true;
            if (i3 == 1 || i3 == 3) {
                this.A03 = 0;
            } else {
                int i4 = this.A05;
                if (i4 == 0) {
                    i4 = this.A01.getIntrinsicWidth();
                }
                TextPaint paint = getPaint();
                String charSequence = getText().toString();
                if (getTransformationMethod() != null) {
                    charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
                }
                int min = (((((i - Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth())) - getPaddingEnd()) - i4) - this.A04) - getPaddingStart()) / 2;
                boolean A1V = 4YV.A1V(getLayoutDirection(), 1);
                if (i3 != 4) {
                    z2 = false;
                }
                if (A1V != z2) {
                    min = -min;
                }
                if (this.A03 == min) {
                    return;
                } else {
                    this.A03 = min;
                }
            }
        } else {
            if (i3 != 16 && i3 != 32) {
                return;
            }
            this.A03 = 0;
            if (i3 == 16) {
                this.A06 = 0;
            } else {
                int i5 = this.A05;
                if (i5 == 0) {
                    i5 = this.A01.getIntrinsicHeight();
                }
                TextPaint paint2 = getPaint();
                String charSequence2 = getText().toString();
                if (getTransformationMethod() != null) {
                    charSequence2 = getTransformationMethod().getTransformation(charSequence2, this).toString();
                }
                Rect A0C = DKC.A0C();
                paint2.getTextBounds(charSequence2, 0, charSequence2.length(), A0C);
                int min2 = (((((i2 - Math.min(A0C.height(), getLayout().getHeight())) - getPaddingTop()) - i5) - this.A04) - getPaddingBottom()) / 2;
                if (this.A06 == min2) {
                    return;
                } else {
                    this.A06 = min2;
                }
            }
        }
        A01(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A01(boolean z) {
        Drawable drawable = this.A01;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.A01 = mutate;
            mutate.setTintList(this.A07);
            PorterDuff.Mode mode = this.A08;
            if (mode != null) {
                this.A01.setTintMode(mode);
            }
            int i = this.A05;
            int i2 = i;
            if (i == 0) {
                i = this.A01.getIntrinsicWidth();
            }
            if (i2 == 0) {
                i2 = this.A01.getIntrinsicHeight();
            }
            Drawable drawable2 = this.A01;
            int i3 = this.A03;
            int i4 = this.A06;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
        }
        if (!z) {
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            Drawable drawable3 = compoundDrawablesRelative[0];
            Drawable drawable4 = compoundDrawablesRelative[1];
            Drawable drawable5 = compoundDrawablesRelative[2];
            int i5 = this.A00;
            if ((i5 != 1 && i5 != 2) || drawable3 == this.A01) {
                if (i5 == 3 || i5 == 4) {
                    if (drawable5 == this.A01) {
                        return;
                    }
                } else if ((i5 != 16 && i5 != 32) || drawable4 == this.A01) {
                    return;
                }
            }
        }
        int i6 = this.A00;
        boolean z2 = true;
        if (i6 != 1 && i6 != 2) {
            z2 = false;
        }
        if (z2) {
            setCompoundDrawablesRelative(this.A01, null, null, null);
            return;
        }
        if (i6 == 3 || i6 == 4) {
            setCompoundDrawablesRelative(null, null, this.A01, null);
        } else if (i6 == 16 || i6 == 32) {
            setCompoundDrawablesRelative(null, this.A01, null, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0.A0E != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(com.google.android.material.button.MaterialButton r301) {
        /*
            r0 = r301
            X.LAB r0 = r0.A0B
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r302
            boolean r0 = r0.A0E
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L18
        L14:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.A02(com.google.android.material.button.MaterialButton):boolean");
    }

    /* JADX WARN: Type inference failed for: r306v2, types: [X.7rK, java.lang.Object] */
    private void A03(ColorStateList colorStateList) {
        if (A02(this)) {
            LAB lab = this.A0B;
            if (lab.A07 != colorStateList) {
                lab.A07 = colorStateList;
                if (LAB.A00(lab, false) != null) {
                    LAB.A00(lab, false).setTintList(lab.A07);
                    return;
                }
                return;
            }
            return;
        }
        C53h c53h = ((DPc) this).A01;
        if (c53h != null) {
            7rK r306 = c53h.A00;
            7rK r3062 = r306;
            if (r306 == null) {
                ?? obj = new Object();
                c53h.A00 = obj;
                r3062 = obj;
            }
            r3062.A00 = colorStateList;
            r3062.A02 = true;
            c53h.A00();
        }
    }

    /* JADX WARN: Type inference failed for: r306v2, types: [X.7rK, java.lang.Object] */
    private void A04(PorterDuff.Mode mode) {
        if (A02(this)) {
            LAB lab = this.A0B;
            if (lab.A0A != mode) {
                lab.A0A = mode;
                if (LAB.A00(lab, false) == null || lab.A0A == null) {
                    return;
                }
                LAB.A00(lab, false).setTintMode(lab.A0A);
                return;
            }
            return;
        }
        C53h c53h = ((DPc) this).A01;
        if (c53h != null) {
            7rK r306 = c53h.A00;
            7rK r3062 = r306;
            if (r306 == null) {
                ?? obj = new Object();
                c53h.A00 = obj;
                r3062 = obj;
            }
            r3062.A01 = mode;
            r3062.A03 = true;
            c53h.A00();
        }
    }

    public void CuW(6Lg r302) {
        if (!A02(this)) {
            throw AnonymousClass001.A0N("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.A0B.A03(r302);
    }

    public ColorStateList getBackgroundTintList() {
        7rK r0;
        if (A02(this)) {
            return this.A0B.A07;
        }
        C53h c53h = ((DPc) this).A01;
        if (c53h == null || (r0 = c53h.A00) == null) {
            return null;
        }
        return r0.A00;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        7rK r0;
        if (A02(this)) {
            return this.A0B.A0A;
        }
        C53h c53h = ((DPc) this).A01;
        if (c53h == null || (r0 = c53h.A00) == null) {
            return null;
        }
        return r0.A01;
    }

    public int getCornerRadius() {
        if (A02(this)) {
            return this.A0B.A00;
        }
        return 0;
    }

    public int getStrokeWidth() {
        if (A02(this)) {
            return this.A0B.A06;
        }
        return 0;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.A0A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(704643737);
        super/*android.widget.TextView*/.onAttachedToWindow();
        if (A02(this)) {
            6Lz.A00(this, LAB.A00(this.A0B, false));
        }
        0FI.A0C(247432062, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super/*android.widget.TextView*/.onCreateDrawableState(i + 2);
        LAB lab = this.A0B;
        if (lab != null && lab.A0F) {
            View.mergeDrawableStates(onCreateDrawableState, A0D);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0E);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        LAB lab = this.A0B;
        accessibilityEvent.setClassName(((lab == null || !lab.A0F) ? Button.class : CompoundButton.class).getName());
        accessibilityEvent.setChecked(isChecked());
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (r0.A0F == false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            super.onInitializeAccessibilityNodeInfo(r1)
            r0 = r301
            X.LAB r0 = r0.A0B
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L59
            r0 = r303
            boolean r0 = r0.A0F
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L59
            java.lang.Class<android.widget.CompoundButton> r0 = android.widget.CompoundButton.class
            r305 = r0
        L1c:
            r0 = r305
            java.lang.String r0 = r0.getName()
            r305 = r0
            r0 = r302
            r1 = r305
            r0.setClassName(r1)
            r0 = r303
            if (r0 == 0) goto L3a
            r0 = r303
            boolean r0 = r0.A0F
            r306 = r0
            r0 = 1
            r304 = r0
            r0 = r306
            if (r0 != 0) goto L3f
        L3a:
            r0 = 0
            r304 = r0
            r0 = 0
            r305 = r0
        L3f:
            r0 = r302
            r1 = r304
            r0.setCheckable(r1)
            r0 = r301
            boolean r0 = r0.isChecked()
            r304 = r0
            r0 = r302
            r1 = r304
            r0.setChecked(r1)
            r0 = r301
            boolean r0 = r0.isClickable()
            r304 = r0
            r0 = r302
            r1 = r304
            r0.setClickable(r1)
            return
        L59:
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            r305 = r0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super/*android.widget.TextView*/.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super/*android.widget.TextView*/.onRestoreInstanceState(((AbsSavedState) savedState).A00);
        setChecked(savedState.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.os.Parcelable, androidx.customview.view.AbsSavedState, com.google.android.material.button.MaterialButton$SavedState] */
    public Parcelable onSaveInstanceState() {
        ?? absSavedState = new AbsSavedState(super/*android.widget.TextView*/.onSaveInstanceState());
        absSavedState.A00 = this.A0A;
        return absSavedState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(1760404247);
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        A00(i, i2);
        0FI.A0C(-964784038, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        A00(getMeasuredWidth(), getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean performClick() {
        toggle();
        return super/*android.view.View*/.performClick();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundColor(int i) {
        if (!A02(this)) {
            super/*android.view.View*/.setBackgroundColor(i);
            return;
        }
        LAB lab = this.A0B;
        if (LAB.A00(lab, false) != null) {
            LAB.A00(lab, false).setTint(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundDrawable(Drawable drawable) {
        if (A02(this)) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            LAB lab = this.A0B;
            lab.A0E = true;
            MaterialButton materialButton = lab.A0I;
            materialButton.A03(lab.A07);
            materialButton.A04(lab.A0A);
        }
        super.setBackgroundDrawable(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C53a.A00(getContext(), i) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        A03(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        A04(mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        LAB lab = this.A0B;
        if (lab == null || !lab.A0F || !isEnabled() || this.A0A == z) {
            return;
        }
        this.A0A = z;
        refreshDrawableState();
        if (this.A09) {
            return;
        }
        this.A09 = true;
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            LeI leI = (MDB) it.next();
            boolean z2 = this.A0A;
            MaterialButtonToggleGroup materialButtonToggleGroup = leI.A00;
            if (!materialButtonToggleGroup.A02) {
                if (materialButtonToggleGroup.A01) {
                    materialButtonToggleGroup.A00 = z2 ? getId() : -1;
                }
                if (MaterialButtonToggleGroup.A03(materialButtonToggleGroup, getId(), z2)) {
                    getId();
                    MaterialButtonToggleGroup.A02(materialButtonToggleGroup);
                }
                materialButtonToggleGroup.invalidate();
            }
        }
        this.A09 = false;
    }

    public void setCornerRadius(int i) {
        if (A02(this)) {
            LAB lab = this.A0B;
            if (lab.A0G && lab.A00 == i) {
                return;
            }
            lab.A00 = i;
            lab.A0G = true;
            6QO r0 = new 6QO(lab.A0D);
            r0.A00(i);
            lab.A03(new 6Lg(r0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setElevation(float f) {
        super/*android.view.View*/.setElevation(f);
        if (A02(this)) {
            LAB.A00(this.A0B, false).A0F(f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPressed(boolean z) {
        LeJ leJ = this.A02;
        if (leJ != null) {
            leJ.A00.invalidate();
        }
        super/*android.view.View*/.setPressed(z);
    }

    public void setStrokeWidth(int i) {
        if (A02(this)) {
            LAB lab = this.A0B;
            if (lab.A06 != i) {
                lab.A06 = i;
                LAB.A02(lab);
            }
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.A0A);
    }
}
