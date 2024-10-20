package X;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.pytorch.Tensor;

/* loaded from: MAr.class */
public final class MAr extends Tensor {
    public final LongBuffer A00;

    public MAr(LongBuffer longBuffer, KNe kNe, long[] jArr) {
        super(jArr, kNe);
        this.A00 = longBuffer;
    }

    @Override // org.pytorch.Tensor
    public KMA dtype() {
        return KMA.A03;
    }

    @Override // org.pytorch.Tensor
    public Buffer getRawDataBuffer() {
        return this.A00;
    }

    public String toString() {
        return String.format("Tensor(%s, dtype=torch.int64)", JR0.A1a(this.shape));
    }
}
