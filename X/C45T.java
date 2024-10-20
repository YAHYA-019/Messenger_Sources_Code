package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messenger.notification.engine.MSGNotificationEngineSyncPathIntegrator;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.messenger.notification.engine.MSGOpenPathRenderedNotification;
import com.facebook.msys.mca.Mailbox;

/* renamed from: X.45T, reason: invalid class name */
/* loaded from: 45T.class */
public final class C45T extends C1iw {
    public static final String __redex_internal_original_name = "NotificationEngineMsysOpenPathIntegrator$startImpl$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ 22W A01;
    public final /* synthetic */ Mailbox A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45T(FbUserSession fbUserSession, 22W r303, Mailbox mailbox) {
        super("Messenger Notification Engine Msys Sync Path Integrator Start");
        this.A01 = r303;
        this.A02 = mailbox;
        this.A00 = fbUserSession;
    }

    @Override // java.lang.Runnable
    public void run() {
        final 22W r0 = this.A01;
        C00i c00i = r0.A02.A00;
        if (!((2yD) c00i.get()).AZk(36317745241403042L)) {
            C00j.A05("NotificationEngineOpenPathIntegrator.start", 311237759);
        }
        C1233Aba c1233Aba = (C1233Aba) r0.A07.A00.get();
        c1233Aba.A01.setEnabled(c1233Aba.A02);
        MSGNotificationEngineValueProvider A00 = ((46Q) r0.A04.A00.get()).A00();
        final FbUserSession fbUserSession = this.A00;
        MSGNotificationEngineSyncPathIntegrator.MSGNotificationEngineOpenPathIntegratorCallback mSGNotificationEngineOpenPathIntegratorCallback = new MSGNotificationEngineSyncPathIntegrator.MSGNotificationEngineOpenPathIntegratorCallback() { // from class: X.46g
            @Override // com.facebook.messenger.notification.engine.MSGNotificationEngineSyncPathIntegrator.MSGNotificationEngineOpenPathIntegratorCallback
            public void onNotification(MSGOpenPathRenderedNotification mSGOpenPathRenderedNotification) {
                11T.A0F(mSGOpenPathRenderedNotification, 0);
                r0.A01(fbUserSession, mSGOpenPathRenderedNotification);
            }
        };
        C46i c46i = MSGNotificationEngineSyncPathIntegrator.Companion;
        r0.syncPathIntegrator = new MSGNotificationEngineSyncPathIntegrator(false, false, ((2yD) c00i.get()).AZk(36317745246252747L), A00, this.A02, mSGNotificationEngineOpenPathIntegratorCallback);
        ((C45q) r0.A06.A00.get()).A00(A00);
        if (((2yD) c00i.get()).AZk(36317745241403042L)) {
            return;
        }
        C00j.A01(586841702);
    }
}
