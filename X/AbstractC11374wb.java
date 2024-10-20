package X;

import android.content.Context;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Set;

/* renamed from: X.4wb, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4wb.class */
public abstract class AbstractC11374wb {
    /* JADX WARN: Type inference failed for: r0v21, types: [X.4wk] */
    public static final C11474wl A00(Context context, EnumC11364wa enumC11364wa, String str, String str2, Set set, Set set2, boolean z) {
        C11384wc c11384wc = new C11384wc();
        C11394wd c11394wd = new C11394wd(str, str2);
        8Lu r0 = new 8Lu(set, set2);
        C87w c87w = new C87w(enumC11364wa, z);
        C0uA c0uA = C0uA.A00;
        C11424wg c11424wg = new C11424wg(context, c11394wd, new JtD(c0uA, c0uA, c0uA), r0, c87w);
        return new C11474wl(new C11444wi(c11424wg, c11384wc), c11424wg, new C11454wj(c11384wc, (QuickPerformanceLogger) 1Bi.A03(16520)), new Object() { // from class: X.4wk
            public static final 1G9 A01;
            public static final 1G9 A02;
            public static final 1G9 A03;
            public static final 1G9 A04;
            public static final 1G9 A05;
            public static final 1G9 A06;
            public static final 1G9 A07;
            public static final 1G9 A08;
            public final 1Br A00 = 1Bq.A00(33013);

            static {
                1G9 r02 = 1G0.A0B;
                A03 = r02.A0F("autofill_bloks_contact_usage_cache_key/");
                A01 = r02.A0F("autofill_bloks_contact_save_cache_key/");
                A02 = r02.A0F("autofill_bloks_contact_update_cache_key/");
                A04 = r02.A0F("autofill_bloks_payment_save_cache_key/");
                A05 = r02.A0F("autofill_bloks_payment_usage_cache_key/");
                A06 = r02.A0F("autofill_internal_settings_root/");
                A08 = r02.A0F("autofill_passkey_opt_in/");
                A07 = r02.A0F("is_passkey_content_visible/");
            }
        }, c11384wc);
    }
}
