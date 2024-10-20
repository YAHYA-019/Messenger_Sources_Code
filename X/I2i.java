package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;
import org.apache.http.message.BasicHeader;

/* loaded from: I2i.class */
public final class I2i {
    public final int A00;
    public final int A01;
    public final C00i A04;
    public final Hjh A06;
    public final C1ko A07;
    public final C00i A08;
    public final C00i A02 = AbH.A0K();
    public final C0y A05 = (C0y) 1Bn.A0A(84733);
    public final C1m8 A09 = (C1m8) 1Bi.A03(16785);
    public final C00i A03 = 1BQ.A02(116161);

    public I2i(FbUserSession fbUserSession) {
        1BQ A00 = 1BQ.A00();
        this.A08 = A00;
        this.A04 = 1BQ.A02(33196);
        this.A06 = (Hjh) 1Lo.A06(fbUserSession, 116138);
        this.A07 = AbstractC2327GOs.A0M();
        this.A00 = C1Ur.A00((1CO) A00.get(), 40, 36592670395138983L);
        this.A01 = C1Ur.A00((1CO) A00.get(), 65, 36592670395204520L);
    }

    public static final I2i A00(Object obj) {
        return new I2i((FbUserSession) obj);
    }

    public void A01(C04033zm c04033zm, MediaResource mediaResource) {
        5HP r0 = mediaResource.A0Q;
        if (r0 == 5HP.A0F || r0 == 5HP.A02) {
            String A02 = this.A09.A02();
            if (1JF.A0A(A02)) {
                return;
            }
            c04033zm.A00(ImmutableList.of((Object) new BasicHeader(AbE.A00(ActionId.RTMP_CONNECTION_INTERCEPTED), A02)));
        }
    }
}
