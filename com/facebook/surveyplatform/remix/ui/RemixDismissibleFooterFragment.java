package com.facebook.surveyplatform.remix.ui;

import X.1LI;
import X.AbI;
import X.C1rs;
import X.IKB;
import X.IKC;
import X.Igx;
import X.JDR;
import X.QEW;
import X.QKT;
import java.util.BitSet;

/* loaded from: RemixDismissibleFooterFragment.class */
public class RemixDismissibleFooterFragment extends RemixFooterFragment {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.surveyplatform.remix.ui.RemixFooterFragment
    public 1LI A1C(JDR jdr) {
        QEW qew = new QEW(AbI.A0P(this), new QKT(), this.A02.A00);
        1LI r0 = qew.A01;
        ((QKT) r0).A02 = (Igx) jdr;
        BitSet bitSet = qew.A02;
        bitSet.set(1);
        ((QKT) r0).A01 = new IKC(this, jdr, 39);
        bitSet.set(2);
        ((QKT) r0).A00 = new IKB(this, 62);
        bitSet.set(0);
        C1rs.A03(bitSet, qew.A03);
        qew.A0J();
        return r0;
    }
}
