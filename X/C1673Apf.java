package X;

import com.facebook.fbservice.results.BaseResult;
import com.facebook.pages.adminedpages.protocol.AdminedPagesPrefetchMethod$Params;

/* renamed from: X.Apf, reason: case insensitive filesystem */
/* loaded from: Apf.class */
public final class C1673Apf extends C4r3 {
    public static final String __redex_internal_original_name = "AdminedPagesPrefetchMethod";
    public final C00i A00;

    public C1673Apf() {
        super(AbI.A0G(), AbI.A0s());
        this.A00 = AbH.A0a();
    }

    @Override // X.C4r4
    public /* bridge */ /* synthetic */ 2Jf A06(Object obj) {
        C30G A0H = AbF.A0H(94);
        A0H.A06("num_most_recently_used_pages", ((AdminedPagesPrefetchMethod$Params) obj).A00);
        return A0H;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.fbservice.results.BaseResult, java.lang.Object, com.facebook.pages.adminedpages.protocol.AdminedPagesPrefetchMethod$Result] */
    @Override // X.C4r3
    public /* bridge */ /* synthetic */ Object A07(Object obj, Object obj2) {
        2JX r0 = (2JX) obj2;
        if (r0 == null) {
            throw AnonymousClass001.A0T("Invalid JSON result");
        }
        ?? baseResult = new BaseResult(EnumC08284mf.A06, 1BL.A08(this.A00));
        baseResult.A00 = r0;
        return baseResult;
    }
}
