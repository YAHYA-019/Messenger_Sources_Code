package X;

import java.util.Map;

/* renamed from: X.3ro, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3ro.class */
public abstract class AbstractC01593ro {
    public int A00() {
        return ((C01583rn) this).A00;
    }

    public AbstractC01593ro A01(24X r302, String str) {
        C01583rn c01583rn = (C01583rn) this;
        2wC.A01(c01583rn.A01.A09(), r302, str);
        return c01583rn;
    }

    public AbstractC01593ro A02(Object obj, String str) {
        C01583rn c01583rn = (C01583rn) this;
        if (obj != null) {
            c01583rn.A01.A08(str, obj.toString());
        }
        return c01583rn;
    }

    public AbstractC01593ro A03(String str, double d) {
        C01583rn c01583rn = (C01583rn) this;
        c01583rn.A01.A07(Double.valueOf(d), str);
        return c01583rn;
    }

    public AbstractC01593ro A04(String str, int i) {
        C01583rn c01583rn = (C01583rn) this;
        c01583rn.A01.A07(Integer.valueOf(i), str);
        return c01583rn;
    }

    public AbstractC01593ro A05(String str, long j) {
        C01583rn c01583rn = (C01583rn) this;
        c01583rn.A01.A07(Long.valueOf(j), str);
        return c01583rn;
    }

    public AbstractC01593ro A06(String str, String str2) {
        C01583rn c01583rn = (C01583rn) this;
        c01583rn.A01.A08(str, str2);
        return c01583rn;
    }

    public AbstractC01593ro A07(String str, boolean z) {
        C01583rn c01583rn = (C01583rn) this;
        c01583rn.A01.A06(Boolean.valueOf(z), str);
        return c01583rn;
    }

    public AbstractC01593ro A08(java.util.Map map) {
        C01583rn c01583rn = (C01583rn) this;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof 24X) {
                    String A0j = AnonymousClass001.A0j(entry);
                    2wC.A01(c01583rn.A01.A09(), (24X) value, A0j);
                } else {
                    boolean z = value instanceof String;
                    String str = (String) entry.getKey();
                    if (z) {
                        c01583rn.A01.A08(str, (String) value);
                    } else if (value != null) {
                        c01583rn.A01.A08(str, value.toString());
                    }
                }
            }
        }
        return c01583rn;
    }

    public String A09() {
        return ((C01583rn) this).A01.A0A();
    }

    public void A0A() {
        ((C01583rn) this).A01.A0B();
    }

    public boolean A0B() {
        return ((C01583rn) this).A01.A0D();
    }
}
