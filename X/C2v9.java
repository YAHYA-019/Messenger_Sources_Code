package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.IllegalFormatException;
import java.util.Iterator;

/* renamed from: X.2v9, reason: invalid class name */
/* loaded from: 2v9.class */
public final class C2v9 extends C2v1 {
    public final 1Up A00 = new 1Up(30);
    public final Boolean A01;

    public C2v9(Boolean bool) {
        this.A01 = bool;
    }

    public static void A00(2vG r301, StringBuilder sb) {
        sb.append("modules: [");
        Iterator it = r301.A09.iterator();
        String str = "";
        while (true) {
            String str2 = str;
            if (!it.hasNext()) {
                sb.append("]");
                return;
            }
            String str3 = (String) it.next();
            sb.append(str2);
            sb.append(str3);
            if (!r301.A08.contains(str3)) {
                sb.append("(*)");
            }
            str = InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1;
        }
    }

    public static void A01(C2v9 c2v9, StringBuilder sb) {
        try {
            String obj = sb.toString();
            if (c2v9.A01.booleanValue()) {
                0fH.A0k("ActionQueryTaskListener", obj);
            }
            c2v9.A00.A04(String.format("%d: %s", Long.valueOf(System.currentTimeMillis()), obj));
        } catch (IllegalFormatException unused) {
            c2v9.A00.A04("caught exception when enqueueing");
        }
    }
}
