package X;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.41c, reason: invalid class name */
/* loaded from: 41c.class */
public final class C41c {
    public final String A00;
    public final java.util.Map A01;
    public final boolean A02;
    public final boolean A03;

    public C41c() {
        this.A01 = AnonymousClass001.A0u();
        this.A03 = false;
        this.A02 = false;
        this.A00 = new String();
    }

    public C41c(String str, java.util.Map map, boolean z, boolean z2) {
        this.A03 = z;
        this.A02 = z2;
        this.A00 = str;
        this.A01 = new HashMap();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            String[] split = AnonymousClass001.A0i(it).split(":");
            int length = split.length;
            if (length >= 3 && length <= 4) {
                String str2 = split[0];
                if (str2.length() == 2) {
                    String str3 = split[1];
                    if (str3.length() != 0) {
                        String str4 = split[2];
                        if (str4.length() != 0) {
                            C5e9 c5e9 = new C5e9(str3, str4, length > 3 ? split[3] : "");
                            c5e9.A00 = AnonymousClass001.A1Q(str2.charAt(0), "ET".charAt(0));
                            c5e9.A01 = AnonymousClass001.A1Q(split[0].charAt(1), "ET".charAt(1));
                            this.A01.put(c5e9.A04, c5e9);
                        }
                    }
                }
            }
        }
    }
}
