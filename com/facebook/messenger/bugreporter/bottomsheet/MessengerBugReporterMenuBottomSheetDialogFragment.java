package com.facebook.messenger.bugreporter.bottomsheet;

import X.0FI;
import X.11T;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1Du;
import X.1Iw;
import X.1LI;
import X.1iF;
import X.1yM;
import X.7zP;
import X.8lU;
import X.9De;
import X.9PE;
import X.AbF;
import X.AnonymousClass001;
import X.AnonymousClass553;
import X.C00i;
import X.C37s;
import X.C3Om;
import X.C4F7;
import X.DKF;
import X.DtC;
import X.EPO;
import X.ExU;
import X.F6w;
import X.FFg;
import X.Fk2;
import X.FkE;
import X.GKR;
import X.LeC;
import android.app.Activity;
import android.os.Bundle;
import com.facebook.bugreporter.activity.chooser.ChooserOption;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messenger.app.update.InAppUpdater;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.List;

/* loaded from: MessengerBugReporterMenuBottomSheetDialogFragment.class */
public class MessengerBugReporterMenuBottomSheetDialogFragment extends MigBottomSheetDialogFragment {
    public static final C00i A0E = 1BQ.A00();
    public static final CallerContext A0F = CallerContext.A0B("MessengerBugReporterMenuBottomSheetDialogFragment");
    public C00i A00;
    public C00i A01;
    public C00i A02;
    public volatile F6w A0D;
    public List A03 = ImmutableList.of();
    public final C00i A05 = 1BQ.A02(49736);
    public final C00i A07 = AbF.A0S(this, 100011);
    public final C00i A06 = AbF.A0S(this, 99942);
    public final C00i A0C = 1BQ.A02(99940);
    public final C00i A0B = 1BQ.A02(16885);
    public boolean A04 = true;
    public final AnonymousClass553 A09 = new FkE(this, 12);
    public final AnonymousClass553 A0A = new FkE(this, 10);
    public final AnonymousClass553 A08 = new FkE(this, 11);

    public 1iF A17() {
        return AbF.A0C(2923293961022627L);
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(80);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        boolean z;
        DtC dtC = new DtC(r302, new 8lU());
        MigColorScheme A1F = A1F();
        8lU r0 = dtC.A01;
        r0.A04 = A1F;
        BitSet bitSet = dtC.A02;
        bitSet.set(3);
        r0.A08 = this.A03;
        bitSet.set(6);
        r0.A01 = this.A08;
        bitSet.set(2);
        r0.A02 = this.A09;
        bitSet.set(7);
        r0.A03 = this.A0A;
        bitSet.set(8);
        if (1BK.A0N(A0E).AZk(36315275633762992L)) {
            z = ((InAppUpdater) this.A01.get()).A00;
            if (z) {
                FFg.A01(DKF.A0Q(this.A00), "build_version", "outdated");
            }
        } else {
            z = false;
        }
        r0.A05 = Boolean.valueOf(z);
        bitSet.set(4);
        r0.A00 = A0F;
        bitSet.set(1);
        r0.A07 = C3Om.A01(requireContext(), (1yM) this.A0B.get());
        bitSet.set(0);
        boolean z2 = true;
        if (this.A0D != null && this.A0D.A05 != EPO.A0O) {
            z2 = false;
        }
        r0.A06 = Boolean.valueOf(z2);
        bitSet.set(5);
        7zP.A18(dtC, bitSet, dtC.A03);
        return r0;
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-2092031133);
        super.onCreate(bundle);
        super.A02 = true;
        this.A02 = 1BV.A00(66650);
        this.A00 = 1BQ.A02(100325);
        this.A01 = 1BQ.A02(116392);
        ArrayList A0s = AnonymousClass001.A0s();
        1Du it = ((GKR) this.A0C.get()).AcZ().iterator();
        while (it.hasNext()) {
            ChooserOption chooserOption = (ChooserOption) it.next();
            A0s.add(new 9PE(chooserOption, new Fk2(chooserOption, this, 7)));
        }
        this.A03 = ImmutableList.copyOf((Collection) A0s);
        0FI.A08(2143088382, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-1423148068);
        if (this.A04) {
            DKF.A0Q(this.A00).A02();
        }
        super/*androidx.fragment.app.Fragment*/.onPause();
        0FI.A08(2120899065, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int i;
        int A02 = 0FI.A02(1702418183);
        super/*androidx.fragment.app.Fragment*/.onResume();
        Activity A16 = A16();
        if (A16 == null) {
            i = 112857478;
        } else {
            InAppUpdater inAppUpdater = (InAppUpdater) this.A01.get();
            Activity A162 = A16();
            11T.A0F(A162, 0);
            inAppUpdater.A01.AXH().A03(new LeC(A162, inAppUpdater, 1), C4F7.A00);
            if (this.A0D == null) {
                ExU exU = new ExU();
                exU.A00(A16);
                exU.A01(EPO.A0O);
                this.A0D = new F6w(exU);
            }
            Preconditions.checkNotNull(this.A0D, "params null.");
            DKF.A0Q(this.A00).A03(this.A0D.A05);
            i = 787737951;
        }
        0FI.A08(i, A02);
    }
}
