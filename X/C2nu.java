package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.2nu, reason: invalid class name */
/* loaded from: 2nu.class */
public final class C2nu implements C2f1 {
    public static final AnonymousClass207 A01;
    public final C2o9 A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(C2nu.class, null);
    }

    public boolean equals(Object obj) {
        C2o9 c2o9 = this.A00;
        boolean z = false;
        if ((obj instanceof C2nu) && c2o9 == ((C2nu) obj).A00) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        C2o9 c2o9 = this.A00;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SendStateMetadata(sendState=");
        return AnonymousClass002.A0K(c2o9, A0k);
    }
}
