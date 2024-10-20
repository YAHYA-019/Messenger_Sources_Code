package X;

import android.os.Bundle;
import com.facebook.messaging.navigation.home.drawer.model.AiHomeDrawerFolderKey;
import com.facebook.messaging.navigation.home.drawer.model.DrawerFolderKey;

/* renamed from: X.8r1, reason: invalid class name */
/* loaded from: 8r1.class */
public final class C8r1 extends 8H3 implements 2Oo, 2Op {
    public static final 9WC A01 = new Object();
    public static final String __redex_internal_original_name = "UgcAiBotPickerLeftNavFragment";
    public C00m A00 = ALO.A00;

    public void A1B(Bundle bundle) {
        ((8D0) ((8H3) this).A07.getValue()).A01();
        ((8H3) this).A01 = new 9tI(this);
        super/*X.1pK*/.A1B(bundle);
    }

    public DrawerFolderKey AiR() {
        return new AiHomeDrawerFolderKey(1F9.A05);
    }

    public void CpV(2MX r302) {
        if (A1X() == BOj.A0A) {
            ((8H3) this).A01 = new 9tJ(r302);
        }
    }
}
