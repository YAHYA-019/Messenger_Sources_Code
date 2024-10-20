package com.facebook.messaging.communitymessaging.adminactions.banmemberfromchat;

import X.0Q8;
import X.11T;
import X.1BK;
import X.1Iw;
import X.1LI;
import X.2cK;
import X.2cM;
import X.4YU;
import X.7zL;
import X.8Ti;
import X.8oM;
import X.AbH;
import X.AbK;
import X.C01g;
import X.C01i;
import X.C1790AsO;
import X.C5xl;
import X.CaD;
import X.Cx1;
import X.DCY;
import X.QFk;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.parcel.OpaqueParcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;

/* loaded from: BanMemberFromChatBottomSheet.class */
public final class BanMemberFromChatBottomSheet extends MigBottomSheetDialogFragment {
    public FbUserSession A00;
    public ThreadKey A01;
    public ThreadSummary A02;
    public User A03;
    public final C01i A04 = C01g.A01(DCY.A00);

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        String str;
        11T.A0F(r302, 0);
        C5xl A0V = AbK.A0V();
        ThreadKey threadKey = this.A01;
        if (threadKey == null) {
            str = "threadKey";
        } else {
            LiveData A08 = AbH.A08(A0V, threadKey);
            A08.observeForever(new CaD(A08, this, 1));
            2cM A00 = 2cK.A00(r302);
            MigColorScheme A1F = A1F();
            User user = this.A03;
            str = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
            if (user != null) {
                UserKey A0X = 1BK.A0X(user.A13);
                Context context = r302.A0D;
                Resources resources = context.getResources();
                A00.A2e(new QFk(new C1790AsO(A0X, AbK.A14(resources, 7zL.A13(user), 2131953187), 4YU.A0t(resources, 2131953186)), A1F));
                8Ti A01 = 8oM.A01(r302);
                A01.A2a(context.getResources().getString(2131953185));
                A01.A2Z(A1F());
                A01.A2Y(Cx1.A01(this, 1));
                return 7zL.A0V(A00, A01.A2W());
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f4, code lost:
    
        if (r305 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.communitymessaging.adminactions.banmemberfromchat.BanMemberFromChatBottomSheet.onCreate(android.os.Bundle):void");
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        User user = this.A03;
        String str = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        if (user != null) {
            bundle.putParcelable(str, new OpaqueParcelable(user));
            ThreadKey threadKey = this.A01;
            str = "threadKey";
            if (threadKey != null) {
                bundle.putParcelable(str, threadKey);
                return;
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
