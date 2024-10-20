package com.facebook.messaging.wellbeing.enforcementfairness.bottomsheet.cei.bankhit.warning;

import X.0CU;
import X.0D2;
import X.0Dc;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1CO;
import X.1EK;
import X.1GD;
import X.1Iw;
import X.2Ov;
import X.2W2;
import X.7zL;
import X.7zN;
import X.7zP;
import X.7zQ;
import X.7zS;
import X.7zU;
import X.8Zo;
import X.9Ty;
import X.9pT;
import X.AVE;
import X.AnonymousClass018;
import X.C00i;
import X.C1pq;
import X.C1u3;
import X.C5nv;
import X.C9he;
import X.C9l9;
import X.CFx;
import X.CJ2;
import X.EAX;
import X.EC2;
import X.FeI;
import X.RSy;
import X.RTL;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.fury.context.ReqContext;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;

/* loaded from: CEIBankHitThreadWarningBottomSheetFragment.class */
public final class CEIBankHitThreadWarningBottomSheetFragment extends 2Ov {
    public ThreadSummary A00;
    public C9l9 A01;
    public CJ2 A02;
    public int A03 = 8;
    public final 1Br A09 = 1Bu.A00(147770);
    public final 1Br A0A = 1Bq.A00(68777);
    public final 1Br A06 = 1Bu.A00(68200);
    public final 1Br A04 = 1Bu.A02(this, 68766);
    public final 1Br A05 = 7zN.A0I(this);
    public final 1Br A08 = 1Bq.A00(49965);
    public final 1Br A07 = 1Bu.A02(this, 82535);

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        9Ty r0 = (9Ty) 1Br.A0B(this.A04);
        AVE ave = new AVE(this, 8);
        ImmutableList.of();
        String string = FbInjector.A03.getString(2131953888);
        C1pq.A08("description", string);
        C1u3 c1u3 = C1u3.A3r;
        String string2 = FbInjector.A03.getString(2131953889);
        C1pq.A08("title", string2);
        RSy rSy = new RSy(c1u3, string, string2);
        CharSequence A0u = 1BK.A0u(FbInjector.A03, 2131953885);
        C00i c00i = r0.A00.A00;
        1CO A00 = 2W2.A00((2W2) c00i.get());
        1GD r02 = 1GD.A07;
        String BDB = A00.BDB(r02, 36878603543446384L);
        if (BDB != null && !0CU.A0O(BDB)) {
            EC2 A01 = ((CFx) 1Br.A0B(r0.A01)).A01(7zL.A09(), new 9pT(BDB, ave, 3), r0.A02);
            0Dc A0F = 7zS.A0F(FbInjector.A03, A0u);
            A0F.A02(" ");
            A0F.A04(A01, 18);
            A0u = 7zS.A0A(A0F, FbInjector.A03.getString(2131953886));
        }
        C1u3 c1u32 = C1u3.A4K;
        String string3 = FbInjector.A03.getString(2131953887);
        C1pq.A08("title", string3);
        ImmutableList of = ImmutableList.of((Object) rSy, (Object) new RSy(c1u32, A0u, string3));
        C1pq.A08("items", of);
        String string4 = FbInjector.A03.getString(2131953884);
        C1pq.A08("primaryButton", string4);
        String BDB2 = 2W2.A00((2W2) c00i.get()).BDB(r02, 36878603544429426L);
        String string5 = (BDB2 == null || 0CU.A0O(BDB2)) ? null : FbInjector.A03.getString(2131953883);
        String string6 = FbInjector.A03.getString(2131953882);
        C1pq.A08("text", string6);
        String string7 = FbInjector.A03.getString(2131953890);
        C1pq.A08("title", string7);
        8Zo r03 = new 8Zo(new RTL(of, string6, string4, string5, string7), 7zQ.A0m(this.A05), 7zU.A0t(this, 31), 7zU.A0t(this, 32));
        1Iw A0T = 7zP.A0T(this);
        EAX eax = new EAX(requireContext(), 0);
        FeI feI = FeI.A00;
        11T.A0A(feI);
        eax.A0A(feI);
        eax.A0C(false);
        eax.setContentView(LithoView.A02(r03, A0T));
        return eax;
    }

    public void A0o() {
        EAX eax;
        EAX eax2 = ((0D2) this).A01;
        if (!(eax2 instanceof EAX) || (eax = eax2) == null) {
            super/*X.0D2*/.A0o();
        } else {
            eax.A05();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        Parcelable.Creator creator;
        int i;
        int A02 = 0FI.A02(1595857473);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Object obj = ThreadSummary.class.getDeclaredField("CREATOR").get(null);
        if (!(obj instanceof Parcelable.Creator) || (creator = (Parcelable.Creator) obj) == null) {
            IllegalArgumentException A0v = 7zS.A0v(ThreadSummary.class);
            0FI.A08(1103744422, A02);
            throw A0v;
        }
        ThreadSummary threadSummary = (ThreadSummary) 7zQ.A0K(requireArguments, creator, ThreadSummary.class, "thread_summary");
        if (threadSummary != null) {
            this.A00 = threadSummary;
            this.A03 = requireArguments.getInt("thread_warning_entry_point");
            1Br.A0C(this.A09);
            Context requireContext = requireContext();
            ThreadSummary threadSummary2 = this.A00;
            if (threadSummary2 != null) {
                this.A01 = new C9l9(requireContext, threadSummary2.A0n, this.A03);
                C9he c9he = (C9he) 1Br.A0B(this.A0A);
                ThreadSummary threadSummary3 = this.A00;
                if (threadSummary3 != null) {
                    ThreadKey threadKey = threadSummary3.A0n;
                    11T.A0A(threadKey);
                    this.A02 = c9he.A02(threadKey);
                    i = -209921575;
                }
            }
            11T.A0L("threadSummary");
            throw 0Q8.createAndThrow();
        }
        A0o();
        i = -1150654881;
        0FI.A08(i, A02);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        11T.A0F(dialogInterface, 0);
        super/*X.0D2*/.onDismiss(dialogInterface);
        1EK.A08("CEIBankHitThreadWarningBottomSheetFragment");
        try {
            ReqContext A04 = AnonymousClass018.A04("CEIBankHitThreadWarningBottomSheetFragment", 0);
            try {
                C9l9 c9l9 = this.A01;
                if (c9l9 != null) {
                    c9l9.A02(C5nv.A03);
                }
                CJ2 cj2 = this.A02;
                if (cj2 != null) {
                    cj2.A04(false);
                }
                if (A04 != null) {
                    A04.close();
                }
            } finally {
            }
        } finally {
            1EK.A03();
        }
    }
}
