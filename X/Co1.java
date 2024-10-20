package X;

import android.content.Intent;
import com.facebook.messaging.locationsharing.ui.LocationSharingShareSheetActivity;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.omnipicker.OmnipickerMultiSelectActivity;

/* loaded from: Co1.class */
public final class Co1 implements DHH {
    public final /* synthetic */ LocationSharingShareSheetActivity A00;

    public Co1(LocationSharingShareSheetActivity locationSharingShareSheetActivity) {
        this.A00 = locationSharingShareSheetActivity;
    }

    public void AGR(ThreadSummary threadSummary) {
        int i;
        LocationSharingShareSheetActivity locationSharingShareSheetActivity = this.A00;
        Intent A0D = C3o5.A0D(locationSharingShareSheetActivity.getApplicationContext(), OmnipickerMultiSelectActivity.class);
        if (threadSummary != null) {
            A0D.putExtra("thread_summary_key", threadSummary);
            i = -1;
        } else {
            i = 0;
        }
        locationSharingShareSheetActivity.setResult(i, A0D);
        locationSharingShareSheetActivity.finish();
    }

    public void C8W() {
        LocationSharingShareSheetActivity locationSharingShareSheetActivity = this.A00;
        06Z BDe = locationSharingShareSheetActivity.BDe();
        if (BDe.A0U() >= 1) {
            BDe.A0w();
        } else {
            locationSharingShareSheetActivity.finish();
        }
    }
}
