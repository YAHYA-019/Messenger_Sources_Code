package X;

import android.net.Uri;
import com.google.android.exoplayer2.Timeline;

/* loaded from: K0x.class */
public final class K0x extends 6ZI {
    public 5M9 A00;
    public final long A01;
    public final 6Yl A02;
    public final Timeline A03;
    public final 6Cl A04;
    public final 6DQ A05;
    public final 6ZG A06;

    public K0x(Uri uri, 6Yl r303, 6Cl r304, 6ZG r305, long j) {
        this.A04 = r304;
        this.A02 = r303;
        this.A01 = j;
        this.A06 = r305;
        this.A05 = new 6DQ(uri, 0, -1);
        this.A03 = new 6Yn(j);
    }

    public void A0E() {
    }

    public void A0F(5M9 r302) {
        this.A00 = r302;
        A0D(this.A03);
    }

    public 6Zm AKZ(6YR r302, 6XD r303, long j) {
        6DQ r0 = this.A05;
        6Cl r02 = this.A04;
        5M9 r03 = this.A00;
        6Yl r04 = this.A02;
        long j2 = this.A01;
        return new Lb6(r04, new 6ZL(r302, ((6ZI) this).A04.A02, 0, 0L), r02, r0, this.A06, r03, j2);
    }

    public 6Xx AwB() {
        return null;
    }

    public void Bdm() {
    }

    public void Ccv(6Zm r302) {
        ((Lb6) r302).A08.A03((6Zp) null);
    }
}
