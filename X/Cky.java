package X;

import com.google.common.collect.ImmutableList;

/* loaded from: Cky.class */
public final class Cky implements DGy {
    public final /* synthetic */ Ckw A00;

    public Cky(Ckw ckw) {
        this.A00 = ckw;
    }

    @Override // X.DGy
    public C30G AKr(String str, long j) {
        C30G A0H = AbF.A0H(54);
        A0H.A03("group_id", String.valueOf(j));
        A0H.A03("name_filter", str);
        A0H.A08("use_group_member_profiles", false);
        return A0H;
    }

    @Override // X.DGy
    public /* bridge */ /* synthetic */ ImmutableList BId(Object obj) {
        2JY A0B;
        2JY r0 = (2JY) obj;
        ImmutableList.Builder builder = ImmutableList.builder();
        if (r0 != null && (A0B = 1BK.A0B(r0, 2JX.class, -1096463820, 191383248)) != null) {
            2JY A0B2 = 1BK.A0B(A0B, 2JX.class, -47747331, 1947561804);
            if (A0B2 != null || A0B.A0L(1776946735, 2JX.class, -986461305) != null) {
                if (A0B2 == null) {
                    A0B2 = 1BK.A0B(A0B, 2JX.class, 1776946735, -986461305);
                }
                1Du A0u = AbI.A0u(A0B2, C1708Aqe.class, 567424580);
                while (A0u.hasNext()) {
                    builder.m11011add((Object) this.A00.A02.A06((C1708Aqe) A0u.next()));
                }
                return builder.build();
            }
        }
        1BK.A09(this.A00.A01).D0v("GroupAssociatedObjectAudienceFetcher", "Create chat audience fetcher white listed audience and group member profiles returned null from server.");
        return builder.build();
    }
}
