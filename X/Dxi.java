package X;

import android.R;
import android.widget.ArrayAdapter;
import com.facebook.forker.Process;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: Dxi.class */
public final class Dxi extends C1rj {
    public GL7 A00;
    public FyG A01;

    public Dxi() {
        super("FBDropDownComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        E0S A0P = 4YU.A0P(r302);
        GL7 gl7 = this.A00;
        FyG fyG = this.A01;
        int i = A0P.A01;
        int i2 = A0P.A00;
        ArrayAdapter arrayAdapter = A0P.A02;
        FYP fyp = new FYP(2, fyG, r302, gl7);
        int i3 = gl7.getInt(63, 0);
        if (i3 != i2) {
            F4N A0b = DKG.A0b(gl7, fyG);
            Integer valueOf = Integer.valueOf(i3);
            F4N.A00(A0b, valueOf);
            if (r302.A02 != null) {
                4YV.A1F(r302, valueOf, Process.WAIT_RESULT_STOPPED);
            }
            if (r302.A02 != null) {
                4YV.A1F(r302, valueOf, (-1) << (-1));
            }
            i = i3;
        }
        QBI qbi = new QBI(r302, new QKp());
        1LI r0 = qbi.A01;
        ((QKp) r0).A00 = i;
        ((QKp) r0).A01 = fyp;
        ((QKp) r0).A02 = arrayAdapter;
        BitSet bitSet = qbi.A02;
        bitSet.set(0);
        ((QKp) r0).A03 = gl7.getBoolean(66, false);
        C1rs.A01(bitSet, qbi.A03);
        qbi.A0J();
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        E0S e0s = (E0S) r303;
        FyG fyG = this.A01;
        GL7 gl7 = this.A00;
        1CO r0 = (1CO) 1Bi.A03(16385);
        int i = gl7.getInt(63, 0);
        List AcV = gl7.AcV(50);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = AcV.iterator();
        while (it.hasNext()) {
            A0s.add(DKC.A0m(it).BCx(35, ""));
        }
        DPQ dpq = new DPQ(r302.A0D, r0, gl7, fyG);
        dpq.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        dpq.addAll(A0s);
        e0s.A01 = i;
        e0s.A00 = i;
        e0s.A02 = dpq;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
