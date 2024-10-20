package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: Cp5.class */
public final class Cp5 implements DFb {
    public final /* synthetic */ B7l A00;

    public Cp5(B7l b7l) {
        this.A00 = b7l;
    }

    @Override // X.DFb
    public void CNB(RzB rzB) {
        11T.A0F(rzB, 0);
        Qvl qvl = rzB.liveStreamStatus;
        11T.A0A(qvl);
        if (qvl == Qvl.A03) {
            List list = rzB.acceptedUsers;
            11T.A0A(list);
            B7l b7l = this.A00;
            1Br r0 = b7l.A06;
            ((CJA) 1Br.A0B(r0)).A03 = ImmutableList.copyOf((Collection) list);
            Object A0G = 0QD.A0G(((CJA) 1Br.A0B(r0)).A0G);
            if (A0G == null) {
                A0G = QqI.A0A;
            }
            if (A0G == QqI.A07) {
                B7l.A00(b7l);
            }
        }
    }
}
