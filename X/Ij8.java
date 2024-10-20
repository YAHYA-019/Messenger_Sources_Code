package X;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.view.Surface;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.videocodec.policy.VideoTranscodeProfileLevelParams;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: Ij8.class */
public final class Ij8 implements JNU {
    public Hjz A01;
    public JN2 A02;
    public JN2 A03;
    public 7Xo A04;
    public boolean A05;
    public final I6y A07 = (I6y) 1Bi.A03(116365);
    public final JL0 A06 = (JL0) 1Bn.A0A(116360);
    public double A00 = 0.0d;

    public IiB AMo(long j) {
        return this.A02.AMo(j);
    }

    public IiB AMq(long j) {
        return this.A03.AMq(j);
    }

    public String Agm() {
        return this.A02.Acy();
    }

    public String Ajl() {
        return this.A03.Acy();
    }

    public double AnW() {
        return this.A00;
    }

    public MediaFormat B0h() {
        return this.A03.B0h();
    }

    public int B0n() {
        7Xo r0 = this.A04;
        return (r0.A0C + r0.A07) % HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH;
    }

    public boolean BWq() {
        return this.A05;
    }

    public void CYm(MediaFormat mediaFormat) {
        IiC iiD;
        String string = mediaFormat.getString("mime");
        Surface surface = this.A01.A06;
        if (string.equals("image/bmp")) {
            iiD = new IiC();
        } else {
            if (!I6y.A00(string)) {
                String A0W = 0Pz.A0W("Unsupported codec for ", string);
                11T.A0F(A0W, 1);
                throw new Exception(A0W);
            }
            MediaCodec createDecoderByType = MediaCodec.createDecoderByType(string);
            boolean z = false;
            try {
                createDecoderByType.configure(mediaFormat, surface, (MediaCrypto) null, 0);
                if (surface != null) {
                    z = true;
                }
                iiD = new IiD(createDecoderByType, (Surface) null, 0S2.A00, z);
            } catch (IllegalStateException unused) {
                throw 1BK.A0i("codec name:", createDecoderByType.getName());
            }
        }
        this.A02 = iiD;
        iiD.start();
    }

    public void CYn(MediaFormat mediaFormat, List list) {
        String name;
        Surface surface = this.A01.A06;
        String string = mediaFormat.getString("mime");
        string.getClass();
        int codecCount = MediaCodecList.getCodecCount();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= codecCount) {
                mediaFormat.getString("mime").getClass();
                Preconditions.checkState(false);
                throw 0Q8.createAndThrow();
            }
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (!codecInfoAt.isEncoder() && Arrays.asList(codecInfoAt.getSupportedTypes()).contains(string)) {
                name = codecInfoAt.getName();
                if (!I6y.A00.contains(name) && (list.isEmpty() || !list.contains(name))) {
                    break;
                }
            }
            i = i2 + 1;
        }
        MediaCodec createByCodecName = MediaCodec.createByCodecName(name);
        mediaFormat.setInteger("max-input-size", 0);
        boolean z = false;
        try {
            createByCodecName.configure(mediaFormat, surface, (MediaCrypto) null, 0);
            if (surface != null) {
                z = true;
            }
            IiD iiD = new IiD(createByCodecName, (Surface) null, 0S2.A00, z);
            this.A02 = iiD;
            iiD.start();
        } catch (IllegalStateException unused) {
            throw 1BK.A0i("codec name:", createByCodecName.getName());
        }
    }

    public void CYp(7Xo r302) {
        int i = r302.A0D;
        int i2 = r302.A0B;
        boolean z = false;
        int i3 = 1;
        int i4 = 256;
        int i5 = -1;
        int A00 = r302.A00();
        int i6 = r302.A06;
        int i7 = r302.A05;
        VideoTranscodeProfileLevelParams videoTranscodeProfileLevelParams = r302.A01;
        if (videoTranscodeProfileLevelParams != null) {
            i3 = videoTranscodeProfileLevelParams.A01;
            i4 = videoTranscodeProfileLevelParams.A00;
            z = true;
        }
        int i8 = r302.A0E;
        if (i8 != -1) {
            i5 = i8;
        }
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i2);
        createVideoFormat.setInteger("color-format", 2130708361);
        if (A00 > 0) {
            createVideoFormat.setInteger(TraceFieldType.Bitrate, A00);
        }
        if (i7 > 0) {
            createVideoFormat.setInteger("frame-rate", i7);
        }
        if (i6 > 0) {
            createVideoFormat.setInteger("i-frame-interval", i6);
        }
        if (z) {
            createVideoFormat.setInteger("profile", i3);
            createVideoFormat.setInteger("level", i4);
        }
        if (i5 > -1) {
            createVideoFormat.setInteger("bitrate-mode", i5);
        }
        Integer num = 0S2.A01;
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
        createEncoderByType.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        IiD iiD = new IiD(createEncoderByType, createEncoderByType.createInputSurface(), num, false);
        this.A03 = iiD;
        iiD.start();
        this.A01 = new Hjz(this.A03.Aqw(), this.A06, r302);
        this.A04 = r302;
    }

    public void Cae(IiB iiB) {
        this.A02.Cae(iiB);
    }

    public void Ccs(IiB iiB) {
        this.A03.Ccs(iiB);
    }

    public void D4n(long j) {
        RuntimeException A0T;
        IiB AMq = this.A02.AMq(j);
        if (AMq == null || AMq.A02 < 0) {
            return;
        }
        MediaCodec.BufferInfo bufferInfo = AMq.A00;
        this.A02.Cct(AMq, 1BL.A1S((bufferInfo.presentationTimeUs > 0L ? 1 : (bufferInfo.presentationTimeUs == 0L ? 0 : -1))));
        if ((bufferInfo.flags & 4) != 0) {
            this.A05 = true;
            this.A03.D0c();
            return;
        }
        if (bufferInfo.presentationTimeUs >= 0) {
            if (this.A04.A0F == null) {
                Hjz hjz = this.A01;
                hjz.A00++;
                IGh iGh = hjz.A07;
                long nanoTime = System.nanoTime();
                long j2 = 5000000000L + nanoTime;
                Object obj = iGh.A04;
                synchronized (obj) {
                    while (!iGh.A01) {
                        if (nanoTime < j2) {
                            try {
                                obj.wait(0L);
                                nanoTime = System.nanoTime();
                            } catch (InterruptedException e) {
                                AnonymousClass001.A13();
                                A0T = AnonymousClass001.A0U(e);
                            }
                        } else {
                            A0T = AnonymousClass001.A0T("Surface frame wait timed out");
                        }
                        throw A0T;
                    }
                    iGh.A01 = false;
                }
                N34.A02("before updateTexImage", new Object[0]);
                iGh.A02.updateTexImage();
            }
            Hjz hjz2 = this.A01;
            long j3 = bufferInfo.presentationTimeUs;
            IGh iGh2 = hjz2.A07;
            HkC hkC = iGh2.A03;
            SurfaceTexture surfaceTexture = iGh2.A02;
            List<JMy> list = hkC.A07;
            if (list.isEmpty()) {
                N34.A02("onDrawFrame start", AnonymousClass001.A1Z());
                float[] fArr = hkC.A0A;
                surfaceTexture.getTransformMatrix(fArr);
                GLES20.glClear(16640);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(36197, hkC.A00);
                I9C A00 = hkC.A01.A00();
                A00.A05("uSTMatrix", fArr);
                A00.A05("uConstMatrix", hkC.A08);
                A00.A05("uSceneMatrix", hkC.A0B);
                A00.A05("uContentTransform", hkC.A09);
                A00.A02(hkC.A05);
                GLES20.glFinish();
            } else {
                hkC.A02.getClass();
                float[] fArr2 = hkC.A0A;
                surfaceTexture.getTransformMatrix(fArr2);
                I5I i5i = hkC.A03;
                if (i5i.A03()) {
                    j3 = TimeUnit.NANOSECONDS.toMicros(surfaceTexture.getTimestamp());
                }
                for (JMy jMy : list) {
                    i5i.A01(hkC.A02, fArr2, hkC.A08, hkC.A0B, surfaceTexture.getTimestamp());
                    jMy.BvA(i5i, j3);
                }
            }
            Hjz hjz3 = this.A01;
            EGLExt.eglPresentationTimeANDROID(hjz3.A03, hjz3.A04, TimeUnit.MICROSECONDS.toNanos(bufferInfo.presentationTimeUs));
            Hjz hjz4 = this.A01;
            EGL14.eglSwapBuffers(hjz4.A03, hjz4.A04);
        }
    }

    public void finish() {
        release();
    }

    public void release() {
        JN2 jn2 = this.A02;
        if (jn2 != null) {
            jn2.stop();
            this.A02 = null;
        }
        JN2 jn22 = this.A03;
        if (jn22 != null) {
            jn22.stop();
            this.A03 = null;
        }
        Hjz hjz = this.A01;
        if (hjz != null) {
            this.A00 = ((r0 - hjz.A07.A00) / hjz.A00) * 100.0d;
            if (EGL14.eglGetCurrentContext().equals(hjz.A02)) {
                GOo.A1A(hjz.A03);
            }
            EGL14.eglDestroySurface(hjz.A03, hjz.A04);
            EGL14.eglDestroyContext(hjz.A03, hjz.A02);
            hjz.A06.release();
            hjz.A03 = null;
            hjz.A02 = null;
            hjz.A04 = null;
            hjz.A08 = null;
            hjz.A06 = null;
            hjz.A01 = null;
            hjz.A07 = null;
            this.A01 = null;
        }
    }
}
