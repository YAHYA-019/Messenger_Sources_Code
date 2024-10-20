package com.facebook.messaging.groups.threadactions;

import X.0FI;
import X.1BL;
import X.1BV;
import X.1HH;
import X.1Lo;
import X.1iF;
import X.4YV;
import X.6HY;
import X.6KV;
import X.7zR;
import X.82O;
import X.AbF;
import X.AbH;
import X.AbJ;
import X.AbM;
import X.B3r;
import X.BM6;
import X.C00i;
import X.C2121Dea;
import X.CSF;
import X.CSG;
import X.DC5;
import X.DI4;
import X.JgM;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.ui.dialogs.NonDismissingAlertDialogFragment;
import com.facebook.user.model.UserKey;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import java.util.HashSet;

/* loaded from: AdminActionDialogFragment.class */
public class AdminActionDialogFragment extends NonDismissingAlertDialogFragment {
    public long A00;
    public FbUserSession A01;
    public C00i A02;
    public DI4 A03;
    public ThreadKey A04;
    public ThreadSummary A05;
    public 6HY A06;
    public UserKey A07;
    public String A08;
    public 6KV A09;
    public JgM A0A;
    public String A0B;
    public final HashSet A0H = new DC5(this);
    public final C00i A0C = AbF.A0S(this, 82550);
    public final C00i A0D = new 1HH(this, 50020);
    public final C00i A0G = 1BV.A00(HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH);
    public final C00i A0I = AbF.A0S(this, 82648);
    public final C00i A0J = 1BV.A00(65571);
    public final C00i A0E = 1BV.A00(82580);
    public final C00i A0F = AbH.A0O();

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.Fragment, com.facebook.messaging.groups.threadactions.AdminActionDialogFragment] */
    public static AdminActionDialogFragment A05(BM6 bm6, ThreadKey threadKey, ThreadSummary threadSummary, UserKey userKey, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z) {
        ?? adminActionDialogFragment = new AdminActionDialogFragment();
        Bundle A0E = 7zR.A0E(threadKey);
        A0E.putParcelable("thread_summary", threadSummary);
        A0E.putParcelable("user_key", userKey);
        A0E.putString("title_text", str7);
        A0E.putString("body_text", str);
        A0E.putString("confirm_button_text", str3);
        A0E.putString("loading_text", str4);
        A0E.putString("operation_type", str6);
        A0E.putString("middle_option_button_text", str5);
        A0E.putSerializable("middle_option_type", bm6);
        A0E.putBoolean("show_cancel_button", z);
        A0E.putString("cancel_button_text", str2);
        A0E.putLong("msys_participant_pk", j);
        adminActionDialogFragment.setArguments(A0E);
        return adminActionDialogFragment;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0167, code lost:
    
        if (r0.equals("remove_member") == false) goto L8;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x02c9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x002c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A06(com.facebook.messaging.groups.threadactions.AdminActionDialogFragment r301) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.groups.threadactions.AdminActionDialogFragment.A06(com.facebook.messaging.groups.threadactions.AdminActionDialogFragment):void");
    }

    @Override // com.facebook.ui.dialogs.NonDismissingAlertDialogFragment
    public 1iF A17() {
        return AbF.A0C(303646520704038L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ui.dialogs.NonDismissingAlertDialogFragment
    public C2121Dea A1C(Bundle bundle) {
        Bundle bundle2 = this.mArguments;
        this.A04 = AbH.A0k(bundle2);
        this.A05 = AbF.A0h(bundle2, "thread_summary");
        this.A07 = (UserKey) bundle2.getParcelable("user_key");
        String string = bundle2.getString("title_text");
        String string2 = bundle2.getString("body_text");
        String string3 = bundle2.getString("confirm_button_text");
        String string4 = bundle2.getString("middle_option_button_text");
        String string5 = bundle2.getString("cancel_button_text");
        BM6 serializable = bundle2.getSerializable("middle_option_type");
        this.A08 = bundle2.getString("operation_type");
        this.A0B = bundle2.getString("loading_text");
        boolean z = bundle2.getBoolean("show_cancel_button", true);
        this.A00 = bundle2.getLong("msys_participant_pk");
        this.A04.getClass();
        this.A07.getClass();
        AbM.A1T(string);
        AbM.A1T(string2);
        AbM.A1T(string3);
        AbM.A1T(this.A08);
        AbM.A1T(this.A0B);
        C2121Dea A03 = AbJ.A0c().A03(getContext());
        A03.A0B(string);
        A03.A0A(string2);
        A03.A0F(new CSF(serializable, this, 16), string4);
        BM6 bm6 = BM6.A03;
        int i = 80;
        if (serializable == bm6) {
            i = 79;
        }
        A03.A0H(CSG.A00(this, i), string3);
        if (z) {
            int i2 = serializable == bm6 ? 80 : 79;
            if (string5 != null) {
                A03.A0G(CSG.A00(this, i2), string5);
                return A03;
            }
            A03.A0J(CSG.A00(this, i2), 2131955696);
        }
        return A03;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1926995773);
        super.onCreate(bundle);
        FbUserSession A0G = 1BL.A0G(this);
        this.A01 = A0G;
        this.A02 = 1Lo.A02(A0G, this, 82647);
        6KV A00 = ((82O) this.A0J.get()).A00(getContext());
        this.A09 = A00;
        A00.A02();
        0FI.A08(-348169792, A02);
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-754868681);
        super.onDestroyView();
        6KV r0 = this.A09;
        if (r0 != null) {
            r0.A05(-1);
        }
        if (this.A04.A0w()) {
            B3r b3r = (B3r) this.A0E.get();
            b3r.A04(4YV.A0Z(b3r.A00), CancelReason.USER_CANCELLED);
        }
        0FI.A08(1664554141, A02);
    }
}
