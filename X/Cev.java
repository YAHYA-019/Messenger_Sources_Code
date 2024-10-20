package X;

import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.pages.adminedpages.protocol.AdminedPagesPrefetchMethod$Params;
import com.facebook.pages.adminedpages.service.LoadAdminedPagesParams;
import java.util.concurrent.ExecutionException;

/* loaded from: Cev.class */
public final class Cev implements C4Av, CallerContextable {
    public static final String __redex_internal_original_name = "AdminedPagesPrefetchConditionalWorker";
    public final Bundle A00;
    public final C00i A02;
    public final C00i A06;
    public final C00i A03 = 1BV.A00(33031);
    public final C00i A04 = AbH.A0a();
    public final C00i A05 = AbH.A0S();
    public final C00i A01 = 1BV.A00(32986);

    public Cev() {
        Bundle A05 = 1BK.A05();
        this.A00 = A05;
        this.A06 = AbH.A0P();
        this.A02 = 1BV.A00(33252);
        A05.putParcelable("adminedPagesPrefetchParams", new AdminedPagesPrefetchMethod$Params());
    }

    /* JADX WARN: Type inference failed for: r0v88, types: [X.2J3, X.Afo] */
    @Override // X.C4Av
    public boolean Ciy(4Yg r302) {
        if (!r302.A01()) {
            return false;
        }
        synchronized (this) {
            if (((1Ew) 1Bi.A03(65755)).AXy() != 0S2.A0C) {
                4CP r0 = (4CP) this.A01.get();
                r0.A02 = 1BL.A08(r0.A00);
                1He r307 = 1BL.A08(this.A04) - 1BL.A0A(1BK.A0R(this.A05), ((C4Fw) this.A02.get()).A00()) < 86400000 ? 1He.A05 : 1He.A02;
                Bundle bundle = this.A00;
                bundle.putParcelable("loadAdminedPagesParam", new LoadAdminedPagesParams(r307));
                try {
                    AbK.A0H(bundle, CallerContext.A06(Cev.class), 4YU.A0L(this.A03), 1BJ.A00(75)).get();
                    return true;
                } catch (InterruptedException | ExecutionException e) {
                    if (C3Oo.A01(e) != 29B.A05) {
                        C1kw A06 = 1BK.A06(this.A06);
                        if (C1381Afo.A00 == null) {
                            synchronized (C1381Afo.class) {
                                if (C1381Afo.A00 == null) {
                                    C1381Afo.A00 = new C2J3(A06);
                                }
                            }
                        }
                        C1381Afo c1381Afo = C1381Afo.A00;
                        2Jy A0C = AbK.A0C(AbstractC00603o4.A00(ActionId.VIDEO_PLAYING));
                        A0C.A0D("exception", e.getMessage());
                        c1381Afo.A03(A0C);
                    }
                }
            }
            return false;
        }
    }
}
