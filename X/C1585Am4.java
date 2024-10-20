package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.messaging.navigation.home.drawer.model.DrawerFolderKey;
import com.facebook.messaging.navigation.home.drawer.model.TravelDrawerFolderKey;

/* renamed from: X.Am4, reason: case insensitive filesystem */
/* loaded from: Am4.class */
public final class C1585Am4 extends 1pK implements 2Oo {
    public static final String __redex_internal_original_name = "TravelFragment";

    public DrawerFolderKey AiR() {
        return new TravelDrawerFolderKey("travelDrawerFolderKey");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(634908088);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132543525, viewGroup, false);
        0FI.A08(2010977662, A02);
        return inflate;
    }
}
