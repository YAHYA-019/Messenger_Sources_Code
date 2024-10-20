package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6br, reason: invalid class name */
/* loaded from: 6br.class */
public final class C6br {
    public final C6bp A00;

    public C6br(C6bp c6bp) {
        this.A00 = c6bp;
    }

    public 82W A00() {
        C6bq c6bq = this.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = c6bq.A01;
        r0.A08("com.facebook.messaging.threadview.plugins.interfaces.titlebar.customtitle.TitleBarCustomTitleInterfaceSpec", "messaging.threadview.titlebar.customtitle.TitleBarCustomTitleInterfaceSpec", "provideInitialStateProps", andIncrement);
        82W r302 = null;
        try {
            if (C6bq.A00(c6bq)) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.copresence.plugins.threadheader.copresencecustomtitle.CopresenceCustomTitleImplementation", "messaging.copresence.threadheader.copresencecustomtitle.CopresenceCustomTitleImplementation", "com.facebook.messaging.threadview.plugins.interfaces.titlebar.customtitle.TitleBarCustomTitleInterfaceSpec", andIncrement2, "messaging.threadview.titlebar.customtitle.TitleBarCustomTitleInterfaceSpec", "com.facebook.messaging.copresence.plugins.threadheader.ThreadheaderKillSwitch", "provideInitialStateProps");
                try {
                    try {
                        new 82W(new C1rn(Float.valueOf(0.0f)));
                        r0.A09("messaging.copresence.threadheader.copresencecustomtitle.CopresenceCustomTitleImplementation", "messaging.threadview.titlebar.customtitle.TitleBarCustomTitleInterfaceSpec", "provideInitialStateProps", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "messaging.copresence.threadheader.copresencecustomtitle.CopresenceCustomTitleImplementation", "messaging.threadview.titlebar.customtitle.TitleBarCustomTitleInterfaceSpec", "provideInitialStateProps", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.threadview.titlebar.customtitle.TitleBarCustomTitleInterfaceSpec", "provideInitialStateProps", andIncrement);
            return r302;
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.threadview.titlebar.customtitle.TitleBarCustomTitleInterfaceSpec", "provideInitialStateProps", andIncrement);
            throw th2;
        }
    }
}
