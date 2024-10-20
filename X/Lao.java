package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: Lao.class */
public final class Lao implements 6W2 {
    public final /* synthetic */ boolean A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public Lao(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = z;
        this.A04 = z2;
        this.A03 = z3;
        this.A01 = z4;
        this.A02 = z5;
    }

    public List Agl(String str, boolean z, boolean z2) {
        6W2 r0 = 6W2.A00;
        r0.getClass();
        ArrayList A17 = 1BK.A17(r0.Agl(str, z, z2));
        6W1.A01(str, A17, this.A00, this.A04, this.A03);
        if ("video/av01".equals(str) || this.A01) {
            Collections.sort(A17, new LsA(str, this, 1));
            C51f.A01("MediaCodecSelectorHelper", "%s dec order (sw first) %s", str, A17);
        }
        return A17;
    }
}
