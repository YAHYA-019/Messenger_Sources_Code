package com.facebook.omnistore.module;

import X.0Pz;
import X.1BK;
import X.1BO;
import X.1BQ;
import X.1BV;
import X.1Bn;
import X.1EZ;
import X.1oG;
import X.2Ad;
import X.AnonymousClass001;
import X.C00i;
import X.C01273qk;
import X.C1oA;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.omnistore.Omnistore;
import com.google.common.io.Files;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: OmnistoreExtraFileProvider.class */
public class OmnistoreExtraFileProvider implements 2Ad {
    public static final Class TAG = OmnistoreExtraFileProvider.class;
    public final C01273qk mOmnistoreComponentHelper = (C01273qk) 1Bn.A0A(32787);
    public final C00i mMobileConfig = 1BQ.A00();
    public final 1oG mOmnistoreOpenerUtils = (1oG) 1Bn.A0A(16809);
    public final C00i mViewerContextManager = 1BV.A00(16428);

    public static final OmnistoreExtraFileProvider _UL__ULSEP_com_facebook_omnistore_module_OmnistoreExtraFileProvider_ULSEP_FACTORY_METHOD(int i, 1BO r302, Object obj) {
        return new OmnistoreExtraFileProvider();
    }

    private HashMap addSQLiteFiles(HashMap hashMap, File file) {
        ArrayList A0s = AnonymousClass001.A0s();
        1oG r0 = this.mOmnistoreOpenerUtils;
        File databasePath = r0.A01.getDatabasePath(0Pz.A0W(1oG.A00(r0), ".db"));
        File parentFile = databasePath.getParentFile();
        Iterator it = getAllFilesStartWithPrefix(parentFile, databasePath.getName()).iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            File A0D = AnonymousClass001.A0D(parentFile, A0i);
            File A02 = 0Pz.A02(sanitizeUserId(A0i), OptSvcAnalyticsStore.FILE_SUFFIX, file);
            Files.A04(A0D, A02);
            1BK.A1N(A02, A0s);
        }
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            File A0E = AnonymousClass001.A0E(AnonymousClass001.A0i(it2));
            hashMap.put(A0E.getName(), Uri.fromFile(A0E).toString());
        }
        return hashMap;
    }

    public static List getAllFilesStartWithPrefix(File file, String str) {
        ArrayList A0s = AnonymousClass001.A0s();
        String[] list = file.list();
        if (list != null) {
            int length = list.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                String str2 = list[i2];
                if (str2.startsWith(str)) {
                    A0s.add(str2);
                }
                i = i2 + 1;
            }
        }
        return A0s;
    }

    private String sanitizeUserId(String str) {
        return str.replaceAll(0Pz.A0W(((1EZ) this.mViewerContextManager.get()).Aue().mUserId, "_"), "USER_ID_");
    }

    public Map addDebugFiles(HashMap hashMap, File file) {
        ArrayList A0s;
        C1oA c1oA = this.mOmnistoreComponentHelper.A00;
        synchronized (c1oA) {
            Omnistore A01 = C1oA.A01(c1oA);
            A0s = AnonymousClass001.A0s();
            if (A01 != null) {
                File A0D = AnonymousClass001.A0D(file, "omnistore.txt");
                FileOutputStream fileOutputStream = new FileOutputStream(A0D);
                try {
                    PrintWriter printWriter = new PrintWriter(fileOutputStream);
                    System.out.println(A01.getDebugInfo());
                    printWriter.write(A01.getDebugInfo());
                    printWriter.flush();
                    fileOutputStream.close();
                    A0s.add(A0D);
                    for (String str : A01.writeBugReport(file.toString())) {
                        A0s.add(AnonymousClass001.A0E(str));
                    }
                } finally {
                }
            }
        }
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            File file2 = (File) it.next();
            hashMap.put(file2.getName(), Uri.fromFile(file2).toString());
        }
        return hashMap;
    }

    public Map getExtraFileFromWorkerThread(File file, FbUserSession fbUserSession) {
        HashMap A0u = AnonymousClass001.A0u();
        addDebugFiles(A0u, file);
        if (1BK.A0N(this.mMobileConfig).AZk(36326408191366735L)) {
            addSQLiteFiles(A0u, file);
        }
        return A0u;
    }

    public String getName() {
        return "Omnistore";
    }

    public boolean isMemoryIntensive() {
        return false;
    }

    public boolean isUserIdentifiable() {
        return false;
    }

    public void prepareDataForWriting() {
    }

    public boolean shouldSendAsync() {
        return 1BK.A0N(this.mMobileConfig).AZk(2342153633398063642L);
    }
}
