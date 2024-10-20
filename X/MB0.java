package X;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.pytorch.executorch.Tensor;

/* loaded from: MB0.class */
public final class MB0 extends Tensor {
    public final ByteBuffer A00;

    public MB0(ByteBuffer byteBuffer, long[] jArr) {
        super(jArr);
        this.A00 = byteBuffer;
    }

    @Override // org.pytorch.executorch.Tensor
    public Buffer getRawDataBuffer() {
        return this.A00;
    }

    public String toString() {
        return String.format("Tensor(%s, dtype=torch.uint8)", JR0.A1a(this.shape));
    }
}
