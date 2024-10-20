package X;

import com.facebook.messaging.media.photoquality.PhotoQuality;
import com.facebook.messaging.media.photoquality.PhotoQualityCacheItem;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: HqU.class */
public final class HqU {
    public final 1Br A04;
    public final 1Br A06;
    public final C1ko A08;
    public final 1PA A0A;
    public final 1Br A01 = 1HG.A00(7zM.A0A(), 65728);
    public final 1Br A00 = 1Bq.A00(84635);
    public final 1Br A07 = 1Bq.A00(116209);
    public final 1Br A05 = 1Bq.A00(84456);
    public final C15h A09 = new C3j8(2);
    public final 1Br A03 = 1Bq.A00(16431);
    public final 1Br A02 = 7zM.A0R();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [java.util.List] */
    public HqU() {
        C0ty<PhotoQualityCacheItem> c0ty;
        ThreadKey A0K;
        C1k8 c1k8 = new C1k8();
        c1k8.A05(7, TimeUnit.DAYS);
        c1k8.A03(50);
        this.A08 = c1k8.A02();
        1Br A0E = 1BK.A0E();
        this.A04 = A0E;
        this.A06 = 1Bu.A00(33059);
        String A0r = 4YV.A0r(1Br.A09(A0E), HO8.A01);
        if (A0r.length() != 0) {
            try {
                Object A0Q = AnonymousClass243.A00().A0Q(new H6E(), A0r);
                11T.A0D(A0Q);
                c0ty = (List) A0Q;
            } catch (Throwable th) {
                0fH.A0s("PhotoQualityCacheItem", "Unable to deserialize PhotoQualityCacheItem collection", th);
                c0ty = C0ty.A00;
            }
            for (PhotoQualityCacheItem photoQualityCacheItem : c0ty) {
                long currentTimeMillis = System.currentTimeMillis();
                String str = photoQualityCacheItem.threadKey;
                if (str.length() > 0 && photoQualityCacheItem.resolution != 0 && photoQualityCacheItem.thumbnailResolution != 0 && currentTimeMillis <= photoQualityCacheItem.expirationTimeMs && (A0K = ThreadKey.A0K(str, true)) != null) {
                    photoQualityCacheItem.A00 = new PhotoQuality(photoQualityCacheItem.thumbnailResolution);
                    this.A08.CZv(A0K, photoQualityCacheItem);
                }
            }
        }
        1PA A01 = 1P9.A01(1P9.A00(this.A01.A00), new IgR(this, 4), "com.facebook.orca.ACTION_THREAD_KEY_SET");
        this.A0A = A01;
        A01.A00();
    }

    public final void finalize() {
        int A03 = 0FI.A03(-1733560435);
        this.A0A.A01();
        0FI.A09(-1732993371, A03);
    }
}
