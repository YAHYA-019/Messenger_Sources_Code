package X;

import com.facebook.common.util.TriState;
import com.google.common.base.Objects;
import java.util.Arrays;

/* renamed from: X.4r6, reason: invalid class name */
/* loaded from: 4r6.class */
public final class C4r6 {
    public final TriState A00;
    public final 1Ro A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public C4r6(TriState triState, 1Ro r303, Object obj, String str, String str2) {
        this.A01 = r303;
        this.A02 = obj;
        this.A04 = str2;
        this.A03 = str;
        this.A00 = triState;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof C4r6) {
            C4r6 c4r6 = (C4r6) obj;
            if (Objects.equal(this.A04, c4r6.A04) && Objects.equal(this.A01, c4r6.A01) && Objects.equal(this.A02, c4r6.A02) && Objects.equal(this.A03, c4r6.A03) && this.A00 == c4r6.A00) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A01, this.A02, this.A03, null, null, this.A00});
    }
}
