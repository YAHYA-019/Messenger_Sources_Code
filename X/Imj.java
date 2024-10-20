package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLStickerType;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.facebook.stickers.model.Sticker;
import com.google.common.base.Function;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.List;

/* loaded from: Imj.class */
public final class Imj implements Function {
    public final 1Br A00;
    public final 1Br A01 = 1Bu.A00(49970);
    public final Context A02;
    public final FbUserSession A03;

    public Imj(FbUserSession fbUserSession, Context context) {
        this.A03 = fbUserSession;
        this.A02 = context;
        this.A00 = 1Lm.A00(context, fbUserSession, 115006);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v78, types: [X.0ty] */
    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        ArrayList A0s;
        List<Sticker> list = (List) obj;
        if (list == null) {
            A0s = C0ty.A00;
        } else {
            A0s = AnonymousClass001.A0s();
            for (Sticker sticker : list) {
                if (sticker.A0B == GraphQLStickerType.CUSTOM && ((69I) 1Br.A0B(this.A01)).A07(sticker) == null) {
                    SettableFuture A0j = 4YU.A0j();
                    HfO hfO = (HfO) 1Br.A0B(this.A00);
                    String str = sticker.A0F;
                    Hck hck = new Hck(sticker, A0j);
                    11T.A0F(str, 0);
                    1X9 r0 = hfO.A00;
                    if (r0 != null) {
                        r0.cancel();
                    }
                    hfO.A00 = null;
                    22C r02 = (22C) 1Br.A0B(hfO.A01);
                    1Um A0O = 1BK.A0O(r02, 0);
                    MailboxFutureImpl A0P = 1BK.A0P(A0O);
                    int A00 = 4uZ.A00(A0P, (1X9) null);
                    TraceInfo A02 = 4uZ.A02(A0P, (LoggingOption) null, "MailboxTam", "loadTamClientQueryCustomStickerAttachmentURL");
                    if (!A0O.Cj2(new Ibw(A0P, r02, str, A00, 3))) {
                        A0P.cancel(false);
                        4uZ.A03(A00);
                        4uZ.A05((LoggingOption) null, A02, "MailboxTam", "loadTamClientQueryCustomStickerAttachmentURL");
                    }
                    PlatformLogger.platformEventLog(5);
                    hfO.A00 = A0P.addResultCallback(new Iaj(hck, hfO, 27));
                    sticker = A0j.get();
                    if (sticker != null) {
                    }
                }
                A0s.add(sticker);
            }
        }
        return A0s;
    }
}
