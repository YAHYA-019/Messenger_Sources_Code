package X;

import com.facebook.xapp.messaging.threadview.model.photo.Photo;
import com.google.common.collect.ImmutableList;

/* renamed from: X.5ft, reason: invalid class name */
/* loaded from: 5ft.class */
public final class C5ft extends C5fu {
    public Photo A00;
    public final ImmutableList A01;
    public final C5fx A02;

    public C5ft(C5fp c5fp) {
        super(c5fp);
        this.A02 = C5fw.A0E;
        this.A01 = c5fp.A00;
    }

    @Override // X.C5fv
    public C5fx Ax3() {
        return this.A02;
    }

    @Override // X.C5fu
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof C5ft)) {
                return false;
            }
            if (11T.A0O(this.A01, ((C5ft) obj).A01) && super.equals(obj)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    @Override // X.C5fu
    public int hashCode() {
        return (super.hashCode() * 31) + this.A01.hashCode();
    }

    @Override // X.C5fu
    public String toString() {
        ImmutableList immutableList = this.A01;
        String A0K = 0QD.A0K(", ", "[", "]", immutableList, C7xn.A00, 3);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("[PhotoMessage photoCount=");
        A0k.append(immutableList.size());
        A0k.append(", photos=");
        A0k.append(A0K);
        A0k.append(", super=");
        return 4YW.A07(super.toString(), A0k);
    }
}
