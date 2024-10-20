package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.Status;

/* loaded from: Le1.class */
public final class Le1 implements C4F2 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Fragment A02;

    public Le1(Activity activity, Context context, Fragment fragment) {
        this.A01 = context;
        this.A02 = fragment;
        this.A00 = activity;
    }

    @Override // X.C4F2
    public void onFailure(Exception exc) {
        try {
            Status status = ((3F8) ((K2A) exc)).mStatus;
            if (status.A00 != 6) {
                KxP.A00(this.A01);
                return;
            }
            PendingIntent pendingIntent = status.A01;
            if (pendingIntent == null) {
                KxP.A00(this.A01);
                return;
            }
            Fragment fragment = this.A02;
            if (fragment == null || !fragment.isAdded()) {
                this.A00.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            } else {
                fragment.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0, null);
            }
        } catch (IntentSender.SendIntentException | ClassCastException unused) {
            KxP.A00(this.A01);
        }
    }
}
