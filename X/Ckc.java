package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.messaging.professionalservices.appointmentreminder.shared.AppointmentReminderExtensionParams;
import java.lang.ref.WeakReference;

/* loaded from: Ckc.class */
public final class Ckc implements C7yf {
    @Override // X.C7yf
    public 1pK AlC(Parcelable parcelable) {
        if (!(parcelable instanceof AppointmentReminderExtensionParams)) {
            return null;
        }
        JmB jmB = new JmB();
        Bundle A05 = 1BK.A05();
        A05.putParcelable(JQw.A00(227), parcelable);
        jmB.setArguments(A05);
        return jmB;
    }

    @Override // X.C7yf
    public BP7 AlE() {
        return BP7.APPOINTMENT_REMINDER;
    }

    @Override // X.C7yf
    public /* synthetic */ 1pK AlF(Parcelable parcelable, WeakReference weakReference) {
        return null;
    }
}
