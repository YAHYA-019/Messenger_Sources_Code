package X;

import android.net.Uri;
import android.view.View;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.coplay.CoplayImplementation;

/* loaded from: G3t.class */
public final class G3t implements Runnable {
    public static final String __redex_internal_original_name = "CoplayImplementation$showCoplayGameStartedNotification$1";
    public final /* synthetic */ CoplayImplementation A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public G3t(CoplayImplementation coplayImplementation, String str, String str2) {
        this.A00 = coplayImplementation;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CoplayImplementation coplayImplementation = this.A00;
        I8a i8a = ((HEt) coplayImplementation).A00;
        if (i8a != null) {
            HBr hBr = HBr.A0B;
            String string = coplayImplementation.A00.getString(2131955114, this.A02, this.A01);
            11T.A0A(string);
            i8a.A02(new GjI((Uri) null, (View.OnClickListener) null, (View.OnClickListener) null, (C1u3) null, C1u4.SIZE_32, (Hre) null, (Hre) null, hBr, string, (CharSequence) null, C0ty.A00, 0, 0, 0, 3000L, false, false));
        }
    }
}
