package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.4Dv, reason: invalid class name */
/* loaded from: 4Dv.class */
public final class C4Dv {
    public long A00;
    public QoV A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public final 0JQ A08;
    public final C00i A09 = new 1BQ(16458);
    public final java.util.Map A0A = new HashMap();
    public final List A0B;

    public C4Dv(0JQ r302, String str) {
        C04I.A00().toString();
        this.A0B = new ArrayList();
        this.A01 = QoV.A04;
        this.A07 = false;
        this.A00 = -1;
        this.A08 = r302;
        this.A03 = str;
    }

    public void A00(long j) {
        0JQ r0 = this.A08;
        0JP r02 = (0JP) r0.A03.A03.get(r0.A01);
        if (r02 != null) {
            r02.A01 += j * 1000000;
        }
    }

    public void A01(Object obj, String str) {
        ((1GU) this.A09.get()).AAs();
        this.A0A.put(str, obj);
    }

    public void A02(String str) {
        ((1GU) this.A09.get()).AAs();
        this.A0B.add(str);
    }

    public void A03(String str) {
        String str2 = this.A04;
        if (str2 != null && str2 != str) {
            A02(0Pz.A0W("prev_dest:", str));
        }
        this.A04 = str;
    }
}
