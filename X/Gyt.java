package X;

import com.facebook.rtc.interfaces.RtcCallStartParams;
import java.util.Iterator;

/* loaded from: Gyt.class */
public final class Gyt extends 3Fu {
    public final /* synthetic */ I0A A00;
    public final /* synthetic */ IRF A01;

    public Gyt(I0A i0a, IRF irf) {
        this.A01 = irf;
        this.A00 = i0a;
    }

    public void A0C() {
        IRF irf = this.A01;
        2QN r0 = irf.A1e;
        if (!"".equals(r0.A0r)) {
            String str = r0.A0r;
            RtcCallStartParams rtcCallStartParams = r0.A09;
            if (rtcCallStartParams != null) {
                String str2 = rtcCallStartParams.A0H;
                11T.A0A(str2);
                String str3 = rtcCallStartParams.A0C;
                if (str3 != null) {
                    Iterator it = irf.A1m.iterator();
                    while (it.hasNext()) {
                        ((JIv) it.next()).BmI(irf.A0N, str, str2, str3);
                    }
                }
            }
            JOY.A02(r0, irf).Bch("local_call_id", str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x028c, code lost:
    
        if (r303 != 2) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0D(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gyt.A0D(int, int):void");
    }

    public void A0F(Integer num, Integer num2) {
        11T.A0H(num, num2);
        Integer num3 = 0S2.A01;
        if (num == num3 && num2 == 0S2.A0C) {
            return;
        }
        if (num == 0S2.A0C && num2 == num3) {
            return;
        }
        IRF irf = this.A01;
        2QN r0 = irf.A1e;
        if (r0.A00 != 0) {
            irf.A1i.CuS(r0.BTq());
            boolean BTq = r0.BTq();
            IfG ifG = r0.A07;
            if (!BTq) {
                if (ifG != null) {
                    IfG.A00(ifG, new Ima(ifG, BTq));
                }
            } else {
                if (ifG != null) {
                    IfG.A00(ifG, new Ima(ifG, BTq));
                }
                JOT jot = irf.A06;
                if (jot == null) {
                    throw 1BK.A0h();
                }
                jot.D5O();
            }
        }
    }
}
