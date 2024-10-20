package X;

import java.lang.ref.WeakReference;

/* renamed from: X.11b, reason: invalid class name */
/* loaded from: 11b.class */
public final class C11b {
    public final C0zj A00;
    public final String A01;
    public final String A02;
    public final WeakReference A03;

    public C11b(C0zj c0zj, String str, String str2, WeakReference weakReference) {
        this.A03 = weakReference;
        this.A02 = str;
        this.A01 = str2;
        this.A00 = c0zj;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C11b)) {
                return false;
            }
            C11b c11b = (C11b) obj;
            if (!11T.A0O(this.A03, c11b.A03) || !11T.A0O(this.A02, c11b.A02) || !11T.A0O(this.A01, c11b.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A07(this.A01, AnonymousClass002.A07(this.A02, this.A03.hashCode() * 31)) + this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("NewShareableFileParams(context=");
        A0k.append(this.A03);
        A0k.append(", fileName=");
        A0k.append(this.A02);
        A0k.append(", extension=");
        A0k.append(this.A01);
        A0k.append(", storagePath=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
