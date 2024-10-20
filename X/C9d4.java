package X;

import android.os.Bundle;
import com.facebook.messaging.avatar.mimicry.ui.AvatarMimicryFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* renamed from: X.9d4, reason: invalid class name */
/* loaded from: 9d4.class */
public final class C9d4 {
    public static final void A00(06Z r301, 7Nc r302, ThreadKey threadKey, 8O0 r304) {
        C05 c05;
        Integer num;
        if (r301.A1U() || (r301.A0b("AvatarMimicryFragment") instanceof AvatarMimicryFragment)) {
            return;
        }
        94S r0 = MigBottomSheetDialogFragment.A01;
        11T.A0F(r302, 1);
        2Ov avatarMimicryFragment = new AvatarMimicryFragment();
        Bundle A00 = 0PK.A00(7zQ.A1b("ArgNuxType", r302.name()));
        if (r304 != null) {
            A00.putSerializable("ArgAvatarSticker", r304);
        }
        if (threadKey != null) {
            A00.putParcelable("ArgThreadKey", threadKey);
        }
        avatarMimicryFragment.setArguments(A00);
        C01h A01 = C01g.A01(ALb.A00);
        C01h A012 = C01g.A01(ALa.A00);
        C01h A013 = C01g.A01(ALZ.A00);
        9BR r02 = 9BR.$redex_init_class;
        int ordinal = r302.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                c05 = (C05) A012.getValue();
                num = 0S2.A00;
                c05.A00(num, null, null, "", "");
            } else if (ordinal == 2) {
                1UG A08 = 1BK.A08(1Br.A02(((9HX) A01.getValue()).A00), "mimicry_upsell_shown");
                if (A08.isSampled()) {
                    A08.A7R("entry_point", "create_avatar_nux");
                    A08.A7R("has_avatar", "false");
                    A08.A7R("is_sender", "false");
                    A08.BZL();
                }
            } else if (ordinal == 4) {
                ((7J3) A013.getValue()).A00(0S2.A00);
            }
        } else if (r304 != null) {
            if (threadKey == null || !threadKey.A0z()) {
                ((C05) A012.getValue()).A00(0S2.A01, r304.emoji.A07(), r304.instructionKeyName, r304.templateName, "");
            } else {
                c05 = (C05) A012.getValue();
                num = 0S2.A01;
                c05.A00(num, null, null, "", "");
            }
        }
        avatarMimicryFragment.A0m(r301, "AvatarMimicryFragment");
    }
}
