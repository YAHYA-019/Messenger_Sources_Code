package X;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* loaded from: J00.class */
public final class J00 implements Runnable {
    public static final String __redex_internal_original_name = "HttpUrlConnectionNetworkFetcher$1";
    public final /* synthetic */ C2589GiR A00;
    public final /* synthetic */ GiK A01;
    public final /* synthetic */ InterfaceC06954if A02;

    public J00(C2589GiR c2589GiR, GiK giK, InterfaceC06954if interfaceC06954if) {
        this.A01 = giK;
        this.A00 = c2589GiR;
        this.A02 = interfaceC06954if;
    }

    @Override // java.lang.Runnable
    public void run() {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        GiK giK = this.A01;
        C2589GiR c2589GiR = this.A00;
        InterfaceC06954if interfaceC06954if = this.A02;
        InputStream inputStream = null;
        try {
            httpURLConnection = GiK.A00(((C04364ar) c2589GiR.A04).A07.A05, giK, 5);
        } catch (IOException e) {
            e = e;
            httpURLConnection = null;
        } catch (Throwable th) {
            th = th;
            throw th;
        }
        try {
            try {
                c2589GiR.A01 = giK.A01.now();
            } finally {
                th = th;
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            interfaceC06954if.onFailure(e);
            if (httpURLConnection2 == null) {
                return;
            }
        }
        if (httpURLConnection != null) {
            0Rh A00 = 0J3.A00(httpURLConnection, 232074496);
            interfaceC06954if.CHK(A00, -1);
            try {
                A00.close();
            } catch (IOException unused2) {
            }
        }
    }
}
