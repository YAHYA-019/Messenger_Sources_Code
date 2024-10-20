package X;

import android.graphics.Bitmap;

/* renamed from: X.4i2, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4i2.class */
public final class C06834i2 extends 2EY {
    public C06834i2(2EU r302, InterfaceC06794hx interfaceC06794hx, int i, int i2) {
        super(r302, interfaceC06794hx, i, i2);
    }

    public C06834i2(Bitmap bitmap, 2EW r303, InterfaceC06794hx interfaceC06794hx) {
        super(bitmap, r303, interfaceC06794hx);
    }

    public void finalize() {
        int i;
        int A03 = 0FI.A03(-1279816483);
        if (isClosed()) {
            i = 1607473772;
        } else {
            C0d7.A0D("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", AnonymousClass001.A1b(AnonymousClass001.A0X(this), System.identityHashCode(this)));
            try {
                close();
                i = -190469964;
            } catch (Throwable th) {
                0FI.A09(1979675685, A03);
                throw th;
            }
        }
        0FI.A09(i, A03);
    }
}
