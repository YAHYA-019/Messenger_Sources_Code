package com.facebook.zero.trigger;

import X.0fH;
import X.1BJ;
import X.1Bq;
import X.1Br;
import X.2yD;
import X.C00i;
import X.L8B;
import com.facebook.zero.zerobalance.ping.ZeroBalancePingController;

/* loaded from: ZeroBalanceForegroundTrigger.class */
public final class ZeroBalanceForegroundTrigger {
    public final 1Br A02 = 1Bq.A00(16931);
    public final 1Br A09 = 1Bq.A00(131317);
    public final 1Br A03 = 1Bq.A00(49218);
    public final 1Br A04 = 1Bq.A00(49216);
    public final 1Br A06 = 1Bq.A00(49217);
    public final 1Br A05 = 1Bq.A00(49220);
    public final 1Br A07 = 1Bq.A00(49221);
    public final 1Br A08 = 1Bq.A00(131316);
    public final 1Br A01 = 1Bq.A00(49222);
    public final 1Br A00 = 1Bq.A00(16385);

    public static final void A00(ZeroBalanceForegroundTrigger zeroBalanceForegroundTrigger) {
        0fH.A0j(1BJ.A00(908), "ZBD: entered initControllers.");
        if (((2yD) zeroBalanceForegroundTrigger.A00.A00.get()).AZk(36311337151892210L)) {
            ZeroBalancePingController zeroBalancePingController = (ZeroBalancePingController) 1Br.A0B(zeroBalanceForegroundTrigger.A02);
            C00i c00i = zeroBalanceForegroundTrigger.A08.A00;
            Object obj = c00i.get();
            if (obj != null) {
                zeroBalancePingController.A0D.add(obj);
            }
            L8B l8b = (L8B) 1Br.A0B(zeroBalanceForegroundTrigger.A09);
            l8b.A06.add(c00i.get());
        }
        C00i c00i2 = zeroBalanceForegroundTrigger.A02.A00;
        ZeroBalancePingController zeroBalancePingController2 = (ZeroBalancePingController) c00i2.get();
        Object obj2 = zeroBalanceForegroundTrigger.A04.A00.get();
        if (obj2 != null) {
            zeroBalancePingController2.A0D.add(obj2);
        }
        ZeroBalancePingController zeroBalancePingController3 = (ZeroBalancePingController) c00i2.get();
        Object obj3 = zeroBalanceForegroundTrigger.A06.A00.get();
        if (obj3 != null) {
            zeroBalancePingController3.A0D.add(obj3);
        }
        ZeroBalancePingController zeroBalancePingController4 = (ZeroBalancePingController) c00i2.get();
        Object obj4 = zeroBalanceForegroundTrigger.A03.A00.get();
        if (obj4 != null) {
            zeroBalancePingController4.A0D.add(obj4);
        }
        ZeroBalancePingController zeroBalancePingController5 = (ZeroBalancePingController) c00i2.get();
        Object obj5 = zeroBalanceForegroundTrigger.A05.A00.get();
        if (obj5 != null) {
            zeroBalancePingController5.A0D.add(obj5);
        }
        ZeroBalancePingController zeroBalancePingController6 = (ZeroBalancePingController) c00i2.get();
        Object obj6 = zeroBalanceForegroundTrigger.A07.A00.get();
        if (obj6 != null) {
            zeroBalancePingController6.A0D.add(obj6);
        }
        ZeroBalancePingController zeroBalancePingController7 = (ZeroBalancePingController) c00i2.get();
        Object obj7 = zeroBalanceForegroundTrigger.A01.A00.get();
        if (obj7 != null) {
            zeroBalancePingController7.A0D.add(obj7);
        }
        ((ZeroBalancePingController) c00i2.get()).A04(1BJ.A00(334));
    }
}
