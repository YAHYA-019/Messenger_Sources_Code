package X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: Dxw.class */
public final class Dxw extends C1rj {
    public GL7 A00;
    public FyG A01;

    public Dxw() {
        super("NTButtonComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0182, code lost:
    
        if (r303 != null) goto L29;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dxw.A0y(X.1Iw):X.1LI");
    }

    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return (2Yv) new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1336101728) {
            if (i != -1048037474) {
                return null;
            }
            1LI.A0J(r302, obj);
            return null;
        }
        3xE r0 = (3xE) obj;
        1Iw r02 = r302.A00.A00;
        MotionEvent motionEvent = r0.A00;
        View view = r0.A01;
        FIJ fij = (FIJ) r302.A03[0];
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (r02.A02 != null) {
                r02.A0H(new C2l4(new Object[0], 0), "updateState:NTButtonComponent.onPressDown");
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            if (r02.A02 != null) {
                r02.A0H(new C2l4(new Object[0], 1), "updateState:NTButtonComponent.onPressUp");
            }
            if (actionMasked == 1 && fij != null && F29.A01(view, motionEvent)) {
                fij.A07();
            }
        }
        return true;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        ((QNP) r303).A00 = false;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
