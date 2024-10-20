package X;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.system.Os;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: E22.class */
public final class E22 extends CP4 {
    /* JADX WARN: Type inference failed for: r0v29, types: [X.0w6, java.lang.Object] */
    public static Uri A00(Context context, File file) {
        Boolean bool;
        Uri uri = null;
        try {
            C10G c10g = (C10G) 1Bn.A0A(99447);
            int lastIndexOf = file.getName().lastIndexOf(46);
            String name = file.getName();
            if (lastIndexOf != -1) {
                name = name.substring(0, lastIndexOf);
            }
            int lastIndexOf2 = file.getName().lastIndexOf(46);
            String substring = lastIndexOf2 == -1 ? "" : file.getName().substring(lastIndexOf2 + 1);
            HashMap hashMap = 10D.A06;
            10D A01 = 10D.A01(context, (ProviderInfo) null, (C0w6) new Object());
            File A012 = c10g.A01(context, null, name, substring);
            Uri A05 = A01.A05(A012);
            if (A012.exists()) {
                A012.delete();
            }
            try {
                Os.symlink(file.getCanonicalPath(), A012.getCanonicalPath());
                bool = true;
            } catch (Throwable unused) {
                bool = false;
            }
            if (!bool.booleanValue()) {
                10P.A00(file, A012);
            }
            uri = A05;
            context.grantUriPermission("com.facebook.stella", A05, 1);
            return A05;
        } catch (IOException e) {
            0fH.A0s("FetchLogsRequestHandler", "Failed to fetch logs", e);
            return uri;
        }
    }

    public ListenableFuture handleRequest(Context context, Bwy bwy, JSONObject jSONObject, FbUserSession fbUserSession) {
        ImmutableList of;
        Uri A00;
        0fH.A0l("FetchLogsRequestHandler", "Handle Fetch logs request");
        JSONArray jSONArray = new JSONArray();
        1Bn.A0A(99929);
        try {
            of = F0V.A00(fbUserSession, 2);
        } catch (Exception unused) {
            of = ImmutableList.of();
        }
        Iterator it = of.iterator();
        while (it.hasNext()) {
            Uri A002 = A00(context, (File) it.next());
            if (A002 != null) {
                jSONArray.put(A002.toString());
            }
        }
        File A09 = ((AnonymousClass536) 1Bi.A03(49473)).A09(AnonymousClass537.ONE_DAY, 0S2.A00, "debuglog-latest", OptSvcAnalyticsStore.FILE_SUFFIX);
        if (A09 == null) {
            A09 = null;
        } else {
            if (A09.exists()) {
                A09.delete();
            }
            try {
                Runtime.getRuntime().exec(new String[]{"logcat", "-v", "threadtime,year,zone", "-t", "1000", "-f", A09.getCanonicalPath()}).waitFor();
            } catch (Exception e) {
                0fH.A0s("FetchLogsRequestHandler", "Failed to fetch logs", e);
            }
        }
        if (A09 != null && (A00 = A00(context, A09)) != null) {
            jSONArray.put(A00.toString());
        }
        return 1Kd.A0A(CP4.success(jSONArray));
    }

    public boolean shouldCheckUserId() {
        return false;
    }
}
