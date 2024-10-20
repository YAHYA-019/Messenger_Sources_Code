package X;

import org.webrtc.VideoFrame;

/* loaded from: Iug.class */
public final class Iug implements Runnable {
    public static final String __redex_internal_original_name = "ConversionKt$toHeraCore$2";
    public final /* synthetic */ VideoFrame.I420Buffer A00;

    public Iug(VideoFrame.I420Buffer i420Buffer) {
        this.A00 = i420Buffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.release();
    }
}
