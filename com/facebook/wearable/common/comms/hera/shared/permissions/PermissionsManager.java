package com.facebook.wearable.common.comms.hera.shared.permissions;

import X.0Em;
import X.0fH;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.4bQ;
import X.53T;
import X.AbG;
import X.AbK;
import X.AnonymousClass001;
import X.C06w;
import X.C06z;
import X.C2xd;
import X.C3o5;
import X.C5iw;
import X.DKB;
import X.GOm;
import X.JKS;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.os.Build;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.runtimepermissions.RequestPermissionsConfig;
import java.util.ArrayList;

/* loaded from: PermissionsManager.class */
public final class PermissionsManager {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(PermissionsManager.class, "activityRuntimePermissionsManagerProvider", "getActivityRuntimePermissionsManagerProvider()Lcom/facebook/runtimepermissions/ActivityRuntimePermissionsManagerProvider;", 0)};
    public final 1Br activityRuntimePermissionsManagerProvider$delegate = 1Bu.A00(306);
    public final JKS runTimePermissionsRequestListener = new JKS() { // from class: com.facebook.wearable.common.comms.hera.shared.permissions.PermissionsManager$runTimePermissionsRequestListener$1
        public void onPermissionsCheckCanceled() {
        }

        public void onPermissionsGranted() {
            0fH.A0j(PermissionsManagerKt.TAG, "all required permissions are granted");
        }

        public void onPermissionsNotGranted(String[] strArr, String[] strArr2) {
            0fH.A0k(PermissionsManagerKt.TAG, AnonymousClass001.A0Z(strArr, "permissions not granted ", AnonymousClass001.A0k()));
        }
    };

    private final C2xd getActivityRuntimePermissionsManagerProvider() {
        return (C2xd) 1Br.A0B(this.activityRuntimePermissionsManagerProvider$delegate);
    }

    private final String[] getBTCPermissions() {
        String A00;
        ArrayList A0s = AnonymousClass001.A0s();
        int i = Build.VERSION.SDK_INT;
        if (29 <= i) {
            if (i >= 31) {
                A00 = i < 10001 ? GOm.A00(193) : "android.permission.BLUETOOTH";
            }
            A0s.add(A00);
            if (i == 34) {
                A0s.add("android.permission.FOREGROUND_SERVICE_CONNECTED_DEVICE");
            }
        }
        return 1BK.A1b(A0s, 0);
    }

    private final boolean hasPermission(Context context, String str) {
        return AnonymousClass001.A1O(0Em.A00(context, str));
    }

    public final void maybeRequestRequiredPermission(FbUserSession fbUserSession, Context context) {
        11T.A0F(context, 1);
        String[] bTCPermissions = getBTCPermissions();
        ArrayList A0s = AnonymousClass001.A0s();
        for (String str : bTCPermissions) {
            if (!AnonymousClass001.A1O(0Em.A00(context, str))) {
                A0s.add(str);
            }
        }
        if (A0s.isEmpty()) {
            0fH.A0j(PermissionsManagerKt.TAG, "all required permissions are granted");
            return;
        }
        Activity A00 = 4bQ.A00(context);
        11T.A0I(A00, DKB.A00(473));
        53T A0M = getActivityRuntimePermissionsManagerProvider().A0M(A00);
        String A14 = AbK.A14(context.getResources(), 1BK.A0u(context.getApplicationContext(), ((PackageItemInfo) context.getApplicationContext().getApplicationInfo()).labelRes), 2131951988);
        C5iw c5iw = new C5iw();
        c5iw.A04 = A14;
        c5iw.A00(context.getResources().getString(2131951987));
        c5iw.A00 = AbG.A11();
        c5iw.A06 = true;
        RequestPermissionsConfig requestPermissionsConfig = new RequestPermissionsConfig(c5iw);
        0fH.A0j(PermissionsManagerKt.TAG, "Requesting permissions...");
        A0M.AHQ(requestPermissionsConfig, this.runTimePermissionsRequestListener, C3o5.A0n(A0s));
    }
}
