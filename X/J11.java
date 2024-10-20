package X;

import android.media.AudioRecordingConfiguration;
import java.util.List;

/* loaded from: J11.class */
public final class J11 implements Runnable {
    public static final String __redex_internal_original_name = "AudioRecordMonitor$logRecordingConfigsAsync$1";
    public final /* synthetic */ IA9 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;

    public J11(IA9 ia9, String str, List list) {
        this.A00 = ia9;
        this.A01 = str;
        this.A02 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IA9 ia9 = this.A00;
        String str = this.A01;
        List<AudioRecordingConfiguration> list = this.A02;
        if (list == null) {
            list = ia9.A02.getActiveRecordingConfigurations();
            11T.A0A(list);
        }
        IA9.A01(ia9, str, list);
    }
}
