package X;

import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.wellbeing.selfremediation.block.group.groupwarning.WarningBottomSheetFragment;

/* loaded from: C4X.class */
public final class C4X {
    public final 1De A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;

    public C4X(1De r302) {
        this.A00 = r302;
        1BY r0 = r302.A00;
        this.A01 = 1Bu.A03(r0, 50205);
        this.A03 = 1Bu.A03(r0, 679);
        this.A02 = 1Bu.A03(r0, 147779);
    }

    public final void A00(Context context, 06Z r303, ThreadSummary threadSummary, C00m c00m, boolean z) {
        AbK.A1S(context, r303);
        if (threadSummary != null) {
            1Br.A0C(this.A02);
            B5J b5j = new B5J(context, r303, new Bcj(c00m), threadSummary);
            if (z) {
                WarningBottomSheetFragment warningBottomSheetFragment = (WarningBottomSheetFragment) AbM.A0q(b5j);
                if (C0D1.A01(r303)) {
                    warningBottomSheetFragment.A0m(r303, "WarningBottomSheetFragment");
                    B5J b5j2 = warningBottomSheetFragment.A00;
                    if (b5j2 != null) {
                        b5j2.A00.A03();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        c00m.invoke();
    }
}
