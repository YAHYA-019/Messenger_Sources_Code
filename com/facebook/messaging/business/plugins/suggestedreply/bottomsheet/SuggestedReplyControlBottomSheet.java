package com.facebook.messaging.business.plugins.suggestedreply.bottomsheet;

import X.0DA;
import X.0FI;
import X.1BK;
import X.1Iw;
import X.1LI;
import X.1UG;
import X.AbL;
import X.B0A;
import X.BcQ;
import X.C0k4;
import X.C1816Atp;
import X.C1rs;
import X.C6W;
import X.DGf;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.business.plugins.suggestedreply.model.ReplyEntry;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import java.util.BitSet;

/* loaded from: SuggestedReplyControlBottomSheet.class */
public final class SuggestedReplyControlBottomSheet extends MigBottomSheetDialogFragment {
    public C6W A00;
    public DGf A01;
    public ReplyEntry A02;
    public FbUserSession A03;

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        C0k4.A01("mSuggestionLogger must be not null", this.A00);
        C0k4.A01("mReplyEntry must be not null", this.A02);
        C6W c6w = this.A00;
        1UG A08 = 1BK.A08(c6w.A01(), "biim_smart_suggestions_business_control_mini_menu_impression");
        if (A08.isSampled()) {
            1UG.A02(A08, "biim");
            C6W.A00(new 0DA(), A08, c6w);
        }
        C1816Atp c1816Atp = new C1816Atp(r302, new B0A());
        FbUserSession fbUserSession = this.A03;
        fbUserSession.getClass();
        B0A b0a = c1816Atp.A01;
        b0a.A00 = fbUserSession;
        BitSet bitSet = c1816Atp.A02;
        bitSet.set(0);
        b0a.A04 = A1F();
        bitSet.set(2);
        b0a.A03 = this.A02;
        bitSet.set(3);
        b0a.A01 = this.A00;
        bitSet.set(4);
        b0a.A02 = new BcQ(this);
        bitSet.set(1);
        C1rs.A04(bitSet, c1816Atp.A03);
        c1816Atp.A0J();
        return b0a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1712120050);
        super.onCreate(bundle);
        this.A03 = AbL.A09(this);
        0FI.A08(50532298, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-1300764926);
        super/*androidx.fragment.app.Fragment*/.onPause();
        A0o();
        0FI.A08(2055049234, A02);
    }
}
