package X;

import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.base.Joiner;
import com.google.common.base.Platform;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.65n, reason: invalid class name */
/* loaded from: 65n.class */
public final class C65n {
    public static final Joiner A03 = new Joiner(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
    public List A00;
    public final FbSharedPreferences A01;
    public final 2BQ A02;

    public C65n() {
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) 1Bi.A03(33013);
        2BQ r0 = (2BQ) 1Bi.A03(16922);
        this.A01 = fbSharedPreferences;
        this.A02 = r0;
    }

    public static List A00(C65n c65n) {
        if (c65n.A00 == null) {
            String A3a = c65n.A01.A3a(RDN.A00, "");
            ArrayList A0t = AnonymousClass001.A0t(3);
            c65n.A00 = A0t;
            if (!Platform.stringIsNullOrEmpty(A3a)) {
                A0t.addAll(Arrays.asList(A3a.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)));
            }
        }
        return c65n.A00;
    }
}
