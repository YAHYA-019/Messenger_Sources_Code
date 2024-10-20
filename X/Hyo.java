package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.expression.effect.avatar.AvatarLoadingProgressManager;

/* loaded from: Hyo.class */
public abstract class Hyo {
    public HVI A00;
    public Integer A01;
    public 4cZ A02;
    public boolean A03;

    public static final void A00(Hyo hyo, int i, int i2) {
        int i3 = ActionId.ON_VIEW_CREATED_END - i;
        long j = i2 / i3;
        4cZ r0 = hyo.A02;
        if (r0 != null) {
            r0.AE0(null);
        }
        hyo.A02 = 2aK.A02(0DL.A00, new AvatarLoadingProgressManager.runLoaderProgress.1(hyo, (0DR) null, i3, j), (2aI) ((8HT) hyo).A00.getValue());
    }

    public static final void A01(Hyo hyo, Integer num) {
        Integer num2;
        hyo.A01 = num;
        HVI hvi = hyo.A00;
        if (hvi != null) {
            GrD grD = hvi.A00;
            DKE.A0K(grD.A0a).post(new Irj(grD));
        }
        if (num == null || num.intValue() != 80 || hyo.A03 || (num2 = hyo.A01) == null) {
            return;
        }
        int intValue = num2.intValue();
        A00(hyo, intValue, (ActionId.ON_VIEW_CREATED_END - intValue) * ActionId.ACTION_BAR_COMPLETE * 10);
    }
}
