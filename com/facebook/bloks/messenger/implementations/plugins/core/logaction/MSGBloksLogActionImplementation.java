package com.facebook.bloks.messenger.implementations.plugins.core.logaction;

import X.07S;
import X.0S2;
import X.0fH;
import X.11T;
import X.1Bi;
import X.1RX;
import X.1Rf;
import X.AnonymousClass001;
import X.DKD;
import X.DKc;
import X.FIV;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: MSGBloksLogActionImplementation.class */
public final class MSGBloksLogActionImplementation {
    public final 1RX A00 = (1RX) 1Bi.A03(67199);

    public final Object A00(DKc dKc) {
        List list = dKc.A00;
        String A0x = DKD.A0x(list, 0);
        String A0x2 = DKD.A0x(list, 1);
        Map map = (Map) list.get(2);
        1RX r0 = this.A00;
        11T.A0D(A0x);
        1Rf A01 = 1RX.A01(r0, 0S2.A00, A0x2, A0x, false);
        11T.A0A(A01);
        if (!A01.A0D()) {
            return null;
        }
        if (map != null) {
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                Object key = A0z.getKey();
                Object value = A0z.getValue();
                07S A09 = A01.A09();
                String A00 = FIV.A00(key);
                if (value == null) {
                    value = null;
                } else if (value instanceof Map) {
                    FIV.A05(A09.A0D(A00), (Map) value);
                } else {
                    if (!(value instanceof String)) {
                        if (value instanceof List) {
                            FIV.A04(A09.A0C(A00), (List) value);
                        } else if (!(value instanceof Number)) {
                            if (!(value instanceof Boolean)) {
                                0fH.A0B(FIV.class, StringFormatUtil.formatStrLocaleSafe("Couldn't handle %s %s", value.getClass(), value));
                            }
                        }
                    }
                    value = value.toString();
                }
                07S.A00(A09, value, A00);
            }
        }
        A01.A0B();
        return null;
    }
}
