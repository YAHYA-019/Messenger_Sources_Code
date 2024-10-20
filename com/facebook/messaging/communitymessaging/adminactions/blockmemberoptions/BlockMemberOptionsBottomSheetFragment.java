package com.facebook.messaging.communitymessaging.adminactions.blockmemberoptions;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BM;
import X.1Iw;
import X.1LI;
import X.1iF;
import X.1lN;
import X.6EX;
import X.7zL;
import X.7zP;
import X.7zV;
import X.AbF;
import X.AbI;
import X.AbN;
import X.AnonymousClass001;
import X.BSV;
import X.Bcf;
import X.CMk;
import X.QBo;
import X.QKx;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import java.util.BitSet;

/* loaded from: BlockMemberOptionsBottomSheetFragment.class */
public final class BlockMemberOptionsBottomSheetFragment extends MigBottomSheetDialogFragment implements 1lN {
    public static final BSV A08 = new Object();
    public long A00;
    public long A01;
    public FbUserSession A02;
    public CMk A03;
    public MigColorScheme A04;
    public User A05;
    public ParcelableSecondaryData A06;
    public Long A07;

    public 1iF A17() {
        return AbF.A0C(447151659733423L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        String str;
        11T.A0F(r302, 0);
        Context A0A = 7zL.A0A(r302);
        this.A03 = AbN.A0J();
        this.A04 = 7zV.A0S(this);
        QBo qBo = new QBo(7zL.A0W(A0A), new QKx());
        boolean A04 = 6EX.A00.A04(this.A00);
        1LI r0 = qBo.A01;
        ((QKx) r0).A06 = A04;
        BitSet bitSet = qBo.A02;
        bitSet.set(4);
        MigColorScheme migColorScheme = this.A04;
        if (migColorScheme == null) {
            str = "colorScheme";
        } else {
            ((QKx) r0).A01 = migColorScheme;
            bitSet.set(1);
            bitSet.set(7);
            User user = this.A05;
            if (user != null) {
                ((QKx) r0).A02 = user;
                bitSet.set(8);
                ((QKx) r0).A00 = new Bcf(this);
                bitSet.set(0);
                ((QKx) r0).A07 = AnonymousClass001.A1N((this.A01 > 0L ? 1 : (this.A01 == 0L ? 0 : -1)));
                bitSet.set(5);
                qBo.A2N(true);
                ((QKx) r0).A04 = String.valueOf(this.A00);
                bitSet.set(3);
                ((QKx) r0).A03 = String.valueOf(this.A07);
                bitSet.set(2);
                ((QKx) r0).A05 = String.valueOf(this.A01);
                bitSet.set(6);
                7zP.A18(qBo, bitSet, qBo.A03);
                return r0;
            }
            str = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public String AWg() {
        return "community_block_member";
    }

    public Long Am7() {
        return 447151659733423L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-872256882);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Parcelable parcelable = requireArguments.getParcelable(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        if (parcelable == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(-1070596015, A02);
            throw A0h;
        }
        this.A05 = (User) parcelable;
        this.A07 = AbI.A10(requireArguments, "communityId");
        this.A00 = requireArguments.getLong("groupId");
        this.A01 = requireArguments.getLong("threadId");
        this.A06 = (ParcelableSecondaryData) requireArguments.getParcelable("extraData");
        this.A02 = 1BM.A01(this);
        0FI.A08(1440892853, A02);
    }
}
