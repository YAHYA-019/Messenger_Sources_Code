package X;

import java.util.concurrent.Executor;

/* renamed from: X.3gd, reason: invalid class name */
/* loaded from: 3gd.class */
public final class C3gd implements Runnable {
    public static final String __redex_internal_original_name = "SystemMuteSettingNotification$createBannerNotificationRunnable$1";
    public final /* synthetic */ 2PY A00;
    public final /* synthetic */ 2PZ A01;

    public C3gd(2PY r302, 2PZ r303) {
        this.A01 = r303;
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final 2PZ r0 = this.A01;
        boolean A03 = ((2Pi) 1Br.A0B(r0.A0C)).A03();
        Executor executor = (Executor) 1Br.A0B(r0.A0D);
        final 2PY r02 = this.A00;
        executor.execute(!A03 ? new Runnable() { // from class: X.3ge
            public static final String __redex_internal_original_name = "SystemMuteSettingNotification$onSystemLevelNotificationSettingOff$1";

            @Override // java.lang.Runnable
            public final void run() {
                2PZ r03 = r0;
                2PP r04 = ((2PX) r03).A00;
                2PY r05 = r02;
                if (r04.A07(r05) || ((2PX) r03).A00.A07.A03() == r05) {
                    ((C47h) 1Br.A0B(r03.A06)).A01();
                }
            }
        } : new Runnable() { // from class: X.3gf
            public static final String __redex_internal_original_name = "SystemMuteSettingNotification$onSystemLevelNotificationSettingOn$1";

            @Override // java.lang.Runnable
            public final void run() {
                ((2PX) r0).A00.A04(r02);
            }
        });
    }
}
