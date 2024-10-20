package X;

import android.media.MediaCodec;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Inp.class */
public final class Inp implements Closeable {
    public final ByteBuffer A02;
    public final int A03;
    public final MediaCodec A04;
    public final AtomicBoolean A05 = DKC.A1E(false);
    public int A00 = 0;
    public long A01 = 0;

    public Inp(MediaCodec mediaCodec, ByteBuffer byteBuffer, int i) {
        this.A04 = mediaCodec;
        this.A03 = i;
        this.A02 = byteBuffer;
    }

    public void A00() {
        int i;
        if (!this.A05.compareAndSet(false, true) || (i = this.A03) < 0) {
            return;
        }
        this.A04.queueInputBuffer(i, 0, this.A00, this.A01, 0);
        0fH.A0a(Integer.valueOf(i), Integer.valueOf(this.A00), Long.valueOf(this.A01), "InputBufferImpl", "queued input buffer %d with %d bytes at presentation time %d ms");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        A00();
    }
}
