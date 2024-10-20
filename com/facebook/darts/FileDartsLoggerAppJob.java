package com.facebook.darts;

import X.0BR;
import X.0CU;
import X.0CW;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Br;
import X.1CO;
import X.1Lm;
import X.2yD;
import X.5Ju;
import X.7zR;
import X.AnonymousClass001;
import X.C00i;
import X.C01s;
import X.C0B7;
import X.DKD;
import X.GOo;
import X.GOp;
import X.JQx;
import X.KrY;
import X.Ks4;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: FileDartsLoggerAppJob.class */
public final class FileDartsLoggerAppJob {
    public static final void A00() {
        Ks4 ks4 = (Ks4) 1Lm.A06(1BL.A0E(), 131126);
        0fH.A0j("FileDartsLogger", "start file read on app init");
        AtomicBoolean atomicBoolean = ks4.A09;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (ks4) {
            LinkedHashMap A1C = 1BK.A1C();
            long nanoTime = System.nanoTime();
            C00i c00i = ks4.A05.A00;
            List A0M = 0CU.A0M(2yD.A02((1CO) c00i.get(), 36884826953156112L), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
            ArrayList A0z = 1BL.A0z(A0M);
            Iterator it = A0M.iterator();
            while (it.hasNext()) {
                A0z.add(0CW.A0c(AnonymousClass001.A0i(it)));
            }
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("start loading Darts events ");
            A0k.append(A0z);
            GOp.A1S(" from disk", "FileDartsLogger", A0k);
            int i = 0;
            for (EventId eventId : EventId.values()) {
                if (!((1CO) c00i.get()).AZk(36321876999684991L) || GOo.A1U(eventId.event, A0z)) {
                    try {
                        File A0D = AnonymousClass001.A0D(((5Ju) 1Br.A0B(ks4.A01)).AUU(1389005024), AnonymousClass001.A0Z(eventId, "DARTS_EVENTS_", AnonymousClass001.A0k()));
                        if (A0D.exists()) {
                            FileInputStream fileInputStream = new FileInputStream(A0D);
                            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                            Map map = ks4.A08;
                            KrY krY = (KrY) map.get(eventId);
                            if (krY == null) {
                                new KrY();
                            }
                            synchronized (krY) {
                                try {
                                    Object readObject = objectInputStream.readObject();
                                    11T.A0I(readObject, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Long>");
                                    List A01 = C0B7.A01(readObject);
                                    Object readObject2 = objectInputStream.readObject();
                                    11T.A0I(readObject2, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
                                    List A012 = C0B7.A01(readObject2);
                                    Object readObject3 = objectInputStream.readObject();
                                    11T.A0I(readObject3, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Float>");
                                    List A013 = C0B7.A01(readObject3);
                                    krY.A01.addAll(0, A01);
                                    krY.A00.addAll(0, A012);
                                    krY.A02.addAll(0, A013);
                                    StringBuilder A0k2 = AnonymousClass001.A0k();
                                    A0k2.append("read from file timestamps=");
                                    A0k2.append(A01);
                                    A0k2.append(", targets=");
                                    A0k2.append(A012);
                                    1BL.A1I(A013, ", values=", "FileDartsLogger", A0k2);
                                } catch (Throwable th) {
                                    KrY krY2 = krY;
                                    throw th;
                                    break;
                                }
                            }
                            objectInputStream.close();
                            fileInputStream.close();
                            map.put(eventId, krY);
                            if (!krY.A01()) {
                                StringBuilder A0k3 = AnonymousClass001.A0k();
                                A0k3.append("Event ");
                                A0k3.append(eventId);
                                A0k3.append(" corrupted ");
                                A0k3.append(krY.A01);
                                A0k3.append(',');
                                A0k3.append(krY.A00);
                                A0k3.append(',');
                                0fH.A0j("FileDartsLogger", AnonymousClass001.A0a(krY.A02, A0k3));
                                C01s A04 = 1Br.A04(ks4.A04);
                                StringBuilder A0k4 = AnonymousClass001.A0k();
                                A0k4.append("Skip loading corrupted ");
                                A0k4.append(eventId);
                                A0k4.append(' ');
                                DKD.A1F(A04, 0BR.A01("FileDartsLogger", AnonymousClass001.A0a(krY.A00(), A0k4)));
                                krY.A01.clear();
                                krY.A00.clear();
                                krY.A02.clear();
                            }
                            A1C.put(eventId.toString(), String.valueOf(krY.A01.size()));
                            i += krY.A01.size();
                            ks4.A0A.set(true);
                            StringBuilder A0k5 = AnonymousClass001.A0k();
                            A0k5.append("load ");
                            KrY krY3 = (KrY) map.get(eventId);
                            A0k5.append(krY3 != null ? JQx.A0p(krY3.A01) : null);
                            A0k5.append(' ');
                            A0k5.append(eventId);
                            GOp.A1S(" events from disk", "FileDartsLogger", A0k5);
                        } else {
                            continue;
                        }
                    } catch (IOException e) {
                        0fH.A0p("FileDartsLogger", "failed to load events", e);
                    }
                }
            }
            long nanoTime2 = System.nanoTime() - nanoTime;
            if (ks4.A0B) {
                A1C.put("total_events", String.valueOf(i));
                ((LightweightQuickPerformanceLogger) 1Br.A0B(ks4.A06)).markerGenerateWithAnnotations(635571873, (short) 2, nanoTime2, TimeUnit.NANOSECONDS, A1C);
            }
            StringBuilder A0u = 7zR.A0u();
            A0u.append(((float) nanoTime2) / 1000000.0f);
            A0u.append(" ms] finish loading ");
            A0u.append(i);
            GOp.A1S(" events from disk", "FileDartsLogger", A0u);
        }
        atomicBoolean.set(true);
    }
}
