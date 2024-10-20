package X;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.pytorch.executorch.Tensor;

/* loaded from: MAy.class */
public final class MAy extends Tensor {
    public final LongBuffer A00;

    public MAy(LongBuffer longBuffer, long[] jArr) {
        super(jArr);
        this.A00 = longBuffer;
    }

    @Override // org.pytorch.executorch.Tensor
    public Buffer getRawDataBuffer() {
        return this.A00;
    }

    public String toString() {
        return String.format("Tensor(%s, dtype=torch.int64)", JR0.A1a(this.shape));
    }
}
