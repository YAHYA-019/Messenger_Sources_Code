package X;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: Lda.class */
public abstract class Lda implements MQk {
    public int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0K(Iterable iterable, List list) {
        Charset charset = LC1.A02;
        if (iterable instanceof MRJ) {
            List DCx = ((MRJ) iterable).DCx();
            MRJ mrj = (MRJ) list;
            int size = list.size();
            for (Object obj : DCx) {
                if (obj == null) {
                    String A0d = 0Pz.A0d("Element at index ", " is null.", GOn.A0A(mrj, size));
                    int size2 = mrj.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        } else {
                            mrj.remove(size2);
                        }
                    }
                    throw AnonymousClass001.A0Q(A0d);
                }
                if (obj instanceof Lj6) {
                    mrj.DD4((Lj6) obj);
                } else {
                    mrj.add(obj);
                }
            }
            return;
        }
        if (iterable instanceof MD4) {
            list.addAll((Collection) iterable);
            return;
        }
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(JQz.A0G(iterable, list.size()));
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

    public abstract int A0L(MKz mKz);

    public final byte[] A0M() {
        try {
            int DCq = DCq();
            byte[] bArr = new byte[DCq];
            K7H A05 = K7H.A05(bArr, DCq);
            DDR(A05);
            A05.A0A();
            return bArr;
        } catch (IOException e) {
            throw 1BK.A0s(0Pz.A0j("Serializing ", AnonymousClass001.A0Y(this), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
