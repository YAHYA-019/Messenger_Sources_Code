package X;

import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

/* renamed from: X.0iw, reason: invalid class name */
/* loaded from: 0iw.class */
public abstract class C0iw {
    public static String A00;
    public static String A01;
    public static String A02;
    public static ExecutorService A03;
    public static boolean A04;

    public static void A00(final String str, final java.util.Map map) {
        ExecutorService executorService;
        if (!A04 || (executorService = A03) == null) {
            return;
        }
        try {
            executorService.execute(new Runnable() { // from class: X.0iv
                public static final String __redex_internal_original_name = "LacrimaAvailabilityPing$1";

                @Override // java.lang.Runnable
                public void run() {
                    String obj;
                    HttpsURLConnection httpsURLConnection;
                    int i = 0;
                    do {
                        String str2 = str;
                        java.util.Map map2 = map;
                        boolean z = false;
                        HttpsURLConnection httpsURLConnection2 = null;
                        try {
                            StringBuilder A0o = AnonymousClass001.A0o("user_id=0&report_type=debug_ping&debug_ping_ver=");
                            A0o.append(9);
                            String str3 = C0iw.A00;
                            if (str3 != null) {
                                A0o.append("&session_id=");
                                A0o.append(URLEncoder.encode(str3, "UTF-8"));
                            }
                            String str4 = C0iw.A01;
                            if (str4 != null) {
                                A0o.append("&app_id=");
                                A0o.append(str4);
                            }
                            A0o.append("&extra_data[checkpoint]=");
                            A0o.append(URLEncoder.encode(str2, "UTF-8"));
                            String str5 = C0iw.A02;
                            if (str5 != null) {
                                A0o.append("&extra_data[process]=");
                                A0o.append(URLEncoder.encode(str5, "UTF-8"));
                            }
                            int i2 = C0iz.A00;
                            if (i2 >= 0) {
                                A0o.append("&extra_data[mode]=");
                                A0o.append(i2);
                            }
                            int i3 = C0iz.A01;
                            if (i3 > 0) {
                                A0o.append("&extra_data[uf_mode]=");
                                A0o.append(i3);
                            }
                            if (map2 != null) {
                                Iterator A0y = AnonymousClass001.A0y(map2);
                                while (A0y.hasNext()) {
                                    Map.Entry A0z = AnonymousClass001.A0z(A0y);
                                    A0o.append("&extra_data[");
                                    A0o.append(URLEncoder.encode(AnonymousClass001.A0j(A0z), "UTF-8"));
                                    A0o.append("]=");
                                    A0o.append(URLEncoder.encode((String) A0z.getValue(), "UTF-8"));
                                }
                            }
                            obj = A0o.toString();
                            httpsURLConnection = (HttpsURLConnection) new URL("https://b-www.facebook.com/mobile/extra_data_collector/").openConnection();
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            C05D c05d = new C05D(0L);
                            SSLContext sSLContext = SSLContext.getInstance("TLS");
                            sSLContext.init(null, c05d.A00, null);
                            byte[] A0Z = AnonymousClass002.A0Z(obj, httpsURLConnection, sSLContext);
                            0J3.A02(httpsURLConnection, 803474198);
                            0J4 A012 = 0J3.A01(httpsURLConnection, -494451217);
                            try {
                                A012.write(A0Z);
                                A012.close();
                                if (httpsURLConnection.getResponseCode() == 200) {
                                    z = true;
                                }
                                try {
                                    httpsURLConnection.disconnect();
                                } catch (Throwable th2) {
                                    th2.printStackTrace();
                                }
                                if (z) {
                                    return;
                                }
                            } catch (Throwable th3) {
                                try {
                                    A012.close();
                                } catch (Throwable th4) {
                                    0Ug.A00(th3, th4);
                                }
                                throw th3;
                                break;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            httpsURLConnection2 = httpsURLConnection;
                            try {
                                th.printStackTrace();
                                if (httpsURLConnection2 != null) {
                                    httpsURLConnection2.disconnect();
                                }
                                i++;
                            } catch (Throwable th6) {
                                if (httpsURLConnection2 != null) {
                                    try {
                                        httpsURLConnection2.disconnect();
                                        throw th6;
                                    } catch (Throwable th7) {
                                        th7.printStackTrace();
                                        throw th6;
                                    }
                                }
                                throw th6;
                            }
                        }
                        i++;
                    } while (i < 3);
                }
            });
        } catch (Throwable unused) {
        }
    }
}
