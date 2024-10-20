package X;

import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.papaya.client.engine.batch.FederatedAnalyticsWorker;

/* renamed from: X.3dk, reason: invalid class name */
/* loaded from: 3dk.class */
public final class C3dk implements 1K9 {
    public final int A00;

    public C3dk(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public void onFailure(Throwable th) {
        String str;
        String str2;
        String str3;
        switch (this.A00) {
            case 1:
                str2 = "JewelDataProvider";
                str3 = "[jewel] Failed to mark jewels as seen";
                0fH.A0o(str2, str3);
                return;
            case 2:
                str2 = "JewelDataProvider";
                str3 = "[jewel] Failed to mark jewels as read";
                0fH.A0o(str2, str3);
                return;
            case 3:
                11T.A0F(th, 0);
                str = FederatedAnalyticsWorker.TAG;
                0fH.A0r(str, "Background worker schedule failed", th);
                return;
            case 4:
                11T.A0F(th, 0);
                str = com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker.TAG;
                0fH.A0r(str, "Background worker schedule failed", th);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public void onSuccess(Object obj) {
        String str;
        boolean booleanValue;
        String str2;
        switch (this.A00) {
            case 1:
                TreeJNI treeJNI = (TreeJNI) obj;
                11T.A0F(treeJNI, 0);
                booleanValue = treeJNI.getBooleanValue(1826074520);
                str2 = "[jewel] Jewels mark as invalid result: ";
                0fH.A0j("JewelDataProvider", 0Pz.A1C(str2, booleanValue));
                return;
            case 2:
                TreeJNI treeJNI2 = (TreeJNI) obj;
                11T.A0F(treeJNI2, 0);
                booleanValue = treeJNI2.getBooleanValue(-1788618618);
                str2 = "[jewel] Jewels mark as read result: ";
                0fH.A0j("JewelDataProvider", 0Pz.A1C(str2, booleanValue));
                return;
            case 3:
                str = FederatedAnalyticsWorker.TAG;
                0fH.A0j(str, "Background worker scheduled successfully");
                return;
            case 4:
                str = com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker.TAG;
                0fH.A0j(str, "Background worker scheduled successfully");
                return;
            default:
                return;
        }
    }
}
