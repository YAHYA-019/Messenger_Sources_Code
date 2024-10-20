package com.facebook.messaging.encryptedbackups.restoreflow.fragment;

import X.0Q8;
import X.11T;
import X.1Br;
import X.7zL;
import X.7zO;
import X.7zR;
import X.7zT;
import X.9Vb;
import X.AJi;
import X.C87v;
import X.C9If;
import X.FAn;
import X.FYv;
import X.GF6;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.messaging.encryptedbackups.basefragment.BaseFragment;
import com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi;

/* loaded from: EbNuxPasskeyRestoreFragment.class */
public final class EbNuxPasskeyRestoreFragment extends BaseFragment implements GF6 {
    public C9If A00;
    public 9Vb A01;
    public FAn A02;

    public EbNuxPasskeyRestoreFragment() {
    }

    public EbNuxPasskeyRestoreFragment(int i) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A01 = new 9Vb(BaseFragment.A06(this, 147591));
        FAn A0Y = 7zR.A0Y();
        11T.A0F(A0Y, 0);
        this.A02 = A0Y;
        this.A00 = new C9If(this);
        9Vb r0 = this.A01;
        if (r0 == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        FragmentActivity requireActivity = requireActivity();
        if (bundle == null) {
            7zO.A0Z(r0.A03).A07("PASSKEY_RESTORE_SCREEN_IMPRESSION");
        }
        EbPasskeyRestoreApi ebPasskeyRestoreApi = (EbPasskeyRestoreApi) 1Br.A0B(r0.A02);
        requireActivity.getLifecycle().addObserver(new FYv(ebPasskeyRestoreApi, 3));
        ebPasskeyRestoreApi.A00 = new C87v(requireActivity);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (A1l() == false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GF6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Bkd() {
        /*
            r301 = this;
            r0 = r301
            X.06Z r0 = r0.mFragmentManager
            r302 = r0
            r0 = r302
            int r0 = r0.A0U()
            r303 = r0
            r0 = r303
            if (r0 > 0) goto L1b
            r0 = r301
            boolean r0 = r0.A1l()
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r304
            if (r0 != 0) goto L1d
        L1b:
            r0 = 1
            r303 = r0
        L1d:
            r0 = r303
            r1 = 1
            r0 = r0 ^ r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.restoreflow.fragment.EbNuxPasskeyRestoreFragment.Bkd():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        9Vb r0 = this.A01;
        if (r0 != null) {
            7zT.A1C(this, new AJi(this, null, 10), r0.A08);
            9Vb r02 = this.A01;
            if (r02 != null) {
                7zT.A1C(this, new AJi(this, null, 11), r02.A06);
                return;
            }
        }
        11T.A0L("viewData");
        throw 0Q8.createAndThrow();
    }
}
