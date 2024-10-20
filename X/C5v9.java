package X;

import com.facebook.xapp.messaging.threadview.model.photo.Photo;

/* renamed from: X.5v9, reason: invalid class name */
/* loaded from: 5v9.class */
public final class C5v9 extends C5fu {
    public final Photo A00;
    public final C5fx A01;

    public C5v9(C5w7 c5w7) {
        super(c5w7);
        this.A01 = C5fw.A0J;
        this.A00 = c5w7.A00;
    }

    @Override // X.C5fv
    public C5fx Ax3() {
        return this.A01;
    }

    @Override // X.C5fu
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof C5v9)) {
                return false;
            }
            if (11T.A0O(this.A00, ((C5v9) obj).A00) && super.equals(obj)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    @Override // X.C5fu
    public int hashCode() {
        return (super.hashCode() * 31) + this.A00.hashCode();
    }

    @Override // X.C5fu
    public String toString() {
        return 0Pz.A0w("[StickerAssetMessage photoUri=", this.A00.A0E, ", super=", super.toString(), ']');
    }
}
