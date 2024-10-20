package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import kotlin.jvm.functions.Function1;

/* renamed from: X.JeA, reason: case insensitive filesystem */
/* loaded from: JeA.class */
public final class C2945JeA extends JY7 {
    public static final Function1 A0I = M61.A00;
    public KMW A00;
    public MBn A01;
    public Kr9 A02;
    public Object A03;
    public C00m A04;
    public boolean A05;
    public L4J A06;
    public final Rect A07;
    public final View A08;
    public final WindowManager.LayoutParams A09;
    public final WindowManager A0A;
    public final MN4 A0B;
    public final MN4 A0C;
    public final MN4 A0D;
    public final MEE A0E;
    public final L3H A0F;
    public final MEX A0G;
    public final int[] A0H;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C2945JeA(android.view.View r302, X.MNh r303, X.MBn r304, X.Kr9 r305, java.util.UUID r306, X.C00m r307) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2945JeA.<init>(android.view.View, X.MNh, X.MBn, X.Kr9, java.util.UUID, X.00m):void");
    }

    public static final void A00(C2945JeA c2945JeA) {
        MKq mKq = (MKq) c2945JeA.A0C.getValue();
        if (mKq == null || !mKq.BQl()) {
            return;
        }
        long BB7 = mKq.BB7();
        long BZE = mKq.BZE(0L);
        long A0S = JR1.A0S(Math.round(DKH.A00(BZE)), Math.round(JR1.A02(BZE)));
        int i = (int) (A0S >> 32);
        int i2 = (int) (A0S & 4294967295L);
        L4J l4j = new L4J(i, i2, i + ((int) (BB7 >> 32)), ((int) (BB7 & 4294967295L)) + i2);
        if (l4j.equals(c2945JeA.A06)) {
            return;
        }
        c2945JeA.A06 = l4j;
        c2945JeA.A07();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A03(int i, int i2) {
        Context context = getContext();
        int A03 = GOn.A03(4YU.A0B(context).screenWidthDp, 7zO.A0I(context).density);
        int i3 = (-1) << (-1);
        super.A03(View.MeasureSpec.makeMeasureSpec(A03, i3), View.MeasureSpec.makeMeasureSpec(GOn.A03(4YU.A0B(context).screenHeightDp, 7zO.A0I(context).density), i3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A06(boolean z, int i, int i2, int i3, int i4) {
        super.A06(z, i, i2, i3, i4);
        View A0V = JQx.A0V(this);
        if (A0V != null) {
            WindowManager.LayoutParams layoutParams = this.A09;
            ((ViewGroup.LayoutParams) layoutParams).width = A0V.getMeasuredWidth();
            ((ViewGroup.LayoutParams) layoutParams).height = A0V.getMeasuredHeight();
            this.A0A.updateViewLayout(this, layoutParams);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.0Pn, java.lang.Object] */
    public final void A07() {
        KsS ksS;
        L4J l4j = this.A06;
        if (l4j == null || (ksS = (KsS) this.A0D.getValue()) == null) {
            return;
        }
        long j = ksS.A00;
        Rect rect = this.A07;
        MEX mex = this.A0G;
        this.A08.getWindowVisibleDisplayFrame(rect);
        long A0S = JR1.A0S(rect.right - rect.left, rect.bottom - rect.top);
        ?? obj = new Object();
        ((0Pn) obj).element = 0L;
        this.A0F.A02(this, new M15(0, A0S, j, this, obj, l4j), A0I);
        WindowManager.LayoutParams layoutParams = this.A09;
        long j2 = ((0Pn) obj).element;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        mex.CpF(this, (int) (A0S >> 32), (int) (A0S & 4294967295L));
        this.A0A.updateViewLayout(this, layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A08(KMW kmw, Kr9 kr9, C00m c00m) {
        WindowManager.LayoutParams layoutParams;
        this.A04 = c00m;
        if (!11T.A0O(this.A02, kr9)) {
            this.A02 = kr9;
            WindowManager.LayoutParams layoutParams2 = this.A09;
            ViewGroup.LayoutParams layoutParams3 = this.A08.getRootView().getLayoutParams();
            layoutParams2.flags = (!(layoutParams3 instanceof WindowManager.LayoutParams) || (layoutParams = (WindowManager.LayoutParams) layoutParams3) == null || (layoutParams.flags & 8192) == 0) ? kr9.A00 & (-8193) : kr9.A00 | 8192;
            this.A0A.updateViewLayout(this, layoutParams2);
        }
        int ordinal = kmw.ordinal();
        int i = 1;
        if (ordinal == 0) {
            i = 0;
        } else if (ordinal != 1) {
            throw 1BK.A1F();
        }
        super/*android.view.View*/.setLayoutDirection(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && getKeyDispatcherState() != null) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                C00m c00m = this.A04;
                if (c00m != null) {
                    c00m.invoke();
                    return true;
                }
            }
            return true;
        }
        return super/*android.view.ViewGroup*/.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(2139524641);
        super.onAttachedToWindow();
        L3H l3h = this.A0F;
        l3h.A00 = LCW.A01(l3h.A08);
        if (Build.VERSION.SDK_INT >= 33) {
            Object obj = this.A03;
            if (obj == null) {
                obj = L9D.A00(this.A04);
                this.A03 = obj;
            }
            L9D.A01(this, obj);
        }
        0FI.A0C(-723691854, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-335423979);
        super/*android.view.ViewGroup*/.onDetachedFromWindow();
        L3H l3h = this.A0F;
        MEH meh = l3h.A00;
        if (meh != null) {
            meh.dispose();
        }
        l3h.A01();
        if (Build.VERSION.SDK_INT >= 33) {
            L9D.A02(this, this.A03);
        }
        this.A03 = null;
        0FI.A0C(1433102861, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A05 = 0FI.A05(-958499268);
        boolean z = true;
        if (motionEvent != null) {
            if (motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= DKC.A02(this) || motionEvent.getY() < 0.0f || motionEvent.getY() >= DKC.A03(this))) {
                C00m c00m = this.A04;
                if (c00m != null) {
                    c00m.invoke();
                }
                i = -240948272;
            } else if (motionEvent.getAction() == 4) {
                C00m c00m2 = this.A04;
                if (c00m2 != null) {
                    c00m2.invoke();
                }
                i = -2012280296;
            }
            0FI.A0B(i, A05);
            return z;
        }
        z = super/*android.view.View*/.onTouchEvent(motionEvent);
        i = 1611794680;
        0FI.A0B(i, A05);
        return z;
    }

    public void setLayoutDirection(int i) {
    }
}
