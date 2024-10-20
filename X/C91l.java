package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.messaging.media.resharehub.model.ReshareHubTabModel;
import com.facebook.messaging.media.resharehub.ui.ReshareHubDataFetch;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.91l, reason: invalid class name */
/* loaded from: 91l.class */
public final class C91l extends 5Tp {
    public int A00;
    public ReshareHubTabModel A01;
    public MigColorScheme A02;

    public C91l() {
        super("ReshareHubProps");
    }

    public static C91l A02(Context context, Bundle bundle) {
        C91l c91l = new C91l();
        7zU.A0v(context, c91l);
        if (bundle.containsKey("colorScheme")) {
            c91l.A02 = (MigColorScheme) bundle.getParcelable("colorScheme");
        }
        c91l.A00 = bundle.getInt("gridColumnNum");
        if (bundle.containsKey("tabModel")) {
            c91l.A01 = (ReshareHubTabModel) bundle.getParcelable("tabModel");
        }
        return c91l;
    }

    public long A05() {
        return 7zU.A00();
    }

    public Bundle A06() {
        Bundle A05 = 1BK.A05();
        MigColorScheme migColorScheme = this.A02;
        if (migColorScheme != null) {
            A05.putParcelable("colorScheme", migColorScheme);
        }
        A05.putInt("gridColumnNum", this.A00);
        ReshareHubTabModel reshareHubTabModel = this.A01;
        if (reshareHubTabModel != null) {
            A05.putParcelable("tabModel", reshareHubTabModel);
        }
        return A05;
    }

    public 5iK A07(5iJ r302) {
        return ReshareHubDataFetch.create(r302, this);
    }

    public /* bridge */ /* synthetic */ 5TY A08(Context context, Bundle bundle) {
        return A02(context, bundle);
    }

    public void A0A(5TY r302) {
        C91l c91l = (C91l) r302;
        this.A02 = c91l.A02;
        this.A00 = c91l.A00;
        this.A01 = c91l.A01;
    }

    public long A0C() {
        return 7zU.A00();
    }

    public C3Yn A0D(Jtt jtt) {
        return C91f.create(jtt, this);
    }

    public /* bridge */ /* synthetic */ 5Tp A0E(Context context, Bundle bundle) {
        return A02(context, bundle);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj && !(obj instanceof C91l)) {
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
        MigColorScheme migColorScheme = this.A02;
        if (migColorScheme != null) {
            A0k.append(" ");
            5TY.A01(migColorScheme, "colorScheme", A0k);
        }
        A0k.append(" ");
        A0k.append("gridColumnNum");
        A0k.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        A0k.append(this.A00);
        ReshareHubTabModel reshareHubTabModel = this.A01;
        if (reshareHubTabModel != null) {
            A0k.append(" ");
            5TY.A01(reshareHubTabModel, "tabModel", A0k);
        }
        return A0k.toString();
    }
}
