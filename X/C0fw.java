package X;

import android.text.TextUtils;
import com.facebook.acra.constants.ErrorReportingConstants;
import java.io.BufferedReader;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.0fw, reason: invalid class name */
/* loaded from: 0fw.class */
public abstract class C0fw {
    public static String A00(File file) {
        File A0D = AnonymousClass001.A0D(AnonymousClass001.A0D(file, "report_source"), ErrorReportingConstants.REPORT_SOURCE_REF_FILE_NAME);
        if (!A0D.exists()) {
            return null;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        BufferedReader A0A = AnonymousClass001.A0A(A0D);
        while (true) {
            try {
                String readLine = A0A.readLine();
                if (readLine == null) {
                    String obj = A0k.toString();
                    A0A.close();
                    return obj;
                }
                A0k.append(readLine);
                A0k.append('\n');
            } catch (Throwable th) {
                try {
                    A0A.close();
                    throw th;
                } catch (Throwable th2) {
                    0Ug.A00(th, th2);
                    throw th;
                }
            }
        }
    }

    public static String A01(String str) {
        String A02 = 0WL.A02(str);
        return TextUtils.isEmpty(A02) ? System.getProperty(str) : A02;
    }

    public static String A02(java.util.Map map) {
        String A0b = AnonymousClass001.A0b("fb.test_name", map);
        String A0b2 = AnonymousClass001.A0b("fb.test_execution_uuid", map);
        if (TextUtils.isEmpty(A0b) && TextUtils.isEmpty(A0b2)) {
            return null;
        }
        return 0Pz.A0z("{\"test_name\":\"", A0b, "\",\"test_execution_uuid\":\"", A0b2, "\"}");
    }

    public static HashMap A03() {
        HashMap A0u = AnonymousClass001.A0u();
        String A01 = A01("ig.ig_server_rev_hash");
        if (!TextUtils.isEmpty(A01)) {
            A0u.put("ig.ig_server_rev_hash", A01);
        }
        String A012 = A01(ErrorReportingConstants.REPORT_SOURCE_OVERRIDE_PROP);
        if (!TextUtils.isEmpty(A012)) {
            A0u.put(ErrorReportingConstants.REPORT_SOURCE_OVERRIDE_PROP, A012);
            String A013 = A01("fb.testing.build_target");
            if (!TextUtils.isEmpty(A013)) {
                A0u.put("fb.testing.build_target", A013);
            }
            String A014 = A01("fb.test_name");
            if (!TextUtils.isEmpty(A014)) {
                A0u.put("fb.test_name", A014);
            }
            String A015 = A01("fb.test_execution_uuid");
            if (!TextUtils.isEmpty(A015)) {
                A0u.put("fb.test_execution_uuid", A015);
            }
        }
        return A0u;
    }
}
