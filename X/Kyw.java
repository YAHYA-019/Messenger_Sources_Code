package X;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: Kyw.class */
public abstract class Kyw {
    public static final Kpa A00;
    public static final Kpa A01;
    public static final Kzm A02;
    public static final KiB A03;
    public static final Kzn A04;
    public static final KiC A05;
    public static final L4o A06;

    static {
        L4o A012 = L9b.A01("type.googleapis.com/google.crypto.tink.HmacKey");
        A06 = A012;
        HashMap A0u = AnonymousClass001.A0u();
        HashMap A0u2 = AnonymousClass001.A0u();
        KPX kpx = KPX.A03;
        L1n l1n = L1n.A03;
        A0u.put(kpx, l1n);
        A0u2.put(l1n, kpx);
        KPX kpx2 = KPX.A04;
        L1n l1n2 = L1n.A04;
        A0u.put(kpx2, l1n2);
        A0u2.put(l1n2, kpx2);
        KPX kpx3 = KPX.A02;
        L1n l1n3 = L1n.A02;
        A0u.put(kpx3, l1n3);
        A0u2.put(l1n3, kpx3);
        KPX kpx4 = KPX.A01;
        L1n l1n4 = L1n.A01;
        A0u.put(kpx4, l1n4);
        A0u2.put(l1n4, kpx4);
        A01 = new Kpa(Collections.unmodifiableMap(A0u), Collections.unmodifiableMap(A0u2));
        HashMap A0u3 = AnonymousClass001.A0u();
        HashMap A0u4 = AnonymousClass001.A0u();
        KPW kpw = KPW.A01;
        L1q l1q = L1q.A01;
        A0u3.put(kpw, l1q);
        A0u4.put(l1q, kpw);
        KPW kpw2 = KPW.A02;
        L1q l1q2 = L1q.A02;
        A0u3.put(kpw2, l1q2);
        A0u4.put(l1q2, kpw2);
        KPW kpw3 = KPW.A03;
        L1q l1q3 = L1q.A03;
        A0u3.put(kpw3, l1q3);
        A0u4.put(l1q3, kpw3);
        KPW kpw4 = KPW.A04;
        L1q l1q4 = L1q.A04;
        A0u3.put(kpw4, l1q4);
        A0u4.put(l1q4, kpw4);
        KPW kpw5 = KPW.A05;
        L1q l1q5 = L1q.A05;
        A0u3.put(kpw5, l1q5);
        A0u4.put(l1q5, kpw5);
        A00 = new Kpa(Collections.unmodifiableMap(A0u3), Collections.unmodifiableMap(A0u4));
        A05 = new KiC(new Lfr(10), KBt.class);
        A04 = Kzn.A00(A012, 10);
        A03 = new KiB(new Lfn(11), KBr.class);
        A02 = Kzm.A00(A012, 10);
    }

    public static KCr A00(KBt kBt) {
        KCd A0F = KCr.DEFAULT_INSTANCE.A0F();
        KCd.A00(A0F).tagSize_ = kBt.A01;
        Kpa kpa = A00;
        L1q l1q = kBt.A02;
        KPW kpw = (Enum) kpa.A00.get(l1q);
        if (kpw == null) {
            throw JQy.A0y(l1q, "Unable to convert object enum: ", AnonymousClass001.A0k());
        }
        KPW kpw2 = kpw;
        KCr A002 = KCd.A00(A0F);
        if (kpw2 == KPW.A07) {
            throw JQz.A0f();
        }
        A002.hash_ = kpw2.value;
        return A0F.A04();
    }
}
