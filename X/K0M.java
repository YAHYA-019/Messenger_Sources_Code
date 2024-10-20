package X;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Util;
import java.util.List;

/* loaded from: K0M.class */
public final class K0M extends Timeline {
    public final long A00;
    public final long A01;
    public final long A02;
    public final C6W0 A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final 6Y0 A08;
    public final 6Xx A09;

    public K0M(6Y0 r302, 6Xx r303, C6W0 c6w0, int i, long j, long j2, long j3, long j4, long j5, long j6) {
        6DP.A04(c6w0.A0S != AnonymousClass001.A1T(r302) ? false : true);
        this.A06 = j;
        this.A07 = j2;
        this.A05 = j3;
        this.A04 = i;
        this.A00 = j4;
        this.A02 = j5;
        this.A01 = j6;
        this.A03 = c6w0;
        this.A09 = r303;
        this.A08 = r302;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int A01() {
        return this.A03.A0R.size();
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int A02() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int A06(Object obj) {
        int A03;
        if (!(obj instanceof Integer) || (A03 = AnonymousClass001.A03(obj) - this.A04) < 0 || A03 >= A01()) {
            return -1;
        }
        return A03;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Object A0C(int i) {
        6DP.A00(i, A01());
        return Integer.valueOf(this.A04 + i);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public 6YE A0E(6YE r302, int i, boolean z) {
        String str;
        6DP.A00(i, A01());
        Integer num = null;
        if (z) {
            str = JQx.A0f(this.A03, i).A02;
            int i2 = this.A04;
            6DP.A00(i, A01());
            num = Integer.valueOf(i2 + i);
        } else {
            str = null;
        }
        C6W0 c6w0 = this.A03;
        long A00 = c6w0.A00(i);
        List list = c6w0.A0R;
        r302.A03(str, num, A00, Util.A0B(((KqM) list.get(i)).A00 - ((KqM) 1BK.A0r(list)).A00) - this.A00);
        return r302;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
    
        if (r0.A07 != (-9223372036854775807L)) goto L19;
     */
    @Override // com.google.android.exoplayer2.Timeline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.6Xp A0F(X.6Xp r302, int r303, long r304) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0M.A0F(X.6Xp, int, long):X.6Xp");
    }
}
