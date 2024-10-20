package X;

import com.facebook.messaging.navigation.home.drawer.model.DrawerFolderKey;
import com.facebook.messaging.navigation.home.drawer.model.FolderNameDrawerFolderKey;
import com.facebook.messaging.navigation.home.drawer.model.SpecialDrawerFolderKey;

/* renamed from: X.4Lh, reason: invalid class name */
/* loaded from: 4Lh.class */
public final class C4Lh {
    public final 1Br A00 = 1Bq.A00(68586);
    public final 1Br A01 = 1Bu.A00(68583);

    public static final 2cW A00(C4Mh c4Mh) {
        DrawerFolderKey drawerFolderKey = c4Mh.A02;
        2cW r305 = null;
        if (drawerFolderKey instanceof FolderNameDrawerFolderKey) {
            1F9 r0 = ((FolderNameDrawerFolderKey) drawerFolderKey).A00;
            BSC bsc = BSC.$redex_init_class;
            int ordinal = r0.ordinal();
            if (ordinal == 1) {
                return 2cW.A01;
            }
            if (ordinal == 2) {
                r305 = 2cW.A09;
            }
        } else if (drawerFolderKey instanceof SpecialDrawerFolderKey) {
            BSC bsc2 = BSC.$redex_init_class;
            return 2cW.A08;
        }
        return r305;
    }
}
