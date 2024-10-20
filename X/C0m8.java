package X;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.profilo.logger.api.ProfiloLogger;
import com.facebook.profilo.provider.device_info.DeviceInfoProvider;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.0m8, reason: invalid class name */
/* loaded from: 0m8.class */
public abstract class C0m8 {
    public static void A00() {
    }

    public static void A01() {
    }

    public static void A02(Context context) {
        A03(context, null, null);
    }

    public static void A03(Context context, 0So r302, 0Tz r303) {
        0Tz r304 = r303;
        SparseArray sparseArray = new SparseArray(5);
        sparseArray.put(0Tb.A00, 0Tb.A00());
        sparseArray.put(AnonymousClass140.A01, new AnonymousClass140());
        sparseArray.put(13D.A01, new 13D());
        C0t9 A00 = 0Zh.A00(context);
        sparseArray.put(C0ll.A00, new AnonymousClass133());
        C0lu[] A04 = A04(context);
        if (r303 == null) {
            r304 = new 0Tz(context);
        }
        if (!A00.A01()) {
            C0mc.A02();
        }
        r304.A04();
        C0ly.A00(context, sparseArray, r304, "main", A04, r302 != null ? C0mc.A03() ? new 0So[]{r302, new 0jO()} : new 0So[]{r302} : C0mc.A03() ? new 0So[]{new 0jO()} : new 0So[0], true);
        C0t9 A002 = 0Zh.A00(context);
        0H4 A003 = 0H4.A00();
        if (A002.A02() && A003 != null) {
            A003.A0C();
        }
        if (C0mc.A03()) {
            C0ld A07 = 0Gw.A00().A07();
            Iterator it = 0HB.A04().iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                C0ll A01 = 0HB.A01();
                if (A01 != null) {
                    C0mc.A00().A01(A01.AAJ(longValue), Integer.valueOf(A01.B8d(A07, longValue)), Long.valueOf(A07.getID()), "ProfiloColdStartTraceInitializer", "maybeTraceColdStartWithArgs(); Blackbox context = %s, Sampling rate = %d, cfg_id = %d");
                }
            }
        }
        ProfiloLogger.A00 = true;
        ProfiloLogger.installClassLoadTracer();
        0F3.A00();
        0HB.A07();
        0F4.A01();
        C0fv.A00().A01(new 0F5());
        A00();
        A01();
        0H4 A004 = 0H4.A00();
        if (A004 != null) {
            A004.A0E(r304.A03(), 13D.A01, 0);
        }
    }

    public static C0lu[] A04(Context context) {
        C0lu[] A00 = C0m7.A00(context);
        C0lu[] c0luArr = (C0lu[]) Arrays.copyOf(A00, A00.length + 5);
        int length = c0luArr.length;
        c0luArr[length - 5] = new C0lu(null);
        c0luArr[length - 4] = new DeviceInfoProvider(context);
        c0luArr[length - 3] = new 0RE(context);
        c0luArr[length - 2] = C0rz.A01;
        c0luArr[length - 1] = 0Qk.A05;
        return c0luArr;
    }
}
