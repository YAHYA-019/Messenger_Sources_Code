package X;

import android.os.Looper;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.Ge8, reason: case insensitive filesystem */
/* loaded from: Ge8.class */
public final class C2464Ge8 extends AudioRenderCallback {
    public final /* synthetic */ INA A00;

    public C2464Ge8(INA ina) {
        this.A00 = ina;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback
    public void onSamplesReady(byte[] bArr, int i, int i2, int i3, int i4) {
        INA ina = this.A00;
        if (ina.A0D == null || Looper.myLooper() == ina.A0D.getLooper()) {
            I8p i8p = ina.A0E;
            if (i8p != null) {
                i8p.A09 = true;
            }
            Hrq hrq = ina.A0F;
            if (hrq != null) {
                hrq.A01(bArr, i4);
            }
            INA.A01(ina);
            byte[] bArr2 = ina.A09;
            if (i4 <= 4096) {
                INA.A02(ina, bArr, i, i2, i3, i4);
                return;
            }
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder()).limit(i4);
            while (byteBuffer.position() < i4) {
                int min = Math.min(i4 - byteBuffer.position(), RequestDefragmentingOutputStream.BODY_BUFFER_SIZE);
                byteBuffer.get(bArr2, 0, min);
                INA.A02(ina, bArr2, i, i2, i3, min);
            }
        }
    }
}
