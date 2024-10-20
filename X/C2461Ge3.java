package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import java.nio.ByteBuffer;
import org.webrtc.legacy.SurfaceTextureHelper;
import org.webrtc.legacy.videoengine.ARGBBuffer;
import org.webrtc.legacy.videoengine.NV21Buffer;
import org.webrtc.legacy.videoengine.YUV420888Buffer;

/* renamed from: X.Ge3, reason: case insensitive filesystem */
/* loaded from: Ge3.class */
public final class C2461Ge3 extends IOr implements JJE, JOo, JEJ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public long A08;
    public C01s A09;
    public JMb A0B;
    public Integer A0E;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public SurfaceTexture A0K;
    public Surface A0L;
    public JHx A0M;
    public SurfaceTextureHelper A0N;
    public final C0dr A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public volatile int A0S;
    public final int[] A0R = new int[1];
    public ByteBuffer A0F = null;
    public JLR A0A = null;
    public Integer A0D = null;
    public Integer A0C = null;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x005f, code lost:
    
        if (r314 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2461Ge3(X.C01s r302, X.C0dr r303, X.JMb r304, java.lang.Integer r305, int r306, int r307, int r308, int r309, int r310, boolean r311, boolean r312, boolean r313) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2461Ge3.<init>(X.01s, X.0dr, X.JMb, java.lang.Integer, int, int, int, int, int, boolean, boolean, boolean):void");
    }

    private void A00() {
        Integer num;
        int intValue;
        Integer num2 = this.A0D;
        if (num2 == null || (num = this.A0C) == null) {
            return;
        }
        int intValue2 = num2.intValue();
        if (intValue2 == this.A07 || (intValue = num.intValue()) == this.A06) {
            this.A0D = null;
            this.A0C = null;
            return;
        }
        this.A07 = intValue2;
        this.A06 = intValue;
        this.A0D = null;
        this.A0C = null;
        SurfaceTextureHelper surfaceTextureHelper = this.A0N;
        SurfaceTexture surfaceTexture = surfaceTextureHelper != null ? surfaceTextureHelper.surfaceTexture : this.A0K;
        surfaceTexture.getClass();
        surfaceTexture.setDefaultBufferSize(this.A07, this.A06);
    }

    public static void A01(C2461Ge3 c2461Ge3, boolean z) {
        JLR jlr = c2461Ge3.A0A;
        if (jlr != null) {
            synchronized (jlr) {
                if (z) {
                    c2461Ge3.A0A.CcL(c2461Ge3, HC9.A0O);
                    c2461Ge3.A0A.CcL(c2461Ge3, HC9.A0K);
                    c2461Ge3.A0A.CcL(c2461Ge3, HC9.A0M);
                    c2461Ge3.A0A.CcL(c2461Ge3, HC9.A0J);
                } else {
                    c2461Ge3.A0A.D5y(c2461Ge3, HC9.A0O);
                    c2461Ge3.A0A.D5y(c2461Ge3, HC9.A0K);
                    c2461Ge3.A0A.D5y(c2461Ge3, HC9.A0M);
                    c2461Ge3.A0A.D5y(c2461Ge3, HC9.A0J);
                }
            }
        }
    }

    private boolean A04() {
        if (this.A0S > 0) {
            this.A0S--;
        } else {
            if (this.A0H || this.A05 < 1) {
                return false;
            }
            long now = this.A0O.now();
            long j = this.A08;
            if (j < 0) {
                this.A08 = now;
                j = now;
            }
            if (now >= j) {
                long j2 = now - j;
                long j3 = this.A05;
                if (j2 <= j3) {
                    now = j + j3;
                }
                this.A08 = now;
                return false;
            }
        }
        return true;
    }

    public void A02(int i, int i2) {
        this.A0D = Integer.valueOf(i);
        this.A0C = Integer.valueOf(i2);
    }

    public void A03(I0F i0f) {
        byte[] bArr = i0f.A0A;
        int i = this.A03;
        int i2 = this.A02;
        boolean z = this.A0G;
        int i3 = this.A01;
        int i4 = this.A00;
        int i5 = i3 + i4;
        if (!z) {
            i5 = (i3 - i4) + HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH;
        }
        int i6 = i5 % HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH;
        int i7 = i0f.A03;
        if (i7 == 17) {
            bArr.getClass();
            NV21Buffer nV21Buffer = new NV21Buffer(bArr, i, i2, this.A07, this.A06, i6, false, this.A0P, false);
            JMb jMb = this.A0B;
            jMb.getClass();
            jMb.onCapturedFrameNV21(nV21Buffer);
            return;
        }
        if (i7 != 35) {
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Unsupported preview format (%d)", Integer.valueOf(i7));
            4zI.A01("EncodingVideoOutput", "%s: %s", new Object[]{formatStrLocaleSafe, ""});
            this.A09.D0v("EncodingVideoOutput", formatStrLocaleSafe);
            return;
        }
        Hd7[] hd7Arr = i0f.A0C;
        hd7Arr.getClass();
        Hd7 hd7 = hd7Arr[0];
        ByteBuffer byteBuffer = hd7.A02;
        int i8 = hd7.A01;
        Hd7 hd72 = hd7Arr[1];
        ByteBuffer byteBuffer2 = hd72.A02;
        int i9 = hd72.A01;
        Hd7 hd73 = hd7Arr[2];
        YUV420888Buffer yUV420888Buffer = new YUV420888Buffer(byteBuffer, i8, byteBuffer2, i9, hd73.A02, hd73.A01, hd72.A00, i, i2, this.A07, this.A06, i6, false, this.A0P, false);
        JMb jMb2 = this.A0B;
        jMb2.getClass();
        jMb2.onCapturedFrameYUV(yUV420888Buffer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (A04() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean ADY() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = super.ADY()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1d
            r0 = r301
            boolean r0 = r0.A0J
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1d
            r0 = r301
            boolean r0 = r0.A04()
            r303 = r0
            r0 = 1
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L1f
        L1d:
            r0 = 0
            r302 = r0
        L1f:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2461Ge3.ADY():boolean");
    }

    @Override // X.JOo
    public Integer AnF() {
        Integer num = this.A0E;
        Integer num2 = 0S2.A01;
        if (num == num2) {
            num2 = 0S2.A00;
        }
        return num2;
    }

    public H9r Aqv() {
        return null;
    }

    public String Aui() {
        return "EncodingVideoOutput";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r304v3 */
    @Override // X.JOo
    public int B8t() {
        boolean A1W = AnonymousClass001.A1W(this.A0E, 0S2.A00);
        if (this.A0G) {
            A1W = (A1W ? 1 : 0) | 2;
        }
        return A1W;
    }

    public HB9 BJV() {
        return this.A0I ? HB9.A04 : HB9.A05;
    }

    public void BOk(JHx jHx, JEM jem) {
        int i = 0;
        if (this.A0E != 0S2.A01) {
            int[] iArr = this.A0R;
            GLES20.glGenTextures(1, iArr, 0);
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
            this.A0K = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(this.A07, this.A06);
            this.A0L = new Surface(this.A0K);
            this.A0M = jHx;
            jHx.D3i(this.A0L, this);
            A01(this, this.A0J);
            return;
        }
        do {
            JMb jMb = this.A0B;
            jMb.getClass();
            SurfaceTextureHelper surfaceTextureHelper = jMb.getSurfaceTextureHelper();
            this.A0N = surfaceTextureHelper;
            if (surfaceTextureHelper != null) {
                SurfaceTexture surfaceTexture2 = surfaceTextureHelper.surfaceTexture;
                surfaceTexture2.setDefaultBufferSize(this.A07, this.A06);
                this.A0L = new Surface(surfaceTexture2);
                this.A0N.startListening(new J6f(this, jMb));
                this.A0M = jHx;
                jHx.D3i(this.A0L, this);
                A01(this, this.A0J);
                return;
            }
            i++;
        } while (i < 2);
        this.A0E = 0S2.A00;
        BOk(jHx, jem);
    }

    public boolean BcE() {
        if (this.A0H && this.A05 >= 1) {
            long now = this.A0O.now();
            if (now <= this.A08) {
                return false;
            }
            this.A08 = now + this.A05;
        }
        return super.BcE();
    }

    public void CGa(JJD jjd) {
        if (this.A0J) {
            int ordinal = jjd.BHT().ordinal();
            if (ordinal != 3) {
                if (ordinal == 7) {
                    Iii iii = (Iii) jjd;
                    this.A00 = iii.A00 * 90;
                    this.A01 = iii.A01;
                    return;
                } else {
                    if (ordinal != 5) {
                        if (ordinal != 6) {
                            throw AnonymousClass001.A0N("Received unknown message");
                        }
                        this.A0G = AnonymousClass001.A1W(((Iih) jjd).A00, 0S2.A00);
                        return;
                    }
                    return;
                }
            }
            Iiq iiq = (Iiq) jjd;
            if (A04()) {
                return;
            }
            try {
                if (this.A0H && this.A05 >= 1) {
                    long now = this.A0O.now();
                    if (now > this.A08) {
                        this.A08 = now + this.A05;
                    }
                    A00();
                }
                IPK ipk = iiq.A00;
                ipk.getClass();
                A03((I0F) ipk.get());
                A00();
            } catch (Exception e) {
                4zI.A01("EncodingVideoOutput", "%s: %s", new Object[]{"Exception handling camera preview buffer", e.getMessage()});
                this.A09.softReport("com.facebook.rtc.videooutput.OffscreenCpuDataOutput", "Exception handling camera preview buffer", e);
            }
        }
    }

    public void CPI() {
        super.CPI();
        try {
            if (!this.A0J && this.A0E != 0S2.A01) {
                try {
                    int i = this.A07;
                    int i2 = this.A06;
                    int i3 = i * i2 * 4;
                    ByteBuffer byteBuffer = this.A0F;
                    if (byteBuffer == null || byteBuffer.capacity() != i3) {
                        this.A0F = this.A0B != null ? ByteBuffer.allocateDirect(i3) : ByteBuffer.allocate(i3);
                    }
                    this.A0F.rewind();
                    ByteBuffer byteBuffer2 = this.A0F;
                    long j = 32;
                    0QE.A01(j, "getByteArrayFromGL", -620543215);
                    GOp.A1T(byteBuffer2, i, i2);
                    0QE.A00(j, -1850559570);
                    JMb jMb = this.A0B;
                    jMb.getClass();
                    jMb.onCapturedFrameARGB(new ARGBBuffer(byteBuffer2, i, i2, AnonymousClass001.A1N(this.A0P ? 1 : 0)), 1111970369, this.A04);
                } catch (Exception e) {
                    4zI.A01("EncodingVideoOutput", "%s: %s", new Object[]{"onSurfaceDrawn threw an exception", e.getMessage()});
                    this.A09.softReport("com.facebook.rtc.videooutput.OffscreenCpuDataOutput", "onSurfaceDrawn threw an exception", e);
                }
            }
        } finally {
            A00();
        }
    }

    public void Ctv(JLR jlr) {
        this.A0A = jlr;
        A01(this, this.A0J);
    }

    public void destroy() {
        release();
    }

    public int getHeight() {
        return this.A06;
    }

    public int getWidth() {
        return this.A07;
    }

    public void release() {
        A01(this, false);
        SurfaceTextureHelper surfaceTextureHelper = this.A0N;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.stopListening();
        }
        if (this.A0E == 0S2.A00) {
            GLES20.glDeleteTextures(1, this.A0R, 0);
            this.A0F = null;
        }
        SurfaceTexture surfaceTexture = this.A0K;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.A0K = null;
        }
        Surface surface = this.A0L;
        if (surface != null) {
            surface.release();
            this.A0L = null;
        }
        JHx jHx = this.A0M;
        if (jHx != null) {
            jHx.D3j(this);
        }
        this.A0M = null;
        super.release();
    }
}
