package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.chatheads.service.ChatHeadService;

/* renamed from: X.4ut, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ut.class */
public final class C10864ut {
    public int A00;
    public boolean A01;
    public final C00i A03;
    public final C00i A06;
    public final C00i A07;
    public final C00i A02 = FbInjector.A00;
    public final C00i A05 = new 1BV(82103);
    public final C00i A04 = new 1BV(116297);

    public C10864ut(Context context) {
        this.A06 = new 1BV(context, 100200);
        this.A03 = new 1BV(context, 49358);
        this.A07 = new 1BV(context, 82110);
    }

    private void A00(Notification notification, Service service) {
        int i = 1073741824;
        C00i c00i = this.A02;
        if (0Em.A00(1BK.A04(c00i), "android.permission.FOREGROUND_SERVICE_MICROPHONE") == 0 && 0Em.A00(1BK.A04(c00i), "android.permission.RECORD_AUDIO") == 0) {
            i = 1073741952;
        }
        if (0Em.A00(1BK.A04(c00i), AnonymousClass000.A00(26)) == 0) {
            i |= 8;
        }
        service.startForeground(20001, notification, i);
    }

    public void A01() {
        C00i c00i = this.A06;
        if (c00i.get() != null) {
            C08o.A05((Service) c00i.get());
        }
        this.A00 = -1;
    }

    public void A02(int i) {
        String quantityString;
        String str;
        C00i c00i = this.A06;
        Service service = (Service) c00i.get();
        service.getClass();
        C00i c00i2 = this.A02;
        String string = ((Context) c00i2.get()).getResources().getString(2131962580);
        Context context = (Context) c00i2.get();
        if (i == 0) {
            quantityString = context.getResources().getString(2131962581);
            str = C1xj.A09;
        } else {
            quantityString = context.getResources().getQuantityString(2131820574, i, Integer.valueOf(i));
            str = C1xj.A0B;
        }
        Intent intent = new Intent(str, null, (Context) c00i.get(), ChatHeadService.class);
        05X r0 = new 05X();
        r0.A0D(intent, ((Context) c00i.get()).getClassLoader());
        PendingIntent A03 = r0.A03((Context) c00i.get(), 0, 0);
        this.A00 = 20001;
        C10914uy A00 = ((C10904ux) this.A03.get()).A00(service, null, null, this.A00);
        this.A05.get();
        A00.A0B(2132347033);
        A00.A0L(string);
        A00.A0K(quantityString);
        ((C10924uz) A00).A03 = -2;
        A00.A0D(A03);
        A00.A0R = "service";
        A00.A0e = true;
        A00.A0C(0L);
        Notification A07 = A00.A07();
        ((4vM) this.A04.get()).A00(A07, "chat_head");
        0fH.A0j("ChatHeadTrayNotificationManager", "Running Chat Heads Service in foreground.");
        if (Build.VERSION.SDK_INT < 34) {
            C08o.A04(A07, service, 20001);
            return;
        }
        if (this.A01) {
            C00i c00i3 = this.A07;
            if (1Br.A07(((4bM) c00i3.get()).A02).AZk(2342167553385713380L) || 1Br.A07(((4bM) c00i3.get()).A02).AZk(36324544172084965L)) {
                A00(A07, service);
                return;
            }
            0fH.A0n("ChatHeadTrayNotificationManager", "while in use FGS type requested but not added");
        }
        service.startForeground(20001, A07, 1073741824);
    }

    public void A03(boolean z) {
        this.A01 = z;
    }
}
