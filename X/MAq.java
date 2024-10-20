package X;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.pytorch.Tensor;

/* loaded from: MAq.class */
public final class MAq extends Tensor {
    public final IntBuffer A00;

    public MAq(IntBuffer intBuffer, KNe kNe, long[] jArr) {
        super(jArr, kNe);
        this.A00 = intBuffer;
    }

    @Override // org.pytorch.Tensor
    public KMA dtype() {
        return KMA.A02;
    }

    @Override // org.pytorch.Tensor
    public Buffer getRawDataBuffer() {
        return this.A00;
    }

    public String toString() {
        return String.format("Tensor(%s, dtype=torch.int32)", JR0.A1a(this.shape));
    }
}
