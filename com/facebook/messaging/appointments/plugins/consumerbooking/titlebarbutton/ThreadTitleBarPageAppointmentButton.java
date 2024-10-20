package com.facebook.messaging.appointments.plugins.consumerbooking.titlebarbutton;

import X.1BK;
import X.5Sh;
import X.7Xa;
import X.C1u3;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;

/* loaded from: ThreadTitleBarPageAppointmentButton.class */
public final class ThreadTitleBarPageAppointmentButton {
    public final Context A00;
    public final ThreadKey A01;
    public final 5Sh A02;
    public final ThreadViewColorScheme A03;
    public static final C1u3 A05 = C1u3.A1B;
    public static final 7Xa A04 = 7Xa.A03;

    public ThreadTitleBarPageAppointmentButton(Context context, ThreadKey threadKey, 5Sh r304, ThreadViewColorScheme threadViewColorScheme) {
        1BK.A1J(context, 1, threadViewColorScheme);
        this.A00 = context;
        this.A01 = threadKey;
        this.A03 = threadViewColorScheme;
        this.A02 = r304;
    }
}
