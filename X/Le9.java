package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import androidx.activity.result.IntentSenderRequest;
import com.facebook.nativetemplates.fb.action.acpsecuritykeysignin.FBACPSecurityKeySignInActivity;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import java.util.Iterator;
import java.util.Set;

/* loaded from: Le9.class */
public final class Le9 implements C4F3 {
    public final int A00;
    public final Object A01;

    public Le9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C4F3
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.A00) {
            case 0:
                Context context = (Context) this.A01;
                LocationSettingsStates locationSettingsStates = ((LocationSettingsResult) ((KSY) obj).A00).A01;
                LocationSettingsRequest locationSettingsRequest = KxP.A00;
                1BK.A0W().A0H(context.getApplicationContext(), 4YU.A0A(locationSettingsStates.A00 ? KyJ.A01 : KyJ.A00));
                return;
            case 1:
                PendingIntent pendingIntent = (PendingIntent) obj;
                if (pendingIntent != null) {
                    AnonymousClass088 anonymousClass088 = ((FBACPSecurityKeySignInActivity) this.A01).A00;
                    IntentSender intentSender = pendingIntent.getIntentSender();
                    11T.A0A(intentSender);
                    anonymousClass088.A02(new IntentSenderRequest(null, intentSender, 0, 0));
                    return;
                }
                return;
            default:
                Set set = ((EqA) this.A01).A06;
                if (set != null) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    return;
                }
                return;
        }
    }
}
