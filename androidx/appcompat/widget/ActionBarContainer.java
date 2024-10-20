package androidx.appcompat.widget;

import X.0FI;
import X.AnonymousClass001;
import X.DKE;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: ActionBarContainer.class */
public class ActionBarContainer extends FrameLayout {
    public Drawable A00;
    public Drawable A01;
    public Drawable A02;
    public boolean A03;
    public boolean A04;
    public int A05;
    public View A06;
    public View A07;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0085, code lost:
    
        if (r304 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ActionBarContainer(android.content.Context r302, android.util.AttributeSet r303) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r2 = r303
            r0.<init>(r1, r2)
            X.DMn r0 = new X.DMn
            r304 = r0
            r0 = r304
            r1 = r301
            r0.<init>(r1)
            r0 = r301
            r1 = r304
            r0.setBackground(r1)
            int[] r0 = X.53Y.A00
            r304 = r0
            r0 = r302
            r1 = r303
            r2 = r304
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2)
            r305 = r0
            r0 = r305
            r1 = 0
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A00 = r1
            r0 = r305
            r1 = 2
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A02 = r1
            r0 = r305
            r1 = 13
            r2 = -1
            int r0 = r0.getDimensionPixelSize(r1, r2)
            r306 = r0
            r0 = r301
            r1 = r306
            r0.A05 = r1
            r0 = r301
            int r0 = r0.getId()
            r307 = r0
            r0 = 2131367517(0x7f0a165d, float:1.8354958E38)
            r306 = r0
            r0 = 1
            r308 = r0
            r0 = r307
            r1 = r306
            if (r0 != r1) goto L6f
            r0 = r301
            r1 = r308
            r0.A03 = r1
            r0 = r305
            r1 = r308
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A01 = r1
        L6f:
            r0 = r305
            r0.recycle()
            r0 = r301
            boolean r0 = r0.A03
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L8f
            r0 = r301
            android.graphics.drawable.Drawable r0 = r0.A01
            r304 = r0
        L84:
            r0 = r304
            if (r0 != 0) goto La0
        L88:
            r0 = r301
            r1 = r308
            r0.setWillNotDraw(r1)
            return
        L8f:
            r0 = r301
            android.graphics.drawable.Drawable r0 = r0.A00
            r304 = r0
            r0 = r304
            if (r0 != 0) goto La0
            r0 = r301
            android.graphics.drawable.Drawable r0 = r0.A02
            r304 = r0
            goto L84
        La0:
            r0 = 0
            r308 = r0
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A00;
        if (drawable != null) {
            DKE.A1I(drawable, this);
        }
        Drawable drawable2 = this.A02;
        if (drawable2 != null) {
            DKE.A1I(drawable2, this);
        }
        Drawable drawable3 = this.A01;
        if (drawable3 != null) {
            DKE.A1I(drawable3, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.A02;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.A01;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        int A06 = 0FI.A06(-1241433528);
        super.onFinishInflate();
        this.A06 = findViewById(2131361866);
        this.A07 = findViewById(2131361881);
        0FI.A0C(-38538374, A06);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (super.onInterceptTouchEvent(r302) != false) goto L6;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r302) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A04
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L15
            r0 = r301
            r1 = r302
            boolean r0 = super.onInterceptTouchEvent(r1)
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L17
        L15:
            r0 = 1
            r303 = r0
        L17:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        if (this.A03) {
            Drawable drawable = this.A01;
            if (drawable == null) {
                return;
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        } else {
            Drawable drawable2 = this.A00;
            if (drawable2 == null) {
                return;
            }
            if (this.A06.getVisibility() == 0) {
                left = this.A06.getLeft();
                top = this.A06.getTop();
                right = this.A06.getRight();
                view = this.A06;
            } else {
                View view2 = this.A07;
                if (view2 == null || view2.getVisibility() != 0) {
                    drawable2.setBounds(0, 0, 0, 0);
                } else {
                    left = this.A07.getLeft();
                    top = this.A07.getTop();
                    right = this.A07.getRight();
                    view = this.A07;
                }
            }
            drawable2.setBounds(left, top, right, view.getBottom());
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = (-1) << (-1);
        if (this.A06 == null && View.MeasureSpec.getMode(i2) == i4 && (i3 = this.A05) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), i4);
        }
        super.onMeasure(i, i2);
        if (this.A06 != null) {
            View.MeasureSpec.getMode(i2);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = 0FI.A05(875077784);
        super.onTouchEvent(motionEvent);
        0FI.A0B(1595383232, A05);
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean A1O = AnonymousClass001.A1O(i);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setVisible(A1O, false);
        }
        Drawable drawable2 = this.A02;
        if (drawable2 != null) {
            drawable2.setVisible(A1O, false);
        }
        Drawable drawable3 = this.A01;
        if (drawable3 != null) {
            drawable3.setVisible(A1O, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (super.verifyDrawable(r302) != false) goto L12;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean verifyDrawable(android.graphics.drawable.Drawable r302) {
        /*
            r301 = this;
            r0 = r301
            android.graphics.drawable.Drawable r0 = r0.A00
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L13
            r0 = r301
            boolean r0 = r0.A03
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L36
        L13:
            r0 = r301
            android.graphics.drawable.Drawable r0 = r0.A01
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L26
            r0 = r301
            boolean r0 = r0.A03
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L36
        L26:
            r0 = r301
            r1 = r302
            boolean r0 = super.verifyDrawable(r1)
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r305
            if (r0 == 0) goto L38
        L36:
            r0 = 1
            r304 = r0
        L38:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.verifyDrawable(android.graphics.drawable.Drawable):boolean");
    }
}
