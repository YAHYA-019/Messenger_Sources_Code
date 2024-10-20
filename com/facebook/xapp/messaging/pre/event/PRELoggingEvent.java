package com.facebook.xapp.messaging.pre.event;

import X.03W;
import X.11T;
import X.1BK;
import X.1Q5;
import X.1R3;
import X.AnonymousClass001;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.messaging.analytics.ttrc.surface.appstart.events.OnColdStart;
import com.facebook.messaging.analytics.ttrc.surface.appstart.events.OnPossibleLukewarmStart;
import com.facebook.messaging.analytics.ttrc.surface.appstart.events.StartupMarkerComplete;
import com.facebook.messaging.analytics.ttrc.surface.inbox.event.MsysThreadListObserverCallbackFail;
import com.facebook.messaging.analytics.ttrc.surface.msys.event.MsysBootstrap;
import com.facebook.messaging.analytics.ttrc.surface.notification.event.OnNotification;
import com.facebook.messaging.analytics.ttrc.surface.threadview.event.ShowThread;
import com.facebook.quicklog.MarkerEditor;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: PRELoggingEvent.class */
public class PRELoggingEvent implements 1Q5 {
    public final long A00;
    public final String A01;
    public final String A02;
    public final Map A03;
    public final Map A04;
    public final Map A05;

    public PRELoggingEvent(1R3 r302) {
        long now = AwakeTimeSinceBootClock.INSTANCE.now();
        String str = r302.A00;
        String str2 = r302.A01;
        Map map = r302.A03;
        Map map2 = r302.A04;
        Map map3 = r302.A02;
        this.A00 = now;
        this.A01 = str;
        this.A02 = str2;
        this.A04 = map;
        this.A05 = map2;
        this.A03 = map3;
    }

    public PRELoggingEvent(String str) {
        11T.A0F(str, 1);
        long now = AwakeTimeSinceBootClock.INSTANCE.now();
        03W r0 = 03W.A00;
        11T.A0I(r0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        11T.A0I(r0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        11T.A0I(r0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        this.A00 = now;
        this.A01 = str;
        this.A02 = "";
        this.A04 = r0;
        this.A05 = r0;
        this.A03 = r0;
    }

    public PRELoggingEvent(String str, String str2) {
        11T.A0F(str, 1);
        long now = AwakeTimeSinceBootClock.INSTANCE.now();
        03W r0 = 03W.A00;
        11T.A0I(r0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        11T.A0I(r0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        11T.A0I(r0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        this.A00 = now;
        this.A01 = str;
        this.A02 = str2;
        this.A04 = r0;
        this.A05 = r0;
        this.A03 = r0;
    }

    public PRELoggingEvent(String str, String str2, long j) {
        11T.A0F(str, 1);
        03W r0 = 03W.A00;
        11T.A0I(r0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        11T.A0I(r0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        11T.A0I(r0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        this.A00 = j;
        this.A01 = str;
        this.A02 = str2;
        this.A04 = r0;
        this.A05 = r0;
        this.A03 = r0;
    }

    public PRELoggingEvent(String str, Map map, Map map2, Map map3) {
        this.A00 = AwakeTimeSinceBootClock.INSTANCE.now();
        this.A01 = str;
        this.A02 = "";
        this.A04 = map2;
        this.A05 = map3;
        this.A03 = map;
    }

    public static final void A00(MarkerEditor markerEditor, PRELoggingEvent pRELoggingEvent) {
        for (Map.Entry entry : pRELoggingEvent.A05.entrySet()) {
            markerEditor.annotate((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = pRELoggingEvent.A03.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(it);
            markerEditor.annotate(AnonymousClass001.A0j(A0z), AnonymousClass001.A1V(A0z.getValue()));
        }
        for (Map.Entry entry2 : pRELoggingEvent.A04.entrySet()) {
            markerEditor.annotate((String) entry2.getKey(), ((Number) entry2.getValue()).intValue());
        }
    }

    public String A3Z() {
        return this instanceof OnNotification ? "com.facebook.messaging.analytics.ttrc.surface.notification.event.OnNotification" : this instanceof ShowThread ? "com.facebook.messaging.analytics.ttrc.surface.threadview.event.ShowThread" : this instanceof MsysBootstrap ? "com.facebook.messaging.analytics.ttrc.surface.msys.event.MsysBootstrap" : this instanceof MsysThreadListObserverCallbackFail ? "com.facebook.messaging.analytics.ttrc.surface.inbox.event.MsysThreadListObserverCallbackFail" : this instanceof StartupMarkerComplete ? "com.facebook.messaging.analytics.ttrc.surface.appstart.events.StartupMarkerComplete" : this instanceof OnPossibleLukewarmStart ? "com.facebook.messaging.analytics.ttrc.surface.appstart.events.OnPossibleLukewarmStart" : this instanceof OnColdStart ? "com.facebook.messaging.analytics.ttrc.surface.appstart.events.OnColdStart" : "com.facebook.xapp.messaging.pre.event.PRELoggingEvent";
    }

    public List B1L() {
        if (this instanceof OnNotification) {
            return OnNotification.A01;
        }
        if (this instanceof ShowThread) {
            return ShowThread.A01;
        }
        if (this instanceof MsysBootstrap) {
            return MsysBootstrap.A00;
        }
        if (this instanceof MsysThreadListObserverCallbackFail) {
            return MsysThreadListObserverCallbackFail.A02;
        }
        if (this instanceof StartupMarkerComplete) {
            return StartupMarkerComplete.A00;
        }
        if (this instanceof OnPossibleLukewarmStart) {
            return OnPossibleLukewarmStart.A00;
        }
        if (this instanceof OnColdStart) {
            return OnColdStart.A01;
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append('\n');
        sb2.append(this.A01);
        sb2.append(this.A02);
        sb.append(sb2.toString());
        Map map = this.A05;
        if (!map.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("\n\t");
            sb3.append(map);
            sb3.append('}');
            sb.append(sb3.toString());
        }
        Map map2 = this.A03;
        if (!map2.isEmpty()) {
            1BK.A1R(sb, AnonymousClass001.A0m(map2, "\n\t"));
        }
        Map map3 = this.A04;
        if (!map3.isEmpty()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("\n\t");
            sb4.append(map3);
            sb.append(sb4.toString());
        }
        String obj = sb.toString();
        11T.A0A(obj);
        return obj;
    }
}
