package X;

import androidx.lifecycle.LiveData;

/* renamed from: X.55r, reason: invalid class name */
/* loaded from: 55r.class */
public final class C55r implements AnonymousClass544 {
    public final LiveData A00;
    public final CharSequence A01;
    public final String A02;

    public C55r(LiveData liveData, CharSequence charSequence, String str) {
        this.A02 = str;
        this.A01 = charSequence;
        this.A00 = liveData;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        if (!11T.A0O(4YV.A0d(anonymousClass544, 0), C55r.class)) {
            return false;
        }
        C55r c55r = (C55r) anonymousClass544;
        if (c55r.A02.hashCode() == this.A02.hashCode() && c55r.A01.hashCode() == this.A01.hashCode()) {
            z = true;
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return this.A02.hashCode() + this.A01.hashCode();
    }
}
