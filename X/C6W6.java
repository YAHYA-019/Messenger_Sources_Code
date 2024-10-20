package X;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6W6, reason: invalid class name */
/* loaded from: 6W6.class */
public abstract class C6W6 extends 6W7 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public MediaFormat A08;
    public 6Yl A09;
    public 6VN A0A;
    public C7ys A0B;
    public 6bI A0C;
    public C6b1 A0D;
    public KQo A0E;
    public 6WI A0F;
    public ByteBuffer A0G;
    public ArrayDeque A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public long A0S;
    public long A0T;
    public C7ys A0U;
    public String A0V;
    public boolean A0W;
    public final int A0X;
    public final MediaCodec.BufferInfo A0Y;
    public final 6W4 A0Z;
    public final 6Vz A0a;
    public final 6WB A0b;
    public final 6WD A0c;
    public final 6W2 A0d;
    public final List A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final int A0h;
    public final 6WD A0i;
    public final 6WC A0j;
    public final ArrayDeque A0k;
    public final boolean A0l;
    public final boolean A0m;

    /* JADX WARN: Type inference failed for: r0v22, types: [X.6WB, java.lang.Object] */
    public C6W6(6W4 r302, 6Vz r303, 6WC r304, 6W2 r305, int i, int i2, int i3, boolean z, boolean z2) {
        super(i);
        this.A0T = -9223372036854775807L;
        this.A04 = -9223372036854775807L;
        this.A0P = false;
        this.A0L = false;
        r303.getClass();
        this.A0a = r303;
        this.A0Z = r302;
        this.A0d = r305;
        this.A0j = r304;
        this.A0g = z;
        this.A0f = z2;
        this.A0h = i2;
        this.A0X = i3;
        this.A0c = new 6WD(0);
        this.A0i = new 6WD(0);
        this.A0b = new Object();
        this.A0e = new ArrayList();
        this.A0Y = new MediaCodec.BufferInfo();
        this.A0k = new ArrayDeque();
        this.A0F = 6WI.A01;
        this.A00 = 0;
        this.A01 = 0;
        this.A05 = -9223372036854775807L;
        this.A06 = -9223372036854775807L;
        this.A0l = 5N4.A02(5N3.A1P);
        this.A0m = 5N4.A02(5N3.A1C);
    }

    private void A0D() {
        if (this.A01 == 2) {
            A0V();
            A0W();
        } else {
            this.A0M = true;
            A0T();
        }
    }

    private void A0E() {
        this.A02 = -1;
        this.A0c.A02 = null;
    }

    private void A0F(MediaCrypto mediaCrypto, C6b1 c6b1) {
        String str = c6b1.A03;
        6bI r0 = null;
        try {
            boolean z = this.A0m;
            if (z) {
                6Yl r02 = this.A09;
                if (this instanceof 6W5) {
                    6W5 r03 = (6W5) this;
                    r03.A0j.A06(str);
                    r03.A0g.A00(r02);
                }
            } else {
                6Yl r04 = this.A09;
                if (this instanceof 6W5) {
                    ((6W5) this).A0g.A00(r04);
                }
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!z) {
                if (this instanceof 6WX) {
                    6Wx r05 = ((6WX) this).A0F;
                    Handler handler = r05.A00;
                    if (handler != null) {
                        handler.post(new C6bE(r05, str));
                    }
                } else {
                    ((6W5) this).A0j.A06(str);
                }
            }
            5LG.A01(0Pz.A0W("createCodec:", str));
            boolean z2 = this instanceof 6WX;
            6bI A01 = C5ho.A06.A01(this.A0Z.A00, this.A0a, 0S2.A01, str, !z2);
            this.A0V = str;
            5LG.A00();
            5LG.A01("configureCodec");
            A0Y(mediaCrypto, this.A09, A01, c6b1);
            5LG.A00();
            5LG.A01("startCodec");
            A01.start();
            5LG.A00();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.A0C = A01;
            this.A0D = c6b1;
            long j = elapsedRealtime2 - elapsedRealtime;
            if (z2) {
                ((6WX) this).A0F.A02(str, elapsedRealtime2, j);
                return;
            }
            6W5 r06 = (6W5) this;
            6WT r07 = r06.A0j;
            Handler handler2 = r07.A00;
            if (handler2 != null) {
                handler2.post(new Lqk(r07, str, elapsedRealtime2, j));
            }
            r06.A0W = 6W5.A0C(str);
            if (r06.A0k) {
                Context context = r06.A0g.A05.A0f;
                if (Util.A00 >= 29) {
                    context.getApplicationContext().getApplicationInfo();
                }
            }
        } catch (Exception e) {
            if (0 != 0) {
                r0.release();
            }
            throw e;
        }
    }

    private boolean A0G(int i) {
        6WB r0 = ((6W7) this).A0C;
        r0.A01 = null;
        r0.A00 = null;
        6WD r02 = this.A0i;
        r02.A00();
        int A0I = A0I(r0, r02, i | 4);
        if (A0I == -5) {
            A0Z(r0.A00);
            return true;
        }
        if (A0I != -4 || (((6WE) r02).A00 & 4) != 4) {
            return false;
        }
        this.A0J = true;
        A0D();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (r307 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List A0S(X.6Yl r302, X.6W2 r303, boolean r304) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof X.6WX
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L5b
            r0 = r301
            r306 = r0
            r0 = r301
            X.6WX r0 = (X.6WX) r0
            r306 = r0
            r0 = r302
            java.lang.String r0 = r0.A0W
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L66
            java.lang.String r0 = "audio/raw"
            r308 = r0
            r0 = r308
            r1 = r307
            boolean r0 = r0.equals(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L6a
            r0 = r306
            X.6Wk r0 = r0.A0G
            com.google.android.exoplayer2.audio.DefaultAudioSink r0 = (com.google.android.exoplayer2.audio.DefaultAudioSink) r0
            r309 = r0
            r0 = r309
            r1 = r302
            int r0 = r0.AnG(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L6a
            r0 = r308
            X.6b1 r0 = X.C6ay.A01(r0)
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L6a
            r0 = r309
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
        L5b:
            r0 = r302
            java.lang.String r0 = r0.A0W
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L6a
        L66:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L6a:
            r0 = r303
            r1 = r307
            r2 = r304
            r3 = 0
            java.util.List r0 = r0.Agl(r1, r2, r3)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6W6.A0S(X.6Yl, X.6W2, boolean):java.util.List");
    }

    private void A0T() {
        if (this instanceof 6WX) {
            6WX r0 = (6WX) this;
            try {
                r0.A0G.CXf();
            } catch (KQj e) {
                throw r0.A0J(e.format, e, 5002, e.isRecoverable);
            }
        }
    }

    private boolean A0b(6Yl r302) {
        boolean z = false;
        if (r302 != null && this.A0P && "video/av01".equalsIgnoreCase(r302.A0W)) {
            z = true;
        }
        return z;
    }

    public void A0N() {
        if (this.A0l) {
            A0V();
        }
    }

    public void A0O() {
        this.A09 = null;
        this.A0F = 6WI.A01;
        this.A0k.clear();
        this.A0H = null;
        try {
            A0V();
            try {
                C7ys c7ys = this.A0B;
                if (c7ys != null) {
                    c7ys.Cch(null);
                }
                try {
                    C7ys c7ys2 = this.A0U;
                    if (c7ys2 != null && c7ys2 != this.A0B) {
                        c7ys2.Cch(null);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    C7ys c7ys3 = this.A0U;
                    if (c7ys3 != null && c7ys3 != this.A0B) {
                        c7ys3.Cch(null);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                C7ys c7ys4 = this.A0B;
                if (c7ys4 != null) {
                    c7ys4.Cch(null);
                }
                try {
                    C7ys c7ys5 = this.A0U;
                    if (c7ys5 != null && c7ys5 != this.A0B) {
                        c7ys5.Cch(null);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    C7ys c7ys6 = this.A0U;
                    if (c7ys6 != null && c7ys6 != this.A0B) {
                        c7ys6.Cch(null);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    public void A0P(long j, boolean z) {
        this.A0J = false;
        this.A0M = false;
        if (this.A0C != null) {
            A0U();
        }
        synchronized (this.A0F.A00) {
        }
        this.A0F.A00.A02();
        this.A0k.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6VN, java.lang.Object] */
    public void A0Q(boolean z, boolean z2) {
        this.A0A = new Object();
        this.A07 = 0L;
    }

    public void A0R(6Yl[] r302, long j, long j2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x007e, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r0.A0L) < 500) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0U() {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6W6.A0U():void");
    }

    public void A0V() {
        this.A0S = -9223372036854775807L;
        this.A0T = -9223372036854775807L;
        this.A04 = -9223372036854775807L;
        A0E();
        this.A03 = -1;
        this.A0G = null;
        this.A08 = null;
        this.A0R = false;
        this.A0N = false;
        this.A0e.clear();
        this.A0D = null;
        this.A0W = false;
        this.A0I = false;
        this.A00 = 0;
        this.A01 = 0;
        6bI r0 = this.A0C;
        if (r0 != null) {
            this.A0A.A03++;
            try {
                C5ho.A06.A02(this.A0Z.A00, this.A0a, r0, 0S2.A01, this.A0V, !(this instanceof 6WX));
                this.A0C = null;
                C7ys c7ys = this.A0B;
                if (c7ys == null || this.A0U == c7ys) {
                    return;
                }
                try {
                    c7ys.Cch(null);
                } finally {
                }
            } catch (Throwable th) {
                this.A0C = null;
                C7ys c7ys2 = this.A0B;
                if (c7ys2 != null && this.A0U != c7ys2) {
                    try {
                        c7ys2.Cch(null);
                    } finally {
                    }
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x04c3 A[Catch: KQo -> 0x04e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {KQo -> 0x04e2, blocks: (B:17:0x0070, B:150:0x007e, B:151:0x0084, B:153:0x008f, B:154:0x0096, B:159:0x00a9, B:161:0x00b4, B:162:0x00ba, B:165:0x00c8, B:167:0x00d4, B:169:0x00db, B:170:0x00e0, B:172:0x00e9, B:174:0x00f6, B:175:0x00fe, B:177:0x010b, B:179:0x0119, B:181:0x0120, B:184:0x012c, B:187:0x0137, B:188:0x013d, B:192:0x014e, B:193:0x0156, B:194:0x015c, B:196:0x016a, B:199:0x0176, B:203:0x0188, B:206:0x0193, B:208:0x019a, B:210:0x01a0, B:211:0x01a6, B:214:0x01af, B:215:0x01b7, B:216:0x01be, B:218:0x01c5, B:21:0x01f0, B:24:0x01fa, B:26:0x0201, B:29:0x020d, B:31:0x0228, B:33:0x0231, B:35:0x0237, B:36:0x023c, B:39:0x0248, B:40:0x024e, B:41:0x0255, B:42:0x025e, B:43:0x0265, B:46:0x027a, B:47:0x0280, B:50:0x028c, B:53:0x0298, B:57:0x02a6, B:63:0x02b2, B:64:0x02b7, B:76:0x02c3, B:68:0x02fc, B:82:0x02df, B:85:0x02ec, B:87:0x02f6, B:89:0x030b, B:91:0x0319, B:93:0x0329, B:95:0x032f, B:96:0x0337, B:98:0x033e, B:99:0x0346, B:101:0x0352, B:103:0x035a, B:105:0x0361, B:107:0x0370, B:108:0x0377, B:112:0x038e, B:113:0x0395, B:114:0x039c, B:116:0x03b0, B:118:0x03bb, B:121:0x03c8, B:123:0x03d2, B:124:0x03da, B:128:0x03e6, B:130:0x04e1, B:132:0x03f2, B:133:0x03f9, B:134:0x0400, B:135:0x0407, B:136:0x040e, B:137:0x0415, B:138:0x041c, B:140:0x0437, B:142:0x043d, B:144:0x04c3, B:146:0x04ce, B:148:0x04da, B:220:0x01cf, B:222:0x01da, B:224:0x01e7, B:226:0x01ee), top: B:16:0x0070, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01fa A[Catch: KQo -> 0x04e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {KQo -> 0x04e2, blocks: (B:17:0x0070, B:150:0x007e, B:151:0x0084, B:153:0x008f, B:154:0x0096, B:159:0x00a9, B:161:0x00b4, B:162:0x00ba, B:165:0x00c8, B:167:0x00d4, B:169:0x00db, B:170:0x00e0, B:172:0x00e9, B:174:0x00f6, B:175:0x00fe, B:177:0x010b, B:179:0x0119, B:181:0x0120, B:184:0x012c, B:187:0x0137, B:188:0x013d, B:192:0x014e, B:193:0x0156, B:194:0x015c, B:196:0x016a, B:199:0x0176, B:203:0x0188, B:206:0x0193, B:208:0x019a, B:210:0x01a0, B:211:0x01a6, B:214:0x01af, B:215:0x01b7, B:216:0x01be, B:218:0x01c5, B:21:0x01f0, B:24:0x01fa, B:26:0x0201, B:29:0x020d, B:31:0x0228, B:33:0x0231, B:35:0x0237, B:36:0x023c, B:39:0x0248, B:40:0x024e, B:41:0x0255, B:42:0x025e, B:43:0x0265, B:46:0x027a, B:47:0x0280, B:50:0x028c, B:53:0x0298, B:57:0x02a6, B:63:0x02b2, B:64:0x02b7, B:76:0x02c3, B:68:0x02fc, B:82:0x02df, B:85:0x02ec, B:87:0x02f6, B:89:0x030b, B:91:0x0319, B:93:0x0329, B:95:0x032f, B:96:0x0337, B:98:0x033e, B:99:0x0346, B:101:0x0352, B:103:0x035a, B:105:0x0361, B:107:0x0370, B:108:0x0377, B:112:0x038e, B:113:0x0395, B:114:0x039c, B:116:0x03b0, B:118:0x03bb, B:121:0x03c8, B:123:0x03d2, B:124:0x03da, B:128:0x03e6, B:130:0x04e1, B:132:0x03f2, B:133:0x03f9, B:134:0x0400, B:135:0x0407, B:136:0x040e, B:137:0x0415, B:138:0x041c, B:140:0x0437, B:142:0x043d, B:144:0x04c3, B:146:0x04ce, B:148:0x04da, B:220:0x01cf, B:222:0x01da, B:224:0x01e7, B:226:0x01ee), top: B:16:0x0070, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0248 A[Catch: KQo -> 0x04e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {KQo -> 0x04e2, blocks: (B:17:0x0070, B:150:0x007e, B:151:0x0084, B:153:0x008f, B:154:0x0096, B:159:0x00a9, B:161:0x00b4, B:162:0x00ba, B:165:0x00c8, B:167:0x00d4, B:169:0x00db, B:170:0x00e0, B:172:0x00e9, B:174:0x00f6, B:175:0x00fe, B:177:0x010b, B:179:0x0119, B:181:0x0120, B:184:0x012c, B:187:0x0137, B:188:0x013d, B:192:0x014e, B:193:0x0156, B:194:0x015c, B:196:0x016a, B:199:0x0176, B:203:0x0188, B:206:0x0193, B:208:0x019a, B:210:0x01a0, B:211:0x01a6, B:214:0x01af, B:215:0x01b7, B:216:0x01be, B:218:0x01c5, B:21:0x01f0, B:24:0x01fa, B:26:0x0201, B:29:0x020d, B:31:0x0228, B:33:0x0231, B:35:0x0237, B:36:0x023c, B:39:0x0248, B:40:0x024e, B:41:0x0255, B:42:0x025e, B:43:0x0265, B:46:0x027a, B:47:0x0280, B:50:0x028c, B:53:0x0298, B:57:0x02a6, B:63:0x02b2, B:64:0x02b7, B:76:0x02c3, B:68:0x02fc, B:82:0x02df, B:85:0x02ec, B:87:0x02f6, B:89:0x030b, B:91:0x0319, B:93:0x0329, B:95:0x032f, B:96:0x0337, B:98:0x033e, B:99:0x0346, B:101:0x0352, B:103:0x035a, B:105:0x0361, B:107:0x0370, B:108:0x0377, B:112:0x038e, B:113:0x0395, B:114:0x039c, B:116:0x03b0, B:118:0x03bb, B:121:0x03c8, B:123:0x03d2, B:124:0x03da, B:128:0x03e6, B:130:0x04e1, B:132:0x03f2, B:133:0x03f9, B:134:0x0400, B:135:0x0407, B:136:0x040e, B:137:0x0415, B:138:0x041c, B:140:0x0437, B:142:0x043d, B:144:0x04c3, B:146:0x04ce, B:148:0x04da, B:220:0x01cf, B:222:0x01da, B:224:0x01e7, B:226:0x01ee), top: B:16:0x0070, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0W() {
        /*
            Method dump skipped, instructions count: 1409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6W6.A0W():void");
    }

    public void A0X(long j) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a3, code lost:
    
        if (r0.A0A == (-1)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x03c0, code lost:
    
        if (r0.isFeatureSupported("low-latency") == false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0Y(android.media.MediaCrypto r302, X.6Yl r303, X.6bI r304, X.C6b1 r305) {
        /*
            Method dump skipped, instructions count: 1159
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6W6.A0Y(android.media.MediaCrypto, X.6Yl, X.6bI, X.6b1):void");
    }

    public void A0Z(6Yl r302) {
        int i;
        int A00;
        boolean z = this instanceof 6W5;
        if (z) {
            6W5 r0 = (6W5) this;
            if (r0.A0b(r302) || ((A00 = 5N4.A00(5N5.A07)) > 0 && r302 != null && r302.A0L > A00)) {
                r0.A0g.A02 = false;
            }
        }
        6Yl r02 = this.A09;
        this.A09 = r302;
        if (!Util.A0P(r302.A0O, r02 == null ? null : r02.A0O)) {
            6Yl r03 = this.A09;
            if (r03.A0O != null) {
                6WC r04 = this.A0j;
                if (r04 == null) {
                    throw A0J(r03, new IllegalStateException("Media requires a DrmSessionManager"), 4005, false);
                }
                C7ys A3x = r04.A3x(r03, (6ZM) null);
                this.A0U = A3x;
                if (A3x == this.A0B) {
                    A3x.Cch(null);
                }
            } else {
                this.A0U = null;
            }
        }
        if (this.A0U == this.A0B && this.A0C != null) {
            C6b1 c6b1 = this.A0D;
            6Yl r05 = this.A09;
            if (z) {
                6W5 r06 = (6W5) this;
                if (r06.A0b(r06.A09) && r02.A0W.equals(r05.A0W) && r02.A0F == r05.A0F) {
                    return;
                }
                if (6W5.A09(r02, r05, c6b1.A04)) {
                    int i2 = r05.A0L;
                    C7rJ c7rJ = r06.A0Q;
                    if (i2 <= c7rJ.A02 && r05.A0A <= c7rJ.A00 && 6W5.A00(r05) <= r06.A0Q.A01) {
                        if (r02.A01(r05)) {
                            return;
                        }
                        this.A0W = true;
                        this.A00 = 1;
                        return;
                    }
                }
            } else {
                6WX r07 = (6WX) this;
                if (r07.A0a.A0K && r05.A0B <= r07.A00 && (((i = c6b1.A05(r02, r05).A01) == 2 || i == 3) && r02.A08 == 0 && r02.A09 == 0 && r05.A08 == 0 && r05.A09 == 0)) {
                    return;
                }
            }
        }
        this.A0H = null;
        if (this.A0I) {
            this.A01 = 1;
        } else {
            A0V();
            A0W();
        }
    }

    public abstract void A0a(6WD r1);

    public boolean BVE() {
        Integer num;
        if (this.A09 == null) {
            num = 0S2.A01;
        } else {
            if (!this.A0R) {
                if (!A0K() && this.A03 < 0) {
                    num = 0S2.A0N;
                }
                if (this.A09 == null && !this.A0R) {
                    if (A0K() || this.A03 >= 0) {
                        return true;
                    }
                    long j = this.A0S;
                    return j != -9223372036854775807L && SystemClock.elapsedRealtime() < j;
                }
            }
            num = 0S2.A0C;
        }
        ((6W7) this).A0A = num;
        return this.A09 == null ? false : false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:941:0x151b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:838:0x0750. Please report as an issue. */
    public void CfO(long r302, long r304) {
        /*
            Method dump skipped, instructions count: 5407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6W6.CfO(long, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r0 == 2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012b, code lost:
    
        if (r0 <= r0.A00) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int D3b(X.6Yl r302) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6W6.D3b(X.6Yl):int");
    }
}
