package X;

import android.content.Context;
import com.facebook.fury.context.ReqContext;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: C23.class */
public final class C23 {
    public final 1Br A00 = 1Bu.A00(98520);

    public final void A00(Context context, DJc dJc, int i) {
        1EK.A09("MessengerIXTLauncher", 356909102266008L);
        try {
            ReqContext A04 = AnonymousClass018.A04("MessengerIXTLauncher", 0);
            try {
                HashMap A00 = BX0.A00(dJc);
                LinkedHashMap linkedHashMap = new LinkedHashMap(02J.A00(A00.size()));
                Iterator A0x = AnonymousClass001.A0x(A00);
                while (A0x.hasNext()) {
                    4YV.A1R((Map.Entry) A0x.next(), linkedHashMap);
                }
                Fb2 fb2 = (Fb2) 1Bn.A0A(85094);
                synchronized (fb2) {
                    ((CCq) 1Br.A0B(fb2.A01)).A00 = dJc;
                }
                CP0 A002 = CP0.A00(dJc.AXB());
                A002.A06.put("trigger", linkedHashMap);
                A002.A03 = dJc.B96();
                A002.A00 = i;
                DqD A03 = A002.A03();
                1Br.A0C(this.A00);
                DKT.A06(context, fb2, A03);
                if (A04 != null) {
                    A04.close();
                }
            } finally {
            }
        } finally {
            1EK.A03();
        }
    }
}
