package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.navigation.home.drawer.model.FolderNameDrawerFolderKey;

/* renamed from: X.4Ml, reason: invalid class name */
/* loaded from: 4Ml.class */
public abstract class C4Ml {
    public static final C4Mh A00(Context context, FbUserSession fbUserSession) {
        2QB r0 = (2QB) 1Lo.A03(context, fbUserSession, 67931);
        4MG r02 = 4MG.A03;
        C1p8 c1p8 = r02.iconColor;
        C1p8 c1p82 = r02.backgroundColor;
        FolderNameDrawerFolderKey folderNameDrawerFolderKey = new FolderNameDrawerFolderKey(1F9.A0Q);
        4MH r03 = new 4MH(2MQ.A26, c1p8, c1p82);
        String string = context.getString(2131959792);
        11T.A0A(string);
        int i = r0.A00.A01;
        2Sh r04 = 2Sh.A01;
        11T.A0B(r04);
        return new C4Mh(C4Mg.A08, r03, folderNameDrawerFolderKey, C4MJ.A00(context, r04, i), null, string, null);
    }
}