package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.graphservice.tree.TreeJNI;

/* renamed from: X.6J3, reason: invalid class name */
/* loaded from: 6J3.class */
public final class C6J3 extends 6Ik {
    public 1BY A00;
    public final C00i A01 = new 1BV((1BY) null, 49963);

    public C6J3(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public int BGC() {
        return 2131959098;
    }

    public String BHd() {
        return "FIND_SIMILAR";
    }

    public void CX7(FbUserSession fbUserSession, Context context) {
        TreeJNI A0L;
        2JX r0 = ((6Ik) this).A00;
        if (r0 == null || r0.A0L(1014244451, 2JX.class, -1765368210) == null || (A0L = r0.A0L(1414741612, 2JX.class, 1945036183)) == null) {
            return;
        }
        context.getPackageManager();
        ((C67Q) this.A01.get()).A03(context, 4YU.A0F(StringFormatUtil.formatStrLocaleSafe(C1ic.A0X, Uri.encode(A0L.getIntValue(94851343) > 0 ? 1BK.A0B(r0, 2JX.class, 1014244451, -1765368210).A0j() : r0.A0r(1296072073)), "MESSENGER_BANNER_FIND_MORE_ITEMS")), null, 0S2.A05);
    }
}
