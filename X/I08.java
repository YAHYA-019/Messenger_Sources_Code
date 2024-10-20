package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.Random;

/* loaded from: I08.class */
public final class I08 {
    public final Context A00;
    public final 1De A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;

    public I08(1De r302) {
        this.A01 = r302;
        1BY r0 = r302.A00;
        this.A09 = 1Bu.A03(r0, 116395);
        this.A02 = 1Bq.A00(49458);
        this.A05 = 1Bq.A00(99952);
        this.A00 = 7zQ.A0I(r0);
        this.A07 = 7zM.A0U();
        this.A04 = 1Bu.A03(r0, 83651);
        this.A0A = 1Bu.A03(r0, 68249);
        this.A06 = 1Bu.A03(r0, 49358);
        this.A08 = 1Bu.A03(r0, 116297);
        this.A03 = AbG.A0M();
    }

    public static final PendingIntent A00(I08 i08, ThreadKey threadKey) {
        Intent A04 = ((4iH) 1Br.A0B(i08.A05)).A04(threadKey, 5SW.A1J);
        A04.setFlags(67108864);
        A04.putExtra("from_notification", true);
        A04.putExtra("trigger", "live_location_notification_open_thread_view");
        int nextInt = ((Random) 1Br.A0B(i08.A09)).nextInt();
        05X r0 = new 05X();
        r0.A08();
        r0.A09();
        Context context = i08.A00;
        r0.A0D(A04, context.getClassLoader());
        PendingIntent A01 = r0.A01(context, nextInt, 268435456);
        11T.A0A(A01);
        return A01;
    }
}
