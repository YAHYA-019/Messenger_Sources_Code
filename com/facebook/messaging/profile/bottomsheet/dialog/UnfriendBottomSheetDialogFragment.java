package com.facebook.messaging.profile.bottomsheet.dialog;

import X.0FI;
import X.0Gm;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1Iw;
import X.1LI;
import X.3yU;
import X.3yV;
import X.7zQ;
import X.7zT;
import X.8fN;
import X.AbE;
import X.CJ6;
import X.DFY;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.parcel.OpaqueParcelable;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;

/* loaded from: UnfriendBottomSheetDialogFragment.class */
public final class UnfriendBottomSheetDialogFragment extends MigBottomSheetDialogFragment {
    public 3yU A00;
    public 3yV A01;
    public FbUserSession A02;
    public CJ6 A03;
    public DFY A04;
    public User A05;
    public String A06;
    public String A07;
    public boolean A08;

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        MigColorScheme migColorScheme = (MigColorScheme) 7zQ.A12(r302, 16979);
        float f = 8fN.A02;
        if (this.A07 != null) {
            return new 8fN(this, migColorScheme);
        }
        11T.A0L("loadedUserProfileName");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1474724184);
        super.onCreate(bundle);
        this.A02 = 7zT.A08(this);
        Parcelable parcelable = requireArguments().getParcelable(AbE.A00(17));
        Parcelable.Creator creator = User.CREATOR;
        11T.A0B(creator);
        Object A01 = 0Gm.A01(creator, parcelable, User.class);
        if (A01 == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(-613352718, A02);
            throw A0h;
        }
        User user = (User) A01;
        this.A05 = user;
        String str = null;
        if (user != null) {
            Name name = user.A0X;
            if (name != null) {
                str = name.displayName;
            }
            this.A07 = String.valueOf(str);
            User user2 = this.A05;
            if (user2 != null) {
                String str2 = user2.A13;
                11T.A0A(str2);
                this.A06 = str2;
                0FI.A08(2048970085, A02);
                return;
            }
        }
        11T.A0L("loadedUser");
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        User user = this.A05;
        if (user == null) {
            11T.A0L("loadedUser");
            throw 0Q8.createAndThrow();
        }
        bundle.putParcelable(AbE.A00(17), new OpaqueParcelable(user));
    }
}
