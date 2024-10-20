package X;

import android.graphics.Matrix;
import android.os.Handler;
import java.util.ArrayList;

/* loaded from: I0b.class */
public final class I0b {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public Handler A09;
    public JOP A0A;
    public I8Q A0B;
    public RSd A0C;
    public final Matrix A0D;
    public final SCN A0E;
    public final HsQ A0F;
    public final I8k A0G;
    public final Object A0H;
    public final Object A0I;
    public final Object A0J;
    public final Object A0K;
    public final Object A0L;
    public final Runnable A0M;
    public final String A0N;
    public final ArrayList A0O;

    public I0b(String str) {
        I8k i8k = new I8k();
        this.A0J = AnonymousClass001.A0R();
        this.A0O = AnonymousClass001.A0s();
        this.A0H = AnonymousClass001.A0R();
        this.A0D = GOn.A0F();
        this.A0I = AnonymousClass001.A0R();
        this.A0K = AnonymousClass001.A0R();
        this.A0L = AnonymousClass001.A0R();
        this.A0F = new HsQ();
        this.A0M = new S9e(this);
        this.A0E = new SCN(this);
        this.A0N = str;
        this.A0G = i8k;
    }

    public static void A00(I0b i0b, long j) {
        synchronized (i0b.A0L) {
            i0b.A08 = j;
            i0b.A02 = 0;
            i0b.A01 = 0;
            i0b.A03 = 0;
            i0b.A07 = 0L;
            i0b.A06 = 0L;
        }
    }
}
