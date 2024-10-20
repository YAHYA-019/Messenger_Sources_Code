package com.facebook.messaging.communitymessaging.adminactions.removememberoptions;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BM;
import X.1Iw;
import X.1LI;
import X.1lN;
import X.6EX;
import X.7zP;
import X.7zV;
import X.AbN;
import X.AnonymousClass001;
import X.BSX;
import X.Bch;
import X.CMk;
import X.CxE;
import X.QBq;
import X.QKy;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import java.util.BitSet;

/* loaded from: RemoveMemberOptionsBottomSheetFragment.class */
public final class RemoveMemberOptionsBottomSheetFragment extends MigBottomSheetDialogFragment implements 1lN {
    public static final BSX A08 = new Object();
    public long A00;
    public long A01;
    public long A02;
    public FbUserSession A03;
    public CMk A04;
    public MigColorScheme A05;
    public User A06;
    public ParcelableSecondaryData A07;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        String str;
        11T.A0F(r302, 0);
        11T.A0A(r302.A0D);
        this.A04 = AbN.A0J();
        this.A05 = 7zV.A0S(this);
        QBq qBq = new QBq(7zP.A0T(this), new QKy());
        boolean A04 = 6EX.A00.A04(this.A01);
        1LI r0 = qBq.A01;
        ((QKy) r0).A07 = A04;
        BitSet bitSet = qBq.A02;
        bitSet.set(3);
        MigColorScheme migColorScheme = this.A05;
        if (migColorScheme == null) {
            str = "colorScheme";
        } else {
            ((QKy) r0).A01 = migColorScheme;
            bitSet.set(0);
            ((QKy) r0).A02 = CxE.A00(this, 15);
            bitSet.set(7);
            User user = this.A06;
            if (user != null) {
                ((QKy) r0).A03 = user;
                bitSet.set(8);
                ((QKy) r0).A00 = new Bch(this);
                bitSet.set(4);
                long j = this.A02;
                ((QKy) r0).A08 = AnonymousClass001.A1N((j > 0L ? 1 : (j == 0L ? 0 : -1)));
                bitSet.set(5);
                ((QKy) r0).A05 = String.valueOf(this.A01);
                bitSet.set(2);
                ((QKy) r0).A04 = String.valueOf(this.A00);
                bitSet.set(1);
                ((QKy) r0).A06 = String.valueOf(j);
                bitSet.set(6);
                7zP.A18(qBq, bitSet, qBq.A03);
                return r0;
            }
            str = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public String AWg() {
        return "community_remove_member";
    }

    public Long Am7() {
        return 447151659733423L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1350473282);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Parcelable parcelable = requireArguments.getParcelable("arg_user");
        if (parcelable == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(-865483388, A02);
            throw A0h;
        }
        this.A06 = (User) parcelable;
        this.A00 = requireArguments.getLong("arg_community_id");
        this.A01 = requireArguments.getLong("arg_group_id");
        this.A02 = requireArguments.getLong("arg_thread_id");
        this.A07 = (ParcelableSecondaryData) requireArguments.getParcelable("arg_extra_data");
        this.A03 = 1BM.A01(this);
        0FI.A08(-805182381, A02);
    }
}
