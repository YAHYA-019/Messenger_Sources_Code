package com.facebook.messaging.customthreads.name.dialog;

import X.06Z;
import X.0D2;
import X.0FI;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BL;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1JF;
import X.1Kd;
import X.1SI;
import X.1Um;
import X.1X9;
import X.1iF;
import X.22C;
import X.2Gt;
import X.2Ov;
import X.2eQ;
import X.4YU;
import X.4uZ;
import X.5P8;
import X.5Q2;
import X.5QA;
import X.6HM;
import X.6Pl;
import X.7zN;
import X.7zO;
import X.9rQ;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbK;
import X.AbN;
import X.AnonymousClass001;
import X.ApQ;
import X.BpZ;
import X.C00i;
import X.C0By;
import X.C2121Dea;
import X.C25e;
import X.C3b6;
import X.CHy;
import X.CIT;
import X.CNB;
import X.CRA;
import X.CSF;
import X.CYa;
import X.Cza;
import X.Czk;
import X.D4q;
import X.DBg;
import X.DBh;
import X.EY0;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.facebook.ui.dialogs.NonDismissingAlertDialogFragment;

/* loaded from: ThreadNameSettingDialogFragment.class */
public class ThreadNameSettingDialogFragment extends NonDismissingAlertDialogFragment {
    public InputMethodManager A00;
    public EditText A01;
    public ThreadKey A02;
    public 6Pl A03;
    public 6HM A04;
    public String A05;
    public TextView A06;
    public C00i A07;
    public String A08;
    public final C00i A09 = AbH.A0O();

    public static void A05(06Z r301, CallerContext callerContext, ThreadSummary threadSummary) {
        threadSummary.getClass();
        if (2Gt.A0D(threadSummary) || threadSummary.A2i) {
            2Ov threadNameSettingDialogFragment = new ThreadNameSettingDialogFragment();
            Bundle A05 = 1BK.A05();
            AbF.A1J(A05, threadSummary.A0n);
            A05.putParcelable("caller_context", callerContext);
            A05.putString("current_thread_name", threadSummary.A20);
            threadNameSettingDialogFragment.setArguments(A05);
            threadNameSettingDialogFragment.A0m(r301, "threadNameDialog");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A06(FbUserSession fbUserSession, ThreadNameSettingDialogFragment threadNameSettingDialogFragment, String str) {
        MailboxFutureImpl A0P;
        MailboxCallback c3b6;
        String str2 = str;
        BpZ bpZ = (BpZ) 7zN.A0m(threadNameSettingDialogFragment, fbUserSession, 82182);
        ThreadKey threadKey = threadNameSettingDialogFragment.A02;
        String str3 = threadNameSettingDialogFragment.A08;
        DBh dBh = new DBh(fbUserSession, threadNameSettingDialogFragment, 0);
        DBg dBg = new DBg(threadNameSettingDialogFragment, 0);
        11T.A0F(threadKey, 0);
        if (!ThreadKey.A0Z(threadKey) && !ThreadKey.A0P(threadKey)) {
            1BY r0 = bpZ.A02.A00;
            9rQ r02 = (9rQ) 1Bn.A0E((Context) null, r0, 68250);
            if (str == null) {
                str2 = "";
            }
            1Kd.A0E(new ApQ(dBh, dBg, 6), r02.A00(((CHy) 1Bn.A0E((Context) null, r0, 82650)).A01(bpZ.A00, 2131967254), threadKey, str2, str3));
            return;
        }
        5Q2 r03 = (5Q2) 4YU.A0n(bpZ.A01, bpZ.A02, 68485);
        if (str == null) {
            str2 = "";
        }
        if (!ThreadKey.A0P(threadKey)) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("updateThreadName not supported for thread type: ");
            throw AnonymousClass001.A0q(AnonymousClass001.A0a(threadKey.A06, A0k));
        }
        if (1SI.A00(r03.A0A).AZk(36319978622892559L)) {
            CNB cnb = (CNB) r03.A05.get();
            5P8 A00 = CNB.A00(cnb);
            CNB.A01(cnb);
            A0P = A00.A0E(5QA.A00(threadKey), str2);
            c3b6 = Czk.A00(cnb, 70);
        } else {
            CIT cit = (CIT) r03.A07.get();
            C0By.A02(AnonymousClass001.A0K());
            22C r04 = (22C) cit.A06.get();
            long j = threadKey.A01;
            1Um A0O = 1BK.A0O(r04, 0);
            A0P = 1BK.A0P(A0O);
            int A002 = 4uZ.A00(A0P, (1X9) null);
            TraceInfo A02 = 4uZ.A02(A0P, (LoggingOption) null, "MailboxTam", "runTamClientThreadUpdateName");
            if (!A0O.Cj2(new Cza(A0P, r04, str2, A002, 4, j))) {
                A0P.cancel(false);
                4uZ.A03(A002);
                4uZ.A05((LoggingOption) null, A02, "MailboxTam", "runTamClientThreadUpdateName");
            }
            PlatformLogger.platformEventLog(5);
            c3b6 = new C3b6(cit, threadKey, "Update group name failed for ", 6);
        }
        A0P.addResultCallback(c3b6);
        dBh.invoke();
    }

    @Override // com.facebook.ui.dialogs.NonDismissingAlertDialogFragment
    public 1iF A17() {
        return AbF.A0C(442780740380519L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ui.dialogs.NonDismissingAlertDialogFragment
    public C2121Dea A1C(Bundle bundle) {
        String str;
        Bundle bundle2 = this.mArguments;
        Parcelable parcelable = bundle2 != null ? bundle2.getParcelable("thread_key") : null;
        parcelable.getClass();
        this.A02 = (ThreadKey) parcelable;
        this.A05 = bundle2.getString("current_thread_name");
        CallerContext callerContext = (CallerContext) bundle2.getParcelable("caller_context");
        String string = requireContext().getString(2131960537);
        String string2 = requireContext().getString(2131960536);
        if (callerContext != null) {
            str = callerContext.A02;
            if (str == null) {
                str = "unknown";
            }
        } else {
            str = null;
        }
        this.A08 = str;
        View inflate = LayoutInflater.from(getContext()).inflate(2132542646, (ViewGroup) null);
        this.A06 = (TextView) inflate.requireViewById(2131368014);
        this.A01 = (EditText) inflate.requireViewById(2131368013);
        if (this.A02.A0w()) {
            if (this.A07.get() != null) {
                1Kd.A0F(D4q.A00(this, 32), ((C25e) this.A07.get()).A04(), 2eQ.A01);
            } else {
                0fH.A0j("ThreadNameSettingFrag", "SecureMessageOverWAMailbox is null");
                AbN.A0v(this.A01, 25);
            }
        }
        this.A01.setText(this.A05);
        EditText editText = this.A01;
        editText.setSelection(editText.getText().length());
        this.A01.addTextChangedListener(new CYa(this, 6));
        EY0.A00(getContext(), this.A01);
        MigColorScheme A0h = AbK.A0h(this);
        this.A06.setText(string);
        AbH.A1M(this.A06, A0h);
        this.A01.setHint(string2);
        AbG.A1I(this.A01, A0h);
        AbH.A1M(this.A01, A0h);
        FbUserSession A0G = 1BL.A0G(this);
        C2121Dea c2121Dea = new C2121Dea(AbG.A04(this, 67527), A0h.Aho());
        c2121Dea.A0B("");
        c2121Dea.A0A((CharSequence) null);
        c2121Dea.A09(inflate);
        c2121Dea.A0E(new CRA(0, this, callerContext, A0G), 2131967026);
        c2121Dea.A07(new CSF(callerContext, this, 14));
        if (!1JF.A0B(this.A05)) {
            ThreadKey threadKey = this.A02;
            if (!threadKey.A0w() && !ThreadKey.A0a(threadKey)) {
                c2121Dea.A0J(new CRA(1, this, callerContext, A0G), 2131967025);
            }
        }
        return c2121Dea;
    }

    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(330338901);
        super.onActivityCreated(bundle);
        ((0D2) this).A01.getWindow().setSoftInputMode(4);
        0FI.A08(-186015921, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1374426186);
        super.onCreate(bundle);
        FbUserSession A0G = 1BL.A0G(this);
        this.A00 = (InputMethodManager) 7zO.A0m(this, 100189);
        this.A04 = (6HM) 7zO.A0m(this, 50020);
        this.A07 = AbH.A09(this, A0G, 16892);
        this.A03 = (6Pl) 1Bi.A03(50090);
        0FI.A08(-1725359089, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(721923686);
        super/*androidx.fragment.app.Fragment*/.onResume();
        ((0D2) this).A01.A00.A0F.setEnabled(!1JF.A0A(this.A01.getText()));
        0FI.A08(1860111229, A02);
    }
}
