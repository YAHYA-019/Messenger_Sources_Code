package X;

import java.util.Arrays;

/* renamed from: X.67a, reason: invalid class name */
/* loaded from: 67a.class */
public final class C67a {
    public String A00;
    public String A01;
    public String A02;

    public C67a() {
        this.A02 = "";
        this.A00 = "";
        this.A01 = "";
    }

    public C67a(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof C67a) {
            C67a c67a = (C67a) obj;
            if (this.A02.equals(c67a.A02)) {
                String str = this.A00;
                String str2 = c67a.A00;
                if (str != null ? str.equals(str2) : str2 == null) {
                    String str3 = this.A01;
                    String str4 = c67a.A01;
                    if (str3 != null ? str3.equals(str4) : str4 == null) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A02, this.A00, this.A01});
    }
}
