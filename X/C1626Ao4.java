package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.Ao4, reason: case insensitive filesystem */
/* loaded from: Ao4.class */
public final class C1626Ao4 extends C8j {
    public final BkQ A00;

    public C1626Ao4() {
        Context A00 = 1Bn.A00();
        this.A00 = (BkQ) 1Bn.A0F(A00, BkQ.class, (Class) null);
        FbUserSession A06 = 1Fw.A06(1Bn.A0F(A00, 1EZ.class, (Class) null));
        A02(new Cea(A06, this), StringFormatUtil.formatStrLocaleSafe("fb-messenger://platform/cta/postback/?cta_id=%s", "{cta_id}"));
    }
}
