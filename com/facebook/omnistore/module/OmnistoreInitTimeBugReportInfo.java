package com.facebook.omnistore.module;

import X.0rI;
import X.1BO;
import X.1Bi;
import X.2Ad;
import X.7kF;
import X.AnonymousClass001;
import X.RJm;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: OmnistoreInitTimeBugReportInfo.class */
public class OmnistoreInitTimeBugReportInfo implements 2Ad {
    public final 0rI mClock = (0rI) 1Bi.A03(84491);
    public final ArrayList mInitTimes = AnonymousClass001.A0s();
    public final String OMNISTORE_INIT_INFO_FILENAME = "omnistore_init_json.txt";

    public static final OmnistoreInitTimeBugReportInfo _UL__ULSEP_com_facebook_omnistore_module_OmnistoreInitTimeBugReportInfo_ULSEP_FACTORY_METHOD(int i, 1BO r302, Object obj) {
        return new OmnistoreInitTimeBugReportInfo();
    }

    private void logPoint(String str) {
        this.mInitTimes.add(new RJm(System.currentTimeMillis(), str));
    }

    private Uri writeFile(File file) {
        File file2 = new File(file, "omnistore_init_json.txt");
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.mInitTimes.iterator();
        while (it.hasNext()) {
            RJm rJm = (RJm) it.next();
            JSONObject A12 = AnonymousClass001.A12();
            try {
                A12.put("time", rJm.A00);
                A12.put("event", rJm.A01);
                jSONArray.put(A12);
            } catch (JSONException e) {
                throw new IOException(e);
            }
        }
        PrintWriter printWriter = new PrintWriter(file2);
        try {
            printWriter.print(jSONArray.toString());
            printWriter.close();
            return Uri.fromFile(file2);
        } catch (Throwable th) {
            try {
                printWriter.close();
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }

    public Map getExtraFileFromWorkerThread(File file, FbUserSession fbUserSession) {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("omnistore_init_json.txt", writeFile(file).toString());
        return A0u;
    }

    public String getName() {
        return "OmnistoreInitTime";
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
        return false;
    }
}
