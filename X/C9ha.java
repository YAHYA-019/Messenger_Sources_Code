package X;

import android.content.Context;
import com.facebook.messaging.media.resharehub.model.ReshareHubTabModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9ha, reason: invalid class name */
/* loaded from: 9ha.class */
public final class C9ha {
    public final 1Br A00 = 1Bq.A00(68388);

    public static final ReshareHubTabModel A00(Context context, ThreadKey threadKey, String str, String str2, int i) {
        ROu rOu;
        int i2;
        96S r0 = 96S.A02;
        if (11T.A0O(str, r0.value)) {
            rOu = new ROu();
            String string = context.getString(2131964467);
            rOu.A05 = string;
            C1pq.A08("contentDescription", string);
            rOu.A02 = C1u3.A3l;
            rOu.A00 = i;
            rOu.A08 = str2;
            rOu.A04 = threadKey;
            rOu.A01 = 2131964468;
            rOu.A03 = r0;
            rOu.A06 = context.getString(2131964462);
            i2 = 2131964463;
        } else {
            96S r02 = 96S.A03;
            if (!11T.A0O(str, r02.value)) {
                return null;
            }
            rOu = new ROu();
            String string2 = context.getString(2131964473);
            rOu.A05 = string2;
            C1pq.A08("contentDescription", string2);
            rOu.A02 = C1u3.A0u;
            rOu.A00 = i;
            rOu.A08 = str2;
            rOu.A04 = threadKey;
            rOu.A01 = 2131964474;
            rOu.A03 = r02;
            rOu.A06 = context.getString(2131964465);
            i2 = 2131964466;
        }
        rOu.A07 = context.getString(i2);
        return new ReshareHubTabModel(rOu);
    }

    public final ReshareHubTabModel A01(Context context, ThreadKey threadKey, String str) {
        boolean A1X = 7zP.A1X(str);
        List A19 = 4YU.A19(2yD.A02(1Br.A07(((C6h2) 1Br.A0B(this.A00)).A00), 36882627927606431L), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A1X ? 1 : 0);
        if (1BK.A1Y(A19)) {
            return A00(context, threadKey, (String) A19.get(A1X ? 1 : 0), str, A1X ? 1 : 0);
        }
        return null;
    }

    public final List A02(Context context, ThreadKey threadKey, String str) {
        int i = 0;
        int i2 = 0;
        List A0M = 0CU.A0M(2yD.A02(1Br.A07(((C6h2) 1Br.A0B(this.A00)).A00), 36882627927606431L), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 7zP.A1X(str) ? 1 : 0);
        ArrayList A0z = 1BL.A0z(A0M);
        for (Object obj : A0M) {
            i++;
            if (i2 < 0) {
                C0s8.A18();
                throw 0Q8.createAndThrow();
            }
            A0z.add(A00(context, threadKey, (String) obj, str, i2));
            i2 = i;
        }
        return 0QD.A0S(A0z);
    }
}
