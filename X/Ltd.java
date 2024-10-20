package X;

import android.content.Context;
import android.util.Pair;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.airbnb.lottie.LottieAnimationView;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.util.concurrent.Callable;

/* loaded from: Ltd.class */
public final class Ltd implements Callable {
    public final int A00;
    public final Object A01;
    public final String A02;

    public Ltd(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        Pair A01;
        String hostAddress;
        HttpURLConnection httpURLConnection;
        switch (this.A00) {
            case 0:
                return ((ShortcutInfoCompatSaverImpl) this.A01).A04.get(this.A02);
            case 1:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.A01;
                String str = this.A02;
                boolean z = lottieAnimationView.A03;
                Context context = lottieAnimationView.getContext();
                return z ? LDc.A01(context, str, 0Pz.A0W("asset_", str)) : LDc.A01(context, str, (String) null);
            case 2:
                return LDc.A04((InputStream) this.A01, this.A02);
            case 3:
                Kqg kqg = (Kqg) this.A01;
                ((1GU) kqg.A02.get()).AAq();
                C00i c00i = kqg.A06;
                if (!((1I9) ((1Oe) c00i.get()).A01.get()).A09()) {
                    return null;
                }
                String str2 = this.A02;
                3MN A012 = ((1I9) ((1Oe) c00i.get()).A01.get()).A01();
                if (A012 == null) {
                    0fH.A0C(Kqg.class, "FDID:  Initiate voluntary synchronization");
                    ((1KV) kqg.A05.get()).A03();
                    1Ql A0V = 1BL.A0V(kqg.A04);
                    1G2 r0 = 1H3.A07;
                    C00i c00i2 = kqg.A03;
                    A0V.CaH(r0, 1BL.A08(c00i2));
                    A0V.commit();
                    A01 = ((1I9) ((1Oe) c00i.get()).A01.get()).A01();
                    if (A01 == null) {
                        A012 = new 3MN(1BK.A0t(), 1BL.A08(c00i2), kqg.A01.getPackageName(), str2);
                    }
                }
                1Oe r02 = (1Oe) c00i.get();
                synchronized (r02) {
                    ((1I9) r02.A01.get()).A05(A012);
                }
                return A012;
            default:
                HttpURLConnection httpURLConnection2 = null;
                try {
                    String str3 = this.A02;
                    hostAddress = InetAddress.getByName(str3).getHostAddress();
                    httpURLConnection = (HttpURLConnection) JQy.A0v(0Pz.A0W("https://", str3));
                    try {
                        httpURLConnection.setRequestProperty("X-FB-Client-IP", "True");
                        0J3.A02(httpURLConnection, -1619110917);
                    } catch (IOException unused) {
                        httpURLConnection2 = httpURLConnection;
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        A01 = new Pair("", "");
                        return A01;
                    } catch (Throwable th) {
                        th = th;
                        httpURLConnection2 = httpURLConnection;
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        throw th;
                    }
                } catch (IOException unused2) {
                } catch (Throwable th2) {
                    th = th2;
                }
                if (httpURLConnection.getResponseCode() == 204) {
                    String headerField = httpURLConnection.getHeaderField("X-FB-Client-IP-Forwarded");
                    if (headerField == null) {
                        headerField = "";
                    }
                    if (hostAddress == null) {
                        hostAddress = "";
                    }
                    Pair A0G = GOn.A0G(headerField, hostAddress);
                    httpURLConnection.disconnect();
                    return A0G;
                }
                httpURLConnection.disconnect();
                A01 = new Pair("", "");
        }
        return A01;
    }
}
