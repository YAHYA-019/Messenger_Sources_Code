package X;

import android.net.Uri;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.List;

/* renamed from: X.2ek, reason: invalid class name */
/* loaded from: 2ek.class */
public final class C2ek implements C2ee {
    public final Uri A00;
    public final /* synthetic */ C2eb A01;

    public C2ek(C2eb c2eb) {
        this.A01 = c2eb;
        this.A00 = Uri.withAppendedPath(c2eb.A00, "search");
    }

    public final 3LX A00(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() != 2 && pathSegments.size() != 3) {
            throw AnonymousClass001.A0L("Invalid uri");
        }
        String[] split = 1BK.A14(pathSegments, 1).split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        1I0 r0 = new 1I0(4);
        for (String str : split) {
            r0.A05(str);
        }
        return new 3LX(this.A01, r0.A07(), pathSegments.size() < 3 ? "" : 1BK.A14(pathSegments, 2));
    }
}
