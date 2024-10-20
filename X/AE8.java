package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: AE8.class */
public final class AE8 implements Runnable {
    public static final String __redex_internal_original_name = "HDMIConnectionListener$4";
    public final /* synthetic */ 81Z A00;

    public AE8(81Z r302) {
        this.A00 = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        AtomicReference atomicReference;
        String str;
        String obj;
        String str2;
        81Z r0 = this.A00;
        Context context = r0.A00;
        if (context == null || (str = (atomicReference = r0.A02).get()) == 0) {
            return;
        }
        try {
            context.unregisterReceiver((BroadcastReceiver) atomicReference.get());
            str = "HDMIConnectionListener";
            0fH.A0j(str, "Unregistered HDMI listener for DRM playback");
        } catch (IllegalArgumentException unused) {
            obj = str.toString();
            str2 = "Failed to unregister HDMI listener. Receiver not registered : %s";
            0fH.A0g(obj, "HDMIConnectionListener", str2);
        } catch (RuntimeException unused2) {
            obj = str.toString();
            str2 = "Failed to unregister HDMI listener. : %s";
            0fH.A0g(obj, "HDMIConnectionListener", str2);
        }
    }
}
