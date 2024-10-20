package X;

import android.R;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.media.AudioAttributesCompat;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.lowbatterynotification.LowBatteryNotificationImplementation;
import com.facebook.rsys.call.gen.CallModel;

/* loaded from: Is9.class */
public final class Is9 implements Runnable {
    public static final String __redex_internal_original_name = "LowBatteryNotificationImplementation$maybeReportLowBattery$1";
    public final /* synthetic */ LowBatteryNotificationImplementation A00;

    public Is9(LowBatteryNotificationImplementation lowBatteryNotificationImplementation) {
        this.A00 = lowBatteryNotificationImplementation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I8a i8a;
        GjI gjI;
        String A0u;
        IKB ikb;
        LowBatteryNotificationImplementation lowBatteryNotificationImplementation = this.A00;
        C00i c00i = lowBatteryNotificationImplementation.A05.A00;
        if (LowBatteryNotificationImplementation.A01(lowBatteryNotificationImplementation, GOq.A0o(c00i))) {
            C00i c00i2 = lowBatteryNotificationImplementation.A04.A00;
            if (1BK.A0M(c00i2).AZk(2342160621308554723L)) {
                IEj A0o = GOp.A0o(lowBatteryNotificationImplementation.A06);
                I4m i4m = ((HkQ) 1Br.A0B(lowBatteryNotificationImplementation.A08)).A08;
                AudioAttributesCompat audioAttributesCompat = IEj.A0N;
                A0o.A08(i4m, true);
            }
            if (!1BK.A0M(c00i2).AZk(36317612094795234L) || (i8a = ((HEt) lowBatteryNotificationImplementation).A00) == null) {
                return;
            }
            HBr hBr = HBr.A0Z;
            Context context = lowBatteryNotificationImplementation.A00;
            String A0u2 = 1BK.A0u(context, 2131958839);
            C1u3 c1u3 = C1u3.A0n;
            CallModel A0V = AbL.A0V(c00i.get());
            int B6U = 7zQ.A0m(lowBatteryNotificationImplementation.A03).B6U();
            if (1BK.A0M(c00i2).AZk(36317612095253990L) && IFr.A0H(A0V)) {
                A0u = 1BK.A0u(context, 2131958840);
                ikb = new IKB(lowBatteryNotificationImplementation, 26);
            } else if (!1BK.A0M(c00i2).AZk(2342160621308685796L)) {
                gjI = new GjI((Uri) null, (View.OnClickListener) null, (View.OnClickListener) null, c1u3, C1u4.SIZE_32, (Hre) null, (Hre) null, hBr, A0u2, (CharSequence) null, C0ty.A00, B6U, 0, 0, 7000L, false, false);
                i8a.A02(gjI);
            } else {
                A0u = 1BK.A0u(context, R.string.ok);
                ikb = IK9.A00;
            }
            gjI = new GjI((Uri) null, (View.OnClickListener) null, (View.OnClickListener) null, c1u3, C1u4.SIZE_32, new Hre(ikb, A0u), (Hre) null, hBr, A0u2, (CharSequence) null, C0ty.A00, B6U, 0, 0, -1, true, false);
            i8a.A02(gjI);
        }
    }
}
