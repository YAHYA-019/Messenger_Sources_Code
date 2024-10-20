package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.navigation.home.drawer.model.DrawerFolderKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;

/* loaded from: Baq.class */
public final class Baq {
    public final DEU A00;

    public Baq(Context context, FbUserSession fbUserSession, C4NG c4ng, DrawerFolderKey drawerFolderKey, MigColorScheme migColorScheme, String str) {
        DEU cci;
        if (str.equals("CMAudioChannel")) {
            cci = new Cci(context, fbUserSession, c4ng, drawerFolderKey, migColorScheme);
        } else {
            if (!str.equals(ServerW3CShippingAddressConstants.DEFAULT)) {
                throw 1BL.A0l(str);
            }
            cci = new Ccj(context, fbUserSession, c4ng, drawerFolderKey, migColorScheme);
        }
        this.A00 = cci;
    }
}
