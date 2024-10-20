package X;

import android.view.View;
import com.facebook.common.util.TriState;
import com.facebook.messaging.quickpromotion.plugins.threadlist.threadlistbanner.ThreadListBannerImplementation;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.resources.impl.WaitingForStringsActivity;
import com.google.common.base.Joiner;
import java.util.List;

/* renamed from: X.3e4, reason: invalid class name */
/* loaded from: 3e4.class */
public final class C3e4 implements 1K9 {
    public final int A00;
    public final Object A01;

    public C3e4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    private void A00(List list) {
        WaitingForStringsActivity waitingForStringsActivity = (WaitingForStringsActivity) this.A01;
        ((LightweightQuickPerformanceLogger) 1Br.A0B(waitingForStringsActivity.A09.A00)).markerEnd(4456452, (short) 3);
        waitingForStringsActivity.A01.setVisibility(8);
        waitingForStringsActivity.A00.setVisibility(0);
        boolean z = waitingForStringsActivity.A0D;
        View view = waitingForStringsActivity.A04;
        if (z) {
            view.setVisibility(0);
            waitingForStringsActivity.A03.setVisibility(0);
            waitingForStringsActivity.A05.setVisibility(8);
            waitingForStringsActivity.A02.setVisibility(8);
        } else {
            view.setVisibility(8);
            waitingForStringsActivity.A03.setVisibility(8);
            waitingForStringsActivity.A05.setVisibility(0);
            waitingForStringsActivity.A02.setVisibility(0);
        }
        if (!list.isEmpty() && 1Bn.A0A(83429) == TriState.YES) {
            F8q.A00(new FEd(0Pz.A0j("Internal build only: ", "Could not fetch strings from server: ", new Joiner(" - ").join(list.iterator()))), (F8q) waitingForStringsActivity.A0C.get(), true);
        }
        waitingForStringsActivity.A0K.get();
    }

    public void onFailure(Throwable th) {
        String str;
        String str2;
        String str3;
        boolean z;
        switch (this.A00) {
            case 0:
                11T.A0F(th, 0);
                str2 = "MessagingRegionHintHelper";
                str3 = "refreshRegionHint: GraphQL query in messaging-region-query.graphql failed";
                0fH.A0r(str2, str3, th);
                return;
            case 1:
                ((1Iy) this.A01).A06.countDown();
                return;
            case 2:
                11T.A0F(th, 0);
                C3TS.A01(0L, "jewel_server_fetch_ended", th.getMessage(), C0ra.A00(th), String.valueOf(th.getCause()));
                str = "JewelDataProvider";
                break;
            case 3:
                11T.A0F(th, 0);
                0fH.A0w("JewelDataProvider", "onFailure", th);
                2TV r0 = ((2SP) this.A01).A02;
                if (r0 != null) {
                    r0.C47(new 3JL(0S2.A00), th);
                    return;
                }
                return;
            case 4:
                11T.A0F(th, 0);
                str = "InboxLoaderCoordinator";
                break;
            case 5:
                2rG r02 = (2rG) this.A01;
                synchronized (r02) {
                    z = false;
                    if (r02.A01 != null) {
                        z = true;
                        r02.A01 = null;
                    }
                }
                if (z) {
                    r02.A08(th);
                    return;
                }
                return;
            case 6:
                11T.A0F(th, 0);
                str2 = 4tA.A03;
                str3 = "Error fetching text styles for canvas";
                0fH.A0r(str2, str3, th);
                return;
            case 7:
                return;
            case 8:
                ThreadListBannerImplementation threadListBannerImplementation = ((C2bd) this.A01).A00;
                if (threadListBannerImplementation.A00 != null) {
                    threadListBannerImplementation.A00 = null;
                    threadListBannerImplementation.A05.Bks("quick_promotion");
                    return;
                }
                return;
            case 9:
                C00j.A01(1395482881);
                return;
            case 10:
                WaitingForStringsActivity waitingForStringsActivity = (WaitingForStringsActivity) this.A01;
                waitingForStringsActivity.A0O = true;
                waitingForStringsActivity.A0N = true;
                0fH.A0r(WaitingForStringsActivity.A0P, "Unexpected failure loading resources", th);
                A00(1JW.A03(new Throwable[]{th}));
                return;
            case 11:
                5Fp r03 = (5Fp) this.A01;
                long j = 5Fp.A04;
                r03.A01.set(4);
                return;
            default:
                11T.A0F(th, 0);
                str2 = "TagBotsLoader";
                str3 = "failed to load bots";
                0fH.A0r(str2, str3, th);
                return;
        }
        0fH.A0w(str, "onFailure", th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0328, code lost:
    
        if (r0.A01.length == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0365, code lost:
    
        if (r0.A01 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03c3, code lost:
    
        if (r0.A01 == false) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 2558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3e4.onSuccess(java.lang.Object):void");
    }
}
