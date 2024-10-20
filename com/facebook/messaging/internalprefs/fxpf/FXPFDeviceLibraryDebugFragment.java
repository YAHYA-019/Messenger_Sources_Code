package com.facebook.messaging.internalprefs.fxpf;

import X.0Pz;
import X.11T;
import X.1Bq;
import X.1Br;
import X.2OB;
import X.AnonymousClass001;
import X.C67Z;
import X.DKH;
import X.EMS;
import X.EW9;
import X.FXr;
import X.SE5;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.resources.ui.FbLinearLayout;
import java.util.ArrayList;
import libraries.access.src.main.base.common.FXAccessLibraryDeviceRequest;
import libraries.access.src.main.base.common.FXAccessLibraryDeviceRequestItem;

/* loaded from: FXPFDeviceLibraryDebugFragment.class */
public final class FXPFDeviceLibraryDebugFragment extends FbFragmentActivity {
    public final FXPFDeviceLibraryDebugFragment A01 = this;
    public final LinearLayout.LayoutParams A02 = new LinearLayout.LayoutParams(-1, -2);
    public final LinearLayout.LayoutParams A00 = new LinearLayout.LayoutParams(-2, -2);

    /* JADX WARN: Code restructure failed: missing block: B:9:0x00c7, code lost:
    
        if (r311 == null) goto L11;
     */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.LinearLayout, com.facebook.resources.ui.FbLinearLayout, android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.facebook.resources.ui.FbLinearLayout A12(com.facebook.messaging.internalprefs.fxpf.FXPFDeviceLibraryDebugFragment r301, java.lang.String r302, java.util.List r303) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.internalprefs.fxpf.FXPFDeviceLibraryDebugFragment.A12(com.facebook.messaging.internalprefs.fxpf.FXPFDeviceLibraryDebugFragment, java.lang.String, java.util.List):com.facebook.resources.ui.FbLinearLayout");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout, com.facebook.resources.ui.FbLinearLayout, android.view.View, android.view.ViewGroup] */
    private final FbLinearLayout A15(String str, String str2) {
        FXPFDeviceLibraryDebugFragment fXPFDeviceLibraryDebugFragment = this.A01;
        11T.A0I(fXPFDeviceLibraryDebugFragment, "null cannot be cast to non-null type android.content.Context");
        ?? linearLayout = new LinearLayout(fXPFDeviceLibraryDebugFragment);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(this.A02);
        String A0J = 0Pz.A0J(str, ':');
        LinearLayout.LayoutParams layoutParams = this.A00;
        2OB A0Z = DKH.A0Z(fXPFDeviceLibraryDebugFragment, layoutParams, A0J);
        A0Z.setTypeface(null, 1);
        linearLayout.addView(A0Z);
        linearLayout.addView(DKH.A0Z(fXPFDeviceLibraryDebugFragment, layoutParams, str2));
        return linearLayout;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        Toolbar A0E = DKH.A0E(this, 2132542066);
        A0E.A0T(getTitle().toString());
        FXr.A04(A0E, this, 87);
        this.A02.setMargins(32, 8, 4, 8);
        this.A00.setMargins(16, 0, 4, 0);
        1Br A00 = 1Bq.A00(33032);
        1Br A002 = 1Bq.A00(100141);
        ArrayList A0s = AnonymousClass001.A0s();
        C67Z c67z = C67Z.FACEBOOK;
        EMS ems = EMS.A01;
        A0s.add(new FXAccessLibraryDeviceRequestItem(c67z, ems));
        EMS ems2 = EMS.A02;
        A0s.add(new FXAccessLibraryDeviceRequestItem(c67z, ems2));
        ArrayList A003 = EW9.A00(this, A002, A00, "device_library_test_caller", "FXPFDeviceLibraryDebugFragment", new FXAccessLibraryDeviceRequest(A0s));
        1Br A004 = 1Bq.A00(33032);
        1Br A005 = 1Bq.A00(100141);
        ArrayList A0s2 = AnonymousClass001.A0s();
        C67Z c67z2 = C67Z.MESSENGER;
        A0s2.add(new FXAccessLibraryDeviceRequestItem(c67z2, ems));
        A0s2.add(new FXAccessLibraryDeviceRequestItem(c67z2, ems2));
        ArrayList A006 = EW9.A00(this, A005, A004, "device_library_test_caller", "FXPFDeviceLibraryDebugFragment", new FXAccessLibraryDeviceRequest(A0s2));
        1Br A007 = 1Bq.A00(33032);
        1Br A008 = 1Bq.A00(100141);
        ArrayList A0s3 = AnonymousClass001.A0s();
        C67Z c67z3 = C67Z.INSTAGRAM;
        A0s3.add(new FXAccessLibraryDeviceRequestItem(c67z3, ems));
        A0s3.add(new FXAccessLibraryDeviceRequestItem(c67z3, ems2));
        runOnUiThread(new SE5(this, A006, A003, EW9.A00(this, A008, A007, "device_library_test_caller", "FXPFDeviceLibraryDebugFragment", new FXAccessLibraryDeviceRequest(A0s3))));
    }
}
