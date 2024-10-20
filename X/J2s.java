package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.effect.EffectImplementation;
import com.facebook.user.model.User;

/* loaded from: J2s.class */
public final class J2s implements Runnable {
    public static final String __redex_internal_original_name = "AvatarInRtcPresenter$maybeApplyFirstAvatarForGroupAvatar$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ HbO A01;
    public final /* synthetic */ I8X A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public J2s(Context context, HbO hbO, I8X i8x, String str, boolean z) {
        this.A02 = i8x;
        this.A00 = context;
        this.A01 = hbO;
        this.A04 = z;
        this.A03 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        int i;
        Object[] objArr;
        String str;
        I8X i8x = this.A02;
        IDX idx = (IDX) 1Br.A0B(i8x.A06);
        Context context2 = this.A00;
        idx.A05(context2, this.A01, true, false, this.A04, false, true);
        ICN icn = (ICN) 1Br.A0B(i8x.A0D);
        String str2 = this.A03;
        String A0u = 1BK.A0u(context2, 2131960140);
        for (GgK ggK : icn.A0K) {
            if (ggK instanceof GgK) {
                EffectImplementation effectImplementation = ggK.A00;
                User A00 = EffectImplementation.A00(effectImplementation, str2);
                I8a i8a = ((HEt) effectImplementation).A00;
                if (i8a != null) {
                    HBr hBr = HBr.A0o;
                    if (A00 == null || (str = A00.A0X.firstName) == null || str.length() == 0) {
                        context = effectImplementation.A01;
                        i = 2131964930;
                        objArr = new Object[]{A0u};
                    } else {
                        context = effectImplementation.A01;
                        i = 2131964931;
                        objArr = new Object[]{str, A0u};
                    }
                    String string = context.getString(i, objArr);
                    C1u3 c1u3 = 5Wx.A03.migIconName;
                    11T.A0D(string);
                    i8a.A02(new GjI((Uri) null, (View.OnClickListener) null, (View.OnClickListener) null, c1u3, C1u4.SIZE_32, (Hre) null, (Hre) null, hBr, string, (CharSequence) null, C0ty.A00, 0, 0, 0, 3000L, false, true));
                }
            }
        }
    }
}
