package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: Ijj.class */
public final class Ijj implements JMz {
    public int A00;
    public long A01;
    public long A02;
    public MediaFormat A03;
    public MediaFormat A04;
    public java.util.Map A05;
    public boolean A06;
    public int A07;
    public long A08;
    public 4RJ A09;
    public I51 A0A;
    public HAy A0B;
    public JMz A0C;
    public JLT A0D;
    public HYs A0E = new HYs();
    public I9e A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final long A0J;
    public final long A0K;
    public final long A0L;
    public final JGx A0M;
    public final Hgs A0N;
    public final String A0O;
    public final String A0P;

    public Ijj(Hqj hqj, I51 i51, JGx jGx, HAy hAy, JLT jlt, Hgs hgs, I9e i9e, String str, String str2, java.util.Map map, long j, long j2, long j3, boolean z, boolean z2) {
        java.util.Map map2 = map;
        this.A0N = hgs;
        this.A0M = jGx;
        this.A0D = jlt;
        this.A0L = j;
        this.A0K = j2;
        this.A0J = j3;
        this.A0B = hAy;
        this.A0I = z;
        this.A0H = z2;
        this.A0A = i51;
        this.A0P = str2;
        this.A0F = i9e;
        if (z && !z2) {
            throw AnonymousClass001.A0L("Streaming mode can be used only with fragmented files");
        }
        this.A0G = AnonymousClass001.A1P((j > j2 ? 1 : (j == j2 ? 0 : -1)));
        map2 = map == null ? AnonymousClass001.A0u() : map2;
        this.A05 = map2;
        this.A0O = str;
        if (!map2.containsKey("copyright")) {
            String str3 = hqj.A0E;
            if (str3 == null) {
                HashMap hashMap = hqj.A0J;
                if (hashMap != null) {
                    Iterator A13 = GOo.A13(hashMap);
                    while (A13.hasNext()) {
                        Iterator A132 = GOo.A13((AbstractMap) A13.next());
                        while (A132.hasNext()) {
                            Iterator A1G = GOn.A1G(A132.next());
                            while (A1G.hasNext()) {
                                str3 = ((Hqj) A1G.next()).A0E;
                                if (str3 != null) {
                                }
                            }
                        }
                    }
                }
            }
            if (!A00(str3).equals(0S2.A0C)) {
                map2.put("copyright", str3);
            }
        }
        java.util.Map map3 = this.A05;
        if (map3.containsKey("composer")) {
            return;
        }
        String str4 = hqj.A0D;
        if (str4 == null) {
            HashMap hashMap2 = hqj.A0J;
            if (hashMap2 != null) {
                Iterator A133 = GOo.A13(hashMap2);
                while (A133.hasNext()) {
                    Iterator A134 = GOo.A13((AbstractMap) A133.next());
                    while (A134.hasNext()) {
                        Iterator A1G2 = GOn.A1G(A134.next());
                        while (A1G2.hasNext()) {
                            str4 = ((Hqj) A1G2.next()).A0D;
                            if (str4 != null) {
                            }
                        }
                    }
                }
                return;
            }
            return;
        }
        if (A00(str4).equals(0S2.A0C)) {
            return;
        }
        map3.put("composer", str4);
    }

    public static Integer A00(String str) {
        Integer num;
        String str2;
        Integer[] A1a = DKD.A1a();
        int length = A1a.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < length) {
                num = A1a[i2];
                switch (num.intValue()) {
                    case 1:
                        str2 = "Merlot";
                        break;
                    case 2:
                        str2 = "default";
                        break;
                    default:
                        str2 = "Facebook View";
                        break;
                }
                if (!str2.equals(str)) {
                    i = i2 + 1;
                }
            } else {
                num = 0S2.A0C;
            }
        }
        return num;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r305 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A01(long r302) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ijj.A01(long):void");
    }

    private void A02(JMz jMz, long j, boolean z) {
        if (jMz != null) {
            Hgs hgs = this.A0N;
            4RJ r0 = this.A09;
            r0.getClass();
            HAy hAy = this.A0B;
            MediaFormat mediaFormat = this.A04;
            Hum hum = hgs.A03;
            hum.A03 = z;
            Hkg hkg = hum.A0G;
            JMX jmx = hkg.A07;
            if (jmx != null) {
                Hqj hqj = hgs.A02;
                long j2 = hqj.A08;
                long length = r0.length();
                int i = hqj.A05;
                int i2 = hqj.A03;
                long j3 = hqj.A06;
                I8v i8v = hkg.A06;
                I51 i51 = hum.A0C;
                Hts hts = null;
                if (hAy == HAy.A01) {
                    JNX jnx = hum.A0E;
                    if (jnx != null) {
                        hts = jnx.Aw5();
                    }
                } else {
                    JNA jna = hum.A0I;
                    if (jna != null) {
                        hts = jna.Aw5();
                    }
                }
                IDe iDe = new IDe(mediaFormat, hts, i51, i8v, hAy, r0, 0.0d, i, i2, j2, length, j3, j, -1, z);
                hum.A0J.add(iDe);
                jmx.CJx(iDe);
            }
        }
    }

    public static void A03(Ijj ijj, boolean z) {
        JMz jMz = ijj.A0C;
        4RJ r0 = ijj.A09;
        if (jMz == null || !jMz.BWK()) {
            return;
        }
        try {
            jMz.stop();
            if (!z || r0 == null) {
                return;
            }
            r0.delete();
        } catch (RuntimeException e) {
            if (r0 != null && r0.exists()) {
                r0.A00();
            }
            throw new RuntimeException("Cannot stop the muxer", e);
        }
    }

    @Override // X.JMz
    public void AHJ(String str) {
        throw 0Q8.createAndThrow();
    }

    @Override // X.JMz
    public String Ayf() {
        JMz jMz = this.A0C;
        if (jMz != null) {
            return jMz.Ayf();
        }
        return null;
    }

    @Override // X.JMz
    public boolean BWK() {
        return this.A06;
    }

    @Override // X.JMz
    public void Cm1(MediaFormat mediaFormat) {
        this.A03 = mediaFormat;
    }

    @Override // X.JMz
    public void Cs6(int i) {
        this.A00 = i;
    }

    @Override // X.JMz
    public void CwH(MediaFormat mediaFormat) {
        this.A04 = mediaFormat;
    }

    @Override // X.JMz
    public void DB0(JKa jKa) {
        MediaCodec.BufferInfo Aa8 = jKa.Aa8();
        if (this.A08 == -1) {
            this.A08 = Aa8.presentationTimeUs;
        }
        JMz jMz = this.A0C;
        jMz.getClass();
        jMz.DB0(jKa);
        long j = this.A01 + jKa.Aa8().size;
        this.A01 = j;
        this.A0A.A02 = j;
    }

    /* JADX WARN: Type inference failed for: r0v96, types: [X.IjT, java.lang.Object] */
    @Override // X.JMz
    public void DBO(JKa jKa) {
        MediaCodec.BufferInfo Aa8 = jKa.Aa8();
        if (this.A02 == -1) {
            this.A02 = Aa8.presentationTimeUs;
        }
        if ((Aa8.flags & 2) != 0) {
            List list = this.A0E.A00;
            ?? obj = new Object();
            ByteBuffer byteBuffer = jKa.getByteBuffer();
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.limit());
            allocateDirect.put(byteBuffer.asReadOnlyBuffer());
            ((IjT) obj).A01 = allocateDirect;
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            ((IjT) obj).A00 = bufferInfo;
            MediaCodec.BufferInfo Aa82 = jKa.Aa8();
            bufferInfo.set(Aa82.offset, Aa82.size, Aa82.presentationTimeUs, Aa82.flags);
            list.add(obj);
        }
        boolean z = true;
        if ((Aa8.flags & 1) != 0) {
            long j = Aa8.presentationTimeUs;
            if (j - this.A02 < this.A0K) {
                z = false;
            }
            if (this.A0L - j >= this.A0J && z) {
                A03(this, false);
                A02(this.A0C, Aa8.presentationTimeUs - this.A02, false);
                A01(Aa8.presentationTimeUs);
                HYs hYs = this.A0E;
                JMz jMz = this.A0C;
                jMz.getClass();
                Iterator it = hYs.A00.iterator();
                while (it.hasNext()) {
                    jMz.DBO((JKa) it.next());
                }
            }
        }
        Aa8.presentationTimeUs -= this.A02;
        JMz jMz2 = this.A0C;
        jMz2.getClass();
        jMz2.DBO(jKa);
        long j2 = this.A01 + Aa8.size;
        this.A01 = j2;
        this.A0A.A02 = j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r301.A04 != null) goto L6;
     */
    @Override // X.JMz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void start() {
        /*
            r301 = this;
            r0 = r301
            android.media.MediaFormat r0 = r0.A03
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 != 0) goto L16
            r0 = r301
            android.media.MediaFormat r0 = r0.A04
            r302 = r0
            r0 = 0
            r304 = r0
            r0 = r302
            if (r0 == 0) goto L18
        L16:
            r0 = 1
            r304 = r0
        L18:
            r0 = r304
            r1 = 0
            X.IFX.A07(r0, r1)
            r0 = r301
            r1 = -1
            long r1 = (long) r1
            r0.A01(r1)
            r0 = r301
            r1 = r303
            r0.A06 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ijj.start():void");
    }

    @Override // X.JMz
    public void stop() {
        try {
            A03(this, false);
            long j = this.A0L;
            long j2 = this.A02;
            long j3 = -1;
            if (j2 != j3) {
                j = j2;
            }
            if (this.A08 != j3) {
                if (!this.A0F.A1P()) {
                    j = Math.min(j, this.A08);
                } else if (HAy.A01.equals(this.A0B)) {
                    j = Math.min(j, this.A08);
                }
            }
            A02(this.A0C, j - j, true);
        } finally {
            this.A06 = false;
        }
    }
}
