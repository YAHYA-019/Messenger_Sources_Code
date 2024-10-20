package X;

import com.google.common.base.Objects;
import java.util.Arrays;

/* renamed from: X.2ql, reason: invalid class name */
/* loaded from: 2ql.class */
public final class C2ql {
    public final EnumC02393v2 A00;
    public final 2iH A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public C2ql(C3v1 c3v1) {
        this.A05 = c3v1.A05;
        this.A00 = c3v1.A00;
        this.A02 = c3v1.A02;
        this.A04 = c3v1.A04;
        this.A03 = c3v1.A03;
        this.A07 = c3v1.A07;
        this.A06 = c3v1.A06;
        this.A01 = c3v1.A01;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C2ql c2ql = (C2ql) obj;
            if (this.A07 != c2ql.A07 || this.A06 != c2ql.A06 || this.A00 != c2ql.A00 || !Objects.equal(this.A05, c2ql.A05) || !Objects.equal(this.A02, c2ql.A02) || !Objects.equal(this.A03, c2ql.A03) || !Objects.equal(this.A04, c2ql.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{1BK.A0d(), Boolean.valueOf(this.A07), -13513658, Boolean.valueOf(this.A06), this.A00, this.A05, this.A02, this.A03, this.A04});
    }
}
