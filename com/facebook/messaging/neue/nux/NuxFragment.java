package com.facebook.messaging.neue.nux;

import X.0Pz;
import X.0S2;
import X.1BK;
import X.1BL;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1GD;
import X.1pI;
import X.4BM;
import X.53S;
import X.6HM;
import X.7zO;
import X.9rR;
import X.AbJ;
import X.AnonymousClass001;
import X.B3Z;
import X.C00i;
import X.C09864rq;
import X.CfG;
import X.DKD;
import X.DKE;
import X.DKY;
import X.DLQ;
import X.DeF;
import X.EOn;
import X.EP2;
import X.EU9;
import X.Eag;
import X.EcL;
import X.EnJ;
import X.EnZ;
import X.Ena;
import X.Erh;
import X.Etv;
import X.EwP;
import X.F9G;
import X.FAJ;
import X.FFh;
import X.FFt;
import X.FHf;
import X.FJE;
import X.FZt;
import X.FxJ;
import X.GKg;
import X.JgM;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import com.facebook.base.fragment.AbstractNavigableFragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.contacts.upload.ContactsUploadRunner;
import com.facebook.messaging.analytics.navigation.NavigationLogs;
import com.facebook.messaging.neue.nux.messenger.NeuNuxLoggedInPasswordResetFragment;
import com.facebook.messaging.neue.nux.messenger.NeueNuxCaaLoginSaveCredentialsFragment;
import com.facebook.messaging.neue.nux.messenger.NeueNuxContactImportFragment;
import com.facebook.messaging.neue.nux.messenger.NeueNuxDeactivationsFragment;
import com.facebook.messaging.neue.nux.phoneconfirmation.ConfirmPhoneFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.collect.ImmutableMap;
import com.meta.foa.cds.CdsOpenScreenDismissCallback;
import java.util.HashMap;

/* loaded from: NuxFragment.class */
public abstract class NuxFragment extends AbstractNavigableFragment {
    public FAJ A00;
    public FFh A01;
    public FJE A02;

    /* JADX WARN: Multi-variable type inference failed */
    public final void A1S(Bundle bundle) {
        this.A01 = (FFh) 1Bi.A03(100123);
        this.A02 = (FJE) 7zO.A0m(this, 83178);
        this.A00 = (FAJ) 7zO.A0l(this, 100122);
        if (bundle == null) {
            FFh fFh = this.A01;
            fFh.A01.flowMarkPoint(fFh.A00, 0Pz.A0W("start_", A1b()));
        }
        A1c(bundle);
        ImmutableMap.Builder A0c = 1BK.A0c();
        A0c.put(OptSvcAnalyticsStore.LOGGING_KEY_STEP, A1b());
        FAJ.A00(this.A00, "nux_screen_opened", A0c.build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NavigationLogs A1a() {
        ImmutableMap.Builder A0c = 1BK.A0c();
        NavigationLogs navigationLogs = (NavigationLogs) this.mArguments.getParcelable("navigation_logs");
        if (navigationLogs != null) {
            A0c.putAll(navigationLogs.A00);
        }
        A0c.put("dest_module", A1b());
        return new NavigationLogs(A0c);
    }

    public String A1b() {
        return this instanceof NeuNuxLoggedInPasswordResetFragment ? "logged_in_password_reset" : this instanceof NeueNuxCaaLoginSaveCredentialsFragment ? "caa_login_save_credentials" : this instanceof NeueNuxContactImportFragment ? "contact_import" : this instanceof ConfirmPhoneFragment ? "confirm_phone" : this instanceof NeueNuxDeactivationsFragment ? "deactivations_info" : this instanceof NeueNuxLearnMoreFragment ? "learn_more" : "low_disk_space_warning_flow";
    }

    /* JADX WARN: Type inference failed for: r0v105, types: [com.facebook.messaging.neue.nux.messenger.NeueNuxContactImportFragment, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v145, types: [com.facebook.messaging.neue.nux.messenger.NeuNuxLoggedInPasswordResetFragment, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.facebook.messaging.neue.nux.NeueNuxLearnMoreFragment, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v31, types: [com.facebook.messaging.neue.nux.messenger.NeueNuxDeactivationsFragment, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v44, types: [androidx.fragment.app.Fragment, java.lang.Object, com.facebook.messaging.neue.nux.phoneconfirmation.ConfirmPhoneFragment] */
    public void A1c(Bundle bundle) {
        String str;
        if (this instanceof NeuNuxLoggedInPasswordResetFragment) {
            final ?? r0 = (NeuNuxLoggedInPasswordResetFragment) this;
            Context context = r0.getContext();
            context.getClass();
            EU9.A00(context);
            String A02 = DKE.A0R().A02();
            int Av9 = (int) 1Br.A07(((EcL) 1Bn.A0A(99783)).A00).Av9(1GD.A05, 18583773734113193L);
            FbSharedPreferences A0i = AbJ.A0i();
            String BD0 = A0i.BD0(Eag.A00);
            str = "";
            if (BD0 == null) {
                BD0 = str;
            }
            String BD02 = A0i.BD0(Eag.A01);
            str = BD02 != null ? BD02 : "";
            HashMap A0u = AnonymousClass001.A0u();
            A0u.put("is_open_through_router", "false");
            A0u.put("device_id", A02);
            A0u.put("offline_experiment_group", Integer.valueOf(Av9));
            A0u.put("event_request_id", BD0);
            A0u.put("waterfall_id", str);
            A0u.put("is_from_qp", AnonymousClass001.A0K());
            String A0y = DKD.A0y(A0u);
            HashMap A0u2 = AnonymousClass001.A0u();
            A0u2.put("server_params", A0y);
            new FFt(A0u2, AnonymousClass001.A0u(), "com.bloks.www.caa.ar.reset_password").A03(context, new FxJ((GKg) null, (1pI) null, (MigColorScheme) null, (FHf) null, (DLQ) null, (DLQ) null, DKY.A00(FZt.A0M, FZt.A0P, EOn.A04, EP2.A05, new CdsOpenScreenDismissCallback() { // from class: com.facebook.messaging.neue.nux.messenger.NeuNuxLoggedInPasswordResetFragment.1
                @Override // com.meta.foa.cds.CdsOpenScreenDismissCallback
                public void Bu1(int i) {
                    NeuNuxLoggedInPasswordResetFragment.this.A1e(null, null);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int i) {
                }
            }, 0S2.A0C, false, false), (Integer) null, (Integer) null, (String) null, 0, false));
            return;
        }
        if (this instanceof NeueNuxContactImportFragment) {
            ?? r02 = (NeueNuxContactImportFragment) this;
            r02.A00 = 1BL.A0G((Fragment) r02);
            r02.A02 = (ContactsUploadRunner) 1Bn.A0A(100052);
            r02.A05 = (FAJ) 7zO.A0l((Fragment) r02, 100122);
            r02.A01 = (EnJ) 1Bn.A0A(100051);
            r02.A03 = (C09864rq) 1Bn.A0A(82436);
            r02.A07 = (53S) 7zO.A0l((Fragment) r02, 49478);
            r02.A06 = (Ena) 7zO.A0l((Fragment) r02, 100049);
            9rR r03 = (9rR) 1Bi.A03(67850);
            r03.A00(CallerContext.A06(NeueNuxContactImportFragment.class), 2132345087);
            r03.A00(CallerContext.A06(NeueNuxContactImportFragment.class), 2132345086);
            return;
        }
        if (!(this instanceof ConfirmPhoneFragment)) {
            if (this instanceof NeueNuxDeactivationsFragment) {
                ?? r04 = (NeueNuxDeactivationsFragment) this;
                r04.A03 = (Erh) 1Bn.A0A(100055);
                r04.A04 = (FAJ) 7zO.A0l((Fragment) r04, 100122);
                r04.A05 = AbJ.A0i();
                return;
            }
            if (this instanceof NeueNuxLearnMoreFragment) {
                ?? r05 = (NeueNuxLearnMoreFragment) this;
                r05.A01 = (Etv) 7zO.A0l((Fragment) r05, 84020);
                r05.A02 = (FAJ) 7zO.A0l((Fragment) r05, 100122);
                r05.A04 = (FFh) 1Bi.A03(100123);
                return;
            }
            return;
        }
        ?? r06 = (ConfirmPhoneFragment) this;
        r06.A09 = (4BM) 1Bn.A0A(32957);
        r06.A03 = (Erh) 1Bn.A0A(100055);
        r06.A06 = (FAJ) 7zO.A0l((Fragment) r06, 100122);
        r06.A0A = (EwP) 7zO.A0l((Fragment) r06, 100095);
        r06.A02 = (InputMethodManager) 7zO.A0m((Fragment) r06, 100189);
        r06.A07 = (F9G) 7zO.A0l((Fragment) r06, 100135);
        r06.A05 = (B3Z) 1Bn.A0A(85244);
        r06.A0B = (6HM) 7zO.A0m((Fragment) r06, 50020);
        JgM A01 = JgM.A01(r06.getActivity().BDe(), "confirm_phone");
        r06.A04 = A01;
        DeF.A00(A01, (Object) r06, 5);
        A01.A1Q(new CfG(r06.getContext(), 2131962649));
        C00i c00i = r06.A0I;
        r06.A01 = bundle != null ? bundle.getLong("last_clock_time", 1BL.A08(c00i)) : 1BL.A08(c00i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1d(Bundle bundle, String str, String str2) {
        FFh fFh = this.A01;
        String A1b = A1b();
        fFh.A01.flowMarkPoint(fFh.A00, 0Pz.A0W("end_", A1b));
        ImmutableMap.Builder A0c = 1BK.A0c();
        A0c.put("source_module", A1b);
        if (str2 != null) {
            A0c.put("clickpoint", str2);
        }
        A1Y(this.A02.A0E(new EnZ(bundle, this, new NavigationLogs(A0c.build()), str)));
    }

    public void A1e(String str, String str2) {
        A1d(null, str, str2);
    }
}
