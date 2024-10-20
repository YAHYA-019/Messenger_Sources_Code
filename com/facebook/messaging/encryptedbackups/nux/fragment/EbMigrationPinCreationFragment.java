package com.facebook.messaging.encryptedbackups.nux.fragment;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1Bi;
import X.1Bn;
import X.1HH;
import X.1Hv;
import X.6KV;
import X.7zL;
import X.7zQ;
import X.7zU;
import X.82O;
import X.9IT;
import X.9ZO;
import X.9lN;
import X.9lO;
import X.AZI;
import X.C2iw;
import X.C96q;
import X.C9qq;
import X.C9sj;
import X.GF6;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.LiveData;
import com.facebook.litho.LithoView;
import com.facebook.messaging.encryptedbackups.basefragment.BaseFragment;
import com.facebook.messaging.encryptedbackups.nux.fragment.EbMigrationPinCreationFragment;
import com.facebook.messaging.encryptedbackups.nux.viewdata.EncryptedBackupsNuxViewData;

/* loaded from: EbMigrationPinCreationFragment.class */
public final class EbMigrationPinCreationFragment extends EncryptedBackupsBaseFragment implements GF6 {
    public 6KV A00;
    public 9lO A01;
    public 9lN A02;
    public 9IT A03;
    public EncryptedBackupsNuxViewData A04;
    public InputMethodManager A05;
    public final C2iw A06 = 7zL.A0Z();

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0C(EbMigrationPinCreationFragment ebMigrationPinCreationFragment) {
        IBinder windowToken;
        View view = ebMigrationPinCreationFragment.mView;
        if (view == null || (windowToken = view.getWindowToken()) == null) {
            return;
        }
        InputMethodManager inputMethodManager = ebMigrationPinCreationFragment.A05;
        if (inputMethodManager == null) {
            11T.A0L("inputMethodManager");
            throw 0Q8.createAndThrow();
        }
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
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

    /* JADX WARN: Multi-variable type inference failed */
    public void A1J() {
        super.A1J();
        1HH r0 = new 1HH(requireContext(), 100189);
        View findViewWithTag = A1c().findViewWithTag("HsmPinSetupComponent-pinInput");
        if (findViewWithTag != null) {
            ((InputMethodManager) r0.get()).showSoftInput(findViewWithTag, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        Context requireContext = requireContext();
        9lO r0 = new 9lO(requireContext, BaseFragment.A06(this, 68894), A1l());
        this.A01 = r0;
        String str = "viewData";
        r0.A05(bundle);
        9lO r02 = this.A01;
        if (r02 != null) {
            r02.A00 = new AZI() { // from class: X.9uk
                public void D5B(99V r302) {
                }

                public void D5C(int i, long j) {
                    EbMigrationPinCreationFragment ebMigrationPinCreationFragment = EbMigrationPinCreationFragment.this;
                    Bundle A05 = 1BK.A05();
                    A05.putAll(ebMigrationPinCreationFragment.A1a());
                    A05.putInt("attempts_left", i);
                    A05.putLong("backoff_interval_millis", j);
                    ebMigrationPinCreationFragment.A1r("hsm_confirm_request_limit_error", A05);
                }
            };
            9lN r03 = new 9lN(requireContext, BaseFragment.A06(this, 68895), (9ZO) 1Bi.A03(68801));
            this.A02 = r03;
            str = "setupViewData";
            r03.A03(bundle);
            9lN r04 = this.A02;
            if (r04 != null) {
                C96q A1n = A1n();
                11T.A0F(A1n, 0);
                r04.A00 = A1n;
                this.A03 = new 9IT(this);
                this.A00 = ((82O) 1Bn.A0A(65571)).A00(requireContext);
                EncryptedBackupsNuxViewData encryptedBackupsNuxViewData = new EncryptedBackupsNuxViewData(BaseFragment.A06(this, 68827), requireContext);
                this.A04 = encryptedBackupsNuxViewData;
                encryptedBackupsNuxViewData.A02();
                this.A05 = (InputMethodManager) 1Hv.A02(requireContext, 100189);
                return;
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // X.GF6
    public boolean Bkd() {
        return false;
    }

    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, -1940414808);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        A1c().setImportantForAutofill(8);
        LithoView A1c = A1c();
        0FI.A08(1279490842, A04);
        return A1c;
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        9lO r0 = this.A01;
        if (r0 == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        r0.A04(bundle);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        9lO r0 = this.A01;
        String str = "viewData";
        if (r0 != null) {
            C9qq.A00(this, r0.A08, 26);
            9lO r02 = this.A01;
            if (r02 != null) {
                C9qq.A00(this, r02.A05, 27);
                9lN r03 = this.A02;
                if (r03 == null) {
                    str = "setupViewData";
                } else {
                    C9qq.A00(this, 7zU.A0E(r03.A0E), 28);
                    9lO r04 = this.A01;
                    if (r04 != null) {
                        C9qq.A00(this, r04.A07, 29);
                        9lO r05 = this.A01;
                        if (r05 != null) {
                            C9qq.A00(this, (LiveData) r05.A0J.getValue(), 30);
                            A1c().A03 = new C9sj(this, 4);
                            return;
                        }
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
