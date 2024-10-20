package com.facebook.messaging.threadlist.threaditemmenu.plugins.core.markreadmenuitem;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BM;
import X.5I5;
import X.7zN;
import X.AbG;
import X.AnonymousClass545;
import X.BxS;
import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.dialog.ConfirmActionDialogFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ConfirmReadDialog.class */
public final class ConfirmReadDialog extends ConfirmActionDialogFragment {
    public ThreadSummary A00;
    public 5I5 A01;
    public FbUserSession A02;
    public AnonymousClass545 A03;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public void onCreate(Bundle bundle) {
        String A03;
        int A02 = 0FI.A02(-244242182);
        super.onCreate(bundle);
        FbUserSession A01 = 1BM.A01(this);
        this.A02 = A01;
        String str = "fbUserSession";
        Object obj = null;
        if (A01 != null) {
            this.A01 = (5I5) 7zN.A0m(this, A01, 49665);
            FbUserSession fbUserSession = this.A02;
            if (fbUserSession != null) {
                this.A03 = (AnonymousClass545) 7zN.A0m(this, fbUserSession, 49481);
                Bundle bundle2 = this.mArguments;
                if (bundle2 != null) {
                    obj = bundle2.getParcelable("thread_summary");
                }
                ThreadSummary threadSummary = (ThreadSummary) obj;
                if (threadSummary == null) {
                    IllegalStateException A0h = 1BK.A0h();
                    0FI.A08(579583982, A02);
                    throw A0h;
                }
                this.A00 = threadSummary;
                BxS bxS = new BxS(requireContext().getString(2131966910), requireContext().getString(2131966910));
                Context requireContext = requireContext();
                AnonymousClass545 anonymousClass545 = this.A03;
                if (anonymousClass545 == null) {
                    str = "threadRecipientUtil";
                } else {
                    ThreadSummary threadSummary2 = this.A00;
                    if (threadSummary2 != null) {
                        ThreadKey threadKey = threadSummary2.A0n;
                        if (threadKey == null) {
                            A03 = null;
                        } else {
                            A03 = anonymousClass545.A02.A03(anonymousClass545.A02(threadKey));
                        }
                        bxS.A03 = 1BK.A0v(requireContext, A03, 2131966911);
                        AbG.A1P(this, bxS);
                        0FI.A08(-1120801839, A02);
                        return;
                    }
                    str = "threadSummary";
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
