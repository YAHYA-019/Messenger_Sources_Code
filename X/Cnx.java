package X;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.facebook.messaging.cowatch.notifications.MessengerLivingRoomCreateNotification;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: Cnx.class */
public final class Cnx implements C5pz {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public Cnx(Context context, C8f c8f, Function1 function1) {
        this.A00 = 0;
        this.A01 = function1;
        this.A04 = c8f;
        this.A02 = context;
        this.A03 = AnonymousClass001.A0s();
    }

    public Cnx(Context context, MessengerLivingRoomCreateNotification messengerLivingRoomCreateNotification, C5z c5z, ThreadKey threadKey) {
        this.A00 = 1;
        this.A03 = messengerLivingRoomCreateNotification;
        this.A02 = c5z;
        this.A01 = context;
        this.A04 = threadKey;
    }

    private final void A00(Bitmap bitmap) {
        MessengerLivingRoomCreateNotification messengerLivingRoomCreateNotification = (MessengerLivingRoomCreateNotification) this.A03;
        String str = messengerLivingRoomCreateNotification.A03;
        if (str == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        C5z c5z = (C5z) this.A02;
        C10904ux c10904ux = (C10904ux) 1Br.A0B(c5z.A03);
        Context context = (Context) this.A01;
        C10914uy A00 = c10904ux.A00(context, null, messengerLivingRoomCreateNotification, 10058);
        String str2 = messengerLivingRoomCreateNotification.A04;
        if (str2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        A00.A0L(str2);
        A00.A0M(str);
        boolean A1Z = AbH.A1Z(A00, 1Br.A00(c5z.A02));
        Intent A03 = ((6HS) c5z.A00.get()).A03((ThreadKey) this.A04, 5SW.A1J, "open_cowatch");
        11T.A0A(A03);
        A03.putExtra("thread_view_living_room_id", messengerLivingRoomCreateNotification.A01);
        05X r0 = new 05X();
        r0.A09();
        r0.A08();
        r0.A0D(A03, context.getClassLoader());
        A00.A0D(r0.A01(context, 0, 134217728));
        A00.A0N(A1Z);
        A00.A0K(str);
        ((C10924uz) A00).A03 = 4;
        A00.A0A(2);
        if (bitmap != null) {
            A00.A0F(bitmap);
        }
        4aO A0T = AbJ.A0T(c5z.A06);
        Notification A07 = A00.A07();
        11T.A0A(A07);
        A0T.A02(10058, A07);
        ((C5dx) 1Br.A0B(c5z.A05)).A01(messengerLivingRoomCreateNotification);
    }

    @Override // X.C5pz
    public void Blg() {
        if (this.A00 != 0) {
            A00(null);
        } else {
            ((Function1) this.A01).invoke(((CQ5) 1Br.A0B(((C8f) this.A04).A09)).A05((Bitmap) null));
        }
    }

    @Override // X.C5pz
    public void BpV(2EU r302) {
        if (this.A00 != 0) {
            11T.A0F(r302, 0);
            Bitmap bitmap = null;
            try {
                2EY r0 = (2Ea) r302.A09();
                if (r0 instanceof 2EY) {
                    bitmap = r0.A04;
                }
                A00(bitmap);
                return;
            } finally {
                r302.close();
            }
        }
        11T.A0F(r302, 0);
        List list = (List) this.A03;
        list.add(r302);
        Bitmap bitmap2 = null;
        try {
            if (AbG.A1a(r302)) {
                Object A09 = r302.A09();
                11T.A0I(A09, "null cannot be cast to non-null type com.facebook.imagepipeline.image.CloseableBitmap");
                bitmap2 = ((2EY) A09).A04;
            }
            ((Function1) this.A01).invoke(((CQ5) 1Br.A0B(((C8f) this.A04).A09)).A05(bitmap2));
            2EU.A05(list);
        } catch (Throwable th) {
            ((Function1) this.A01).invoke(((CQ5) 1Br.A0B(((C8f) this.A04).A09)).A05((Bitmap) null));
            2EU.A05(list);
            throw th;
        }
    }
}
