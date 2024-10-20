package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebookpay.addresstypeahead.repositoryimpl.AddressTypeaheadRepositoryImpl;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;

/* loaded from: Ks7.class */
public final class Ks7 {
    public final LZr A00;
    public final LZv A02;
    public final LZv A03;
    public final KpW A04;
    public final Ep5 A05;
    public final GKt A09;
    public final LZq A0A;
    public final C15h A0E;
    public final Context A0F;
    public final KpW A0H;
    public final C15h A0I;
    public final C15h A0J;
    public final ECPRepositoryImpl A06 = new ECPRepositoryImpl();
    public final RaZ A0B = new RaZ();
    public final LZp A0C = new LZp();
    public final RSg A0D = new RSg();
    public final ErP A07 = new Object();
    public final AddressTypeaheadRepositoryImpl A0G = new AddressTypeaheadRepositoryImpl();
    public final RHg A08 = new RHg();
    public final RHf A01 = new RHf();

    /* JADX WARN: Type inference failed for: r0v26, types: [X.ErP, java.lang.Object] */
    public Ks7(Context context, LZv lZv, KpW kpW, GKt gKt, C15h c15h, C15h c15h2, C15h c15h3) {
        this.A0F = context;
        this.A0I = c15h;
        this.A0J = c15h2;
        this.A02 = lZv;
        this.A0H = kpW;
        this.A09 = gKt;
        this.A0E = c15h3;
        this.A00 = new LZr(context);
        this.A0A = new LZq(context);
        this.A05 = new Ep5(context);
        this.A03 = lZv;
        this.A04 = kpW;
    }

    public View A00(Context context, ViewGroup viewGroup, KP0 kp0) {
        int i;
        11T.A0H(context, kp0);
        this.A0J.get();
        LayoutInflater from = LayoutInflater.from(context);
        11T.A0A(from);
        switch (kp0.ordinal()) {
            case 0:
                i = 2132541899;
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 10:
            case 11:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 42:
            case ActionId.IN_PROGRESS /* 49 */:
                i = 2132541900;
                break;
            case 6:
                i = 2132541901;
                break;
            case 8:
                i = 2132541902;
                break;
            case 9:
                i = 2132541886;
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 23:
            case 50:
                i = 2132541871;
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
            default:
                throw AnonymousClass002.A0C(kp0, "{ECPWidgetFactory} Widget is not found for identifier => ", AnonymousClass001.A0k());
            case 24:
                i = 2132541980;
                break;
            case 25:
                i = 2132541898;
                break;
            case 26:
                i = 2132541876;
                break;
            case 37:
                i = 2132541881;
                break;
            case 38:
                i = 2132541882;
                break;
            case 39:
                i = 2132541883;
                break;
            case 40:
                i = 2132541872;
                break;
            case 41:
                i = 2132541874;
                break;
            case 43:
                i = 2132541891;
                break;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                i = 2132541892;
                break;
            case 46:
                i = 2132541875;
                break;
            case ActionId.ON_START_END /* 47 */:
                i = 2132541887;
                break;
            case ActionId.QUEUED /* 48 */:
                i = 2132541893;
                break;
            case ActionId.UNKNOWN /* 51 */:
                i = 2132541888;
                break;
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                i = 2132541879;
                break;
        }
        View inflate = from.inflate(i, viewGroup, false);
        11T.A0A(inflate);
        return inflate;
    }

    public Fragment A01(Bundle bundle, String str) {
        11T.A0F(str, 0);
        Fragment A00 = ((Esb) this.A0I.get()).A00(bundle, str);
        11T.A0A(A00);
        return A00;
    }
}
