package X;

import com.google.android.exoplayer2.Timeline;
import com.google.common.base.Objects;
import java.util.Arrays;

/* loaded from: Ks1.class */
public final class Ks1 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final Timeline A06;
    public final Timeline A07;
    public final 6YR A08;
    public final 6YR A09;

    public Ks1(Timeline timeline, Timeline timeline2, 6YR r304, 6YR r305, int i, int i2, long j, long j2, long j3, long j4) {
        this.A04 = j;
        this.A07 = timeline;
        this.A01 = i;
        this.A09 = r304;
        this.A03 = j2;
        this.A06 = timeline2;
        this.A00 = i2;
        this.A08 = r305;
        this.A02 = j3;
        this.A05 = j4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Ks1 ks1 = (Ks1) obj;
            if (this.A04 != ks1.A04 || this.A01 != ks1.A01 || this.A03 != ks1.A03 || this.A00 != ks1.A00 || this.A02 != ks1.A02 || this.A05 != ks1.A05 || !Objects.equal(this.A07, ks1.A07) || !Objects.equal(this.A09, ks1.A09) || !Objects.equal(this.A06, ks1.A06) || !Objects.equal(this.A08, ks1.A08)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A04), this.A07, Integer.valueOf(this.A01), this.A09, Long.valueOf(this.A03), this.A06, Integer.valueOf(this.A00), this.A08, Long.valueOf(this.A02), Long.valueOf(this.A05)});
    }
}
