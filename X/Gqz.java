package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.cowatch.gen.CowatchAutoplayModel;
import com.facebook.rsys.cowatch.gen.CowatchAutoplaySimpleModel;
import com.facebook.rsys.cowatch.gen.CowatchPlayerApi;

/* loaded from: Gqz.class */
public final class Gqz extends GS2 {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final IY8 A08;
    public final C15h A09;
    public final 1Br A0A;
    public final 1Br A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gqz(FbUserSession fbUserSession, Context context) {
        super("MediaSyncAutoPlayRsysPresenter");
        1BL.A1F(fbUserSession, context);
        this.A01 = fbUserSession;
        this.A00 = context;
        this.A09 = J5u.A03(this, 50);
        this.A07 = GOn.A0U(context, fbUserSession);
        this.A08 = IY8.A01(this, 29);
        this.A06 = GOn.A0V(context, fbUserSession);
        this.A02 = 1Lm.A00(context, fbUserSession, 99500);
        this.A03 = 1Bu.A01(context, 115390);
        this.A0A = GOn.A0X(context, fbUserSession);
        this.A0B = 1Bu.A01(context, 114925);
        this.A05 = 1Lm.A00(context, fbUserSession, 115396);
        this.A04 = 1Lm.A00(context, fbUserSession, 115395);
    }

    public static final void A00(Gqz gqz, String str) {
        CowatchAutoplaySimpleModel cowatchAutoplaySimpleModel;
        CowatchAutoplayModel cowatchAutoplayModel = (CowatchAutoplayModel) GOo.A0p(CowatchAutoplayModel.CONVERTER, GOq.A0p(gqz.A07));
        CowatchPlayerApi cowatchPlayerApi = (CowatchPlayerApi) gqz.A09.get();
        if (cowatchPlayerApi != null) {
            cowatchPlayerApi.updatePlaybackState(2, 0L);
        }
        GP5.A02(GOp.A0K(gqz.A03), "autoplay_success", str, null, (cowatchAutoplayModel == null || (cowatchAutoplaySimpleModel = cowatchAutoplayModel.autoplay) == null) ? null : cowatchAutoplaySimpleModel.mediaId, null);
        ((HsZ) 1Br.A0B(gqz.A04)).A00();
    }
}
