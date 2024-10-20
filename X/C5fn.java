package X;

import android.text.TextUtils;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ProfileRange;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* renamed from: X.5fn, reason: invalid class name */
/* loaded from: 5fn.class */
public final class C5fn {
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.5fn] */
    public static C5fn A00(Message message) {
        ?? obj = new Object();
        ImmutableList immutableList = message.A0x;
        if (immutableList != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            int size = immutableList.size();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= size) {
                    break;
                }
                ProfileRange profileRange = (ProfileRange) immutableList.get(i2);
                arrayList.add(String.valueOf(profileRange.offset));
                arrayList2.add(String.valueOf(profileRange.length));
                arrayList3.add(String.valueOf(profileRange.id));
                arrayList4.add(profileRange.type);
                i = i2 + 1;
            }
            obj.A02 = TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, arrayList);
            obj.A01 = TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, arrayList2);
            obj.A00 = TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, arrayList3);
            obj.A03 = TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, arrayList4);
        }
        return obj;
    }
}
