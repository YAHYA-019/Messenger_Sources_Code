package com.facebook.memorytimeline.di.enabler;

import X.0Lt;
import X.0P7;
import X.0oD;
import X.1BJ;
import X.1BQ;
import X.1BV;
import X.1UD;
import X.1UG;
import X.1ZG;
import X.2N5;
import X.2O2;
import X.2O6;
import X.2O7;
import X.2yD;
import X.3jB;
import X.5H4;
import X.5H5;
import X.AnonymousClass001;
import X.C00i;
import X.C0M5;
import X.C0fk;
import X.C0fl;
import X.C0fq;
import X.C0ft;
import X.C0g6;
import X.C0q8;
import android.os.SystemClock;
import com.facebook.memorytimeline.MemoryTimeline;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* loaded from: MemoryTimelineEnabler.class */
public final class MemoryTimelineEnabler implements C0fq {
    public static MemoryTimelineEnabler A07;
    public static List A08 = new ArrayList();
    public final C0M5 A00;
    public final C00i A06;
    public final C00i A04 = new 1BQ(16996);
    public final C00i A05 = new 1BQ(66828);
    public final C00i A03 = new 1BQ(66829);
    public final C00i A01 = new 1BV(67690);
    public final C00i A02 = new 1BQ(16943);

    public MemoryTimelineEnabler() {
        0oD r0;
        C00i c00i;
        MemoryTimeline memoryTimeline;
        0Lt r317;
        1BQ r02 = new 1BQ(16520);
        this.A06 = r02;
        this.A00 = new 5H4(this);
        A07 = this;
        final QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) r02.get();
        C00i c00i2 = this.A05;
        if (((2N5) c00i2.get()).A01.AZk(36310473860841761L)) {
            if (((2N5) c00i2.get()).A00.AZk(36310418032623861L)) {
                int A00 = 2yD.A00(((2N5) c00i2.get()).A00, 36591893009399990L);
                if (A00 > 0 && new Random().nextInt(A00) == 0) {
                    c00i = this.A04;
                    memoryTimeline = (MemoryTimeline) c00i.get();
                    final MemoryTimeline memoryTimeline2 = (MemoryTimeline) c00i.get();
                    final long A002 = C0ft.A00();
                    final C0fk c0fk = C0ft.A04 == null ? null : C0ft.A04.A02;
                    r317 = new 0Lt(c0fk, memoryTimeline2, quickPerformanceLogger, A002) { // from class: X.3Z2
                        public EventBuilder A00;
                        public final QuickPerformanceLogger A01;
                        public final long A02;
                        public final C0fk A03;
                        public final MemoryTimeline A04;

                        {
                            this.A01 = quickPerformanceLogger;
                            this.A04 = memoryTimeline2;
                            this.A02 = A002;
                            this.A03 = c0fk;
                        }

                        private void A00(0MB r302, EventBuilder eventBuilder) {
                            long j;
                            long j2;
                            long uptimeMillis = SystemClock.uptimeMillis();
                            eventBuilder.annotate("uptime_ms_since_process_start", uptimeMillis - this.A02);
                            C0fk c0fk2 = this.A03;
                            if (c0fk2 != null) {
                                synchronized (c0fk2) {
                                    j = c0fk2.A04;
                                }
                                if (j > 0) {
                                    eventBuilder.annotate("uptime_ms_since_first_fg", uptimeMillis - j);
                                }
                                synchronized (c0fk2) {
                                    j2 = c0fk2.A01;
                                }
                                if (j2 > 0) {
                                    eventBuilder.annotate("uptime_ms_since_last_fg", uptimeMillis - j2);
                                }
                            }
                            Iterator A0y = AnonymousClass001.A0y(r302.A01);
                            while (A0y.hasNext()) {
                                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                                eventBuilder.annotate(AnonymousClass001.A0j(A0z), 1BK.A16(A0z));
                            }
                            for (0M9 r03 : r302.A00) {
                                0Cu r04 = r03.A02;
                                eventBuilder.annotate(r04.A01(":"), r03.A00);
                                long j3 = r03.A01;
                                if (j3 != -1) {
                                    eventBuilder.annotate(r04.A02(":"), j3);
                                }
                            }
                            eventBuilder.report();
                        }

                        public int B7T() {
                            return this instanceof C37I ? -262177 : -1;
                        }

                        public void Bwf(0Oo r302) {
                            if (r302.mType == 0Op.A01) {
                                EventBuilder annotate = this.A01.markEventBuilder(21364746, "trim").annotate("trim_type", r302.mName);
                                0MB r03 = (0MB) this.A04.A0C.get();
                                if (r03 != null) {
                                    for (0M9 r04 : r03.A00) {
                                        0Cu r05 = r04.A02;
                                        annotate.annotate(r05.A01(":"), Long.toString(r04.A00));
                                        long j = r04.A01;
                                        if (j != -1) {
                                            annotate.annotate(r05.A02(":"), Long.toString(j));
                                        }
                                    }
                                }
                                annotate.report();
                            }
                        }

                        public void C9F(MemoryTimeline memoryTimeline3, 0MB r303) {
                            boolean z = this instanceof C37I;
                            synchronized (this) {
                                if (z) {
                                    A00(r303, this.A01.markEventBuilder(21373284, "periodic_info"));
                                } else {
                                    EventBuilder eventBuilder = this.A00;
                                    if (eventBuilder != null) {
                                        A00(r303, eventBuilder);
                                        this.A00 = null;
                                    }
                                }
                            }
                        }

                        public boolean DAC() {
                            boolean z;
                            boolean z2 = this instanceof C37I;
                            synchronized (this) {
                                if (z2) {
                                    return true;
                                }
                                EventBuilder markEventBuilder = this.A01.markEventBuilder(21364745, "periodic_info");
                                if (markEventBuilder.isSampled()) {
                                    this.A00 = markEventBuilder;
                                    z = true;
                                } else {
                                    markEventBuilder.report();
                                    z = false;
                                }
                                return z;
                            }
                        }
                    };
                }
            } else {
                c00i = this.A04;
                memoryTimeline = (MemoryTimeline) c00i.get();
                final MemoryTimeline memoryTimeline3 = (MemoryTimeline) c00i.get();
                final long A003 = C0ft.A00();
                final C0fk c0fk2 = C0ft.A04 == null ? null : C0ft.A04.A02;
                r317 = new 0Lt(c0fk2, memoryTimeline3, quickPerformanceLogger, A003) { // from class: X.3Z2
                    public EventBuilder A00;
                    public final QuickPerformanceLogger A01;
                    public final long A02;
                    public final C0fk A03;
                    public final MemoryTimeline A04;

                    {
                        this.A01 = quickPerformanceLogger;
                        this.A04 = memoryTimeline3;
                        this.A02 = A003;
                        this.A03 = c0fk2;
                    }

                    private void A00(0MB r302, EventBuilder eventBuilder) {
                        long j;
                        long j2;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        eventBuilder.annotate("uptime_ms_since_process_start", uptimeMillis - this.A02);
                        C0fk c0fk22 = this.A03;
                        if (c0fk22 != null) {
                            synchronized (c0fk22) {
                                j = c0fk22.A04;
                            }
                            if (j > 0) {
                                eventBuilder.annotate("uptime_ms_since_first_fg", uptimeMillis - j);
                            }
                            synchronized (c0fk22) {
                                j2 = c0fk22.A01;
                            }
                            if (j2 > 0) {
                                eventBuilder.annotate("uptime_ms_since_last_fg", uptimeMillis - j2);
                            }
                        }
                        Iterator A0y = AnonymousClass001.A0y(r302.A01);
                        while (A0y.hasNext()) {
                            Map.Entry A0z = AnonymousClass001.A0z(A0y);
                            eventBuilder.annotate(AnonymousClass001.A0j(A0z), 1BK.A16(A0z));
                        }
                        for (0M9 r03 : r302.A00) {
                            0Cu r04 = r03.A02;
                            eventBuilder.annotate(r04.A01(":"), r03.A00);
                            long j3 = r03.A01;
                            if (j3 != -1) {
                                eventBuilder.annotate(r04.A02(":"), j3);
                            }
                        }
                        eventBuilder.report();
                    }

                    public int B7T() {
                        return this instanceof C37I ? -262177 : -1;
                    }

                    public void Bwf(0Oo r302) {
                        if (r302.mType == 0Op.A01) {
                            EventBuilder annotate = this.A01.markEventBuilder(21364746, "trim").annotate("trim_type", r302.mName);
                            0MB r03 = (0MB) this.A04.A0C.get();
                            if (r03 != null) {
                                for (0M9 r04 : r03.A00) {
                                    0Cu r05 = r04.A02;
                                    annotate.annotate(r05.A01(":"), Long.toString(r04.A00));
                                    long j = r04.A01;
                                    if (j != -1) {
                                        annotate.annotate(r05.A02(":"), Long.toString(j));
                                    }
                                }
                            }
                            annotate.report();
                        }
                    }

                    public void C9F(MemoryTimeline memoryTimeline32, 0MB r303) {
                        boolean z = this instanceof C37I;
                        synchronized (this) {
                            if (z) {
                                A00(r303, this.A01.markEventBuilder(21373284, "periodic_info"));
                            } else {
                                EventBuilder eventBuilder = this.A00;
                                if (eventBuilder != null) {
                                    A00(r303, eventBuilder);
                                    this.A00 = null;
                                }
                            }
                        }
                    }

                    public boolean DAC() {
                        boolean z;
                        boolean z2 = this instanceof C37I;
                        synchronized (this) {
                            if (z2) {
                                return true;
                            }
                            EventBuilder markEventBuilder = this.A01.markEventBuilder(21364745, "periodic_info");
                            if (markEventBuilder.isSampled()) {
                                this.A00 = markEventBuilder;
                                z = true;
                            } else {
                                markEventBuilder.report();
                                z = false;
                            }
                            return z;
                        }
                    }
                };
            }
            memoryTimeline.A7U(r317);
            c00i.get();
        }
        if (((2N5) c00i2.get()).A01.AZk(36310473861431592L)) {
            2O2 r03 = (MemoryTimeline) this.A04.get();
            Object obj = this.A03.get();
            2O2 r04 = r03;
            Set set = r04.A09;
            synchronized (set) {
                set.add(obj);
            }
            2O2.A01(r04);
        }
        ((2O7) this.A03.get()).A5x(new 5H5((QuickPerformanceLogger) r02.get()));
        if (((2N5) c00i2.get()).A01.AZk(36310473861169444L) && (r0 = C0fl.A00) != null) {
            r0.A02(C0g6.A7B, new 3jB(this, 0));
        }
        if (((2N5) c00i2.get()).A01.AZk(36310473861300518L)) {
            C0q8.A00 = (MemoryTimeline) this.A04.get();
        }
        if (((2N5) c00i2.get()).A01.AZk(36310473861038371L)) {
            2O2 r05 = (MemoryTimeline) this.A04.get();
            Object obj2 = this.A01.get();
            2O2 r06 = r05;
            Set set2 = r06.A0A;
            synchronized (set2) {
                set2.add(obj2);
            }
            2O2.A01(r06);
        }
        Iterator it = A08.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0Q("executeAction");
        }
        A08 = new ArrayList();
    }

    @Override // X.C0fq
    public void BjC() {
        C00i c00i = this.A04;
        if (((MemoryTimeline) c00i.get()).A02) {
            ((2O7) this.A03.get()).A02();
        }
        2O2 r0 = (MemoryTimeline) c00i.get();
        synchronized (r0) {
            r0.A04 = true;
        }
        2O2.A02(r0, true);
    }

    @Override // X.C0fq
    public void BjH() {
        HashMap hashMap;
        2O2 r0 = (MemoryTimeline) this.A04.get();
        synchronized (r0) {
            r0.A04 = false;
        }
        2O2.A02(r0, true);
        C00i c00i = this.A05;
        if (((2N5) c00i.get()).A01.AZk(36310473861431592L) && ((2N5) c00i.get()).A01.AZk(36310473860972834L)) {
            C00i c00i2 = this.A03;
            2O7 r02 = (2O7) c00i2.get();
            1UG A00 = 1UD.A00(((2O6) c00i2.get()).A02, 1ZG.A01, 1BJ.A00(1559));
            if (A00.isSampled()) {
                HashMap hashMap2 = new HashMap();
                synchronized (r02.A05) {
                    hashMap = new HashMap(r02.A05);
                }
                for (0P7 r03 : hashMap.values()) {
                    String str = r03.A09;
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("TIME_IN_ADDRESS_SPACE_RED_MS", Long.valueOf(r03.A01));
                    hashMap3.put("TIME_IN_ADDRESS_SPACE_YELLOW_MS", Long.valueOf(r03.A02));
                    hashMap3.put("TIME_IN_ADDRESS_SPACE_GREEN_MS", Long.valueOf(r03.A00));
                    hashMap3.put("TIME_IN_JAVA_HEAP_RED_MS", Long.valueOf(r03.A04));
                    hashMap3.put("TIME_IN_JAVA_HEAP_YELLOW_MS", Long.valueOf(r03.A05));
                    hashMap3.put("TIME_IN_JAVA_HEAP_GREEN_MS", Long.valueOf(r03.A03));
                    hashMap3.put("TIME_IN_SYSTEM_RED_MS", Long.valueOf(r03.A07));
                    hashMap3.put("TIME_IN_SYSTEM_YELLOW_MS", Long.valueOf(r03.A08));
                    hashMap3.put("TIME_IN_SYSTEM_GREEN_MS", Long.valueOf(r03.A06));
                    hashMap2.put(str, hashMap3);
                }
                A00.A6J("per_surface_status_times", hashMap2);
                A00.A7R("asl_session_id", C0ft.A02());
                A00.BZL();
                r02.A02();
            }
        }
    }
}
