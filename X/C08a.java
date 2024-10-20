package X;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.08a, reason: invalid class name */
/* loaded from: 08a.class */
public final class C08a extends C08b {
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.Comparator] */
    private Intent A00(Context context, Intent intent, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ComponentInfo componentInfo = (ComponentInfo) it.next();
            ApplicationInfo applicationInfo = componentInfo.applicationInfo;
            if (applicationInfo != null) {
                String str = ((PackageItemInfo) applicationInfo).packageName;
                if (!str.equals(context.getPackageName())) {
                    if (A0C()) {
                        this.A01.Cg0("InternalIntentScope", 0Pz.A0W("Detected different package name component but fail open: ", str), null);
                    }
                }
                arrayList.add(componentInfo);
            }
        }
        if (arrayList.isEmpty()) {
            this.A01.Cg0("InternalIntentScope", "No matching internal components", null);
            return null;
        }
        Collections.sort(arrayList, new Object());
        PackageItemInfo packageItemInfo = (PackageItemInfo) arrayList.get(0);
        intent.setComponent(new ComponentName(packageItemInfo.packageName, packageItemInfo.name));
        return intent;
    }

    @Override // X.C08b
    public Intent A0D(BroadcastReceiver broadcastReceiver, Context context, Intent intent, String str) {
        0EY A00 = C08g.A00(context, intent);
        if (A00 == null) {
            A00 = 0EX.A00(broadcastReceiver, context);
        }
        String A04 = A00 != null ? A00.A04() : null;
        String packageName = context.getPackageName();
        if (!packageName.equals(A04)) {
            String A0v = 0Pz.A0v("Access denied. ", packageName, " cannot receive broadcasts from ", A00 != null ? A00.toString() : "null");
            boolean A0C = A0C();
            C0w6 c0w6 = this.A01;
            if (!A0C) {
                c0w6.Cg0("InternalIntentScope", A0v, new SecurityException(A0v));
                return null;
            }
            c0w6.Cg0("InternalIntentScope", 0Pz.A0W("Fail-open: ", A0v), null);
        }
        return intent;
    }

    @Override // X.C08b
    public Intent A0E(Context context, Intent intent, String str) {
        C08g.A02(context, intent, this.A01, str);
        if (!C08b.A06(context, intent)) {
            intent = A00(context, intent, C08b.A04(context, intent, 65600));
        }
        return intent;
    }

    @Override // X.C08b
    public Intent A0F(Context context, Intent intent, String str) {
        C08g.A02(context, intent, this.A01, str);
        if (!C08b.A06(context, intent)) {
            intent = A00(context, intent, C08b.A05(context, intent, 65600));
        }
        return intent;
    }

    @Override // X.C08b
    public Integer A0G() {
        return 0S2.A00;
    }

    @Override // X.C08b
    public List A0H(Context context, Intent intent, String str) {
        C08g.A02(context, intent, this.A01, str);
        if (!C08b.A06(context, intent)) {
            intent.setPackage(context.getPackageName());
        }
        return Collections.singletonList(intent);
    }

    @Override // X.C08b
    public boolean A0I() {
        return true;
    }

    @Override // X.C08b
    public boolean A0J(Context context, C08h c08h) {
        throw AnonymousClass001.A0p();
    }
}
