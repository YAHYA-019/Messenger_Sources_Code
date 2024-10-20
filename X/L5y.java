package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: L5y.class */
public abstract class L5y {
    public static ArrayList A00(StackTraceElement[] stackTraceElementArr) {
        ArrayList A0s = AnonymousClass001.A0s();
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return A0s;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            String methodName = stackTraceElement.getMethodName();
            String className = stackTraceElement.getClassName();
            if (!methodName.contains("getThreadStackTrace") && ((!className.contains("java.lang.Thread") || !methodName.contains("getStackTrace")) && !className.contains("com.facebook.common.fury") && !className.contains("com.facebook.fury"))) {
                A0s.add(stackTraceElement);
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r0.getCanonicalPath().equals(r0.getCanonicalPath()) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(android.content.Context r301, java.lang.String r302, org.json.JSONObject r303) {
        /*
            java.lang.String r0 = "StacktraceFlowCollectorUtil"
            r304 = r0
            r0 = r301
            java.io.File r0 = r0.getFilesDir()
            r305 = r0
            r0 = r302
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.io.IOException -> L48
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L56
            r0 = r305
            r1 = r302
            java.io.File r0 = X.AnonymousClass001.A0D(r0, r1)     // Catch: java.io.IOException -> L48
            r307 = r0
            r0 = r307
            java.io.File r0 = r0.getParentFile()     // Catch: java.io.IOException -> L48
            r308 = r0
            r0 = r308
            java.lang.Class r0 = r0.getClass()     // Catch: java.io.IOException -> L48
            r0 = r308
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.io.IOException -> L48
            r309 = r0
            r0 = r305
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.io.IOException -> L48
            r308 = r0
            r0 = r309
            r1 = r308
            boolean r0 = r0.equals(r1)     // Catch: java.io.IOException -> L48
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L56
            goto L63
        L48:
            r309 = move-exception
            java.lang.String r0 = "Error while trying to control file location and content."
            r308 = r0
            r0 = r304
            r1 = r308
            r2 = r309
            X.0fH.A0s(r0, r1, r2)
        L56:
            java.lang.String r0 = "fury_stacktrace_flow_collector_output.json"
            r308 = r0
            r0 = r305
            r1 = r308
            java.io.File r0 = X.AnonymousClass001.A0D(r0, r1)
            r307 = r0
        L63:
            r0 = r307
            java.lang.String r0 = r0.getName()     // Catch: java.io.IOException -> Lc1
            r309 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r308 = r0
            r0 = r301
            r1 = r309
            r2 = 0
            java.io.FileOutputStream r0 = r0.openFileOutput(r1, r2)     // Catch: java.io.IOException -> Lc1
            r305 = r0
            r0 = r303
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> La6
            r308 = r0
            r0 = r308
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> La6
            r308 = r0
            r0 = r305
            r1 = r308
            r0.write(r1)     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = "Wrote fury stacktrace json data to file: %s"
            r309 = r0
            r0 = r307
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.lang.Throwable -> La6
            r308 = r0
            r0 = r308
            r1 = r304
            r2 = r309
            X.0fH.A0h(r0, r1, r2)     // Catch: java.lang.Throwable -> La6
            r0 = r305
            r0.close()     // Catch: java.io.IOException -> Lc1
            return
        La6:
            r309 = move-exception
            r0 = r305
            if (r0 == 0) goto Lbe
            r0 = r305
            r0.close()     // Catch: java.lang.Throwable -> Lb5
            goto Lbe
        Lb5:
            r308 = move-exception
            r0 = r309
            r1 = r308
            X.7kF.A00(r0, r1)     // Catch: java.io.IOException -> Lc1
        Lbe:
            r0 = r309
            throw r0     // Catch: java.io.IOException -> Lc1
        Lc1:
            r309 = move-exception
            r0 = r304
            java.lang.String r1 = "Failed writing json to FileOutputStream"
            r2 = r309
            X.0fH.A0r(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L5y.A01(android.content.Context, java.lang.String, org.json.JSONObject):void");
    }

    public static void A02(List list, JSONObject jSONObject) {
        StringBuilder A0k = AnonymousClass001.A0k();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0k.append(it.next());
        }
        jSONObject.put("stacktrace", A0k.toString());
    }
}
