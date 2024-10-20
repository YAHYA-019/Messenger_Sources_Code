package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: Ik9.class */
public final class Ik9 implements JNA {
    public static final ByteBuffer A0K = GOq.A17(0);
    public int A00;
    public MediaCodec A01;
    public MediaFormat A02;
    public JNX A03;
    public RaD A04;
    public Htc A05;
    public ByteBuffer A06;
    public boolean A08;
    public ByteBuffer[] A09;
    public ByteBuffer[] A0A;
    public Hib A0B;
    public final Hkg A0D;
    public final JO9 A0E;
    public final JGy A0F;
    public final JKb A0G;
    public volatile boolean A0H;
    public volatile boolean A0I;
    public volatile long A0J;
    public final MediaCodec.BufferInfo A0C = new MediaCodec.BufferInfo();
    public ByteBuffer A07 = A0K;

    public Ik9(Hib hib, JO9 jo9, JGy jGy, JKb jKb, Hkg hkg) {
        this.A0D = hkg;
        this.A0B = hib;
        this.A0F = jGy;
        this.A0E = jo9;
        this.A0G = jKb;
    }

    private float A00(long j) {
        Hkg hkg = this.A0D;
        I9d i9d = hkg.A08;
        if (i9d == null) {
            return 1.0f;
        }
        Htt htt = new Htt(i9d, hkg.A0A.A1d());
        htt.A01(HAy.A01, this.A00);
        return htt.A00(TimeUnit.MICROSECONDS, j);
    }

    public void AHI(int i) {
        this.A00 = i;
        Hib hib = this.A0B;
        ByteBuffer[] byteBufferArr = hib.A05;
        ByteBuffer byteBuffer = byteBufferArr[i];
        if (byteBuffer == null) {
            byteBuffer = GOq.A17(hib.A04.A0B.A01 * 1024 * 2);
            byteBufferArr[i] = byteBuffer;
        } else {
            byteBuffer.clear();
        }
        this.A06 = byteBuffer;
        JGy jGy = this.A0F;
        JO9 jo9 = this.A0E;
        JKb jKb = this.A0G;
        Hkg hkg = this.A0D;
        JNX AIg = jGy.AIg(jo9, jKb, hkg.A0A);
        this.A03 = AIg;
        Hw1.A01(AIg, hkg);
        this.A03.CkM(HAy.A01, this.A00);
        MediaFormat B8a = this.A03.B8a();
        B8a.getClass();
        String string = B8a.getString("mime");
        string.getClass();
        this.A01 = MediaCodec.createDecoderByType(string);
        AbstractC2326GOr.A0u(B8a);
        this.A01.configure(B8a, (Surface) null, (MediaCrypto) null, 0);
        this.A01.start();
        this.A09 = this.A01.getInputBuffers();
        this.A0A = this.A01.getOutputBuffers();
    }

    public long ALy() {
        throw AnonymousClass001.A0p();
    }

    /* JADX WARN: Type inference failed for: r0v195, types: [java.lang.Object, X.Htc] */
    public void ALz(long j) {
        I9d i9d;
        Huc A04;
        Huc A042;
        this.A06.getClass();
        this.A06.clear();
        while (this.A06.hasRemaining() && !this.A08) {
            int min = Math.min(this.A06.remaining(), this.A07.remaining());
            if (min > 0) {
                ByteBuffer duplicate = this.A07.duplicate();
                duplicate.limit(duplicate.position() + min);
                this.A06.put(duplicate);
                ByteBuffer byteBuffer = this.A07;
                byteBuffer.position(byteBuffer.position() + min);
            } else {
                if (!this.A08) {
                    this.A01.getClass();
                    MediaCodec mediaCodec = this.A01;
                    MediaCodec.BufferInfo bufferInfo = this.A0C;
                    int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 5000L);
                    if (dequeueOutputBuffer >= 0) {
                        if ((bufferInfo.flags & 4) != 0) {
                            this.A08 = true;
                            Htc htc = this.A05;
                            if (htc != null) {
                                htc.A01();
                            }
                        } else {
                            ByteBuffer[] byteBufferArr = this.A0A;
                            byteBufferArr.getClass();
                            ByteBuffer byteBuffer2 = byteBufferArr[dequeueOutputBuffer];
                            AbstractC2326GOr.A0t(bufferInfo, byteBuffer2);
                            Htc htc2 = this.A05;
                            htc2.getClass();
                            htc2.A02(byteBuffer2);
                            Htc htc3 = this.A05;
                            htc3.getClass();
                            ByteBuffer A00 = htc3.A00();
                            RaD raD = this.A04;
                            if (raD != null) {
                                raD.A00(A00);
                                RaD raD2 = this.A04;
                                A00 = raD2.A02;
                                raD2.A02 = raD2.A00;
                            }
                            this.A07 = A00;
                            this.A01.releaseOutputBuffer(dequeueOutputBuffer, false);
                        }
                    } else if (dequeueOutputBuffer == -3) {
                        this.A0A = this.A01.getOutputBuffers();
                    } else if (dequeueOutputBuffer == -2) {
                        MediaFormat outputFormat = this.A01.getOutputFormat();
                        this.A02 = outputFormat;
                        outputFormat.getClass();
                        int integer = outputFormat.getInteger("channel-count");
                        Hkg hkg = this.A0D;
                        Hz0 hz0 = hkg.A0B;
                        int i = hz0.A01;
                        this.A04 = integer != i ? new RaD(integer, i) : null;
                        MediaFormat mediaFormat = this.A02;
                        mediaFormat.getClass();
                        int integer2 = mediaFormat.getInteger("sample-rate");
                        MediaFormat mediaFormat2 = this.A02;
                        mediaFormat2.getClass();
                        int integer3 = mediaFormat2.getInteger("channel-count");
                        int i2 = hz0.A03;
                        ByteBuffer byteBuffer3 = Htc.A02;
                        float A002 = A00(0L);
                        I9d i9d2 = hkg.A08;
                        if (i9d2 != null && (A042 = i9d2.A04(HAy.A01, this.A00)) != null) {
                            Iterator it = A042.A05.iterator();
                            while (it.hasNext()) {
                                it.next();
                            }
                        }
                        ?? obj = new Object();
                        obj.A01 = Htc.A02;
                        obj.A00 = new RhL(A002, integer2, integer3, i2);
                        this.A05 = obj;
                    }
                }
                while (true) {
                    if (!this.A0I && !this.A0H) {
                        this.A01.getClass();
                        this.A03.getClass();
                        int dequeueInputBuffer = this.A01.dequeueInputBuffer(0L);
                        if (dequeueInputBuffer >= 0) {
                            ByteBuffer[] byteBufferArr2 = this.A09;
                            byteBufferArr2.getClass();
                            int Cb8 = this.A03.Cb8(byteBufferArr2[dequeueInputBuffer]);
                            if (Cb8 <= 0) {
                                this.A01.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                this.A0I = true;
                                break;
                            } else {
                                this.A01.queueInputBuffer(dequeueInputBuffer, 0, Cb8, this.A03.B8b(), this.A03.B8Z());
                                this.A03.A7l();
                            }
                        }
                    }
                }
            }
        }
        if (this.A05 != null && (i9d = this.A0D.A08) != null && (A04 = i9d.A04(HAy.A01, this.A00)) != null) {
            Iterator it2 = A04.A05.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        while (true) {
            int position = this.A06.position();
            int limit = this.A06.limit();
            ByteBuffer byteBuffer4 = this.A06;
            if (position >= limit) {
                byteBuffer4.flip();
                return;
            }
            byteBuffer4.put((byte) 0);
        }
    }

    public long Agj() {
        throw AnonymousClass001.A0p();
    }

    public Hts Aw5() {
        return null;
    }

    public boolean BRd() {
        return this.A08;
    }

    public void CkA(long j) {
        this.A0J = ((float) j) * A00(j);
        MediaCodec mediaCodec = this.A01;
        mediaCodec.getClass();
        mediaCodec.flush();
        this.A07 = A0K;
        this.A0I = false;
        this.A08 = false;
        JNX jnx = this.A03;
        jnx.getClass();
        jnx.CkA(this.A0J);
    }

    public void D8I(I9V i9v) {
    }

    public void DAG() {
    }

    public void cancel() {
        this.A0H = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.I3R] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.HFk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.HFk, java.lang.Object] */
    public void release() {
        ?? obj = new Object();
        H3f h3f = new H3f(this.A01, (I3R) obj);
        ?? obj2 = new Object();
        ((HFk) obj2).A00 = h3f;
        obj2.A00();
        H3f h3f2 = new H3f((I3R) obj, this.A03);
        ?? obj3 = new Object();
        ((HFk) obj3).A00 = h3f2;
        obj3.A00();
        obj.A02();
        this.A06 = null;
        this.A01 = null;
    }

    public void start() {
    }
}
