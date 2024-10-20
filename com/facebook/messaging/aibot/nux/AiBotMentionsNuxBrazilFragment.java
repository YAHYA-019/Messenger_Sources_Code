package com.facebook.messaging.aibot.nux;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1Bn;
import X.1Iw;
import X.1LI;
import X.2cK;
import X.2cM;
import X.3vU;
import X.7zL;
import X.7zO;
import X.7zS;
import X.8Lf;
import X.8Ll;
import X.8NK;
import X.8Tn;
import X.9QP;
import X.AnonymousClass969;
import X.BOj;
import X.C1u3;
import X.C77c;
import X.C8nn;
import X.C8xf;
import X.C9py;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.io.Serializable;
import java.util.List;

/* loaded from: AiBotMentionsNuxBrazilFragment.class */
public final class AiBotMentionsNuxBrazilFragment extends MigBottomSheetDialogFragment {
    public 9QP A00;
    public C77c A01;
    public 3vU A02;
    public MigColorScheme A03;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        String str;
        11T.A0F(r302, 0);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        8Tn A00 = C8nn.A00(r302);
        MigColorScheme migColorScheme = this.A03;
        if (migColorScheme == null) {
            str = "colorScheme";
        } else {
            A00.A2a(migColorScheme);
            C8xf A002 = C8xf.A00(2132346588);
            List A03 = 11T.A03(new 8Ll(C1u3.A3M, (CharSequence) null, r302.A0D(2131952547), (String) null, 8));
            8Lf A02 = C9py.A02(r302.A0D(2131952562), this, 11);
            String A0D = r302.A0D(2131952552);
            C77c c77c = this.A01;
            if (c77c != null) {
                SpannableString A08 = c77c.A08(requireContext(), AnonymousClass969.A06);
                11T.A0D(A0D);
                A00.A2Z(new 8NK(A02, (1LI) null, A002, A0D, (CharSequence) null, A08, 10, 10, A03, true, false));
                return 7zL.A0V(A01, A00.A2W());
            }
            str = "aiBotNuxUtils";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1287717414);
        super.onCreate(bundle);
        this.A03 = 7zS.A0j(this);
        this.A01 = (C77c) 7zO.A0l(this, 68283);
        this.A02 = (3vU) 1Bn.A0A(68258);
        0FI.A08(874116368, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        ThreadKey threadKey;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        3vU r0 = this.A02;
        if (r0 == null) {
            11T.A0L("logger");
            throw 0Q8.createAndThrow();
        }
        Bundle bundle2 = this.mArguments;
        BOj bOj = null;
        Serializable serializable = bundle2 != null ? bundle2.getSerializable("AiBotMentionsNuxBrazilFragment.entry_point") : null;
        if (serializable instanceof BOj) {
            bOj = (BOj) serializable;
        }
        Bundle bundle3 = this.mArguments;
        ThreadKey threadKey2 = null;
        if (bundle3 != null && (threadKey = (ThreadKey) bundle3.getParcelable("AiBotMentionsNuxBrazilFragment.thread_key")) != null) {
            threadKey2 = threadKey;
        }
        r0.A0G(bOj, threadKey2);
    }
}
