package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.common.util.TriState;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;

/* renamed from: X.6c9, reason: invalid class name */
/* loaded from: 6c9.class */
public final class C6c9 implements 5Je {
    public static final Uri A08 = C0A2.A03("content://com.transsion.hilauncher.unreadprovider");
    public static final Uri A09 = C0A2.A03("content://com.transsion.XOSLauncher.unreadprovider");
    public TriState A00;
    public 1BY A01;
    public final Context A02;
    public final String A07;
    public final C00i A05 = new 1BQ(16511);
    public final 5Jg A03 = (5Jg) 1Bn.A0E((Context) null, (1BY) null, 49684);
    public final String A06 = (String) 1Bn.A0E((Context) null, (1BY) null, 99960);
    public final C0et A04 = (C0et) 1Bi.A03(83604);

    public C6c9(1BO r302) {
        this.A01 = new 1BY(r302);
        Context context = (Context) 1Bn.A0E((Context) null, (1BY) null, 83719);
        this.A02 = context;
        this.A07 = context.getPackageName();
        this.A00 = TriState.UNSET;
    }

    public String AWg() {
        return "TranssionLauncherBadgesInterface";
    }

    public TriState CmD(int i) {
        C0et c0et;
        boolean z;
        TriState triState = this.A00;
        if (triState == TriState.UNSET) {
            5Jg r0 = this.A03;
            if (5Jg.A00(r0).getPackageName().equals("com.transsion.hilauncher") || 5Jg.A00(r0).getPackageName().equals("com.transsion.XOSLauncher")) {
                Context context = this.A02;
                PackageManager packageManager = context.getPackageManager();
                Intent intent = new Intent(AnonymousClass000.A00(44));
                intent.addCategory(DKB.A00(21));
                try {
                    PermissionInfo[] permissionInfoArr = context.getPackageManager().getPackageInfo(((PackageItemInfo) packageManager.resolveActivity(intent, 0).activityInfo).packageName, RequestDefragmentingOutputStream.BODY_BUFFER_SIZE).permissions;
                    if (permissionInfoArr != null) {
                        for (PermissionInfo permissionInfo : permissionInfoArr) {
                            if ("com.transsion.hilauncher.permission.CHANGE_BADGE".equals(((PackageItemInfo) permissionInfo).name) || "com.transsion.XOSLauncher.permission.CHANGE_BADGE".equals(((PackageItemInfo) permissionInfo).name)) {
                                break;
                            }
                        }
                    }
                    c0et = this.A04;
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (c0et == C0et.A0C || c0et == C0et.A0P) {
                    z = true;
                    triState = TriState.valueOf(z);
                    this.A00 = triState;
                }
            }
            z = false;
            triState = TriState.valueOf(z);
            this.A00 = triState;
        }
        TriState triState2 = TriState.NO;
        if (triState == triState2) {
            return triState2;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package", this.A07);
        bundle.putString("class", this.A06);
        bundle.putInt("badgenumber", i);
        try {
            5Jg r02 = this.A03;
            if (5Jg.A00(r02).getPackageName().equals("com.transsion.hilauncher")) {
                this.A02.getContentResolver().call(A08, "change_badge", (String) null, bundle);
            } else if (5Jg.A00(r02).getPackageName().equals("com.transsion.XOSLauncher")) {
                this.A02.getContentResolver().call(A09, "change_badge", (String) null, bundle);
            }
            return TriState.YES;
        } catch (IllegalArgumentException unused2) {
            this.A00 = triState2;
            return triState2;
        } catch (Exception e) {
            1BK.A09(this.A05).softReport("transsion_badging", "Failed to set app badge count.", e);
            this.A00 = triState2;
            return triState2;
        }
    }
}
