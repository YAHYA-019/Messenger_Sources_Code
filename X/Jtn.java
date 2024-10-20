package X;

import android.app.PendingIntent;

/* loaded from: Jtn.class */
public final class Jtn extends C04v implements MCM {
    public final PendingIntent A00;

    public Jtn(PendingIntent pendingIntent) {
        this.A00 = pendingIntent;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Jtn) && 11T.A0O(this.A00, ((Jtn) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
