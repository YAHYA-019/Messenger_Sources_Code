package X;

import android.graphics.Bitmap;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.inject.FbInjector;
import com.facebook.locationsharing.core.models.Address;
import com.facebook.locationsharing.core.models.Location;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.share.SentShareAttachment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.composer.broadcast.transportagnostic.sender.xma.data.SendTamXMAMessageParams;

/* loaded from: C56.class */
public final class C56 {
    public final 1BP A03 = FbInjector.A00;
    public final 1Br A02 = 1HG.A00(7zL.A09(), 65898);
    public final 1Br A00 = 1Bu.A00(115986);
    public final 1Br A01 = AbG.A0M();
    public final 1Br A04 = 7zM.A0d();

    public final Message A00(Bitmap bitmap, FbUserSession fbUserSession, Address address, ThreadKey threadKey, String str) {
        11T.A0G(fbUserSession, 0, address);
        Location location = address.A00;
        SendTamXMAMessageParams sendTamXMAMessageParams = new SendTamXMAMessageParams(null, null, null, null, "none", StringFormatUtil.formatStrLocaleSafe("messenger://location_share?lat=%f&long=%f", Double.valueOf(location.A00), Double.valueOf(location.A01)), null, null, null, null, 4YU.A0t(AbJ.A06(), 2131963348), address.A01, null, null, null, null, 0, 3003, false);
        CQl cQl = (CQl) 1Br.A0B(this.A02);
        SentShareAttachment sentShareAttachment = new SentShareAttachment(0PK.A00(7zQ.A1b("tam_xma_preview_bitmap", bitmap)), BM7.A03, null, sendTamXMAMessageParams);
        5PI A04 = CQl.A04(fbUserSession, threadKey, cQl, str);
        A04.A0R = sentShareAttachment;
        return 4YU.A0U(A04);
    }
}
