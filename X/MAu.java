package X;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.pytorch.Tensor;

/* loaded from: MAu.class */
public final class MAu extends Tensor {
    public final FloatBuffer A00;

    public MAu(FloatBuffer floatBuffer, KNe kNe, long[] jArr) {
        super(jArr, kNe);
        this.A00 = floatBuffer;
    }

    @Override // org.pytorch.Tensor
    public KMA dtype() {
        return KMA.A00;
    }

    @Override // org.pytorch.Tensor
    public float[] getDataAsFloatArray() {
        FloatBuffer floatBuffer = this.A00;
        floatBuffer.rewind();
        float[] fArr = new float[floatBuffer.remaining()];
        floatBuffer.get(fArr);
        return fArr;
    }

    @Override // org.pytorch.Tensor
    public Buffer getRawDataBuffer() {
        return this.A00;
    }

    public String toString() {
        return String.format("Tensor(%s, dtype=torch.float32)", JR0.A1a(this.shape));
    }
}
