package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: I7i.class */
public final class I7i {
    public final HkU A00;
    public final Hrp A01;
    public final HoA A02;
    public final JH7 A03;
    public final QqC A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final java.util.Map A08;
    public final C11684xK A09;

    public I7i(HkU hkU, C11684xK c11684xK, Hrp hrp, HoA hoA, JH7 jh7, QqC qqC, String str, String str2, String str3, Collection collection) {
        this.A02 = hoA;
        this.A01 = hrp;
        this.A07 = str;
        this.A00 = hkU;
        this.A06 = str2;
        this.A09 = c11684xK;
        this.A03 = jh7;
        this.A04 = qqC;
        HashMap A0u = AnonymousClass001.A0u();
        this.A08 = A0u;
        if (collection != null && !collection.isEmpty()) {
            String A00 = C4Bn.A00(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, collection);
            11T.A0A(A00);
            A0u.put("media_features", A00);
        }
        this.A05 = str3;
    }

    public static final void A00(GjE gjE, I96 i96, I7i i7i, String str) {
        A01(gjE, i7i, 0S2.A0u, str);
        try {
            HkU hkU = i7i.A00;
            HashMap hashMap = new HashMap(hkU.A0D);
            hashMap.put("X-MediaAccuracy-TimestampUs", String.valueOf(gjE.A00));
            String str2 = gjE.A04;
            if (!11T.A0O(str2, ConstantsKt.CAMERA_ID_FRONT)) {
                hashMap.put("X-Player-Session-Id", str2);
            }
            hashMap.put("X-Media-Id", str);
            java.util.Map map = i7i.A08;
            Object obj = map.get("media_features");
            if (obj != null) {
                hashMap.put("X-Media-Features", obj);
            }
            hashMap.put("X-Source-Type", i7i.A05);
            String A00 = HLf.A00(gjE.A01);
            hashMap.put("X-Snapshot-Type", A00);
            hashMap.put("x-media-accuracy-tags", gjE.A05);
            map.put("snapshot_type", A00);
            hashMap.remove("devserver-forward-host");
            hashMap.remove("enable-video-processing-forwarding");
            hashMap.remove("xpv_override");
            hashMap.remove("usc_encoding_override");
            hashMap.remove("X-Instagram-Rupload-Params");
            hashMap.putAll(RiE.A01(i7i.A03, i7i.A04, i7i.A07));
            ICY icy = new ICY(hkU);
            icy.A02 = EPR.A0l;
            icy.A0C = hashMap;
            HkU hkU2 = new HkU(icy);
            IE4 ie4 = new IE4(AnonymousClass001.A0E(gjE.A02), gjE.A03);
            0fH.A0d(gjE, map, "MediaAccuracySnapshotUploader", "Sending media accuracy request %s (%s)");
            i7i.A09.A01(hkU2, ie4, new ISa(gjE, i96, i7i, str));
        } catch (Throwable th) {
            0fH.A0p("MediaAccuracySnapshotUploader", "Failed to start media accuracy upload", th);
            i96.A03(gjE.A02);
            i7i.A01.A00(gjE, 0S2.A1G, str, "Upload trigger failure", th, i7i.A08);
        }
    }

    public static final void A01(GjE gjE, I7i i7i, Integer num, String str) {
        i7i.A01.A00(gjE, num, str, null, null, i7i.A08);
    }
}
