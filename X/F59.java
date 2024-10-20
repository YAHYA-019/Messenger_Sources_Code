package X;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import com.facebook.photos.upload.receiver.ConnectivityChangeReceiver;

/* loaded from: F59.class */
public final class F59 {
    public BroadcastReceiver A00;
    public final Context A01 = 7zM.A0A();

    public static final void A00(F59 f59, int i) {
        Context context = f59.A01;
        ComponentName componentName = new ComponentName(context, (Class<?>) ConnectivityChangeReceiver.class);
        if (context.getPackageManager().getComponentEnabledSetting(componentName) != i) {
            context.getPackageManager().setComponentEnabledSetting(componentName, i, 1);
        }
    }
}
