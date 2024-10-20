package X;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.pytorch.executorch.Tensor;

/* loaded from: MAx.class */
public final class MAx extends Tensor {
    public final IntBuffer A00;

    public MAx(IntBuffer intBuffer, long[] jArr) {
        super(jArr);
        this.A00 = intBuffer;
    }

    @Override // org.pytorch.executorch.Tensor
    public Buffer getRawDataBuffer() {
        return this.A00;
    }

    public String toString() {
        return String.format("Tensor(%s, dtype=torch.int32)", JR0.A1a(this.shape));
    }
}
