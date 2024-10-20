package X;

import android.os.Bundle;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.user.model.Name;
import com.google.common.collect.ImmutableList;

/* loaded from: Cmo.class */
public final class Cmo implements 5Vz {
    public final /* synthetic */ 06Z A00;
    public final /* synthetic */ 3yU A01;
    public final /* synthetic */ DFY A02;
    public final /* synthetic */ CNl A03;
    public final /* synthetic */ boolean A04;

    public Cmo(06Z r302, 3yU r303, DFY dfy, CNl cNl, boolean z) {
        this.A01 = r303;
        this.A03 = cNl;
        this.A04 = z;
        this.A02 = dfy;
        this.A00 = r302;
    }

    public void Bq7(ImmutableList immutableList) {
        Name A0q;
        11T.A0F(immutableList, 0);
        if (immutableList.isEmpty() || (A0q = AbI.A0q(immutableList, 0)) == null || A0q.displayName == null) {
            return;
        }
        94S r0 = MigBottomSheetDialogFragment.A01;
        Bundle A00 = 0PK.A00(7zQ.A1b("arg_loaded_user", 4YU.A0q(immutableList, 0)));
        0D2 baseMigBottomSheetDialogFragment = new BaseMigBottomSheetDialogFragment();
        baseMigBottomSheetDialogFragment.setArguments(A00);
        3yU r02 = this.A01;
        CJ6 cj6 = this.A03.A01;
        11T.A0F(cj6, 0);
        baseMigBottomSheetDialogFragment.A03 = cj6;
        11T.A0F(r02, 0);
        baseMigBottomSheetDialogFragment.A00 = r02;
        3yV A002 = 4SI.A00(r02);
        11T.A0F(A002, 0);
        baseMigBottomSheetDialogFragment.A01 = A002;
        baseMigBottomSheetDialogFragment.A08 = this.A04;
        baseMigBottomSheetDialogFragment.A04 = this.A02;
        baseMigBottomSheetDialogFragment.A0m(this.A00, "ContextualProfileFriendshipStatusResource");
    }
}
