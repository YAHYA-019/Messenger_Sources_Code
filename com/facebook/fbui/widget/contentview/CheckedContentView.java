package com.facebook.fbui.widget.contentview;

import X.0S2;
import X.C1oo;
import X.DKC;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import com.facebook.fbui.widget.layout.ImageBlockLayout;

/* loaded from: CheckedContentView.class */
public class CheckedContentView extends ContentView implements Checkable {
    public static final int[] A04 = {R.attr.state_checkable, R.attr.state_checked};
    public static final int[] A05 = {R.attr.state_checkable};
    public int A00;
    public Drawable A01;
    public Integer A02;
    public boolean A03;

    public CheckedContentView(Context context) {
        this(context, null);
    }

    public CheckedContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969067);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckedContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A03 = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0K, i, 0);
        A0H(obtainStyledAttributes.getResourceId(1, 0));
        setChecked(obtainStyledAttributes.getBoolean(0, false));
        Integer num = 0S2.A00(2)[obtainStyledAttributes.getInteger(3, 1)];
        if (this.A02 != num) {
            this.A02 = num;
            invalidate();
            requestLayout();
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        if (this.A00 != dimensionPixelSize) {
            this.A00 = dimensionPixelSize;
            requestLayout();
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0H(int i) {
        if (i > 0) {
            Drawable drawable = getContext().getDrawable(i);
            boolean z = false;
            if (this.A01 != drawable) {
                this.A01 = drawable;
                if (drawable != null) {
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.A01.getIntrinsicHeight());
                    DKC.A1O(this.A01, this);
                }
                invalidate();
            }
            if (this.A01 == null) {
                z = true;
            }
            setWillNotDraw(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A01;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        DKC.A1O(this.A01, this);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.A03;
    }

    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super/*android.view.ViewGroup*/.onCreateDrawableState(i + 2);
        View.mergeDrawableStates(onCreateDrawableState, this.A03 ? A04 : A05);
        return onCreateDrawableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        super/*android.view.View*/.onDraw(canvas);
        Drawable drawable = this.A01;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int layoutDirection = getLayoutDirection();
            Integer num = this.A02;
            int measuredWidth = (layoutDirection != 0 ? num != 0S2.A01 : num != 0S2.A00) ? (getMeasuredWidth() - bounds.width()) - (getPaddingRight() + ((ImageBlockLayout) this).A04) : getPaddingLeft() + ((ImageBlockLayout) this).A03;
            canvas.translate(measuredWidth, (getMeasuredHeight() - bounds.height()) / 2);
            this.A01.draw(canvas);
            canvas.translate(-measuredWidth, -r0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super/*android.view.View*/.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setChecked(this.A03);
    }

    @Override // com.facebook.fbui.widget.contentview.ContentView
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 1) {
            Resources resources = getResources();
            int i = 2131952172;
            if (this.A03) {
                i = 2131952171;
            }
            accessibilityEvent.getText().add(resources.getString(i));
        }
        super/*android.view.View*/.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.A03 != z) {
            this.A03 = z;
            refreshDrawableState();
            invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPressed(boolean z) {
        super/*android.view.View*/.setPressed(z);
        refreshDrawableState();
        invalidate();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (super.verifyDrawable(r302) != false) goto L6;
     */
    @Override // com.facebook.fbui.widget.layout.ImageBlockLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean verifyDrawable(android.graphics.drawable.Drawable r302) {
        /*
            r301 = this;
            r0 = r301
            android.graphics.drawable.Drawable r0 = r0.A01
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L19
            r0 = r301
            r1 = r302
            boolean r0 = super.verifyDrawable(r1)
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L1c
        L19:
            r0 = 1
            r305 = r0
        L1c:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbui.widget.contentview.CheckedContentView.verifyDrawable(android.graphics.drawable.Drawable):boolean");
    }
}
