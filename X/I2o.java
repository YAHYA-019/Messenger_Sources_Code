package X;

import android.content.Context;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.maps.GenericMapsFragment;
import com.google.android.gms.location.LocationServices;

/* loaded from: I2o.class */
public final class I2o {
    public FbFragmentActivity A00;
    public GenericMapsFragment A01;
    public Integer A02;
    public 1BY A04;
    public String A05;
    public String A06;
    public final 1gL A07 = new Q5F(this);
    public final Hdf A0C = (Hdf) 1Bn.A0E((Context) null, (1BY) null, 116307);
    public final C00i A0B = AbH.A0F();
    public final C00i A0A = 1BV.A01((1BY) null, 49829);
    public final HQU A0D = (HQU) 1Bi.A03(116309);
    public final C00i A09 = 1BV.A01((1BY) null, 82439);
    public final C00i A08 = 1BQ.A02(131080);
    public boolean A03 = false;

    public I2o(1BO r302) {
        this.A04 = 7zL.A0Q(r302);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.fragment.app.Fragment, java.lang.Object, com.facebook.maps.GenericMapsFragment] */
    public static void A00(I2o i2o, Integer num) {
        String str;
        HQU hqu = i2o.A0D;
        String str2 = i2o.A06;
        String str3 = i2o.A05;
        switch (num.intValue()) {
            case 1:
                str = "DIALOG_CANCEL";
                break;
            case 2:
                str = "DIALOG_NOT_NEEDED";
                break;
            case 3:
                str = "DIALOG_NOT_POSSIBLE";
                break;
            case 4:
                str = "UNKNOWN_FAILURE";
                break;
            default:
                str = "DIALOG_SUCCESS";
                break;
        }
        hqu.A00.A00("gms_ls_upsell_result", new SGL(hqu, str2, str3, str));
        ?? r0 = i2o.A01;
        String str4 = r0.A07;
        if (str4.equals("mechanism_get_direction_button")) {
            CH8 ch8 = r0.A0G;
            CH8.A00(r0.getContext(), ch8, r0.A08, (String) null, r0.A00, r0.A01);
            return;
        }
        if (!str4.equals("mechanism_my_location_button")) {
            0fH.A0B(GenericMapsFragment.class, "Unrecognized mechanism");
            return;
        }
        if (num == 0S2.A00 || num == 0S2.A0C) {
            if (r0.A04.A03() == 0S2.A0N) {
                r0.A06.A1P(new ITl((Object) r0, 1));
            } else {
                r0.A03.A0M(r0.getActivity()).AHR(new IgF((Object) r0, 0), GenericMapsFragment.A0H);
            }
        }
    }

    public void A01(HHc hHc, String str) {
        if (this.A03 || this.A02 != null) {
            return;
        }
        this.A00.getClass();
        this.A01.getClass();
        this.A06 = "surface_generic_map_fragment";
        this.A05 = str;
        HQU hqu = this.A0D;
        hqu.A00.A00("gms_ls_upsell_requested", new SGK(hqu, str));
        5iG A0h = DKF.A0h(this.A0A);
        Qnl qnl = Qnl.A01;
        Hdf hdf = this.A0C;
        Koi koi = hdf.A01;
        AnonymousClass286 anonymousClass286 = LocationServices.A01;
        S5A s5a = new S5A();
        K2P A00 = koi.A00(null, anonymousClass286, s5a, s5a);
        s5a.A00 = A00;
        A00.A08();
        A0h.A04(new C3270Job(this, 1), 2FP.A00(new Fvn(hHc, hdf, 0), s5a.A01, 1JU.A01), qnl);
    }
}
