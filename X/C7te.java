package X;

import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.7te, reason: invalid class name */
/* loaded from: 7te.class */
public final class C7te {
    public final HPb A00;

    public C7te(HPb hPb) {
        this.A00 = hPb;
    }

    public static C7te A00(Context context, ThreadSummary threadSummary) {
        return new C7te((HPb) C1Y6.A00(context, "com_facebook_messaging_threadview_plugins_interfaces_logging_ThreadViewConversionLoggingInterfaceSpec", "All", new Object[]{threadSummary}));
    }
}
