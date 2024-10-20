package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.moderatorcontrols.ModeratorControlsImplementation;

/* loaded from: Ix7.class */
public final class Ix7 implements Runnable {
    public static final String __redex_internal_original_name = "ModeratorControlsImplementation$moderatorControlsStateListener$1$onParticipantMuted$1";
    public final /* synthetic */ ModeratorControlsImplementation A00;
    public final /* synthetic */ String A01;

    public Ix7(ModeratorControlsImplementation moderatorControlsImplementation, String str) {
        this.A00 = moderatorControlsImplementation;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I9O A0u;
        ModeratorControlsImplementation moderatorControlsImplementation = this.A00;
        String str = this.A01;
        if (str == null || (A0u = GOq.A0u(moderatorControlsImplementation.A02, str)) == null) {
            return;
        }
        I8a i8a = ((HEt) moderatorControlsImplementation).A00;
        if (i8a != null) {
            HBr hBr = HBr.A0i;
            Context context = moderatorControlsImplementation.A00;
            String A0v = 1BK.A0v(context, A0u.A07, 2131965089);
            String string = context.getString(2131965088);
            long j = HMb.A00;
            C1u3 c1u3 = C1u3.A4Q;
            C1u4 c1u4 = C1u4.SIZE_28;
            int AZN = 7zQ.A0m(moderatorControlsImplementation.A04).AZN();
            Hre hre = new Hre(new IKB(moderatorControlsImplementation, 27), 1BK.A0u(context, 2131965087));
            11T.A0D(A0v);
            i8a.A02(new GjI((Uri) null, (View.OnClickListener) null, (View.OnClickListener) null, c1u3, c1u4, hre, (Hre) null, hBr, A0v, string, C0ty.A00, AZN, 2132411448, 0, j, true, false));
        }
        if (GOq.A0s(moderatorControlsImplementation.A03).A0V) {
            IFc.A07(AbM.A0b(moderatorControlsImplementation.A0A), "mute_notification_executed", str);
        } else {
            IZI A0c = GOq.A0c(moderatorControlsImplementation.A07);
            GOn.A1R(A0c.A01, AbN.A0X(A0c), "PARTICIPANT_MUTE_NOTIFICATION_SHOWN");
        }
    }
}
