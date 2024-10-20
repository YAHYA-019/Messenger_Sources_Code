package X;

import android.net.Uri;
import android.view.View;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.coplay.CoplayImplementation;

/* loaded from: G53.class */
public final class G53 implements Runnable {
    public static final String __redex_internal_original_name = "CoplayImplementation$coplayPlayerSharedStateListener$1$onGenericNotificationRequested$1";
    public final /* synthetic */ Hre A00;
    public final /* synthetic */ CoplayImplementation A01;
    public final /* synthetic */ Long A02;
    public final /* synthetic */ String A03;

    public G53(Hre hre, CoplayImplementation coplayImplementation, Long l, String str) {
        this.A01 = coplayImplementation;
        this.A02 = l;
        this.A03 = str;
        this.A00 = hre;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I8a i8a = ((HEt) this.A01).A00;
        if (i8a != null) {
            HBr hBr = HBr.A0D;
            Long l = this.A02;
            long longValue = l != null ? l.longValue() : 3000L;
            i8a.A02(new GjI((Uri) null, (View.OnClickListener) null, (View.OnClickListener) null, (C1u3) null, C1u4.SIZE_32, this.A00, (Hre) null, hBr, this.A03, (CharSequence) null, C0ty.A00, 0, 0, 0, longValue, false, false));
        }
    }
}
