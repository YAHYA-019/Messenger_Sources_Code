package X;

import com.instagram.common.bloks.componentquery.cache.ComponentQueryDiskCacheRecord;

/* loaded from: Ey6.class */
public final class Ey6 {
    public final FEQ A00;
    public final ComponentQueryDiskCacheRecord A01;

    public Ey6(FEQ feq, ComponentQueryDiskCacheRecord componentQueryDiskCacheRecord) {
        this.A01 = componentQueryDiskCacheRecord;
        this.A00 = feq;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ey6)) {
                return false;
            }
            Ey6 ey6 = (Ey6) obj;
            if (!11T.A0O(this.A01, ey6.A01) || !11T.A0O(this.A00, ey6.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, AnonymousClass001.A02(this.A01) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ComponentQueryDiskCacheResponse(cacheRecord=");
        A0k.append(this.A01);
        A0k.append(", summary=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
