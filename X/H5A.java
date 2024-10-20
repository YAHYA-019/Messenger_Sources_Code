package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Scroller;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.popover.SimplePopoverFragment;

/* loaded from: H5A.class */
public final class H5A extends CustomFrameLayout implements C5eb, C5ec {
    public Handler A00;
    public C5ed A01;
    public C00i A02;
    public C00i A03;
    public C00i A04;
    public RHX A05;
    public Integer A06;
    public boolean A07;
    public boolean A08;
    public Integer A09;
    public final Runnable A0A;

    public H5A(Context context) {
        super(context);
        this.A08 = false;
        Context context2 = getContext();
        this.A04 = 7zL.A0R(context2, 116043);
        this.A03 = 7zL.A0R(context2, 116044);
        this.A09 = null;
        this.A05 = null;
        this.A0A = new Ipi(this);
        this.A06 = 0S2.A00;
        this.A07 = true;
        this.A02 = 1BQ.A00();
        this.A01 = (C5ed) 1Bn.A0E(context, (1BY) null, 116042);
        this.A00 = (Handler) 1Bn.A0A(16430);
        C5ed c5ed = this.A01;
        c5ed.getClass();
        c5ed.A07 = this;
        C5ed c5ed2 = this.A01;
        c5ed2.getClass();
        c5ed2.A08 = this;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C1oo.A0f, 0, 0);
        int i = obtainStyledAttributes.getInt(0, 8);
        int i2 = obtainStyledAttributes.getInt(1, 0);
        C5ed c5ed3 = this.A01;
        c5ed3.getClass();
        c5ed3.A0D = 0S2.A00(2)[i2];
        obtainStyledAttributes.recycle();
        C5ed c5ed4 = this.A01;
        c5ed4.getClass();
        c5ed4.A04 = i;
    }

    private boolean A00(View view, Integer num, int i, int i2, int i3, int i4, boolean z) {
        boolean A02;
        int i5;
        if (num == 0S2.A0C || num == 0S2.A0N) {
            C00i c00i = this.A02;
            if (((2yD) 4YU.A0p(c00i)).AZk(36310860425856366L)) {
                A02 = FAj.A02(view, num, i3, i4, false, false, ((2yD) 4YU.A0p(c00i)).AZk(36310860427494773L));
                return A02;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount() - 1;
            while (true) {
                int i6 = childCount;
                if (i6 < 0) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i6);
                int i7 = i3 + scrollX;
                if (i7 >= childAt.getLeft() && i7 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && A00(childAt, num, i, i2, i7 - childAt.getLeft(), i5 - childAt.getTop(), true)) {
                    return true;
                }
                childCount = i6 - 1;
            }
        }
        A02 = false;
        if (z) {
            if (i != 0) {
                return view.canScrollHorizontally(-i);
            }
            if (i2 != 0) {
                return view.canScrollVertically(-i2);
            }
        }
        return A02;
    }

    private void A0V(int i, int i2) {
        C00i c00i = this.A04;
        if (!((Scroller) 4YU.A0p(c00i)).isFinished()) {
            ((Scroller) 4YU.A0p(c00i)).abortAnimation();
        }
        int scrollX = getScrollX();
        int i3 = i - scrollX;
        int scrollY = getScrollY();
        ((Scroller) 4YU.A0p(this.A04)).startScroll(scrollX, scrollY, i3, i2 - scrollY, (int) (Math.abs(Math.max(Math.abs(i3), Math.abs(r0))) * ((HQG) 4YU.A0p(this.A03)).A00));
        invalidate();
    }

    private void A0W(int i, int i2, boolean z) {
        if (z) {
            this.A08 = true;
            super.scrollTo(i, i2);
            this.A08 = false;
            postInvalidate();
        } else {
            super.scrollTo(i, i2);
        }
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        Integer num = this.A06;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        C5ed c5ed = this.A01;
        c5ed.getClass();
        Integer num2 = c5ed.A0B;
        Integer num3 = 0S2.A0C;
        if (num2 != num3 && !(!((Scroller) 4YU.A0p(this.A04)).isFinished())) {
            if (Math.abs(scrollX) >= width || Math.abs(scrollY) >= height) {
                if (num != num3) {
                    this.A06 = num3;
                    RHX rhx = this.A05;
                    if (rhx != null) {
                        SimplePopoverFragment simplePopoverFragment = rhx.A00;
                        ((C1is) simplePopoverFragment.A0B.get()).A0E("swipe_back");
                        ((2Kv) simplePopoverFragment.A0C.get()).A09("click_point", "swipe_back");
                        simplePopoverFragment.A0o();
                        return;
                    }
                    Context context = getContext();
                    if (context == null || !(context instanceof Activity)) {
                        return;
                    }
                    ((Activity) context).finish();
                    return;
                }
                return;
            }
            if (scrollX == 0 && scrollY == 0) {
                Integer num4 = 0S2.A00;
                if (num != num4) {
                    this.A06 = num4;
                    return;
                }
                return;
            }
        }
        this.A06 = 0S2.A01;
        if (z) {
            Handler handler = this.A00;
            handler.getClass();
            handler.post(this.A0A);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // X.C5ec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BWn(float r302, float r303) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.getScrollX()
            r304 = r0
            r0 = r301
            int r0 = r0.getScrollY()
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r304
            if (r0 >= 0) goto L2f
            r0 = r304
            int r0 = java.lang.Math.abs(r0)
            r307 = r0
            r0 = r307
            float r0 = (float) r0
            r303 = r0
        L1f:
            r0 = r303
            r1 = r302
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r307 = r0
        L24:
            r0 = r307
            if (r0 > 0) goto L2c
            r0 = 1
            r306 = r0
        L2c:
            r0 = r306
            return r0
        L2f:
            r0 = r304
            if (r0 <= 0) goto L47
            r0 = r301
            int r0 = r0.getWidth()
            r1 = r304
            int r0 = r0 - r1
            r307 = r0
            r0 = r307
            float r0 = (float) r0
            r303 = r0
        L3f:
            r0 = r302
            r1 = r303
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r307 = r0
            goto L24
        L47:
            r0 = r305
            if (r0 >= 0) goto L5a
            r0 = r305
            int r0 = java.lang.Math.abs(r0)
            r307 = r0
            r0 = r307
            float r0 = (float) r0
            r302 = r0
            goto L3f
        L5a:
            r0 = r305
            if (r0 <= 0) goto L6f
            r0 = r301
            int r0 = r0.getHeight()
            r1 = r305
            int r0 = r0 - r1
            r307 = r0
            r0 = r307
            float r0 = (float) r0
            r302 = r0
            goto L1f
        L6f:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H5A.BWn(float, float):boolean");
    }

    @Override // X.C5eb
    public void Bv0() {
        this.A06 = 0S2.A00;
    }

    @Override // X.C5eb
    public void Bv1(float f, float f2) {
        int height;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i = 0;
        if (scrollX != 0) {
            i = getWidth();
            if (Math.abs(scrollX) <= i / 2) {
                i = 0;
            } else if (scrollX < 0) {
                i = -i;
            }
        } else if (scrollY != 0) {
            height = getHeight();
            if (Math.abs(scrollY) > height / 2) {
                if (scrollY < 0) {
                    height = -height;
                }
                A0V(i, height);
            }
        }
        height = 0;
        A0V(i, height);
    }

    @Override // X.C5eb
    public void Bv2(Integer num, float f, float f2, int i) {
        int height;
        int i2;
        String str;
        C5ed c5ed = this.A01;
        c5ed.getClass();
        if (!HHM.A00(num, c5ed.A04)) {
            A0V(0, 0);
            return;
        }
        Context context = getContext();
        FbUserSession A0C = 4YV.A0C(context);
        int intValue = num.intValue();
        if (intValue == 0) {
            if (getScrollY() > 0) {
                height = getHeight();
                getScrollY();
                getHeight();
                getHeight();
                getScrollY();
                i2 = 0;
            }
            height = 0;
            getScrollY();
            getHeight();
            getHeight();
            getScrollY();
            i2 = 0;
        } else if (intValue == 1) {
            if (getScrollY() < 0) {
                height = -getHeight();
                getScrollY();
                getHeight();
                getHeight();
                getScrollY();
                i2 = 0;
            }
            height = 0;
            getScrollY();
            getHeight();
            getHeight();
            getScrollY();
            i2 = 0;
        } else if (intValue == 2) {
            if (getScrollX() > 0) {
                i2 = getWidth();
                getScrollX();
                getWidth();
                getWidth();
                getScrollX();
                height = 0;
            }
            i2 = 0;
            getScrollX();
            getWidth();
            getWidth();
            getScrollX();
            height = 0;
        } else if (intValue != 3) {
            i2 = 0;
            height = 0;
        } else {
            if (getScrollX() < 0) {
                i2 = -getWidth();
                getScrollX();
                getWidth();
                getWidth();
                getScrollX();
                height = 0;
            }
            i2 = 0;
            getScrollX();
            getWidth();
            getWidth();
            getScrollX();
            height = 0;
        }
        1UG A08 = 1BK.A08((04J) 1Bi.A03(16634), "navigation_gesture");
        2Kq r0 = (2Kq) 1Lo.A04(context, A0C, (1BY) null, 65959);
        if (A08.isSampled()) {
            A08.A7R(AbstractC00603o4.A00(416), r0.A08().toString());
            A08.A09("committed");
            A08.A7R("gesture", "swipe");
            switch (num.intValue()) {
                case 1:
                    str = "DOWN";
                    break;
                case 2:
                    str = "LEFT";
                    break;
                case 3:
                    str = "RIGHT";
                    break;
                default:
                    str = "UP";
                    break;
            }
            A08.A7R("direction", str);
            A08.BZL();
        }
        A0V(i2, height);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r302 == X.0S2.A0N) goto L8;
     */
    @Override // X.C5eb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Bv4(java.lang.Integer r302, float r303, float r304) {
        /*
            r301 = this;
            r0 = r301
            java.lang.Integer r0 = r0.A09
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L75
            java.lang.Integer r0 = X.0S2.A0C
            r305 = r0
            r0 = r302
            r1 = r305
            if (r0 == r1) goto L27
            java.lang.Integer r0 = X.0S2.A0N
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = 0
            r305 = r0
            r0 = r302
            r1 = r306
            if (r0 != r1) goto L2a
        L27:
            r0 = 1
            r307 = r0
        L2a:
            r0 = r307
            if (r0 == 0) goto L84
            r0 = r301
            int r0 = r0.getScrollX()
            r308 = r0
            r0 = r303
            int r0 = (int) r0
            r307 = r0
            r0 = r308
            r1 = r307
            int r0 = r0 - r1
            r308 = r0
            r0 = r301
            java.lang.Integer r0 = r0.A09
            r305 = r0
            r0 = r305
            int r0 = r0.intValue()
            r309 = r0
            r0 = 2
            r307 = r0
            r0 = r309
            r1 = r307
            if (r0 == r1) goto L76
            r0 = 3
            r307 = r0
            r0 = r309
            r1 = r307
            if (r0 != r1) goto L7e
            r0 = r308
            if (r0 <= 0) goto L7e
        L66:
            r0 = 0
            r310 = r0
        L69:
            r0 = 0
            r308 = r0
        L6c:
            r0 = r301
            r1 = r308
            r2 = r310
            r3 = 0
            r0.A0W(r1, r2, r3)
        L75:
            return
        L76:
            r0 = r308
            if (r0 >= 0) goto L7e
            goto L66
        L7e:
            r0 = 0
            r310 = r0
            goto L6c
        L84:
            r0 = r301
            int r0 = r0.getScrollY()
            r310 = r0
            r0 = r304
            int r0 = (int) r0
            r307 = r0
            r0 = r310
            r1 = r307
            int r0 = r0 - r1
            r310 = r0
            r0 = r301
            java.lang.Integer r0 = r0.A09
            r305 = r0
            r0 = r305
            int r0 = r0.intValue()
            r309 = r0
            r0 = r309
            r1 = 0
            if (r0 == r1) goto Lba
            r0 = 1
            r307 = r0
            r0 = r309
            r1 = r307
            if (r0 != r1) goto L69
            r0 = r310
            if (r0 <= 0) goto L69
            goto L66
        Lba:
            r0 = r310
            if (r0 >= 0) goto L69
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H5A.Bv4(java.lang.Integer, float, float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r302 == X.0S2.A0N) goto L6;
     */
    @Override // X.C5eb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Bv5(java.lang.Integer r302, float r303, float r304) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H5A.Bv5(java.lang.Integer, float, float):boolean");
    }

    @Override // X.C5ec
    public boolean Cxp(float f, float f2) {
        return !((Scroller) 4YU.A0p(this.A04)).isFinished();
    }

    @Override // android.view.View
    public void computeScroll() {
        C00i c00i = this.A04;
        if (((Scroller) 4YU.A0p(c00i)).computeScrollOffset()) {
            int currX = ((Scroller) 4YU.A0p(c00i)).getCurrX();
            int currY = ((Scroller) 4YU.A0p(c00i)).getCurrY();
            if (currX == ((Scroller) 4YU.A0p(c00i)).getFinalX() && currY == ((Scroller) 4YU.A0p(c00i)).getFinalY()) {
                ((Scroller) 4YU.A0p(c00i)).abortAnimation();
            }
            A0W(currX, currY, true);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        if (this.A08) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.View
    public void invalidate(int i, int i2, int i3, int i4) {
        if (this.A08) {
            return;
        }
        super.invalidate(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        if (this.A08) {
            return;
        }
        super.invalidate(rect);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(337005603);
        Handler handler = this.A00;
        handler.getClass();
        handler.removeCallbacks(this.A0A);
        super.onDetachedFromWindow();
        0FI.A0C(1909322779, A06);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.A07 && motionEvent.getPointerCount() <= 1) {
            C5ed c5ed = this.A01;
            c5ed.getClass();
            z = C5ed.A02(motionEvent, c5ed);
        }
        return z;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A05 = 0FI.A05(1406823630);
        boolean z = false;
        if (!this.A07) {
            i = -1113664877;
        } else if (motionEvent.getPointerCount() > 1) {
            i = 600903144;
        } else {
            C5ed c5ed = this.A01;
            c5ed.getClass();
            z = C5ed.A03(motionEvent, c5ed);
            i = 1265140505;
        }
        0FI.A0B(i, A05);
        return z;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        A0W(i, i2, false);
    }
}
