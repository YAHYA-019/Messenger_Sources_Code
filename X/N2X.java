package X;

import com.facebook.inspiration.model.movableoverlay.InspirationPollInfo;
import com.facebook.inspiration.model.movableoverlay.InspirationTextState;
import com.facebook.inspiration.model.movableoverlay.TextToolActiveState;
import java.util.HashSet;
import java.util.Set;

/* loaded from: N2X.class */
public final class N2X {
    public InspirationPollInfo A00;
    public TextToolActiveState A01;
    public QoE A02;
    public Set A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    public N2X() {
        this.A03 = AnonymousClass001.A0v();
    }

    public N2X(InspirationTextState inspirationTextState) {
        this.A03 = AnonymousClass001.A0v();
        inspirationTextState.getClass();
        this.A04 = inspirationTextState.A04;
        this.A05 = inspirationTextState.A05;
        this.A06 = inspirationTextState.A06;
        this.A00 = inspirationTextState.A00;
        this.A07 = inspirationTextState.A07;
        this.A08 = inspirationTextState.A08;
        this.A09 = inspirationTextState.A09;
        this.A02 = inspirationTextState.A02;
        this.A01 = inspirationTextState.A01;
        this.A03 = AbF.A1E(inspirationTextState.A03);
    }

    public void A00(QoE qoE) {
        this.A02 = qoE;
        C1pq.A08("openReason", qoE);
        if (this.A03.contains("openReason")) {
            return;
        }
        HashSet A1E = AbF.A1E(this.A03);
        this.A03 = A1E;
        A1E.add("openReason");
    }
}
