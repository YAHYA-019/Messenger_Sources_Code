package X;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: X.67d, reason: invalid class name */
/* loaded from: 67d.class */
public abstract class C67d {
    public final Uri A00;
    public final 02C A01;
    public final String A02;
    public final 6QD A03;
    public final 67T A04;

    public C67d(02C r302, String str, String str2, 6QD r305, 67T r306) {
        Uri A03 = C0A2.A03(str);
        11T.A0A(A03);
        this.A00 = A03;
        this.A03 = r305;
        this.A04 = r306;
        this.A02 = str2;
        this.A01 = r302;
    }

    public C67d(67T r302) {
        this.A00 = Uri.EMPTY;
        this.A03 = null;
        this.A04 = r302;
        this.A02 = "";
        this.A01 = null;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof C67d) {
            C67d c67d = (C67d) obj;
            if (this.A00.equals(c67d.A00)) {
                6QD r0 = this.A03;
                6QD r02 = c67d.A03;
                if (r0 != null ? r0.equals(r02) : r02 == null) {
                    02C r03 = this.A01;
                    02C r04 = c67d.A01;
                    if (r03 != null ? r03.equals(r04) : r04 == null) {
                        if (this.A02.equals(c67d.A02)) {
                            z = true;
                        }
                    }
                }
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A00, this.A03, this.A04, this.A01});
    }
}
