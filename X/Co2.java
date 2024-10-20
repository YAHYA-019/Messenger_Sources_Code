package X;

import android.content.Intent;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.omnipicker.OmnipickerMultiSelectActivity;

/* loaded from: Co2.class */
public final class Co2 implements DHH {
    public final /* synthetic */ OmnipickerMultiSelectActivity A00;

    public Co2(OmnipickerMultiSelectActivity omnipickerMultiSelectActivity) {
        this.A00 = omnipickerMultiSelectActivity;
    }

    public void AGR(ThreadSummary threadSummary) {
        int i;
        OmnipickerMultiSelectActivity omnipickerMultiSelectActivity = this.A00;
        Intent A0D = C3o5.A0D(omnipickerMultiSelectActivity.getApplicationContext(), OmnipickerMultiSelectActivity.class);
        if (threadSummary != null) {
            A0D.putExtra("thread_summary_key", threadSummary);
            i = -1;
        } else {
            i = 0;
        }
        omnipickerMultiSelectActivity.setResult(i, A0D);
        omnipickerMultiSelectActivity.finish();
    }

    public void C8W() {
        OmnipickerMultiSelectActivity omnipickerMultiSelectActivity = this.A00;
        06Z BDe = omnipickerMultiSelectActivity.BDe();
        AbstractC1522Aka abstractC1522Aka = omnipickerMultiSelectActivity.A00;
        if (abstractC1522Aka != null) {
            abstractC1522Aka.A00 = null;
        }
        if (BDe.A0U() >= 1) {
            BDe.A0w();
        } else {
            omnipickerMultiSelectActivity.finish();
        }
    }
}
