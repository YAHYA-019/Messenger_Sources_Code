package X;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.08b, reason: invalid class name */
/* loaded from: 08b.class */
public abstract class C08b {
    public final 08Z A00;
    public final C0w6 A01;
    public final Integer A02;

    public C08b(08Z r302, C0w6 c0w6) {
        this(r302, c0w6, 0S2.A01);
    }

    public C08b(08Z r302, C0w6 c0w6, Integer num) {
        this.A00 = r302;
        this.A01 = c0w6;
        this.A02 = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Intent A01(List list) {
        Intent[] intentArr = new Intent[AnonymousClass001.A04(list)];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= AnonymousClass001.A04(list)) {
                Intent createChooser = Intent.createChooser((Intent) list.get(0), "Choose an app to launch.");
                createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
                return createChooser;
            }
            int i3 = i2 + 1;
            intentArr[i2] = list.get(i3);
            i = i3;
        }
    }

    public static String A02(Intent intent) {
        if (intent == null) {
            return "null";
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("intent(");
        A0k.append("action = ");
        A0k.append(intent.getAction());
        A0k.append(", data= ");
        A0k.append(intent.getData());
        A0k.append(", type= ");
        A0k.append(intent.getType());
        if (intent.getComponent() != null) {
            A0k.append(", component = ");
            A0k.append(intent.getComponent());
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            A0k.append(", extras = [");
            Iterator<String> it = extras.keySet().iterator();
            while (it.hasNext()) {
                String A0i = AnonymousClass001.A0i(it);
                A0k.append(A0i);
                A0k.append(" = ");
                A0k.append(extras.get(A0i));
                AnonymousClass001.A1H(A0k);
            }
            A0k.append("]");
        }
        return AnonymousClass001.A0d(")", A0k);
    }

    public static ArrayList A03(Intent intent, List list) {
        ArrayList A0t = AnonymousClass001.A0t(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PackageItemInfo packageItemInfo = (PackageItemInfo) it.next();
            Intent intent2 = new Intent(intent);
            intent2.setComponent(new ComponentName(packageItemInfo.packageName, packageItemInfo.name));
            intent2.setPackage(packageItemInfo.packageName);
            A0t.add(intent2);
        }
        return A0t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List] */
    public static List A04(Context context, Intent intent, int i) {
        ArrayList arrayList;
        List A02 = 0EB.A02(context, intent, i);
        if (A02 == null) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(1);
            Iterator it = A02.iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
                if (activityInfo != null && ((ComponentInfo) activityInfo).applicationInfo != null) {
                    arrayList.add(activityInfo);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.List] */
    public static List A05(Context context, Intent intent, int i) {
        ArrayList arrayList;
        11T.A0F(context, 0);
        11T.A0F(intent, 1);
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryIntentServices = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentServices(intent, PackageManager.ResolveInfoFlags.of(i)) : packageManager.queryIntentServices(intent, i);
        11T.A0D(queryIntentServices);
        if (queryIntentServices == null) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(1);
            Iterator<ResolveInfo> it = queryIntentServices.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null && ((ComponentInfo) serviceInfo).applicationInfo != null) {
                    arrayList.add(serviceInfo);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r304 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A06(android.content.Context r301, android.content.Intent r302) {
        /*
            r0 = r302
            android.content.ComponentName r0 = r0.getComponent()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L12
            r0 = r303
            java.lang.String r0 = r0.getPackageName()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L1d
        L12:
            r0 = r302
            java.lang.String r0 = r0.getPackage()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L1d
            r0 = 0
            return r0
        L1d:
            r0 = r301
            if (r0 == 0) goto L2c
            r0 = r301
            java.lang.String r0 = r0.getPackageName()
            r303 = r0
            r0 = r304
            r1 = r303
            boolean r0 = r0.equals(r1)
            return r0
        L2c:
            java.lang.String r0 = "context is null, did your Fragment destroy activity already?"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0L(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08b.A06(android.content.Context, android.content.Intent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.util.List] */
    public ArrayList A09(Context context, Intent intent) {
        ArrayList A0s;
        ArrayList<C08h> A1E;
        String str = intent.getPackage();
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                str = packageName;
            }
        }
        try {
            if (TextUtils.isEmpty(str)) {
                11T.A0F(context, 0);
                PackageManager packageManager = context.getPackageManager();
                List<PackageInfo> installedPackages = Build.VERSION.SDK_INT >= 33 ? packageManager.getInstalledPackages(PackageManager.PackageInfoFlags.of(134217728L)) : packageManager.getInstalledPackages(134217728);
                11T.A0D(installedPackages);
                A1E = C1A3.A1E(installedPackages);
                for (PackageInfo packageInfo : installedPackages) {
                    11T.A0D(packageInfo);
                    A1E.add(new C08h(packageInfo));
                }
            } else {
                A1E = Collections.singletonList(0EB.A01(context, str, 64));
            }
            A0s = AnonymousClass001.A0t(A1E.size());
            for (C08h c08h : A1E) {
                if (A0J(context, c08h)) {
                    A0s.add(c08h);
                }
            }
        } catch (PackageManager.NameNotFoundException | RuntimeException e) {
            this.A01.Cg0("BaseIntentScope", "Error querying PackageManager.", e);
            A0s = AnonymousClass001.A0s();
        }
        ArrayList A0t = AnonymousClass001.A0t(A0s.size());
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            C08h c08h2 = (C08h) it.next();
            Intent intent2 = new Intent(intent);
            intent2.setPackage(c08h2.A02);
            A0t.add(intent2);
        }
        return A0t;
    }

    public List A0A(Context context, Intent intent) {
        return A05(context, intent, 268435456);
    }

    public boolean A0B() {
        Integer num;
        08Z r0 = this.A00;
        synchronized (r0) {
            num = r0.A00;
        }
        boolean z = false;
        if (num == 0S2.A0N) {
            z = true;
        }
        return z;
    }

    public boolean A0C() {
        Integer num;
        08Z r0 = this.A00;
        synchronized (r0) {
            num = r0.A00;
        }
        boolean z = false;
        if (num == 0S2.A00) {
            z = true;
        }
        return z;
    }

    public abstract Intent A0D(BroadcastReceiver broadcastReceiver, Context context, Intent intent, String str);

    public abstract Intent A0E(Context context, Intent intent, String str);

    public abstract Intent A0F(Context context, Intent intent, String str);

    public abstract Integer A0G();

    public abstract List A0H(Context context, Intent intent, String str);

    public abstract boolean A0I();

    public abstract boolean A0J(Context context, C08h c08h);
}
