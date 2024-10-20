package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Apc, reason: case insensitive filesystem */
/* loaded from: Apc.class */
public final class C1670Apc extends C4r3 {
    public static final String __redex_internal_original_name = "ViewerConfigurationMethod";

    public C1670Apc() {
        super(AbI.A0G(), AbI.A0s());
    }

    @Override // X.C4r4
    public /* bridge */ /* synthetic */ 2Jf A06(Object obj) {
        C30G A0H = AbF.A0H(0);
        A0H.A07("config_names", (ImmutableList) obj);
        return A0H;
    }

    @Override // X.C4r3
    public /* bridge */ /* synthetic */ Object A07(Object obj, Object obj2) {
        2JY r0 = (2JY) obj2;
        ImmutableList.Builder A0h = 4YU.A0h();
        if (r0 != null) {
            ImmutableList A2K = 1BL.A0L(r0, 951117169, 1992211083).A2K(96356950, 1872478264);
            int size = A2K.size();
            for (int i = 0; i < size; i++) {
                A0h.m11011add(A2K.get(i));
            }
        }
        return A0h.build();
    }
}
