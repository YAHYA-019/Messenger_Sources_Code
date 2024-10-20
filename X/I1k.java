package X;

import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: I1k.class */
public final class I1k {
    public final C00i A01 = AbH.A0P();
    public java.util.Map A00 = DKD.A13();

    public static void A00(I1k i1k, java.util.Map map) {
        2Jy A0H = 4YU.A0H("messenger_parallel_transcode_upload");
        2Jy.A03(A0H, map, false);
        GYq.A00(1BK.A06(i1k.A01)).A03(A0H);
    }

    public void A01(IPx iPx) {
        java.util.Map map = this.A00;
        if (map != null) {
            MediaResource mediaResource = iPx.A01;
            map.put("media_source", mediaResource.A01());
            map.put("otd", mediaResource.A0u);
            if (1JF.A0B(iPx.A03)) {
                iPx.A03 = 1BK.A0t();
            }
            map.put("session_id", iPx.A03);
            map.put("stream _id", iPx.A04);
            List list = iPx.A05;
            if (ImmutableList.copyOf((Collection) list) != null && !ImmutableList.copyOf((Collection) list).isEmpty()) {
                map.put("segment_partition_status", ConstantsKt.CAMERA_ID_BACK);
                map.put("segment_count", Integer.toString(ImmutableList.copyOf((Collection) list).size()));
                StringBuilder A0k = AnonymousClass001.A0k();
                StringBuilder A0k2 = AnonymousClass001.A0k();
                for (int i = 0; i < ImmutableList.copyOf((Collection) list).size(); i++) {
                    if (((HFM) ImmutableList.copyOf((Collection) list).get(i)).A01 != null) {
                        if (A0k.length() != 0) {
                            A0k.append(", ");
                        }
                        A0k.append(Integer.toString(i));
                    }
                    if (((HFM) ImmutableList.copyOf((Collection) list).get(i)).A04) {
                        if (A0k2.length() != 0) {
                            A0k2.append(", ");
                        }
                        A0k2.append(Integer.toString(i));
                    }
                }
                map.put("segment_transcode_status", A0k.toString());
                map.put("segment_upload_status", A0k2.toString());
                if (iPx.A06) {
                    map.put("upload_success_ratio", ConstantsKt.CAMERA_ID_BACK);
                }
                if (iPx.A07) {
                    map.put("upload_cancelled_ratio", ConstantsKt.CAMERA_ID_BACK);
                }
            }
            map.put("duration", String.valueOf(mediaResource.A00()));
            long j = 0;
            synchronized (list) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    j += ((HFM) it.next()).A00;
                }
            }
            map.put("transcoded_file_size", String.valueOf(j));
            2Jy A0H = 4YU.A0H("messenger_segmented_transcode_upload");
            2Jy.A03(A0H, map, false);
            GYq.A00(1BK.A06(this.A01)).A03(A0H);
        }
    }
}
