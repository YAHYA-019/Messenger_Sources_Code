package X;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import com.facebook.litho.LithoView;
import com.facebook.messaging.business.inboxads.common.InboxAdsData;
import com.facebook.messaging.business.inboxads.renderstate.InboxAdsPostclickRenderState;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Objects;
import java.util.BitSet;

/* loaded from: F6j.class */
public final class F6j {
    public 1BY A00;
    public LithoView A01;
    public InboxAdsData A02;
    public Ezq A03;
    public Evu A04;
    public InboxAdsPostclickRenderState A05;
    public C1t1 A06;
    public 2Ov A07;
    public MigColorScheme A08;
    public final C00i A0A = 1BQ.A02(99706);
    public final C00i A09 = 7zN.A0D(16838);

    public F6j(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public static void A00(F6j f6j) {
        Window window;
        if (f6j.A07 == null || f6j.A01 == null) {
            return;
        }
        MigColorScheme migColorScheme = (MigColorScheme) 1Bn.A0E((Context) null, f6j.A00, 16979);
        MigColorScheme migColorScheme2 = f6j.A08;
        if (migColorScheme2 == null || !Objects.equal(migColorScheme2, migColorScheme)) {
            f6j.A08 = migColorScheme;
            Dialog dialog = ((0D2) f6j.A07).A01;
            if (dialog != null && (window = dialog.getWindow()) != null) {
                ((1tC) f6j.A09.get()).A03(window, f6j.A08);
            }
            f6j.A03.getClass();
            f6j.A04.getClass();
            LithoView lithoView = f6j.A01;
            Drn drn = new Drn(new Dy8(), lithoView.A09);
            Dse dse = new Dse(f6j.A01.A09, new Dxa());
            InboxAdsData inboxAdsData = f6j.A02;
            Dxa dxa = dse.A01;
            dxa.A00 = inboxAdsData;
            BitSet bitSet = dse.A02;
            bitSet.set(2);
            dxa.A03 = f6j.A05;
            bitSet.set(3);
            dxa.A04 = f6j.A08;
            bitSet.set(1);
            dxa.A01 = f6j.A03;
            bitSet.set(0);
            dxa.A02 = f6j.A04;
            bitSet.set(4);
            C1rs.A04(bitSet, dse.A03);
            dse.A0J();
            Dy8 dy8 = drn.A00;
            dy8.A01 = dxa.A0l();
            BitSet bitSet2 = drn.A02;
            bitSet2.set(0);
            dy8.A02 = ((F6z) f6j.A0A.get()).A01(f6j.A02);
            bitSet2.set(1);
            C1rs.A00(bitSet2, drn.A03);
            drn.A0J();
            lithoView.A0x(dy8);
        }
    }
}
