package X;

import android.content.Context;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.mapbox.mapboxsdk.R;

/* renamed from: X.823, reason: invalid class name */
/* loaded from: 823.class */
public final class AnonymousClass823 {
    public static final C66h A0I = C66h.A03(40.0d, 7.0d);
    public float A00;
    public float A01;
    public float A02;
    public float A03 = 2.0f;
    public 2Ob A04;
    public AnonymousClass825 A05;
    public Float A06;
    public Integer A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public C62j A0B;
    public final VelocityTracker A0C;
    public final View A0D;
    public final View A0E;
    public final C66i A0F;
    public final float A0G;
    public final int A0H;

    public AnonymousClass823(View view, View view2, Integer num) {
        view.getClass();
        this.A0E = view;
        view2.getClass();
        this.A0D = view2;
        num.getClass();
        this.A07 = num;
        Context context = view.getContext();
        C62j c62j = (C62j) 1Bn.A0A(49939);
        this.A0B = c62j;
        c62j.getClass();
        C66i c66i = new C66i(c62j);
        c66i.A09(A0I);
        c66i.A06 = true;
        c66i.A0A(new C66m() { // from class: X.824
            @Override // X.C66m, X.C66n
            public void CMR(C66i c66i2) {
                AnonymousClass825 anonymousClass825 = AnonymousClass823.this.A05;
                if (anonymousClass825 != null) {
                    anonymousClass825.Bmu();
                }
            }

            @Override // X.C66m, X.C66n
            public void CMV(C66i c66i2) {
                AnonymousClass823.this.A0E.setTranslationY((int) c66i2.A09.A00);
            }
        });
        this.A0F = c66i;
        this.A0C = VelocityTracker.obtain();
        this.A0G = context.getResources().getDimensionPixelSize(R.dimen.mapbox_locationComponentTrackingInitialMoveThreshold);
        this.A0H = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0228, code lost:
    
        if (r319 < r0.floatValue()) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(android.view.MotionEvent r301, X.AnonymousClass823 r302) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass823.A00(android.view.MotionEvent, X.823):void");
    }
}
