package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.19p, reason: invalid class name */
/* loaded from: 19p.class */
public final class C19p {
    public AlarmManager A00;
    public Context A01;
    public 05S A02;
    public C09D A04;
    public RealtimeSinceBootClock A05;
    public 05L A06;
    public C16k A07;
    public java.util.Map A08;
    public 0Gp A03 = 0Go.A00;
    public final java.util.Map A0A = new ConcurrentHashMap();
    public final C0w6 A09 = new 0lB(this, 1);

    public C19p(Context context, 05S r303, AnonymousClass094 anonymousClass094, RealtimeSinceBootClock realtimeSinceBootClock, 05L r306, C16k c16k) {
        this.A01 = context;
        this.A07 = c16k;
        0Gp A00 = c16k.A00(AlarmManager.class, "alarm");
        if (!A00.A06()) {
            throw AnonymousClass001.A0L("Cannot acquire Alarm service");
        }
        this.A00 = (AlarmManager) A00.A05();
        this.A04 = anonymousClass094.A00(context, "retry");
        this.A05 = realtimeSinceBootClock;
        this.A02 = r303;
        this.A06 = r306;
        this.A08 = AnonymousClass001.A0u();
    }

    public void A00(String str) {
        0fH.A0g(str, "FbnsRegistrarRetry", "register_retry/cancelling retry for package %s");
        PendingIntent pendingIntent = (PendingIntent) this.A08.remove(str);
        if (pendingIntent != null) {
            this.A06.A04(this.A00, pendingIntent);
        }
        0fH.A0j("FbnsRegistrarRetry", "Registration reset retry.");
        0Mi AP6 = this.A04.AP6();
        AP6.CaI(str, 120000L);
        AP6.AGo("FbnsRegistrarRetry", "PreferencesManager failed to store Registration reset retry");
    }
}
