package X;

import android.net.Uri;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.SingletonImmutableSet;

/* renamed from: X.Jnk, reason: case insensitive filesystem */
/* loaded from: Jnk.class */
public final class C3248Jnk extends L5Y implements MNq {
    public static final ImmutableSet A00 = new SingletonImmutableSet("fbrpc://facebook/");

    @Override // X.MNq
    public boolean C30(RDm rDm, String str, String str2, String str3) {
        11T.A0F(str2, 1);
        Uri A002 = C0A2.A00(new AnonymousClass488(4YV.A0G(), "BizApp.BizAppBrowserExtensionController"), str2);
        if (A002 == null) {
            return false;
        }
        1Du it = A00.iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            String A02 = 11T.A02(A002);
            11T.A0D(A0i);
            if (0CV.A0b(A02, A0i, false)) {
                rDm.A00.cancel();
                return true;
            }
        }
        return false;
    }
}
