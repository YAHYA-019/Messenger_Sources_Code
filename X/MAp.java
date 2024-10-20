package X;

import java.nio.Buffer;
import java.nio.DoubleBuffer;
import org.pytorch.Tensor;

/* loaded from: MAp.class */
public final class MAp extends Tensor {
    public final DoubleBuffer A00;

    public MAp(DoubleBuffer doubleBuffer, KNe kNe, long[] jArr) {
        super(jArr, kNe);
        this.A00 = doubleBuffer;
    }

    @Override // org.pytorch.Tensor
    public KMA dtype() {
        return KMA.A01;
    }

    @Override // org.pytorch.Tensor
    public Buffer getRawDataBuffer() {
        return this.A00;
    }

    public String toString() {
        return String.format("Tensor(%s, dtype=torch.float64)", JR0.A1a(this.shape));
    }
}
