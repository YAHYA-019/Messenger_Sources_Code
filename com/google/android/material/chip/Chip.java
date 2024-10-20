package com.google.android.material.chip;

import X.0FI;
import X.3vE;
import X.6Lf;
import X.6Lg;
import X.6Lz;
import X.AnonymousClass001;
import X.C3009Jg8;
import X.DKC;
import X.K8I;
import X.KTJ;
import X.LBK;
import X.MDD;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import java.util.Arrays;

/* loaded from: Chip.class */
public class Chip extends AppCompatCheckBox implements 6Lf, MDD {
    public int A00;
    public InsetDrawable A01;
    public RippleDrawable A02;
    public CompoundButton.OnCheckedChangeListener A03;
    public K8I A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public int A09;
    public boolean A0A;
    public final Rect A0B;
    public final RectF A0C;
    public final C3009Jg8 A0D;
    public final KTJ A0E;
    public static final Rect A0F = DKC.A0C();
    public static final int[] A0H = {R.attr.state_selected};
    public static final int[] A0G = {R.attr.state_checkable};

    public Chip(Context context) {
        this(context, null);
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969095);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x09e1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0a29  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0a71  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0a9f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0acd  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0b07  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0b41  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0bdd  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0c82  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0cd9  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0d03  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0511  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Chip(android.content.Context r302, android.util.AttributeSet r303, int r304) {
        /*
            Method dump skipped, instructions count: 3445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void A00() {
        K8I k8i;
        if (TextUtils.isEmpty(getText()) || (k8i = this.A04) == null) {
            return;
        }
        int A0K = (int) (k8i.A01 + k8i.A0B + k8i.A0K());
        int A0J = (int) (k8i.A04 + k8i.A0C + k8i.A0J());
        if (this.A01 != null) {
            Rect A0C = DKC.A0C();
            this.A01.getPadding(A0C);
            A0J += A0C.left;
            A0K += A0C.right;
        }
        setPaddingRelative(A0J, getPaddingTop(), A0K, getPaddingBottom());
    }

    private void A01() {
        TextPaint paint = getPaint();
        K8I k8i = this.A04;
        if (k8i != null) {
            paint.drawableState = k8i.getState();
            LBK lbk = k8i.A0u.A01;
            if (lbk != null) {
                lbk.A03(getContext(), paint, this.A0E);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        if (r0.right == r308) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0125, code lost:
    
        if (r0 > 0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(com.google.android.material.chip.Chip r301, int r302) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.A02(com.google.android.material.chip.Chip, int):void");
    }

    public void CuW(6Lg r302) {
        this.A04.CuW(r302);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
    
        if (super.dispatchHoverEvent(r302) != false) goto L33;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchHoverEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C3009Jg8 c3009Jg8 = this.A0D;
        if (!c3009Jg8.A0o(keyEvent) || ((3vE) c3009Jg8).A01 == ((-1) << (-1))) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v77, types: [int] */
    /* JADX WARN: Type inference failed for: r0v79, types: [int] */
    /* JADX WARN: Type inference failed for: r0v81, types: [int] */
    /* JADX WARN: Type inference failed for: r305v16 */
    /* JADX WARN: Type inference failed for: r305v4 */
    /* JADX WARN: Type inference failed for: r305v5 */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        Drawable drawable;
        super.drawableStateChanged();
        K8I k8i = this.A04;
        if (k8i == null || (drawable = k8i.A0T) == null || !drawable.isStateful()) {
            return;
        }
        boolean isEnabled = isEnabled();
        boolean z = isEnabled;
        if (this.A05) {
            z = (isEnabled ? 1 : 0) + 1;
        }
        boolean z2 = z;
        if (this.A06) {
            z2 = (z ? 1 : 0) + 1;
        }
        boolean z3 = z2;
        if (this.A07) {
            z3 = (z2 ? 1 : 0) + 1;
        }
        int i = z3;
        if (isChecked()) {
            i = (z3 ? 1 : 0) + 1;
        }
        int[] iArr = new int[i];
        int i2 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i2 = 1;
        }
        if (this.A05) {
            iArr[i2] = 16842908;
            i2++;
        }
        if (this.A06) {
            iArr[i2] = 16843623;
            i2++;
        }
        if (this.A07) {
            iArr[i2] = 16842919;
            i2++;
        }
        if (isChecked()) {
            iArr[i2] = 16842913;
        }
        if (Arrays.equals(k8i.A0h, iArr)) {
            return;
        }
        k8i.A0h = iArr;
        if (K8I.A0C(k8i) && K8I.A0D(k8i, k8i.getState(), iArr)) {
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        K8I k8i = this.A04;
        if (k8i != null) {
            return k8i.A0V;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        C3009Jg8 c3009Jg8 = this.A0D;
        if (((3vE) c3009Jg8).A01 != 1 && ((3vE) c3009Jg8).A00 != 1) {
            super.getFocusedRect(rect);
            return;
        }
        RectF rectF = this.A0C;
        rectF.setEmpty();
        Rect rect2 = this.A0B;
        rect2.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        rect.set(rect2);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(571470192);
        super.onAttachedToWindow();
        6Lz.A00(this, this.A04);
        0FI.A0C(-1067645884, A06);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0H);
        }
        K8I k8i = this.A04;
        if (k8i != null && k8i.A0a) {
            View.mergeDrawableStates(onCreateDrawableState, A0G);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        int A06 = 0FI.A06(205850806);
        super.onFocusChanged(z, i, rect);
        this.A0D.A0m(z, i, rect);
        0FI.A0C(1467851652, A06);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        RectF rectF = this.A0C;
        rectF.setEmpty();
        contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
        if (this.A06 != contains) {
            this.A06 = contains;
            refreshDrawableState();
        }
        return super.onHoverEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r0.A0a == false) goto L13;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r302) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        RectF rectF = this.A0C;
        rectF.setEmpty();
        if (rectF.contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.A09 != i) {
            this.A09 = i;
            A00();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006b, code lost:
    
        if (super.onTouchEvent(r302) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c3, code lost:
    
        if (r311 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0061, code lost:
    
        if (r0 != 3) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        K8I k8i = this.A01;
        if (k8i == null) {
            k8i = this.A04;
        }
        if (drawable == k8i || drawable == this.A02) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        K8I k8i = this.A01;
        if (k8i == null) {
            k8i = this.A04;
        }
        if (drawable == k8i || drawable == this.A02) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        K8I k8i = this.A04;
        if (k8i == null) {
            this.A0A = z;
            return;
        }
        if (k8i.A0a) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked == z || (onCheckedChangeListener = this.A03) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw AnonymousClass001.A0q("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw AnonymousClass001.A0q("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw AnonymousClass001.A0q("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw AnonymousClass001.A0q("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw AnonymousClass001.A0q("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw AnonymousClass001.A0q("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw AnonymousClass001.A0q("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw AnonymousClass001.A0q("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw AnonymousClass001.A0q("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw AnonymousClass001.A0q("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw AnonymousClass001.A0q("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw AnonymousClass001.A0q("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        K8I k8i = this.A04;
        if (k8i != null) {
            k8i.A0F(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        K8I k8i = this.A04;
        if (k8i != null) {
            if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
                throw AnonymousClass001.A0q("Text within a chip are not allowed to scroll.");
            }
            super.setEllipsize(truncateAt);
            k8i.A0V = truncateAt;
        }
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.A04 != null) {
            super.setLayoutDirection(i);
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw AnonymousClass001.A0q("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw AnonymousClass001.A0q("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        K8I k8i = this.A04;
        if (k8i != null) {
            k8i.A0H = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw AnonymousClass001.A0q("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw AnonymousClass001.A0q("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        K8I k8i = this.A04;
        if (k8i != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            CharSequence charSequence2 = charSequence;
            if (k8i.A0g) {
                charSequence2 = null;
            }
            super.setText(charSequence2, bufferType);
            if (TextUtils.equals(k8i.A0Y, charSequence)) {
                return;
            }
            k8i.A0Y = charSequence;
            k8i.A0u.A03 = true;
            k8i.invalidateSelf();
            K8I.A05(k8i);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        K8I k8i = this.A04;
        if (k8i != null) {
            K8I.A06(k8i, new LBK(k8i.A0o, i));
        }
        A01();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        K8I k8i = this.A04;
        if (k8i != null) {
            K8I.A06(k8i, new LBK(k8i.A0o, i));
        }
        A01();
    }
}
