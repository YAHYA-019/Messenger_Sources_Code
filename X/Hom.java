package X;

import android.graphics.Bitmap;
import com.facebook.libyuv.YUVColorConverter;
import java.nio.ByteBuffer;

/* loaded from: Hom.class */
public final class Hom {
    public 1BY A00;
    public final C00i A01 = 1BV.A01((1BY) null, 50068);
    public final C00i A02 = 1BV.A01((1BY) null, 148037);
    public final C00i A03 = 1BQ.A02(116357);

    public Hom(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public void A00(Bitmap bitmap, byte[] bArr, int i, int i2) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.rewind();
        ByteBuffer slice = allocateDirect.slice();
        int i3 = i * i2;
        ByteBuffer byteBuffer = (ByteBuffer) GOq.A17(i3 * 4).rewind();
        allocateDirect.position(0);
        slice.position(i3);
        this.A03.get();
        int i4 = i * 4;
        11T.A0F(byteBuffer, 4);
        if (!allocateDirect.isDirect()) {
            throw AnonymousClass001.A0N("Check failed.");
        }
        if (!slice.isDirect()) {
            throw AnonymousClass001.A0N("Check failed.");
        }
        if (!byteBuffer.isDirect()) {
            throw AnonymousClass001.A0N("Check failed.");
        }
        YUVColorConverter.nativeConvertNV12ToARGB(allocateDirect, i, slice, i, byteBuffer, i4, i, i2);
        byteBuffer.rewind();
        bitmap.copyPixelsFromBuffer(byteBuffer);
    }
}
