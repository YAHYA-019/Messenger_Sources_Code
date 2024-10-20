package com.facebook.messaging.communitymessaging.chatcaptain.ui;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BM;
import X.1Bi;
import X.2qQ;
import X.6HS;
import X.7zM;
import X.7zN;
import X.7zO;
import X.7zR;
import X.7zT;
import X.7zV;
import X.8Lf;
import X.8Ll;
import X.8NJ;
import X.AbI;
import X.AbN;
import X.AdC;
import X.AnonymousClass001;
import X.C1296Ad8;
import X.C1u3;
import X.C8xf;
import X.C9L;
import X.CMk;
import X.CZD;
import X.MRk;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.nux.MigNuxBottomSheet;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: ChatCaptainInviteBottomSheetFragment.class */
public final class ChatCaptainInviteBottomSheetFragment extends MigNuxBottomSheet {
    public AdC A00;
    public CMk A01;
    public ThreadKey A02;
    public 6HS A03;
    public MigColorScheme A04;
    public String A05;
    public boolean A06;
    public C1296Ad8 A07;
    public String A08;
    public String A09;

    public static final void A05(ChatCaptainInviteBottomSheetFragment chatCaptainInviteBottomSheetFragment, String str, String str2, String str3) {
        String str4;
        C1296Ad8 c1296Ad8 = chatCaptainInviteBottomSheetFragment.A07;
        if (c1296Ad8 == null) {
            str4 = "communityMessagingLogger";
        } else {
            String str5 = chatCaptainInviteBottomSheetFragment.A08;
            if (str5 == null) {
                str4 = "communityId";
            } else {
                String str6 = chatCaptainInviteBottomSheetFragment.A09;
                if (str6 == null) {
                    str4 = "groupId";
                } else {
                    ThreadKey threadKey = chatCaptainInviteBottomSheetFragment.A02;
                    if (threadKey != null) {
                        c1296Ad8.A03(new CommunityMessagingLoggerModel(null, null, str5, str6, 1BK.A0w(threadKey), null, null, str, str3, str2, null, 1BK.A1D("entrypoint", chatCaptainInviteBottomSheetFragment.A06 ? "messenger:notification" : MRk.A00(3))));
                        return;
                    }
                    str4 = "threadKey";
                }
            }
        }
        11T.A0L(str4);
        throw 0Q8.createAndThrow();
    }

    public static final void A08(ChatCaptainInviteBottomSheetFragment chatCaptainInviteBottomSheetFragment, String str, String str2, String str3) {
        String str4;
        C1296Ad8 c1296Ad8 = chatCaptainInviteBottomSheetFragment.A07;
        if (c1296Ad8 == null) {
            str4 = "communityMessagingLogger";
        } else {
            String str5 = chatCaptainInviteBottomSheetFragment.A08;
            if (str5 == null) {
                str4 = "communityId";
            } else {
                String str6 = chatCaptainInviteBottomSheetFragment.A09;
                if (str6 == null) {
                    str4 = "groupId";
                } else {
                    ThreadKey threadKey = chatCaptainInviteBottomSheetFragment.A02;
                    if (threadKey != null) {
                        c1296Ad8.A04(new CommunityMessagingLoggerModel(null, null, str5, str6, 1BK.A0w(threadKey), null, str2, str, str3, "channel_list", null, 1BK.A1D("entrypoint", chatCaptainInviteBottomSheetFragment.A06 ? "messenger:notification" : MRk.A00(3))));
                        return;
                    }
                    str4 = "threadKey";
                }
            }
        }
        11T.A0L(str4);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.2qQ, java.lang.Object] */
    @Override // com.facebook.mig.nux.MigNuxBottomSheet
    public 8NJ A1M() {
        String str;
        A05(this, "chat_host_edu_bottom_sheet", "channel_list", "view_chat_host_invite_bottom_sheet_rendered");
        C9L c9l = (C9L) 1Bi.A03(82783);
        String str2 = this.A05;
        if (str2 == null) {
            str = "threadName";
        } else {
            String A15 = AbI.A15(this, str2, 2131958464);
            11T.A0A(A15);
            MigColorScheme migColorScheme = this.A04;
            if (migColorScheme == null) {
                str = "colorScheme";
            } else {
                ?? obj = new Object();
                7zM.A1V((2qQ) obj, 2132346606);
                C8xf c8xf = new C8xf(null, 7zT.A02((2qQ) obj, migColorScheme, 2132346607));
                String str3 = this.A09;
                if (str3 != null) {
                    boolean A00 = c9l.A00(Long.parseLong(str3));
                    8Ll A01 = 8Ll.A01(C1u3.A3Y, getString(2131954073), getString(2131954074), (String) null, 8);
                    C1u3 c1u3 = C1u3.A5q;
                    String string = getString(2131954069);
                    return new 8NJ(new 8Lf(CZD.A00(this, 53), CZD.A00(this, 54), 7zN.A0s(this, 2131952126), getString(2131955606), false), c8xf, (CharSequence) null, (CharSequence) null, A15, A00 ? 7zN.A0v(A01, 8Ll.A01(c1u3, string, getString(2131954071), (String) null, 8), 8Ll.A01(C1u3.A1Q, getString(2131954075), getString(2131954076), (String) null, 8)) : 7zN.A0v(A01, 8Ll.A01(c1u3, string, getString(2131954070), (String) null, 8), 8Ll.A01(C1u3.A1Q, getString(2131954075), getString(2131954076), (String) null, 8)), true);
                }
                str = "groupId";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.nux.MigNuxBottomSheet, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        IllegalStateException A0N;
        int i;
        String str;
        int A02 = 0FI.A02(-1976710291);
        super.onCreate(bundle);
        FbUserSession A01 = 1BM.A01(this);
        this.A04 = 7zV.A0S(this);
        Bundle requireArguments = requireArguments();
        Parcelable parcelable = requireArguments.getParcelable("threadKey");
        if (parcelable != null) {
            this.A02 = (ThreadKey) parcelable;
            String string = requireArguments.getString("threadName");
            if (string != null) {
                this.A05 = string;
                String string2 = requireArguments.getString("communityId");
                str = "";
                if (string2 == null) {
                    string2 = str;
                }
                this.A08 = string2;
                String string3 = requireArguments.getString("groupId");
                this.A09 = string3 != null ? string3 : "";
                this.A06 = requireArguments.getBoolean("from_notification");
                this.A00 = (AdC) 7zN.A0n(this, A01, 82391);
                this.A01 = AbN.A0J();
                this.A07 = 7zR.A0W();
                this.A03 = (6HS) 7zO.A0m(this, 50024);
                0FI.A08(1741123077, A02);
                return;
            }
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = -1353638329;
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = -1469127055;
        }
        0FI.A08(i, A02);
        throw A0N;
    }
}
