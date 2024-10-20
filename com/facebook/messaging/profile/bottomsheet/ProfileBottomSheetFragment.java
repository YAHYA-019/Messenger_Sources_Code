package com.facebook.messaging.profile.bottomsheet;

import X.0D2;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BM;
import X.1Bi;
import X.1Br;
import X.1F9;
import X.1HG;
import X.1Iw;
import X.1LI;
import X.1UG;
import X.1pI;
import X.2kW;
import X.2kY;
import X.4YU;
import X.6Fe;
import X.7zL;
import X.7zM;
import X.7zN;
import X.7zS;
import X.8Do;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbK;
import X.AnonymousClass001;
import X.B21;
import X.C00i;
import X.C0A8;
import X.C1rg;
import X.C2kV;
import X.C2ke;
import X.C2ki;
import X.C4s1;
import X.CAs;
import X.CIh;
import X.CZm;
import X.CoU;
import X.DJY;
import X.R19;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.profile.common.ProfileBottomSheetFragmentParams;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: ProfileBottomSheetFragment.class */
public final class ProfileBottomSheetFragment extends MigBottomSheetDialogFragment implements 6Fe {
    public FbUserSession A00;
    public 1pI A01;
    public ThreadSummary A02;
    public ProfileBottomSheetFragmentParams A03;
    public MigColorScheme A04;
    public boolean A05;
    public Bundle A06;
    public final 1Br A08 = 1HG.A01(this, 83091);
    public final 1Br A07 = AbG.A0Q();
    public final 1Br A0B = 1HG.A01(this, 50024);
    public final 1Br A0A = 1HG.A01(this, 68131);
    public final 1Br A09 = 7zM.A0R();
    public final DJY A0C = new CoU(this, 3);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        User A00;
        1F9 r309;
        ParcelableSecondaryData parcelableSecondaryData;
        String str;
        ThreadKey threadKey;
        11T.A0F(r302, 0);
        if (!this.A05) {
            return C1rg.A00(r302).A00;
        }
        Bundle requireArguments = requireArguments();
        if (this.A03 == null) {
            Parcelable parcelable = requireArguments.getParcelable("profile_fragment_params");
            if (parcelable == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            this.A03 = (ProfileBottomSheetFragmentParams) parcelable;
        }
        if (this.A02 == null) {
            this.A02 = AbF.A0h(requireArguments, "profile_ts_data_model_params");
        }
        if (this.A06 == null) {
            this.A06 = 1BK.A05();
        }
        ProfileBottomSheetFragmentParams profileBottomSheetFragmentParams = this.A03;
        ParcelableSecondaryData parcelableSecondaryData2 = null;
        if (profileBottomSheetFragmentParams == null || (A00 = profileBottomSheetFragmentParams.A00()) == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        ThreadSummary threadSummary = this.A02;
        Long A14 = (threadSummary == null || (threadKey = threadSummary.A0n) == null) ? null : AbF.A14(threadKey);
        long A002 = CAs.A00(profileBottomSheetFragmentParams.A00, threadSummary, profileBottomSheetFragmentParams.A01);
        ProfileBottomSheetFragmentParams profileBottomSheetFragmentParams2 = this.A03;
        if (profileBottomSheetFragmentParams2 != null) {
            r309 = profileBottomSheetFragmentParams2.A00;
            parcelableSecondaryData = profileBottomSheetFragmentParams2.A01;
        } else {
            r309 = null;
            parcelableSecondaryData = null;
        }
        Long A01 = CAs.A01(r309, this.A02, parcelableSecondaryData);
        C00i c00i = this.A08.A00;
        CIh cIh = (CIh) c00i.get();
        String str2 = A00.A13;
        ProfileBottomSheetFragmentParams profileBottomSheetFragmentParams3 = this.A03;
        cIh.A02(A14, Long.valueOf(A002), A01, str2, profileBottomSheetFragmentParams3 != null ? profileBottomSheetFragmentParams3.A02 : null);
        CIh cIh2 = (CIh) c00i.get();
        1UG A08 = 1BK.A08(1Br.A02(cIh2.A06), 1BJ.A00(1805));
        String str3 = cIh2.A03;
        if (str3 != null && cIh2.A04 != null && A08.isSampled()) {
            4YU.A1I(A08, "entry_point", CIh.A00(str3));
            String str4 = cIh2.A05;
            if (str4 == null) {
                str = "sessionId";
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            }
            AbF.A1N(A08, str4);
            String str5 = cIh2.A04;
            if (str5 != null) {
                A08.A6H("target_profile_id", 1BK.A0n(str5));
                long j = 0;
                A08.A6H("thread_id", Long.valueOf(7zS.A08(cIh2.A02)));
                A08.A6H("community_id", Long.valueOf(7zS.A08(cIh2.A00)));
                Long l = cIh2.A01;
                if (l != null) {
                    j = l.longValue();
                }
                A08.A6H("group_id", Long.valueOf(j));
                A08.BZL();
            }
        }
        this.A04 = 7zS.A0j(this);
        2kW r0 = new 2kW();
        r0.A01 = 1;
        r0.A07 = new 2kY().A00();
        C2ke A003 = r0.A00();
        AbH.A07(this).A1O(new CZm(this, 11), getViewLifecycleOwner(), "request_key_cancel_friend_request_click");
        AbH.A07(this).A1O(new CZm(this, 10), getViewLifecycleOwner(), "request_key_accept_friend_request_click");
        C2ki A004 = C2kV.A00(r302);
        7zL.A1K(r302);
        B21 b21 = new B21();
        str = "fbUserSession";
        FbUserSession fbUserSession = this.A00;
        if (fbUserSession != null) {
            b21.A03 = fbUserSession;
            b21.A0C = str2;
            b21.A01 = getParentFragmentManager();
            b21.A04 = this.A01;
            b21.A06 = this.A02;
            b21.A0A = A00;
            MigColorScheme migColorScheme = this.A04;
            if (migColorScheme == null) {
                11T.A0L("colorScheme");
                throw 0Q8.createAndThrow();
            }
            b21.A09 = migColorScheme;
            b21.A08 = this.A0C;
            b21.A00 = this.A06;
            ProfileBottomSheetFragmentParams profileBottomSheetFragmentParams4 = this.A03;
            b21.A05 = profileBottomSheetFragmentParams4 != null ? profileBottomSheetFragmentParams4.A00 : null;
            if (profileBottomSheetFragmentParams4 != null) {
                parcelableSecondaryData2 = profileBottomSheetFragmentParams4.A01;
            }
            b21.A0B = parcelableSecondaryData2;
            b21.A0D = AbK.A0o(this.A07).AZk(36319055204070984L);
            b21.A02 = this;
            b21.A07 = this;
            A004.A2d(b21);
            A004.A1L((int) Math.floor(((C4s1) 1Bi.A03(49322)).A06() * 0.95d));
            A004.A0T();
            A004.A2h(true);
            A004.A0z(C0A8.A01(requireContext(), ((C4s1) 1Bi.A03(49322)).A08()));
            A004.A2f(A003);
            A004.A1O((int) Math.floor(((C4s1) 1Bi.A03(49322)).A06() * 0.95d));
            A004.A2Z(new 8Do(this));
            return A004.A2W();
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void BhH() {
        Dialog dialog;
        Window window;
        View decorView;
        Context context = getContext();
        if (context == null || (dialog = ((0D2) this).A01) == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        MigColorScheme migColorScheme = this.A04;
        if (migColorScheme == null) {
            11T.A0L("colorScheme");
            throw 0Q8.createAndThrow();
        }
        R19.A00(context, decorView, migColorScheme, 7zN.A0s(this, 2131954993));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Bmw() {
        Dialog dialog;
        Window window;
        View decorView;
        Context context = getContext();
        if (context == null || (dialog = ((0D2) this).A01) == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        MigColorScheme migColorScheme = this.A04;
        if (migColorScheme == null) {
            11T.A0L("colorScheme");
            throw 0Q8.createAndThrow();
        }
        R19.A00(context, decorView, migColorScheme, 7zN.A0s(this, 2131954987));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Bzt() {
        Dialog dialog;
        Window window;
        View decorView;
        Context context = getContext();
        if (context == null || (dialog = ((0D2) this).A01) == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        MigColorScheme migColorScheme = this.A04;
        if (migColorScheme == null) {
            11T.A0L("colorScheme");
            throw 0Q8.createAndThrow();
        }
        R19.A00(context, decorView, migColorScheme, 7zN.A0s(this, 2131954994));
        ((CIh) 1Br.A0B(this.A08)).A03("ADD_FRIEND");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1828012238);
        super.onCreate(bundle);
        if (bundle != null) {
            this.A05 = true;
            this.A02 = AbF.A0h(bundle, "profile_ts_data_model_params");
            this.A03 = (ProfileBottomSheetFragmentParams) bundle.getParcelable("profile_fragment_params");
            this.A06 = (Bundle) bundle.getParcelable("profile_bundle");
        }
        this.A00 = 1BM.A01(this);
        0FI.A08(341918594, A02);
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("profile_fragment_params", this.A03);
        bundle.putParcelable("profile_ts_data_model_params", this.A02);
        bundle.putParcelable("profile_bundle", this.A06);
    }
}
