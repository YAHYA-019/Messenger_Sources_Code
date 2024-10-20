package X;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.pytorch.Tensor;

/* loaded from: MAt.class */
public final class MAt extends Tensor {
    public final ByteBuffer A00;

    public MAt(ByteBuffer byteBuffer, KNe kNe, long[] jArr) {
        super(jArr, kNe);
        this.A00 = byteBuffer;
    }

    @Override // org.pytorch.Tensor
    public KMA dtype() {
        return KMA.A05;
    }

    @Override // org.pytorch.Tensor
    public Buffer getRawDataBuffer() {
        return this.A00;
    }

    public String toString() {
        return String.format("Tensor(%s, dtype=torch.uint8)", JR0.A1a(this.shape));
    }
}
