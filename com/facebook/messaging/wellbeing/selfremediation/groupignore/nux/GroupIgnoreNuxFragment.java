package com.facebook.messaging.wellbeing.selfremediation.groupignore.nux;

import X.0FI;
import X.0Gm;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BM;
import X.1Bu;
import X.2fZ;
import X.7zN;
import X.8Lf;
import X.8NJ;
import X.BCz;
import X.Bc5;
import X.CNB;
import X.CZF;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.nux.MigNuxBottomSheet;
import java.util.List;

/* loaded from: GroupIgnoreNuxFragment.class */
public final class GroupIgnoreNuxFragment extends MigNuxBottomSheet {
    public Bc5 A00;
    public ThreadSummary A01;
    public CNB A02;
    public 2fZ A03;

    public static final void A05(Bundle bundle, GroupIgnoreNuxFragment groupIgnoreNuxFragment) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("param");
            Parcelable.Creator creator = ThreadSummary.CREATOR;
            11T.A0B(creator);
            ThreadSummary threadSummary = (ThreadSummary) 0Gm.A01(creator, parcelable, ThreadSummary.class);
            if (threadSummary != null) {
                groupIgnoreNuxFragment.A01 = threadSummary;
                return;
            }
        }
        throw 1BK.A0h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.nux.MigNuxBottomSheet
    public 8NJ A1M() {
        String string = getString(2131957422);
        String string2 = getString(2131957421);
        2fZ r0 = this.A03;
        if (r0 == null) {
            11T.A0L("messengerThreadTileViewDataFactory");
            throw 0Q8.createAndThrow();
        }
        ThreadSummary threadSummary = this.A01;
        if (threadSummary == null) {
            throw 1BK.A0h();
        }
        BCz bCz = new BCz(r0.A0E(threadSummary, 0, false, false));
        String A0s = 7zN.A0s(this, 2131957419);
        8Lf r02 = new 8Lf(CZF.A00(this, 78), CZF.A00(this, 79), A0s, getString(2131957420));
        11T.A0D(string);
        return new 8NJ(r02, bCz, string2, (CharSequence) null, string, (List) null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.nux.MigNuxBottomSheet, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(2094220172);
        super.onCreate(bundle);
        A05(this.mArguments, this);
        Context context = getContext();
        Bc5 bc5 = this.A00;
        if (bc5 == null) {
            bc5 = context != null ? (Bc5) 1Bu.A00(82634).get() : null;
        }
        this.A00 = bc5;
        FbUserSession A01 = 1BM.A01(this);
        this.A03 = (2fZ) 7zN.A0n(this, A01, 17067);
        this.A02 = (CNB) 7zN.A0n(this, A01, 82640);
        0FI.A08(-2057971380, A02);
    }
}
