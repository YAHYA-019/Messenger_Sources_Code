package X;

import android.content.Context;
import com.facebook.messaging.navigation.home.drawer.model.SpecialDrawerFolderKey;

/* renamed from: X.4Mi, reason: invalid class name */
/* loaded from: 4Mi.class */
public abstract class C4Mi {
    public static final C4Mh A00(Context context, boolean z) {
        2QB r0 = (2QB) 1Bi.A03(67602);
        4MG r02 = 4MG.A03;
        C1p8 c1p8 = r02.iconColor;
        C1p8 c1p82 = r02.backgroundColor;
        int i = 2131966987;
        2MQ r309 = 2MQ.A1z;
        if (z) {
            i = 2131966975;
            r309 = 2MQ.A1a;
        }
        SpecialDrawerFolderKey specialDrawerFolderKey = new SpecialDrawerFolderKey(0S2.A00);
        4MH r03 = new 4MH(r309, c1p8, c1p82);
        String string = context.getString(i);
        11T.A0A(string);
        int i2 = r0.A00.A01;
        2Sh r04 = 2Sh.A01;
        11T.A0B(r04);
        return new C4Mh(C4Mg.A08, r03, specialDrawerFolderKey, C4MJ.A00(context, r04, i2), null, string, null);
    }
}
