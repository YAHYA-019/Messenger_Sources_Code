package X;

import android.content.Context;
import android.content.IntentFilter;
import java.util.Set;

/* loaded from: Kji.class */
public final class Kji {
    public final Context A00;
    public final IntentFilter A01;
    public final Set A02;

    public Kji(Context context) {
        new L1U("AppUpdateListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.A02 = AnonymousClass001.A0v();
        this.A01 = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.A00 = applicationContext != null ? applicationContext : context;
    }
}
