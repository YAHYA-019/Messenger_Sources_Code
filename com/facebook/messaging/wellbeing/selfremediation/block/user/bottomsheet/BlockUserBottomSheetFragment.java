package com.facebook.messaging.wellbeing.selfremediation.block.user.bottomsheet;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.1LI;
import X.6KV;
import X.8Kb;
import X.8YB;
import X.8YC;
import X.9De;
import X.AZO;
import X.AbF;
import X.AbI;
import X.AnonymousClass001;
import X.C1z1;
import X.C21S;
import X.C37r;
import X.C3Q;
import X.C5ws;
import X.CMj;
import X.CZF;
import X.DHk;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.integrity.frx.upsellafterblock.UpsellAfterBlockBottomSheetFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.wellbeing.selfremediation.block.user.bottomsheet.data.BlockBottomSheetFragmentParams;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;

/* loaded from: BlockUserBottomSheetFragment.class */
public final class BlockUserBottomSheetFragment extends MigBottomSheetDialogFragment {
    public DHk A00;
    public boolean A01;
    public FbUserSession A02;
    public 6KV A03;
    public CMj A04;
    public BlockBottomSheetFragmentParams A05;
    public boolean A06;
    public final 1Br A07 = 1Bu.A00(147780);
    public final 1Br A08 = 1Bu.A00(65571);

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void A0o() {
        super.A0o();
        DHk dHk = this.A00;
        if (dHk != null) {
            dHk.onDismiss();
        }
        this.A06 = true;
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        CMj cMj = this.A04;
        if (cMj != null) {
            return cMj.A06 ? new C37r(90) : 9De.A00();
        }
        AbF.A1H();
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        ThreadKey threadKey;
        CMj cMj = this.A04;
        if (cMj == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        MigColorScheme A1F = A1F();
        11T.A0F(A1F, 0);
        boolean z = cMj.A06;
        boolean z2 = true;
        User user = cMj.A03;
        boolean A1W = AnonymousClass001.A1W(user.A02(), C1z1.NOT_BLOCKED);
        BlockUserBottomSheetFragment blockUserBottomSheetFragment = cMj.A01;
        boolean z3 = blockUserBottomSheetFragment != null ? blockUserBottomSheetFragment.A01 : false;
        CZF A00 = CZF.A00(cMj, 75);
        CZF A002 = CZF.A00(cMj, 76);
        CZF A003 = CZF.A00(cMj, 77);
        ThreadSummary threadSummary = cMj.A0Q;
        8Kb r0 = new 8Kb(A00, A002, A003, threadSummary, user, A1W, z3);
        if (z) {
            if (!((C3Q) 1Br.A0B(cMj.A0K)).A00(threadSummary, cMj.A03) || C5ws.A00(cMj.A03)) {
                z2 = false;
            }
            return new 8YC(r0, A1F, z2);
        }
        if ((threadSummary == null || (threadKey = threadSummary.A0n) == null || !threadKey.A1H()) && user.A1M == null) {
            z2 = false;
        }
        return new 8YB(r0, A1F, Boolean.valueOf(z2));
    }

    public void A1M() {
        A1L().A0y(A1K(AbF.A0U(A1L())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachFragment(Fragment fragment) {
        11T.A0F(fragment, 0);
        if (fragment instanceof UpsellAfterBlockBottomSheetFragment) {
            UpsellAfterBlockBottomSheetFragment upsellAfterBlockBottomSheetFragment = (UpsellAfterBlockBottomSheetFragment) fragment;
            CMj cMj = this.A04;
            if (cMj == null) {
                AbF.A1H();
                throw 0Q8.createAndThrow();
            }
            AZO azo = cMj.A0P;
            11T.A0F(azo, 0);
            upsellAfterBlockBottomSheetFragment.A00 = azo;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0097  */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.wellbeing.selfremediation.block.user.bottomsheet.BlockUserBottomSheetFragment.onCreate(android.os.Bundle):void");
    }

    public void onDestroyView() {
        String str;
        int A02 = 0FI.A02(1700335098);
        super.onDestroyView();
        CMj cMj = this.A04;
        if (cMj == null) {
            str = "presenter";
        } else {
            cMj.A01 = null;
            6KV r0 = this.A03;
            if (r0 != null) {
                r0.A05(-1);
                if (!this.A06) {
                    A0o();
                }
                0FI.A08(619809837, A02);
                return;
            }
            str = "viewOrientationLockHelper";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(1977043280);
        super/*androidx.fragment.app.Fragment*/.onPause();
        CMj cMj = this.A04;
        if (cMj == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        C21S.A01(cMj.A0W, AbI.A0f(cMj.A0G));
        0FI.A08(1273395715, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-846961949);
        super/*androidx.fragment.app.Fragment*/.onResume();
        CMj cMj = this.A04;
        if (cMj == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        C21S.A00(cMj.A0W, AbI.A0f(cMj.A0G));
        0FI.A08(1995075563, A02);
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        BlockBottomSheetFragmentParams blockBottomSheetFragmentParams = this.A05;
        if (blockBottomSheetFragmentParams == null) {
            11T.A0L("blockBottomSheetFragmentParams");
            throw 0Q8.createAndThrow();
        }
        bundle.putParcelable("BLOCK_USER_PARAMS", blockBottomSheetFragmentParams);
    }
}
