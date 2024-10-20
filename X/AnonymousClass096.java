package X;

import android.content.Intent;
import java.util.Set;

/* renamed from: X.096, reason: invalid class name */
/* loaded from: 096.class */
public final class AnonymousClass096 {
    public final AnonymousClass092 A00;
    public final AnonymousClass092 A01;
    public final AnonymousClass092 A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final java.util.Map A06;
    public final Set A07;
    public final Set A08;
    public final Set A09;
    public final AnonymousClass092 A0A;
    public final AnonymousClass092 A0B;
    public final java.util.Map A0C;

    public AnonymousClass096() {
    }

    public AnonymousClass096(AnonymousClass092 anonymousClass092, AnonymousClass092 anonymousClass0922, AnonymousClass092 anonymousClass0923, AnonymousClass092 anonymousClass0924, AnonymousClass092 anonymousClass0925, java.util.Map map, java.util.Map map2, Set set, Set set2, Set set3) {
        this.A05 = "com.facebook.services";
        this.A04 = "com.facebook.services.dev";
        this.A03 = "com.facebook.oxygen.services.fbns.PreloadedFbnsService";
        this.A08 = set2;
        this.A06 = map;
        this.A07 = set;
        this.A0C = map2;
        this.A0A = anonymousClass092;
        this.A01 = anonymousClass0925;
        this.A0B = anonymousClass0924;
        this.A00 = anonymousClass0922;
        this.A02 = anonymousClass0923;
        this.A09 = set3;
    }

    public 09F A00(Intent intent, 05T r303) {
        AnonymousClass092 anonymousClass092 = this.A0A;
        if (anonymousClass092.A00 == null) {
            throw AnonymousClass001.A0T("IntentConfigProvider not bound in Fbns Config Manager");
        }
        C08x c08x = (C08x) ((C08z) anonymousClass092.A00()).A00.get(0);
        c08x.getClass();
        c08x.A01 = r303;
        c08x.A00 = intent;
        return c08x.A00();
    }

    public 09F A01(Intent intent, 05T r303) {
        AnonymousClass092 anonymousClass092 = this.A0A;
        if (anonymousClass092.A00 == null) {
            throw AnonymousClass001.A0T("IntentConfigProvider not bound in Fbns Config Manager");
        }
        C08x c08x = (C08x) ((C08z) anonymousClass092.A00()).A00.get(0);
        c08x.getClass();
        c08x.A01 = r303;
        c08x.A00 = intent;
        return c08x.A00();
    }

    public AnonymousClass094 A02() {
        AnonymousClass092 anonymousClass092 = this.A0B;
        if (anonymousClass092.A00 != null) {
            return (AnonymousClass094) anonymousClass092.A00();
        }
        throw AnonymousClass001.A0T("mPreferencesManagerProvider not bound in Fbns Config Manager");
    }
}
