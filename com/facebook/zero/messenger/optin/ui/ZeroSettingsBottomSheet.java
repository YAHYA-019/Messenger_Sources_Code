package com.facebook.zero.messenger.optin.ui;

import X.0FI;
import X.11T;
import X.1Br;
import X.1Bu;
import X.7zM;
import X.7zN;
import X.7zT;
import X.9De;
import X.C37s;
import X.EY6;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;

/* loaded from: ZeroSettingsBottomSheet.class */
public final class ZeroSettingsBottomSheet extends BaseMigBottomSheetDialogFragment {
    public static final EY6 A08 = new Object();
    public int A00;
    public FbUserSession A01;
    public String A02;
    public String A04;
    public final 1Br A05 = 1Bu.A00(98477);
    public final 1Br A06 = 7zN.A0I(this);
    public final 1Br A07 = 7zM.A0S();
    public String A03 = "";

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public View A1C() {
        Context context = getContext();
        Object systemService = context != null ? context.getSystemService("layout_inflater") : null;
        11T.A0I(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View inflate = ((LayoutInflater) systemService).inflate(2132543620, (ViewGroup) null);
        11T.A0A(inflate);
        return inflate;
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(75);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(643678612);
        super.onCreate(bundle);
        this.A01 = 7zT.A08(this);
        if (bundle == null) {
            bundle = requireArguments();
        }
        this.A02 = bundle.getString("ARG_CARRIER_NAME");
        this.A04 = bundle.getString("ARG_OPTOUT_FLOW");
        this.A03 = bundle.getString("ARG_FEATURE_KEY");
        this.A00 = bundle.getInt("ARG_INSTANCE_KEY");
        0FI.A08(-2043117656, A02);
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        String str = this.A02;
        if (str != null) {
            bundle.putString("ARG_CARRIER_NAME", str);
        }
        String str2 = this.A04;
        if (str2 != null) {
            bundle.putString("ARG_OPTOUT_FLOW", str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0303, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0357  */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.zero.messenger.optin.ui.ZeroSettingsBottomSheet.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
