package X;

/* renamed from: X.Gjr, reason: case insensitive filesystem */
/* loaded from: Gjr.class */
public final class C2637Gjr extends C04v implements DIU {
    public final H9F A00;
    public final 8Lr A01;
    public final boolean A02;
    public final boolean A03;

    public C2637Gjr() {
        this(null, new 8Lr(7, (Object) null, false), false, true);
    }

    public C2637Gjr(H9F h9f, 8Lr r303, boolean z, boolean z2) {
        this.A02 = z;
        this.A03 = z2;
        this.A00 = h9f;
        this.A01 = r303;
    }

    public 8Lr AYN() {
        return this.A01;
    }

    public H9F AbB() {
        return this.A00;
    }

    public boolean BAz() {
        return this.A03;
    }

    public boolean BTq() {
        return this.A02;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2637Gjr)) {
                return false;
            }
            C2637Gjr c2637Gjr = (C2637Gjr) obj;
            if (this.A02 != c2637Gjr.A02 || this.A03 != c2637Gjr.A03 || this.A00 != c2637Gjr.A00 || !11T.A0O(this.A01, c2637Gjr.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, ((((AnonymousClass002.A00(this.A02 ? 1 : 0) * 31) + AnonymousClass002.A00(this.A03 ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A00)) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VideoSettingsDataViewModelImpl(isLocalVideoOn=");
        A0k.append(this.A02);
        A0k.append(", showVideoControls=");
        A0k.append(this.A03);
        A0k.append(", cameraFacing=");
        A0k.append(this.A00);
        A0k.append(", avatarInformation=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
