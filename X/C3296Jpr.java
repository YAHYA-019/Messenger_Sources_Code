package X;

import com.facebook.fixie.fixes.acodec.ACodecFixer$NativeImpl;

/* renamed from: X.Jpr, reason: case insensitive filesystem */
/* loaded from: Jpr.class */
public final class C3296Jpr extends AnonymousClass013 {
    @Override // X.AnonymousClass014
    public String getName() {
        return "ACodecFixer";
    }

    @Override // X.AnonymousClass014
    public void init() {
        1Dn A05 = A05(1Dn.class);
        A05.getClass();
        C00i c00i = A05.A02;
        if (1BK.A0N(c00i).AZk(36317642166316647L)) {
            0fH.A0n("Fixie/ACodecFixer", "Enable ACodec Hooks");
            ACodecFixer$NativeImpl.install(AnonymousClass001.A1N(1BK.A0N(c00i).AZk(36317642166382184L) ? 1 : 0));
        }
    }
}
