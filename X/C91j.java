package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.messaging.nativepagereply.privatereply.commenttab.data.PrivateReplyCommentsDataFetch;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.91j, reason: invalid class name */
/* loaded from: 91j.class */
public final class C91j extends 5Tp {
    public MigColorScheme A00;

    public C91j() {
        super("PrivateReplyCommentsProps");
    }

    public long A05() {
        return 7zU.A00();
    }

    public Bundle A06() {
        Bundle A05 = 1BK.A05();
        MigColorScheme migColorScheme = this.A00;
        if (migColorScheme != null) {
            A05.putParcelable("colorScheme", migColorScheme);
        }
        return A05;
    }

    public 5iK A07(5iJ r302) {
        return PrivateReplyCommentsDataFetch.create(r302, this);
    }

    public /* bridge */ /* synthetic */ 5TY A08(Context context, Bundle bundle) {
        C91j c91j = new C91j();
        7zU.A0v(context, c91j);
        if (bundle.containsKey("colorScheme")) {
            c91j.A00 = (MigColorScheme) bundle.getParcelable("colorScheme");
        }
        return c91j;
    }

    public void A0A(5TY r302) {
        this.A00 = ((C91j) r302).A00;
    }

    public long A0C() {
        return 7zU.A00();
    }

    public C3Yn A0D(Jtt jtt) {
        return C91g.create(jtt, this);
    }

    public /* bridge */ /* synthetic */ 5Tp A0E(Context context, Bundle bundle) {
        C91j c91j = new C91j();
        7zU.A0v(context, c91j);
        if (bundle.containsKey("colorScheme")) {
            c91j.A00 = (MigColorScheme) bundle.getParcelable("colorScheme");
        }
        return c91j;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj && !(obj instanceof C91j)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 7zU.A00();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(((5TY) this).A03);
        MigColorScheme migColorScheme = this.A00;
        if (migColorScheme != null) {
            A0k.append(" ");
            A0k.append("colorScheme");
            A0k.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
            A0k.append(migColorScheme.toString());
        }
        return A0k.toString();
    }
}
