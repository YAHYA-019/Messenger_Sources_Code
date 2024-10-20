package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.communitymessaging.categorycreation.CreateOrRenameCategoryDialogFragment;
import com.facebook.messaging.communitymessaging.model.CommunityExtraData;
import com.facebook.messaging.communitymessaging.plugins.channelorganization.managecategorymenuitems.renamecategoryitem.RenameCategoryItemImplementation;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: Cub.class */
public final class Cub implements DG8 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Cub(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.DG8
    public final boolean C2c(View view) {
        if (this.A00 == 0) {
            ((CGL) this.A02).A01(((Fragment) ((CuT) this.A01).A01).getContext());
            return true;
        }
        RenameCategoryItemImplementation renameCategoryItemImplementation = (RenameCategoryItemImplementation) this.A02;
        CommunityExtraData communityExtraData = (CommunityExtraData) this.A01;
        if (communityExtraData == null) {
            4YV.A0G().D0v("RenameCategoryItemImplementation", "community was not initialized");
            return false;
        }
        BzH bzH = CreateOrRenameCategoryDialogFragment.A07;
        06Z r0 = renameCategoryItemImplementation.A00;
        ThreadKey threadKey = renameCategoryItemImplementation.A01;
        String str = communityExtraData.A06;
        Long l = renameCategoryItemImplementation.A03;
        C1776AsA c1776AsA = (C1776AsA) AbH.A14(renameCategoryItemImplementation.A02, C1776AsA.class);
        bzH.A00(r0, threadKey, l, str, c1776AsA != null ? c1776AsA.A03 : null);
        return true;
    }
}
