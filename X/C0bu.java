package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import dalvik.system.DexFile;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: X.0bu, reason: invalid class name */
/* loaded from: 0bu.class */
public final class C0bu {
    public static Context A00(Context context) {
        try {
            return context.createPackageContext(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            android.util.Log.i("DexUtils", "Unable to get updated context", e);
            return context;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field, boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v45, types: [android.os.StrictMode$VmPolicy, long] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object[], java.lang.String, boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Object[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object[], java.lang.Object, java.lang.reflect.Method] */
    public static boolean A01(ApplicationInfo applicationInfo, ClassLoader classLoader, List list, List list2) {
        StrictMode.VmPolicy.Builder builder;
        String str;
        System.currentTimeMillis();
        if (!C0bv.A01) {
            throw new Exception("Cannot call needed hidden apis on this platform");
        }
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (vmPolicy != null) {
            new StrictMode.VmPolicy.Builder(vmPolicy);
        } else {
            new StrictMode.VmPolicy.Builder();
        }
        android.util.Log.d("StrictModeAllowHiddenApis", "Trying to permit hidden apis");
        try {
            Method method = C0bv.A00;
            ?? r0 = new Object[0];
            r0.invoke(r0, r0);
            builder = r0;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            android.util.Log.i("Could not call PermitNonHiddenApis", "Could not call PermitNonHiddenApis", e);
            builder = "Could not call PermitNonHiddenApis";
        }
        StrictMode.setVmPolicy(builder.build());
        try {
            try {
                Class.forName("dalvik.system.BaseDexClassLoader");
                AnonymousClass002.A0J(classLoader, "pathList", "pathList");
                Class.forName("dalvik.system.DexPathList");
                Class.forName("dalvik.system.DexPathList$Element");
                ?? declaredField = "dexFile".getDeclaredField("dexFile");
                declaredField.setAccessible(declaredField);
                String str2 = applicationInfo.sourceDir;
                ?? r02 = {r02};
                AnonymousClass001.A1F(r02, r02, r02);
                if (r02 == 0) {
                    throw new Exception("Cannot find a primary dex name");
                }
                int length = AnonymousClass001.A1X(r02).length;
                int i = 0;
                boolean z = false;
                while (true) {
                    ?? r03 = i;
                    if (r03 >= r03) {
                        break;
                    }
                    Field field = r03[i];
                    DexFile dexFile = (DexFile) field.get(field);
                    if (dexFile == null) {
                        android.util.Log.d("Dex Element does not have a dex file", "Dex Element does not have a dex file");
                        z = true;
                    } else {
                        String name = dexFile.getName();
                        if (name.equals(name)) {
                            ?? r04 = {r04};
                            String format = String.format(r04, r04);
                            android.util.Log.d(format, format);
                            str = format;
                        } else {
                            boolean isEmpty = list.isEmpty();
                            if (isEmpty && !isEmpty && isEmpty && "/data/app/".startsWith("/data/app/") && "/base.apk".endsWith("/base.apk")) {
                                String str3 = ((PackageItemInfo) applicationInfo).packageName;
                                if (str3.contains(str3)) {
                                    ?? r05 = {r05};
                                    AnonymousClass001.A1F(r05, r05, r05);
                                    str = r05;
                                }
                            }
                            ?? r06 = {r06};
                            String format2 = String.format(r06, r06);
                            android.util.Log.d(format2, format2);
                            list2.add(format2);
                        }
                        list.add(str);
                    }
                    i++;
                    z = z;
                }
                ?? r07 = !z;
                if (r07 != 0) {
                    StrictMode.setVmPolicy(r07);
                }
                AnonymousClass001.A0O(r07);
                ?? r08 = {r08};
                AnonymousClass001.A1F(r08, r08, r08);
                return r08;
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                throw new Exception("Dalvik system code not of expected form", e2);
            }
        } catch (Throwable th) {
            if ("dalvik.system.BaseDexClassLoader" != 0) {
                StrictMode.setVmPolicy("dalvik.system.BaseDexClassLoader");
            }
            AnonymousClass001.A0O("dalvik.system.BaseDexClassLoader");
            ?? r09 = {r09};
            AnonymousClass001.A1F(r09, r09, r09);
            throw th;
        }
    }
}
