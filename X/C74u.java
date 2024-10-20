package X;

import android.content.res.Resources;
import java.util.BitSet;
import java.util.List;

/* renamed from: X.74u, reason: invalid class name */
/* loaded from: 74u.class */
public final class C74u implements C6zG {
    public static final C74u A0C = new 7ZC().A00();
    public final C6z3 A00;
    public final C2pe A01;
    public final C2pe A02;
    public final C2pe A03;
    public final C2pe A04;
    public final 6zD A05;
    public final AnonymousClass713 A06;
    public final AnonymousClass713 A07;
    public final AnonymousClass713 A08;
    public final AnonymousClass713 A09;
    public final boolean A0A;
    public final boolean A0B;

    public C74u(C2pe c2pe, C2pe c2pe2, C2pe c2pe3, C2pe c2pe4, AnonymousClass713 anonymousClass713, AnonymousClass713 anonymousClass7132, AnonymousClass713 anonymousClass7133, AnonymousClass713 anonymousClass7134, boolean z) {
        this.A00 = C6z2.A0R;
        this.A05 = C74w.A00;
        this.A02 = c2pe2;
        this.A01 = c2pe;
        this.A04 = c2pe4;
        this.A03 = c2pe3;
        this.A07 = anonymousClass7132;
        this.A06 = anonymousClass713;
        this.A09 = anonymousClass7134;
        this.A08 = anonymousClass7133;
        this.A0B = false;
        this.A0A = z;
    }

    public C74u(7ZC r302) {
        this.A00 = C6z2.A0R;
        6zD r303 = r302.A04;
        this.A05 = r303 == null ? C74w.A00 : r303;
        C2pe c2pe = r302.A01;
        if (c2pe == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A02 = c2pe;
        C2pe c2pe2 = r302.A00;
        if (c2pe2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A01 = c2pe2;
        C2pe c2pe3 = r302.A03;
        if (c2pe3 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A04 = c2pe3;
        C2pe c2pe4 = r302.A02;
        if (c2pe4 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A03 = c2pe4;
        this.A07 = r302.A06;
        this.A06 = r302.A05;
        this.A09 = r302.A08;
        this.A08 = r302.A07;
        this.A0B = r302.A09;
        this.A0A = false;
    }

    @Override // X.C6zG
    public 1LI AMI(1LI r302, C1qb c1qb, C5j5 c5j5, 5vW r305, List list, int i) {
        Resources resources;
        int Chq;
        11T.A0F(c1qb, 0);
        11T.A0F(c5j5, 1);
        11T.A0F(r302, 2);
        11T.A0F(r305, 3);
        11T.A0F(list, 5);
        if (!this.A05.BUV(r305, i)) {
            return r302;
        }
        C5fv c5fv = ((5vV) r305).A00;
        AnonymousClass713 anonymousClass713 = this.A07;
        C74o c74o = C74o.A01;
        if (11T.A0O(anonymousClass713, c74o)) {
            C2pe c2pe = this.A02;
            resources = ((1Iw) c1qb).A0D.getResources();
            11T.A0A(resources);
            Chq = c2pe.Chq(resources);
        } else {
            resources = 4YU.A0C(((1Iw) c1qb).A0D);
            Chq = anonymousClass713.Chw(resources, c5fv, null, list, i);
        }
        AnonymousClass713 anonymousClass7132 = this.A06;
        int Chw = !11T.A0O(anonymousClass7132, c74o) ? anonymousClass7132.Chw(resources, c5fv, r305, list, i) : this.A01.Chq(resources);
        AnonymousClass713 anonymousClass7133 = this.A09;
        int Chw2 = !11T.A0O(anonymousClass7133, c74o) ? anonymousClass7133.Chw(resources, c5fv, null, list, i) : this.A04.Chq(resources);
        AnonymousClass713 anonymousClass7134 = this.A08;
        int Chw3 = !11T.A0O(anonymousClass7134, c74o) ? anonymousClass7134.Chw(resources, c5fv, null, list, i) : this.A03.Chq(resources);
        85Z r0 = new 85Z(c1qb, new 7Io());
        7Io r02 = r0.A01;
        r02.A04 = r302.A0l();
        BitSet bitSet = r0.A02;
        bitSet.set(1);
        r02.A00 = Chq;
        r02.A01 = Chw;
        r02.A02 = Chw2;
        r02.A03 = Chw3;
        r02.A05 = c5fv;
        bitSet.set(0);
        r02.A07 = this.A0B;
        r02.A06 = this.A0A;
        C1rs.A05(bitSet, r0.A03, 2);
        r0.A0J();
        return r02;
    }

    @Override // X.C6zJ
    public /* bridge */ /* synthetic */ Object Am9() {
        return this.A00;
    }
}
