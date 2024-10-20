package com.facebook.messaging.communitymessaging.chatcaptain.educationalsheet;

import X.0Q8;
import X.11T;
import X.1BK;
import X.1BM;
import X.1BV;
import X.1Iw;
import X.1LI;
import X.2cK;
import X.2cM;
import X.7zL;
import X.7zO;
import X.7zR;
import X.8Lt;
import X.AbJ;
import X.AfT;
import X.BM3;
import X.Bp0;
import X.C1296Ad8;
import X.CaD;
import X.CaE;
import X.QGG;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.data.communitymessaging.memberlist.model.CommunityMemberListSource;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: ChatCaptainEducationalSheetFragment.class */
public final class ChatCaptainEducationalSheetFragment extends MigBottomSheetDialogFragment {
    public int A00;
    public ChatCaptainEducationSheetParams A01;
    public FbUserSession A02;

    public void A0x() {
        super.A0x();
        C1296Ad8 A0W = 7zR.A0W();
        ChatCaptainEducationSheetParams chatCaptainEducationSheetParams = this.A01;
        if (chatCaptainEducationSheetParams == null) {
            11T.A0L("params");
            throw 0Q8.createAndThrow();
        }
        A0W.A03(new CommunityMessagingLoggerModel(null, null, String.valueOf(chatCaptainEducationSheetParams.A01), String.valueOf(chatCaptainEducationSheetParams.A00), 1BK.A0w(chatCaptainEducationSheetParams.A02), null, "chat_host_bottom_sheet_badge", "thread_view", "render_chat_host_bottom_sheet_badge", "thread_view", null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A11() {
        super.A11();
        this.A02 = 1BM.A01(this);
        int i = Build.VERSION.SDK_INT;
        Bundle requireArguments = requireArguments();
        ChatCaptainEducationSheetParams chatCaptainEducationSheetParams = (ChatCaptainEducationSheetParams) (i >= 33 ? requireArguments.getParcelable("arg_params", ChatCaptainEducationSheetParams.class) : requireArguments.getParcelable("arg_params"));
        if (chatCaptainEducationSheetParams == null) {
            throw 1BK.A0h();
        }
        this.A01 = chatCaptainEducationSheetParams;
        Bp0 bp0 = (Bp0) 7zO.A0l(this, 83061);
        ChatCaptainEducationSheetParams chatCaptainEducationSheetParams2 = this.A01;
        String str = "params";
        if (chatCaptainEducationSheetParams2 != null) {
            long j = chatCaptainEducationSheetParams2.A00;
            ThreadKey threadKey = chatCaptainEducationSheetParams2.A02;
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            FbUserSession fbUserSession = this.A02;
            if (fbUserSession != null) {
                11T.A0F(threadKey, 1);
                AfT A0K = AbJ.A0J(bp0.A01).A0K(fbUserSession, j);
                11T.A0D(A0K);
                A0K.A03(new 8Lt(threadKey, 11T.A03(BM3.A04), 4), (Integer) null, (Long) null, CommunityMemberListSource.A0M.value, false);
                MutableLiveData A0H = 7zL.A0H();
                CaD.A00(viewLifecycleOwner, A0K, A0H, bp0, 14);
                A0K.A02();
                CaE.A03(getViewLifecycleOwner(), A0H, this, 25);
                return;
            }
            str = "fbUserSession";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        1BV A0R = 7zL.A0R(7zL.A0A(r302), 16979);
        2cM A00 = 2cK.A00(r302);
        MigColorScheme migColorScheme = (MigColorScheme) A0R.get();
        ChatCaptainEducationSheetParams chatCaptainEducationSheetParams = this.A01;
        if (chatCaptainEducationSheetParams != null) {
            return 7zL.A0V(A00, new QGG(chatCaptainEducationSheetParams, migColorScheme, this.A00));
        }
        11T.A0L("params");
        throw 0Q8.createAndThrow();
    }
}
