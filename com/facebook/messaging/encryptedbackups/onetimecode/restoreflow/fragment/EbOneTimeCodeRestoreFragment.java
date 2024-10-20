package com.facebook.messaging.encryptedbackups.onetimecode.restoreflow.fragment;

import X.0FI;
import X.0Q8;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BL;
import X.1BM;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1HH;
import X.1Um;
import X.1xH;
import X.6LF;
import X.7zL;
import X.7zO;
import X.7zQ;
import X.7zR;
import X.7zS;
import X.8yZ;
import X.96N;
import X.9Nt;
import X.9Nu;
import X.9ZF;
import X.A1Y;
import X.AQn;
import X.AV6;
import X.AVJ;
import X.AnonymousClass086;
import X.C2iw;
import X.C5ic;
import X.C9gz;
import X.C9qq;
import X.C9rb;
import X.C9sj;
import X.FAn;
import X.FIu;
import X.GF6;
import X.Iby;
import X.SD1;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.encryptedbackups.basefragment.BaseFragment;
import com.facebook.messaging.encryptedbackups.onetimecode.restoreflow.model.BottomSheetState;
import com.facebook.messaging.encryptedbackups.onetimecode.restoreflow.model.DeviceInfo;
import com.facebook.messaging.encryptedbackups.onetimecode.restoreflow.model.ViewState;
import com.facebook.messaging.encryptedbackups.onetimecode.restoreflow.viewdata.EbOneTimeCodeRestoreViewData;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: EbOneTimeCodeRestoreFragment.class */
public final class EbOneTimeCodeRestoreFragment extends BaseFragment implements GF6 {
    public FIu A00;
    public 9Nt A01;
    public 9Nu A02;
    public EbOneTimeCodeVerifiedDevicesBottomSheet A03;
    public EbOneTimeCodeRestoreViewData A04;
    public C5ic A05;
    public 6LF A06;
    public 9ZF A07;
    public FAn A08;
    public final C2iw A09 = 7zL.A0Z();
    public final Object A0A = new Object();

    public static final void A0B(EbOneTimeCodeRestoreFragment ebOneTimeCodeRestoreFragment, String str) {
        Intent A01;
        boolean A1l = ebOneTimeCodeRestoreFragment.A1l();
        FAn fAn = ebOneTimeCodeRestoreFragment.A08;
        if (!A1l) {
            if (fAn != null) {
                A01 = FAn.A01(str, ebOneTimeCodeRestoreFragment.A1a());
                ebOneTimeCodeRestoreFragment.A1Y(A01);
                return;
            }
            11T.A0L("intentBuilder");
            throw 0Q8.createAndThrow();
        }
        if (fAn != null) {
            A01 = FAn.A00(ebOneTimeCodeRestoreFragment.A1a(), ebOneTimeCodeRestoreFragment, str);
            if (A01 == null) {
                return;
            }
            ebOneTimeCodeRestoreFragment.A1Y(A01);
            return;
        }
        11T.A0L("intentBuilder");
        throw 0Q8.createAndThrow();
    }

    public void A1D() {
        EbOneTimeCodeRestoreViewData ebOneTimeCodeRestoreViewData = this.A04;
        if (ebOneTimeCodeRestoreViewData == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        AQn A01 = AQn.A01(ebOneTimeCodeRestoreViewData, 30);
        AQn A012 = AQn.A01(ebOneTimeCodeRestoreViewData, 31);
        ebOneTimeCodeRestoreViewData.A06 = true;
        ((ExecutorService) 1Br.A0B(ebOneTimeCodeRestoreViewData.A0E)).submit((Runnable) new SD1(ebOneTimeCodeRestoreViewData, A01, A012));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1J() {
        super.A1J();
        1HH r0 = new 1HH(requireContext(), 100189);
        View findViewWithTag = A1c().findViewWithTag("EbOneTimeCodeRestoreComponent-input");
        if (findViewWithTag != null) {
            ((InputMethodManager) r0.get()).showSoftInput(findViewWithTag, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        Context requireContext = requireContext();
        FbUserSession A01 = 1BM.A01(this);
        this.A05 = 7zQ.A0l();
        this.A07 = (9ZF) 1Bn.A0E(requireContext, (1BY) null, 68654);
        1Bn.A0A(147588);
        this.A04 = new EbOneTimeCodeRestoreViewData(requireContext, A01, A1l());
        this.A06 = (6LF) 1Bn.A0E(requireContext, (1BY) null, 67784);
        EbOneTimeCodeRestoreViewData ebOneTimeCodeRestoreViewData = this.A04;
        EbOneTimeCodeVerifiedDevicesBottomSheet ebOneTimeCodeVerifiedDevicesBottomSheet = null;
        if (ebOneTimeCodeRestoreViewData != null) {
            EbOneTimeCodeRestoreViewData.A02(ebOneTimeCodeRestoreViewData);
            if (bundle != null) {
                String string = bundle.getString("currentScreenCode");
                if (string == null) {
                    throw 1BK.A0h();
                }
                ebOneTimeCodeRestoreViewData.A00 = string;
                ebOneTimeCodeRestoreViewData.A09.setValue(Integer.valueOf(bundle.getInt("attemptCount")));
                Object A00 = AnonymousClass086.A00(bundle, ViewState.class, "viewState");
                if (A00 != null) {
                    ebOneTimeCodeRestoreViewData.A0B.setValue(A00);
                }
                Object A002 = AnonymousClass086.A00(bundle, BottomSheetState.class, "bottomSheetState");
                if (A002 != null) {
                    ebOneTimeCodeRestoreViewData.A0A.setValue(A002);
                }
                ebOneTimeCodeRestoreViewData.A02 = AnonymousClass086.A01(bundle, DeviceInfo.class, "keyDeviceList");
            }
            EbOneTimeCodeRestoreViewData ebOneTimeCodeRestoreViewData2 = this.A04;
            if (ebOneTimeCodeRestoreViewData2 != null) {
                ebOneTimeCodeRestoreViewData2.A04 = AVJ.A01(this, 18);
                ebOneTimeCodeRestoreViewData2.A01 = 7zL.A14(this);
                EbOneTimeCodeRestoreViewData ebOneTimeCodeRestoreViewData3 = this.A04;
                if (ebOneTimeCodeRestoreViewData3 != null) {
                    Bundle bundle2 = this.mArguments;
                    ebOneTimeCodeRestoreViewData3.A07 = bundle2 != null ? bundle2.getBoolean("isFromRestoreMoreOptions") : false;
                    this.A08 = 7zR.A0Y();
                    EbOneTimeCodeRestoreViewData ebOneTimeCodeRestoreViewData4 = this.A04;
                    if (ebOneTimeCodeRestoreViewData4 != null) {
                        this.A02 = new 9Nu(this, ebOneTimeCodeRestoreViewData4);
                        this.A01 = new 9Nt(this, ebOneTimeCodeRestoreViewData4);
                        this.A00 = 7zQ.A0d(requireContext);
                        if (bundle != null) {
                            synchronized (this.A0A) {
                                Object A0b = getParentFragmentManager().A0b("bottom_sheet");
                                if (A0b instanceof EbOneTimeCodeVerifiedDevicesBottomSheet) {
                                    ebOneTimeCodeVerifiedDevicesBottomSheet = (EbOneTimeCodeVerifiedDevicesBottomSheet) A0b;
                                }
                                this.A03 = ebOneTimeCodeVerifiedDevicesBottomSheet;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }
        7zL.A1B();
        throw 0Q8.createAndThrow();
    }

    @Override // X.GF6
    public boolean Bkd() {
        return false;
    }

    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, 1045895082);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        A1c().setImportantForAutofill(8);
        LithoView A1c = A1c();
        0FI.A08(-1094738446, A04);
        return A1c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(-490007325);
        EbOneTimeCodeRestoreViewData ebOneTimeCodeRestoreViewData = this.A04;
        if (ebOneTimeCodeRestoreViewData == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        EbOneTimeCodeRestoreViewData.A02(ebOneTimeCodeRestoreViewData);
        ebOneTimeCodeRestoreViewData.A04 = null;
        ebOneTimeCodeRestoreViewData.A03 = null;
        WeakReference weakReference = ebOneTimeCodeRestoreViewData.A01;
        if (weakReference != null) {
            weakReference.clear();
        }
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        0FI.A08(1006331061, A02);
    }

    @Override // com.facebook.base.fragment.AbstractNavigableFragment
    public void onDestroyView() {
        int A02 = 0FI.A02(-247879112);
        if (!A1Q().isChangingConfigurations()) {
            EbOneTimeCodeRestoreViewData ebOneTimeCodeRestoreViewData = this.A04;
            if (ebOneTimeCodeRestoreViewData == null) {
                7zL.A1B();
                throw 0Q8.createAndThrow();
            }
            0fH.A0j("EbOneTimeCodeRestoreViewData", "cleanOneTimeCodeSession");
            C9gz c9gz = (C9gz) 1Br.A0B(ebOneTimeCodeRestoreViewData.A0J);
            96N r0 = 96N.A02;
            String A11 = 7zS.A11(ebOneTimeCodeRestoreViewData.A0N);
            1xH r02 = new 1xH();
            8yZ r03 = c9gz.A01;
            Integer valueOf = Integer.valueOf(r0.id);
            1Um A0R = 1BL.A0R(r03);
            MailboxFutureImpl A0P = 1BK.A0P(A0R);
            1Um.A02(A0R, new A1Y(A0P, r03, valueOf, A11, 10), A0P, false);
            A0P.addResultCallback(new Iby(r02, 0));
            C9rb.A00(r02, ebOneTimeCodeRestoreViewData, 18);
        }
        super.onDestroyView();
        0FI.A08(-1097852772, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        EbOneTimeCodeRestoreViewData ebOneTimeCodeRestoreViewData = this.A04;
        if (ebOneTimeCodeRestoreViewData == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        bundle.putString("currentScreenCode", ebOneTimeCodeRestoreViewData.A00);
        bundle.putInt("attemptCount", 7zR.A02(ebOneTimeCodeRestoreViewData.A09));
        bundle.putParcelable("viewState", (Parcelable) ebOneTimeCodeRestoreViewData.A0B.getValue());
        bundle.putParcelable("bottomSheetState", (Parcelable) ebOneTimeCodeRestoreViewData.A0A.getValue());
        List list = ebOneTimeCodeRestoreViewData.A02;
        if (list != null) {
            bundle.putParcelableArrayList("keyDeviceList", 1BK.A17(list));
        }
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        EbOneTimeCodeRestoreViewData ebOneTimeCodeRestoreViewData = this.A04;
        if (ebOneTimeCodeRestoreViewData != null) {
            C9qq.A00(this, ebOneTimeCodeRestoreViewData.A09, 44);
            EbOneTimeCodeRestoreViewData ebOneTimeCodeRestoreViewData2 = this.A04;
            if (ebOneTimeCodeRestoreViewData2 != null) {
                C9qq.A00(this, ebOneTimeCodeRestoreViewData2.A0B, 45);
                EbOneTimeCodeRestoreViewData ebOneTimeCodeRestoreViewData3 = this.A04;
                if (ebOneTimeCodeRestoreViewData3 != null) {
                    C9qq.A00(this, ebOneTimeCodeRestoreViewData3.A0A, 46);
                    EbOneTimeCodeRestoreViewData ebOneTimeCodeRestoreViewData4 = this.A04;
                    if (ebOneTimeCodeRestoreViewData4 != null) {
                        ebOneTimeCodeRestoreViewData4.A03 = AV6.A00(view, this, 17);
                        A1c().A03 = new C9sj(this, 5);
                        if (!A1Q().isChangingConfigurations()) {
                            EbOneTimeCodeRestoreViewData ebOneTimeCodeRestoreViewData5 = this.A04;
                            if (ebOneTimeCodeRestoreViewData5 != null) {
                                EbOneTimeCodeRestoreViewData.A05(ebOneTimeCodeRestoreViewData5, false);
                            }
                        }
                        EbOneTimeCodeRestoreViewData ebOneTimeCodeRestoreViewData6 = this.A04;
                        if (ebOneTimeCodeRestoreViewData6 != null) {
                            7zO.A0Z(ebOneTimeCodeRestoreViewData6.A0K).A07("OTC_RESTORE_SCREEN");
                            return;
                        }
                    }
                }
            }
        }
        11T.A0L("viewData");
        throw 0Q8.createAndThrow();
    }
}
