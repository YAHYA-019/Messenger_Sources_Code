package com.facebook.mig.bottomsheet;

import X.0Pz;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1CE;
import X.1CJ;
import X.1Cg;
import X.1Iw;
import X.1LI;
import X.3TC;
import X.7kF;
import X.8aT;
import X.94S;
import X.9De;
import X.AnonymousClass001;
import X.C1944Ax9;
import X.C1u2;
import X.C37s;
import X.C7t7;
import X.C8Wm;
import X.DCw;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.adminonboarding.bottomsheet.AdminOnboardingBottomSheetFragment;
import com.facebook.messaging.dogfooding.data.DogfoodingAssistantDataModel;
import com.facebook.messaging.dogfooding.ui.bottomsheet.dialog.DogfoodingAssistantBottomSheetFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/* loaded from: MigBottomSheetDialogFragment.class */
public abstract class MigBottomSheetDialogFragment extends BaseMigBottomSheetDialogFragment {
    public static final 94S A01 = new 94S();
    public LithoView A00;

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(70);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [androidx.fragment.app.Fragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment, com.facebook.messaging.communitymessaging.adminonboarding.bottomsheet.AdminOnboardingBottomSheetFragment] */
    public 1LI A1K(1Iw r302) {
        String A00;
        BufferedReader bufferedReader;
        if (!(this instanceof DogfoodingAssistantBottomSheetFragment)) {
            if (this instanceof AdminOnboardingBottomSheetFragment) {
                ?? r0 = (AdminOnboardingBottomSheetFragment) this;
                return new C8Wm(r0.A09, r0.A1F(), (List) r0.requireArguments().getSerializable("ARG_ADMIN_TASK_LIST"));
            }
            11T.A0F(r302, 0);
            Bundle requireArguments = requireArguments();
            Uri uri = (Uri) requireArguments.getParcelable("arg_picture_uri");
            C1u2 c1u2 = (C1u2) 1Bi.A03(16839);
            Context context = r302.A0D;
            11T.A0A(context);
            MigColorScheme migColorScheme = (MigColorScheme) 1Bn.A0E(context, (1BY) null, 16979);
            String string = requireArguments.getString("arg_bottom_sheet_channel_name");
            if (string != null) {
                return new 8aT(uri, c1u2, migColorScheme, string, new DCw(this, 19));
            }
            throw 1BK.A0h();
        }
        Bundle bundle = ((Fragment) this).mArguments;
        DogfoodingAssistantDataModel dogfoodingAssistantDataModel = bundle != null ? (DogfoodingAssistantDataModel) bundle.getParcelable("dogfooding_data_model") : null;
        MigColorScheme A1F = A1F();
        1CE r02 = (1CE) 1Bi.A03(98728);
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(((Fragment) this).requireContext().getAssets().open(0Pz.A0j("params_map", "", OptSvcAnalyticsStore.FILE_SUFFIX))));
            } catch (IOException | RuntimeException e) {
                throw (e instanceof RuntimeException ? 1BK.A0s("ParamsMap currently only supports version 2", e) : 1BK.A0s("IOException encountered while reading asset", e));
            }
        } catch (IOException unused) {
            A00 = C7t7.A00();
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            boolean z = true;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    A00 = stringBuffer.toString();
                    bufferedReader.close();
                    break;
                }
                if (z) {
                    if (!readLine.startsWith("v2,")) {
                        throw AnonymousClass001.A0T("ParamsMap currently only supports version 2");
                    }
                    z = false;
                }
                stringBuffer.append(readLine);
                stringBuffer.append('\n');
            }
            11T.A0A(A00);
            1Cg A002 = 1Cg.A00(A00, 2);
            MobileConfigManagerHolderImpl A003 = 1CJ.A00(r02.AvS());
            return new C1944Ax9(dogfoodingAssistantDataModel, A1F, A003 != null ? 3TC.A00(A002, A003.mDataDirPath) : null);
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                7kF.A00(th, th2);
            }
            throw th;
        }
    }

    public final LithoView A1L() {
        LithoView lithoView = this.A00;
        if (lithoView != null) {
            return lithoView;
        }
        11T.A0L("lithoView");
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        A1G().A0G(A01);
        LithoView A1L = A1L();
        1Iw r0 = A1L().A09;
        11T.A0A(r0);
        A1L.A0y(A1K(r0));
    }
}
