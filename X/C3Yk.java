package X;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.common.util.TriState;

/* renamed from: X.3Yk, reason: invalid class name */
/* loaded from: 3Yk.class */
public final class C3Yk implements 5Je {
    public static final Uri A08 = C0A2.A03("content://com.android.launcher3.cornermark.unreadbadge");
    public Context A00;
    public 1BY A01;
    public String A02;
    public boolean A03;
    public final C00i A04;
    public final C00i A05 = 1BQ.A01();
    public final C00i A06 = 1BQ.A02(100169);
    public final String A07;

    public C3Yk(1BO r302) {
        Context context = (Context) 1Bn.A0B(83719);
        this.A00 = context;
        this.A04 = new 1HH(context, 100181);
        this.A03 = true;
        this.A01 = new 1BY(r302);
        this.A07 = ((Context) 1Bn.A0B(83719)).getPackageName();
    }

    public static final C3Yk A00(1BO r301) {
        return new C3Yk(r301);
    }

    public String AWg() {
        return "ZteLauncherBadgesInterface";
    }

    public TriState CmD(int i) {
        Intent launchIntentForPackage;
        ComponentName component;
        boolean z = this.A03;
        boolean z2 = true;
        if (z) {
            if (this.A02 == null && (launchIntentForPackage = ((PackageManager) this.A06.get()).getLaunchIntentForPackage(this.A07)) != null && (component = launchIntentForPackage.getComponent()) != null) {
                this.A02 = component.flattenToString();
            }
            z = AnonymousClass001.A1T(this.A02);
            this.A03 = z;
        }
        if (!z) {
            return TriState.NO;
        }
        Bundle A05 = 1BK.A05();
        A05.putInt("app_badge_count", i);
        A05.putString("app_badge_component_name", this.A02);
        try {
            if (((ContentResolver) this.A04.get()).call(A08, "setAppUnreadCount", (String) null, A05) == null) {
                z2 = false;
            }
            return TriState.valueOf(z2);
        } catch (Exception e) {
            1BK.A09(this.A05).softReport("zte_badging", "An error occurred while trying to set the badge count.", e);
            this.A03 = false;
            return TriState.NO;
        }
    }
}
