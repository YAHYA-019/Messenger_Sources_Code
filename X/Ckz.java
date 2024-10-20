package X;

import com.google.common.collect.ImmutableList;

/* loaded from: Ckz.class */
public final class Ckz implements DGy {
    public final /* synthetic */ Ckx A00;

    public Ckz(Ckx ckx) {
        this.A00 = ckx;
    }

    @Override // X.DGy
    public C30G AKr(String str, long j) {
        C30G A0H = AbF.A0H(55);
        A0H.A03("thread_id", String.valueOf(j));
        A0H.A03("name_filter", str);
        return A0H;
    }

    @Override // X.DGy
    public /* bridge */ /* synthetic */ ImmutableList BId(Object obj) {
        2JY A0B;
        2JY A0B2 = 1BK.A0B((2JY) obj, 2JX.class, 1026442562, 593411375);
        if (A0B2 == null || (A0B = 1BK.A0B(A0B2, 2JX.class, -413756418, -1287769885)) == null) {
            return ImmutableList.of();
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du A0u = AbI.A0u(A0B, C1708Aqe.class, 567424580);
        while (A0u.hasNext()) {
            builder.m11011add((Object) this.A00.A03.A06((C1708Aqe) A0u.next()));
        }
        return builder.build();
    }
}
