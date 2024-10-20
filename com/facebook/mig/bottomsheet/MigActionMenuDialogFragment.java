package com.facebook.mig.bottomsheet;

import X.0QD;
import X.11T;
import X.1BL;
import X.1Bi;
import X.1Br;
import X.1Fj;
import X.1Iw;
import X.1LI;
import X.1cU;
import X.2VJ;
import X.2XL;
import X.2XO;
import X.2kW;
import X.2kZ;
import X.4YU;
import X.58N;
import X.7zN;
import X.8Do;
import X.8Lt;
import X.8OH;
import X.AnonymousClass001;
import X.C02A;
import X.C0s8;
import X.C1u3;
import X.C1u4;
import X.C1ut;
import X.C1uz;
import X.C2ke;
import X.C2kk;
import X.C5ww;
import X.C8m6;
import X.C9ye;
import X.CJ4;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.avatar.avatarprofile.ui.ChangeProfilePictureBottomMenuFragment;
import com.facebook.messaging.communitymessaging.communityprofile.fragment.ChangeCommunityProfilePictureBottomMenuFragment;
import com.facebook.messaging.communitymessaging.genaichatsuggestions.ui.GenAIReportHideBottomSheetDialogFragment;
import com.facebook.messaging.communitymessaging.plugins.adminonboarding.adminsuggestedactions.CommunityIntroCardUnpinBottomSheetDialogFragment;
import com.facebook.messaging.friending.bottomsheet.PeopleYouMayKnowOptionsBottomSheetFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.composer.gallery.expandable.permission.ManagePartialPermissionMenuFragment;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: MigActionMenuDialogFragment.class */
public abstract class MigActionMenuDialogFragment extends MigBottomSheetDialogFragment {
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public final 1LI A1K(1Iw r302) {
        58N r303;
        11T.A0F(r302, 0);
        8OH A00 = C8m6.A00(r302);
        MigColorScheme A1F = A1F();
        List<8Lt> A1M = A1M();
        boolean A1X = 1BL.A1X(A1F, A1M);
        ImmutableList.Builder A0h = 4YU.A0h();
        for (8Lt r0 : A1M) {
            CJ4 cj4 = new CJ4();
            cj4.A07 = A1F;
            cj4.A04((CharSequence) r0.A03);
            C1u3 c1u3 = (C1u3) r0.A02;
            if (c1u3 == null) {
                r303 = null;
            } else {
                C1u4 c1u4 = C1u4.SIZE_32;
                C1ut c1ut = C1ut.A0A;
                c1u4.getClass();
                c1ut.getClass();
                r303 = new 58N(c1u3, c1u4, c1ut, A1F);
            }
            cj4.A04 = r303;
            cj4.A01 = (C5ww) r0.A01;
            A0h.m11011add((Object) cj4.A01());
        }
        A00.A2W(1Fj.A01(A0h));
        A00.A01.A03 = false;
        2kW r02 = new 2kW();
        r02.A01 = A1X ? 1 : 0;
        r02.A07 = new 2kZ(new 2XL((C02A) null, (C2kk) null, (2XO) null, (Boolean) null, (Integer) null, 2.0f, 0, 0, false, false, false, false, false, A1X), (1cU) null, (Integer) null, false, false);
        C2ke A002 = r02.A00();
        C8m6 c8m6 = A00.A01;
        c8m6.A01 = A002;
        c8m6.A00 = new 8Do(this);
        A00.A0J();
        C8m6 c8m62 = A00.A01;
        11T.A0A(c8m62);
        return c8m62;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.facebook.messaging.avatar.avatarprofile.ui.ChangeProfilePictureBottomMenuFragment, androidx.fragment.app.Fragment, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [com.facebook.messaging.communitymessaging.communityprofile.fragment.ChangeCommunityProfilePictureBottomMenuFragment, androidx.fragment.app.Fragment, java.lang.Object] */
    public List A1M() {
        if (this instanceof ManagePartialPermissionMenuFragment) {
            return C0s8.A14(C9ye.A00(C1u3.A4v, 7zN.A0s((Fragment) this, 2131959027), this, 76), C9ye.A00(C1u3.A5l, 7zN.A0s((Fragment) this, 2131959025), this, 77));
        }
        if (this instanceof PeopleYouMayKnowOptionsBottomSheetFragment) {
            2VJ r0 = (2VJ) 1Bi.A03(82490);
            ArrayList A0s = AnonymousClass001.A0s();
            if (!2VJ.A00(r0).AZk(36325201302147488L)) {
                A0s.add(C9ye.A00(C1u3.A45, 7zN.A0s((Fragment) this, 2131963201), this, 50));
            }
            A0s.add(C9ye.A00(C1u3.A2d, 7zN.A0s((Fragment) this, 2131963180), this, 51));
            return 0QD.A0V(A0s);
        }
        if (this instanceof CommunityIntroCardUnpinBottomSheetDialogFragment) {
            C1u3 c1u3 = C1u3.A2d;
            return C0s8.A14(C9ye.A00(c1u3, 7zN.A0s((Fragment) this, 2131967635), this, 22), C9ye.A00(c1u3, 7zN.A0s((Fragment) this, 2131967634), this, 23));
        }
        if (this instanceof GenAIReportHideBottomSheetDialogFragment) {
            return C0s8.A14(C9ye.A00(C1u3.A2d, 7zN.A0s((Fragment) this, 2131957614), this, 20), C9ye.A00(C1u3.A1N, 7zN.A0s((Fragment) this, 2131964395), this, 21));
        }
        if (!(this instanceof ChangeCommunityProfilePictureBottomMenuFragment)) {
            ?? r02 = (ChangeProfilePictureBottomMenuFragment) this;
            ImmutableList.Builder builder = ImmutableList.builder();
            if (((C1uz) 1Br.A0B(r02.A02)).A02(37)) {
                builder.m11011add((Object) C9ye.A00(C1u3.A1K, 7zN.A0s((Fragment) r02, 2131953969), r02, 8));
            }
            builder.m11011add((Object) C9ye.A00(C1u3.A4v, 7zN.A0s((Fragment) r02, 2131953968), r02, 9));
            return 1Fj.A01(builder);
        }
        ?? r03 = (ChangeCommunityProfilePictureBottomMenuFragment) this;
        ImmutableList.Builder builder2 = ImmutableList.builder();
        if (!r03.A06 && r03.A05) {
            builder2.m11011add((Object) C9ye.A00(C1u3.A6e, 7zN.A0s((Fragment) r03, 2131954634), r03, 16));
        }
        if (((C1uz) 1Br.A0B(r03.A07)).A02(37) && !r03.A06) {
            builder2.m11011add((Object) C9ye.A00(C1u3.A1K, 7zN.A0s((Fragment) r03, 2131953969), r03, 17));
        }
        builder2.m11011add((Object) C9ye.A00(C1u3.A4v, 7zN.A0s((Fragment) r03, 2131953968), r03, 18));
        return 1Fj.A01(builder2);
    }
}
