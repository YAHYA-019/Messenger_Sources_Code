package X;

import android.media.CamcorderProfile;
import java.io.File;
import java.io.FileDescriptor;
import java.util.concurrent.CountDownLatch;

/* loaded from: Ied.class */
public final class Ied implements JKN {
    public JQ8 A00;
    public JLF A01;
    public Hnp A02;
    public I50 A03;
    public File A04;
    public CountDownLatch A05;
    public final JLr A06 = new IdE(this);
    public volatile Gu0 A07;
    public final /* synthetic */ Gti A08;

    public Ied(Gti gti) {
        this.A08 = gti;
    }

    @Override // X.JKN
    public /* synthetic */ I50 D2O(CamcorderProfile camcorderProfile, Hbr hbr, FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2, int i, int i2, boolean z, boolean z2, boolean z3) {
        throw AnonymousClass001.A0q("Recording to a FileDescriptor not supported");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x006c, code lost:
    
        if (r307 == 270) goto L6;
     */
    @Override // X.JKN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.I50 D2P(android.media.CamcorderProfile r302, X.Hbr r303, java.lang.String r304, java.lang.String r305, int r306, int r307, boolean r308, boolean r309, boolean r310) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ied.D2P(android.media.CamcorderProfile, X.Hbr, java.lang.String, java.lang.String, int, int, boolean, boolean, boolean):X.I50");
    }

    @Override // X.JKN
    public void D2y() {
        Integer B6P;
        JLF jlf = this.A01;
        if (jlf == null || (B6P = jlf.B6P()) == 0S2.A0j || B6P == 0S2.A0u) {
            return;
        }
        if (this.A05 != null) {
            0fH.A0k("SurfaceRecorder", "Unfinished previous recording state");
            throw AnonymousClass001.A0N("LiteVideoRecorder: Unfinished previous recording state");
        }
        this.A07 = null;
        this.A05 = AnonymousClass001.A11();
        this.A01.D2q(false);
        try {
            try {
                this.A05.await();
                if (this.A07 != null) {
                    throw this.A07;
                }
            } catch (InterruptedException e) {
                0fH.A0r("SurfaceRecorder", "Thread interrupted while recording", e);
            }
        } finally {
            this.A05 = null;
        }
    }
}
