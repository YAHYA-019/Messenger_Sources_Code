package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.wellbeing.selfremediation.block.group.groupwarning.WarningBottomSheetFragment;
import com.facebook.messaging.wellbeing.selfremediation.block.group.groupwarning.WarningBottomSheetParam;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: B5J.class */
public final class B5J extends 6Hk {
    public CNg A00;
    public WarningBottomSheetFragment A01;
    public final Context A02;
    public final 06Z A03;
    public final 1Br A04;
    public final Bcj A08;
    public final ThreadSummary A09;
    public final 1Br A05 = 1Bu.A00(82657);
    public final 1Br A07 = 1Bu.A00(82658);
    public final 1Br A06 = 1Bu.A00(82656);

    /* JADX WARN: Type inference failed for: r0v32, types: [com.facebook.messaging.wellbeing.selfremediation.block.group.groupwarning.WarningBottomSheetFragment, androidx.fragment.app.Fragment, java.lang.Object] */
    public B5J(Context context, 06Z r303, Bcj bcj, ThreadSummary threadSummary) {
        this.A02 = context;
        this.A09 = threadSummary;
        this.A03 = r303;
        this.A08 = bcj;
        this.A04 = 1Bu.A01(context, 82535);
        94S r0 = MigBottomSheetDialogFragment.A01;
        Context context2 = this.A02;
        Bundle A05 = AbH.A05(new WarningBottomSheetParam(1BK.A0u(context2, 2131954255), 1BK.A0u(context2, 2131954254), 1BK.A0u(context2, 2131953424), 1BK.A0u(context2, 2131953426)), "param");
        ?? warningBottomSheetFragment = new WarningBottomSheetFragment();
        warningBottomSheetFragment.setArguments(A05);
        ((6Hk) this).A00 = warningBottomSheetFragment;
        this.A01 = warningBottomSheetFragment;
        warningBottomSheetFragment.A00 = this;
        1Br.A0C(this.A05);
        1Br.A0C(this.A07);
        ThreadKey A0f = AbF.A0f(threadSummary);
        BNJ bnj = A0f.A0w() ? BNJ.A0F : A0f.A1F() ? BNJ.A08 : BNJ.A0J;
        long A0r = A0f.A0r();
        1Br.A0C(this.A06);
        BOM A01 = CJj.A01(threadSummary);
        BNT bnt = BNT.A0I;
        1BL.A11(0, context, A01, bnt);
        this.A00 = new CNg(A01, bnt, bnj, A0r);
    }
}
