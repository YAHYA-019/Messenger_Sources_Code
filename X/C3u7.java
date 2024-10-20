package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.3u7, reason: invalid class name */
/* loaded from: 3u7.class */
public final class C3u7 implements C2f1 {
    public static final AnonymousClass207 A01;
    public final C4Nk A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(C3u7.class, null);
    }

    public boolean equals(Object obj) {
        C4Nk c4Nk = this.A00;
        boolean z = false;
        if ((obj instanceof C3u7) && c4Nk == ((C3u7) obj).A00) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        C4Nk c4Nk = this.A00;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ThreadActionSystemMetadata(tasLabel=");
        return AnonymousClass002.A0K(c4Nk, A0k);
    }
}
