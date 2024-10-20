package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.communitymessaging.adminactions.blockmemberoptions.BlockMemberOptionsBottomSheetFragment;
import com.facebook.messaging.communitymessaging.adminactions.mutememberoptions.MuteMemberOptionsFragment;
import com.facebook.messaging.communitymessaging.adminactions.removememberoptions.RemoveMemberOptionsBottomSheetFragment;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.user.model.User;

/* loaded from: Cjx.class */
public final class Cjx implements 7Yx {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ 0CL A03;

    public Cjx(0CL r302, int i, long j, long j2) {
        this.A00 = i;
        this.A03 = r302;
        this.A01 = j;
        this.A02 = j2;
    }

    public final void CHY(User user) {
        int i;
        06Z r313;
        0D2 baseMigBottomSheetDialogFragment;
        String str;
        if (user != null) {
            int i2 = this.A00;
            0CL r0 = this.A03;
            long j = this.A01;
            long j2 = this.A02;
            for (Integer num : 0S2.A00(3)) {
                switch (num.intValue()) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i == i2) {
                    int intValue = num.intValue();
                    if (intValue == 0) {
                        BSV bsv = BlockMemberOptionsBottomSheetFragment.A08;
                        06Z r02 = (06Z) r0.element;
                        11T.A0F(r02, 0);
                        Bundle A05 = 1BK.A05();
                        A05.putParcelable(PublicKeyCredentialControllerUtility.JSON_KEY_USER, user);
                        A05.putLong("communityId", 0L);
                        A05.putLong("groupId", j);
                        A05.putLong("threadId", j2);
                        A05.putParcelable("extraData", null);
                        2Ov baseMigBottomSheetDialogFragment2 = new BaseMigBottomSheetDialogFragment();
                        baseMigBottomSheetDialogFragment2.setArguments(A05);
                        baseMigBottomSheetDialogFragment2.A0m(r02, "BlockMemberOptionsFragment");
                        return;
                    }
                    if (intValue == 1) {
                        BSX bsx = RemoveMemberOptionsBottomSheetFragment.A08;
                        r313 = (06Z) r0.element;
                        11T.A0F(r313, 0);
                        Bundle A052 = 1BK.A05();
                        A052.putParcelable("arg_user", user);
                        A052.putLong("arg_community_id", 0L);
                        A052.putLong("arg_group_id", j);
                        A052.putLong("arg_thread_id", j2);
                        A052.putParcelable("arg_extra_data", null);
                        baseMigBottomSheetDialogFragment = new BaseMigBottomSheetDialogFragment();
                        baseMigBottomSheetDialogFragment.setArguments(A052);
                        str = "RemoveMemberOptionsFragment";
                    } else {
                        if (intValue != 2) {
                            return;
                        }
                        r313 = (06Z) r0.element;
                        Long valueOf = Long.valueOf(j2);
                        11T.A0F(r313, 0);
                        Bundle A053 = 1BK.A05();
                        A053.putParcelable(PublicKeyCredentialControllerUtility.JSON_KEY_USER, user);
                        A053.putLong("community_id", 0L);
                        A053.putLong("group_id", j);
                        A053.putSerializable("thread_id", valueOf);
                        A053.putParcelable("extra_data", null);
                        baseMigBottomSheetDialogFragment = new MuteMemberOptionsFragment();
                        baseMigBottomSheetDialogFragment.setArguments(A053);
                        str = "MuteMemberOptionsFragment";
                    }
                    baseMigBottomSheetDialogFragment.A0i(r313, str);
                    return;
                }
            }
            throw 0Pz.A04("Invalid value ", i2);
        }
    }
}
