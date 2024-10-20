package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* loaded from: HqT.class */
public final class HqT {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Integer A05;
    public Integer A06;
    public final HZf A07;
    public final 1Br A08;
    public final Context A09;

    /* JADX WARN: Type inference failed for: r0v23, types: [X.HZf, java.lang.Object] */
    public HqT() {
        Context A00 = FbInjector.A00();
        this.A09 = A00;
        1Br A0g = 7zM.A0g(A00, 99980);
        this.A08 = A0g;
        this.A06 = 0S2.A0N;
        this.A02 = I9a.A00(GOp.A0p(A0g)).A02;
        this.A01 = I9a.A00(GOp.A0p(this.A08)).A01;
        A00();
        int i = 0;
        this.A00 = 1;
        ?? obj = new Object();
        this.A07 = obj;
        int i2 = this.A02;
        int i3 = this.A01;
        ((HZf) obj).A00 = Math.max(i2, i3);
        ((HZf) obj).A01 = Math.min(i2, i3);
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf(i3);
        Integer A03 = GOp.A0p(this.A08).A03();
        0fH.A0a(valueOf, valueOf2, Integer.valueOf(A03 != null ? A03.intValue() : i), "CameraState", "init effectConfig: %d %d, fps %d");
    }

    public final I9a A00() {
        return GOp.A0p(this.A08);
    }
}
