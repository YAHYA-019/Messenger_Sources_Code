package com.facebook.messaging.xma.template.plugins.core.media.video;

import X.11T;
import X.1Fw;
import X.1Iw;
import X.2JX;
import X.2JY;
import X.6Ay;
import X.6Az;
import X.7zP;
import X.AnonymousClass001;
import X.DsL;
import X.Dy5;
import com.facebook.auth.usersession.FbUserSession;
import java.util.BitSet;

/* loaded from: GenericXmaSinglePlayableMedia.class */
public class GenericXmaSinglePlayableMedia {
    /* JADX WARN: Type inference failed for: r0v10, types: [X.7Zr, X.2JY, com.facebook.graphservice.tree.TreeJNI] */
    public static final Dy5 A00(1Iw r301, 6Az r302) {
        ?? A0u;
        2JY A0u2;
        String A0r;
        11T.A0F(r302, 2);
        Dy5 dy5 = null;
        if ((r302 instanceof 6Ay) && (A0u = ((6Ay) r302).A0u()) != 0 && (A0u2 = A0u.A0u()) != null) {
            int intValue = A0u2.getIntValue(-1221029593);
            int intValue2 = A0u2.getIntValue(113126854);
            boolean A1T = AnonymousClass001.A1T(A0u.A0L(-1421463617, 2JX.class, -1912895114));
            String A0k = A0u.A0k();
            if (A0k != null) {
                int intValue3 = A0u.getIntValue(115581542);
                String uri = A0u2.getUri();
                if (uri != null && (A0r = A0u.A0r(752641086)) != null) {
                    float f = intValue2 / intValue;
                    FbUserSession A01 = 1Fw.A01(r301.A0D);
                    DsL dsL = new DsL(r301, new Dy5());
                    dy5 = dsL.A01;
                    dy5.A04 = A01;
                    BitSet bitSet = dsL.A02;
                    bitSet.set(1);
                    dy5.A09 = A1T;
                    bitSet.set(2);
                    dy5.A05 = A0k;
                    bitSet.set(0);
                    dy5.A03 = intValue3;
                    bitSet.set(6);
                    dy5.A02 = intValue2;
                    bitSet.set(5);
                    dy5.A01 = intValue;
                    bitSet.set(4);
                    dy5.A06 = uri;
                    bitSet.set(7);
                    dy5.A07 = A0r;
                    bitSet.set(8);
                    dy5.A00 = f;
                    bitSet.set(3);
                    dy5.A08 = A1T;
                    7zP.A18(dsL, bitSet, dsL.A03);
                }
            }
        }
        return dy5;
    }
}
