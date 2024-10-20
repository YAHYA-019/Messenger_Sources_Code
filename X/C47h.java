package X;

import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: X.47h, reason: invalid class name */
/* loaded from: 47h.class */
public abstract class C47h {
    public final C01i A00 = C01g.A01(new C4O0(this, 13));

    public final void A00() {
        if (((C47i) (this instanceof C4Q7 ? ((C4Q7) this).A03 : ((C47g) this).A03).A00.get()).A00()) {
            boolean z = this instanceof C47g;
            1UG A08 = 1BK.A08((04J) (z ? ((C47g) this).A02 : ((C4Q7) this).A02).A00.get(), "messenger_notification_banner_events");
            if (A08.isSampled()) {
                A08.A7R("surface", "inbox");
                A08.A7R("mute_type", z ? "os_mute" : "app_mute");
                A08.A7R("action", "click");
                A08.BZL();
            }
        }
    }

    public final void A01() {
        2yD r304;
        long j;
        boolean z = this instanceof C4Q7;
        if (((C47i) (z ? ((C4Q7) this).A03 : ((C47g) this).A03).A00.get()).A00()) {
            if (z) {
                r304 = (2yD) ((C4Q7) this).A04.A00.get();
                j = 36600938202469646L;
            } else {
                r304 = (2yD) ((C47g) this).A04.A00.get();
                j = 36600938202404109L;
            }
            long Auy = r304.Auy(j);
            if (Auy >= 0) {
                if (Auy != 0) {
                    if (TimeUnit.MILLISECONDS.toSeconds(((C0dp) (z ? ((C4Q7) this).A00 : ((C47g) this).A00).A00.get()).now() - ((FbSharedPreferences) (z ? ((C4Q7) this).A01 : ((C47g) this).A01).A00.get()).Av1((1G2) this.A00.getValue(), 0L)) < Auy) {
                        return;
                    }
                }
                boolean z2 = this instanceof C47g;
                1UG A00 = 1UD.A00((04J) (z2 ? ((C47g) this).A02 : ((C4Q7) this).A02).A00.get(), 1ZG.A01, "messenger_notification_banner_events");
                if (A00.isSampled()) {
                    A00.A7R("surface", "inbox");
                    A00.A7R("mute_type", z2 ? "os_mute" : "app_mute");
                    A00.A7R("action", "impression");
                    A00.BZL();
                    1Ql edit = ((FbSharedPreferences) (z ? ((C4Q7) this).A01 : ((C47g) this).A01).A00.get()).edit();
                    edit.CaH((1G2) this.A00.getValue(), ((C0dp) (z ? ((C4Q7) this).A00 : ((C47g) this).A00).A00.get()).now());
                    edit.commit();
                }
            }
        }
    }
}
