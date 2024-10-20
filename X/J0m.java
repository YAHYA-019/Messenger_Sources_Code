package X;

import com.facebook.messaging.rtc.incall.plugins.notification.feature.moderatorcontrols.ModeratorControlsImplementation;

/* loaded from: J0m.class */
public final class J0m implements Runnable {
    public static final String __redex_internal_original_name = "ModeratorControlsImplementation$moderatorControlsStateListener$1$onModeratorToggledScreenshare$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ HBr A01;
    public final /* synthetic */ ModeratorControlsImplementation A02;

    public J0m(HBr hBr, ModeratorControlsImplementation moderatorControlsImplementation, int i) {
        this.A02 = moderatorControlsImplementation;
        this.A01 = hBr;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ModeratorControlsImplementation moderatorControlsImplementation = this.A02;
        I8a i8a = ((HEt) moderatorControlsImplementation).A00;
        if (i8a != null) {
            DKI.A0d(i8a, this.A01, 1BK.A0u(moderatorControlsImplementation.A00, this.A00));
        }
    }
}
