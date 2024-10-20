package X;

import android.net.Uri;
import android.view.View;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.coplay.CoplayImplementation;
import java.util.List;

/* loaded from: G3v.class */
public final class G3v implements Runnable {
    public static final String __redex_internal_original_name = "CoplayImplementation$showPlayerLeftGameNotification$1";
    public final /* synthetic */ CoplayImplementation A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;

    public G3v(CoplayImplementation coplayImplementation, String str, List list) {
        this.A00 = coplayImplementation;
        this.A01 = str;
        this.A02 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CoplayImplementation coplayImplementation = this.A00;
        I8a i8a = ((HEt) coplayImplementation).A00;
        if (i8a != null) {
            i8a.A02(new GjI((Uri) null, (View.OnClickListener) null, (View.OnClickListener) null, (C1u3) null, C1u4.SIZE_32, (Hre) null, (Hre) null, HBr.A0F, AbK.A13(coplayImplementation.A00, this.A01, 2131955075), (CharSequence) null, this.A02, 0, 0, 0, 3000L, false, false));
        }
        C6J A03 = DKG.A0Z(coplayImplementation.A02).A03(coplayImplementation.A01);
        A03.A00 = BOh.A08;
        A03.A00();
    }
}
