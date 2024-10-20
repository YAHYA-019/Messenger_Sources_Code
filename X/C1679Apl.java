package X;

import android.content.Context;
import com.facebook.messaging.service.model.FetchMessageParams;
import java.util.List;

/* renamed from: X.Apl, reason: case insensitive filesystem */
/* loaded from: Apl.class */
public final class C1679Apl extends C4r3 {
    public static final String __redex_internal_original_name = "FetchMessageGQLMethod";
    public 1BY A00;
    public final C00i A01;
    public final C00i A02;

    public C1679Apl(1BO r302) {
        super(AbI.A0G(), AbI.A0s());
        this.A02 = 7zN.A0D(84508);
        this.A01 = 1BQ.A02(16824);
        this.A00 = 7zL.A0Q(r302);
    }

    @Override // X.C4r4
    public /* bridge */ /* synthetic */ 2Jf A06(Object obj) {
        C30G A0H = AbF.A0H(47);
        A0H.A07("thread_msg_ids", CQW.A04(AbF.A11(obj)));
        A0H.A06("profile_pic_medium_size", AbK.A02((1qF) this.A01.get()));
        ((CIn) this.A02.get()).A02(A0H);
        return A0H;
    }

    @Override // X.C4r3
    public /* bridge */ /* synthetic */ Object A07(Object obj, Object obj2) {
        FetchMessageParams fetchMessageParams = (FetchMessageParams) obj;
        List list = (List) obj2;
        if (list == null || list.isEmpty() || list.get(0) == null) {
            return null;
        }
        FetchMessageParams fetchMessageParams2 = new FetchMessageParams(fetchMessageParams.A00, AbG.A1B(AbF.A0M(list, 0)));
        1BY r0 = this.A00;
        return ((CQW) 1Lo.A04((Context) null, 1Fw.A05(r0), r0, 84501)).A0C(list, AbF.A11(fetchMessageParams2)).get(fetchMessageParams2.A01);
    }
}
