package X;

import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.sync.SyncInitializer;
import java.util.Collection;

/* renamed from: X.4hi, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4hi.class */
public final class C06644hi extends 1Gw implements 1HN {
    public final /* synthetic */ SyncInitializer A00;

    public C06644hi(SyncInitializer syncInitializer) {
        this.A00 = syncInitializer;
    }

    public void A00(1CQ r302, int i) {
        SyncInitializer syncInitializer = this.A00;
        Collection AUe = syncInitializer.A09.AUe(Integer.valueOf(i));
        EnumC06914ib enumC06914ib = EnumC06914ib.GATEKEEPER_CHANGED;
        syncInitializer.A06.A00.A01();
        SyncInitializer.A00(enumC06914ib, syncInitializer, "onGatekeeperChange", AUe);
    }

    public void onSharedPreferenceChanged(FbSharedPreferences fbSharedPreferences, 1G2 r303) {
        0fH.A07(SyncInitializer.class, r303, "Preference changed: %s");
        SyncInitializer syncInitializer = this.A00;
        Collection AUe = syncInitializer.A0A.AUe(r303);
        EnumC06914ib enumC06914ib = EnumC06914ib.PREFKEY_CHANGED;
        syncInitializer.A06.A00.A01();
        SyncInitializer.A00(enumC06914ib, syncInitializer, "onSharedPreferenceChanged", AUe);
    }
}
