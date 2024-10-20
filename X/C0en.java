package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0en, reason: invalid class name */
/* loaded from: 0en.class */
public final class C0en extends MediaCodec.Callback {
    public final /* synthetic */ C0eo A00;
    public final /* synthetic */ CountDownLatch A01;
    public final /* synthetic */ AtomicReference A02;

    public C0en(C0eo c0eo, CountDownLatch countDownLatch, AtomicReference atomicReference) {
        this.A02 = atomicReference;
        this.A01 = countDownLatch;
        this.A00 = c0eo;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        11T.A0F(codecException, 1);
        this.A02.set(codecException);
        this.A01.countDown();
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        RuntimeException A0T;
        11T.A0G(mediaCodec, 0, bufferInfo);
        CountDownLatch countDownLatch = this.A01;
        C0eo c0eo = this.A00;
        AtomicReference atomicReference = this.A02;
        if (atomicReference.get() == null) {
            try {
                if ((bufferInfo.flags & 4) != 0) {
                    countDownLatch.countDown();
                    return;
                }
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i);
                if (outputBuffer != null) {
                    if ((bufferInfo.flags & 2) != 0) {
                        0fH.A0A(C0eo.class, "ignoring BUFFER_FLAG_CODEC_CONFIG");
                        bufferInfo.size = 0;
                    }
                    if (bufferInfo.size != 0) {
                        if (c0eo.A09) {
                            outputBuffer.position(bufferInfo.offset);
                            outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                            MediaMuxer mediaMuxer = c0eo.A06;
                            if (mediaMuxer != null) {
                                mediaMuxer.writeSampleData(c0eo.A02, outputBuffer, bufferInfo);
                            }
                            0fH.A0V(Integer.valueOf(bufferInfo.size), C0eo.class, "sent ", " bytes to muxer");
                        } else {
                            A0T = AnonymousClass001.A0T("muxer hasn't started");
                        }
                    }
                    MediaCodec mediaCodec2 = c0eo.A05;
                    if (mediaCodec2 != null) {
                        mediaCodec2.releaseOutputBuffer(i, false);
                        return;
                    }
                    return;
                }
                A0T = AnonymousClass001.A0T(0Pz.A0d("encoderOutputBuffer ", " was null", i));
                throw A0T;
            } catch (Exception e) {
                atomicReference.set(e);
                countDownLatch.countDown();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        RuntimeException A0T;
        11T.A0F(mediaFormat, 1);
        C0eo c0eo = this.A00;
        AtomicReference atomicReference = this.A02;
        CountDownLatch countDownLatch = this.A01;
        if (atomicReference.get() == null) {
            try {
                if (c0eo.A09) {
                    A0T = AnonymousClass001.A0T("format changed twice");
                } else {
                    0fH.A07(C0eo.class, mediaFormat.toString(), "encoder output format changed: %s");
                    MediaMuxer mediaMuxer = c0eo.A06;
                    if (mediaMuxer != null) {
                        c0eo.A02 = mediaMuxer.addTrack(mediaFormat);
                        MediaMuxer mediaMuxer2 = c0eo.A06;
                        if (mediaMuxer2 != null) {
                            mediaMuxer2.start();
                        }
                        c0eo.A09 = true;
                        return;
                    }
                    A0T = AnonymousClass001.A0T("StaticImageVideoHelper::startMuxer::trackIndex is null");
                }
                throw A0T;
            } catch (Exception e) {
                atomicReference.set(e);
                countDownLatch.countDown();
            }
        }
    }
}
