package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messenger.platform_logger.MPLTracker;

/* renamed from: X.3gb, reason: invalid class name */
/* loaded from: 3gb.class */
public final class C3gb implements Runnable {
    public static final String __redex_internal_original_name = "BgColdStartNotificationTracker$scheduleEndMarkerOnTimeout$1$1";
    public final /* synthetic */ 1QI A00;
    public final /* synthetic */ 2yR A01;

    public C3gb(1QI r302, 2yR r303) {
        this.A01 = r303;
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        2yR r0 = this.A01;
        1QI r02 = this.A00;
        MPLTracker.surfaceLeft(r02.A00, 0, 1Br.A01(((1Pw) r0).A00), PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
    }
}
