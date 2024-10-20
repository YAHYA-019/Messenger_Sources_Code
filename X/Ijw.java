package X;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import java.util.List;

/* loaded from: Ijw.class */
public final class Ijw implements JN9 {
    public final /* synthetic */ Ik4 A00;

    public Ijw(Ik4 ik4) {
        this.A00 = ik4;
    }

    @Override // X.JN9
    public long AM0(long j) {
        Ik4 ik4 = this.A00;
        IjV ijV = ik4.A04;
        long j2 = -1;
        if (ijV != null && ijV.A02 >= 0) {
            MediaCodec.BufferInfo bufferInfo = ijV.A00;
            long j3 = bufferInfo.presentationTimeUs;
            Hud hud = ik4.A05;
            hud.getClass();
            hud.A04(ik4.A04, 1BL.A1S((bufferInfo.presentationTimeUs > 0L ? 1 : (bufferInfo.presentationTimeUs == 0L ? 0 : -1))));
            if ((bufferInfo.flags & 4) != 0) {
                ik4.A09 = true;
            } else {
                if (bufferInfo.presentationTimeUs >= 0) {
                    MediaCodec.BufferInfo bufferInfo2 = ik4.A04.A00;
                    I0T i0t = ik4.A07;
                    i0t.getClass();
                    i0t.A01++;
                    IGk iGk = i0t.A0A;
                    iGk.getClass();
                    iGk.A00();
                    long j4 = bufferInfo2.presentationTimeUs;
                    ik4.A02.getClass();
                    Hce hce = ik4.A02;
                    if (j4 >= hce.A00 && !hce.A01) {
                        Ik4.A00(ik4);
                    }
                }
                j2 = j3;
            }
            ik4.A04 = null;
        }
        Hud hud2 = ik4.A05;
        hud2.getClass();
        IjV A01 = hud2.A01(j);
        if (A01 != null && A01.A02 >= 0) {
            ik4.A04 = A01;
            ik4.A00 = A01.A00.presentationTimeUs;
        }
        return j2;
    }

    @Override // X.JN9
    public IjV AMp(long j) {
        Hud hud = this.A00.A05;
        hud.getClass();
        return hud.A00(j);
    }

    @Override // X.JN9
    public long Agj() {
        return this.A00.A00;
    }

    @Override // X.JN9
    public String Agk() {
        Hud hud = this.A00.A05;
        hud.getClass();
        return hud.A01;
    }

    @Override // X.JN9
    public String Agm() {
        Hud hud = this.A00.A05;
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
        return this.A00.A09;
    }

    @Override // X.JN9
    public void CYo(MediaFormat mediaFormat, I9e i9e, List list, int i, boolean z) {
        Hud A05;
        Ik4 ik4 = this.A00;
        ik4.A07.getClass();
        if (list.isEmpty()) {
            String string = mediaFormat.getString("mime");
            if (string == null) {
                string = "";
            }
            A05 = IEP.A01(mediaFormat, ik4.A07.A04, i9e, string);
        } else {
            A05 = ik4.A0A.A05(mediaFormat, ik4.A07.A04, i9e, list, false);
        }
        ik4.A05 = A05;
        A05.A02();
    }

    @Override // X.JN9
    public void Caf(IjV ijV) {
        Hud hud = this.A00.A05;
        hud.getClass();
        hud.A03(ijV);
    }

    @Override // X.JN9
    public boolean Cys() {
        return this.A00.A08;
    }

    @Override // X.JN9
    public void D6c(int i, Bitmap bitmap) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.I3R] */
    @Override // X.JN9
    public void finish() {
        ?? obj = new Object();
        new H3f((I3R) obj, this.A00.A05).A00();
        obj.A02();
    }

    @Override // X.JN9
    public void flush() {
    }
}
