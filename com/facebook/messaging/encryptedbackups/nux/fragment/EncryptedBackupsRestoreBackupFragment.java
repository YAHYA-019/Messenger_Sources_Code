package com.facebook.messaging.encryptedbackups.nux.fragment;

import X.0DE;
import X.0Q8;
import X.0S2;
import X.0fH;
import X.11T;
import X.1Bi;
import X.1Br;
import X.1NK;
import X.1Ql;
import X.2Zy;
import X.2aI;
import X.2aK;
import X.7zM;
import X.7zP;
import X.7zS;
import X.9Bt;
import X.9Vo;
import X.9dB;
import X.AJi;
import X.AQn;
import X.AnonymousClass001;
import X.C00i;
import X.C1ud;
import X.C4L5;
import X.C96q;
import X.C97j;
import X.C9c4;
import X.C9qn;
import X.C9qq;
import X.C9up;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.messaging.encryptedbackups.basefragment.BaseFragment;

/* loaded from: EncryptedBackupsRestoreBackupFragment.class */
public final class EncryptedBackupsRestoreBackupFragment extends EncryptedBackupsBaseFragment {
    public 9Vo A00;
    public 2aI A01;
    public 2aI A02;

    public static final void A0C(EncryptedBackupsRestoreBackupFragment encryptedBackupsRestoreBackupFragment) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("continue restore flow ");
        0fH.A0j("EncryptedBackupsRestoreBackupFragment", AnonymousClass001.A0a(encryptedBackupsRestoreBackupFragment.A1a(), A0k));
        encryptedBackupsRestoreBackupFragment.A1q(encryptedBackupsRestoreBackupFragment.A1a(), C97j.A0j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A00 = new 9Vo(7zM.A0C(this, 68833), A1b());
        if (A1a().getBoolean("is_from_deep_link")) {
            C9c4 c9c4 = ((BaseFragment) this).A03;
            if (c9c4 != null) {
                c9c4.A01();
            } else {
                11T.A0L("vdStatusRepo");
                throw 0Q8.createAndThrow();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        this.A01 = 2Zy.A00(viewLifecycleOwner, ((EncryptedBackupsBaseFragment) this).A06);
        this.A02 = 2Zy.A00(viewLifecycleOwner, ((EncryptedBackupsBaseFragment) this).A05);
        9Vo r0 = this.A00;
        if (r0 != null) {
            C96q A1n = A1n();
            C9c4 c9c4 = ((BaseFragment) this).A03;
            if (c9c4 != null) {
                11T.A0F(A1n, 1);
                C96q c96q = C96q.A0A;
                if (A1n == c96q) {
                    C4L5 c4l5 = (C4L5) 1Bi.A03(67388);
                    C1ud A0a = 7zP.A0a(c4l5.A01);
                    if (7zM.A1a(A0a, C1ud.A00(A0a), 36316426697451568L)) {
                        0fH.A0j("HighFrictionRestoreGating", "exposure high friction restore");
                        1Ql.A02(1Br.A08(c4l5.A00), 1NK.A4w, true);
                    }
                }
                C00i c00i = r0.A07.A00;
                C9up c9up = (C9up) c00i.get();
                if (A1n == c96q) {
                    A1n = 9dB.A00(7zS.A0x(r0.A08)) ? c96q : C96q.A05;
                }
                c9up.A01(A1n, 9dB.A01(7zS.A0x(r0.A08)) ? 0S2.A0C : 0S2.A01);
                ((C9up) c00i.get()).A07("RESTORE_INTRODUCTION_SCREEN_IMPRESSION");
                ((C9up) c00i.get()).A08(7zS.A11(r0.A09));
                C9qn.A00(viewLifecycleOwner, c9c4.A03, c9c4, r0, 10);
                2aI r02 = this.A02;
                if (r02 == null) {
                    str = "viewBackgroundScope";
                } else {
                    2aK.A03((Integer) null, (0DE) null, AJi.A03(viewLifecycleOwner, this, null, 0), r02, 3);
                    9Vo r03 = this.A00;
                    if (r03 != null) {
                        C9qq.A01(getViewLifecycleOwner(), r03.A00, this, 40);
                        if (A1l()) {
                            0fH.A0j("EncryptedBackupsRestoreBackupFragment", "start the timeout action only for NUX restore flow");
                            A1o().A04(getViewLifecycleOwner(), AQn.A01(this, 13));
                        } else {
                            0fH.A0j("EncryptedBackupsRestoreBackupFragment", "NOT start timeout action for setting restore flow");
                        }
                        9Bt.A00(this, true);
                        return;
                    }
                }
            } else {
                str = "vdStatusRepo";
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        str = "restoreBackupViewData";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
