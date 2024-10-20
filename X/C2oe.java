package X;

/* renamed from: X.2oe, reason: invalid class name */
/* loaded from: 2oe.class */
public final class C2oe implements C2g4 {
    public final C2fr A00;

    public boolean equals(Object obj) {
        C2fr c2fr = this.A00;
        boolean z = false;
        if ((obj instanceof C2oe) && 11T.A0O(c2fr, ((C2oe) obj).A00)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        C2fr c2fr = this.A00;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ChannelProfileThreadImage(threadTileViewData=");
        return AnonymousClass002.A0K(c2fr, A0k);
    }
}
