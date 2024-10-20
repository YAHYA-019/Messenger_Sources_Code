package X;

import com.facebook.graphservice.tree.TreeJNI;

/* loaded from: ABi.class */
public final class ABi implements 1K9 {
    public final int A00;

    public ABi(int i) {
        this.A00 = i;
    }

    public void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                11T.A0F(th, 0);
                0fH.A0r("PeopleYouMayKnowItemActionHandler", "Failed to blacklist user", th);
                return;
            case 1:
                0fH.A0o("JewelDataProvider", 1BJ.A00(909));
                return;
            case 2:
            default:
                return;
            case 3:
                11T.A0F(th, 0);
                4YV.A0G().softReport("DocumentViewUtil", "failed to open file", th);
                return;
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.A00) {
            case 0:
                0fH.A0j("PeopleYouMayKnowItemActionHandler", "Blacklisted user successfully");
                return;
            case 1:
                TreeJNI treeJNI = (TreeJNI) obj;
                11T.A0F(treeJNI, 0);
                0fH.A0j("JewelDataProvider", 0Pz.A1C("[jewel] Jewels mark as seen result: ", treeJNI.getBooleanValue(-1788588693)));
                return;
            default:
                return;
        }
    }
}
