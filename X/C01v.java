package X;

import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.common.build.BuildConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/* renamed from: X.01v, reason: invalid class name */
/* loaded from: 01v.class */
public abstract class C01v {
    /* JADX WARN: Code restructure failed: missing block: B:117:0x03bb, code lost:
    
        if (r0.getBoolean("cmp_manager.persist_state", false) == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b0, code lost:
    
        if (r312 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x030a, code lost:
    
        if (r0.equals("enable-cold-pretos") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x031f, code lost:
    
        if (r0.equals("enable-warm-pretos") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0330, code lost:
    
        if (r0.equals("enable-normal") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0345, code lost:
    
        if (r0.equals("enable-after-login-urgent") == false) goto L108;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(android.content.Context r301, android.content.pm.PackageManager r302, java.lang.Integer[] r303, int r304) {
        /*
            Method dump skipped, instructions count: 1437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01v.A00(android.content.Context, android.content.pm.PackageManager, java.lang.Integer[], int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
    
        if (A01(r301, r302, r303, false) == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.pm.ComponentInfo A01(android.content.ComponentName r301, android.content.pm.PackageManager r302, int r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01v.A01(android.content.ComponentName, android.content.pm.PackageManager, int, boolean):android.content.pm.ComponentInfo");
    }

    public static File A02(Context context) {
        File A00 = 0eB.A00(context, 1436876361);
        A00.mkdirs();
        return new File(A00, "versions");
    }

    public static String A03(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? 0Pz.A0d("INVALID(", ")", i) : "DISABLED_UNTIL_USED" : "DISABLED_USER" : "DISABLED" : "ENABLED" : "DEFAULT";
    }

    public static String A04(int i) {
        return i != 1 ? i != 2 ? i != 4 ? i != 8 ? 0Pz.A0d("Unknown (type = ", ")", i) : "Provider" : "Service" : "Receiver" : "Activity";
    }

    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, com.facebook.appcomponentmanager.AppComponentManagerProfiledRun] */
    public static void A05(Context context, String str) {
        ArrayList A0s;
        ObjectInputStream objectInputStream;
        PackageManager packageManager = context.getPackageManager();
        0fH.A0j("AppComponentManager", "===============================================");
        0fH.A0d(3, context.getPackageName(), "AppComponentManager", "Setting enableStage to %d for pkg[%s]");
        0fH.A0j("AppComponentManager", "===============================================");
        long currentTimeMillis = System.currentTimeMillis();
        int A00 = A00(context, packageManager, new Integer[]{1, 2, 8, 4}, 4);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (A00 < 0) {
            throw AnonymousClass001.A0T(String.format("Failed to set enable stage %d for pkg[%s], can't resume. Duration[%s]", 3, context.getPackageName(), Long.valueOf(currentTimeMillis2 / 1000)));
        }
        File[] listFiles = A02(context).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        int A002 = BuildConstants.A00();
        File file2 = new File(A02(context), Integer.toString(BuildConstants.A00()));
        file2.getParentFile().mkdirs();
        try {
            new FileOutputStream(file2, false).close();
            if (A002 == 1) {
                try {
                    file2.setLastModified(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime);
                } catch (PackageManager.NameNotFoundException unused) {
                    throw AnonymousClass001.A0N("Can't get package info for this package.");
                }
            }
            ?? obj = new Object();
            obj.mTrigger = str;
            obj.mUpdatedComponents = A00;
            obj.mDurationInMilliseconds = currentTimeMillis2;
            String packageName = context.getPackageName();
            if (packageName.equals("com.facebook.wakizashi") || packageName.equals("com.facebook.katana")) {
                File A003 = 0eB.A00(context, 1436876361);
                A003.mkdirs();
                File A0D = AnonymousClass001.A0D(A003, "perflog");
                ArrayList A0s2 = AnonymousClass001.A0s();
                if (A0D.exists()) {
                    try {
                        objectInputStream = new ObjectInputStream(AnonymousClass001.A0F(A0D));
                    } catch (Exception unused2) {
                        try {
                            A0s = AnonymousClass001.A0s();
                        } catch (Exception e) {
                            0fH.A0s("AppComponentManager", "Error reading entries from existing analytics file.", e);
                        }
                    }
                    try {
                        A0s = (ArrayList) objectInputStream.readObject();
                        objectInputStream.close();
                        A0s2.addAll(A0s);
                    } finally {
                    }
                }
                A0s2.add(obj);
                if (!A0s2.isEmpty()) {
                    try {
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(A0D, false));
                        objectOutputStream.writeObject(A0s2);
                        objectOutputStream.close();
                    } catch (Exception e2) {
                        0fH.A0s("AppComponentManager", "Error writing entries to logfile.", e2);
                    }
                }
            }
            0fH.A0j("AppComponentManager", "===============================================");
            0fH.A0a(3, context.getPackageName(), Long.valueOf(currentTimeMillis2 / 1000), "AppComponentManager", "Enable stage %d set for pkg[%s]. Duration[%s seconds]");
            0fH.A0j("AppComponentManager", "===============================================");
        } catch (IOException e3) {
            throw new RuntimeException(AnonymousClass001.A0Z(file2, "Failed to touch file: ", AnonymousClass001.A0k()), e3);
        }
    }
}
