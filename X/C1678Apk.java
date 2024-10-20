package X;

import com.facebook.contacts.server.FetchContactsResult;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Apk, reason: case insensitive filesystem */
/* loaded from: Apk.class */
public final class C1678Apk extends C4r3 {
    public static final String __redex_internal_original_name = "FetchTopContactsByCFPHatMethod";
    public final CGn A00;
    public final COi A01;
    public final C00i A02;

    public C1678Apk() {
        super(AbI.A0G(), AbI.A0s());
        this.A01 = AbJ.A0F();
        this.A00 = (CGn) 1Bn.A0A(84597);
        this.A02 = AbH.A0a();
    }

    @Override // X.C4r4
    public /* bridge */ /* synthetic */ 2Jf A06(Object obj) {
        C30G A0H = AbF.A0H(16);
        A0H.A06("limit", ((Number) obj).intValue());
        CGn.A00(this.A00, A0H);
        return A0H;
    }

    @Override // X.C4r3
    public /* bridge */ /* synthetic */ Object A07(Object obj, Object obj2) {
        ImmutableList A0a = 1BK.A0B(AbF.A0K((2JY) obj2, 2JX.class, 1705272213), 2JX.class, 1392614399, -1205597789).A0a(-948138906, 2JX.class);
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du it = A0a.iterator();
        while (it.hasNext()) {
            COi.A02(this.A01, 1BL.A0M(AbG.A0D(it), 535888496, 599211397), builder);
        }
        ImmutableList build = builder.build();
        0fH.A07(C1678Apk.class, build, "Got result: %s");
        return new FetchContactsResult(EnumC08284mf.A06, build, null, 1BL.A08(this.A02));
    }
}
