package com.facebook.messaging.caa.plugins.login.implementations.overridesessionlessmobileconfigparameter;

import X.00F;
import X.0CW;
import X.0CX;
import X.11T;
import X.1BK;
import X.1BV;
import X.1Br;
import X.3oR;
import X.7zN;
import X.AnonymousClass001;
import X.C00o;
import X.C3TJ;
import X.C3o5;
import X.CME;
import X.DKc;
import X.FEK;
import X.FGb;
import X.FHh;
import X.FyG;
import X.GJj;
import com.facebook.mobileconfig.MobileConfigCxxChangeListener;
import java.util.List;
import java.util.Map;

/* loaded from: MSGBloksCaaLoginOverrideSessionlessMobileConfigParameter.class */
public final class MSGBloksCaaLoginOverrideSessionlessMobileConfigParameter {
    public static final Object A00(FHh fHh, DKc dKc) {
        Map map;
        3oR r0;
        Double A0h;
        Long A0e;
        Object A01 = dKc.A01(0);
        11T.A0I(A01, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A01;
        Object A012 = dKc.A01(1);
        GJj gJj = ((FGb) dKc.A01(2)).A00;
        GJj gJj2 = ((FGb) dKc.A01(3)).A00;
        FyG fyG = fHh.A03;
        if (fyG == null || fyG.A00 == null) {
            throw 1BK.A0h();
        }
        1BV A00 = 1BV.A00(83236);
        List A0U = C3o5.A0U(str, ":", 2);
        if (A0U.size() == 2) {
            Object obj = A0U.get(0);
            Object obj2 = A0U.get(1);
            CME cme = (CME) A00.get();
            11T.A0F(obj, 0);
            11T.A0F(obj2, 1);
            Map map2 = (Map) CME.A05.get();
            if (map2 != null && (map = (Map) map2.get(obj)) != null && (r0 = (3oR) map.get(obj2)) != null) {
                long A002 = r0.A00();
                if ((A012 instanceof Boolean) && r0.A06 == 1) {
                    C3TJ c3tj = (C3TJ) 1Br.A0B(cme.A04);
                    boolean A1V = AnonymousClass001.A1V(A012);
                    C00o c00o = c3tj.A00;
                    if (c00o != null) {
                        c00o.updateOverrideForParam(A002, A1V);
                    }
                } else {
                    boolean z = A012 instanceof String;
                    if (z && r0.A06 == 3) {
                        C3TJ c3tj2 = (C3TJ) 1Br.A0B(cme.A04);
                        String str2 = (String) A012;
                        C00o c00o2 = c3tj2.A00;
                        if (c00o2 != null) {
                            c00o2.updateOverrideForParam(A002, str2);
                        }
                    } else {
                        int i = r0.A06;
                        if (i == 2) {
                            if (A012 instanceof Number) {
                                A0e = 7zN.A0j((Number) A012);
                            } else if (z) {
                                A0e = 0CW.A0e((String) A012);
                            }
                            if (A0e != null) {
                                long longValue = A0e.longValue();
                                C00o c00o3 = ((C3TJ) 1Br.A0B(cme.A04)).A00;
                                if (c00o3 != null) {
                                    c00o3.updateOverrideForParam(A002, longValue);
                                }
                            }
                        } else if (i == 4) {
                            if (A012 instanceof Number) {
                                A0h = Double.valueOf(((Number) A012).doubleValue());
                            } else if (z) {
                                A0h = 0CX.A0h((String) A012);
                            }
                            if (A0h != null) {
                                double doubleValue = A0h.doubleValue();
                                C00o c00o4 = ((C3TJ) 1Br.A0B(cme.A04)).A00;
                                if (c00o4 != null) {
                                    c00o4.updateOverrideForParam(A002, doubleValue);
                                }
                            }
                        }
                    }
                }
                ((MobileConfigCxxChangeListener) 1Br.A0B(cme.A00)).onConfigChanged(new String[]{(String) obj});
                FEK.A00(fHh, DKc.A01, gJj);
                00F.A01("Messenger Android logout internal settings override mobile config restart");
                return null;
            }
        }
        FEK.A00(fHh, DKc.A01, gJj2);
        return null;
    }
}
