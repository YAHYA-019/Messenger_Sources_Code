package X;

/* loaded from: KuR.class */
public abstract class KuR {
    public final int A00;
    public final long A01;
    public final String A02;

    public KuR(String str, long j, int i) {
        this.A02 = str;
        this.A01 = j;
        this.A00 = i;
        if (str.length() == 0) {
            throw AnonymousClass001.A0L("The name of a color space cannot be null and must contain at least 1 character");
        }
    }

    public float A01(int i) {
        float f;
        if (this instanceof C2908Jcw) {
            f = 2.0f;
        } else {
            if (this instanceof C2910Jcy) {
                return ((C2910Jcy) this).A00;
            }
            if (this instanceof C2909Jcx) {
                f = 0.5f;
                if (i == 0) {
                    return 1.0f;
                }
            } else {
                f = 128.0f;
                if (i == 0) {
                    return 100.0f;
                }
            }
        }
        return f;
    }

    public float A02(int i) {
        float f;
        if (this instanceof C2908Jcw) {
            f = -2.0f;
        } else {
            if (this instanceof C2910Jcy) {
                return ((C2910Jcy) this).A01;
            }
            f = this instanceof C2909Jcx ? -0.5f : -128.0f;
            if (i == 0) {
                return 0.0f;
            }
        }
        return f;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            z = false;
            if (obj != null && getClass() == obj.getClass()) {
                KuR kuR = (KuR) obj;
                if (this.A00 == kuR.A00 && 11T.A0O(this.A02, kuR.A02)) {
                    z = AnonymousClass001.A1O((this.A01 > kuR.A01 ? 1 : (this.A01 == kuR.A01 ? 0 : -1)));
                }
            }
        }
        return z;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, 4YV.A02(this.A02)) + this.A00;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(this.A02);
        A0k.append(" (id=");
        A0k.append(this.A00);
        A0k.append(", model=");
        return AnonymousClass002.A0K(Kyj.A00(this.A01), A0k);
    }
}
