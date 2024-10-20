package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.messaging.montage.viewer.endcard.component.MontageMidCardDataFetch;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Arrays;
import java.util.BitSet;

/* renamed from: X.91k, reason: invalid class name */
/* loaded from: 91k.class */
public final class C91k extends 5Tp {
    public String A00;

    public C91k() {
        super("MontageMidCardProps");
    }

    public static C91k A02(Context context, Bundle bundle) {
        C91k c91k = new C91k();
        7zU.A0v(context, c91k);
        BitSet A18 = 1BK.A18(1);
        A18.clear();
        c91k.A00 = bundle.getString("sessionId");
        A18.set(0);
        QUB.A01(A18, new String[]{"sessionId"}, 1);
        return c91k;
    }

    public long A05() {
        return 7zU.A00();
    }

    public Bundle A06() {
        Bundle A05 = 1BK.A05();
        String str = this.A00;
        if (str != null) {
            A05.putString("sessionId", str);
        }
        return A05;
    }

    public 5iK A07(5iJ r302) {
        return MontageMidCardDataFetch.create(r302, this);
    }

    public /* bridge */ /* synthetic */ 5TY A08(Context context, Bundle bundle) {
        return A02(context, bundle);
    }

    public long A0C() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    public C3Yn A0D(Jtt jtt) {
        return C91h.create(jtt, this);
    }

    public /* bridge */ /* synthetic */ 5Tp A0E(Context context, Bundle bundle) {
        return A02(context, bundle);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C91k)) {
                return false;
            }
            String str = this.A00;
            String str2 = ((C91k) obj).A00;
            if (str != str2 && (str == null || !str.equals(str2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(((5TY) this).A03);
        String str = this.A00;
        if (str != null) {
            A0k.append(" ");
            A0k.append("sessionId");
            A0k.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
            A0k.append(str);
        }
        return A0k.toString();
    }
}
