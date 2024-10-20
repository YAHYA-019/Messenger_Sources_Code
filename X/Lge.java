package X;

import android.os.Build;
import com.meta.hera.engine.device.Device;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: Lge.class */
public abstract class Lge implements MJ3, Cloneable {
    public static KFu A02() {
        KFu newBuilder = Device.newBuilder();
        String valueOf = String.valueOf(Hxu.A01.A00.nodeId);
        newBuilder.A06();
        ((Device) ((KGw) newBuilder).A00).id_ = valueOf;
        String str = Build.MODEL;
        newBuilder.A06();
        Device device = (Device) ((KGw) newBuilder).A00;
        str.getClass();
        device.bitField0_ |= 1;
        device.name_ = str;
        return newBuilder;
    }

    public static void A03(Iterable iterable, List list) {
        Charset charset = Kyu.A04;
        if (iterable instanceof MRL) {
            List BHv = ((MRL) iterable).BHv();
            MRL mrl = (MRL) list;
            int size = list.size();
            for (Object obj : BHv) {
                if (obj == null) {
                    String A0d = 0Pz.A0d("Element at index ", " is null.", GOn.A0A(mrl, size));
                    int size2 = mrl.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        } else {
                            mrl.remove(size2);
                        }
                    }
                    throw AnonymousClass001.A0Q(A0d);
                }
                if (obj instanceof Lj5) {
                    mrl.A51((Lj5) obj);
                } else {
                    mrl.add(obj);
                }
            }
            return;
        }
        if (iterable instanceof MDj) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(JQz.A0G((Collection) iterable, list.size()));
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String A0d2 = 0Pz.A0d("Element at index ", " is null.", GOn.A0A(list, size3));
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        break;
                    } else {
                        list.remove(size4);
                    }
                }
                throw AnonymousClass001.A0Q(A0d2);
            }
            list.add(obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Throwable, X.MLr] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04(byte[] r302) {
        /*
            r301 = this;
            r0 = r302
            int r0 = r0.length
            r303 = r0
            r0 = r301
            r304 = r0
            r0 = r301
            X.KGw r0 = (X.KGw) r0
            r304 = r0
            X.L9l r0 = X.L9l.A00()
            r305 = r0
            r0 = r304
            r0.A06()
            X.L26 r0 = X.L26.A02     // Catch: java.io.IOException -> L4f java.lang.IndexOutOfBoundsException -> L59 X.KLt -> L60
            r306 = r0
            r0 = r304
            X.KJb r0 = r0.A00     // Catch: java.io.IOException -> L4f java.lang.IndexOutOfBoundsException -> L59 X.KLt -> L60
            r307 = r0
            r0 = r307
            java.lang.Class r0 = r0.getClass()     // Catch: java.io.IOException -> L4f java.lang.IndexOutOfBoundsException -> L59 X.KLt -> L60
            r307 = r0
            r0 = r306
            r1 = r307
            X.MLr r0 = r0.A00(r1)     // Catch: java.io.IOException -> L4f java.lang.IndexOutOfBoundsException -> L59 X.KLt -> L60
            r308 = r0
            r0 = r304
            X.KJb r0 = r0.A00     // Catch: java.io.IOException -> L4f java.lang.IndexOutOfBoundsException -> L59 X.KLt -> L60
            r309 = r0
            X.L0L r0 = new X.L0L     // Catch: java.io.IOException -> L4f java.lang.IndexOutOfBoundsException -> L59 X.KLt -> L60
            r310 = r0
            r0 = r310
            r1 = r305
            r0.<init>(r1)     // Catch: java.io.IOException -> L4f java.lang.IndexOutOfBoundsException -> L59 X.KLt -> L60
            r0 = r308
            r1 = r310
            r2 = r309
            r3 = r302
            r4 = 0
            r5 = r303
            r0.Be8(r1, r2, r3, r4, r5)     // Catch: java.io.IOException -> L4f java.lang.IndexOutOfBoundsException -> L59 X.KLt -> L60
            return
        L4f:
            r306 = move-exception
            java.lang.String r0 = "Reading from byte array should not throw IOException."
            r1 = r306
            java.lang.RuntimeException r0 = X.1BK.A0s(r0, r1)
            throw r0
        L59:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.KLt r0 = X.KLt.A02(r0)
            throw r0
        L60:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lge.A04(byte[]):void");
    }

    public /* bridge */ /* synthetic */ Object clone() {
        throw 0Q8.createAndThrow();
    }
}
