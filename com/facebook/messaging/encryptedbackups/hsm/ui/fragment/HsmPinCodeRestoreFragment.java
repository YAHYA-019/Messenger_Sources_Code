package com.facebook.messaging.encryptedbackups.hsm.ui.fragment;

import X.0FI;
import X.0Q8;
import X.0fH;
import X.11T;
import X.1AI;
import X.1Bi;
import X.1Bn;
import X.4YU;
import X.6KV;
import X.7zL;
import X.7zM;
import X.7zO;
import X.7zP;
import X.7zQ;
import X.7zR;
import X.7zV;
import X.82O;
import X.96C;
import X.9C4;
import X.9Nv;
import X.9lO;
import X.AEk;
import X.AXm;
import X.AZI;
import X.AaI;
import X.AnonymousClass001;
import X.C1ud;
import X.C1wl;
import X.C2iw;
import X.C97j;
import X.C9oG;
import X.C9qq;
import X.C9sj;
import X.C9up;
import X.DR6;
import X.FAn;
import X.GF6;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import com.facebook.base.fragment.AbstractNavigableFragment;
import com.facebook.litho.LithoView;
import com.facebook.messaging.encryptedbackups.basefragment.BaseFragment;
import com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeRestoreFragment;
import com.facebook.messaging.encryptedbackups.restoreflow.fragment.EbHsmMigrationRestoreFragment;
import com.facebook.messaging.encryptedbackups.restoreflow.fragment.EncryptedBackupsHsmPinCodeRestoreFragment;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: HsmPinCodeRestoreFragment.class */
public abstract class HsmPinCodeRestoreFragment extends BaseFragment implements GF6, AXm {
    public 6KV A00;
    public AaI A01;
    public 9lO A02;
    public C9up A03;
    public 9Nv A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public InputMethodManager A08;
    public C1wl A09;
    public final C2iw A0A = 7zL.A0Z();

    public static final void A0B(HsmPinCodeRestoreFragment hsmPinCodeRestoreFragment) {
        View findViewWithTag = hsmPinCodeRestoreFragment.A1c().findViewWithTag("HsmPinSetupComponent-pinInput");
        if (findViewWithTag != null) {
            if (hsmPinCodeRestoreFragment.A1e().A03() && !findViewWithTag.hasFocus()) {
                findViewWithTag.post(new AEk(findViewWithTag, hsmPinCodeRestoreFragment));
                return;
            }
            InputMethodManager inputMethodManager = hsmPinCodeRestoreFragment.A08;
            if (inputMethodManager == null) {
                11T.A0L("inputMethodManager");
                throw 0Q8.createAndThrow();
            }
            inputMethodManager.showSoftInput(findViewWithTag, 1);
        }
    }

    public void A1A() {
        6KV r0 = this.A00;
        if (r0 == null) {
            11T.A0L("viewOrientationLockHelper");
            throw 0Q8.createAndThrow();
        }
        r0.A05(-1);
        super.A1A();
    }

    public void A1J() {
        super.A1J();
        A0B(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        AaI aaI;
        super.A1S(bundle);
        this.A02 = new 9lO(7zM.A0C(this, 68894), A1b(), A1l());
        Bundle bundle2 = this.mArguments;
        this.A06 = bundle2 != null ? bundle2.getBoolean("isFromRestoreMoreOptions") : false;
        this.A04 = (9Nv) 1Bn.A0A(68911);
        A1m().A05(bundle);
        C9up c9up = (C9up) 1Bi.A03(68799);
        11T.A0F(c9up, 0);
        this.A03 = c9up;
        A1m().A00 = new AZI() { // from class: X.9uj
            /* JADX WARN: Type inference failed for: r0v6, types: [com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeRestoreFragment, com.facebook.messaging.encryptedbackups.restoreflow.fragment.EncryptedBackupsHsmPinCodeRestoreFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment, androidx.fragment.app.Fragment] */
            public void D5B(99V r302) {
                String str;
                HsmPinCodeRestoreFragment hsmPinCodeRestoreFragment = HsmPinCodeRestoreFragment.this;
                if (hsmPinCodeRestoreFragment instanceof EncryptedBackupsHsmPinCodeRestoreFragment) {
                    ?? r0 = (EncryptedBackupsHsmPinCodeRestoreFragment) hsmPinCodeRestoreFragment;
                    if (r302 instanceof C8tP) {
                        String str2 = ((C8tP) r302).A00.key;
                        if (r0.A03 != null) {
                            9C4.A00((BaseFragment) r0, str2);
                            return;
                        }
                        str = "intentBuilder";
                    } else {
                        if (!(r302 instanceof C8tQ)) {
                            return;
                        }
                        r0.A1n().A07("RESTORE_OPEN_HELP_CENTER");
                        FIu fIu = r0.A00;
                        if (fIu != null) {
                            fIu.A08(r0.requireContext(), ((C8tQ) r302).A00);
                            return;
                        }
                        str = "messengerBrowserLauncher";
                    }
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
            }

            public void D5C(int i, long j) {
                Intent putExtra;
                HsmPinCodeRestoreFragment hsmPinCodeRestoreFragment = HsmPinCodeRestoreFragment.this;
                if (!(hsmPinCodeRestoreFragment instanceof EncryptedBackupsHsmPinCodeRestoreFragment)) {
                    EbHsmMigrationRestoreFragment ebHsmMigrationRestoreFragment = (EbHsmMigrationRestoreFragment) hsmPinCodeRestoreFragment;
                    Bundle A05 = 1BK.A05();
                    A05.putAll(ebHsmMigrationRestoreFragment.A1a());
                    A05.putInt("attempts_left", i);
                    A05.putLong("backoff_interval_millis", j);
                    if (ebHsmMigrationRestoreFragment.A02 == null) {
                        7zL.A1D();
                        throw 0Q8.createAndThrow();
                    }
                    7zR.A10(A05, ebHsmMigrationRestoreFragment, "hsm_restore_request_limit_error");
                    return;
                }
                EncryptedBackupsHsmPinCodeRestoreFragment encryptedBackupsHsmPinCodeRestoreFragment = (EncryptedBackupsHsmPinCodeRestoreFragment) hsmPinCodeRestoreFragment;
                if (encryptedBackupsHsmPinCodeRestoreFragment.A1l()) {
                    Bundle A052 = 1BK.A05();
                    A052.putAll(encryptedBackupsHsmPinCodeRestoreFragment.A1a());
                    A052.putInt("attempts_left", i);
                    A052.putLong("backoff_interval_millis", j);
                    if (encryptedBackupsHsmPinCodeRestoreFragment.A03 == null) {
                        7zL.A1D();
                        throw 0Q8.createAndThrow();
                    }
                    putExtra = FAn.A00(A052, encryptedBackupsHsmPinCodeRestoreFragment, "hsm_restore_request_limit_error");
                    if (putExtra == null) {
                        return;
                    }
                } else {
                    putExtra = 4YU.A0A("hsm_restore_request_limit_error").putExtra("bundle_extras", 0PK.A00(7zO.A1b("backoff_interval_millis", Long.valueOf(j), 4YV.A13("attempts_left", i))));
                }
                encryptedBackupsHsmPinCodeRestoreFragment.A1Y(putExtra);
            }
        };
        if (this instanceof EbHsmMigrationRestoreFragment) {
            final EbHsmMigrationRestoreFragment ebHsmMigrationRestoreFragment = (EbHsmMigrationRestoreFragment) this;
            aaI = new AaI() { // from class: X.9ui
                /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeRestoreFragment, androidx.fragment.app.Fragment, com.facebook.messaging.encryptedbackups.restoreflow.fragment.EbHsmMigrationRestoreFragment] */
                @Override // X.AaI
                public void Boj() {
                    ?? r0 = EbHsmMigrationRestoreFragment.this;
                    r0.A1m().A03();
                    int ordinal = ((C95c) ((LiveData) r0.A1m().A0L.getValue()).getValue()).ordinal();
                    if (ordinal == 2) {
                        r0.A1p();
                        return;
                    }
                    if (ordinal != 1) {
                        if (ordinal == 0) {
                            r0.A1q();
                            return;
                        }
                        return;
                    }
                    94S r02 = MigBottomSheetDialogFragment.A01;
                    Set singleton = Collections.singleton(96C.A06);
                    11T.A0A(singleton);
                    ArrayList A0z = 1BL.A0z(singleton);
                    Iterator it = singleton.iterator();
                    while (it.hasNext()) {
                        A0z.add(((96C) it.next()).name());
                    }
                    Bundle A00 = 0PK.A00(7zQ.A1b("bundleDisableOptions", A0z));
                    2Ov baseMigBottomSheetDialogFragment = new BaseMigBottomSheetDialogFragment();
                    baseMigBottomSheetDialogFragment.setArguments(A00);
                    baseMigBottomSheetDialogFragment.A0m(r0.getChildFragmentManager(), "more_option_bottom_sheet");
                }

                @Override // X.AaI
                public void CBm(String str) {
                    11T.A0F(str, 0);
                    9lO A1m = EbHsmMigrationRestoreFragment.this.A1m();
                    A1m.A02 = str;
                    if (str.length() == 6) {
                        9lO.A00(A1m, str);
                    }
                }

                @Override // X.AaI
                public void CLl() {
                    EbHsmMigrationRestoreFragment.this.A1r();
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeRestoreFragment, androidx.fragment.app.Fragment, com.facebook.messaging.encryptedbackups.restoreflow.fragment.EbHsmMigrationRestoreFragment] */
                @Override // X.AaI
                public void CSR() {
                    ?? r0 = EbHsmMigrationRestoreFragment.this;
                    r0.A07 = true;
                    7zU.A15((Fragment) r0);
                    if (r0.A04 == null) {
                        11T.A0L("secureAuthListener");
                        throw 0Q8.createAndThrow();
                    }
                }
            };
        } else {
            aaI = new AaI() { // from class: X.9uh
                @Override // X.AaI
                public void Boj() {
                    1pK r0 = HsmPinCodeRestoreFragment.this;
                    AJd.A03(r0, LifecycleOwnerKt.getLifecycleScope(r0), 36);
                }

                @Override // X.AaI
                public void CBm(String str) {
                    11T.A0F(str, 0);
                    9lO A1m = HsmPinCodeRestoreFragment.this.A1m();
                    A1m.A02 = str;
                    if (str.length() == 6) {
                        9lO.A00(A1m, str);
                    }
                }

                @Override // X.AaI
                public void CLl() {
                    HsmPinCodeRestoreFragment.this.A1r();
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeRestoreFragment, androidx.fragment.app.Fragment] */
                @Override // X.AaI
                public void CSR() {
                    ?? r0 = HsmPinCodeRestoreFragment.this;
                    if (r0 instanceof EncryptedBackupsHsmPinCodeRestoreFragment) {
                        7zU.A15((Fragment) r0);
                        return;
                    }
                    r0.A07 = true;
                    7zU.A15((Fragment) r0);
                    if (r0.A04 == null) {
                        11T.A0L("secureAuthListener");
                        throw 0Q8.createAndThrow();
                    }
                }
            };
        }
        this.A01 = aaI;
        this.A00 = ((82O) 1Bn.A0A(65571)).A00(((Fragment) this).requireContext());
        this.A09 = (C1wl) 1Bn.A0A(68815);
        this.A08 = (InputMethodManager) 7zO.A0m((Fragment) this, 100189);
    }

    public final 9lO A1m() {
        9lO r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        7zL.A1B();
        throw 0Q8.createAndThrow();
    }

    public C9up A1n() {
        C9up c9up = this.A03;
        if (c9up != null) {
            return c9up;
        }
        11T.A0L("restoreFlowLogger");
        throw 0Q8.createAndThrow();
    }

    public void A1o() {
        A1Y(4YU.A0A("hsm_restore_locked_out_error"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1p() {
        Intent A01;
        if (!(this instanceof EncryptedBackupsHsmPinCodeRestoreFragment)) {
            A1n().A07("HSM_MIGRATION_RESTORE_NEED_HELP_CLICK");
            new 1AI().BXk(requireContext(), 4YU.A0F("https://www.facebook.com/help/messenger-app/431055522328649?ref=learn_more"));
            return;
        }
        EncryptedBackupsHsmPinCodeRestoreFragment encryptedBackupsHsmPinCodeRestoreFragment = (EncryptedBackupsHsmPinCodeRestoreFragment) this;
        encryptedBackupsHsmPinCodeRestoreFragment.A1n().A07("RESTORE_BACKUP_FORGOT_PIN_BUTTON_CLICK");
        boolean A1l = encryptedBackupsHsmPinCodeRestoreFragment.A1l();
        FAn fAn = encryptedBackupsHsmPinCodeRestoreFragment.A03;
        if (!A1l) {
            if (fAn != null) {
                A01 = FAn.A01("hsm_restore_reset_pin", encryptedBackupsHsmPinCodeRestoreFragment.A1a());
                encryptedBackupsHsmPinCodeRestoreFragment.A1Y(A01);
                return;
            }
            11T.A0L("intentBuilder");
            throw 0Q8.createAndThrow();
        }
        if (fAn != null) {
            A01 = FAn.A00(encryptedBackupsHsmPinCodeRestoreFragment.A1a(), encryptedBackupsHsmPinCodeRestoreFragment, "hsm_restore_reset_pin");
            if (A01 == null) {
                return;
            }
            encryptedBackupsHsmPinCodeRestoreFragment.A1Y(A01);
            return;
        }
        11T.A0L("intentBuilder");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeRestoreFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment, androidx.fragment.app.Fragment, com.facebook.base.fragment.AbstractNavigableFragment, com.facebook.messaging.encryptedbackups.restoreflow.fragment.EbHsmMigrationRestoreFragment] */
    public void A1q() {
        if (this instanceof EncryptedBackupsHsmPinCodeRestoreFragment) {
            EncryptedBackupsHsmPinCodeRestoreFragment encryptedBackupsHsmPinCodeRestoreFragment = (EncryptedBackupsHsmPinCodeRestoreFragment) this;
            encryptedBackupsHsmPinCodeRestoreFragment.A1n().A07("RESTORE_BACKUP_ONE_TIME_CODE_BUTTON_CLICK");
            String str = C97j.A0Y.key;
            if (encryptedBackupsHsmPinCodeRestoreFragment.A03 == null) {
                7zL.A1D();
                throw 0Q8.createAndThrow();
            }
            9C4.A00(encryptedBackupsHsmPinCodeRestoreFragment, str);
            return;
        }
        ?? r0 = (EbHsmMigrationRestoreFragment) this;
        0fH.A0j(r0.mTag, "opening OTC from HSM migration restore flow");
        if (r0.getContext() != null) {
            r0.A1n().A07("PIN_CODE_RESTORE_USE_OTC_INSTEAD_CLICK");
            if (r0.A02 == null) {
                7zL.A1D();
                throw 0Q8.createAndThrow();
            }
            7zR.A10(r0.A1a(), (AbstractNavigableFragment) r0, C97j.A0Y.key);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeRestoreFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment, androidx.fragment.app.Fragment, com.facebook.base.fragment.AbstractNavigableFragment, com.facebook.messaging.encryptedbackups.restoreflow.fragment.EbHsmMigrationRestoreFragment] */
    public void A1r() {
        if (this instanceof EncryptedBackupsHsmPinCodeRestoreFragment) {
            A1n().A07("RESTORE_BACKUP_SETTINGS_PIN_FLOW_CLICK_SKIP");
            A1n().A07("RESTORE_SKIP_CONFIRMATION_ALERT_SHOW");
            A1h();
            DR6 A0P = 7zV.A0P(this);
            C9oG.A02(A0P, this, 36, 2131956450);
            C9oG.A03(A0P, this, 37, 2131964499);
            return;
        }
        ?? r0 = (EbHsmMigrationRestoreFragment) this;
        0fH.A0j(r0.mTag, "skipping HSM migration restore flow");
        if (r0.getContext() != null) {
            r0.A1n().A05("RESTORE_BACKUP_SKIP_CONFIRM");
            if (r0.A02 == null) {
                7zL.A1D();
                throw 0Q8.createAndThrow();
            }
            7zR.A10(r0.A1a(), (AbstractNavigableFragment) r0, C97j.A07.key);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GF6
    public boolean Bkd() {
        if (!(this instanceof EncryptedBackupsHsmPinCodeRestoreFragment)) {
            if (this.A07) {
                return false;
            }
            A1n().A07("PIN_CODE_RESTORE_BACK_CLICK");
            return false;
        }
        if (((Fragment) this).mFragmentManager.A0U() > 0 || !A1l()) {
            return false;
        }
        A1r();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AXm
    public void BoN(96C r302) {
        switch (r302.ordinal()) {
            case 0:
                0fH.A0k(this.mTag, AnonymousClass001.A0Z(r302, "invalid restore option selected: ", AnonymousClass001.A0k()));
                return;
            case 1:
                A1q();
                return;
            case 2:
                A1r();
                return;
            case 3:
                if (!(this instanceof EncryptedBackupsHsmPinCodeRestoreFragment)) {
                    EbHsmMigrationRestoreFragment ebHsmMigrationRestoreFragment = (EbHsmMigrationRestoreFragment) this;
                    String str = C97j.A0e.key;
                    if (ebHsmMigrationRestoreFragment.A02 == null) {
                        7zL.A1D();
                        throw 0Q8.createAndThrow();
                    }
                    9C4.A00(ebHsmMigrationRestoreFragment, str);
                    return;
                }
                EncryptedBackupsHsmPinCodeRestoreFragment encryptedBackupsHsmPinCodeRestoreFragment = (EncryptedBackupsHsmPinCodeRestoreFragment) this;
                encryptedBackupsHsmPinCodeRestoreFragment.A1n().A07("RESTORE_BACKUP_RECOVERY_CODE_BUTTON_CLICK");
                String str2 = C97j.A0e.key;
                if (encryptedBackupsHsmPinCodeRestoreFragment.A03 == null) {
                    7zL.A1D();
                    throw 0Q8.createAndThrow();
                }
                9C4.A00(encryptedBackupsHsmPinCodeRestoreFragment, str2);
                return;
            case 4:
                A1p();
                return;
            case 5:
                if (this instanceof EncryptedBackupsHsmPinCodeRestoreFragment) {
                    EncryptedBackupsHsmPinCodeRestoreFragment encryptedBackupsHsmPinCodeRestoreFragment2 = (EncryptedBackupsHsmPinCodeRestoreFragment) this;
                    encryptedBackupsHsmPinCodeRestoreFragment2.A1n().A07("RESTORE_BACKUP_GDRIVE_BUTTON_CLICK");
                    String str3 = C97j.A0T.key;
                    if (encryptedBackupsHsmPinCodeRestoreFragment2.A03 == null) {
                        7zL.A1D();
                        throw 0Q8.createAndThrow();
                    }
                    9C4.A00(encryptedBackupsHsmPinCodeRestoreFragment2, str3);
                    return;
                }
                return;
            case 6:
                if (this instanceof EncryptedBackupsHsmPinCodeRestoreFragment) {
                    EncryptedBackupsHsmPinCodeRestoreFragment encryptedBackupsHsmPinCodeRestoreFragment3 = (EncryptedBackupsHsmPinCodeRestoreFragment) this;
                    encryptedBackupsHsmPinCodeRestoreFragment3.A1n().A07("RESTORE_BACKUP_PASSKEY_BUTTON_CLICK");
                    String str4 = C97j.A0Z.key;
                    if (encryptedBackupsHsmPinCodeRestoreFragment3.A03 == null) {
                        7zL.A1D();
                        throw 0Q8.createAndThrow();
                    }
                    9C4.A00(encryptedBackupsHsmPinCodeRestoreFragment3, str4);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, -76623843);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        A1c().setImportantForAutofill(8);
        A1c().setAutofillHints("notApplicable");
        LithoView A1c = A1c();
        0FI.A08(-1189304635, A04);
        return A1c;
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        A1m().A04(bundle);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        if (A1l()) {
            C1ud A0a = 7zP.A0a(A1m().A0C);
            C1ud.A00(A0a).AZr(A0a.A02, 2342159435901839329L);
        }
        C9qq.A00(this, A1m().A08, 16);
        C9qq.A00(this, A1m().A05, 17);
        C9qq.A00(this, A1m().A07, 18);
        C9qq.A00(this, (LiveData) A1m().A0L.getValue(), 19);
        A1n().A07("PIN_CODE_RESTORE_SCREEN");
        boolean A03 = A1e().A03();
        LithoView A1c = A1c();
        int i = 2;
        if (A03) {
            i = 1;
        }
        A1c.A03 = new C9sj(this, i);
    }
}
