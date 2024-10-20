package X;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.pytorch.executorch.Tensor;

/* loaded from: MAv.class */
public final class MAv extends Tensor {
    public final FloatBuffer A00;

    public MAv(FloatBuffer floatBuffer, long[] jArr) {
        super(jArr);
        this.A00 = floatBuffer;
    }

    @Override // org.pytorch.executorch.Tensor
    public Buffer getRawDataBuffer() {
        return this.A00;
    }

    public String toString() {
        return String.format("Tensor(%s, dtype=torch.float32)", JR0.A1a(this.shape));
    }
}
