package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.common.dextricks.Constants;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* renamed from: X.6ax, reason: invalid class name */
/* loaded from: 6ax.class */
public abstract class C6ax extends 6W7 {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public MediaFormat A0A;
    public 6ZU A0B;
    public 6Yl A0C;
    public 6Yl A0D;
    public 6Yl A0E;
    public 6VN A0F;
    public C7ys A0G;
    public C7ys A0H;
    public 7sT A0I;
    public 6bI A0J;
    public C6b1 A0K;
    public KQp A0L;
    public C7ts A0M;
    public ByteBuffer A0N;
    public ArrayDeque A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public float A0g;
    public float A0h;
    public long A0i;
    public long A0j;
    public long A0k;
    public MediaCrypto A0l;
    public Object A0m;
    public String A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public final int A0u;
    public final MediaCodec.BufferInfo A0v;
    public final 6Vz A0w;
    public final 6WD A0x;
    public final 6WD A0y;
    public final 7hO A0z;
    public final 6W2 A10;
    public final ArrayDeque A11;
    public final ArrayList A12;
    public final boolean A13;
    public final float A14;
    public final int A15;
    public final 6WD A16;
    public final MFv A17;
    public final 6W4 A18;
    public final boolean A19;

    public C6ax(6W4 r302, 6Vz r303, MFv mFv, 6W2 r305, Object obj, float f, int i, int i2, int i3, boolean z, boolean z2) {
        super(i);
        this.A0e = false;
        this.A0Z = false;
        this.A0j = -9223372036854775807L;
        this.A06 = -9223372036854775807L;
        r303.getClass();
        this.A0w = r303;
        this.A18 = r302;
        this.A0m = obj;
        this.A17 = mFv;
        this.A10 = r305;
        this.A13 = z;
        this.A14 = f;
        this.A15 = i2;
        this.A0u = i3;
        this.A0a = z2;
        this.A16 = new 6WD(0);
        this.A0x = new 6WD(0);
        this.A0y = new 6WD(2);
        7hO r0 = new 7hO();
        this.A0z = r0;
        this.A12 = new ArrayList();
        this.A0v = new MediaCodec.BufferInfo();
        this.A00 = 1.0f;
        this.A0h = 1.0f;
        this.A11 = new ArrayDeque();
        A07(C7ts.A03);
        r0.A02(0);
        ((6WD) r0).A02.order(ByteOrder.nativeOrder());
        this.A0g = -1.0f;
        this.A03 = 0;
        this.A04 = -1;
        this.A05 = -1;
        this.A0i = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
        this.A08 = -9223372036854775807L;
        this.A0k = -9223372036854775807L;
        this.A02 = 0;
        this.A01 = 0;
        this.A0t = 5N4.A02(5N3.A14);
        this.A0s = 5N4.A02(5N3.A15);
        this.A19 = 5N4.A02(5N3.A1C);
    }

    private void A00() {
        this.A0P = false;
        this.A0z.A00();
        this.A0y.A00();
        this.A0R = false;
        this.A0Q = false;
    }

    private void A01() {
        if (this.A0V) {
            this.A02 = 1;
            this.A01 = 3;
        } else {
            A0a();
            A0d();
        }
    }

    private void A02() {
        try {
            this.A0J.flush();
        } finally {
            A0c();
        }
    }

    private void A03() {
        int i = this.A01;
        if (i == 1) {
            A02();
            return;
        }
        if (i == 2) {
            A02();
            A05();
        } else if (i != 3) {
            this.A0b = true;
            A0b();
        } else {
            A0a();
            A0d();
        }
    }

    private void A04() {
        A0c();
        this.A0B = null;
        this.A0I = null;
        this.A0O = null;
        this.A0K = null;
        this.A0C = null;
        this.A0A = null;
        this.A0U = false;
        this.A0S = false;
        this.A0g = -1.0f;
        this.A0o = false;
        this.A0T = false;
        this.A0p = false;
        this.A03 = 0;
        this.A0q = false;
        this.A0j = -9223372036854775807L;
        this.A06 = -9223372036854775807L;
    }

    private void A05() {
        LaK Af6 = this.A0H.Af6();
        if (Af6 instanceof LaK) {
            try {
                this.A0l.setMediaDrmSession(Af6.A02);
            } catch (MediaCryptoException e) {
                throw A0J(this.A0D, e, 6006, false);
            }
        }
        C7ys c7ys = this.A0H;
        7mQ.A00(this.A0G, c7ys);
        this.A0G = c7ys;
        this.A02 = 0;
        this.A01 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x029c, code lost:
    
        if ("c2.android.aac.decoder".equals(r0) == false) goto L75;
     */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.lang.Object, X.7sT] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A06(android.media.MediaCrypto r302, X.C6b1 r303) {
        /*
            Method dump skipped, instructions count: 1059
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6ax.A06(android.media.MediaCrypto, X.6b1):void");
    }

    private void A07(C7ts c7ts) {
        this.A0M = c7ts;
        if (c7ts.A01 != -9223372036854775807L) {
            this.A0r = true;
        }
    }

    private boolean A08(int i) {
        6WB r0 = ((6W7) this).A0C;
        r0.A01 = null;
        r0.A00 = null;
        6WD r02 = this.A16;
        r02.A00();
        int A0I = A0I(r0, r02, i | 4);
        if (A0I == -5) {
            A0V(r0);
            return true;
        }
        if (A0I != -4 || (((6WE) r02).A00 & 4) != 4) {
            return false;
        }
        this.A0W = true;
        A03();
        return false;
    }

    private boolean A09(6Yl r302) {
        boolean z = true;
        if (this.A0J != null && this.A01 != 3 && ((6W7) this).A01 != 0) {
            float f = this.A0h;
            6Yl[] r0 = ((6W7) this).A06;
            r0.getClass();
            float A0S = A0S(r302, r0, f);
            float f2 = this.A0g;
            if (f2 != A0S) {
                if (A0S == -1.0f) {
                    A01();
                    z = false;
                } else if (f2 != -1.0f || A0S > this.A14) {
                    Bundle A05 = 1BK.A05();
                    A05.putFloat(JQw.A00(30), A0S);
                    this.A0J.CsH(A05);
                    this.A0g = A0S;
                    return true;
                }
            }
        }
        return z;
    }

    public static boolean A0A(C6ax c6ax) {
        if (c6ax.A0J == null) {
            return false;
        }
        int i = c6ax.A01;
        if (i == 3 || ((c6ax.A0o && !c6ax.A0S) || c6ax.A0r())) {
            c6ax.A0a();
            return true;
        }
        if (i == 2) {
            try {
                c6ax.A05();
            } catch (6ZU e) {
                5My.A06("MediaCodecRenderer2", "Failed to update the DRM session, releasing the codec instead.", e);
                c6ax.A0a();
                return true;
            }
        }
        c6ax.A02();
        return false;
    }

    private void A0b() {
        if (this instanceof C6pa) {
            C6pa c6pa = (C6pa) this;
            try {
                c6pa.A0C.CXf();
            } catch (KQj e) {
                throw c6pa.A0J(e.format, e, 5002, e.isRecoverable);
            }
        }
    }

    public void A0N() {
        try {
            A00();
            A0a();
        } finally {
            7mQ.A00(this.A0H, (C7ys) null);
            this.A0H = null;
        }
    }

    public void A0O() {
        this.A0D = null;
        A07(C7ts.A03);
        this.A11.clear();
        if (this.A0t) {
            A0N();
        } else {
            A0A(this);
        }
    }

    public void A0P(long j, boolean z) {
        int i;
        this.A0W = false;
        this.A0b = false;
        this.A0c = false;
        if (this.A0Q) {
            this.A0z.A00();
            this.A0y.A00();
            this.A0R = false;
        } else if (A0A(this)) {
            A0d();
        }
        6WJ r0 = this.A0M.A02;
        synchronized (r0) {
            i = r0.A01;
        }
        if (i > 0) {
            this.A0f = true;
        }
        this.A0M.A02.A02();
        this.A11.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6VN, java.lang.Object] */
    public void A0Q(boolean z, boolean z2) {
        this.A0F = new Object();
        this.A09 = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
    
        if (r0 >= r0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0R(X.6Yl[] r302, long r303, long r305) {
        /*
            r301 = this;
            r0 = r301
            X.7ts r0 = r0.A0M
            r307 = r0
            r0 = r307
            long r0 = r0.A01
            r308 = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r310 = r0
            r0 = r308
            r1 = r310
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r312 = r0
            r0 = r312
            if (r0 != 0) goto L33
            X.7ts r0 = new X.7ts
            r307 = r0
            r0 = r307
            r1 = r310
            r2 = r305
            r0.<init>(r1, r2)
            r0 = r301
            r1 = r307
            r0.A07(r1)
        L32:
            return
        L33:
            r0 = r301
            java.util.ArrayDeque r0 = r0.A11
            r313 = r0
            r0 = r313
            boolean r0 = r0.isEmpty()
            r312 = r0
            r0 = r312
            if (r0 == 0) goto La7
            r0 = r301
            long r0 = r0.A07
            r314 = r0
            r0 = r314
            r1 = r310
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r312 = r0
            r0 = r312
            if (r0 == 0) goto L75
            r0 = r301
            long r0 = r0.A0k
            r308 = r0
            r0 = r308
            r1 = r310
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r312 = r0
            r0 = r312
            if (r0 == 0) goto La7
            r0 = r308
            r1 = r314
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r312 = r0
            r0 = r312
            if (r0 < 0) goto La7
        L75:
            X.7ts r0 = new X.7ts
            r307 = r0
            r0 = r307
            r1 = r310
            r2 = r305
            r0.<init>(r1, r2)
            r0 = r301
            r1 = r307
            r0.A07(r1)
            r0 = r301
            X.7ts r0 = r0.A0M
            r307 = r0
            r0 = r307
            long r0 = r0.A01
            r308 = r0
            r0 = r308
            r1 = r310
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r312 = r0
            r0 = r312
            if (r0 == 0) goto L32
            r0 = r301
            r0.A0Z()
            return
        La7:
            r0 = r301
            long r0 = r0.A07
            r308 = r0
            X.7ts r0 = new X.7ts
            r307 = r0
            r0 = r307
            r1 = r308
            r2 = r305
            r0.<init>(r1, r2)
            r0 = r313
            r1 = r307
            boolean r0 = r0.add(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6ax.A0R(X.6Yl[], long, long):void");
    }

    public float A0S(6Yl r302, 6Yl[] r303, float f) {
        int i = -1;
        for (6Yl r0 : r303) {
            int i2 = r0.A0G;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004c, code lost:
    
        if (r0 == 2) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A0T(X.6Yl r302, X.6W2 r303) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6ax.A0T(X.6Yl, X.6W2):int");
    }

    public Krr A0U(6Yl r302, 6Yl r303, C6b1 c6b1) {
        int i;
        String str;
        int i2;
        C6pa c6pa = (C6pa) this;
        if (!5N4.A02(5N3.A0L) || c6pa.A0w.A0K) {
            Krr A05 = c6b1.A05(r302, r303);
            i = A05.A00;
            if (r303.A0B > c6pa.A00) {
                i |= 64;
            }
            if (5N4.A02(5N3.A0J) && (r302.A08 != 0 || r302.A09 != 0 || r303.A08 != 0 || r303.A09 != 0)) {
                i |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
            }
            str = c6b1.A03;
            i2 = i != 0 ? 0 : A05.A01;
        } else {
            str = c6b1.A03;
            i2 = 0;
            i = 4;
        }
        return new Krr(r302, r303, str, i2, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x013e, code lost:
    
        if (r0 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01b6, code lost:
    
        if (A09(r0) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0231, code lost:
    
        if (r0 != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.Krr A0V(X.6WB r302) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6ax.A0V(X.6WB):X.Krr");
    }

    public abstract Kl8 A0W(MediaCrypto mediaCrypto, 6Yl r2, C6b1 c6b1, float f);

    public K0Y A0X(C6b1 c6b1, Throwable th) {
        return new K0Y(c6b1, th);
    }

    public ArrayList A0Y(6Yl r302, 6W2 r303, boolean z) {
        return C6ay.A03(r302, C6pa.A00(r302, ((C6pa) this).A0C, r303, z));
    }

    public void A0Z() {
        ((DefaultAudioSink) ((C6pa) this).A0C).A0H = true;
    }

    public void A0a() {
        try {
            6bI r0 = this.A0J;
            if (r0 != null) {
                if (this.A0s) {
                    C5ho.A06.A02(this.A18.A00, this.A0w, r0, 0S2.A01, this.A0n, A0q());
                } else {
                    r0.release();
                }
                this.A0F.A03++;
                A0p(this.A0K.A03);
            }
            this.A0J = null;
            this.A0n = null;
            try {
                MediaCrypto mediaCrypto = this.A0l;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.A0J = null;
            this.A0n = null;
            try {
                MediaCrypto mediaCrypto2 = this.A0l;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void A0c() {
        this.A04 = -1;
        this.A0x.A02 = null;
        this.A05 = -1;
        this.A0N = null;
        this.A0i = -9223372036854775807L;
        this.A0V = false;
        this.A0X = false;
        this.A0Y = false;
        this.A12.clear();
        this.A07 = -9223372036854775807L;
        this.A08 = -9223372036854775807L;
        this.A0k = -9223372036854775807L;
        7sT r0 = this.A0I;
        if (r0 != null) {
            r0.A00 = 0L;
            r0.A01 = 0L;
            r0.A02 = false;
        }
        this.A02 = 0;
        this.A01 = 0;
        this.A03 = this.A0p ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0509 A[Catch: KQp -> 0x05d5, TRY_ENTER, TryCatch #2 {KQp -> 0x05d5, blocks: (B:62:0x0199, B:63:0x01a1, B:64:0x01aa, B:192:0x01b8, B:193:0x01c1, B:194:0x01ca, B:195:0x01d9, B:200:0x01ed, B:201:0x01f6, B:202:0x0204, B:205:0x0210, B:207:0x021c, B:209:0x0223, B:210:0x022b, B:212:0x0234, B:214:0x0241, B:215:0x0249, B:217:0x0256, B:219:0x0264, B:221:0x026b, B:224:0x0275, B:227:0x0283, B:228:0x028c, B:232:0x029d, B:233:0x02a5, B:234:0x02ae, B:236:0x02bc, B:239:0x02c8, B:243:0x02da, B:244:0x02df, B:246:0x02e5, B:248:0x02ee, B:252:0x02fd, B:254:0x0304, B:256:0x030e, B:259:0x031c, B:261:0x0327, B:263:0x0331, B:67:0x033a, B:70:0x0348, B:71:0x0351, B:74:0x0361, B:75:0x036a, B:77:0x0388, B:79:0x0391, B:81:0x0397, B:82:0x039f, B:85:0x03ab, B:86:0x03b4, B:87:0x03bb, B:90:0x03c9, B:91:0x03d2, B:92:0x03d9, B:93:0x03e0, B:97:0x03f0, B:106:0x0412, B:107:0x0417, B:109:0x041c, B:113:0x0435, B:115:0x043b, B:119:0x044c, B:121:0x045a, B:123:0x0465, B:125:0x046b, B:126:0x0473, B:128:0x047a, B:129:0x0482, B:131:0x048e, B:133:0x0496, B:135:0x049d, B:137:0x04ac, B:138:0x04b3, B:142:0x04ca, B:143:0x04d1, B:144:0x04d8, B:146:0x04e8, B:148:0x04f3, B:150:0x04fc, B:153:0x0509, B:155:0x0513, B:156:0x051b, B:160:0x0527, B:162:0x05d4, B:164:0x0533, B:165:0x053a, B:166:0x0541, B:167:0x0548, B:168:0x054f, B:169:0x0556, B:170:0x055d, B:172:0x0570, B:174:0x0576, B:178:0x0449, B:184:0x0587, B:186:0x0592, B:188:0x059f, B:190:0x05aa, B:265:0x05b4, B:267:0x05c1, B:269:0x05cd), top: B:61:0x0199, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0527 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0533 A[Catch: KQp -> 0x05d5, TRY_ENTER, TRY_LEAVE, TryCatch #2 {KQp -> 0x05d5, blocks: (B:62:0x0199, B:63:0x01a1, B:64:0x01aa, B:192:0x01b8, B:193:0x01c1, B:194:0x01ca, B:195:0x01d9, B:200:0x01ed, B:201:0x01f6, B:202:0x0204, B:205:0x0210, B:207:0x021c, B:209:0x0223, B:210:0x022b, B:212:0x0234, B:214:0x0241, B:215:0x0249, B:217:0x0256, B:219:0x0264, B:221:0x026b, B:224:0x0275, B:227:0x0283, B:228:0x028c, B:232:0x029d, B:233:0x02a5, B:234:0x02ae, B:236:0x02bc, B:239:0x02c8, B:243:0x02da, B:244:0x02df, B:246:0x02e5, B:248:0x02ee, B:252:0x02fd, B:254:0x0304, B:256:0x030e, B:259:0x031c, B:261:0x0327, B:263:0x0331, B:67:0x033a, B:70:0x0348, B:71:0x0351, B:74:0x0361, B:75:0x036a, B:77:0x0388, B:79:0x0391, B:81:0x0397, B:82:0x039f, B:85:0x03ab, B:86:0x03b4, B:87:0x03bb, B:90:0x03c9, B:91:0x03d2, B:92:0x03d9, B:93:0x03e0, B:97:0x03f0, B:106:0x0412, B:107:0x0417, B:109:0x041c, B:113:0x0435, B:115:0x043b, B:119:0x044c, B:121:0x045a, B:123:0x0465, B:125:0x046b, B:126:0x0473, B:128:0x047a, B:129:0x0482, B:131:0x048e, B:133:0x0496, B:135:0x049d, B:137:0x04ac, B:138:0x04b3, B:142:0x04ca, B:143:0x04d1, B:144:0x04d8, B:146:0x04e8, B:148:0x04f3, B:150:0x04fc, B:153:0x0509, B:155:0x0513, B:156:0x051b, B:160:0x0527, B:162:0x05d4, B:164:0x0533, B:165:0x053a, B:166:0x0541, B:167:0x0548, B:168:0x054f, B:169:0x0556, B:170:0x055d, B:172:0x0570, B:174:0x0576, B:178:0x0449, B:184:0x0587, B:186:0x0592, B:188:0x059f, B:190:0x05aa, B:265:0x05b4, B:267:0x05c1, B:269:0x05cd), top: B:61:0x0199, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0581  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0d() {
        /*
            Method dump skipped, instructions count: 1723
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6ax.A0d():void");
    }

    public void A0e(long j) {
        this.A0k = j;
        while (true) {
            ArrayDeque arrayDeque = this.A11;
            if (arrayDeque.isEmpty() || j < ((C7ts) arrayDeque.peek()).A00) {
                return;
            }
            A07((C7ts) arrayDeque.poll());
            A0Z();
        }
    }

    public final void A0f(long j) {
        6Yl r305 = (6Yl) this.A0M.A02.A01(j);
        if (r305 == null && this.A0r && this.A0A != null) {
            r305 = (6Yl) this.A0M.A02.A00();
        }
        if (r305 != null) {
            this.A0E = r305;
        } else {
            if (!this.A0U) {
                return;
            }
            r305 = this.A0E;
            if (r305 == null) {
                return;
            }
        }
        A0g(this.A0A, r305);
        this.A0U = false;
        this.A0r = false;
    }

    public void A0g(MediaFormat mediaFormat, 6Yl r303) {
        C6pa c6pa = (C6pa) this;
        6Yl r305 = c6pa.A02;
        try {
            if (r305 == null) {
                if (c6pa.A0J != null) {
                    int integer = "audio/raw".equals(r303.A0W) ? r303.A0C : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? Util.A02(mediaFormat.getInteger("v-bits-per-sample")) : 2;
                    6Zr r0 = new 6Zr();
                    r0.A0U = "audio/raw";
                    r0.A0A = integer;
                    r0.A04 = mediaFormat.getInteger("channel-count");
                    r0.A0E = mediaFormat.getInteger("sample-rate");
                    if (!5N4.A02(5N3.A0A)) {
                        r0.A06 = r303.A08;
                        r0.A07 = r303.A09;
                    }
                    r305 = new 6Yl(r0);
                }
                c6pa.A0C.AHK(r303, (int[]) null, 0);
                return;
            }
            c6pa.A0C.AHK(r303, (int[]) null, 0);
            return;
        } catch (C7hr e) {
            throw c6pa.A0J(e.format, e, 5001, false);
        }
        r303 = r305;
    }

    public void A0h(6Yl r302) {
    }

    public void A0i(6Yl r302) {
    }

    public void A0j(6Yl r302, String str) {
        A0i(r302);
    }

    public void A0k(6WD r302) {
    }

    public abstract void A0l(6WD r1);

    public void A0m(Kl8 kl8, String str, long j, long j2) {
        ((C6pa) this).A0B.A02(str, j, j2);
    }

    public void A0n(Exception exc) {
        5My.A05("MediaCodecAudioRenderer2", "Audio codec error", exc);
        6Wx r0 = ((C6pa) this).A0B;
        Handler handler = r0.A00;
        if (handler != null) {
            handler.post(new LoG(r0, exc));
        }
    }

    public void A0o(String str) {
        6Wx r0 = ((C6pa) this).A0B;
        Handler handler = r0.A00;
        if (handler != null) {
            handler.post(new C6bE(r0, str));
        }
    }

    public void A0p(String str) {
        6Wx r0 = ((C6pa) this).A0B;
        Handler handler = r0.A00;
        if (handler != null) {
            handler.post(new LoE(r0, str));
        }
    }

    public boolean A0q() {
        return false;
    }

    public boolean A0r() {
        return false;
    }

    public boolean A0s(6Yl r302) {
        boolean z = false;
        if (r302 != null && this.A0e && "video/av01".equalsIgnoreCase(r302.A0W)) {
            z = true;
        }
        return z;
    }

    public boolean A0t(6Yl r302, 6bI r303, ByteBuffer byteBuffer, int i, int i2, int i3, long j, long j2, long j3, boolean z, boolean z2) {
        C6pa c6pa = (C6pa) this;
        byteBuffer.getClass();
        if (c6pa.A02 != null && (i2 & 2) != 0) {
            r303.getClass();
            r303.Ccr(i, false);
            return true;
        }
        if (z) {
            if (r303 != null) {
                r303.Ccr(i, false);
            }
            c6pa.A0F.A0B += i3;
            ((DefaultAudioSink) c6pa.A0C).A0H = true;
            return true;
        }
        try {
            if (!c6pa.A0C.BLk(byteBuffer, i3, j3)) {
                return false;
            }
            if (r303 != null) {
                r303.Ccr(i, false);
            }
            c6pa.A0F.A09 += i3;
            return true;
        } catch (KQj e) {
            throw c6pa.A0J(r302, e, 5002, e.isRecoverable);
        } catch (KQi e2) {
            throw c6pa.A0J(c6pa.A03, e2, 5001, e2.isRecoverable);
        }
    }

    public boolean A0u(C6b1 c6b1) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0069 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BVE() {
        /*
            r301 = this;
            r0 = r301
            X.6Yl r0 = r0.A0D
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L50
            java.lang.Integer r0 = X.0S2.A01
            r302 = r0
        Ld:
            r0 = r301
            r1 = r302
            r0.A0A = r1
        L12:
            r0 = r301
            X.6Yl r0 = r0.A0D
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L69
            r0 = r301
            boolean r0 = r0.A0K()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L4e
            r0 = r301
            int r0 = r0.A05
            r303 = r0
            r0 = r303
            if (r0 >= 0) goto L4e
            r0 = r301
            long r0 = r0.A0i
            r304 = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r306 = r0
            r0 = r304
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L69
            long r0 = android.os.SystemClock.elapsedRealtime()
            r306 = r0
            r0 = r306
            r1 = r304
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r303 = r0
            r0 = r303
            if (r0 >= 0) goto L69
        L4e:
            r0 = 1
            return r0
        L50:
            r0 = r301
            boolean r0 = r0.A0K()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L12
            r0 = r301
            int r0 = r0.A05
            r303 = r0
            r0 = r303
            if (r0 >= 0) goto L12
            java.lang.Integer r0 = X.0S2.A0N
            r302 = r0
            goto Ld
        L69:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6ax.BVE():boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:606:0x0bc3
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0b1d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CfO(long r302, long r304) {
        /*
            Method dump skipped, instructions count: 3015
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6ax.CfO(long, long):void");
    }

    public void Csp(float f, float f2) {
        this.A00 = f;
        this.A0h = f2;
        A09(this.A0C);
    }

    public final int D3b(6Yl r302) {
        try {
            return A0T(r302, this.A10);
        } catch (C7ho e) {
            throw A0J(r302, e, 4002, false);
        }
    }
}
