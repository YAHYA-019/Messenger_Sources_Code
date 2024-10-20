package X;

import android.net.Uri;

/* renamed from: X.2ed, reason: invalid class name */
/* loaded from: 2ed.class */
public final class C2ed implements C2ee {
    public final Uri A00;
    public final /* synthetic */ C2eb A01;

    public C2ed(C2eb c2eb) {
        this.A01 = c2eb;
        this.A00 = Uri.withAppendedPath(c2eb.A00, "contacts_with_fbids");
    }
}
