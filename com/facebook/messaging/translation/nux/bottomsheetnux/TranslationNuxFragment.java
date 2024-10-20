package com.facebook.messaging.translation.nux.bottomsheetnux;

import X.0FI;
import X.11T;
import X.1BY;
import X.1Bn;
import X.1Iw;
import X.1LI;
import X.2qQ;
import X.2qR;
import X.7zL;
import X.7zM;
import X.7zQ;
import X.7zT;
import X.8Lf;
import X.8NJ;
import X.8Tn;
import X.9De;
import X.9Sj;
import X.9pX;
import X.9zD;
import X.C37s;
import X.C8xg;
import X.C9pc;
import X.DGJ;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import java.util.List;

/* loaded from: TranslationNuxFragment.class */
public final class TranslationNuxFragment extends MigBottomSheetDialogFragment {
    public FbUserSession A00;
    public ThreadKey A01;
    public 9Sj A02;
    public final 2qR A03;

    public TranslationNuxFragment() {
        2qQ A0o = 7zL.A0o();
        7zM.A1V(A0o, 2132347248);
        this.A03 = 7zQ.A0k(A0o, 2132347249);
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(80);
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public DGJ A1E(1Iw r302) {
        return new 9zD(this);
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        8Tn A07 = 8Tn.A07(r302, this);
        Object A0E = 1Bn.A0E(7zL.A0A(r302), (1BY) null, 67929);
        ThreadKey threadKey = this.A01;
        boolean z = true;
        if (threadKey == null || !threadKey.A0z()) {
            z = false;
        }
        C8xg c8xg = new C8xg(null, (Integer) A1F().Ci4(this.A03), null, null);
        String str = null;
        C9pc c9pc = z ? new C9pc(5, r302, this, A0E, threadKey) : null;
        String A0D = r302.A0D(2131967418);
        9pX r0 = new 9pX(5, threadKey, this, A0E);
        if (z) {
            str = r302.A0D(2131967419);
        }
        8Lf r02 = new 8Lf(r0, c9pc, A0D, str);
        String A0D2 = r302.A0D(2131967421);
        String A0D3 = r302.A0D(2131967420);
        11T.A0D(A0D2);
        return 8Tn.A0A(A07, new 8NJ(r02, c8xg, A0D3, (CharSequence) null, A0D2, (List) null, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1955251789);
        super.onCreate(bundle);
        this.A00 = 7zT.A08(this);
        0FI.A08(-906440724, A02);
    }
}
