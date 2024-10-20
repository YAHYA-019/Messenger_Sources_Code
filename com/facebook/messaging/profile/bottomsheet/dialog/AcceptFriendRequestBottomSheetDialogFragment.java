package com.facebook.messaging.profile.bottomsheet.dialog;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1Iw;
import X.1LI;
import X.3yU;
import X.3yV;
import X.6Fe;
import X.7zK;
import X.7zQ;
import X.7zT;
import X.AbE;
import X.CIh;
import X.CJ6;
import X.DFY;
import X.DwD;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;

/* loaded from: AcceptFriendRequestBottomSheetDialogFragment.class */
public final class AcceptFriendRequestBottomSheetDialogFragment extends MigBottomSheetDialogFragment {
    public 3yU A00;
    public 3yV A01;
    public FbUserSession A02;
    public CJ6 A03;
    public DFY A04;
    public 6Fe A05;
    public User A06;
    public CIh A07;
    public String A08;
    public boolean A09;
    public String A0A;

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        MigColorScheme migColorScheme = (MigColorScheme) 7zQ.A12(r302, 16979);
        float f = DwD.A04;
        String str = this.A0A;
        if (str != null) {
            return new DwD(this, migColorScheme, str);
        }
        11T.A0L("loadedUserProfileName");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1453345888);
        super.onCreate(bundle);
        this.A02 = 7zT.A08(this);
        Parcelable parcelable = requireArguments().getParcelable(AbE.A00(17));
        11T.A0I(parcelable, 7zK.A00(384));
        User user = (User) parcelable;
        this.A06 = user;
        String str = null;
        if (user == null) {
            11T.A0L("loadedUser");
            throw 0Q8.createAndThrow();
        }
        Name name = user.A0X;
        if (name != null) {
            str = name.displayName;
        }
        this.A0A = String.valueOf(str);
        0FI.A08(870864429, A02);
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        User user = this.A06;
        if (user == null) {
            11T.A0L("loadedUser");
            throw 0Q8.createAndThrow();
        }
        bundle.putParcelable(AbE.A00(17), user);
    }
}
