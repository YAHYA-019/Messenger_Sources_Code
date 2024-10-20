package com.facebook.bloks.messenger.implementations.plugins.core.video.sendevent;

import X.1Bq;
import X.1Br;
import X.6Tb;
import X.6U2;
import X.6U4;
import X.6U6;
import X.6U9;
import X.C52j;
import X.C6dp;
import X.DKE;
import X.DKc;
import X.FHh;
import X.GRD;
import X.RV2;

/* loaded from: SendEvent.class */
public final class SendEvent {
    public final 1Br A00 = 1Bq.A00(115824);

    public final Object A00(FHh fHh, DKc dKc) {
        C6dp c6dp;
        String A0x = DKE.A0x(dKc, 1);
        GRD A01 = RV2.A01((6Tb) 1Br.A0B(this.A00), fHh.A03, DKE.A0i(dKc, 2));
        if (A0x == null) {
            return null;
        }
        switch (A0x.hashCode()) {
            case -1714437718:
                if (!A0x.equals("hide_captions")) {
                    return null;
                }
                c6dp = new C6dp(false);
                break;
            case -840405966:
                if (!A0x.equals("unmute")) {
                    return null;
                }
                c6dp = new 6U6(C52j.A2Z, false);
                break;
            case 3363353:
                if (!A0x.equals("mute")) {
                    return null;
                }
                c6dp = new 6U6(C52j.A2Z, true);
                break;
            case 3443508:
                if (!A0x.equals("play")) {
                    return null;
                }
                c6dp = new 6U4(C52j.A2Z, -1);
                break;
            case 3540994:
                if (!A0x.equals("stop")) {
                    return null;
                }
                c6dp = new 6U9(C52j.A2Z);
                break;
            case 1690109519:
                if (!A0x.equals("show_captions")) {
                    return null;
                }
                c6dp = new C6dp(true);
                break;
            default:
                return null;
        }
        6U2 A07 = A01.A07();
        if (A07 == null) {
            return null;
        }
        A07.A06(c6dp);
        return null;
    }
}
