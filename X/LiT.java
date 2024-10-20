package X;

import java.io.Serializable;

/* loaded from: LiT.class */
public final class LiT implements Serializable {
    public static final long serialVersionUID = -8759979445933046293L;
    public final Throwable e;

    public LiT(Throwable th) {
        this.e = th;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LiT)) {
            return false;
        }
        Throwable th = this.e;
        Throwable th2 = ((LiT) obj).e;
        if (th != th2) {
            return th != null && th.equals(th2);
        }
        return true;
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("NotificationLite.Error[");
        A0k.append(this.e);
        return AnonymousClass001.A0d("]", A0k);
    }
}
