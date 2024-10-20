package X;

import android.content.Context;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.popover.RoundedCornerFrameLayout;
import com.mapbox.mapboxsdk.R;

/* loaded from: H59.class */
public final class H59 extends CustomFrameLayout implements C5eb, C2iz, C5ec {
    public float A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public ViewGroup A03;
    public C00i A04;
    public HFt A05;
    public 7tR A06;
    public Integer A07;
    public boolean A08;
    public final C00i A09;
    public final C00i A0A;

    public H59(Context context) {
        super(context);
        this.A00 = 0.0f;
        this.A07 = 0S2.A01;
        this.A0A = 1BQ.A02(17085);
        this.A09 = GOo.A0J();
        this.A04 = 7zL.A0R(getContext(), 116042);
        A0U(2132541644);
        this.A01 = (ViewGroup) C09s.A01(this, 2131363335);
        this.A02 = (ViewGroup) findViewById(2131364191);
        this.A03 = (ViewGroup) C09s.A01(this, 2131366617);
        ((C5ed) 4YU.A0p(this.A04)).A07 = this;
        ((C5ed) 4YU.A0p(this.A04)).A08 = this;
        ((C5ed) 4YU.A0p(this.A04)).A04 = 3;
        ((C2j0) this.A0A.get()).A02(this);
    }

    private long A00(int i, long j) {
        return Math.min((Math.max(DKC.A03(this.A03) - Math.abs(this.A00), 0.0f) / Math.abs(i)) * 1000.0f, ((float) j) * 1.5f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x016d, code lost:
    
        if (r0 == X.0S2.A01) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A01(int r302) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H59.A01(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e5  */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.view.animation.Interpolator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [android.animation.TimeInterpolator, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0V(java.lang.Integer r302, int r303) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H59.A0V(java.lang.Integer, int):void");
    }

    @Override // X.C2iz
    public void AU9(C2j1 c2j1) {
        c2j1.A00(61);
        c2j1.A00(62);
    }

    @Override // X.C2iz
    public void AUA(C2mq c2mq) {
        boolean z;
        int AU8 = c2mq.AU8();
        if (AU8 == 61) {
            z = true;
        } else if (AU8 != 62) {
            return;
        } else {
            z = false;
        }
        RoundedCornerFrameLayout roundedCornerFrameLayout = this.A02;
        if (roundedCornerFrameLayout == null || !(roundedCornerFrameLayout instanceof RoundedCornerFrameLayout)) {
            return;
        }
        RoundedCornerFrameLayout roundedCornerFrameLayout2 = roundedCornerFrameLayout;
        int dimensionPixelOffset = z ? GOo.A0A(roundedCornerFrameLayout2).getDimensionPixelOffset(R.dimen.mapbox_eight_dp) : 0;
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        7zT.A1X(fArr, dimensionPixelOffset);
        if (roundedCornerFrameLayout2.A02 != fArr) {
            roundedCornerFrameLayout2.A02 = fArr;
            roundedCornerFrameLayout2.A01.setShape(new RoundRectShape(fArr, null, null));
            roundedCornerFrameLayout2.invalidate();
        }
    }

    @Override // X.C5ec
    public boolean BWn(float f, float f2) {
        return GOp.A1U((f2 > DKC.A03(this.A01) ? 1 : (f2 == DKC.A03(this.A01) ? 0 : -1)));
    }

    @Override // X.C5eb
    public void Bv0() {
    }

    @Override // X.C5eb
    public void Bv1(float f, float f2) {
        A01(0);
    }

    @Override // X.C5eb
    public void Bv2(Integer num, float f, float f2, int i) {
        this.A07 = num;
        A01(i);
    }

    @Override // X.C5eb
    public void Bv4(Integer num, float f, float f2) {
        this.A07 = num;
        float f3 = this.A00 + f2;
        this.A00 = f3;
        this.A05.A00(Math.abs(f3) / DKC.A03(this));
        float f4 = this.A00;
        (f4 < 0.0f ? this.A03 : this.A01).setTranslationY(f4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x009f, code lost:
    
        if (r301.A05.A01(r302, r303, r304) != false) goto L10;
     */
    @Override // X.C5eb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Bv5(java.lang.Integer r302, float r303, float r304) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r0.A07 = r1
            r0 = r301
            android.view.ViewGroup r0 = r0.A01
            r305 = r0
            r0 = r305
            float r0 = r0.getX()
            r306 = r0
            r0 = r303
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r307 = r0
            r0 = r307
            if (r0 < 0) goto L84
            r0 = r305
            float r0 = r0.getX()
            r308 = r0
            r0 = r305
            float r0 = X.DKC.A02(r0)
            r306 = r0
            r0 = r308
            r1 = r306
            float r0 = r0 + r1
            r308 = r0
            r0 = r303
            r1 = r308
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r307 = r0
            r0 = r307
            if (r0 > 0) goto L84
            r0 = r305
            float r0 = r0.getY()
            r306 = r0
            r0 = r304
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r307 = r0
            r0 = r307
            if (r0 < 0) goto L84
            r0 = r305
            float r0 = r0.getY()
            r309 = r0
            r0 = r305
            android.content.Context r0 = r0.getContext()
            r310 = r0
            r0 = r310
            r1 = 1111490560(0x42400000, float:48.0)
            int r0 = X.C0A8.A00(r0, r1)
            float r0 = (float) r0
            r306 = r0
            r0 = r309
            r1 = r306
            float r0 = r0 + r1
            r309 = r0
            r0 = r304
            r1 = r309
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r307 = r0
            r0 = r307
            if (r0 > 0) goto L84
        L7a:
            r0 = 1
            r311 = r0
            r0 = 1
            r308 = r0
        L81:
            r0 = r311
            return r0
        L84:
            r0 = r301
            X.HFt r0 = r0.A05
            r312 = r0
            r0 = r312
            r1 = r302
            r2 = r303
            r3 = r304
            boolean r0 = r0.A01(r1, r2, r3)
            r307 = r0
            r0 = 0
            r311 = r0
            r0 = 0
            r308 = r0
            r0 = 0
            r310 = r0
            r0 = r307
            if (r0 == 0) goto L81
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H59.Bv5(java.lang.Integer, float, float):boolean");
    }

    @Override // X.C5ec
    public boolean Cxp(float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return C5ed.A02(motionEvent, (C5ed) 4YU.A0p(this.A04));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = 0FI.A05(1253757203);
        boolean A03 = C5ed.A03(motionEvent, (C5ed) 4YU.A0p(this.A04));
        0FI.A0B(-1631795151, A05);
        return A03;
    }
}
