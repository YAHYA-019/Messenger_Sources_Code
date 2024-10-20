package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;

/* renamed from: X.0ez, reason: invalid class name */
/* loaded from: 0ez.class */
public final class C0ez extends DL7 {
    public 0gZ A00 = (0gZ) 1Bi.A03(49);
    public final C01s A01;
    public final C08b A02;
    public final C08b A03;

    public C0ez() {
        2yD r0 = (2yD) 1Bi.A03(16385);
        C01s c01s = (C01s) 1Bi.A03(16511);
        this.A01 = c01s;
        08Z A00 = 08Z.A00(r0.Auy(36592709045584829L));
        AnonymousClass488 anonymousClass488 = new AnonymousClass488(c01s, "DefaultInternalIntentHandler");
        this.A03 = new C08b(A00, anonymousClass488, 0S2.A01);
        this.A02 = new C08b(A00, anonymousClass488);
    }

    public static final C0ez A00() {
        return new C0ez();
    }

    private C08b A01(Context context, Intent intent) {
        String packageName = context.getPackageName();
        ComponentName component = intent.getComponent();
        return (packageName == null || component == null || !packageName.equals(component.getPackageName())) ? this.A03 : this.A02;
    }

    public boolean A09(Activity activity, Intent intent, int i) {
        Intent A0E = A01(activity, intent).A0E(activity, intent, null);
        if (A0E == null) {
            return false;
        }
        activity.startActivityForResult(A0E, i);
        this.A00.A04(A0E, activity);
        return true;
    }

    public boolean A0A(Context context, Intent intent) {
        try {
            Intent A0E = A01(context, intent).A0E(context, intent, null);
            if (A0E == null) {
                return false;
            }
            context.startActivity(A0E);
            this.A00.A04(A0E, context);
            return true;
        } catch (Exception e) {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(intent.getComponent());
            android.util.Log.w("DefaultIntentHandler", String.format("Exception while trying to start activity[%s] componentState[%s]. error[%s]", intent.getComponent().getClassName(), componentEnabledSetting != 0 ? componentEnabledSetting != 1 ? componentEnabledSetting != 2 ? componentEnabledSetting != 3 ? componentEnabledSetting != 4 ? "NA" : "DISABLED_UNTIL_USED" : "DISABLED_USER" : "DISABLED" : "ENABLED" : "DEFAULT", e.getMessage()));
            throw e;
        }
    }

    public boolean A0B(Intent intent, Fragment fragment, int i) {
        Intent A0E = A01(fragment.getContext(), intent).A0E(fragment.getContext(), intent, null);
        if (A0E == null) {
            return false;
        }
        fragment.startActivityForResult(A0E, i);
        this.A00.A04(A0E, fragment.getContext());
        return true;
    }
}
