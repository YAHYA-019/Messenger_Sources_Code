package X;

import com.google.common.collect.ImmutableMultimap;
import java.util.BitSet;
import java.util.List;

/* renamed from: X.865, reason: invalid class name */
/* loaded from: 865.class */
public final class AnonymousClass865 extends 1LH {
    public final ImmutableMultimap A00;
    public final 2lO A01;
    public final 6yN A02;
    public final 6qZ A03;
    public final boolean A04;

    public AnonymousClass865(2lO r302, 6yN r303, 6qZ r304, ImmutableMultimap immutableMultimap, boolean z) {
        7zR.A1O(r303, r304);
        this.A01 = r302;
        this.A02 = r303;
        this.A03 = r304;
        this.A00 = immutableMultimap;
        this.A04 = z;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        4NU A00 = 4NT.A00(c2k5, AnonymousClass866.A00);
        C2lh A002 = C2lc.A00(c2k5, AnonymousClass867.A00);
        4FL.A00(c2k5, AQu.A00(A002, this, A00, 40), new Object[]{this.A00, A00});
        8BP r0 = (8BP) 2rO.A00(c2k5, AQu.A00(A002, this, A00, 41), new Object[]{A002});
        8Ls r02 = (8Ls) A002.A02;
        if (r02 == null) {
            return new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, (List) null, false);
        }
        C8S0 c8s0 = new C8S0(c2k5.A05, new C8lb());
        C5z7.A00(c8s0, this.A01);
        C8lb c8lb = c8s0.A01;
        c8lb.A00 = r0;
        BitSet bitSet = c8s0.A02;
        bitSet.set(0);
        c8lb.A03 = this.A03;
        bitSet.set(2);
        c8lb.A02 = this.A02;
        bitSet.set(1);
        c8lb.A01 = r02;
        bitSet.set(4);
        c8lb.A04 = this.A04;
        bitSet.set(3);
        C1rs.A04(bitSet, c8s0.A03);
        c8s0.A0J();
        return c8lb;
    }
}
