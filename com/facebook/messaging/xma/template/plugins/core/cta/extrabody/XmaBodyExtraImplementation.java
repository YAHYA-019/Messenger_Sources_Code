package com.facebook.messaging.xma.template.plugins.core.cta.extrabody;

import X.0Pz;
import X.1Bq;
import X.1Br;
import X.1Iw;
import X.2K3;
import X.2KD;
import X.2RH;
import X.2cK;
import X.2cM;
import X.2rQ;
import X.2rR;
import X.2rS;
import X.4YU;
import X.6Az;
import X.7zN;
import X.7zO;
import X.7zT;
import X.8T3;
import X.C1rq;
import X.C7t6;
import X.C8o0;
import X.C9iR;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* loaded from: XmaBodyExtraImplementation.class */
public final class XmaBodyExtraImplementation {
    public static final C7t6 A02 = new Object();
    public final 1Br A00 = 1Bq.A00(16511);
    public final 6Az A01;

    public XmaBodyExtraImplementation(6Az r302) {
        this.A01 = r302;
    }

    public static final void A00(2cM r301, 1Iw r302, MigColorScheme migColorScheme, String str, String str2, String str3, String str4, float f, int i) {
        int i2 = i;
        2rQ r0 = new 2rQ((List) null, C9iR.A01(str4));
        List list = r0.A01;
        List list2 = r0.A00;
        int size = list != null ? list.size() : list2 != null ? list2.size() : 0;
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A1N(1);
        A01.A2S(str2);
        C1rq A0P = 7zN.A0P(r302, 0);
        A0P.A1N(2);
        2KD A012 = 2K3.A01(r302, 0);
        A012.A2k();
        A012.A2b();
        A012.A2z(str);
        A012.A2x(migColorScheme);
        A012.A2q(1);
        2RH r02 = 2RH.A05;
        7zO.A1L(A012, r02);
        A012.A0R();
        A0P.A2e(A012);
        2rS A00 = 2rR.A00(r302);
        A00.A0S();
        A00.A2c(r0);
        if (i2 < size) {
            i2 = size;
        }
        2rR r03 = A00.A01;
        r03.A00 = i2;
        7zT.A1R(A00);
        A00.A2a(3);
        A00.A2d(true);
        A00.A2b(migColorScheme);
        r03.A09 = true;
        r03.A01 = migColorScheme.Awo();
        A0P.A2e(A00);
        4YU.A1N(A0P, r02);
        A01.A2d(A0P);
        8T3 A002 = C8o0.A00(r302);
        A002.A1N(2);
        A002.A2Y(f);
        int AYv = migColorScheme.AYv();
        C8o0 c8o0 = A002.A00;
        c8o0.A02 = AYv;
        A002.A2X(8.0f);
        c8o0.A06 = new int[]{migColorScheme.Ah8()};
        c8o0.A05 = true;
        c8o0.A04 = 0Pz.A0W("poll", str3);
        A002.A12(6.0f);
        A01.A2d(A002);
        r301.A2d(A01);
    }
}
