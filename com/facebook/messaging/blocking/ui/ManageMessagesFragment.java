package com.facebook.messaging.blocking.ui;

import X.06Z;
import X.0D2;
import X.0FI;
import X.1BJ;
import X.1Bi;
import X.1Bn;
import X.1Fv;
import X.1I7;
import X.1P9;
import X.1PA;
import X.7zL;
import X.7zO;
import X.AbF;
import X.AbG;
import X.AbK;
import X.AbL;
import X.AbM;
import X.AbR;
import X.BNJ;
import X.BNT;
import X.BOM;
import X.BX5;
import X.BcB;
import X.CHm;
import X.CJj;
import X.CQX;
import X.CuT;
import X.D0U;
import X.DG4;
import X.DG5;
import X.DIi;
import X.Hpm;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: ManageMessagesFragment.class */
public class ManageMessagesFragment extends SlidingSheetDialogFragment implements DG4 {
    public 1PA A00;
    public 1I7 A01;
    public Hpm A02;
    public ThreadSummary A03;
    public DG5 A04;
    public BNT A05;
    public AbR A06;
    public DIi A07;
    public MigColorScheme A08;
    public User A09;
    public ScheduledExecutorService A0A;
    public boolean A0B;

    @Override // X.DG4
    public void ClX(DIi dIi) {
        this.A07 = dIi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment
    public void onCreate(Bundle bundle) {
        boolean z;
        int A02 = 0FI.A02(-1065323701);
        super.onCreate(bundle);
        this.A0A = AbM.A16();
        this.A06 = (AbR) 1Bn.A0A(448);
        this.A01 = (1I7) 7zO.A0m(this, 65728);
        this.A08 = AbK.A0h(this);
        setHasOptionsMenu(true);
        Bundle bundle2 = this.mArguments;
        if (bundle == null) {
            if (bundle2 != null) {
                this.A09 = (User) bundle2.getParcelable("arg_blockee");
                this.A03 = AbF.A0h(bundle2, "arg_thread_summary");
                this.A05 = BX5.A00(bundle2.getInt("arg_entry_point"));
                z = bundle2.getBoolean("arg_is_first_load");
            }
            0FI.A08(-1022650961, A02);
        }
        this.A09 = (User) bundle.get("arg_blockee");
        this.A03 = AbF.A0h(bundle, "arg_thread_summary");
        this.A05 = BX5.A00(bundle.getInt("arg_entry_point"));
        z = bundle.getBoolean("arg_is_first_load");
        this.A0B = z;
        0FI.A08(-1022650961, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(48303700);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542473);
        0FI.A08(799190034, A02);
        return A08;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(208604764);
        super.onDestroyView();
        1PA r0 = this.A00;
        if (r0 != null) {
            r0.A01();
            this.A00 = null;
        }
        0FI.A08(-1861009802, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(410581084);
        super/*androidx.fragment.app.Fragment*/.onResume();
        this.A02.A00();
        0FI.A08(-1813253961, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*X.0D2*/.onSaveInstanceState(bundle);
        bundle.putParcelable("arg_blockee", this.A09);
        bundle.putParcelable("arg_thread_summary", this.A03);
        BNT bnt = this.A05;
        if (bnt != null) {
            bundle.putInt("arg_entry_point", bnt.ordinal());
        }
        bundle.putBoolean("arg_is_first_load", this.A0B);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        DIi dIi;
        int A02 = 0FI.A02(1260309176);
        super/*X.0D2*/.onStart();
        if (!((0D2) this).A07 && (dIi = this.A07) != null) {
            int i = 2131959019;
            if (this.A09.A0E()) {
                i = 2131959023;
            }
            dIi.Cgk(i);
            DIi dIi2 = this.A07;
            Object A0A = 1Bn.A0A(83342);
            CuT cuT = this.A04;
            if (cuT == null) {
                cuT = new CuT(this, A0A, 0);
                this.A04 = cuT;
            }
            dIi2.Ch0(cuT);
        }
        CQX cqx = (CQX) 7zO.A0l(this, 82655);
        if (this.A0B) {
            1Bn.A0A(82656);
            CHm cHm = (CHm) 7zO.A0l(this, 83353);
            1Fv r0 = (1Fv) 1Bi.A03(66351);
            ThreadSummary threadSummary = this.A03;
            ThreadKey threadKey = threadSummary == null ? null : threadSummary.A0n;
            String str = this.A09.A13;
            BNT bnt = this.A05;
            if (bnt == null) {
                bnt = BNT.A0g;
            }
            BOM A01 = CJj.A01(threadSummary);
            ThreadSummary threadSummary2 = this.A03;
            BNJ A022 = cHm.A02(r0.A06(this), threadSummary2 == null ? null : threadSummary2.A0n);
            ThreadSummary threadSummary3 = this.A03;
            cqx.A0E(A01, threadKey, bnt, A022, threadSummary3 != null ? threadSummary3.A1e : null, str);
            this.A0B = false;
        }
        0FI.A08(-893828195, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) 7zL.A0F(this, 2131365429);
        AbR abR = this.A06;
        Context context = getContext();
        User user = this.A09;
        ThreadSummary threadSummary = this.A03;
        ThreadKey threadKey = threadSummary == null ? null : threadSummary.A0n;
        06Z r0 = this.mFragmentManager;
        BNT bnt = this.A05;
        if (bnt == null) {
            bnt = BNT.A0g;
        }
        boolean z = ((0D2) this).A07;
        BcB bcB = new BcB(this);
        MigColorScheme migColorScheme = this.A08;
        ScheduledExecutorService scheduledExecutorService = this.A0A;
        Context A01 = FbInjector.A01();
        AbL.A0y(abR);
        try {
            Hpm hpm = new Hpm(context, r0, recyclerView, bcB, threadKey, threadSummary, bnt, migColorScheme, user, scheduledExecutorService, z);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A02 = hpm;
            1PA r304 = this.A00;
            if (r304 == null) {
                1P9 r02 = new 1P9(this.A01);
                D0U.A01(r02, this, 1BJ.A00(6), 3);
                r304 = r02.A02();
                this.A00 = r304;
            }
            if (r304 != null) {
                r304.A00();
            }
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
