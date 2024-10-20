package X;

import com.google.common.collect.ImmutableMap;
import java.util.List;

/* loaded from: J1s.class */
public final class J1s implements Runnable {
    public static final String __redex_internal_original_name = "LooperTrainingPigeonLogger$1";
    public final /* synthetic */ Hdd A00;
    public final /* synthetic */ HaB A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public J1s(Hdd hdd, HaB haB, String str, String str2) {
        this.A01 = haB;
        this.A00 = hdd;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        1UG A08 = 1BK.A08(this.A01.A00, "looper_mobile_labels_for_logging");
        if (A08.isSampled()) {
            Hdd hdd = this.A00;
            0DA r0 = new 0DA();
            r0.A06("timestamp", Long.valueOf(hdd.A00));
            r0.A04("weight", Double.valueOf(1.0d));
            ImmutableMap immutableMap = hdd.A01;
            java.util.Map map = r0.A00;
            map.put("bool_data", immutableMap);
            map.put("float_data", null);
            map.put("int_data", null);
            map.put("string_data", null);
            r0.A06("priority", hdd.A02);
            r0.A08("cancel_fields", (List) null);
            A08.A7R("loop_name", this.A02);
            A08.A7R("prediction_id", this.A03);
            A08.A7T(r0, "data");
            A08.A7R(7zK.A00(100), (String) null);
            A08.BZL();
        }
    }
}
