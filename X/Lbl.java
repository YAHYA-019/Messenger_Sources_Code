package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: Lbl.class */
public final class Lbl implements 5MT {
    public static Lbl A04;
    public 7qC A00;
    public L0W A01;
    public String A02;
    public boolean A03;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c7, code lost:
    
        if (r322 > (-1)) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A00(X.Kqr r302) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lbl.A00(X.Kqr):void");
    }

    public void BwV(String str, String str2, int i, int i2) {
    }

    public void CMJ(5Mi r302, 5N6 r303) {
        String str;
        KjB kjB;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z;
        if (this.A01 == null || (str = r303.A06) == null) {
            return;
        }
        String str8 = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
        7qC r0 = this.A00;
        synchronized (r0) {
            kjB = (KjB) r0.A00.get((5N6) r0.A01.floor(r303));
        }
        str2 = "unknown";
        if (kjB != null) {
            6D1 r02 = kjB.A00;
            str4 = r02.A03;
            str5 = r02.A04;
            if (str5 == null) {
                str5 = str2;
            }
            str8 = r02.A00.name();
            str3 = kjB.A02;
            str6 = kjB.A01;
            str7 = r02.A06;
            if (str7 == null) {
                str7 = str2;
            }
            String str9 = r02.A05;
            str2 = str9 != null ? str9 : "unknown";
            z = r02.A0A;
        } else {
            str3 = "";
            str4 = str2;
            str5 = str2;
            str6 = str2;
            str7 = str2;
            z = false;
        }
        this.A01.A01.add(new LiX(KND.SPAN_ADDED, this.A02, str4, str5, str8, str6, str, str3, (String) null, str7, str2, r303.A04, r303.A03, 0L, 0L, z));
    }

    public void CMK(5Mi r302, 5N6 r303) {
    }

    public void CML(5Mi r302, 5N6 r303, 5N6 r304) {
        CMM(r302, r303, r304, 0S2.A0C);
    }

    public void CMM(5Mi r302, 5N6 r303, 5N6 r304, Integer num) {
        L0W l0w = this.A01;
        if (l0w == null || r303 == null || num == 0S2.A0N) {
            return;
        }
        l0w.A01.add(new LiX(KND.SPAN_TOUCHED, this.A02, (String) null, (String) null, (String) null, (String) null, r303.A06, (String) null, (String) null, "unknown", "unknown", r303.A04, r303.A03, r304.A04, r304.A03, false));
    }

    public void CMp(5Mi r302, String str, long j, long j2) {
    }
}
