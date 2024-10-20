package X;

import com.facebook.privacypermissionsnapshots.fb.FBPrivacyPermissionLastLookupStore;

/* loaded from: L2t.class */
public abstract class L2t {
    public static final 1G9 A01 = 1G0.A0B.A0F("privacy_permission_snapshot/").A0F("last_lookup_time_seconds");
    public int A00 = 604800;

    public int A00() {
        try {
            return (int) 4YU.A06(1BL.A08(((FBPrivacyPermissionLastLookupStore) this).A00));
        } catch (ClassCastException e) {
            0fH.A0x("IGPrivacyPermissionLastLookupStore", "ClassCastException while converting Milliseconds into Seconds", e);
            return 0;
        }
    }

    public int A01() {
        int i;
        try {
            i = 1BK.A0R(((FBPrivacyPermissionLastLookupStore) this).A01).ArU(FBPrivacyPermissionLastLookupStore.A03, 0);
            if (i < 0) {
                return 0;
            }
        } catch (ClassCastException e) {
            0fH.A0s(1BJ.A00(1176), "Error while trying to get last lookup timestamp", e);
            i = 0;
        }
        return i;
    }
}
