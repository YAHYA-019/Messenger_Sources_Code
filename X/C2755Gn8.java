package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.privacy.e2ee.genericimpl.store.DevicePkeKeypairStoreImplKt;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.base.Platform;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Gn8, reason: case insensitive filesystem */
/* loaded from: Gn8.class */
public final class C2755Gn8 extends Hsh {
    public List A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2755Gn8() {
        /*
            r301 = this;
            r0 = 32888(0x8078, float:4.6086E-41)
            java.lang.Object r0 = X.1Bi.A03(r0)
            com.facebook.common.connectionstatus.FbDataConnectionManager r0 = (com.facebook.common.connectionstatus.FbDataConnectionManager) r0
            r302 = r0
            X.01s r0 = X.4YV.A0G()
            r303 = r0
            r0 = 116139(0x1c5ab, float:1.62745E-40)
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.Hq4 r0 = (X.Hq4) r0
            r304 = r0
            android.content.Context r0 = com.facebook.inject.FbInjector.A00()
            r1 = 100178(0x18752, float:1.40379E-40)
            java.lang.Object r0 = X.1Hv.A02(r0, r1)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            r305 = r0
            android.content.Context r0 = com.facebook.inject.FbInjector.A00()
            r306 = r0
            r0 = 83426(0x145e2, float:1.16905E-40)
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.1Ex r0 = (X.1Ex) r0
            r307 = r0
            r0 = r301
            r1 = r306
            r2 = r305
            r3 = r307
            r4 = r302
            r5 = r303
            r6 = r304
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r308 = r0
            r0 = r301
            r1 = r308
            r0.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2755Gn8.<init>():void");
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [X.HpM, X.Gn6, java.lang.Object] */
    @Override // X.Hsh
    public void A01(JSONObject jSONObject) {
        synchronized (this) {
            List list = this.A00;
            list.clear();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String A0i = AnonymousClass001.A0i(keys);
                if (!A0i.equals(DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY)) {
                    try {
                        JSONObject jSONObject2 = (JSONObject) jSONObject.get(A0i);
                        ?? hpM = new HpM(A0i, jSONObject2);
                        hpM.A00 = new RMp((C2753Gn6) hpM);
                        if (jSONObject2.has("max_dim")) {
                            hpM.A00.A02 = jSONObject2.getInt("max_dim");
                        }
                        if (jSONObject2.has("bitrate_kpbs")) {
                            hpM.A00.A00 = jSONObject2.getInt("bitrate_kpbs");
                        }
                        if (jSONObject2.has("fps")) {
                            hpM.A00.A01 = jSONObject2.getInt("fps");
                        }
                        list.add(hpM);
                    } catch (Exception unused) {
                        this.A01.D0v("media_quality_adaptive_rule_parasing", A0i);
                    }
                }
            }
        }
    }

    public RMp A02(MediaResource mediaResource, HkO hkO) {
        boolean z;
        try {
            JSONObject A1F = DKC.A1F(this.A02.BCy(36873698693152935L).toLowerCase());
            String string = A1F.getString(DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY);
            if (string != null && !string.equals(super.A00)) {
                A01(A1F);
                super.A00 = string;
            }
            z = true;
        } catch (JSONException unused) {
            z = false;
        }
        if (!z) {
            return null;
        }
        HashMap A00 = super.A00();
        String A002 = 1BJ.A00(393);
        if (!Platform.stringIsNullOrEmpty(A002)) {
            A00.put("configuration", A002.toLowerCase());
        }
        A00.put("video_trimmed_duration_sec", String.valueOf(mediaResource.A00() / 1000));
        A00.put("video_duration_sec", String.valueOf(hkO.A0C));
        A00.put("video_width", String.valueOf(hkO.A0B));
        A00.put("video_height", String.valueOf(hkO.A09));
        A00.put("video_orientation", String.valueOf(hkO.A0A));
        A00.put("video_bitrate_kbps", String.valueOf(hkO.A08 / 1000));
        A00.put("video_file_size", String.valueOf(hkO.A0D));
        A00.put(4YT.A00(ActionId.APPLY_OPTIMISTICS), mediaResource.A0u);
        for (C2753Gn6 c2753Gn6 : this.A00) {
            if (c2753Gn6.A00(A00)) {
                if (((HpM) c2753Gn6).A04) {
                    return null;
                }
                return c2753Gn6.A00;
            }
        }
        return null;
    }
}
