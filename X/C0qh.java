package X;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/* renamed from: X.0qh, reason: invalid class name */
/* loaded from: 0qh.class */
public final class C0qh {
    public int A00;
    public C0qc A01;
    public Throwable A02;
    public final java.util.Map A03;
    public final java.util.Map A04;
    public final java.util.Map A05;
    public final java.util.Map A06;
    public final java.util.Map A07;
    public final java.util.Map A08;
    public final java.util.Map A09;

    public C0qh() {
        this(null);
    }

    public C0qh(Throwable th) {
        this.A05 = new HashMap();
        this.A09 = new HashMap();
        this.A08 = new HashMap();
        this.A03 = new HashMap();
        this.A07 = new HashMap();
        this.A04 = new HashMap();
        this.A06 = new HashMap();
        this.A02 = th;
    }

    public static C0qh A00() {
        return new C0qh(null);
    }

    public static void A01(C0g9 c0g9, C0qh c0qh, long j) {
        c0qh.A04(c0g9, Long.valueOf(j));
    }

    public void A02(C0ef c0ef, boolean z) {
        this.A03.put(c0ef, Boolean.valueOf(z));
    }

    public void A03(C0g9 c0g9, int i) {
        A01(c0g9, this, i);
    }

    public void A04(C0g9 c0g9, Long l) {
        java.util.Map map = this.A08;
        if (l == null) {
            map.remove(c0g9);
        } else {
            map.put(c0g9, l);
        }
    }

    public void A05(0jV r302, String str) {
        C0qc c0qc;
        int length;
        int i = this.A00;
        if (i > 0 && (c0qc = this.A01) != null && str != null && (length = str.length()) > i) {
            String str2 = r302.A00;
            HashMap hashMap = new HashMap();
            hashMap.put("collector", 0gL.A00(c0qc.A00));
            hashMap.put("key", str2);
            hashMap.put("length", String.valueOf(length));
            C0iy.A00().Bwu("PropertyValueTooLarge", null, hashMap);
            0fH.A14("lacrima", "PropertyValueTooLarge - %s", new Object[]{hashMap.toString()});
            if (c0qc.A02) {
                str = str.substring(0, c0qc.A01);
            }
        }
        java.util.Map map = this.A09;
        if (str == null) {
            str = "unknown";
        }
        map.put(r302, str);
    }

    public void A06(0gD r302, C0gq c0gq, File file) {
        java.util.Map map;
        StringBuilder A0k;
        String str;
        String A0d;
        if (c0gq == C0gq.CRITICAL_REPORT) {
            map = this.A04;
            str = r302.A01;
            if (str.equals("__")) {
                A0d = r302.A00;
                map.put(A0d, file.getPath());
            }
            A0k = AnonymousClass001.A0k();
        } else {
            map = this.A06;
            A0k = AnonymousClass001.A0k();
            str = r302.A01;
        }
        A0k.append(str);
        A0d = AnonymousClass001.A0d(r302.A00, A0k);
        map.put(A0d, file.getPath());
    }

    public void A07(String str, String str2) {
        C0qc c0qc;
        int length;
        int i = this.A00;
        if (i > 0 && (c0qc = this.A01) != null && str2 != null && (length = str2.length()) > i) {
            HashMap A0u = AnonymousClass001.A0u();
            A0u.put("collector", 0gL.A00(c0qc.A00));
            A0u.put("key", str);
            C0iy.A01("length", String.valueOf(length), A0u).Bwu("PropertyValueTooLarge", null, A0u);
            0fH.A14("lacrima", "PropertyValueTooLarge - %s", new Object[]{A0u.toString()});
            if (c0qc.A02) {
                str2 = str2.substring(0, c0qc.A01);
            }
        }
        java.util.Map map = this.A05;
        if (str2 == null) {
            str2 = "unknown";
        }
        map.put(str, str2);
    }

    public void A08(Properties properties) {
        properties.putAll(this.A05);
        for (Map.Entry entry : this.A09.entrySet()) {
            properties.put(((C0g0) entry.getKey()).A00, entry.getValue());
        }
        for (Map.Entry entry2 : this.A08.entrySet()) {
            properties.put(((C0g0) entry2.getKey()).A00, entry2.getValue().toString());
        }
        for (Map.Entry entry3 : this.A03.entrySet()) {
            properties.put(((C0g0) entry3.getKey()).A00, entry3.getValue().toString());
        }
        Iterator it = this.A07.entrySet().iterator();
        if (it.hasNext()) {
            AnonymousClass001.A0z(it).getKey();
            throw AnonymousClass001.A0Q("getName");
        }
    }
}
