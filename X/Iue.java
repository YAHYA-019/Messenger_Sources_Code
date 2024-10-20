package X;

import com.facebook.wearable.common.comms.rtc.hera.video.core.JniCommon;
import java.nio.ByteBuffer;

/* loaded from: Iue.class */
public final /* synthetic */ class Iue implements Runnable {
    public static final String __redex_internal_original_name = "YuvConverter$$ExternalSyntheticLambda0";
    public final /* synthetic */ ByteBuffer A00;

    @Override // java.lang.Runnable
    public final void run() {
        JniCommon.nativeFreeByteBuffer(this.A00);
    }
}
