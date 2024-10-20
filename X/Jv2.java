package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* loaded from: Jv2.class */
public final class Jv2 extends JYc implements 0Cm, MCR {
    public final 0Co A00;
    public final LYC A01;
    public final E8b A02;

    /* JADX WARN: Multi-variable type inference failed */
    public Jv2(Context context) {
        super(context);
        E8e e8e = new E8e(context);
        this.A02 = e8e;
        this.A01 = new LYC(context, e8e);
        this.A00 = new 0Co(this);
        addView(e8e, new FrameLayout.LayoutParams(-1, -1));
        e8e.setClipChildren(false);
        e8e.setClipToPadding(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A00.A06(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.A00.A05(f, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-693561667);
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        this.A00.A04(true);
        0FI.A0C(-1256077085, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(117138133);
        this.A00.A04(false);
        this.A01.A06();
        super/*android.view.ViewGroup*/.onDetachedFromWindow();
        0FI.A0C(1902566735, A06);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A01.A0P;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = 0FI.A05(404208463);
        11T.A0F(motionEvent, 0);
        LYC lyc = this.A01;
        ViewParent parent = getParent();
        if (!lyc.A0Q || motionEvent.getPointerCount() == 2 || lyc.A0L != 0S2.A00) {
            Jv2 jv2 = lyc.A0G;
            if (jv2 == null) {
                throw 1BK.A0h();
            }
            jv2.A00.A07(0, 0);
            if (lyc.A0Q) {
                lyc.A0U.onTouchEvent(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                if ((actionMasked == 1 || actionMasked == 3) && lyc.A0L == 0S2.A0C) {
                    03Y A01 = LYC.A01(lyc, 1.0f);
                    LYC.A03(lyc, 1.0d, lyc.A0B + 7zM.A00(A01.first), lyc.A0C + 7zM.A00(A01.second), false);
                    Jv2 jv22 = lyc.A0G;
                    if (jv22 == null) {
                        throw 1BK.A0h();
                    }
                    jv22.A00.A03(0);
                }
            } else {
                if (motionEvent.getActionMasked() == 0) {
                    if (lyc.A0L == 0S2.A01) {
                        Kuo kuo = lyc.A0J;
                        kuo.A02(kuo.A09.A00);
                        Kuo kuo2 = lyc.A0H;
                        kuo2.A02(kuo2.A09.A00);
                        Kuo kuo3 = lyc.A0I;
                        kuo3.A02(kuo3.A09.A00);
                        kuo.A00();
                        kuo3.A00();
                        kuo2.A00();
                        LYC.A02(lyc);
                    }
                    if (lyc.A0L == 0S2.A0u) {
                        lyc.A08(0S2.A00);
                    }
                    lyc.A0W.forceFinished(true);
                }
                lyc.A0U.onTouchEvent(motionEvent);
                if (lyc.A0L != 0S2.A0N && motionEvent.getPointerCount() == 1) {
                    ((GestureDetector) lyc.A0Y.getValue()).onTouchEvent(motionEvent);
                }
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 1 || actionMasked2 == 3) {
                    Integer num = lyc.A0L;
                    if (num != 0S2.A0u && num != 0S2.A01) {
                        float A00 = 7zM.A00(07C.A05(Float.valueOf(lyc.A02), new AnonymousClass175(1.0f, lyc.A07)));
                        03Y A012 = LYC.A01(lyc, A00);
                        LYC.A03(lyc, A00, 7zM.A00(A012.first), 7zM.A00(A012.second), false);
                    }
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(false);
                    }
                    lyc.A0P = false;
                    Jv2 jv23 = lyc.A0G;
                    if (jv23 == null) {
                        throw 1BK.A0h();
                    }
                    jv23.A00.A03(0);
                    lyc.A00 = 0.0f;
                    lyc.A01 = 0.0f;
                }
            }
        }
        0FI.A0B(1674992832, A05);
        return true;
    }
}
