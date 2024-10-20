package X;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.pytorch.executorch.Tensor;

/* loaded from: MAz.class */
public final class MAz extends Tensor {
    public final ByteBuffer A00;

    public MAz(ByteBuffer byteBuffer, long[] jArr) {
        super(jArr);
        this.A00 = byteBuffer;
    }

    @Override // org.pytorch.executorch.Tensor
    public Buffer getRawDataBuffer() {
        return this.A00;
    }

    public String toString() {
        return String.format("Tensor(%s, dtype=torch.int8)", JR0.A1a(this.shape));
    }
}
