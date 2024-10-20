package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* loaded from: Hrp.class */
public final class Hrp {
    public final JIC A00;
    public final String A01;

    public Hrp(JIC jic, String str) {
        this.A00 = jic;
        this.A01 = str;
    }

    public final void A00(GjE gjE, Integer num, String str, String str2, Throwable th, java.util.Map map) {
        Long l;
        String str3;
        LinkedHashMap A1C = 1BK.A1C();
        if (gjE != null) {
            if (map != null) {
                A1C.putAll(map);
            }
            A1C.put("snapshot_type", HLf.A00(gjE.A01));
            str3 = gjE.A04;
            l = Long.valueOf(gjE.A00);
        } else {
            l = null;
            str3 = null;
        }
        A01(num, null, l, str3, str, str2, th, null, A1C);
    }

    public final void A01(Integer num, Integer num2, Long l, String str, String str2, String str3, Throwable th, java.util.Map map, java.util.Map map2) {
        JSONObject jSONObject;
        String str4;
        String str5;
        JIC jic = this.A00;
        if (jic != null) {
            try {
                HashMap A0u = AnonymousClass001.A0u();
                A0u.put("waterfall_id", this.A01);
                if (str2 != null) {
                    A0u.put("uploaded_media_id", str2);
                }
                if (str != null) {
                    A0u.put("player_session_id", str);
                }
                if (map2 == null) {
                    jSONObject = AnonymousClass001.A12();
                } else {
                    new JSONObject(map2);
                }
                if (l != null) {
                    long longValue = l.longValue();
                    jSONObject.put(JQw.A00(348), String.valueOf(longValue));
                }
                if (num2 != null) {
                    jSONObject.put("snapshot_type", HLf.A00(num2));
                }
                if (jSONObject.length() > 0) {
                    A0u.put("snapshot_reference", 11T.A02(jSONObject));
                }
                if (th != null) {
                    String message = th.getMessage();
                    if (message != null) {
                        A0u.put("error_message", message);
                    }
                    String A00 = DKB.A00(377);
                    String stackTraceString = android.util.Log.getStackTraceString(th);
                    11T.A0A(stackTraceString);
                    A0u.put(A00, stackTraceString);
                }
                if (str3 != null) {
                    String A16 = 4YU.A16("error_message", A0u);
                    if (A16 != null) {
                        str3 = 0Pz.A0j(str3, ": ", A16);
                    }
                    A0u.put("error_message", str3);
                }
                if (map != null) {
                    A0u.put("error_params", 11T.A02(new JSONObject(map)));
                }
                int intValue = num.intValue();
                switch (intValue) {
                    case 0:
                        str4 = "media_accuracy_client_generic_error";
                        break;
                    case 1:
                        str4 = "media_accuracy_capturer_intermediate";
                        break;
                    case 2:
                        str4 = "media_accuracy_capturer_completed";
                        break;
                    case 3:
                        str4 = "media_accuracy_capturer_failed";
                        break;
                    case 4:
                        str4 = "media_accuracy_effects_burner_completed";
                        break;
                    case 5:
                        str4 = "media_accuracy_effects_burner_failed";
                        break;
                    case 6:
                        str4 = "media_accuracy_uploader_started";
                        break;
                    case 7:
                        str4 = "media_accuracy_uploader_completed";
                        break;
                    case 8:
                        str4 = "media_accuracy_uploader_failed";
                        break;
                    case 9:
                        str4 = "media_accuracy_uploader_cancelled";
                        break;
                    case 10:
                        str4 = "media_accuracy_uploader_skipped";
                        break;
                    case 11:
                        str4 = "media_accuracy_audio_recorder_started";
                        break;
                    case 12:
                        str4 = "media_accuracy_audio_recorder_completed";
                        break;
                    case 13:
                        str4 = "media_accuracy_audio_recorder_failed";
                        break;
                    default:
                        str4 = "media_accuracy_audio_file_created";
                        break;
                }
                jic.logEvent(str4, A0u);
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Sending event ");
                switch (intValue) {
                    case 0:
                        str5 = DKB.A00(71);
                        break;
                    case 1:
                        str5 = "SNAPSHOT_CAPTURE_INTERMEDIATE";
                        break;
                    case 2:
                        str5 = "SNAPSHOT_CAPTURE_COMPLETED";
                        break;
                    case 3:
                        str5 = "SNAPSHOT_CAPTURE_FAILED";
                        break;
                    case 4:
                        str5 = "EFFECTS_BURN_COMPLETED";
                        break;
                    case 5:
                        str5 = "EFFECTS_BURN_FAILED";
                        break;
                    case 6:
                        str5 = "UPLOAD_STARTED";
                        break;
                    case 7:
                        str5 = "UPLOAD_COMPLETED";
                        break;
                    case 8:
                        str5 = "UPLOAD_FAILED";
                        break;
                    case 9:
                        str5 = "UPLOAD_CANCELLED";
                        break;
                    case 10:
                        str5 = "UPLOAD_SKIPPED";
                        break;
                    case 11:
                        str5 = "AUDIO_RECORDER_STARTED";
                        break;
                    case 12:
                        str5 = "AUDIO_RECORDER_COMPLETED";
                        break;
                    case 13:
                        str5 = "AUDIO_RECORDER_FAILED";
                        break;
                    default:
                        str5 = "AUDIO_FILE_CREATED";
                        break;
                }
                A0k.append(str5);
                1BL.A1I(A0u, ": ", "MediaAccuracyLogger", A0k);
            } catch (Throwable th2) {
                0fH.A0p("MediaAccuracyLogger", "Failed to log an event", th2);
            }
        }
    }
}
