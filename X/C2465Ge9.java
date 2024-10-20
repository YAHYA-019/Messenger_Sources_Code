package X;

import android.os.Looper;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback;

/* renamed from: X.Ge9, reason: case insensitive filesystem */
/* loaded from: Ge9.class */
public final class C2465Ge9 extends AudioRenderCallback {
    public final Inp A00;
    public final /* synthetic */ INA A01;

    public C2465Ge9(Inp inp, INA ina) {
        this.A01 = ina;
        this.A00 = inp;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback
    public void onSamplesReady(byte[] bArr, int i, int i2, int i3, int i4) {
        INA ina = this.A01;
        if (ina.A0D == null || Looper.myLooper() == ina.A0D.getLooper()) {
            I8p i8p = ina.A0E;
            if (i8p != null) {
                i8p.A09 = true;
            }
            INA.A01(ina);
            Inp inp = this.A00;
            HtU htU = ina.A0H;
            if (htU != null) {
                htU.A01(inp, i4, ina.A00);
            }
            if (i4 <= 0 || i <= 0 || i2 <= 0 || i3 <= 0) {
                return;
            }
            ina.A00 += AbstractC2327GOs.A09(i2, i4, i3) / i;
        }
    }
}
