package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.reactions.gen.EmojiReactionsModel;

/* loaded from: Gqg.class */
public final class Gqg extends GS2 {
    public EmojiReactionsModel A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final IY8 A04;
    public final java.util.Map A05;
    public final Context A06;
    public final FbUserSession A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gqg(FbUserSession fbUserSession, Context context) {
        super("MediaSyncReelsReactionsPresenter");
        1BL.A1F(fbUserSession, context);
        this.A07 = fbUserSession;
        this.A06 = context;
        this.A02 = 1Lm.A00(context, fbUserSession, 115029);
        1Br A0U = GOn.A0U(context, fbUserSession);
        this.A03 = A0U;
        this.A01 = 7zM.A0d();
        this.A00 = (EmojiReactionsModel) GOo.A0p(EmojiReactionsModel.CONVERTER, GOq.A0p(A0U));
        this.A05 = 1BK.A1C();
        this.A04 = IY8.A01(this, 34);
    }
}
