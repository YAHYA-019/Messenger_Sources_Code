package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.Acr, reason: case insensitive filesystem */
/* loaded from: Acr.class */
public final class C1287Acr implements C61x {
    public final 1Br A00 = 1Bq.A00(67988);
    public final 1Br A01 = AbG.A0L();

    private final List A00() {
        List A19 = 4YU.A19(2yD.A02(1Br.A07(((7PV) 1Br.A0B(this.A00)).A00), 36887794773198593L), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
        ArrayList A0z = 1BL.A0z(A19);
        Iterator it = A19.iterator();
        while (it.hasNext()) {
            A0z.add(4YU.A13(AnonymousClass001.A0i(it)));
        }
        return A0z;
    }

    private boolean A01(String str) {
        C00i c00i = this.A01.A00;
        1GS r0 = (1GS) c00i.get();
        Locale A05 = ((1GS) c00i.get()).A05();
        11T.A0A(A05);
        Locale A07 = r0.A07(A05);
        11T.A0A(A07);
        Locale A072 = ((1GS) c00i.get()).A07(02E.A00(str));
        11T.A0A(A072);
        return A072.equals(A07);
    }

    @Override // X.C61x
    public boolean AXS(Message message, Capabilities capabilities) {
        ThreadKey threadKey;
        String str;
        if (message.A1V == null || (threadKey = message.A0V) == null || !threadKey.A1B() || C1q7.A0p(message) || (str = message.A1r) == null || A01(str) || A00().contains(str) || A00().contains(BKI())) {
            return false;
        }
        C00i c00i = this.A00.A00;
        List A19 = 4YU.A19(2yD.A02(1Br.A07(((7PV) c00i.get()).A00), 36887794773133056L), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
        ArrayList A1E = C1A3.A1E(A19);
        Iterator it = A19.iterator();
        while (it.hasNext()) {
            A1E.add(0CU.A06((String) it.next()).toString());
        }
        HashMap A0u = AnonymousClass001.A0u();
        Iterator it2 = A1E.iterator();
        while (it2.hasNext()) {
            List A0M = 0CU.A0M((String) it2.next(), new String[]{":"}, 0);
            ArrayList arrayList = new ArrayList(C1A3.A1D(A0M, 10));
            Iterator it3 = A0M.iterator();
            while (it3.hasNext()) {
                arrayList.add(0CU.A06((String) it3.next()).toString());
            }
            if (arrayList.size() == 2) {
                if (A0u.get(arrayList.get(0)) == null) {
                    A0u.put(arrayList.get(0), 02H.A01(new String[]{(String) arrayList.get(1)}));
                } else {
                    Set set = (Set) A0u.get(arrayList.get(0));
                    if (set != null) {
                        set.add(arrayList.get(1));
                    }
                }
                if (A0u.get(arrayList.get(1)) == null) {
                    A0u.put(arrayList.get(1), 02H.A01(new String[]{(String) arrayList.get(0)}));
                } else {
                    Set set2 = (Set) A0u.get(arrayList.get(1));
                    if (set2 != null) {
                        set2.add(arrayList.get(0));
                    }
                }
            }
        }
        Set set3 = (Set) A0u.get(str);
        return (set3 == null || !set3.contains(BKI())) && 4YU.A1Y(capabilities, 196) && 1Br.A07(((7PV) c00i.get()).A00).AZk(36323685178559407L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (AXS(r302, r303) == false) goto L8;
     */
    @Override // X.C61x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean AxE(com.facebook.messaging.model.messages.Message r302, com.facebook.xapp.messaging.capability.vector.Capabilities r303, boolean r304) {
        /*
            r301 = this;
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = 2
            r305 = r0
            r0 = r303
            r1 = r305
            X.11T.A0F(r0, r1)
            r0 = r304
            if (r0 == 0) goto L2e
            r0 = r301
            r1 = r302
            boolean r0 = r0.BNj(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L2e
            r0 = r301
            r1 = r302
            r2 = r303
            boolean r0 = r0.AXS(r1, r2)
            r306 = r0
            r0 = 1
            r305 = r0
            r0 = r306
            if (r0 != 0) goto L31
        L2e:
            r0 = 0
            r305 = r0
        L31:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1287Acr.AxE(com.facebook.messaging.model.messages.Message, com.facebook.xapp.messaging.capability.vector.Capabilities, boolean):boolean");
    }

    @Override // X.C61x
    public String BKI() {
        Locale A05 = ((1GS) 1Br.A0B(this.A01)).A05();
        11T.A0A(A05);
        return 11T.A02(A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (A01(r0) == false) goto L8;
     */
    @Override // X.C61x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BNj(com.facebook.messaging.model.messages.Message r302) {
        /*
            r301 = this;
            r0 = r302
            java.lang.String r0 = r0.A1p
            r303 = r0
            r0 = r302
            com.facebook.secure.secrettypes.SecretString r0 = r0.A0G()
            java.lang.String r0 = r0.A00
            r304 = r0
            r0 = r304
            boolean r0 = X.1JF.A0A(r0)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L2b
            r0 = r303
            if (r0 == 0) goto L2b
            r0 = r301
            r1 = r303
            boolean r0 = r0.A01(r1)
            r306 = r0
            r0 = 1
            r305 = r0
            r0 = r306
            if (r0 != 0) goto L30
        L2b:
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
        L30:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1287Acr.BNj(com.facebook.messaging.model.messages.Message):boolean");
    }

    @Override // X.C61x
    public boolean CWj(Message message, 2Sh r303) {
        C61n c61n;
        return (r303 == null || (c61n = (C61n) r303.A01((String) null, C61n.class)) == null || !c61n.A00(message.A1V)) ? false : true;
    }
}
