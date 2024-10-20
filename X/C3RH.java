package X;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3RH, reason: invalid class name */
/* loaded from: 3RH.class */
public final class C3RH {
    public long A00;
    public RlK A01;
    public 3OH A02;
    public 3LS A03;
    public C3Up A04;
    public final Context A05;
    public final Handler A06;
    public final 3MU A07;
    public final ROn A08;
    public final 2wP A09;
    public final 35R A0A;
    public final java.util.Map A0B;
    public final /* synthetic */ 2wK A0C;

    public C3RH(Context context, 3MU r303, 2wP r304, 2wK r305) {
        this.A0C = r305;
        Handler A07 = AnonymousClass001.A07();
        this.A06 = A07;
        this.A0B = AnonymousClass001.A0u();
        this.A00 = 0L;
        this.A05 = context.getApplicationContext();
        this.A09 = r304;
        this.A07 = r303;
        this.A0A = new 35R(context, A07, r303.A02, this, r304.A0D);
        C0dr c0dr = r304.A03;
        this.A08 = new ROn(r304.A00, r303.A00, r304.A02, c0dr);
    }

    public static void A00(C3RH c3rh) {
        3Ee r338;
        long j;
        long j2;
        float f;
        float f2;
        double d;
        String str;
        String str2;
        3QM r0 = c3rh.A07.A00;
        if (!r0.A03 || c3rh.A04 == null || c3rh.A03 == null) {
            return;
        }
        RlK rlK = r0.A05 ? c3rh.A08.A00 : c3rh.A01;
        3OH r02 = c3rh.A02;
        if (r02 != null) {
            3LQ r03 = r02.A0A;
            if (r03.A01 && r02.A0D.now() - r02.A06 > r03.A00) {
                return;
            }
        }
        String A03 = c3rh.A03.A02.A03("event_trace_id");
        if (A03 == null) {
            A03 = "";
        }
        C3Up c3Up = c3rh.A04;
        if (1JF.A0C(A03, c3Up.A05)) {
            2wV r04 = c3rh.A09.A02;
            3OH r05 = c3rh.A02;
            3LS r06 = c3rh.A03;
            11T.A0F(r06, 3);
            C2wU c2wU = r04.A01;
            boolean z = false;
            boolean z2 = r05 != null ? r05.A03 : false;
            String str3 = null;
            if (rlK != null) {
                rlK.BBj();
            }
            1UG A00 = 1UD.A00(c2wU.A00, z2 ? 1ZG.A02 : 1ZG.A01, "central_gesture_with_nav");
            if (A00.isSampled()) {
                3Ee r322 = 3Ee.A07;
                List list = C0ty.A00;
                List list2 = list;
                List list3 = list;
                String str4 = "";
                if (r05 != null) {
                    r322 = r05.A0C;
                    list = C3RS.A01(r05.A0H);
                    list2 = C3RS.A00(r05.A0G);
                    list3 = r05.A00();
                    z = r05.A03;
                    str = r05.A0E;
                    d = (c3Up.A00 - r05.A06) / 1000.0d;
                    j = r05.A08;
                    f = r05.A04;
                    f2 = r05.A05;
                    r338 = r05.A0B;
                    j2 = r05.A09;
                } else {
                    r338 = r322;
                    j = 0;
                    j2 = 0;
                    f = 0.0f;
                    f2 = 0.0f;
                    d = 0.0d;
                    str = str4;
                }
                if (rlK != null) {
                    str4 = rlK.BBj();
                    str3 = rlK.BBi();
                }
                A00.A7h("gesture_tracking_nodes", list);
                A00.A7h("gesture_tracking_models", list2);
                A00.A7h("gesture_class_names", list3);
                A00.A7R("gesture_module", str4);
                A00.A5H("gesture_is_ad", Boolean.valueOf(z));
                A00.A7R("gesture_session_id", str);
                A00.A7R("gesture_module_class", str3);
                A00.A6H("gesture_timestamp", Long.valueOf(j));
                A00.A5c(r338, "previous_gesture_type");
                A00.A6H("previous_gesture_timestamp", Long.valueOf(j2));
                A00.A7R("nav_event_name", c3Up.A04);
                A00.A7R("nav_source_module", c3Up.A08);
                A00.A7R("nav_source_module_class", c3Up.A07);
                A00.A7R("nav_dest_module", c3Up.A02);
                A00.A7R("nav_dest_module_class", c3Up.A01);
                A00.A7R("nav_dest_uri", c3Up.A03);
                String str5 = c3Up.A06;
                A00.A7R("nav_manual_logging_reason", str5);
                C3Og c3Og = r06.A02;
                24X A002 = c3Og.A00("tracking_nodes");
                ArrayList A0s = AnonymousClass001.A0s();
                if (A002 != null && A002.A0R()) {
                    Iterator it = A002.iterator();
                    while (it.hasNext()) {
                        24X r07 = (24X) it.next();
                        1BL.A1E(r07);
                        3Ef A003 = C3TP.A00(r07);
                        24X A0D = r07.A0D("index");
                        Integer valueOf = A0D != null ? Integer.valueOf(A0D.A03()) : null;
                        if (A003 != null) {
                            A0s.add(new 3KA(A003, valueOf));
                        }
                    }
                }
                A00.A7h("al_tracking_nodes", C3RS.A01(A0s));
                A00.A7h("al_trackings", r06.A00);
                A00.A5H("al_is_ad", Boolean.valueOf(r06.A01));
                String A032 = c3Og.A03("event_trace_id");
                if (A032 == null) {
                    A032 = str4;
                }
                A00.A7R("al_event_trace_id", A032);
                A00.A5c(r322, "gesture_type");
                A00.A5Z("gesture_to_nav_time_span", Double.valueOf(d));
                A00.A5Z("gesture_coordinate_x", Double.valueOf(f));
                A00.A5Z("gesture_coordinate_y", Double.valueOf(f2));
                A00.A7R("nav_manual_logging_reason", str5);
                if (r05 != null && (str2 = r05.A02) != null) {
                    A00.A7R("gesture_click_handler", str2);
                }
                if (!r04.A04) {
                    A00.A7R("nav_chain", (String) r04.A03.get());
                }
                A00.A7R("canonical_nav_chain", C2vv.A00);
                A00.BZL();
            }
            c3rh.A04 = null;
            c3rh.A03 = null;
        }
    }

    public void A01(3LO r302) {
        Handler handler;
        SA5 saa;
        if (this.A07.A00.A05) {
            ROn rOn = this.A08;
            handler = rOn.A02;
            saa = new SA5(r302, rOn);
        } else {
            handler = this.A06;
            saa = new SAA(r302, this);
        }
        handler.post(saa);
    }

    public void A02(C3Up c3Up) {
        Handler handler;
        SA6 sa7;
        if (this.A07.A00.A05) {
            ROn rOn = this.A08;
            String str = c3Up.A04;
            if (str != null && ("navigation".equals(str) || "navigation_v2".equals(str))) {
                handler = rOn.A02;
                sa7 = new SA6(rOn, c3Up);
            }
            ((1vU) 1Br.A0B(this.A09.A05)).A01(new SA8(this, c3Up));
        }
        handler = this.A06;
        sa7 = new SA7(this, c3Up);
        handler.post(sa7);
        ((1vU) 1Br.A0B(this.A09.A05)).A01(new SA8(this, c3Up));
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x045c, code lost:
    
        if (r318 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0210, code lost:
    
        r326 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v713, types: [X.0ty] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A03(android.view.MotionEvent r302, X.3Ee r303, long r304, boolean r306) {
        /*
            Method dump skipped, instructions count: 3329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3RH.A03(android.view.MotionEvent, X.3Ee, long, boolean):boolean");
    }
}
