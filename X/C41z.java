package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.SystemClock;
import com.facebook.zero.common.ZeroUrlRewriteRule;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: X.41z, reason: invalid class name */
/* loaded from: 41z.class */
public abstract class C41z {
    public static long A00;
    public static BroadcastReceiver A01;
    public static Context A02;
    public static Keu A03;
    public static AnonymousClass421 A04;
    public static String A05;
    public static String A06;
    public static boolean A07;
    public static boolean A08;
    public static final AnonymousClass420 A09;
    public static final AnonymousClass420 A0C;
    public static volatile AnonymousClass420 A0D;
    public static volatile String A0E;
    public static final Semaphore A0B = new Semaphore(1);
    public static final List A0A = new LinkedList();
    public static volatile String A0F = "https://graph.facebook.com/v2.2/maps_configs?fields=base_url,static_base_url,osm_config,url_override_config&pretty=0&access_token=";

    static {
        int i = (-1) >>> 1;
        AnonymousClass420 anonymousClass420 = new AnonymousClass420("https://www.facebook.com/maps/tile/?", "https://www.facebook.com/maps/static/?", null, null, null, i);
        A0C = anonymousClass420;
        A09 = new AnonymousClass420("https://maps.instagram.com/maps/tile/?", "https://maps.instagram.com/maps/static/?", null, null, null, i);
        A0D = anonymousClass420;
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        A03(A07);
        AnonymousClass420 anonymousClass420 = A0D;
        String[] strArr = anonymousClass420.A05;
        if (strArr != null) {
            int i4 = 1 << i3;
            int length = strArr.length;
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i6 >= length) {
                    break;
                }
                C5e5[][] c5e5Arr = anonymousClass420.A06;
                int length2 = c5e5Arr[i6].length;
                int i7 = 0;
                while (true) {
                    int i8 = i7;
                    if (i8 < length2) {
                        C5e5 c5e5 = c5e5Arr[i6][i8];
                        double d = c5e5.A01;
                        double d2 = i4;
                        if (((int) (d * d2)) <= i && i <= ((int) (c5e5.A02 * d2)) && ((int) (c5e5.A03 * d2)) <= i2 && i2 <= ((int) (c5e5.A00 * d2))) {
                            return strArr[i6];
                        }
                        i7 = i8 + 1;
                    }
                }
                i5 = i6 + 1;
            }
        }
        return anonymousClass420.A01;
    }

    public static String A01(String str) {
        AnonymousClass421 anonymousClass421 = A04;
        if (anonymousClass421 != null) {
            1Du it = anonymousClass421.A01.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ZeroUrlRewriteRule zeroUrlRewriteRule = (ZeroUrlRewriteRule) it.next();
                if (zeroUrlRewriteRule.A01.matcher(str).matches()) {
                    str = zeroUrlRewriteRule.A01.matcher(str).replaceFirst(zeroUrlRewriteRule.A03);
                    break;
                }
            }
        }
        return str;
    }

    public static void A02() {
        String str;
        String language = Locale.getDefault().getLanguage();
        if (language.length() == 2) {
            String country = Locale.getDefault().getCountry();
            str = 0Pz.A0W(language, country.length() == 2 ? 0Pz.A0W("_", country) : "");
        } else {
            str = "en";
        }
        A05 = str;
        A06 = str.toLowerCase(Locale.US);
        try {
            Locale.getDefault().getISO3Language();
        } catch (MissingResourceException unused) {
        }
    }

    public static void A03(boolean z) {
        if (A08 || A0E == null || A02 == null) {
            return;
        }
        Semaphore semaphore = A0B;
        if (semaphore.availablePermits() > 0) {
            long j = A00;
            if (j == 0 || SystemClock.uptimeMillis() - j >= 3600000) {
                A07 = z;
                LBx.A02(new JlV(A02), "MapConfigUpdateDispatchable");
                return;
            }
            return;
        }
        if (z) {
            try {
                if (semaphore.tryAcquire(10, TimeUnit.SECONDS)) {
                    semaphore.release();
                }
            } catch (InterruptedException e) {
                LBH.A09.A04(e);
            }
        }
    }
}
