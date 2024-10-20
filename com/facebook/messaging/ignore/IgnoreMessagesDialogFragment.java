package com.facebook.messaging.ignore;

import X.06Z;
import X.0FI;
import X.11T;
import X.1BK;
import X.1BM;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.1iF;
import X.2Ov;
import X.2R2;
import X.4YU;
import X.4YV;
import X.7zM;
import X.7zN;
import X.7zO;
import X.7zQ;
import X.AbF;
import X.AbJ;
import X.AbK;
import X.AbM;
import X.AbN;
import X.AnonymousClass545;
import X.BNT;
import X.BX5;
import X.BzW;
import X.C06c;
import X.C5ic;
import X.CQX;
import X.CRF;
import X.CSG;
import X.DH2;
import X.DR6;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.CancelReason;

/* loaded from: IgnoreMessagesDialogFragment.class */
public final class IgnoreMessagesDialogFragment extends 2Ov {
    public static final BzW A0C = new Object();
    public long A00;
    public DH2 A01;
    public ThreadKey A02;
    public BNT A03;
    public MigColorScheme A04;
    public String A05;
    public boolean A07;
    public boolean A06 = true;
    public final 1Br A09 = 1Bu.A02(this, 82655);
    public final 1Br A0A = 1HG.A01(this, 99435);
    public final 1Br A0B = 7zM.A0T();
    public final 1Br A08 = 1Bu.A00(147621);

    public int A0d(C06c c06c, String str) {
        throw new UnsupportedOperationException();
    }

    public void A0m(06Z r302, String str) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        ThreadKey threadKey = this.A02;
        BNT bnt = this.A03;
        if (threadKey != null && bnt != null && !this.A07) {
            CQX A0i = AbM.A0i(this.A09);
            String str = this.A05;
            2R2 A08 = AbF.A08(1BK.A08(1Br.A02(A0i.A01), "messenger_integrity_ignore_started"), 191);
            if (4YU.A1X(A08)) {
                CQX.A07(A08, threadKey, A0i, bnt);
                A08.A0E(TraceFieldType.RequestID, str);
                if (threadKey.A1K() || ThreadKey.A0d(threadKey)) {
                    AbJ.A1M(A08, threadKey.A02);
                }
                A08.BZL();
            }
            this.A07 = true;
        }
        FbUserSession A01 = 1BM.A01(this);
        C5ic A0l = 7zQ.A0l();
        MigColorScheme migColorScheme = this.A04;
        DR6 A02 = migColorScheme == null ? A0l.A02(requireContext()) : new DR6(requireContext(), migColorScheme);
        1Br r0 = this.A08;
        1Br.A0C(r0);
        A02.A0D(new CRF(4, A01, threadKey, bnt, this), 2131957776);
        1Br.A0C(r0);
        CSG.A04(A02, this, 83, 2131957775);
        ThreadKey threadKey2 = this.A02;
        if (threadKey2 != null) {
            if (threadKey2.A1F() || threadKey2.A1I()) {
                1Br.A0C(r0);
                A02.A00(2131957772);
                1Br.A0C(r0);
                A02.A06(2131957771);
            } else {
                AnonymousClass545 anonymousClass545 = (AnonymousClass545) 7zN.A0n(this, A01, 49481);
                1Br.A0C(r0);
                A02.A00(2131957778);
                Resources A0D = 7zO.A0D(this);
                1Br.A0C(r0);
                AbK.A1E(A0D, A02, anonymousClass545.A02.A03(anonymousClass545.A02(threadKey2)), 2131957777);
            }
        }
        return A02.A04();
    }

    public int A0q(C06c c06c, String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    public 1iF A17() {
        return AbN.A0B();
    }

    public final void A1C(06Z r302, long j) {
        11T.A0F(r302, 0);
        if (r302.A0b("ignore_messages_dialog_fragment") == null) {
            this.A00 = j;
            super/*X.0D2*/.A0m(r302, "ignore_messages_dialog_fragment");
            this.A07 = false;
            this.A05 = 1BK.A0t();
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        11T.A0F(dialogInterface, 0);
        4YV.A0Z(this.A0B).flowEndCancel(this.A00, CancelReason.USER_CANCELLED);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(335867231);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle != null) {
            this.A07 = bundle.getBoolean("arg_ignore_start_logged");
            this.A05 = bundle.getString("arg_logged_request_id");
            this.A04 = (MigColorScheme) bundle.getParcelable("arg_color_scheme");
        }
        if (bundle2 != null) {
            this.A02 = (ThreadKey) bundle2.getParcelable("arg_thread_key");
            this.A03 = BX5.A00(bundle2.getInt("arg_entry_point"));
            this.A04 = (MigColorScheme) bundle2.getParcelable("arg_color_scheme");
        }
        0FI.A08(-193934011, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super/*X.0D2*/.onSaveInstanceState(bundle);
        bundle.putBoolean("arg_ignore_start_logged", this.A07);
        bundle.putString("arg_logged_request_id", this.A05);
        bundle.putParcelable("arg_color_scheme", this.A04);
    }
}
