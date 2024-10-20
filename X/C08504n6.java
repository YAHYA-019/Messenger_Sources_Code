package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;

/* renamed from: X.4n6, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4n6.class */
public final class C08504n6 {
    public final C00i A00 = new 1BQ(16634);

    public boolean A00(Activity activity, C7z6 c7z6, String str) {
        04J A07;
        EnumC07184j2 enumC07184j2;
        String str2;
        if (activity == null) {
            A07 = 1BK.A07(this.A00);
            enumC07184j2 = EnumC07184j2.CLIENT_ERROR;
            str2 = "no activity to use as a currentContext to launch a new screen";
        } else if (activity.getBaseContext() == null) {
            A07 = 1BK.A07(this.A00);
            enumC07184j2 = EnumC07184j2.CLIENT_ERROR;
            str2 = "activity base context was null";
        } else {
            if (!activity.isFinishing()) {
                return A01(activity, c7z6, str);
            }
            A07 = 1BK.A07(this.A00);
            enumC07184j2 = EnumC07184j2.CLIENT_ERROR;
            str2 = "activity is currently finishing, privacy flow trigger will not be launched";
        }
        AbstractC08514n7.A00(A07, enumC07184j2, c7z6, str, str2);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [androidx.lifecycle.LifecycleOwner] */
    /* JADX WARN: Type inference failed for: r302v0, types: [android.content.Context] */
    public boolean A01(Context context, C7z6 c7z6, String str) {
        04J A07;
        EnumC07184j2 enumC07184j2;
        String str2;
        Lifecycle.State currentState = (context instanceof LifecycleOwner ? (LifecycleOwner) context : ProcessLifecycleOwner.newInstance).getLifecycle().getCurrentState();
        if (currentState == Lifecycle.State.DESTROYED) {
            A07 = 1BK.A07(this.A00);
            enumC07184j2 = EnumC07184j2.CLIENT_ERROR;
            str2 = "pft will not be launched, activity has been destroyed";
        } else {
            if (currentState.isAtLeast(Lifecycle.State.RESUMED)) {
                return true;
            }
            A07 = 1BK.A07(this.A00);
            enumC07184j2 = EnumC07184j2.CLIENT_ERROR;
            str2 = "pft will not be launched, activity has not been started and foregrounded";
        }
        AbstractC08514n7.A00(A07, enumC07184j2, c7z6, str, str2);
        return false;
    }

    public boolean A02(C7z6 c7z6, String str) {
        04J A07;
        EnumC07184j2 enumC07184j2;
        String str2;
        if (c7z6 == null) {
            A07 = 1BK.A07(this.A00);
            enumC07184j2 = EnumC07184j2.CLIENT_RECEIVE_RESPONSE_NULL;
            str2 = "missing PrivacyFlowTrigger response";
        } else if (c7z6.Amp() == null) {
            A07 = (04J) this.A00.get();
            enumC07184j2 = EnumC07184j2.CLIENT_RECEIVE_RESPONSE_NULL;
            str2 = "no flow_name in response";
        } else if (c7z6.Axx() == null && c7z6.Axz() == null) {
            A07 = 1BK.A07(this.A00);
            enumC07184j2 = EnumC07184j2.CLIENT_ERROR;
            str2 = "Flow name exists but no deeplink given";
        } else {
            if (c7z6.BH7() != null) {
                return true;
            }
            A07 = 1BK.A07(this.A00);
            enumC07184j2 = EnumC07184j2.CLIENT_ERROR;
            str2 = "Client does not support the behavior: 'null'";
        }
        AbstractC08514n7.A00(A07, enumC07184j2, c7z6, str, str2);
        return false;
    }
}
