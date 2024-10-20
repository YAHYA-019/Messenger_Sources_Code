package X;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.161, reason: invalid class name */
/* loaded from: 161.class */
public final class AnonymousClass161 {
    public static final Executor A04 = Executors.newSingleThreadExecutor();
    public final Handler A00;
    public final C15u A01;
    public final AnonymousClass162 A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);

    public AnonymousClass161(Context context, C16f c16f) {
        09O A00 = 09O.A00(context);
        this.A01 = new C15u(new C15v(c16f), "725056107548211|0e20c3123a90c76c02c901b7415ff67f", new 09S(context, A00, "MQTT", (String) null, (java.util.Map) null).A01());
        this.A00 = new 0uL(context.getMainLooper(), this, 2);
        this.A02 = new AnonymousClass162(A00.A01, A00.A00);
    }

    public void A00(final C15r c15r) {
        A04.execute(new Runnable(c15r, this) { // from class: X.15z
            public static final String __redex_internal_original_name = "CounterAnalytics$StoreEventTask";
            public C15r A00;
            public final /* synthetic */ AnonymousClass161 A01;

            {
                this.A01 = this;
                this.A00 = c15r;
            }

            @Override // java.lang.Runnable
            public void run() {
                final AnonymousClass161 anonymousClass161 = this.A01;
                Executor executor = AnonymousClass161.A04;
                AnonymousClass162 anonymousClass162 = anonymousClass161.A02;
                C15r c15r2 = this.A00;
                if (anonymousClass162.A00 == ((-1) >>> 1)) {
                    0fH.A0n("CounterSession", "Reached max counterEvents probably due to upload failure, clearing old events");
                    anonymousClass162.A04.clear();
                    anonymousClass162.A00 = 0;
                }
                String A0z = 0Pz.A0z("fbns_counters", "_", C15r.A00(c15r2), "_", c15r2.A02);
                java.util.Map map = anonymousClass162.A04;
                if (map.containsKey(A0z)) {
                    C15q c15q = ((C15r) map.get(A0z)).A00;
                    C15q c15q2 = c15r2.A00;
                    c15q.A00 += c15q2.A00;
                    c15q.A02 += c15q2.A02;
                    c15q.A01 = Math.max(c15q.A01, c15q2.A01);
                } else {
                    map.put(A0z, c15r2);
                }
                int i = anonymousClass162.A00 + 1;
                anonymousClass162.A00 = i;
                if (i >= 50) {
                    AnonymousClass161.A04.execute(new Runnable() { // from class: X.160
                        public static final String __redex_internal_original_name = "CounterAnalytics$UploadEventsTask";

                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass161 anonymousClass1612 = AnonymousClass161.this;
                            Executor executor2 = AnonymousClass161.A04;
                            AnonymousClass162 anonymousClass1622 = anonymousClass1612.A02;
                            java.util.Map map2 = anonymousClass1622.A04;
                            String str = "";
                            if (!map2.isEmpty()) {
                                JSONObject A12 = AnonymousClass001.A12();
                                try {
                                    long j = anonymousClass1622.A01;
                                    anonymousClass1622.A01 = 1 + j;
                                    A12.put("seq", j);
                                    A12.put("time", C15p.A00(System.currentTimeMillis()));
                                    JSONArray jSONArray = new JSONArray();
                                    Iterator it = map2.values().iterator();
                                    while (it.hasNext()) {
                                        jSONArray.put(((C15r) it.next()).A01());
                                    }
                                    A12.put("data", jSONArray);
                                    A12.put("log_type", "client_event");
                                    A12.put("app_id", "567310203415052");
                                    A12.put("app_ver", anonymousClass1622.A02);
                                    A12.put("build_num", anonymousClass1622.A03);
                                    A12.put("session_id", anonymousClass1622.A05);
                                    str = A12.toString();
                                } catch (JSONException e) {
                                    0fH.A0v("CounterSession", "Failed to serialize", e);
                                }
                            }
                            if (TextUtils.isEmpty(str)) {
                                return;
                            }
                            try {
                                int A00 = anonymousClass1612.A01.A00(str);
                                if (A00 != 200) {
                                    0fH.A14("CounterAnalytics", "Unsuccessful upload. response code=%d", new Object[]{Integer.valueOf(A00)});
                                    return;
                                }
                                0fH.A0m("CounterAnalytics", "Successful upload.");
                                map2.clear();
                                anonymousClass1622.A00 = 0;
                            } catch (Exception e2) {
                                0fH.A0u("CounterAnalytics", "Unsuccessful upload.", e2);
                            }
                        }
                    });
                    return;
                }
                AtomicBoolean atomicBoolean = anonymousClass161.A03;
                if (!atomicBoolean.compareAndSet(false, true) || anonymousClass161.A00.sendEmptyMessageDelayed(1, 300000L)) {
                    return;
                }
                atomicBoolean.set(false);
            }
        });
    }
}
