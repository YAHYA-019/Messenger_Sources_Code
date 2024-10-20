package androidx.profileinstaller;

import X.0FI;
import X.0IO;
import X.0Um;
import X.AnonymousClass001;
import X.LRQ;
import X.Lto;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import java.io.File;

/* loaded from: ProfileInstallReceiver.class */
public class ProfileInstallReceiver extends BroadcastReceiver {
    public static boolean A00(File file) {
        boolean z = true;
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            z = false;
            if (listFiles != null) {
                boolean z2 = true;
                for (File file2 : listFiles) {
                    if (A00(file2)) {
                        boolean z3 = z2;
                        z2 = true;
                        int i = z3 ? i + 1 : 0;
                    }
                    z2 = false;
                }
                return z2;
            }
        } else {
            file.delete();
        }
        return z;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        LRQ lrq;
        int i;
        Lto lto;
        LRQ lrq2;
        int i2;
        int i3;
        int A01 = 0FI.A01(-1193999392);
        if (intent == null) {
            i3 = -541436934;
        } else {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                0IO.A00(context, new LRQ(this), new Lto(0), true);
            } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        lto = new Lto(0);
                        lrq2 = new LRQ(this);
                        try {
                            0IO.A01(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                            i2 = 10;
                        } catch (PackageManager.NameNotFoundException e) {
                            lto.execute(new 0Um(lrq2, e, 7));
                        }
                    } else if ("DELETE_SKIP_FILE".equals(string)) {
                        lto = new Lto(0);
                        lrq2 = new LRQ(this);
                        AnonymousClass001.A0D(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        i2 = 11;
                    }
                    lto.execute(new 0Um(lrq2, (Object) null, i2));
                }
            } else {
                if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                    lrq = new LRQ(this);
                    Process.sendSignal(Process.myPid(), 10);
                    i = 12;
                } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                    String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                    lrq = new LRQ(this);
                    if ("DROP_SHADER_CACHE".equals(string2)) {
                        i = 15;
                        if (A00(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                            i = 14;
                        }
                    } else {
                        lrq.CHm(16, (Object) null);
                    }
                }
                lrq.CHm(i, (Object) null);
            }
            i3 = 773008244;
        }
        0FI.A0D(i3, A01, intent);
    }
}
