package com.facebook.messaging.nativepagereply.plugins.businesstools.composerentrypoint;

import X.0S2;
import X.1BQ;
import X.1BV;
import X.6Qe;
import X.6Qf;
import X.Bfg;
import X.C00i;
import X.C1pq;
import X.C8B;
import android.content.Context;
import com.facebook.messaging.composer.OneLineComposerView;

/* loaded from: BusinessToolsComposerEntryPointImplementation.class */
public final class BusinessToolsComposerEntryPointImplementation {
    public final C00i A01 = 1BQ.A02(17077);
    public final C00i A02 = 1BV.A00(68281);
    public final C00i A00 = 1BV.A00(83400);

    public static final BusinessToolsComposerEntryPointImplementation A00() {
        return new BusinessToolsComposerEntryPointImplementation();
    }

    public static boolean A01(Context context, 6Qf r302, int i) {
        Integer num = 0S2.A1J;
        String string = context.getString(i);
        C1pq.A08("title", string);
        return ((OneLineComposerView) ((6Qe) r302).A00.A0A).A0j.A01(new C8B((Bfg) null, num, 0S2.A00, "business_tools", string));
    }
}
