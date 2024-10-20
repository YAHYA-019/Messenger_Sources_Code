package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0v5, reason: invalid class name */
/* loaded from: 0v5.class */
public final class C0v5 extends 0XC {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public String A04;
    public String A05 = null;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String[] A0D;
    public String[] A0E;

    public C0v5() {
        long j = -1;
        this.A02 = j;
        this.A01 = j;
        this.A00 = j;
        this.A03 = j;
    }

    public void A00(JSONObject jSONObject) {
        super.A00(jSONObject);
        try {
            if (this.A08 != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : this.A08.split("\n")) {
                    jSONArray.put(str);
                }
                jSONObject.put("native_stack_trace", jSONArray);
            }
            if (this.A0A != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (String str2 : this.A0A.split("\n")) {
                    jSONArray2.put(str2);
                }
                jSONObject.put("render_thread_native_stack_trace", jSONArray2);
            }
            Object obj = this.A0B;
            if (obj != null) {
                jSONObject.put("render_thread_sched_stat", obj);
            }
            Object obj2 = this.A09;
            if (obj2 != null) {
                jSONObject.put("render_thread_cpu_usage", obj2);
            }
            Object obj3 = this.A07;
            if (obj3 != null) {
                jSONObject.put("litho_layout_thread_name", obj3);
            }
            if (this.A0D != null) {
                JSONArray jSONArray3 = new JSONArray();
                for (String str3 : this.A0D) {
                    jSONArray3.put(str3);
                }
                jSONObject.put("litho_layout_thread_stack", jSONArray3);
            }
            Object obj4 = this.A06;
            if (obj4 != null) {
                jSONObject.put("memory_red_java", obj4);
            }
            Object obj5 = this.A0C;
            if (obj5 != null) {
                jSONObject.put("memory_red_system", obj5);
            }
            Object obj6 = this.A04;
            if (obj6 != null) {
                jSONObject.put("memory_red_address_space", obj6);
            }
            long j = this.A02;
            long j2 = -1;
            if (j != j2) {
                jSONObject.put("swap_total", j);
            }
            long j3 = this.A01;
            if (j3 != j2) {
                jSONObject.put("swap_free", j3);
            }
            long j4 = this.A00;
            if (j4 != j2) {
                jSONObject.put("swap_cached", j4);
            }
            long j5 = this.A03;
            if (j5 != j2) {
                jSONObject.put("vm_swap", j5);
            }
            if (this.A0E != null) {
                JSONArray jSONArray4 = new JSONArray();
                for (String str4 : this.A0E) {
                    if (str4 != null) {
                        jSONArray4.put(str4);
                    }
                }
                jSONObject.put("memory_pressure", jSONArray4);
            }
            Object obj7 = this.A05;
            if (obj7 != null) {
                jSONObject.put(ErrorReportingConstants.ENDPOINT, obj7);
            }
        } catch (Throwable unused) {
        }
    }
}
