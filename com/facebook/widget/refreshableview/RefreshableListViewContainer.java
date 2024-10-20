package com.facebook.widget.refreshableview;

import X.0FI;
import X.0Pz;
import X.0S2;
import X.0fH;
import X.4YV;
import X.AbstractC2327GOs;
import X.C00i;
import X.C00j;
import X.C1oo;
import X.C6mr;
import X.DKC;
import X.DKD;
import X.FsM;
import X.GDV;
import X.GXC;
import X.IL5;
import X.Iun;
import X.JHI;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.widget.recyclerview.BetterRecyclerView;

/* loaded from: RefreshableListViewContainer.class */
public class RefreshableListViewContainer extends ViewGroup {
    public double A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public Rect A0E;
    public Rect A0F;
    public Rect A0G;
    public Handler A0H;
    public VelocityTracker A0I;
    public Scroller A0J;
    public Integer A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public int A0O;
    public C6mr A0P;
    public GDV A0Q;
    public Runnable A0R;
    public final C00i A0S;

    public RefreshableListViewContainer(Context context) {
        super(context);
        this.A0S = AbstractC2327GOs.A0E(this);
        this.A0E = DKC.A0C();
        this.A0N = true;
        A05(context, null);
        this.A0F = DKC.A0C();
        this.A0G = DKC.A0C();
    }

    public RefreshableListViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0S = AbstractC2327GOs.A0E(this);
        this.A0E = DKC.A0C();
        this.A0N = true;
        A05(context, attributeSet);
        this.A0F = DKC.A0C();
        this.A0G = DKC.A0C();
    }

    public RefreshableListViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0S = AbstractC2327GOs.A0E(this);
        this.A0E = DKC.A0C();
        this.A0N = true;
        A05(context, attributeSet);
        this.A0F = DKC.A0C();
        this.A0G = DKC.A0C();
    }

    private int A00() {
        int measuredHeight = A02().getMeasuredHeight();
        if (measuredHeight <= 0) {
            A02().measure(0, 0);
            measuredHeight = A02().getMeasuredHeight();
        }
        return measuredHeight;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if ((r0 instanceof java.lang.ref.WeakReference) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private X.C6mr A01() {
        /*
            r301 = this;
            r0 = r301
            X.6mr r0 = r0.A0P
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L48
            r0 = r301
            android.view.View r0 = r0.A0B()
            r303 = r0
            r0 = 2131367126(0x7f0a14d6, float:1.8354165E38)
            r304 = r0
            r0 = r303
            r1 = r304
            java.lang.Object r0 = r0.getTag(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L2d
            r0 = r305
            boolean r0 = r0 instanceof java.lang.ref.WeakReference
            r306 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = r306
            if (r0 == 0) goto L2f
        L2d:
            r0 = 1
            r304 = r0
        L2f:
            r0 = r304
            com.google.common.base.Preconditions.checkState(r0)
            r0 = r305
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L4a
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L43:
            r0 = r301
            r1 = r302
            r0.A0P = r1
        L48:
            r0 = r302
            return r0
        L4a:
            r0 = r305
            java.lang.Object r0 = r0.get()
            X.6mr r0 = (X.C6mr) r0
            r302 = r0
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.refreshableview.RefreshableListViewContainer.A01():X.6mr");
    }

    private RefreshableViewItem A02() {
        if (getChildCount() <= 0) {
            return null;
        }
        return (RefreshableViewItem) getChildAt(1);
    }

    private void A03() {
        if (this.A0J.computeScrollOffset()) {
            this.A03 = this.A0J.getCurrY();
            if (!this.A0J.isFinished()) {
                invalidate();
            }
        }
        if (this.A0K == 0S2.A15 && this.A02 < 1.0E-4f && this.A03 < 1.0E-4f) {
            A06(this, 0S2.A00);
        }
        float f = this.A02;
        float f2 = this.A03;
        if (f != f2) {
            int i = (int) (f2 - f);
            if (i == 0) {
                return;
            }
            float f3 = f + i;
            boolean z = true;
            int i2 = 0;
            boolean A1U = DKD.A1U((f > 1.0E-4f ? 1 : (f == 1.0E-4f ? 0 : -1)));
            if (f3 >= 1.0E-4f) {
                z = false;
            }
            if (A1U != z) {
                if (f3 < 1.0E-4f) {
                    i2 = 4;
                }
                A02().setVisibility(i2);
            }
            this.A02 = f3;
            A0B().offsetTopAndBottom(i);
            (getChildCount() <= 0 ? null : getChildAt(0)).offsetTopAndBottom(i);
            int bottom = (getChildCount() <= 0 ? null : getChildAt(0)).getBottom();
            int bottom2 = A02().getBottom();
            View requireViewById = A02().requireViewById(2131366751);
            int height = requireViewById.getHeight() + bottom2;
            int bottom3 = requireViewById.getBottom();
            requireViewById.offsetTopAndBottom((bottom >= height ? height - bottom3 : bottom - bottom3) - 1);
            View requireViewById2 = A02().requireViewById(2131366750);
            int top = requireViewById2.getTop();
            requireViewById2.offsetTopAndBottom(bottom >= bottom2 ? (bottom2 - top) - 1 : (bottom - top) - 1);
        } else if (!this.A0J.isFinished() || this.A0K != 0S2.A0u || this.A02 == A00()) {
            return;
        } else {
            A07(true);
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A04(float r302) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.refreshableview.RefreshableListViewContainer.A04(float):void");
    }

    private void A05(Context context, AttributeSet attributeSet) {
        this.A0J = new Scroller(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A2E);
        this.A0B = obtainStyledAttributes.getInt(0, 0);
        Resources resources = getResources();
        this.A09 = (int) (resources.getDisplayMetrics().density * 5.0f);
        this.A08 = resources.getDimension(2132279315);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C1oo.A2G);
        this.A0C = (int) obtainStyledAttributes2.getDimension(0, 0.0f);
        obtainStyledAttributes2.recycle();
        this.A0D = ViewConfiguration.get(context).getScaledTouchSlop();
        this.A0Q = new FsM(this, 5);
        this.A0R = new Iun(this);
    }

    public static void A06(RefreshableListViewContainer refreshableListViewContainer, Integer num) {
        if (num != refreshableListViewContainer.A0K) {
            refreshableListViewContainer.A0K = num;
            RefreshableViewItem A02 = refreshableListViewContainer.A02();
            int i = refreshableListViewContainer.A0B;
            if (i != A02.A01) {
                A02.A01 = i;
            }
            if (num == 0S2.A00) {
                if (i == 0) {
                    num = 0S2.A01;
                } else {
                    if (i != 1) {
                        throw 0Pz.A04("Unknown direction: ", i);
                    }
                    num = 0S2.A0C;
                }
            }
            A02.A0B = num;
        }
    }

    private void A07(boolean z) {
        Integer num = this.A0K;
        if (num == 0S2.A0u) {
            int i = (int) this.A03;
            this.A0J.startScroll(0, i, 0, A00() - i, 500);
            return;
        }
        if (num == 0S2.A00 || num == 0S2.A15 || (A08() && this.A02 + 0.0f < A00())) {
            float A00 = A00() + this.A0O;
            float f = this.A03;
            int max = Math.max((int) ((f / A00) * 1200.0f), 300);
            int i2 = (int) f;
            int i3 = (int) (A00 * 0.05f);
            if (i2 < i3) {
                max = (max * i2) / i3;
            }
            this.A0J.startScroll(0, i2, 0, -i2, max);
        } else if (A08() && this.A02 + 0.0f >= A00() && !z) {
            A0C();
            return;
        } else if (!A08() || !z) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0 == X.0S2.A1G) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A08() {
        /*
            r301 = this;
            r0 = r301
            java.lang.Integer r0 = r0.A0K
            r302 = r0
            java.lang.Integer r0 = X.0S2.A0Y
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L1c
            java.lang.Integer r0 = X.0S2.A1G
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L1f
        L1c:
            r0 = 1
            r305 = r0
        L1f:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.refreshableview.RefreshableListViewContainer.A08():boolean");
    }

    private boolean A09(MotionEvent motionEvent) {
        View A0B = A0B();
        if (A0B == null) {
            return false;
        }
        if (A0B.getVisibility() != 0 || A0B.getAnimation() != null) {
            return true;
        }
        float x = motionEvent.getX();
        float scrollX = x + getScrollX();
        float y = motionEvent.getY() + getScrollY();
        int i = (int) scrollX;
        int i2 = (int) y;
        if (motionEvent.getActionMasked() == 0) {
            Rect rect = this.A0E;
            A0B.getHitRect(rect);
            this.A0M = rect.contains(i, i2);
        }
        if (!this.A0M) {
            return true;
        }
        float left = scrollX - A0B.getLeft();
        float top = y - A0B.getTop();
        this.A05 = left;
        this.A06 = top;
        motionEvent.setLocation(left, top);
        return A0A(A0B, motionEvent);
    }

    public static boolean A0A(View view, MotionEvent motionEvent) {
        try {
            return view.dispatchTouchEvent(motionEvent);
        } catch (ArrayIndexOutOfBoundsException e) {
            0fH.A0K(RefreshableListViewContainer.class, "Caught and ignoring ArrayIndexOutOfBoundsException", e);
            return true;
        }
    }

    private View A0B() {
        if (getChildCount() <= 0) {
            return null;
        }
        return getChildAt(2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        if ((r0 instanceof java.lang.ref.WeakReference) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0D(float r302) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.refreshableview.RefreshableListViewContainer.A0D(float):boolean");
    }

    public void A0C() {
        int i = (int) this.A03;
        int i2 = this.A0B;
        int A00 = A00();
        if (i2 != 0) {
            A00 = -A00;
        }
        this.A0J.startScroll(0, i, 0, A00 - i, 500);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        A03();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.LayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        int A06 = 0FI.A06(882790187);
        View A0B = A0B();
        if (A0B instanceof JHI) {
            A0B().A6u(new IL5(this, 5));
        } else if (A0B instanceof BetterRecyclerView) {
            ((RecyclerView) A0B()).A1F(new GXC(this, 9));
        }
        0FI.A0C(-1563020053, A06);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() == 3) {
            C00j.A05("RefreshableListViewContainer.onLayout", 713586358);
            try {
                int i5 = this.A0B;
                if (i5 == 0) {
                    int i6 = i3 - i;
                    A0B().layout(0, 0, i6, i4 - i2);
                    A00();
                    int i7 = this.A0C;
                    A02().layout(0, i7, i6, A00() + i7);
                    (getChildCount() <= 0 ? null : getChildAt(0)).layout(0, i7 - this.A0O, i6, i7);
                } else {
                    if (i5 != 1) {
                        throw 4YV.A0h("Unknown direction: ", i5);
                    }
                    int i8 = i4 - i2;
                    int i9 = i3 - i;
                    A0B().layout(0, 0, i9, i8);
                    A00();
                    A02().layout(0, A00() + i8, i9, i8);
                    (getChildCount() <= 0 ? null : getChildAt(0)).layout(0, i8, i9, this.A0O + i8);
                }
                if (this.A02 >= 1.0E-4f) {
                    A02().setVisibility(4);
                }
                this.A02 = 0.0f;
                A03();
                C00j.A01(34203249);
            } catch (Throwable th) {
                C00j.A01(1242608381);
                throw th;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C00j.A05("RefreshableListViewContainer.onMeasure", -704144299);
        try {
            int childCount = getChildCount();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                measureChild(childAt, i, i2);
                i4 = Math.max(i4, childAt.getMeasuredWidth());
                i3 = Math.max(i3, childAt.getMeasuredHeight());
            }
            setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
            this.A0O = (getChildCount() <= 0 ? null : getChildAt(0)).getMeasuredHeight();
            C00j.A01(469276647);
        } catch (Throwable th) {
            C00j.A01(1354421880);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        if (r0 != 3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0654, code lost:
    
        if (r0 == X.0S2.A1G) goto L157;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 1706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.refreshableview.RefreshableListViewContainer.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        RefreshableViewItem A02 = A02();
        if (A02 != null) {
            A02.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        RefreshableViewItem A02 = A02();
        if (A02 != null) {
            A02.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setVerticalScrollBarEnabled(boolean z) {
        this.A0N = z;
    }
}
