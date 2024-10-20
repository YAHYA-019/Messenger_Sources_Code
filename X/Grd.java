package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.presence.DefaultPresenceManager;
import java.util.BitSet;
import java.util.List;

/* loaded from: Grd.class */
public final class Grd extends BJB {
    public static final String __redex_internal_original_name = "M4ActiveStatusSettingsFragment";
    public FbUserSession A00;
    public C9fj A01;
    public List A02;
    public 1qG A03;
    public final DialogInterface.OnClickListener A04;
    public final DialogInterface.OnClickListener A05;
    public final View.OnClickListener A06;
    public final C5ww A0G;
    public final 1HN A0H;
    public final 2TO A0I;
    public final 1Br A0E = 1Bu.A00(83295);
    public final 1Br A0D = 1Bq.A00(67984);
    public final 1Br A0B = AbG.A0a();
    public final 1Br A0A = 1Bu.A02(this, 116336);
    public final 1Br A0C = 1Bq.A00(65723);
    public final 1Br A08 = 1Bu.A02(this, 84478);
    public final 1Br A07 = 1Bu.A00(65819);
    public final 1Br A09 = 7zM.A0d();
    public final 1Br A0F = 1Bq.A00(83274);

    /* JADX WARN: Multi-variable type inference failed */
    public Grd() {
        C9fj c9fj = C9fj.A03;
        11T.A0B(c9fj);
        this.A01 = c9fj;
        this.A02 = C0ty.A00;
        this.A06 = IKE.A00(this, ActionId.VIEW_DID_LOAD_BEGIN);
        this.A0G = new IaR(this, 2);
        this.A04 = IGS.A00(this, 18);
        this.A05 = IGS.A00(this, 19);
        this.A0I = new Gv4(this, 1);
        this.A0H = new Iel(this, 0);
    }

    public static final int A03(Grd grd) {
        C00i c00i = grd.A07.A00;
        int i = 0;
        if (!AbstractC2327GOs.A0J(c00i).AZk(36319553420540065L) && AbstractC2327GOs.A0J(c00i).AZk(36319553420408991L)) {
            i = Math.min(grd.A01.A00.size(), 3);
        }
        return i;
    }

    public static final void A06(Grd grd) {
        ((1X6) 1Br.A0B(grd.A0D)).A06(false);
        I2R i2r = (I2R) 1Br.A0B(grd.A0A);
        FbUserSession fbUserSession = grd.A00;
        if (fbUserSession == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        int A03 = A03(grd);
        HxE.A00((HxE) 1Br.A0B(i2r.A01), "android_availability_preference_switch_off_dialog_positive_button_clicked");
        1Br.A0C(i2r.A04);
        5Ch r0 = (5Ch) 1Br.A0B(i2r.A05);
        Long A01 = 0LZ.A00().A01(true);
        11T.A0A(A01);
        5Ch.A01(r0, (Boolean) null, false, (Boolean) null, 0S2.A0Y, String.valueOf(A01.longValue()));
        HbB hbB = (HbB) 4YU.A0o(fbUserSession, i2r.A00, 116333);
        AbstractC2327GOs.A0t(4YV.A0Z(hbB.A01), "toggle_off_confirm", A03, hbB.A00);
        I2R.A00(fbUserSession, i2r, false, false);
        grd.A1c();
    }

    public void A1L() {
        super/*X.1pK*/.A1L();
        ((2UV) 1Br.A0B(this.A08)).D1t(1BK.A0d());
    }

    public 1iF A1R() {
        return AbF.A0C(681066249448173L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        FbUserSession A01 = 1BM.A01(this);
        this.A00 = A01;
        if (A01 == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        this.A03 = (1qG) 1Lo.A08(A01, 66713);
        C00i c00i = this.A0C.A00;
        ((1XZ) c00i.get()).A77(this.A0I);
        ((1X6) 1Br.A0B(this.A0D)).A04(this.A0H);
        this.A02 = 0QD.A0V(DefaultPresenceManager.A05((DefaultPresenceManager) ((1XZ) c00i.get()), -1, true));
        ((2UV) 1Br.A0B(this.A08)).A01 = new GfK(this, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1c() {
        LithoView lithoView = ((BJB) this).A00;
        if (lithoView == null || getContext() == null) {
            return;
        }
        A1b();
        1Iw A0T = 7zP.A0T(this);
        C9bw c9bw = new C9bw();
        c9bw.A01 = 2131963565;
        By5 A00 = c9bw.A00();
        GkL gkL = new GkL(A0T, new C1991Ayk());
        FbUserSession fbUserSession = this.A00;
        if (fbUserSession == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        C1991Ayk c1991Ayk = gkL.A01;
        c1991Ayk.A01 = fbUserSession;
        BitSet bitSet = gkL.A02;
        bitSet.set(4);
        c1991Ayk.A04 = ((BJB) this).A01;
        bitSet.set(3);
        c1991Ayk.A06 = ((1X6) 1Br.A0B(this.A0D)).A07();
        bitSet.set(5);
        c1991Ayk.A00 = this.A06;
        bitSet.set(1);
        c1991Ayk.A03 = this.A0G;
        bitSet.set(2);
        c1991Ayk.A05 = this.A02;
        bitSet.set(6);
        c1991Ayk.A02 = this.A01;
        bitSet.set(0);
        7zP.A16(gkL, bitSet, gkL.A03);
        lithoView.A0x(A1Z(c1991Ayk, A0T, A00));
    }

    public void onAttach(Context context) {
        11T.A0F(context, 0);
        super/*X.1pK*/.onAttach(context);
        A1c();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, 416075378);
        super/*X.DZJ*/.onCreateView(layoutInflater, viewGroup, bundle);
        LithoView A1Y = A1Y(layoutInflater, viewGroup);
        0FI.A08(-2033819015, A04);
        return A1Y;
    }

    public void onDestroy() {
        int A02 = 0FI.A02(120585197);
        super/*X.DZJ*/.onDestroy();
        ((1XZ) 1Br.A0B(this.A0C)).Cez(this.A0I);
        ((1X6) 1Br.A0B(this.A0D)).A05(this.A0H);
        0FI.A08(-693131722, A02);
    }

    public void onStop() {
        int A02 = 0FI.A02(145447518);
        super/*X.DZJ*/.onStop();
        ((2UV) 1Br.A0B(this.A08)).AEC();
        0FI.A08(715513712, A02);
    }
}
