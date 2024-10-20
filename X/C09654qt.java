package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.connectionstatus.FbDataConnectionManager;

/* renamed from: X.4qt, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4qt.class */
public final class C09654qt extends 1Ni {
    public final C15h A00;

    public C09654qt() {
        super(new 1BQ(49296), (C02w) 1Bi.A03(0));
        this.A00 = new AHe(this, 0);
    }

    /* JADX WARN: Type inference failed for: r0v89, types: [X.7b9, X.2J3] */
    public /* bridge */ /* synthetic */ void A02(Context context, Intent intent, Object obj) {
        C00i c00i;
        40H A05;
        boolean z;
        C09684qw c09684qw = (C09684qw) obj;
        if (!((Boolean) this.A00.get()).booleanValue() || intent == null || intent.getExtras() == null) {
            return;
        }
        Bundle extras = intent.getExtras();
        Object obj2 = extras.get(AbstractC00603o4.A00(ActionId.PRIVACY_VIOLATION));
        Object obj3 = extras.get("com.facebook.common.connectionstatus.FbDataConnectionManager.LATENCY_STATE");
        40H r0 = c09684qw.A00;
        if (r0.equals(obj2) && c09684qw.A01.equals(obj3)) {
            return;
        }
        40H r02 = 40H.A07;
        if (r02.equals(obj2) || r02.equals(obj3) || !(r02.equals(r0) || r02.equals(c09684qw.A01))) {
            c00i = c09684qw.A04;
            A05 = ((FbDataConnectionManager) c00i.get()).A05();
            if (A05.equals(c09684qw.A02)) {
                return;
            } else {
                z = false;
            }
        } else {
            c00i = c09684qw.A04;
            A05 = ((FbDataConnectionManager) c00i.get()).A05();
            z = true;
        }
        FbDataConnectionManager fbDataConnectionManager = (FbDataConnectionManager) c00i.get();
        c09684qw.A02 = A05;
        c09684qw.A00 = fbDataConnectionManager.A03();
        c09684qw.A01 = fbDataConnectionManager.A04();
        2Jy A0H = 4YU.A0H("quality_change");
        A0H.A0D("pigeon_reserved_keyword_module", "device");
        ((C08394mt) c09684qw.A03.get()).A03(A0H);
        A0H.A09(c09684qw.A02, GOm.A00(87));
        A0H.A09(c09684qw.A00, "bandwidth");
        A0H.A09(c09684qw.A01, "latency");
        if (z) {
            A0H.A0A("raw_kbps", fbDataConnectionManager.A01());
            A0H.A0A("raw_rtt", fbDataConnectionManager.A02());
        }
        C1kw A06 = 1BK.A06(c09684qw.A05);
        if (C7b9.A00 == null) {
            synchronized (C7b9.class) {
                if (C7b9.A00 == null) {
                    C7b9.A00 = new C2J3(A06);
                }
            }
        }
        C7b9.A00.A02(A0H);
    }
}
