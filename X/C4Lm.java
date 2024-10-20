package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.4Lm, reason: invalid class name */
/* loaded from: 4Lm.class */
public final class C4Lm {
    public final 1Br A02 = 1Bq.A00(16520);
    public final 1Br A01 = 1Bq.A00(83663);
    public final 1Br A00 = 1Bq.A00(66481);

    public static final void A00(C4Lm c4Lm, String str, short s, boolean z) {
        if (z) {
            MarkerEditor withMarker = ((QuickPerformanceLogger) 1Br.A0B(c4Lm.A02)).withMarker(231281612);
            withMarker.annotate("INVALID_RESULT", z);
            withMarker.markerEditingCompleted();
        }
        ((QuickPerformanceLogger) c4Lm.A02.A00.get()).markerEnd(231281612, s);
        if (s == 4) {
            ((1SG) c4Lm.A01.A00.get()).A0I(str);
            return;
        }
        if (s == 3 || s == 87) {
            ((1SG) 1Br.A0B(c4Lm.A01)).A0J(str);
            return;
        }
        if (s == 2) {
            5Ty r0 = (5Ty) c4Lm.A01.A00.get();
            if (z) {
                r0.A0d("INVALID_RESULT", z);
            }
            if (((1WY) r0.A01.A00.get()).A06()) {
                r0.A0M("community_list");
            } else {
                r0.A0e((short) 2, 1SG.A02(r0).currentMonotonicTimestamp());
            }
        }
    }

    public final void A01() {
        ((QuickPerformanceLogger) this.A02.A00.get()).markerStart(231281612);
        5Ty r0 = (5Ty) this.A01.A00.get();
        r0.A0E(231281676, 0);
        r0.A0G(1SG.A02(r0).currentMonotonicTimestamp());
        r0.A0T("community_list", ActionId.MESSENGER_THREAD_LIST_DISPLAYED, ((C0dp) r0.A00.A00.get()).now());
        1SG.A04(r0, "community_list", "get_community_folders_list", ActionId.MESSENGER_THREAD_LIST_DISPLAYED);
    }

    public final void A02(Integer num) {
        String str;
        boolean z;
        String str2;
        boolean z2;
        MarkerEditor withMarker = ((QuickPerformanceLogger) this.A02.A00.get()).withMarker(231281612);
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
            case 2:
                str = "SWIPE";
                break;
            default:
                str = "BUTTON";
                break;
        }
        withMarker.annotate("SOURCE", str);
        switch (intValue) {
            case 0:
            case 1:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        withMarker.annotate("IS_INITIALIZING_DRAWER", z);
        withMarker.annotate("CM_FOLDER_ENABLED", ((1WY) this.A00.A00.get()).A06());
        withMarker.markerEditingCompleted();
        5Ty r0 = (5Ty) this.A01.A00.get();
        switch (intValue) {
            case 0:
            case 2:
                str2 = "SWIPE";
                break;
            default:
                str2 = "BUTTON";
                break;
        }
        r0.A0Z("SOURCE", str2);
        switch (intValue) {
            case 0:
            case 1:
                z2 = true;
                break;
            default:
                z2 = false;
                break;
        }
        r0.A0d("IS_INITIALIZING_DRAWER", z2);
        r0.A0d("CM_FOLDER_ENABLED", ((1WY) r0.A01.A00.get()).A06());
    }
}
