package com.facebook.messaging.deletemessage.ui;

import X.0FI;
import X.0Gm;
import X.1BL;
import X.1Bi;
import X.4YT;
import X.7zN;
import X.AbG;
import X.AbI;
import X.AbM;
import X.AnonymousClass001;
import X.BKl;
import X.BSa;
import X.BxS;
import X.C1284Aco;
import X.C1296Ad8;
import X.C5xl;
import X.C6ht;
import X.C6hu;
import X.CaE;
import X.CfG;
import X.EnumC3499Mfu;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.model.Community;
import com.facebook.messaging.dialog.ConfirmActionDialogFragment;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.quicklog.reliability.CancelReason;
import java.util.Map;

/* loaded from: UnsendMessageDialogFragment.class */
public class UnsendMessageDialogFragment extends ConfirmActionDialogFragment {
    public FbUserSession A00;
    public Community A01;
    public C6hu A02;
    public Message A03;
    public ThreadSummary A04;
    public boolean A05;
    public long A06;

    /* JADX WARN: Multi-variable type inference failed */
    public static void A05(UnsendMessageDialogFragment unsendMessageDialogFragment, Boolean bool) {
        Message message;
        Map map;
        if (unsendMessageDialogFragment.A01 == null || (message = unsendMessageDialogFragment.A03) == null || !ThreadKey.A0a(message.A0V) || unsendMessageDialogFragment.getContext() == null) {
            return;
        }
        C1296Ad8 A0V = AbI.A0V();
        EnumC3499Mfu enumC3499Mfu = null;
        if (unsendMessageDialogFragment.A04 != null) {
            FbUserSession fbUserSession = unsendMessageDialogFragment.A00;
            fbUserSession.getClass();
            map = BSa.A00(unsendMessageDialogFragment.getContext(), fbUserSession, unsendMessageDialogFragment.A04);
        } else {
            map = null;
        }
        String l = Long.toString(unsendMessageDialogFragment.A06);
        Community community = unsendMessageDialogFragment.A01;
        String str = community.A0T;
        String str2 = community.A0U;
        Message message2 = unsendMessageDialogFragment.A03;
        ParticipantInfo participantInfo = message2.A0K;
        String A00 = participantInfo != null ? participantInfo.A00() : null;
        String str3 = bool.booleanValue() ? "unsend_message_cancelled" : "unsend_message_confirmed";
        if (message2.A24) {
            enumC3499Mfu = EnumC3499Mfu.A01;
        }
        A0V.A04(new CommunityMessagingLoggerModel(null, enumC3499Mfu, l, str, str2, A00, null, null, str3, "thread_view", message2.A1V, map));
    }

    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public void A1C() {
        A05(this, AnonymousClass001.A0K());
        C6hu c6hu = this.A02;
        if (c6hu != null) {
            C6ht c6ht = c6hu.A00;
            AbG.A0r(c6ht.A0D).flowEndCancel(c6ht.A01, CancelReason.USER_CANCELLED);
        }
        A0o();
    }

    public void onCancel(DialogInterface dialogInterface) {
        C6hu c6hu = this.A02;
        if (c6hu != null) {
            C6ht c6ht = c6hu.A00;
            AbG.A0r(c6ht.A0D).flowEndCancel(c6ht.A01, CancelReason.USER_CANCELLED);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public void onCreate(Bundle bundle) {
        ThreadKey threadKey;
        int A02 = 0FI.A02(-1933224958);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        bundle2.getClass();
        this.A03 = (Message) 0Gm.A01(Message.CREATOR, bundle2.getParcelable("message"), Message.class);
        this.A06 = bundle2.getLong("parent_thread_key");
        this.A05 = bundle2.getBoolean(4YT.A00(1178));
        Resources A07 = AbM.A07(this);
        BxS bxS = new BxS(A07.getString(2131967655), A07.getString(2131964336));
        bxS.A03 = A07.getString(2131967653);
        bxS.A01 = BKl.A01;
        AbG.A1P(this, bxS);
        if (ThreadKey.A0a(this.A03.A0V)) {
            FbUserSession A0G = 1BL.A0G(this);
            this.A00 = A0G;
            ((C1284Aco) 7zN.A0m(this, A0G, 82370)).A00(this.A06).observe(this, new CaE(this, 84));
        }
        Message message = this.A03;
        if (message != null && (threadKey = message.A0V) != null && ThreadKey.A0a(threadKey)) {
            ((C5xl) 1Bi.A03(67528)).ASY(this.A03.A0V).observe(this, new CaE(this, 83));
        }
        0FI.A08(-177416112, A02);
    }

    public void onStop() {
        C6ht c6ht;
        CfG cfG;
        int A02 = 0FI.A02(-1555665254);
        C6hu c6hu = this.A02;
        if (c6hu != null && (cfG = (c6ht = c6hu.A00).A03) != null) {
            cfG.D2v();
            c6ht.A03 = null;
        }
        super/*X.0D2*/.onStop();
        0FI.A08(393390955, A02);
    }
}
