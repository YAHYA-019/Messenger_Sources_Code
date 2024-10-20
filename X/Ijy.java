package X;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import java.util.List;

/* loaded from: Ijy.class */
public final class Ijy implements JN9 {
    public MediaFormat A00;
    public I9e A01;
    public long A02 = -1;
    public IjV A03;
    public Hud A04;
    public HjE A05;
    public boolean A06;
    public final /* synthetic */ Ik2 A07;

    public Ijy(Ik2 ik2) {
        this.A07 = ik2;
    }

    @Override // X.JN9
    public long AM0(long j) {
        MediaFormat mediaFormat;
        I9e i9e;
        IjV ijV = this.A03;
        long j2 = -1;
        if (ijV != null && ijV.A02 >= 0) {
            MediaCodec.BufferInfo bufferInfo = ijV.A00;
            long j3 = bufferInfo.presentationTimeUs;
            if (Build.VERSION.SDK_INT >= 29 && (mediaFormat = this.A00) != null && mediaFormat.containsKey("color-transfer") && this.A00.getInteger("color-transfer") == 6 && (i9e = this.A01) != null && i9e.A1E()) {
                int i = this.A03.A02;
                Hud hud = this.A04;
                hud.getClass();
                HWs hWs = new HWs(hud.A05.getOutputFormat(i));
                HjE hjE = this.A05;
                hjE.getClass();
                JNc jNc = hjE.A06.A00;
                jNc.getClass();
                jNc.D6z(hWs, hjE.A00);
            }
            try {
                Hud hud2 = this.A04;
                hud2.getClass();
                hud2.A04(this.A03, 1BL.A1S((bufferInfo.presentationTimeUs > 0L ? 1 : (bufferInfo.presentationTimeUs == 0L ? 0 : -1))));
                if ((bufferInfo.flags & 4) != 0) {
                    this.A06 = true;
                } else {
                    if (bufferInfo.presentationTimeUs >= 0) {
                        HjE hjE2 = this.A05;
                        hjE2.getClass();
                        hjE2.A01++;
                        IGk iGk = hjE2.A05;
                        iGk.getClass();
                        iGk.A00();
                    }
                    j2 = j3;
                }
                this.A03 = null;
            } catch (IllegalStateException e) {
                Hud hud3 = this.A04;
                hud3.getClass();
                throw new IllegalStateException(0Pz.A0s("codec info: ", hud3.A01, " , mDecoder Presentation Time: ", j3), e);
            }
        }
        try {
            Hud hud4 = this.A04;
            hud4.getClass();
            IjV A01 = hud4.A01(j);
            if (A01 != null && A01.A02 >= 0) {
                this.A03 = A01;
                this.A02 = A01.A00.presentationTimeUs;
            }
            return j2;
        } catch (Throwable th) {
            throw new IllegalStateException(AnonymousClass001.A0h(AnonymousClass001.A0n("Previous pts: "), j2), th);
        }
    }

    @Override // X.JN9
    public IjV AMp(long j) {
        Hud hud = this.A04;
        hud.getClass();
        return hud.A00(j);
    }

    @Override // X.JN9
    public long Agj() {
        return this.A02;
    }

    @Override // X.JN9
    public String Agk() {
        Hud hud = this.A04;
        hud.getClass();
        return hud.A01;
    }

    @Override // X.JN9
    public String Agm() {
        Hud hud = this.A04;
        hud.getClass();
        String str = null;
        try {
            str = hud.A05.getName();
        } catch (IllegalStateException unused) {
        }
        return str;
    }

    @Override // X.JN9
    public boolean BWq() {
        return this.A06;
    }

    @Override // X.JN9
    public void CYo(MediaFormat mediaFormat, I9e i9e, List list, int i, boolean z) {
        Hud A05;
        this.A00 = mediaFormat;
        this.A01 = i9e;
        Ik2 ik2 = this.A07;
        this.A05 = new HjE(ik2.A00, i9e, i);
        if (!list.isEmpty() || z) {
            A05 = ik2.A02.A05(mediaFormat, this.A05.A04, i9e, list, z);
        } else {
            String string = mediaFormat.getString("mime");
            string.getClass();
            A05 = IEP.A01(mediaFormat, this.A05.A04, i9e, string);
        }
        this.A04 = A05;
        if (!i9e.A0q()) {
            this.A04.A02();
            return;
        }
        try {
            this.A04.A02();
        } catch (Exception e) {
            String str = null;
            try {
                str = this.A04.A05.getName();
            } catch (IllegalStateException unused) {
            }
            throw new IllegalStateException(0Pz.A0W("codec name:", str), e);
        }
    }

    @Override // X.JN9
    public void Caf(IjV ijV) {
        Hud hud = this.A04;
        hud.getClass();
        hud.A03(ijV);
    }

    @Override // X.JN9
    public boolean Cys() {
        return false;
    }

    @Override // X.JN9
    public void D6c(int i, Bitmap bitmap) {
        JNc jNc = this.A07.A00.A00;
        jNc.getClass();
        jNc.D6c(i, bitmap);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.I3R] */
    @Override // X.JN9
    public void finish() {
        long j;
        I6I.A02("VideoTranscoderJBMR2", "finish", new Object[0]);
        ?? obj = new Object();
        new H3f((I3R) obj, this.A04).A00();
        HjE hjE = this.A05;
        if (hjE != null) {
            long j2 = hjE.A01;
            IGk iGk = hjE.A05;
            iGk.getClass();
            synchronized (iGk) {
                j = iGk.A01;
            }
            I6I.A02("VideoTranscoderJBMR2", "finish: mFrameDropPercent=%s", Double.valueOf(((j2 - j) / hjE.A01) * 100.0d));
            HjE hjE2 = this.A05;
            Hcf hcf = hjE2.A06;
            I6I.A02("TranscodeOutputSurfaceForJBMR2", "release", new Object[0]);
            Surface surface = hjE2.A04;
            if (surface != null) {
                surface.release();
            }
            if (hjE2.A02 != null) {
                JNc jNc = hcf.A00;
                if (jNc != null) {
                    jNc.C1v(hjE2.A00);
                }
                hjE2.A02.setOnFrameAvailableListener(null);
                hjE2.A02.release();
            }
            hjE2.A04 = null;
            hjE2.A02 = null;
            hjE2.A05 = null;
            if (hjE2.A03 != null) {
                I6I.A02("TranscodeOutputSurfaceForJBMR2", "release: mHandlerThread.quitSafely", new Object[0]);
                hjE2.A03.quitSafely();
                hjE2.A03 = null;
            }
        }
        obj.A02();
    }

    @Override // X.JN9
    public void flush() {
        I6I.A02("VideoTranscoderJBMR2", "flush", new Object[0]);
        Hud hud = this.A04;
        hud.getClass();
        StringBuilder sb = hud.A08;
        sb.append("flushB,");
        hud.A05.flush();
        sb.append("flushE,");
        this.A02 = -1;
        this.A06 = false;
        this.A03 = null;
    }
}
