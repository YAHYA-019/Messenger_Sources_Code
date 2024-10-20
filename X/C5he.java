package X;

import android.content.Context;
import com.google.common.base.Optional;
import java.util.Arrays;

/* renamed from: X.5he, reason: invalid class name */
/* loaded from: 5he.class */
public final class C5he {
    public final int A00;
    public final Optional A01;
    public final Optional A02;
    public final String A03;
    public final String A04;
    public final Context A05;

    public C5he(Context context, Optional optional, Optional optional2, String str, String str2, int i) {
        11T.A0F(str, 4);
        this.A05 = context;
        this.A00 = i;
        this.A02 = optional;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = optional2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            C5he c5he = (C5he) obj;
            if (this.A00 != c5he.A00 || !11T.A0O(this.A02, c5he.A02) || !11T.A0O(this.A05, c5he.A05) || !11T.A0O(this.A03, c5he.A03) || !11T.A0O(this.A04, c5he.A04) || !11T.A0O(this.A01, c5he.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, Integer.valueOf(this.A00), this.A02, this.A03, this.A04, this.A01});
    }
}
