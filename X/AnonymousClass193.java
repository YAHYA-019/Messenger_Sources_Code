package X;

import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.193, reason: invalid class name */
/* loaded from: 193.class */
public final class AnonymousClass193 {
    public final List A00;

    public AnonymousClass193(List list) {
        this.A00 = Collections.unmodifiableList(new ArrayList(list));
    }

    public String toString() {
        return TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, this.A00.toArray());
    }
}
