package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.7h4, reason: invalid class name */
/* loaded from: 7h4.class */
public final class C7h4 extends C5fq {
    public ImmutableList A00 = 1BK.A0b();

    public C7h4() {
        this.A0G = true;
    }

    public 7Hd A06() {
        if (1BK.A1Y(this.A00)) {
            return new 7Hd(this);
        }
        throw AnonymousClass001.A0N("You're trying to build a MultiPhotoMessage with no photos!");
    }
}
