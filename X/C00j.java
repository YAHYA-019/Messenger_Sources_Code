package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;
import com.facebook.systrace.Systrace;
import java.util.IllegalFormatException;

/* renamed from: X.00j, reason: invalid class name */
/* loaded from: 00j.class */
public abstract class C00j {
    public static long A00(int i) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        externalProvider.A0A().A00(6, 22, i, 0, 0L);
        if (!TraceEvents.isEnabled(externalProvider.A01)) {
            Systrace.A01(32);
        }
        return 0L;
    }

    public static void A01(int i) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        externalProvider.A0A().A00(6, 22, i, 0, 0L);
        if (TraceEvents.isEnabled(externalProvider.A01)) {
            return;
        }
        Systrace.A01(32);
    }

    public static void A02(int i) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        externalProvider.A0A().A00(6, 22, i, 0, 0L);
        if (TraceEvents.isEnabled(externalProvider.A01)) {
            return;
        }
        Systrace.A01(32);
    }

    public static void A03(Object obj, Object obj2, Object obj3, String str, int i) {
        if (TraceEvents.isEnabled(ExternalProviders.A07.A01)) {
            A06(StringFormatUtil.formatStrLocaleSafe(str, obj, obj2, obj3), i);
            return;
        }
        long j = 32;
        if (Systrace.A0E(j)) {
            try {
                str = StringFormatUtil.formatStrLocaleSafe(str, obj, obj2, obj3);
            } catch (IllegalFormatException e) {
                0fH.A0w("Tracer", "Bad format string", e);
            }
            11T.A0D(str);
            Systrace.A02(j, str);
        }
    }

    public static void A04(Object obj, Object obj2, String str, int i) {
        if (TraceEvents.isEnabled(ExternalProviders.A07.A01)) {
            A06(StringFormatUtil.formatStrLocaleSafe(str, obj, obj2), i);
            return;
        }
        long j = 32;
        if (Systrace.A0E(j)) {
            try {
                str = StringFormatUtil.formatStrLocaleSafe(str, obj, obj2);
            } catch (IllegalFormatException e) {
                0fH.A0w("Tracer", "Bad format string", e);
            }
            11T.A0D(str);
            Systrace.A02(j, str);
        }
    }

    public static void A05(String str, int i) {
        if (TraceEvents.isEnabled(ExternalProviders.A07.A01)) {
            A06(str, i);
            return;
        }
        11T.A0F(str, 0);
        long j = 32;
        if (Systrace.A0E(j)) {
            try {
                str = StringFormatUtil.formatStrLocaleSafe(str);
            } catch (IllegalFormatException e) {
                0fH.A0w("Tracer", "Bad format string", e);
            }
            11T.A0D(str);
            Systrace.A02(j, str);
        }
    }

    public static void A06(String str, int i) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        if (TraceEvents.isEnabled(externalProvider.A01)) {
            int A00 = externalProvider.A0A().A00(7, 21, i, 0, 0L);
            if (str != null) {
                externalProvider.A0A().A01(1, 83, A00, str);
            }
        }
    }

    public static void A07(String str, Object obj, int i) {
        if (TraceEvents.isEnabled(ExternalProviders.A07.A01)) {
            A06(StringFormatUtil.formatStrLocaleSafe(str, obj), i);
            return;
        }
        long j = 32;
        if (Systrace.A0E(j)) {
            try {
                str = StringFormatUtil.formatStrLocaleSafe(str, obj);
            } catch (IllegalFormatException e) {
                0fH.A0w("Tracer", "Bad format string", e);
            }
            11T.A0D(str);
            Systrace.A02(j, str);
        }
    }
}
