package com.facebook.messaging.encryptedbackups.restoreflow.fragment;

import X.0Pz;
import X.0Q8;
import X.0fH;
import X.11T;
import X.1Bi;
import X.1Br;
import X.48X;
import X.7zL;
import X.7zM;
import X.7zO;
import X.7zQ;
import X.7zR;
import X.7zT;
import X.9Ij;
import X.9Vb;
import X.AJe;
import X.AJi;
import X.C87v;
import X.C97j;
import X.C9ch;
import X.C9qq;
import X.C9up;
import X.FAn;
import X.FIu;
import X.FYv;
import X.GF6;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.messaging.encryptedbackups.basefragment.BaseFragment;
import com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi;

/* loaded from: EbRestoreOptionsFragment.class */
public final class EbRestoreOptionsFragment extends BaseFragment implements GF6 {
    public FIu A00;
    public C9up A01;
    public 9Vb A02;
    public C9ch A03;
    public 48X A04;
    public FAn A05;
    public final 9Ij A06 = new 9Ij(this);

    public static final void A0B(EbRestoreOptionsFragment ebRestoreOptionsFragment, String str) {
        Intent A01;
        if (!ebRestoreOptionsFragment.A1l()) {
            0fH.A0j("EbRestoreOptionsFragment", 0Pz.A0j("finish with state: ", str, " in Setting flow"));
            if (ebRestoreOptionsFragment.A05 != null) {
                A01 = FAn.A01(str, ebRestoreOptionsFragment.A1a());
                ebRestoreOptionsFragment.A1Y(A01);
                return;
            }
            11T.A0L("intentBuilder");
            throw 0Q8.createAndThrow();
        }
        0fH.A0j("EbRestoreOptionsFragment", 0Pz.A0j("finish with state: ", str, " in NUX flow"));
        if (ebRestoreOptionsFragment.A05 != null) {
            A01 = FAn.A00(ebRestoreOptionsFragment.A1a(), ebRestoreOptionsFragment, str);
            if (A01 == null) {
                return;
            }
            ebRestoreOptionsFragment.A1Y(A01);
            return;
        }
        11T.A0L("intentBuilder");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A03 = new C9ch(7zM.A0C(this, 68888), A1b());
        this.A02 = new 9Vb(BaseFragment.A06(this, 147591));
        this.A00 = (FIu) 7zO.A0l(this, 100011);
        C9up c9up = (C9up) 1Bi.A03(68799);
        11T.A0F(c9up, 0);
        this.A01 = c9up;
        this.A05 = 7zR.A0Y();
        this.A04 = 7zQ.A0f();
        if (!A1e().A06()) {
            9Vb r0 = this.A02;
            if (r0 == null) {
                11T.A0L("passkeyRestoreViewData");
                throw 0Q8.createAndThrow();
            }
            FragmentActivity requireActivity = requireActivity();
            EbPasskeyRestoreApi ebPasskeyRestoreApi = (EbPasskeyRestoreApi) 1Br.A0B(r0.A02);
            requireActivity.getLifecycle().addObserver(new FYv(ebPasskeyRestoreApi, 3));
            ebPasskeyRestoreApi.A00 = new C87v(requireActivity);
        }
    }

    @Override // X.GF6
    public boolean Bkd() {
        C9ch c9ch = this.A03;
        if (c9ch == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        7zO.A0Z(c9ch.A04).A07("RESTORE_OPTIONS_SCREEN_ACTION_BACK");
        return false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        bundle.putString("SELECTED_OPTION", "");
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        C9ch c9ch = this.A03;
        String str = "viewData";
        if (c9ch != null) {
            7zO.A0Z(c9ch.A04).ATN("RESTORE_OPTIONS_SCREEN_IMPRESSION");
            C9ch c9ch2 = this.A03;
            if (c9ch2 != null) {
                C9qq.A01(getViewLifecycleOwner(), c9ch2.A01, this, 54);
                C9ch c9ch3 = this.A03;
                if (c9ch3 != null) {
                    if (c9ch3.A00 == null) {
                        48X r0 = this.A04;
                        if (r0 == null) {
                            str = "cooldownHelper";
                        } else {
                            r0.A00();
                            A0B(this, C97j.A0j.key);
                        }
                    }
                    if (!(!A1e().A06())) {
                        return;
                    }
                    9Vb r02 = this.A02;
                    str = "passkeyRestoreViewData";
                    if (r02 != null) {
                        7zT.A1C(this, new AJe(this, null, 4), r02.A08);
                        9Vb r03 = this.A02;
                        if (r03 != null) {
                            7zT.A1C(this, new AJi(this, null, 15), r03.A06);
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
