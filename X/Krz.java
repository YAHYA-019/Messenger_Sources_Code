package X;

import com.google.common.base.Objects;
import java.util.Arrays;

/* loaded from: Krz.class */
public final class Krz {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final 6Xx A06;
    public final Object A07;
    public final Object A08;

    public Krz(6Xx r302, Object obj, Object obj2, int i, int i2, int i3, int i4, long j, long j2) {
        this.A08 = obj;
        this.A02 = i;
        this.A06 = r302;
        this.A07 = obj2;
        this.A03 = i2;
        this.A05 = j;
        this.A04 = j2;
        this.A00 = i3;
        this.A01 = i4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Krz krz = (Krz) obj;
            if (this.A02 != krz.A02 || this.A03 != krz.A03 || this.A05 != krz.A05 || this.A04 != krz.A04 || this.A00 != krz.A00 || this.A01 != krz.A01 || !Objects.equal(this.A08, krz.A08) || !Objects.equal(this.A07, krz.A07) || !Objects.equal(this.A06, krz.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A08, Integer.valueOf(this.A02), this.A06, this.A07, Integer.valueOf(this.A03), Long.valueOf(this.A05), Long.valueOf(this.A04), Integer.valueOf(this.A00), Integer.valueOf(this.A01)});
    }
}
