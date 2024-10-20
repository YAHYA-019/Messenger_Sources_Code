package X;

import android.os.Debug;

/* renamed from: X.0q6, reason: invalid class name */
/* loaded from: 0q6.class */
public final class C0q6 implements 0gG {
    public Integer Ayh() {
        return 0S2.A16;
    }

    public /* synthetic */ boolean BN1(Integer num) {
        return false;
    }

    public void CXo(C0qh c0qh, C0gq c0gq) {
        Debug.getMemoryInfo(new Debug.MemoryInfo());
        C0qh.A01(C0g6.A3R, c0qh, r0.getTotalPss() * 1024);
        C0qh.A01(C0g6.A3Q, c0qh, r0.getTotalPrivateDirty() * 1024);
        C0qh.A01(C0g6.A3T, c0qh, r0.getTotalSharedDirty() * 1024);
        C0qh.A01(C0g6.A2M, c0qh, r0.nativePrivateDirty * 1024);
        C0qh.A01(C0g6.A2N, c0qh, r0.nativePss * 1024);
        C0qh.A01(C0g6.A2O, c0qh, r0.nativeSharedDirty * 1024);
        C0qh.A01(C0g6.A2V, c0qh, r0.otherPrivateDirty * 1024);
        C0qh.A01(C0g6.A2W, c0qh, r0.otherPss * 1024);
        C0qh.A01(C0g6.A2X, c0qh, r0.otherSharedDirty * 1024);
    }
}
