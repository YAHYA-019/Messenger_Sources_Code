package com.facebook.messaging.encryptedbackups.hsm.ui.fragment;

import X.0FI;
import X.0Q8;
import X.0fH;
import X.11T;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1Lm;
import X.1xL;
import X.6KV;
import X.7zL;
import X.7zM;
import X.7zN;
import X.7zO;
import X.7zP;
import X.7zQ;
import X.7zR;
import X.7zU;
import X.82O;
import X.9IQ;
import X.9Nv;
import X.9ZO;
import X.9lN;
import X.AEl;
import X.AEm;
import X.AQv;
import X.ASL;
import X.AnonymousClass001;
import X.C1ud;
import X.C1wb;
import X.C2ax;
import X.C2iw;
import X.C96c;
import X.C96q;
import X.C9cq;
import X.C9qq;
import X.C9sj;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import com.facebook.litho.LithoView;
import com.facebook.messaging.encryptedbackups.basefragment.BaseFragment;
import com.facebook.messaging.encryptedbackups.blockstore.setup.BlockStoreSetupManager;
import com.facebook.messaging.encryptedbackups.defaulteb.bottomsheet.EbUpsellPinSetupFragment;
import com.facebook.messaging.encryptedbackups.nux.fragment.EbInvalidPinResetFragment;
import com.facebook.messaging.encryptedbackups.recoverycodemigration.fragment.EbEmployeeRecoveryCodeMigrationPinSetupFragment;
import com.facebook.messaging.encryptedbackups.recoverycodemigration.fragment.EbProdRecoveryCodeMigrationPinSetupFragment;

/* loaded from: HsmPinCodeSetupBaseFragment.class */
public abstract class HsmPinCodeSetupBaseFragment extends BaseFragment {
    public InputMethodManager A00;
    public 6KV A01;
    public 9IQ A02;
    public 9lN A03;
    public C1wb A04;
    public 1xL A05;
    public boolean A06;
    public 9Nv A07;
    public final C2iw A08 = 7zL.A0Z();

    public void A1A() {
        6KV r0 = this.A01;
        if (r0 == null) {
            11T.A0L("viewOrientationLockHelper");
            throw 0Q8.createAndThrow();
        }
        r0.A05(-1);
        super.A1A();
    }

    public void A1J() {
        super.A1J();
        A1s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        C96q c96q;
        super.A1S(bundle);
        this.A03 = new 9lN(requireContext(), BaseFragment.A06(this, 68895), (9ZO) 1Bi.A03(this instanceof EbProdRecoveryCodeMigrationPinSetupFragment ? 68804 : this instanceof EbEmployeeRecoveryCodeMigrationPinSetupFragment ? 68803 : this instanceof EbUpsellPinSetupFragment ? 68805 : 68801));
        A1m().A03(bundle);
        9lN A1m = A1m();
        if (this instanceof EbUpsellPinSetupFragment) {
            c96q = C96q.A02;
        } else {
            Bundle bundle2 = ((Fragment) this).mArguments;
            c96q = (bundle2 == null || !bundle2.getBoolean("from_setting")) ? C96q.A0A : C96q.A0I;
        }
        A1m.A00 = c96q;
        this.A07 = (9Nv) 1Bn.A0A(68911);
        this.A00 = (InputMethodManager) 7zO.A0m((Fragment) this, 100189);
        this.A02 = new 9IQ(this);
        this.A01 = ((82O) 1Bn.A0A(65571)).A00(((Fragment) this).requireContext());
        this.A04 = (C1wb) 1Bn.A0A(68659);
        this.A05 = (1xL) 1Bi.A03(65999);
    }

    public final 9lN A1m() {
        9lN r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        7zL.A1B();
        throw 0Q8.createAndThrow();
    }

    public void A1n() {
        if (this instanceof EbInvalidPinResetFragment) {
            return;
        }
        9Nv r0 = this.A07;
        if (r0 == null) {
            11T.A0L("secureAuthListener");
            throw 0Q8.createAndThrow();
        }
        ((C9cq) 1Br.A0B(r0.A00)).A02("EXIT_WITH_BACK_BUTTON");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1o() {
        7zQ.A16(requireContext(), 2131957724);
        9Nv r0 = this.A07;
        if (r0 == null) {
            11T.A0L("secureAuthListener");
            throw 0Q8.createAndThrow();
        }
        ((C9cq) 1Br.A0B(r0.A00)).A00();
        A1r();
        if (this instanceof EbUpsellPinSetupFragment) {
            0fH.A0j("EbUpsellPinSetupFragment", "finishScreen");
            A1q();
        } else {
            A1q();
            A1Q().finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1p() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof com.facebook.messaging.encryptedbackups.nux.fragment.EbNuxPinSetupFragment
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L84
            r0 = r301
            r303 = r0
            r0 = r301
            com.facebook.messaging.encryptedbackups.nux.fragment.EbNuxPinSetupFragment r0 = (com.facebook.messaging.encryptedbackups.nux.fragment.EbNuxPinSetupFragment) r0
            r303 = r0
            r0 = r303
            boolean r0 = r0.A1t()
            r304 = r0
            java.lang.String r0 = "nuxPinSetupViewData"
            r305 = r0
            r0 = r303
            X.9UX r0 = r0.A00
            r306 = r0
            r0 = r304
            if (r0 == 0) goto L85
            r0 = r306
            if (r0 == 0) goto La8
            r0 = r303
            boolean r0 = r0.A1t()
            r302 = r0
            r0 = r303
            com.facebook.auth.usersession.FbUserSession r0 = r0.A1b()
            r307 = r0
            r0 = r302
            if (r0 == 0) goto L5f
            r0 = r306
            X.1Br r0 = r0.A04
            X.9uq r0 = X.7zU.A0P(r0)
            java.lang.String r1 = "DEFAULT_EB_UPSELL_PIN_SKIP_CLICK"
            r0.A08(r1)
            X.2aH r0 = X.7zN.A0y()
            r308 = r0
            r0 = 2
            r302 = r0
            r0 = r307
            r1 = r306
            r2 = 0
            r3 = r302
            X.AJi r0 = X.AJi.A03(r0, r1, r2, r3)
            r305 = r0
            r0 = r305
            r1 = r308
            X.C48D.A02(r0, r1)
        L5f:
            X.97j r0 = X.C97j.A0O
            r305 = r0
        L64:
            r0 = r305
            java.lang.String r0 = r0.key
            r308 = r0
            r0 = r303
            X.FAn r0 = r0.A01
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lb0
            r0 = r303
            android.os.Bundle r0 = r0.A1a()
            r305 = r0
            r0 = r305
            r1 = r303
            r2 = r308
            X.7zR.A10(r0, r1, r2)
        L84:
            return
        L85:
            r0 = r306
            if (r0 == 0) goto La8
            r0 = r306
            X.2bX r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            r308 = r0
            X.95f r0 = X.C95f.A02
            r305 = r0
            r0 = r308
            r1 = r305
            if (r0 != r1) goto L5f
            X.97j r0 = X.C97j.A0P
            r305 = r0
            goto L64
        La8:
            r0 = r305
            X.11T.A0L(r0)
            goto Lb3
        Lb0:
            X.7zL.A1D()
        Lb3:
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeSetupBaseFragment.A1p():void");
    }

    public final void A1q() {
        View findViewWithTag = A1c().findViewWithTag("HsmPinSetupComponent-pinInput");
        if (findViewWithTag != null) {
            if (A1e().A03()) {
                findViewWithTag.post(new AEl(findViewWithTag, this));
                return;
            }
            InputMethodManager inputMethodManager = this.A00;
            if (inputMethodManager == null) {
                11T.A0L("inputMethodManager");
                throw 0Q8.createAndThrow();
            }
            inputMethodManager.hideSoftInputFromWindow(findViewWithTag.getWindowToken(), 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A1r() {
        String str;
        Bundle bundle;
        C1ud A1e = A1e();
        if (7zM.A1a(A1e, C1ud.A00(A1e), 36316426689980401L) && (bundle = this.mArguments) != null && bundle.getBoolean("reset_pin")) {
            C1wb c1wb = this.A04;
            if (c1wb != null) {
                c1wb.A03();
                A1m().A0C.A00("HSM_MIGRATION_VOLUNTARY_RESET_FINISHED");
            }
            str = "availabilityProvider";
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        if (A1e().A0B()) {
            C1wb c1wb2 = this.A04;
            if (c1wb2 != null) {
                7zN.A0V(c1wb2, "mark encrypted backup invalid pin reset flow skipped").A0F();
                A1m().A0C.A00("PIN_CREATION_ERROR_VOLUNTARY_RESET_FINISHED");
            }
            str = "availabilityProvider";
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        1xL r0 = this.A05;
        if (r0 == null) {
            str = "endgameGatingUtil";
        } else {
            if (1Br.A07(r0.A00).AZk(36326511267305124L)) {
                C1wb c1wb3 = this.A04;
                if (c1wb3 != null) {
                    7zN.A0V(c1wb3, "mark encrypted backup recovery code migration flow finished").A0I();
                }
                str = "availabilityProvider";
            }
            C2ax c2ax = (C2ax) 1Lm.A06(A1b(), 68386);
            0fH.A0j("PinReminderProvider", "updateFlagWhenNewPinCreated");
            C2ax.A01(c2ax);
            9ZO r02 = A1m().A0C;
            if (r02.A00) {
                C1ud A0a = 7zP.A0a(r02.A01);
                if (7zM.A1a(A0a, C1ud.A00(A0a), 36316426689980401L)) {
                    ((C9cq) 1Br.A0B(r02.A02)).A00();
                }
            } else {
                AQv.A02(r02.A03, C96c.A05);
            }
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null && bundle2.getBoolean("reset_pin")) {
                return;
            }
            9lN A1m = A1m();
            BlockStoreSetupManager blockStoreSetupManager = (BlockStoreSetupManager) 1Br.A0B(A1m.A08);
            C96q c96q = A1m.A00;
            if (c96q != null) {
                blockStoreSetupManager.A04(c96q, ASL.A00);
                return;
            }
            str = "entryPoint";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public final void A1s() {
        View findViewWithTag;
        if ((this instanceof EbUpsellPinSetupFragment) || (findViewWithTag = A1c().findViewWithTag("HsmPinSetupComponent-pinInput")) == null) {
            return;
        }
        if (A1e().A03() && !findViewWithTag.hasFocus()) {
            findViewWithTag.post(new AEm(findViewWithTag, this));
            return;
        }
        InputMethodManager inputMethodManager = this.A00;
        if (inputMethodManager == null) {
            11T.A0L("inputMethodManager");
            throw 0Q8.createAndThrow();
        }
        inputMethodManager.showSoftInput(findViewWithTag, 1);
    }

    public boolean Bkd() {
        A1m().A0C.A00("SETUP_PIN_CODE_SETUP_BACK_CLICK");
        A1q();
        9lN A1m = A1m();
        AQv A01 = AQv.A01(this, 22);
        boolean A1a = 7zU.A1a(A1m.A06);
        9ZO r0 = A1m.A0C;
        if (A1a) {
            r0.A00("SETUP_PIN_CODE_SETUP_CONFIRM_CANCEL_CLICK");
            9lN.A00(A1m);
            return true;
        }
        r0.A00("SETUP_PIN_CODE_SETUP_CANCEL_CLICK");
        A01.invoke();
        return false;
    }

    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, 1385956061);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        A1c().setImportantForAutofill(8);
        LithoView A1c = A1c();
        0FI.A08(261596913, A04);
        return A1c;
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        9lN A1m = A1m();
        bundle.putString("currentScreenPin", A1m.A01);
        bundle.putInt("attemptsCount", 7zR.A02(A1m.A04));
        bundle.putString("initStagePin", A1m.A02);
        bundle.putParcelable("viewState", (Parcelable) A1m.A05.getValue());
        bundle.putBoolean("isInConfirmationStage", 7zU.A1a(A1m.A06));
        bundle.putInt("keyUserClickedPinInput", AnonymousClass001.A03(A1m.A0F.getValue()));
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        C9qq.A00(this, A1m().A04, 20);
        C9qq.A00(this, A1m().A05, 21);
        C9qq.A00(this, A1m().A06, 22);
        C9qq.A00(this, 7zU.A0E(A1m().A0E), 23);
        A1g();
        A1c().A03 = new C9sj(this, 3);
        9lN A1m = A1m();
        String str = this instanceof EbProdRecoveryCodeMigrationPinSetupFragment ? "EbProdRecoveryCodeMigrationPinSetupFragment" : this instanceof EbEmployeeRecoveryCodeMigrationPinSetupFragment ? "EbRecoveryCodeMigrationPinSetupFragment" : this instanceof HsmPinCodeSetupFragment ? "HsmPinCodeSetupFragment" : "EbUpsellPinSetupFragment";
        9ZO r0 = A1m.A0C;
        r0.A00("SETUP_PIN_CODE_SETUP_SCREEN");
        if (r0.A00) {
            return;
        }
        r0.A03.A09(str);
    }
}
