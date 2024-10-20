package X;

import com.facebook.privacy.e2ee.genericimpl.store.DevicePkeKeypairStoreImplKt;

/* loaded from: C8k.class */
public final class C8k {
    public final 1Br A00 = 7zM.A0S();

    public final void A00(int i) {
        7zP.A0e(this.A00).markerEnd(628374051, i, (short) 3);
    }

    public final void A01(int i) {
        7zP.A0e(this.A00).markerEnd(628374051, i, (short) 2);
    }

    public final void A02(int i, String str, String str2) {
        11T.A0F(str, 1);
        C00i c00i = this.A00.A00;
        1BK.A0V(c00i).markerStart(628374051, i, true);
        1BK.A0V(c00i).markerAnnotate(628374051, i, "fetcher_name", str);
        1BK.A0V(c00i).markerAnnotate(628374051, i, "method_name", str2);
        1BK.A0V(c00i).markerAnnotate(628374051, i, DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY, 1);
    }
}
