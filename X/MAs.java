package X;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.pytorch.Tensor;

/* loaded from: MAs.class */
public final class MAs extends Tensor {
    public final ByteBuffer A00;

    public MAs(ByteBuffer byteBuffer, KNe kNe, long[] jArr) {
        super(jArr, kNe);
        this.A00 = byteBuffer;
    }

    @Override // org.pytorch.Tensor
    public KMA dtype() {
        return KMA.A04;
    }

    @Override // org.pytorch.Tensor
    public Buffer getRawDataBuffer() {
        return this.A00;
    }

    public String toString() {
        return String.format("Tensor(%s, dtype=torch.int8)", JR0.A1a(this.shape));
    }
}
