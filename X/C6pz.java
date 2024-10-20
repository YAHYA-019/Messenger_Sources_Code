package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* renamed from: X.6pz, reason: invalid class name */
/* loaded from: 6pz.class */
public final class C6pz {
    public Context A00;
    public final C00i A01;

    public C6pz() {
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        this.A01 = new 1HH(A00, 65728);
    }

    public void A00() {
        ((1I7) this.A01.get()).CkS(4YU.A0A("com.facebook.orca.stickers.STICKER_CONFIG_CHANGED"));
    }
}
