package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.messaging.livelocation.bindings.MessengerLiveLocationBooter;
import com.facebook.messaging.livelocation.bindings.MessengerLiveLocationBooterService;

/* renamed from: X.3uk, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3uk.class */
public final class C02243uk implements C02l {
    @Override // X.C02l
    public final void CFb(Context context, Intent intent, C01q c01q) {
        int A00 = C09o.A00(-190224083);
        0fH.A07(MessengerLiveLocationBooter.class, intent, "Received intent: %s");
        0Fc.A00(context, intent, MessengerLiveLocationBooterService.class);
        C09o.A01(-139419611, A00);
    }
}
