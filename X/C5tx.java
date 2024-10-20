package X;

import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.5tx, reason: invalid class name */
/* loaded from: 5tx.class */
public final class C5tx extends C04v {
    public static final AnonymousClass207 A01;
    public static final C5tx A02;
    public final 1Kn A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(C5tx.class, null);
        A02 = new C5tx(1Kn.A06);
    }

    public C5tx(1Kn r302) {
        11T.A0F(r302, 1);
        this.A00 = r302;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C5tx) && this.A00 == ((C5tx) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
