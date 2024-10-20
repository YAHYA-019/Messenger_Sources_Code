package X;

import android.content.Context;

/* loaded from: Ig3.class */
public final class Ig3 implements JIv {
    @Override // X.JIv
    public void BmI(Context context, String str, String str2, String str3) {
    }

    @Override // X.JIv
    public void BmN(Context context, String str, String str2, String str3, int i, int i2, boolean z, boolean z2) {
        if (i != 0 || i2 == 0) {
            return;
        }
        0fH.A0j("HeraPluginInitCallListener", "New call detected. Try to init hera plugin.");
        ((C06274gb) 1Bi.A03(115700)).A01();
    }
}
