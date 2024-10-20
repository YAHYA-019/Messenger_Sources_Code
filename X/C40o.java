package X;

import com.google.common.base.Preconditions;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: X.40o, reason: invalid class name */
/* loaded from: 40o.class */
public final class C40o extends OutputStream {
    public final ArrayList A00;
    public final boolean A01;

    public C40o() {
        ArrayList arrayList = new ArrayList();
        this.A00 = arrayList;
        this.A01 = false;
        arrayList.add(ByteBuffer.allocateDirect(1024));
    }

    public C40o(int i) {
        ArrayList arrayList = new ArrayList();
        this.A00 = arrayList;
        this.A01 = true;
        arrayList.add(ByteBuffer.allocateDirect(i));
    }

    private ByteBuffer A00() {
        boolean z = true;
        Preconditions.checkState(!this.A01);
        ArrayList arrayList = this.A00;
        if (((Buffer) arrayList.get(arrayList.size() - 1)).remaining() != 0) {
            z = false;
        }
        Preconditions.checkState(z);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1024);
        arrayList.add(allocateDirect);
        return allocateDirect;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        ByteBuffer byteBuffer = (ByteBuffer) this.A00.get(r0.size() - 1);
        if (byteBuffer.remaining() == 0) {
            byteBuffer = A00();
        }
        byteBuffer.put((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            ByteBuffer byteBuffer = (ByteBuffer) this.A00.get(r0.size() - 1);
            if (byteBuffer.remaining() == 0) {
                byteBuffer = A00();
            }
            int min = Math.min(byteBuffer.remaining(), i2);
            byteBuffer.put(bArr, i, min);
            i += min;
            i2 -= min;
        }
    }
}
