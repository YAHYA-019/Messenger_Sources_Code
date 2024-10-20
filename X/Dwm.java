package X;

import android.view.View;
import java.util.BitSet;

/* loaded from: Dwm.class */
public final class Dwm extends C1rj {
    public View.OnClickListener A00;
    public View.OnClickListener A01;

    public Dwm() {
        super("AppointmentDetailFooterComponent");
    }

    public final Object[] A0k() {
        return new Object[]{null, null, null, this.A00, null, null, null, this.A01, null};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        View.OnClickListener onClickListener = this.A00;
        View.OnClickListener onClickListener2 = this.A01;
        11T.A0F(r302, 0);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        C26z c26z = C26z.ALL;
        A01.A23(c26z);
        C1rq A012 = C1rg.A01(r302, null, 0);
        A012.A23(c26z);
        if (onClickListener2 != null) {
            Dtq dtq = new Dtq(r302, new DxB());
            DxB dxB = dtq.A01;
            dxB.A00 = 2131964247;
            BitSet bitSet = dtq.A02;
            bitSet.set(1);
            dxB.A02 = onClickListener2;
            bitSet.set(0);
            dxB.A01 = 8193;
            bitSet.set(2);
            A012.A2W(dtq);
        }
        if (onClickListener != null) {
            Dtq dtq2 = new Dtq(r302, new DxB());
            DxB dxB2 = dtq2.A01;
            dxB2.A00 = 2131952827;
            BitSet bitSet2 = dtq2.A02;
            bitSet2.set(1);
            dxB2.A02 = onClickListener;
            bitSet2.set(0);
            dxB2.A01 = 8193;
            bitSet2.set(2);
            A012.A2W(dtq2);
        }
        A01.A2X(A012.A2V());
        1LI A2V = A01.A2V();
        11T.A0A(A2V);
        return A2V;
    }
}
