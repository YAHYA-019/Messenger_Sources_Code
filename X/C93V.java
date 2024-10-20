package X;

import com.facebook.stickers.model.StickerPack;
import java.util.List;

/* renamed from: X.93V, reason: invalid class name */
/* loaded from: 93V.class */
public final class C93V extends C6ys {
    public final StickerPack A00;
    public final List A01;
    public final boolean A02;

    public C93V(93R r302) {
        super(r302);
        this.A02 = r302.A02;
        this.A01 = r302.A01;
        this.A00 = r302.A00;
    }

    @Override // X.C6ys
    public boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof C93V) && super.equals(obj)) {
            C93V c93v = (C93V) obj;
            if (this.A02 == c93v.A02) {
                z = 4YV.A1a(this.A01, c93v.A01, false);
            }
        }
        return z;
    }

    @Override // X.C6ys
    public int hashCode() {
        int hashCode = (super.hashCode() * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0);
        List list = this.A01;
        int i = 0;
        int hashCode2 = hashCode + (list != null ? list.hashCode() : 0);
        StickerPack stickerPack = this.A00;
        if (stickerPack != null) {
            i = stickerPack.hashCode();
        }
        return hashCode2 + i;
    }
}
