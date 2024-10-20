package X;

import com.google.repack.protobuf.MessageLite;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: Kyu.class */
public abstract class Kyu {
    public static final Kuv A00;
    public static final ByteBuffer A01;
    public static final byte[] A05;
    public static final Charset A03 = Charset.forName("US-ASCII");
    public static final Charset A04 = Charset.forName("UTF-8");
    public static final Charset A02 = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        A05 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        A00 = Kuv.A0C(bArr, 0, 0);
    }

    public static KJb A00(Object obj, Object obj2) {
        KGw builder = ((MessageLite) obj).toBuilder();
        KJb kJb = (MessageLite) obj2;
        if (!builder.Agy().getClass().isInstance(kJb)) {
            throw AnonymousClass001.A0L("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        KJb kJb2 = (Lgd) kJb;
        KGw kGw = builder;
        KJb kJb3 = kJb2;
        KJb A002 = KGw.A00(kGw);
        JR1.A0g(A002).Be4(A002, kJb3);
        KGw.A01(kGw);
        return kGw.A00;
    }
}
