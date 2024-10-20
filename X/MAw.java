package X;

import java.nio.Buffer;
import java.nio.DoubleBuffer;
import org.pytorch.executorch.Tensor;

/* loaded from: MAw.class */
public final class MAw extends Tensor {
    public final DoubleBuffer A00;

    public MAw(DoubleBuffer doubleBuffer, long[] jArr) {
        super(jArr);
        this.A00 = doubleBuffer;
    }

    @Override // org.pytorch.executorch.Tensor
    public Buffer getRawDataBuffer() {
        return this.A00;
    }

    public String toString() {
        return String.format("Tensor(%s, dtype=torch.float64)", JR0.A1a(this.shape));
    }
}
