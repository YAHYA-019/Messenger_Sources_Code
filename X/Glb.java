package X;

import android.graphics.drawable.Drawable;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.montage.viewer.MontageViewerFragment;

/* loaded from: Glb.class */
public final class Glb extends C1rj {
    public HTm A00;
    public boolean A01;

    public Glb() {
        super("StoryViewerOverlayTapOverrideComponent");
    }

    public static 2cM A00(Fcg fcg, 3Eh r302, 1Iw r303) {
        Drawable A04 = fcg.A04(r303.A0D, r302);
        2cM A01 = 2cK.A01(r303, (String) null, 0);
        A01.A0z(32.0f);
        A01.A0l(32.0f);
        A01.A24(C26z.ALL, 8.0f);
        A01.A2H(2dP.A02);
        C2cm A00 = C2cl.A00(r303);
        A00.A2b(A04);
        A00.A0z(32.0f);
        A00.A0l(32.0f);
        A00.A0c();
        A00.A1F(1.0f);
        A00.A2Z(2132213823);
        A01.A2d(A00);
        C2cm A002 = C2cl.A00(r303);
        A002.A2b(A04);
        A002.A0z(32.0f);
        A002.A0l(32.0f);
        A002.A2Z(2132213791);
        A01.A2d(A002);
        return A01;
    }

    public final Object[] A0k() {
        return new Object[]{1BK.A0d(), this.A00, Boolean.valueOf(this.A01)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2cM r307;
        boolean z = this.A01;
        Fcg fcg = (Fcg) 1Bi.A05(Fcg.class, (Class) null);
        2cM r306 = null;
        if (z) {
            r307 = A00(fcg, 3Eh.A50, r302);
            r306 = A00(fcg, 3Eh.A52, r302);
        } else {
            r307 = null;
        }
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A0c();
        A01.A10(100.0f);
        A01.A0m(100.0f);
        A01.A2d();
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        A012.A0m(100.0f);
        A012.A1W(2132279303);
        A012.A1J(2131966721);
        String A00 = 1BJ.A00(ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE);
        A012.A0F(A00);
        A012.A2T(1LI.A09(r302, Glb.class, "StoryViewerOverlayTapOverrideComponent", -1601594140));
        A012.A2c();
        A012.A2d(r307);
        A01.A2e(A012);
        2cM A013 = 2cK.A01(r302, (String) null, 0);
        A013.A0m(100.0f);
        A013.A1W(2132279303);
        A013.A1J(2131966720);
        A013.A0F(A00);
        A013.A2T(1LI.A09(r302, Glb.class, "StoryViewerOverlayTapOverrideComponent", 133653003));
        A013.A2c();
        A013.A2d(r306);
        A01.A2e(A013);
        return A01.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        MontageViewerFragment montageViewerFragment;
        boolean z;
        int i = r302.A01;
        if (i == -1601594140) {
            montageViewerFragment = ((Glb) r302.A00.A01).A00.A00;
            z = true;
        } else {
            if (i == -1048037474) {
                1LI.A0J(r302, obj);
                return null;
            }
            if (i != 133653003) {
                return null;
            }
            montageViewerFragment = ((Glb) r302.A00.A01).A00.A00;
            z = false;
        }
        MontageViewerFragment.A0Y(montageViewerFragment, z);
        return null;
    }
}
