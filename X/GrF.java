package X;

import android.content.Context;
import androidx.lifecycle.LifecycleObserver;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.cowatch.gen.CowatchMediaInfoModel;
import com.facebook.rsys.cowatch.gen.CowatchPlayerModel;

/* loaded from: GrF.class */
public final class GrF extends GS2 implements LifecycleObserver {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final IY8 A03;
    public final Context A04;
    public final FbUserSession A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrF(FbUserSession fbUserSession, Context context) {
        super("MediaSyncPlaybackRootPresenter");
        1BL.A1F(fbUserSession, context);
        this.A05 = fbUserSession;
        this.A04 = context;
        this.A00 = 1Bu.A01(context, 67593);
        this.A02 = GOn.A0U(context, fbUserSession);
        this.A03 = IY8.A01(this, 35);
        this.A01 = 1Bu.A01(context, 16430);
    }

    public static final void A00(GrF grF, 2JS r302) {
        CowatchMediaInfoModel cowatchMediaInfoModel;
        if (GS2.A07(grF)) {
            CowatchPlayerModel A0k = GOq.A0k(r302);
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            if (A0k != null && (cowatchMediaInfoModel = A0k.mediaInfo) != null) {
                C00i c00i = grF.A00.A00;
                ICR icr = (ICR) c00i.get();
                z2 = icr.A06(1Br.A03(icr.A02), true);
                z = cowatchMediaInfoModel.isReel;
                z3 = 1Br.A06(((ICR) c00i.get()).A00).AZk(36320210550013093L);
            }
            grF.A0Z(new IZS(z, z2, z3));
        }
    }
}
