package com.facebook.widget.hscrollrecyclerview;

import X.1BQ;
import X.1BY;
import X.1Bn;
import X.2O4;
import X.2XA;
import X.2XJ;
import X.2Xd;
import X.C00i;
import X.C00j;
import X.C1oo;
import X.GOn;
import X.GXC;
import X.JDi;
import X.Q2p;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mapbox.mapboxsdk.R;

/* loaded from: HScrollRecyclerView.class */
public class HScrollRecyclerView extends RecyclerView implements View.OnTouchListener, JDi {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public View.OnTouchListener A08;
    public ViewParent A09;
    public LinearLayoutManager A0A;
    public 2XJ A0B;
    public 2O4 A0C;
    public HScrollLinearLayoutManager A0D;
    public JDi A0E;
    public Q2p A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final C00i A0M;

    public HScrollRecyclerView(Context context) {
        this(context, null);
    }

    public HScrollRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HScrollRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0G = true;
        this.A03 = 0;
        this.A04 = 5;
        this.A07 = 0;
        this.A0H = true;
        this.A0I = false;
        this.A0J = true;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A09 = null;
        this.A0C = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A1e);
            this.A0G = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
        HScrollRecyclerView hScrollRecyclerView = null;
        this.A0F = new Q2p(this);
        super.setOnTouchListener(this.A0G ? this : hScrollRecyclerView);
        this.A02 = GOn.A07(context.getResources(), R.dimen.mapbox_locationComponentTrackingInitialMoveThreshold);
        super.A0I = this.A0F;
        this.A06 = -1;
        this.A05 = -1;
        this.A0M = 1BQ.A02(16501);
        HScrollLinearLayoutManager hScrollLinearLayoutManager = (HScrollLinearLayoutManager) 1Bn.A0E(getContext(), (1BY) null, 115780);
        this.A0D = hScrollLinearLayoutManager;
        hScrollLinearLayoutManager.A1p(0);
        A1D(this.A0D);
        HScrollLinearLayoutManager hScrollLinearLayoutManager2 = this.A0D;
        this.A0B = 2XJ.A00(hScrollLinearLayoutManager2, ((LinearLayoutManager) hScrollLinearLayoutManager2).A01);
        setOverScrollMode(2);
        this.A0C = new GXC(this, 8);
        this.A0E = this;
        setNestedScrollingEnabled(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00(boolean z) {
        ViewParent viewParent;
        if (!this.A0I && this.A09 == null) {
            ViewParent parent = getParent();
            while (true) {
                viewParent = parent;
                if (viewParent == 0 || RecyclerView.class.isInstance(viewParent)) {
                    break;
                } else {
                    parent = viewParent.getParent();
                }
            }
            this.A09 = (ViewParent) ((View) viewParent);
            this.A0I = true;
        }
        ViewParent viewParent2 = this.A09;
        if (viewParent2 != null) {
            viewParent2.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void A0u(int i) {
        super.A0u(i);
        this.A03 = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void A0w(int i) {
        super.A0w(i);
        this.A03 = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void A16(2Xd r302) {
        this.A05 = -1;
        this.A06 = -1;
        if (r302 != null) {
            r302.hashCode();
        }
        super.A16(r302);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if ((r302 instanceof androidx.recyclerview.widget.LinearLayoutManager) != false) goto L6;
     */
    @Override // androidx.recyclerview.widget.RecyclerView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1D(X.2XA r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L12
            r0 = r302
            boolean r0 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L15
        L12:
            r0 = 1
            r305 = r0
        L15:
            java.lang.String r0 = "SnapRecyclerView only supports LinearLayoutManager"
            r306 = r0
            r0 = r305
            r1 = r306
            X.C0By.A05(r0, r1)
            r0 = r301
            r1 = r302
            super.A1D(r1)
            r0 = r302
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A0A = r1
            r0 = r302
            if (r0 == 0) goto L38
            r0 = r302
            int r0 = r0.A01
            r303 = r0
        L38:
            r0 = r301
            r1 = r303
            r0.A07 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.hscrollrecyclerview.HScrollRecyclerView.A1D(X.2XA):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void A1H(2O4 r302) {
        this.A0C = r302;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.A07 != 0) {
            z = super.dispatchTouchEvent(motionEvent);
        } else {
            int action = motionEvent.getAction();
            z = false;
            if (action == 0) {
                this.A00 = motionEvent.getX();
                this.A01 = motionEvent.getY();
                this.A0K = canScrollHorizontally(1);
                float f = 0.0f / 0.0f;
                this.A0L = canScrollHorizontally(-1);
                this.A0H = true;
                this.A0J = true;
                A00(true);
            } else if (action != 2) {
                if (action == 3) {
                    this.A0J = true;
                    A00(false);
                }
            } else if (this.A0H) {
                float x = motionEvent.getX() - this.A00;
                float y = motionEvent.getY() - this.A01;
                float abs = Math.abs(x);
                float f2 = this.A04;
                if (abs > f2) {
                    this.A0H = false;
                    this.A0J = x > 0.0f ? this.A0L : this.A0K;
                    ViewParent viewParent = this.A09;
                    if (viewParent != null) {
                        float abs2 = Math.abs(y);
                        if (abs2 <= f2 || abs2 <= abs) {
                            int A1g = this.A0A.A1g();
                            int A1i = this.A0A.A1i();
                            if ((x <= 0.0f || A1g != 0) && (x >= 0.0f || A1i != this.A0A.A0V() - 1)) {
                                z2 = true;
                                viewParent.requestDisallowInterceptTouchEvent(z2);
                            }
                        }
                        z2 = false;
                        viewParent.requestDisallowInterceptTouchEvent(z2);
                    }
                }
                A00(false);
            }
            if (this.A0J && super.dispatchTouchEvent(motionEvent)) {
                return true;
            }
        }
        return z;
    }

    public int getOffset() {
        2XJ r0 = this.A0B;
        int i = 0;
        if (r0 != null && getChildCount() != 0) {
            i = r0.A0B(getChildAt(0)) - r0.A06();
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C00j.A05("HScrollRecyclerView.onLayout", -821164969);
        try {
            super.onLayout(z, i, i2, i3, i4);
            C00j.A01(-449980715);
        } catch (Throwable th) {
            C00j.A01(-339171426);
            throw th;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            int width = getWidth() / 2;
            int i = (-1) >>> 1;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i3);
                if (GOn.A05(width, childAt.getRight() - (childAt.getWidth() / 2)) < i) {
                    i = GOn.A05(width, childAt.getRight() - (childAt.getWidth() / 2));
                    this.A03 = 2XA.A0G(childAt);
                }
                i2 = i3 + 1;
            }
        }
        View.OnTouchListener onTouchListener = this.A08;
        boolean z = false;
        if (onTouchListener != null) {
            z = false | onTouchListener.onTouch(view, motionEvent);
        }
        return z;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.A08 = onTouchListener;
    }
}
