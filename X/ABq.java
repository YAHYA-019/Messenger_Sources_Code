package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.util.concurrent.CancellationException;

/* loaded from: ABq.class */
public final class ABq implements 1K9 {
    public final int A00;
    public final Object A01;
    public final String A02;

    public ABq(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public void onFailure(Throwable th) {
        String message;
        Object[] objArr;
        Object obj;
        switch (this.A00) {
            case 0:
                if (th instanceof CancellationException) {
                    return;
                }
                JU4 ju4 = (JU4) this.A01;
                int i = JU4.A1p;
                ju4.A0i.softReport(JQw.A00(ActionId.ACTIVITY_RESUME), "Exception hiding BubbleTabsContainer", th);
                return;
            case 1:
                C9m6 c9m6 = (C9m6) this.A01;
                ((C7f) 1Br.A0B(c9m6.A03)).A01(c9m6.A00, String.valueOf(this.A02));
                return;
            case 2:
                11T.A0F(th, 0);
                C9cj c9cj = (C9cj) this.A01;
                7zP.A0c(c9cj.A03).A04(0Pz.A0v("Location: BusinessInboxFAQDetailsFetcher, Entry Point: ", this.A02, ", Error Message: Fail to fetch FAQ details, ", th.getMessage()));
                c9cj.A00 = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
                return;
            case 3:
                11T.A0F(th, 0);
                message = th.getMessage();
                objArr = new Object[1];
                obj = "logCtaClickEvent is failed.";
                break;
            case 4:
                11T.A0F(th, 0);
                message = th.getMessage();
                objArr = new Object[1];
                obj = "logThreadViewXmaImpression is failed.";
                break;
            default:
                return;
        }
        objArr[0] = obj;
        0fH.A14("ChatEntityLogger", message, objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0441, code lost:
    
        if (X.11T.A0O(r305, r0 != null ? r0 : "") == false) goto L112;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ABq.onSuccess(java.lang.Object):void");
    }
}
