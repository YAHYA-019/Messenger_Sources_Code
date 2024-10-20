package com.facebook.bloks.messenger.implementations.plugins.core.msgshowalert;

import X.0Pz;
import X.11T;
import X.1BK;
import X.7zN;
import X.7zQ;
import X.C5ic;
import X.DKC;
import X.DKD;
import X.DKc;
import X.DLQ;
import X.DR6;
import X.EYW;
import X.FHh;
import X.FJt;
import X.Fwk;
import X.Fxk;
import X.FyG;
import java.util.Iterator;
import java.util.List;

/* loaded from: MSGBloksShowAlert.class */
public final class MSGBloksShowAlert {
    public final C5ic A00 = 7zQ.A0l();

    public final Object A00(Fwk fwk, FHh fHh, DKc dKc) {
        11T.A0F(fwk, 0);
        List list = dKc.A00;
        String A0x = DKD.A0x(list, 0);
        String A0x2 = DKD.A0x(list, 1);
        List list2 = (List) list.get(2);
        DR6 A02 = this.A00.A02(fwk.A00);
        A02.A03(A0x);
        A02.A0J(A0x2);
        if (list2 != null && 1BK.A1Y(list2)) {
            A02.A0K(false);
            FyG A05 = Fxk.A05(fHh, dKc, 1);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                DLQ A0s = DKC.A0s(it);
                if (A0s != null) {
                    DLQ A00 = EYW.A00(A05, fHh, A0s);
                    11T.A0A(A00);
                    String A0t = DKD.A0t(A00, "default", 34);
                    int hashCode = A0t.hashCode();
                    if (hashCode != -1829997182) {
                        if (hashCode != -1367724422) {
                            if (hashCode == 1544803905 && A0t.equals("default")) {
                                A02.A0G(new FJt(fHh, A00, 0), DKD.A0t(A00, "", 36));
                            }
                            throw 0Pz.A05("Unsupported alert action style: ", A0t);
                        }
                        if (!A0t.equals("cancel")) {
                            throw 0Pz.A05("Unsupported alert action style: ", A0t);
                        }
                        A02.A0F(new FJt(fHh, A00, 0), DKD.A0t(A00, "", 36));
                    } else {
                        if (!A0t.equals("destructive")) {
                            throw 0Pz.A05("Unsupported alert action style: ", A0t);
                        }
                        A02.A0E(new FJt(fHh, A00, 0), DKD.A0t(A00, "", 36));
                    }
                }
            }
        }
        7zN.A13(A02);
        return null;
    }
}
