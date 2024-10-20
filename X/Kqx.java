package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.Set;

/* loaded from: Kqx.class */
public final class Kqx {
    public float A00;
    public int A01;
    public int A03;
    public String A09 = "";
    public String A0A = "";
    public Set A0C = Collections.emptySet();
    public String A0B = "";
    public String A08 = null;
    public boolean A0F = false;
    public boolean A0E = false;
    public int A07 = -1;
    public int A02 = -1;
    public int A05 = -1;
    public int A04 = -1;
    public int A06 = -1;
    public boolean A0D = false;

    public int A00(String str, String str2, String str3, Set set) {
        int i;
        int i2;
        if (this.A09.isEmpty() && this.A0A.isEmpty() && this.A0C.isEmpty() && this.A0B.isEmpty()) {
            i = TextUtils.isEmpty(str2) ? 1 : 0;
        } else {
            String str4 = this.A09;
            i = 0;
            if (str4.isEmpty()) {
                i2 = 0;
            } else {
                i2 = -1;
                if (str4.equals(str)) {
                    i2 = 1073741824;
                }
            }
            String str5 = this.A0A;
            if (!str5.isEmpty()) {
                int i3 = -1;
                if (i2 != -1) {
                    if (str5.equals(str2)) {
                        i3 = i2 + 2;
                    }
                    i2 = i3;
                }
            }
            String str6 = this.A0B;
            if (!str6.isEmpty()) {
                if (i2 != -1 && str6.equals(str3)) {
                    i2 += 4;
                }
            }
            if (i2 != -1 && set.containsAll(this.A0C)) {
                return i2 + (this.A0C.size() * 4);
            }
        }
        return i;
    }
}
