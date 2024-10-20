package com.facebook.messaging.communitymessaging.adminassist.adminassistupsell;

import X.0FI;
import X.11T;
import X.1Iw;
import X.1LI;
import X.1iF;
import X.2qQ;
import X.7zL;
import X.7zN;
import X.7zR;
import X.7zV;
import X.8Lf;
import X.8Ll;
import X.8NJ;
import X.8Tn;
import X.9De;
import X.C1u3;
import X.C37s;
import X.C8xg;
import X.C9pw;
import android.os.Bundle;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: AdminAssistUpsellBottomSheet.class */
public final class AdminAssistUpsellBottomSheet extends MigBottomSheetDialogFragment {
    public String A00;
    public String A01;

    public 1iF A17() {
        return new 1iF(447151659733423L);
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(80);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        MigColorScheme A0S = 7zV.A0S(this);
        8Tn A09 = 8Tn.A09(r302, A0S);
        String A0s = 7zN.A0s(this, 2131952440);
        2qQ A0o = 7zL.A0o();
        A0o.A01 = 2132346582;
        Integer num = (Integer) 7zR.A0p(A0o, A0S, 2132346583);
        2qQ A0o2 = 7zL.A0o();
        A0o2.A01 = 2132346582;
        return 8Tn.A0A(A09, new 8NJ(new 8Lf(C9pw.A00(r302, this, 5), 7zN.A0s(this, 2131952432)), new C8xg(null, num, (Integer) 7zR.A0p(A0o2, A0S, 2132346583), null), (CharSequence) null, (CharSequence) null, A0s, 7zN.A0v(8Ll.A01(C1u3.A5s, getString(2131952437), getString(2131952438), (String) null, 8), 8Ll.A01(C1u3.A4l, getString(2131952435), getString(2131952436), (String) null, 8), 8Ll.A01(C1u3.A45, getString(2131952433), getString(2131952434), (String) null, 8)), true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1386883790);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = requireArguments.getString("group_id_extra");
        this.A00 = requireArguments.getString("community_id_extra");
        0FI.A08(699286198, A02);
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putString("group_id_extra", this.A01);
        bundle.putString("community_id_extra", this.A00);
    }
}
