package X;

import java.io.BufferedReader;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/* loaded from: L9v.class */
public final class L9v {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a5, code lost:
    
        r0 = X.0CU.A0G(r306, ":", r306);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cc, code lost:
    
        r304 = X.4YU.A13(X.0CV.A0W(X.0CU.A0H(r0, com.facebook.traffic.knob.InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, r0), "\"", ""));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e8, code lost:
    
        r0.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String A00(X.RTm r301, java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L9v.A00(X.RTm, java.lang.String):java.lang.String");
    }

    public static final String A01(InputStream inputStream) {
        BufferedReader A0f = JQy.A0f(inputStream);
        try {
            StringBuffer stringBuffer = new StringBuffer();
            String readLine = A0f.readLine();
            while (true) {
                String str = readLine;
                if (str == null) {
                    String A02 = 11T.A02(stringBuffer);
                    A0f.close();
                    return A02;
                }
                stringBuffer.append(str);
                readLine = A0f.readLine();
            }
        } finally {
        }
    }

    public static final String A02(HttpURLConnection httpURLConnection, int i) {
        boolean z;
        0Rh errorStream;
        if (i == 200) {
            z = true;
            errorStream = 0J3.A00(httpURLConnection, -1778398725);
        } else {
            z = false;
            errorStream = httpURLConnection.getErrorStream();
        }
        11T.A0D(errorStream);
        String A01 = A01(errorStream);
        if (z) {
            return A01;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(i);
        A0k.append(":(");
        throw AnonymousClass001.A0G(DKH.A0o(A01, A0k));
    }

    public void A03(RTm rTm, String str) {
        boolean A1X = 1BL.A1X(rTm, str);
        String A00 = A00(rTm, str);
        if (A00.length() > 0) {
            URLConnection A0v = JQy.A0v(0Pz.A0W(7zK.A00(333), A00));
            11T.A0I(A0v, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) A0v;
            httpURLConnection.setRequestMethod("DELETE");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(A1X);
            httpURLConnection.setDoOutput(false);
            11T.A0B(Aam.A00);
            String str2 = rTm.A00.A00;
            str2.getClass();
            httpURLConnection.setRequestProperty("Authorization", 0Pz.A0W("Bearer ", str2));
            0fH.A0n("GoogleDriveIntegration", 0Pz.A0T("response code for deleting :", httpURLConnection.getResponseCode()));
            httpURLConnection.disconnect();
        }
    }
}
