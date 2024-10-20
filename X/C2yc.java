package X;

import com.facebook.messenger.platform_logger.ttrclistener.TTRCMsysListeners;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.msys.mci.SessionedNotificationCenter;
import java.util.ArrayList;

/* renamed from: X.2yc, reason: invalid class name */
/* loaded from: 2yc.class */
public final class C2yc implements Runnable {
    public static final String __redex_internal_original_name = "MessengerMsysMailboxConfig$10";
    public final /* synthetic */ 1fC A00;

    public C2yc(1fC r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public void run() {
        C1jI c1jI = (C1jI) 1Bi.A03(66443);
        AccountSession accountSession = ((1fU) 1Lo.A06(this.A00.A01, 16752)).A00().A02;
        NotificationCenter A00 = C1ha.A00();
        SessionedNotificationCenter sessionedNotificationCenter = accountSession.getSessionedNotificationCenter();
        ArrayList A002 = C1jM.A00();
        11T.A0F(sessionedNotificationCenter, 1);
        if (c1jI.ttrcListener != null) {
            0fH.A0j("TTRCMsysListenerWrapper", "MPL TTRCMsysListenerWrapper Notification Center registeration ");
            TTRCMsysListeners tTRCMsysListeners = c1jI.ttrcListener;
            if (tTRCMsysListeners != null) {
                tTRCMsysListeners.mNativeHolder = TTRCMsysListeners.initNativeHolder(A002);
                TTRCMsysListeners.registerNotificationCenter(A00, sessionedNotificationCenter, true, false, false, 0L);
            }
        }
    }
}
