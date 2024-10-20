package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.LogcatReader;
import com.facebook.inject.FbInjector;
import com.google.common.base.Platform;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: Fd3.class */
public final class Fd3 implements C4Av {
    public final C00i A01 = AbH.A0N();
    public final Context A00 = FbInjector.A00();

    private void A00(String str, String str2) {
        1UG A08 = 1BK.A08(1BK.A07(this.A01), "fb_path_monitor_event");
        if (A08.isSampled()) {
            A08.A7R("monitor_event", str);
            A08.A7R("path", str2);
            A08.BZL();
        }
    }

    @Override // X.C4Av
    public boolean Ciy(4Yg r302) {
        if (!r302.A01()) {
            return false;
        }
        FbUserSession A00 = r302.A00();
        File A0E = AnonymousClass001.A0E(this.A00.getApplicationInfo().dataDir);
        HashSet A1E = AbF.A1E(((F8E) 1Lo.A06(A00, 98798)).A00());
        boolean exists = A0E.exists();
        HashSet A0v = AnonymousClass001.A0v();
        if (exists) {
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.push(A0E);
            while (!arrayDeque.isEmpty()) {
                try {
                    File file = (File) arrayDeque.pop();
                    File file2 = file;
                    if (file.getParent() != null) {
                        file2 = AnonymousClass001.A0D(file.getParentFile().getCanonicalFile(), file.getName());
                    }
                    if (!(!file2.getCanonicalFile().equals(file2.getAbsoluteFile()))) {
                        String canonicalPath = file.getCanonicalPath();
                        F8E f8e = (F8E) 1Lo.A06(A00, 98798);
                        File A0E2 = AnonymousClass001.A0E(canonicalPath);
                        int hashCode = AbJ.A0z(f8e.A03).concat(canonicalPath).hashCode() % LogcatReader.DEFAULT_WAIT_TIME;
                        if (hashCode < 0) {
                            hashCode += LogcatReader.DEFAULT_WAIT_TIME;
                        }
                        long j = hashCode;
                        C00i c00i = f8e.A05;
                        if (j < 1BK.A0N(c00i).Auy(36592640325714843L)) {
                            try {
                                if (f8e.A00 == null) {
                                    f8e.A00 = AnonymousClass001.A0v();
                                    String trim = 1BK.A0N(c00i).BCy(36874115302359325L).toLowerCase(Locale.US).trim();
                                    if (!Platform.stringIsNullOrEmpty(trim)) {
                                        f8e.A00.addAll(DKE.A16(trim));
                                    }
                                }
                                Iterator it = f8e.A00.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (canonicalPath.substring(AnonymousClass001.A0E(f8e.A02.getApplicationInfo().dataDir).getCanonicalPath().length()).toLowerCase(Locale.US).startsWith(AnonymousClass001.A0i(it))) {
                                            break;
                                        }
                                    } else if (A0E2.exists() && A0E2.isDirectory()) {
                                        File[] listFiles = A0E2.listFiles();
                                        if (listFiles != null) {
                                            int length = listFiles.length;
                                            int i = 0;
                                            while (true) {
                                                if (i >= length) {
                                                    break;
                                                }
                                                if (listFiles[i].isFile()) {
                                                    A0v.add(canonicalPath);
                                                    break;
                                                }
                                                i++;
                                            }
                                        }
                                    }
                                }
                            } catch (IOException e) {
                                0fH.A0r("FBMonitoringPathProvider", "isBlackListed errors", e);
                            }
                        }
                        File[] listFiles2 = file.listFiles();
                        if (listFiles2 != null) {
                            for (File file3 : listFiles2) {
                                arrayDeque.push(file3);
                            }
                        }
                    }
                } catch (IOException e2) {
                    0fH.A0r("UpdateMonitoringPathsConditionalWorker", "Exception happens when trying to traverse file tree", e2);
                }
            }
        }
        C2e5 A03 = C1n3.A03(A1E, A0v);
        C2e5 A032 = C1n3.A03(A0v, A1E);
        Iterator<E> it2 = A03.iterator();
        while (it2.hasNext()) {
            String A0i = AnonymousClass001.A0i(it2);
            F8E f8e2 = (F8E) 1Lo.A06(A00, 98798);
            f8e2.A00();
            if (f8e2.A01.contains(A0i)) {
                f8e2.A01.remove(A0i);
                1Ql A0V = 1BL.A0V(f8e2.A04);
                A0V.Cdj(F8E.A06.A0F(A0i));
                A0V.commit();
            }
            A00("stop_monitoring", A0i);
        }
        Iterator<E> it3 = A032.iterator();
        while (it3.hasNext()) {
            String A0i2 = AnonymousClass001.A0i(it3);
            F8E f8e3 = (F8E) 1Lo.A06(A00, 98798);
            f8e3.A00();
            if (!f8e3.A01.contains(A0i2)) {
                f8e3.A01.add(A0i2);
                long currentTimeMillis = System.currentTimeMillis();
                1Ql A0V2 = 1BL.A0V(f8e3.A04);
                A0V2.CaH(F8E.A06.A0F(A0i2), currentTimeMillis);
                A0V2.commit();
            }
            A00("start_monitoring", A0i2);
        }
        return true;
    }
}
