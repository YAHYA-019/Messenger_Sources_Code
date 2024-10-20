package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;

/* loaded from: F71.class */
public final class F71 {
    public static boolean A00(int i) {
        switch (i) {
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
            case 80:
            case 49856:
            case 49894:
            case 49909:
            case 49914:
            case 50033:
            case 50230:
            case 50233:
            case 50272:
            case 50314:
            case 50445:
            case 50616:
                return true;
            default:
                return false;
        }
    }

    public ExW A01(Context context, int i) {
        11T.A0F(context, 1);
        switch (i) {
            case 50540:
                return (ExW) 1Bn.A0A(99501);
            case 50694:
                return E3z.A00;
            case 50764:
                return E42.A00;
            case 50896:
                return E44.A00;
            case 50912:
                return E43.A00;
            case 51037:
                return E41.A00;
            case 51056:
                return E40.A00;
            default:
                return null;
        }
    }
}
