package X;

import com.facebook.common.util.TriState;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.1vc, reason: invalid class name */
/* loaded from: 1vc.class */
public final /* synthetic */ class C1vc implements Runnable {
    public static final String __redex_internal_original_name = "RageShakeDetector$$ExternalSyntheticLambda3";
    public final /* synthetic */ C1va A00;

    @Override // java.lang.Runnable
    public final void run() {
        C1va c1va = this.A00;
        if (!((1Fv) c1va.A0B.get()).A04().A07) {
            C00i c00i = c1va.A0A;
            FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) c00i.get();
            1G2 r0 = 4tE.A0C;
            long Av1 = fbSharedPreferences.Av1(r0, 0L);
            if (Av1 == 0 || ((C0dp) c1va.A09.get()).now() - Av1 >= 86400000) {
                TriState AZo = ((FbSharedPreferences) c00i.get()).AZo(4tE.A07);
                FbSharedPreferences fbSharedPreferences2 = (FbSharedPreferences) c00i.get();
                1G2 r02 = 4tE.A08;
                TriState AZo2 = fbSharedPreferences2.AZo(r02);
                C00i c00i2 = c1va.A0D;
                EventBuilder markEventBuilder = ((QuickPerformanceLogger) c00i2.get()).markEventBuilder(30550534, "");
                int ordinal = AZo.ordinal();
                markEventBuilder.annotate("status", ordinal != 1 ? ordinal != 0 ? "default" : "override_enabled" : "override_disabled").report();
                1Ql edit = ((FbSharedPreferences) c00i.get()).edit();
                edit.CaH(r0, ((C0dp) c1va.A09.get()).now());
                edit.commit();
                if (AZo.isSet()) {
                    1Ql.A01(1BL.A0V(c00i), r02, AZo.asBoolean());
                    if (AZo.compareTo(AZo2) != 0) {
                        EventBuilder annotate = 1BK.A0U(c00i2).markEventBuilder(30549118, "").annotate("new_status", ordinal != 1 ? ordinal != 0 ? "default" : "override_enabled" : "override_disabled");
                        int ordinal2 = AZo2.ordinal();
                        annotate.annotate("old_status", ordinal2 != 1 ? ordinal2 != 0 ? "default" : "override_enabled" : "override_disabled").report();
                    }
                }
            }
        }
    }
}
