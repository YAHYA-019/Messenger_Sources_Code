package X;

import java.util.List;

/* loaded from: It3.class */
public final class It3 implements Runnable {
    public static final String __redex_internal_original_name = "AudioRecordMonitor$runnable$1";
    public final /* synthetic */ IA9 A00;

    public It3(IA9 ia9) {
        this.A00 = ia9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IA9.A02(this.A00, "recording_configs_5s_in_call", (List) null);
    }
}
