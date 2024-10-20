package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: Hr3.class */
public final class Hr3 {
    public final /* synthetic */ IEE A00;

    public Hr3(IEE iee) {
        this.A00 = iee;
    }

    public void A00(long j, HashMap hashMap) {
        IEE iee = this.A00;
        if (hashMap.isEmpty()) {
            return;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        Iterator A0x = AnonymousClass001.A0x(hashMap);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            A0k.append(Qyz.A00(AnonymousClass001.A03(A0z.getKey())));
            A0k.append("(");
            A0k.append(A0z.getValue());
            A0k.append(");");
        }
        Gty gty = new Gty("Failures during input capture");
        gty.A03("input_capture_error_codes", A0k.toString());
        gty.A03("input_capture_total_frames", String.valueOf(j));
        JQ9 jq9 = iee.A0K;
        long A0B = GOn.A0B(iee);
        java.util.Map map = ((HDP) gty).mExtras;
        jq9.BZa(gty, "audio_pipeline_error", "AudioPipelineController", "debug", "InputCaptureErrors", map != null ? AnonymousClass001.A0b("fba_error_code", map) : null, A0B);
    }

    public void A01(I8p i8p, boolean z) {
        IEE iee = this.A00;
        HashMap A1E = GOn.A1E(6);
        if (i8p.A06 > 30) {
            A1E.put("render_audio_avg_processing_time_ms", String.valueOf(i8p.A02()));
            long j = i8p.A01;
            if (j > -1) {
                A1E.put("render_audio_num_deadline_missed", String.valueOf(j));
            }
            A1E.put("render_audio_was_recording", String.valueOf(i8p.A0A));
            I8p.A01(i8p, A1E, ((float) i8p.A0C) / 1000000.0f);
            A1E.put("render_audio_samples_per_frame", String.valueOf(i8p.A0B));
            A1E.put("render_fba_profile_info", i8p.A08);
            iee.A0K.BZb(z ? "audio_pipeline_recording_started" : "audio_pipeline_effect_removed", "AudioPipelineController", A1E, GOn.A0B(iee));
        }
    }
}
