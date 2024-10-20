package X;

import com.facebook.common.util.TriState;
import com.google.common.collect.ImmutableList;

/* renamed from: X.4rn, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4rn.class */
public final class C09834rn extends AbstractC09704ra {
    public final C09844ro A00 = (C09844ro) 1Bn.A0A(49318);
    public final C09854rp A02 = (C09854rp) 1Bn.A0A(49319);
    public final C09864rq A01 = (C09864rq) 1Bn.A0A(82436);
    public final 4qU A03 = new 4qU() { // from class: X.4rs
        public Iterable B0L() {
            return ImmutableList.of((Object) new C4r6(TriState.UNSET, C09834rn.this.A02, null, null, "contacts_upload_settings"));
        }

        public void CA9(java.util.Map map) {
            C09834rn c09834rn = C09834rn.this;
            C09864rq c09864rq = c09834rn.A01;
            boolean A02 = c09864rq.A02();
            C7nX c7nX = (C7nX) map.get("contacts_upload_settings");
            if (c7nX != null) {
                Boolean valueOf = Boolean.valueOf(A02);
                boolean z = c7nX.A00;
                0fH.A0d(valueOf, Boolean.valueOf(z), "ContactsUploadUserSettingsConfigComponent", "CCU: local setting: %b, server setting: %b");
                if (!A02 || z) {
                    return;
                }
                c09864rq.A01(false);
                c09834rn.A00.A00();
            }
        }
    };

    @Override // X.InterfaceC04003zj
    public 4qU AZ3() {
        return this.A03;
    }

    @Override // X.InterfaceC04003zj
    public long Axo() {
        return 86400000L;
    }
}
