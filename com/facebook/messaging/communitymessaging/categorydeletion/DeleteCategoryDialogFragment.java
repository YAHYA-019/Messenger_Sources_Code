package com.facebook.messaging.communitymessaging.categorydeletion;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BM;
import X.1G1;
import X.1Um;
import X.22I;
import X.7zN;
import X.7zR;
import X.AbG;
import X.AbI;
import X.AnonymousClass001;
import X.BxS;
import X.C1296Ad8;
import X.RsW;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.dialog.ConfirmActionDialogFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.LinkedHashMap;

/* loaded from: DeleteCategoryDialogFragment.class */
public final class DeleteCategoryDialogFragment extends ConfirmActionDialogFragment {
    public long A00 = -1;
    public FbUserSession A01;
    public String A02;
    public ThreadKey A03;
    public String A04;

    private final void A05(boolean z) {
        String str;
        C1296Ad8 A0W = 7zR.A0W();
        ThreadKey threadKey = this.A03;
        if (threadKey == null) {
            str = "folderThreadKey";
        } else {
            String A0w = 1BK.A0w(threadKey);
            String str2 = this.A04;
            1G1 r0 = this.A01;
            if (r0 != null) {
                String str3 = r0.A02;
                LinkedHashMap A1C = 1BK.A1C();
                A1C.put("delete_category_confirm", 7zR.A1X(Boolean.valueOf(z)) ? ConstantsKt.CAMERA_ID_BACK : ConstantsKt.CAMERA_ID_FRONT);
                A1C.put("admin_user_id", str3);
                A1C.put("category_id", String.valueOf(this.A00));
                A0W.A04(new CommunityMessagingLoggerModel(null, null, A0w, str2, null, null, "manage_thread", "messenger", "community_admin_delete_category", null, null, A1C));
                return;
            }
            str = "fbUserSession";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public void A1C() {
        A05(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public void A1E() {
        String str;
        A05(true);
        FbUserSession fbUserSession = this.A01;
        if (fbUserSession == null) {
            str = "fbUserSession";
        } else {
            22I r0 = (22I) 7zN.A0m(this, fbUserSession, 33183);
            ThreadKey threadKey = this.A03;
            if (threadKey != null) {
                long A0r = threadKey.A0r();
                long j = this.A00;
                1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
                MailboxFutureImpl A0P = 1BK.A0P(AQV);
                1Um.A02(AQV, new RsW(r0, A0P, A0r, j), A0P, false);
                return;
            }
            str = "folderThreadKey";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public void onCreate(Bundle bundle) {
        IllegalStateException A0N;
        int i;
        int A02 = 0FI.A02(-127695772);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        ThreadKey threadKey = (ThreadKey) requireArguments.getParcelable("folder_thread_key");
        if (threadKey != null) {
            this.A03 = threadKey;
            if (threadKey.A1E()) {
                this.A00 = requireArguments.getLong("arg_category_id");
                String string = requireArguments.getString("arg_category_name");
                if (string != null) {
                    this.A02 = string;
                    this.A04 = requireArguments.getString("group_id");
                    this.A01 = 1BM.A01(this);
                    String str = this.A02;
                    if (str == null) {
                        11T.A0L("categoryName");
                        throw 0Q8.createAndThrow();
                    }
                    BxS bxS = new BxS(AbI.A15(this, str, 2131955653), getString(2131955704));
                    bxS.A03 = getString(2131955652);
                    bxS.A02 = getString(2131955696);
                    AbG.A1P(this, bxS);
                    0FI.A08(370901168, A02);
                    return;
                }
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = -616433118;
            } else {
                A0N = 1BK.A0g();
                i = 1003708723;
            }
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = -80218353;
        }
        0FI.A08(i, A02);
        throw A0N;
    }
}
