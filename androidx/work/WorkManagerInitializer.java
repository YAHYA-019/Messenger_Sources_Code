package androidx.work;

import X.0Ux;
import X.4IS;
import X.4IU;
import X.4IW;
import X.4IX;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: WorkManagerInitializer.class */
public final class WorkManagerInitializer implements 0Ux {
    public static final String A00 = 4IS.A01("WrkMgrInitializer");

    public /* bridge */ /* synthetic */ Object create(Context context) {
        4IS.A00().A02(A00, "Initializing WorkManager with default configuration.");
        4IU.A01(context, new 4IX(new 4IW()));
        return 4IU.A00(context);
    }

    public List dependencies() {
        return Collections.emptyList();
    }
}
