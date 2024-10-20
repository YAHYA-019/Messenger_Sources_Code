package X;

import android.media.MediaExtractor;
import android.os.Process;
import java.nio.ByteBuffer;

/* loaded from: J43.class */
public final class J43 implements Runnable {
    public static final String __redex_internal_original_name = "VideoResizeOperation$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ MediaExtractor A04;
    public final /* synthetic */ I0W A05;
    public final /* synthetic */ Hqm A06;
    public final /* synthetic */ JNU A07;

    public J43(MediaExtractor mediaExtractor, I0W i0w, Hqm hqm, JNU jnu, int i, int i2, long j, long j2) {
        this.A05 = i0w;
        this.A01 = i;
        this.A07 = jnu;
        this.A00 = i2;
        this.A04 = mediaExtractor;
        this.A06 = hqm;
        this.A03 = j;
        this.A02 = j2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Process.setThreadPriority(this.A01);
        while (!Thread.currentThread().isInterrupted()) {
            JNU jnu = this.A07;
            IiB AMo = jnu.AMo(this.A00);
            if (AMo != null) {
                I0W i0w = this.A05;
                MediaExtractor mediaExtractor = this.A04;
                Hqm hqm = this.A06;
                long j = this.A03;
                long j2 = this.A02;
                1G2 r0 = I0W.A0I;
                ByteBuffer byteBuffer = AMo.getByteBuffer();
                if (byteBuffer == null) {
                    throw AnonymousClass001.A0N("byteBuffer cannot be null");
                }
                int readSampleData = mediaExtractor.readSampleData(byteBuffer, 0);
                long sampleTime = mediaExtractor.getSampleTime();
                if (readSampleData <= 0 || sampleTime > j2) {
                    AMo.A00(0, 0L, 4);
                    jnu.Cae(AMo);
                    return;
                }
                AMo.A00(readSampleData, sampleTime - j, mediaExtractor.getSampleFlags());
                jnu.Cae(AMo);
                mediaExtractor.advance();
                if (i0w.A0H) {
                    0fH.A09(I0W.class, Long.valueOf(sampleTime), "First video sample: %d");
                    hqm.A04 = sampleTime;
                    i0w.A0H = false;
                }
                hqm.A07 = sampleTime;
            }
        }
    }
}
