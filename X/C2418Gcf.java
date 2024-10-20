package X;

import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;

/* renamed from: X.Gcf, reason: case insensitive filesystem */
/* loaded from: Gcf.class */
public final class C2418Gcf extends Ic7 implements JQ0 {
    public GestureDetector A00;
    public ScaleGestureDetector A01;
    public View.OnTouchListener A02;
    public View A03;
    public Hh3 A04;
    public HP7 A05;
    public HP8 A06;
    public boolean A07;
    public final View.OnTouchListener A08;
    public final GestureDetector.SimpleOnGestureListener A09;
    public final ScaleGestureDetector.OnScaleGestureListener A0A;

    public C2418Gcf(JOW jow) {
        super.A00 = jow;
        GTm gTm = new GTm(this, 0);
        this.A09 = gTm;
        GTz gTz = new GTz(this);
        this.A0A = gTz;
        this.A08 = new IKm(this, 1);
        GuB guB = (JQ7) Ic7.A08(this, JQ7.A00);
        boolean A0A = Ic7.A0A(this, JQ0.A01, true);
        boolean A0A2 = Ic7.A0A(this, JQ0.A02, true);
        this.A07 = Ic7.A0A(this, JQ0.A03, true);
        if (A0A) {
            JOW jow2 = super.A00;
            jow2.getClass();
            GestureDetector gestureDetector = new GestureDetector(jow2.getContext(), gTm, guB.A00);
            this.A00 = gestureDetector;
            gestureDetector.setOnDoubleTapListener(gTm);
            this.A00.setIsLongpressEnabled(false);
        }
        if (A0A2) {
            JOW jow3 = super.A00;
            jow3.getClass();
            this.A01 = new ScaleGestureDetector(jow3.getContext(), gTz, guB.A00);
        }
    }

    @Override // X.JQ0
    public void Crn(HP8 hp8) {
        this.A06 = hp8;
    }

    @Override // X.JQ0
    public void Cs0(Hh3 hh3) {
        this.A04 = hh3;
    }

    @Override // X.JQ0
    public void Cs1(HP7 hp7) {
        this.A05 = hp7;
    }

    @Override // X.JQ0
    public void Ct3(View.OnTouchListener onTouchListener) {
        this.A02 = onTouchListener;
    }

    @Override // X.JQ0
    public void D7b(View view) {
        this.A03 = view;
        view.setOnTouchListener(this.A08);
    }
}
