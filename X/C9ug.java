package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.9ug, reason: invalid class name */
/* loaded from: 9ug.class */
public final class C9ug implements DGr {
    public final /* synthetic */ 6Gs A00;

    public C9ug(6Gs r302) {
        this.A00 = r302;
    }

    @Override // X.DGr
    public void CK4(String str, String str2, String str3, boolean z) {
        6Gs r0 = this.A00;
        6NA r02 = (6NA) r0.A03.get();
        ThreadKey BF7 = r0.A0A.BF7();
        String A00 = 4YT.A00(1213);
        1UG A08 = 1BK.A08(1BK.A07(r02.A00), "messenger_skin_tone_picker_save");
        if (A08.isSampled()) {
            A08.A7R("picker_type", 4YT.A00(ActionId.END_START_ACTIVITY));
            A08.A7R("picker_location", A00);
            A08.A7R("thread_key", BF7.A0t());
            A08.A7R("new_skin_tone", str3);
            A08.BZL();
        }
    }

    @Override // X.DGr
    public void CLX(String str, boolean z) {
        6Gs r0 = this.A00;
        6NA r02 = (6NA) r0.A03.get();
        ThreadKey BF7 = r0.A0A.BF7();
        1UG A08 = 1BK.A08(1BK.A07(r02.A00), "messenger_skin_tone_picker_open");
        if (A08.isSampled()) {
            A08.A7R(1BJ.A00(204), (String) null);
            A08.A7R("picker_type", 4YT.A00(ActionId.END_START_ACTIVITY));
            A08.A7R("thread_key", BF7.A0t());
            A08.BZL();
        }
    }
}
