package com.facebook.messaging.wellbeing.plugins.ixt.mutethread;

import X.06Z;
import X.0S2;
import X.11T;
import X.1Bi;
import X.1Br;
import X.1Bu;
import X.1F9;
import X.1G1;
import X.2Pe;
import X.2Ph;
import X.AbH;
import X.BLP;
import X.BLc;
import X.C1yf;
import X.C1yg;
import X.C2050DaD;
import X.CIB;
import X.Cne;
import X.DKc;
import X.EUl;
import X.FEK;
import X.FGb;
import X.FHh;
import X.Fwk;
import X.GJj;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;

/* loaded from: MSGBloksIXTMuteThreadImplementation.class */
public final class MSGBloksIXTMuteThreadImplementation {
    public final Object A00(Fwk fwk, FHh fHh, DKc dKc) {
        11T.A0F(fwk, 0);
        if (!(fwk instanceof C2050DaD)) {
            return null;
        }
        06Z r0 = ((C2050DaD) fwk).A02;
        Context context = fwk.A00;
        1G1 A00 = EUl.A00(fHh);
        List list = dKc.A00;
        long parseLong = Long.parseLong(String.valueOf(list.get(0)));
        C1yg A002 = ((C1yf) 1Bi.A03(66776)).A00(Integer.parseInt(String.valueOf(list.get(1))));
        String valueOf = String.valueOf(list.get(2));
        BLP blp = 11T.A0O(valueOf, "thread") ? BLP.A03 : 11T.A0O(valueOf, "thread_and_calls") ? BLP.A04 : BLP.A05;
        FEK fek = new FEK(fHh);
        ThreadKey A0n = AbH.A0n(A00.A05, parseLong);
        if (C1yg.COMMUNITY_CHANNEL == A002) {
            A0n = ThreadKey.A03(parseLong);
        } else if (C1yg.GROUP == A002) {
            A0n = ThreadKey.A08(parseLong);
        } else if (C1yg.MARKETPLACE == A002) {
            A0n = ThreadKey.A0A(parseLong);
        }
        1Br A01 = 1Bu.A01(context, 82631);
        GJj gJj = ((FGb) dKc.A01(3)).A00;
        if (!((2Ph) 1Bu.A06(context, 17010)).A0A(A0n.A06)) {
            ((CIB) 1Br.A0B(A01)).A02(r0, A0n, blp, new Cne(this, fek, gJj), "MSGBloksIXTMuteThreadImplementation");
            return null;
        }
        if (!((2Pe) 1Bu.A06(context, 17005)).Bet(A00, (1F9) null, A0n, BLc.A03, blp, 0S2.A0j)) {
            return null;
        }
        FEK.A00(fek.A00, new DKc(11T.A03("forever")), gJj);
        return null;
    }
}
