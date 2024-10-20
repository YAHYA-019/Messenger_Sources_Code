package X;

import android.os.Handler;
import android.os.Message;
import com.facebook.video.engine.api.VideoPlayerParams;
import com.facebook.video.plugins.LoadingSpinnerPlugin;
import java.lang.ref.WeakReference;

/* renamed from: X.6dx, reason: invalid class name */
/* loaded from: 6dx.class */
public final class C6dx extends Handler {
    public WeakReference A00;

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        VideoPlayerParams videoPlayerParams;
        LoadingSpinnerPlugin loadingSpinnerPlugin = (LoadingSpinnerPlugin) this.A00.get();
        if (loadingSpinnerPlugin != null) {
            6TI r0 = loadingSpinnerPlugin.A00;
            boolean z = false;
            if (r0 != null && (videoPlayerParams = r0.A03) != null && videoPlayerParams.A1k) {
                LoadingSpinnerPlugin.A02(loadingSpinnerPlugin, true);
                return;
            }
            6Tu r02 = ((C6d6) loadingSpinnerPlugin).A08;
            if (r02 != null) {
                if (r02.B3e() == 6UR.A02) {
                    z = true;
                }
                LoadingSpinnerPlugin.A02(loadingSpinnerPlugin, z);
            }
        }
    }
}
