package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.thread.plugins.platypustoggle.longpresstoggle.ThreadSettingsLongPressToggle;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6lP, reason: invalid class name */
/* loaded from: 6lP.class */
public final class C6lP {
    public final 6lN A00;

    public C6lP(6lN r302) {
        this.A00 = r302;
    }

    public void A00() {
        6lO r0 = this.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r02 = r0.A02;
        r02.A08("com.facebook.messaging.threadsettings.plugins.interfaces.threadviewentrypoint.longpresshandler.ThreadSettingsButtonLongPressHandlerSpec", "messaging.threadsettings.threadviewentrypoint.longpresshandler.ThreadSettingsButtonLongPressHandlerSpec", "onLongPress", andIncrement);
        Exception e = null;
        try {
            if (6lO.A00(r0)) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r02.A0A("com.facebook.messaging.msys.thread.plugins.platypustoggle.longpresstoggle.ThreadSettingsLongPressToggle", "messaging.msys.thread.platypustoggle.longpresstoggle.ThreadSettingsLongPressToggle", "com.facebook.messaging.threadsettings.plugins.interfaces.threadviewentrypoint.longpresshandler.ThreadSettingsButtonLongPressHandlerSpec", andIncrement2, "messaging.threadsettings.threadviewentrypoint.longpresshandler.ThreadSettingsButtonLongPressHandlerSpec", "com.facebook.messaging.msys.thread.plugins.platypustoggle.PlatypusToggleKillSwitch", "onLongPress");
                try {
                    try {
                        ThreadSettingsLongPressToggle threadSettingsLongPressToggle = r0.A00;
                        C77 c77 = (C77) 1Br.A0B(threadSettingsLongPressToggle.A00);
                        ThreadKey threadKey = threadSettingsLongPressToggle.A01;
                        Context A00 = FbInjector.A00();
                        11T.A0A(A00);
                        c77.A00(A00, threadKey, true);
                        r02.A09("messaging.msys.thread.platypustoggle.longpresstoggle.ThreadSettingsLongPressToggle", "messaging.threadsettings.threadviewentrypoint.longpresshandler.ThreadSettingsButtonLongPressHandlerSpec", "onLongPress", andIncrement2);
                    } catch (Throwable th) {
                        r02.A04(e, "messaging.msys.thread.platypustoggle.longpresstoggle.ThreadSettingsLongPressToggle", "messaging.threadsettings.threadviewentrypoint.longpresshandler.ThreadSettingsButtonLongPressHandlerSpec", "onLongPress", andIncrement2);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            }
            r02.A02((Exception) null, "messaging.threadsettings.threadviewentrypoint.longpresshandler.ThreadSettingsButtonLongPressHandlerSpec", "onLongPress", andIncrement);
        } catch (Throwable th2) {
            r02.A02(e, "messaging.threadsettings.threadviewentrypoint.longpresshandler.ThreadSettingsButtonLongPressHandlerSpec", "onLongPress", andIncrement);
            throw th2;
        }
    }

    public boolean A01() {
        6lO r0 = this.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r02 = r0.A02;
        r02.A08("com.facebook.messaging.threadsettings.plugins.interfaces.threadviewentrypoint.longpresshandler.ThreadSettingsButtonLongPressHandlerSpec", "messaging.threadsettings.threadviewentrypoint.longpresshandler.ThreadSettingsButtonLongPressHandlerSpec", "willHandleLongPress", andIncrement);
        boolean z = false;
        try {
            if (6lO.A00(r0)) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r02.A0A("com.facebook.messaging.msys.thread.plugins.platypustoggle.longpresstoggle.ThreadSettingsLongPressToggle", "messaging.msys.thread.platypustoggle.longpresstoggle.ThreadSettingsLongPressToggle", "com.facebook.messaging.threadsettings.plugins.interfaces.threadviewentrypoint.longpresshandler.ThreadSettingsButtonLongPressHandlerSpec", andIncrement2, "messaging.threadsettings.threadviewentrypoint.longpresshandler.ThreadSettingsButtonLongPressHandlerSpec", "com.facebook.messaging.msys.thread.plugins.platypustoggle.PlatypusToggleKillSwitch", "willHandleLongPress");
                z = true;
                r02.A09("messaging.msys.thread.platypustoggle.longpresstoggle.ThreadSettingsLongPressToggle", "messaging.threadsettings.threadviewentrypoint.longpresshandler.ThreadSettingsButtonLongPressHandlerSpec", "willHandleLongPress", andIncrement2);
            }
            r02.A02((Exception) null, "messaging.threadsettings.threadviewentrypoint.longpresshandler.ThreadSettingsButtonLongPressHandlerSpec", "willHandleLongPress", andIncrement);
            return z;
        } catch (Throwable th) {
            r02.A02((Exception) null, "messaging.threadsettings.threadviewentrypoint.longpresshandler.ThreadSettingsButtonLongPressHandlerSpec", "willHandleLongPress", andIncrement);
            throw th;
        }
    }
}
