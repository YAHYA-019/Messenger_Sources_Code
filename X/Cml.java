package X;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.data.repository.user.UserDataModel;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;

/* loaded from: Cml.class */
public final class Cml implements 5Vz {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Cml(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void Bq7(ImmutableList immutableList) {
        Name A0q;
        if (this.A00 == 0) {
            boolean isEmpty = immutableList.isEmpty();
            MutableLiveData mutableLiveData = (AfU) this.A01;
            if (isEmpty) {
                AfU.A01((FbUserSession) this.A02, mutableLiveData);
                return;
            }
            C1x1 c1x1 = (C1x1) ((AfU) mutableLiveData).A00.get();
            User user = (User) 1BK.A0r(immutableList);
            c1x1.A00(mutableLiveData, new UserDataModel(user, user != null ? "SUCCESS" : "DATA_NOT_EXIST"));
            return;
        }
        11T.A0F(immutableList, 0);
        if (immutableList.isEmpty() || (A0q = AbI.A0q(immutableList, 0)) == null || A0q.displayName == null) {
            return;
        }
        94S r0 = MigBottomSheetDialogFragment.A01;
        Object A0q2 = 4YU.A0q(immutableList, 0);
        11T.A0F(A0q2, 0);
        Bundle A00 = 0PK.A00(7zQ.A1b("arg_loaded_user", A0q2));
        0D2 baseMigBottomSheetDialogFragment = new BaseMigBottomSheetDialogFragment();
        baseMigBottomSheetDialogFragment.setArguments(A00);
        baseMigBottomSheetDialogFragment.A04 = (DFY) this.A01;
        baseMigBottomSheetDialogFragment.A07 = null;
        baseMigBottomSheetDialogFragment.A05 = null;
        baseMigBottomSheetDialogFragment.A0m((06Z) this.A02, "ContextualProfileFriendshipStatusResource");
    }
}
