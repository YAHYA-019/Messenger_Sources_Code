package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.darts.EventId;
import com.facebook.darts.SignalConfig;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Ks4.class */
public final class Ks4 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final java.util.Map A08;
    public final AtomicBoolean A09;
    public final AtomicBoolean A0A;
    public final boolean A0B;

    public Ks4(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        1Br A0C = 1BK.A0C();
        this.A05 = A0C;
        this.A0B = 1Br.A07(A0C).AZk(36321876998177652L);
        this.A06 = 1Bq.A00(68406);
        this.A02 = 7zM.A0d();
        this.A03 = 1Lm.A01(fbUserSession, 131125);
        this.A09 = new AtomicBoolean();
        this.A01 = 1Lm.A01(fbUserSession, 49687);
        this.A04 = 1Bq.A00(16511);
        this.A00 = 1Bq.A00(16616);
        this.A07 = 1Bq.A00(16464);
        this.A08 = 1BK.A1C();
        this.A0A = new AtomicBoolean();
        if (!1Br.A07(this.A05).AZk(36321877000536966L) || 1Br.A07(this.A05).Auy(36603351977760903L) <= 0) {
            return;
        }
        ((ScheduledExecutorService) 1Br.A0B(this.A07)).scheduleAtFixedRate(new Lkh(this), 1Br.A07(this.A05).Auy(36603351978481803L), 1Br.A07(this.A05).Auy(36603351977760903L), TimeUnit.SECONDS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0121, code lost:
    
        if (X.GOp.A00(r0.A02, r316) < r303.floatValue()) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v137 */
    /* JADX WARN: Type inference failed for: r310v3 */
    /* JADX WARN: Type inference failed for: r310v4 */
    /* JADX WARN: Type inference failed for: r310v6, types: [java.util.AbstractCollection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A00(com.facebook.darts.EventId r302, java.lang.Float r303, java.lang.Integer r304, long r305) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ks4.A00(com.facebook.darts.EventId, java.lang.Float, java.lang.Integer, long):java.lang.String");
    }

    public final void A01() {
        synchronized (this) {
            0fH.A0j("FileDartsLogger", "start saving Darts events to disk");
            long nanoTime = System.nanoTime();
            long A00 = 1Br.A00(this.A02);
            LinkedHashMap A1C = 1BK.A1C();
            long nanoTime2 = System.nanoTime();
            C00i c00i = this.A03.A00;
            1Du it = ((ImmutableCollection) ((ImmutableMap) ((IAF) c00i.get()).A04.getValue()).values()).iterator();
            while (true) {
                long j = 0;
                if (!it.hasNext()) {
                    break;
                }
                SignalConfig signalConfig = (SignalConfig) it.next();
                long j2 = signalConfig.A03;
                if (j2 > 0) {
                    EventId eventId = signalConfig.A04;
                    Long l = (Long) A1C.get(eventId);
                    if (l != null) {
                        j = l.longValue();
                    }
                    AnonymousClass001.A18(eventId, Math.max(j, j2), A1C);
                }
            }
            Iterator A1A = 1BK.A1A((java.util.Map) ((IAF) c00i.get()).A02.getValue());
            while (A1A.hasNext()) {
                SignalConfig signalConfig2 = (SignalConfig) A1A.next();
                long j3 = signalConfig2.A03;
                if (j3 > 0) {
                    EventId eventId2 = signalConfig2.A04;
                    Long l2 = (Long) A1C.get(eventId2);
                    AnonymousClass001.A18(eventId2, Math.max(l2 != null ? l2.longValue() : 0L, j3), A1C);
                }
            }
            long nanoTime3 = System.nanoTime() - nanoTime2;
            StringBuilder A0u = 7zR.A0u();
            A0u.append(((float) nanoTime3) / 1000000.0f);
            A0u.append(" ms] get all event retentions: {");
            A0u.append(A1C);
            0fH.A0j("FileDartsLogger", AnonymousClass001.A0f(A0u));
            Iterator A0x = AnonymousClass001.A0x(A1C);
            while (A0x.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0x);
                EventId eventId3 = (EventId) A0z.getKey();
                long A05 = AnonymousClass001.A05(A0z.getValue());
                Object obj = this.A08.get(eventId3);
                KrY krY = (KrY) obj;
                if (krY != null) {
                    long j4 = A00 - A05;
                    synchronized (obj) {
                        Iterator it2 = krY.A01.iterator();
                        int i = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (JR0.A0X(it2) < j4) {
                                i++;
                            } else if (i >= 0) {
                                krY.A01 = 7zO.A10(0QD.A0X(krY.A01, i), 0);
                                krY.A00 = 7zO.A10(0QD.A0X(krY.A00, i), 0);
                                krY.A02 = 7zO.A10(0QD.A0X(krY.A02, i), 0);
                            }
                        }
                        krY.A01.clear();
                        krY.A00.clear();
                        krY.A02.clear();
                        StringBuilder A0k = AnonymousClass001.A0k();
                        A0k.append("truncate events from ");
                        A0k.append(j4);
                        A0k.append(", timestamps=");
                        A0k.append(krY.A01);
                        A0k.append(", targets=");
                        A0k.append(krY.A00);
                        A0k.append(", values=");
                        0fH.A0j("FileDartsLogger", AnonymousClass001.A0a(krY.A02, A0k));
                    }
                    if (krY.A01()) {
                        try {
                            File A0D = AnonymousClass001.A0D(((5Ju) 1Br.A0B(this.A01)).AUU(1389005024), AnonymousClass001.A0Z(eventId3, "DARTS_EVENTS_", AnonymousClass001.A0k()));
                            if (A0D.exists()) {
                                A0D.delete();
                            }
                            A0D.createNewFile();
                            FileOutputStream fileOutputStream = new FileOutputStream(A0D);
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                            synchronized (obj) {
                                objectOutputStream.writeObject(krY.A01);
                                objectOutputStream.writeObject(krY.A00);
                                objectOutputStream.writeObject(krY.A02);
                            }
                            objectOutputStream.close();
                            fileOutputStream.close();
                            StringBuilder A0k2 = AnonymousClass001.A0k();
                            A0k2.append("saved ");
                            A0k2.append(krY.A01.size());
                            A0k2.append(' ');
                            A0k2.append(eventId3);
                            1BL.A1I(A0D, " to ", "FileDartsLogger", A0k2);
                        } catch (IOException e) {
                            0fH.A0p("FileDartsLogger", "failed to save events", e);
                        }
                    } else {
                        StringBuilder A0k3 = AnonymousClass001.A0k();
                        A0k3.append("Event ");
                        A0k3.append(eventId3);
                        A0k3.append(" corrupted ");
                        A0k3.append(krY.A01);
                        A0k3.append(',');
                        A0k3.append(krY.A00);
                        A0k3.append(',');
                        0fH.A0j("FileDartsLogger", AnonymousClass001.A0a(krY.A02, A0k3));
                        C01s A04 = 1Br.A04(this.A04);
                        StringBuilder A0k4 = AnonymousClass001.A0k();
                        A0k4.append("Skip saving corrupted ");
                        A0k4.append(eventId3);
                        A0k4.append(": ");
                        DKD.A1F(A04, 0BR.A01("FileDartsLogger", AnonymousClass001.A0a(krY.A00(), A0k4)));
                    }
                }
            }
            long nanoTime4 = System.nanoTime() - nanoTime;
            StringBuilder A0u2 = 7zR.A0u();
            A0u2.append(((float) nanoTime4) / 1000000.0f);
            GOp.A1S(" ms] finish saving Darts events to disk", "FileDartsLogger", A0u2);
        }
    }
}
