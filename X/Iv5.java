package X;

import java.nio.ByteBuffer;
import org.webrtc.JniCommon;

/* loaded from: Iv5.class */
public final /* synthetic */ class Iv5 implements Runnable {
    public static final String __redex_internal_original_name = "YuvConverter$$ExternalSyntheticLambda0";
    public final /* synthetic */ ByteBuffer A00;

    @Override // java.lang.Runnable
    public final void run() {
        JniCommon.nativeFreeByteBuffer(this.A00);
    }
}
