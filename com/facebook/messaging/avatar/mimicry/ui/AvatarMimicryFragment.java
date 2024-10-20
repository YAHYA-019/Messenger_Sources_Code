package com.facebook.messaging.avatar.mimicry.ui;

import X.0FI;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BM;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1Lo;
import X.1UG;
import X.7J3;
import X.7Nc;
import X.8O0;
import X.9BS;
import X.9HX;
import X.9Z2;
import X.9uE;
import X.A6F;
import X.ALc;
import X.ALd;
import X.ALe;
import X.AbE;
import X.AnonymousClass001;
import X.Bzc;
import X.C01g;
import X.C01h;
import X.C01i;
import X.C05;
import X.C2ga;
import X.C6mo;
import X.CG9;
import X.DCx;
import X.EqJ;
import X.ExJ;
import X.FHv;
import X.MIN;
import android.content.Context;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadCustomization;
import com.facebook.messaging.service.model.ModifyThreadParams;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.ui.emoji.model.Emoji;
import com.google.common.collect.ImmutableList;
import java.io.Serializable;

/* loaded from: AvatarMimicryFragment.class */
public final class AvatarMimicryFragment extends MigBottomSheetDialogFragment {
    public FbUserSession A00;
    public final C01i A01 = C01g.A01(new DCx(this, 24));

    /* JADX WARN: Multi-variable type inference failed */
    public static final 7Nc A05(AvatarMimicryFragment avatarMimicryFragment) {
        String string;
        Bundle bundle = avatarMimicryFragment.mArguments;
        if (bundle == null || (string = bundle.getString("ArgNuxType")) == null) {
            throw 1BK.A0h();
        }
        return 7Nc.valueOf(string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final 8O0 A08(AvatarMimicryFragment avatarMimicryFragment) {
        Bundle bundle = avatarMimicryFragment.mArguments;
        8O0 r301 = null;
        Serializable serializable = bundle != null ? bundle.getSerializable("ArgAvatarSticker") : null;
        if (serializable instanceof 8O0) {
            r301 = (8O0) serializable;
        }
        return r301;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v54, types: [com.facebook.messaging.model.threads.NicknamesMap, java.lang.Object] */
    public static final void A0C(Context context, AvatarMimicryFragment avatarMimicryFragment) {
        ThreadKey threadKey;
        String str;
        FHv fHv;
        EqJ eqJ;
        String A00;
        7Nc A05 = A05(avatarMimicryFragment);
        9BS r0 = 9BS.$redex_init_class;
        int ordinal = A05.ordinal();
        if (ordinal == 4) {
            ((C6mo) avatarMimicryFragment.A01.getValue()).A00 = 0S2.A00;
            1BK.A0W().A0A(context, ((Bzc) 1Bn.A0A(68697)).A00(context, ((CG9) 1Bn.A0A(68698)).A01(), ImmutableList.of()));
            return;
        }
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2) {
                fHv = (FHv) 1Bn.A0A(99843);
                eqJ = new EqJ();
                A00 = AbE.A00(ActionId.FAIL_FILE_TOO_LARGE);
            } else {
                if (ordinal != 3) {
                    return;
                }
                fHv = (FHv) 1Bn.A0A(99843);
                eqJ = new EqJ();
                A00 = "edit_button";
            }
            eqJ.A04 = A00;
            eqJ.A07 = "messenger_avatar_mimicry";
            fHv.A05(context, new ExJ(eqJ));
            return;
        }
        Bundle bundle = avatarMimicryFragment.mArguments;
        if (bundle == null || (threadKey = (ThreadKey) bundle.getParcelable("ArgThreadKey")) == null) {
            return;
        }
        Long l = null;
        if (threadKey.A0z()) {
            1Bn.A0A(147919);
            FbUserSession fbUserSession = avatarMimicryFragment.A00;
            if (fbUserSession != null) {
                A6F a6f = new A6F(fbUserSession);
                8O0 A08 = A08(avatarMimicryFragment);
                Emoji emoji = A08 != null ? A08.emoji : null;
                8O0 A082 = A08(avatarMimicryFragment);
                if (A082 != null && (str = A082.instructionKeyId) != null) {
                    l = 1BK.A0n(str);
                }
                a6f.Cni(context, threadKey, emoji, l);
                return;
            }
        } else {
            FbUserSession fbUserSession2 = avatarMimicryFragment.A00;
            if (fbUserSession2 != null) {
                8O0 A083 = A08(avatarMimicryFragment);
                if (A083 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                ((9Z2) 1Lo.A04(context, fbUserSession2, (1BY) null, 68443)).A00((MIN) null, new 9uE(0), new ModifyThreadParams(C2ga.A00(threadKey), null, new ThreadCustomization(new Object(), A083.instructionKeyId, A083.emoji.A07()), null, null, null, "promo_link", false, true, false, false, false, false), (String) null);
                return;
            }
        }
        11T.A0L("fbUserSession");
        throw 0Q8.createAndThrow();
    }

    public static final void A0E(7Nc r301, ThreadKey threadKey, 8O0 r303) {
        C01h A01 = C01g.A01(ALe.A00);
        C01h A012 = C01g.A01(ALd.A00);
        C01h A013 = C01g.A01(ALc.A00);
        9BS r0 = 9BS.$redex_init_class;
        int ordinal = r301.ordinal();
        if (ordinal == 4) {
            ((7J3) A013.getValue()).A00(0S2.A01);
            return;
        }
        if (ordinal == 0) {
            if (r303 != null) {
                if (threadKey == null || !threadKey.A0z()) {
                    ((C05) A012.getValue()).A00(0S2.A0C, r303.emoji.A07(), r303.instructionKeyName, r303.templateName, "");
                    return;
                } else {
                    ((C05) A012.getValue()).A00(0S2.A0C, null, null, "", "");
                    return;
                }
            }
            return;
        }
        if (ordinal == 1 || ordinal == 2) {
            1UG A08 = 1BK.A08(1Br.A02(((9HX) A01.getValue()).A00), 1BJ.A00(1744));
            if (A08.isSampled()) {
                A08.A7R("entry_point", "create_avatar_nux");
                A08.A7R("has_avatar", "false");
                A08.A7R("is_sender", "false");
                A08.BZL();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0100  */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A1K(final X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.avatar.mimicry.ui.AvatarMimicryFragment.A1K(X.1Iw):X.1LI");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1209742195);
        super.onCreate(bundle);
        this.A00 = 1BM.A01(this);
        0FI.A08(-1519361208, A02);
    }
}
