package X;

/* loaded from: Dpy.class */
public final class Dpy extends C04v {
    public final Object A00;
    public final String A01;
    public final boolean A02;

    public Dpy(boolean z, String str, Object obj) {
        this.A00 = obj;
        this.A02 = z;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("XccuResult(result=");
        A0k.append(this.A00);
        A0k.append(", isSuccess=");
        A0k.append(this.A02);
        A0k.append(4YT.A00(203));
        return DKH.A0o(this.A01, A0k);
    }
}
