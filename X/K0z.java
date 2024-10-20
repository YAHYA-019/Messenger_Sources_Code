package X;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Util;

/* loaded from: K0z.class */
public final class K0z extends 6Yo {
    public final long A00;
    public final long A01;
    public final long A02;
    public final boolean A03;

    public K0z(Timeline timeline, long j, long j2) {
        super(timeline);
        boolean z = false;
        if (timeline.A01() != 1) {
            throw new KLo(0);
        }
        6Xp A0F = timeline.A0F(new 6Xp(), 0, 0L);
        long max = Math.max(0L, j);
        if (!A0F.A0F && max != 0 && !A0F.A0G) {
            throw new KLo(1);
        }
        long max2 = j2 == Long.MIN_VALUE ? A0F.A03 : Math.max(0L, j2);
        long j3 = A0F.A03;
        if (j3 != -9223372036854775807L) {
            max2 = max2 > j3 ? j3 : max2;
            if (max > max2) {
                throw new KLo(2);
            }
        }
        this.A02 = max;
        this.A01 = max2;
        this.A00 = max2 == -9223372036854775807L ? -9223372036854775807L : max2 - max;
        if (A0F.A0D && (max2 == -9223372036854775807L || (j3 != -9223372036854775807L && max2 == j3))) {
            z = true;
        }
        this.A03 = z;
    }

    public 6YE A0E(6YE r302, int i, boolean z) {
        ((6Yo) this).A00.A0E(r302, 0, z);
        long j = r302.A02 - this.A02;
        long j2 = this.A00;
        r302.A03(r302.A04, r302.A05, j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j, j);
        return r302;
    }

    public 6Xp A0F(6Xp r302, int i, long j) {
        ((6Yo) this).A00.A0F(r302, 0, 0L);
        long j2 = r302.A05;
        long j3 = this.A02;
        r302.A05 = j2 + j3;
        r302.A03 = this.A00;
        r302.A0D = this.A03;
        long j4 = r302.A02;
        if (j4 != -9223372036854775807L) {
            long max = Math.max(j4, j3);
            r302.A02 = max;
            long j5 = this.A01;
            if (j5 != -9223372036854775807L) {
                max = Math.min(max, j5);
            }
            r302.A02 = max;
            r302.A02 = max - j3;
        }
        long A0C = Util.A0C(j3);
        long j6 = r302.A06;
        if (j6 != -9223372036854775807L) {
            r302.A06 = j6 + A0C;
        }
        long j7 = r302.A07;
        if (j7 != -9223372036854775807L) {
            r302.A07 = j7 + A0C;
        }
        return r302;
    }
}
