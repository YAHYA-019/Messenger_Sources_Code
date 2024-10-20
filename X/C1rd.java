package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.1rd, reason: invalid class name */
/* loaded from: 1rd.class */
public final class C1rd {
    public static Boolean A02;
    public final 1Br A01 = 1Bq.A00(16385);
    public final 1Br A00 = 1Bq.A00(99801);

    /* JADX WARN: Type inference failed for: r0v36, types: [X.3a1, X.5j5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r304v1, types: [X.3a2, java.lang.Object] */
    public C5j5 A00(ThreadKey threadKey) {
        11T.A0F(threadKey, 0);
        C5j5 c5j5 = C5j5.A01;
        if (!A01()) {
            c5j5 = C5j5.A00;
        } else if (threadKey.A0z() || threadKey.A10()) {
            ?? obj = new Object();
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putLong(3735928559L);
            obj.A00 = allocate.array();
            c5j5 = obj;
        }
        11T.A0D(c5j5);
        if (!((1OC) this.A00.A00.get()).A07) {
            return c5j5;
        }
        ?? obj2 = new Object();
        obj2.A00 = c5j5;
        return obj2;
    }

    public boolean A01() {
        boolean AZk;
        Boolean bool = A02;
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (this) {
            Boolean bool2 = A02;
            if (bool2 != null) {
                AZk = bool2.booleanValue();
            } else {
                AZk = ((1CO) this.A01.A00.get()).AZk(36315657884673334L);
                Boolean valueOf = Boolean.valueOf(AZk);
                A02 = valueOf;
                11T.A0D(valueOf);
            }
        }
        return AZk;
    }
}
