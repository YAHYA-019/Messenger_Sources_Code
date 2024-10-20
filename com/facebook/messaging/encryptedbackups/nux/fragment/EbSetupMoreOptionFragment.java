package com.facebook.messaging.encryptedbackups.nux.fragment;

import X.0DE;
import X.0DR;
import X.0Q8;
import X.0S2;
import X.0fH;
import X.11T;
import X.1Bi;
import X.1Bn;
import X.1xG;
import X.2Zo;
import X.2Zy;
import X.2aI;
import X.2aK;
import X.7zL;
import X.7zM;
import X.7zO;
import X.7zP;
import X.7zT;
import X.7zU;
import X.9IO;
import X.9gD;
import X.AJG;
import X.AJW;
import X.AQv;
import X.AnonymousClass001;
import X.C01i;
import X.C03i;
import X.C95y;
import X.C96z;
import X.C9i0;
import X.C9qq;
import X.FYz;
import X.GF6;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.messaging.encryptedbackups.basefragment.BaseFragment;
import com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController;
import com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData;

/* loaded from: EbSetupMoreOptionFragment.class */
public class EbSetupMoreOptionFragment extends BaseFragment implements GF6 {
    public C9i0 A00;
    public GoogleAuthController A01;
    public GoogleDriveViewData A02;
    public 9gD A04;
    public 1xG A05;
    public 2aI A06;
    public 2aI A07;
    public boolean A08;
    public C95y A03 = C95y.A04;
    public final C01i A09 = AQv.A00(this, C03i.A02, 45);

    public static final void A0B(EbSetupMoreOptionFragment ebSetupMoreOptionFragment, boolean z) {
        2aI r0 = ebSetupMoreOptionFragment.A06;
        if (r0 == null) {
            11T.A0L("viewBoundBackgroundScope");
            throw 0Q8.createAndThrow();
        }
        2aK.A03((Integer) null, (0DE) null, new AJG(ebSetupMoreOptionFragment, (0DR) null, 4, z), r0, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1K() {
        super.A1K();
        GoogleDriveViewData googleDriveViewData = this.A02;
        if (googleDriveViewData == null) {
            11T.A0L("googleDriveViewData");
            throw 0Q8.createAndThrow();
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        0fH.A0j("GoogleDriveViewData", "setLifecycleOwner()");
        viewLifecycleOwner.getLifecycle().addObserver(new FYz(googleDriveViewData, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        String string;
        C95y c95y;
        String string2;
        super.A1S(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A08 = bundle2.getBoolean("IS_FROM_SETTING", false);
            String string3 = bundle2.getString("PREFERRED_OPTION");
            if (string3 != null) {
                C95y[] values = C95y.values();
                int length = values.length;
                for (int i = 0; i < length; i++) {
                    c95y = values[i];
                    if (11T.A0O(c95y.name(), string3)) {
                        break;
                    }
                }
            }
            Bundle bundle3 = bundle2.getBundle("com.facebook.fragment.BUNDLE_EXTRAS");
            if (bundle3 != null && (string2 = bundle3.getString("PREFERRED_OPTION")) != null) {
                C95y[] values2 = C95y.values();
                int length2 = values2.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    c95y = values2[i2];
                    if (11T.A0O(c95y.name(), string2)) {
                        break;
                    }
                }
            }
            c95y = C95y.A04;
            this.A03 = c95y;
        }
        1xG r0 = (1xG) 1Bi.A03(66259);
        11T.A0F(r0, 0);
        this.A05 = r0;
        9gD r02 = new 9gD(7zM.A0C(this, 68830), A1b());
        this.A04 = r02;
        boolean z = this.A08;
        C95y c95y2 = this.A03;
        boolean A1P = AnonymousClass001.A1P(this.mFragmentManager.A0U());
        11T.A0F(c95y2, 1);
        r02.A01 = z;
        r02.A00 = A1P;
        7zP.A0O(r02.A06).A01(r02.A03, c95y2);
        String str = "";
        if (bundle != null && (string = bundle.getString("SELECTED_OPTION", str)) != null) {
            str = string;
        }
        C95y[] values3 = C95y.values();
        int length3 = values3.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                break;
            }
            C95y c95y3 = values3[i3];
            if (11T.A0O(c95y3.name(), str)) {
                9gD r03 = this.A04;
                if (r03 != null) {
                    7zP.A0O(r03.A06).A01(r03.A03, c95y3);
                }
            } else {
                i3++;
            }
        }
        9gD r04 = this.A04;
        if (r04 != null) {
            C9qq.A00(this, r04.A02, 34);
            9gD r05 = this.A04;
            if (r05 != null) {
                C9qq.A00(this, r05.A03, 35);
                this.A02 = new GoogleDriveViewData(requireContext(), BaseFragment.A06(this, 147583), C96z.A05, 0S2.A01);
                this.A01 = (GoogleAuthController) 1Bn.A0A(68867);
                this.A00 = (C9i0) 7zO.A0l(this, 68871);
                return;
            }
        }
        11T.A0L("viewData");
        throw 0Q8.createAndThrow();
    }

    @Override // X.GF6
    public boolean Bkd() {
        9gD r0 = this.A04;
        if (r0 == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        7zU.A0P(r0.A07).A08("SETUP_ADVANCED_SETUP_CANCEL_CLICK");
        if (r0.A00) {
            return false;
        }
        7zU.A0P(r0.A07).A06("back btn pressed");
        return false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        9gD r0 = this.A04;
        if (r0 == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        bundle.putString("SELECTED_OPTION", r0.A03.getValue().toString());
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        11T.A0F(view, 0);
        9gD r0 = this.A04;
        if (r0 == null) {
            str = "viewData";
        } else {
            7zU.A0P(r0.A07).A08("SETUP_ADVANCED_SETUP_SCREEN_IMPRESSION");
            7zU.A0P(r0.A07).A09("AdvancedFragment");
            super.onViewCreated(view, bundle);
            this.A07 = 7zO.A16(getViewLifecycleOwner());
            this.A06 = 2Zy.A00(getViewLifecycleOwner(), 2Zo.A00());
            GoogleAuthController googleAuthController = this.A01;
            if (googleAuthController == null) {
                str = "googleAuthController";
            } else {
                FragmentActivity requireActivity = requireActivity();
                Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
                GoogleDriveViewData googleDriveViewData = this.A02;
                str = "googleDriveViewData";
                if (googleDriveViewData != null) {
                    9IO r02 = (9IO) googleDriveViewData.A0M.getValue();
                    2aI r03 = this.A06;
                    if (r03 == null) {
                        str = "viewBoundBackgroundScope";
                    } else {
                        googleAuthController.A0B(requireActivity, lifecycle, r02, "AdvancedFragment", r03);
                        GoogleDriveViewData googleDriveViewData2 = this.A02;
                        if (googleDriveViewData2 != null) {
                            7zT.A1C(this, new AJW(this, null, 46), googleDriveViewData2.A0O);
                            GoogleDriveViewData googleDriveViewData3 = this.A02;
                            if (googleDriveViewData3 != null) {
                                C9qq.A00(this, googleDriveViewData3.A05, 36);
                                return;
                            }
                        }
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
