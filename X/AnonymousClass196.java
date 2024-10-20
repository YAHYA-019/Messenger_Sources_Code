package X;

import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.196, reason: invalid class name */
/* loaded from: 196.class */
public final class AnonymousClass196 {
    public final List A00;

    public AnonymousClass196(List list) {
        this.A00 = Collections.unmodifiableList(new ArrayList(list));
    }

    public String toString() {
        return TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, this.A00.toArray());
    }
}
