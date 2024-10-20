package X;

import android.content.Context;
import android.media.MediaFormat;
import java.io.IOException;
import java.util.List;

/* loaded from: Hum.class */
public final class Hum {
    public HLh A00;
    public boolean A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final Context A07;
    public final MediaFormat A08;
    public final I8c A09;
    public final Hqj A0A;
    public final JO9 A0B;
    public final I51 A0C;
    public final JGx A0D;
    public final JNX A0E;
    public final JLT A0F;
    public final Hkg A0G;
    public final JJJ A0H;
    public final JNA A0I;
    public java.util.Map A02 = AnonymousClass001.A0u();
    public java.util.Map A01 = AnonymousClass001.A0u();
    public final List A0J = AnonymousClass001.A0s();

    public Hum(Context context, MediaFormat mediaFormat, I8c i8c, Hqj hqj, JO9 jo9, I51 i51, JGx jGx, JNX jnx, JLT jlt, Hkg hkg, JJJ jjj, JNA jna, int i, long j, long j2) {
        this.A0D = jGx;
        this.A0F = jlt;
        this.A0G = hkg;
        this.A0C = i51;
        this.A0B = jo9;
        this.A07 = context;
        this.A04 = i;
        this.A08 = mediaFormat;
        this.A0I = jna;
        this.A0E = jnx;
        this.A09 = i8c;
        this.A0H = jjj;
        this.A06 = j;
        this.A05 = j2;
        this.A0A = hqj;
    }

    public void A00() {
        int i = 0;
        while (true) {
            int i2 = i;
            this.A00.getClass();
            if (i2 >= 1) {
                return;
            }
            Object A0r = 7zN.A0r(this.A01, i2);
            A0r.getClass();
            ((JNK) A0r).flush();
            i = 1;
        }
    }

    public void A01() {
        int i = 0;
        while (true) {
            int i2 = i;
            this.A00.getClass();
            if (i2 >= 1) {
                return;
            }
            JNK jnk = (JNK) 7zN.A0r(this.A01, i2);
            if (jnk != null) {
                jnk.D0b();
            }
            i = 1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.I3R] */
    public void A02() {
        synchronized (this) {
            ?? obj = new Object();
            int i = 0;
            while (true) {
                this.A00.getClass();
                if (i < 1) {
                    JNK jnk = (JNK) 7zN.A0r(this.A01, i);
                    if (jnk != null) {
                        try {
                            jnk.cancel();
                        } catch (Throwable th) {
                            I3R.A00((I3R) obj, th);
                        }
                    }
                    Ijj ijj = (Ijj) 7zN.A0r(this.A02, i);
                    if (ijj != null) {
                        try {
                            try {
                                Ijj.A03(ijj, true);
                            } catch (Throwable th2) {
                                I3R.A00((I3R) obj, th2);
                            }
                        } catch (IOException | RuntimeException unused) {
                        }
                        ijj.A06 = false;
                    }
                    i = 1;
                } else {
                    this.A02.clear();
                    this.A01.clear();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.I3R] */
    public void A03() {
        synchronized (this) {
            ?? obj = new Object();
            int i = 0;
            while (true) {
                int i2 = i;
                this.A00.getClass();
                if (i2 < 1) {
                    Ijj ijj = (Ijj) 7zN.A0r(this.A02, i2);
                    if (ijj != null && ijj.A06) {
                        this.A0C.A0W = true;
                        try {
                            ijj.stop();
                        } catch (Throwable th) {
                            I3R.A00((I3R) obj, th);
                        }
                    }
                    JNK jnk = (JNK) 7zN.A0r(this.A01, i2);
                    if (jnk != null) {
                        try {
                            jnk.release();
                        } catch (Throwable th2) {
                            I3R.A00((I3R) obj, th2);
                        }
                    }
                    i = 1;
                } else {
                    this.A02.clear();
                    this.A01.clear();
                    obj.A02();
                }
            }
        }
    }

    public void A04(long j) {
        java.util.Map map = this.A01;
        Integer A0k = 4YU.A0k();
        if (map.get(A0k) == null) {
            return;
        }
        ((JNK) map.get(A0k)).CfX(j);
        this.A00.getClass();
        int i = 0;
        while (true) {
            int i2 = i;
            HLh hLh = this.A00;
            if (i2 >= 1) {
                return;
            }
            this.A0G.A0A.A1d();
            hLh.getClass();
            Object A0r = 7zN.A0r(map, i2);
            A0r.getClass();
            ((JNK) A0r).ANx(j);
            i = 1;
        }
    }

    public boolean A05() {
        int i = 0;
        boolean z = true;
        while (true) {
            this.A00.getClass();
            if (i >= 1) {
                return z;
            }
            JNK jnk = (JNK) 7zN.A0r(this.A01, i);
            if (jnk != null) {
                if (z) {
                    z = true;
                    if (jnk.BRC()) {
                    }
                }
                z = false;
            }
            i = 1;
        }
    }
}
