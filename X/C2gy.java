package X;

import com.facebook.common.util.JSONUtil;
import com.facebook.messaging.inbox.units.StaticUnitConfig;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.presence.api.model.RichStatus;
import com.google.common.collect.ImmutableMap;
import java.util.List;

/* renamed from: X.2gy, reason: invalid class name */
/* loaded from: 2gy.class */
public final class C2gy extends 2UP {
    public final C2xf A00;
    public final MontageBucketPreview A01;

    public C2gy(C2xf c2xf, StaticUnitConfig staticUnitConfig, MontageBucketPreview montageBucketPreview) {
        super((C2gu) null, staticUnitConfig);
        this.A00 = c2xf;
        this.A01 = montageBucketPreview;
    }

    public void A02(2hL r302) {
        RichStatus richStatus;
        super.A02(r302);
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        C2xf c2xf = this.A00;
        Object obj = null;
        if (c2xf != null) {
            obj = c2xf.A01;
        }
        builder.put("item_type", (obj == null || this.A01 == null) ? (c2xf == null || c2xf.A01 == null) ? "25" : "39" : "38");
        if (c2xf != null && (richStatus = (RichStatus) c2xf.A01) != null) {
            List A00 = C4L3.A00(richStatus.A09, richStatus.A0G, !richStatus.A0H.isEmpty());
            2DM r0 = new 2DM(C26T.A00);
            r0.A0j("note_id", richStatus.A04);
            if (A00 != null && !A00.isEmpty()) {
                r0.A0e(JSONUtil.A08(A00), "note_content_types");
            }
            builder.put("note", r0.toString());
        }
        MontageBucketPreview montageBucketPreview = this.A01;
        if (montageBucketPreview != null) {
            builder.put("story_id", String.valueOf(montageBucketPreview.A04.A03));
        }
        ImmutableMap build = builder.build();
        11T.A0A(build);
        r302.A03 = build;
    }

    public 2hJ AsW() {
        return 2hJ.A12;
    }

    public String BKC() {
        return "STATUS_COMPOSE_ITEM";
    }

    public boolean BVb(2UR r302) {
        11T.A0F(r302, 0);
        if (!(r302 instanceof C2gy)) {
            return false;
        }
        MontageBucketPreview montageBucketPreview = this.A01;
        Long l = null;
        Long valueOf = montageBucketPreview != null ? Long.valueOf(montageBucketPreview.A04.A03) : null;
        MontageBucketPreview montageBucketPreview2 = ((C2gy) r302).A01;
        if (montageBucketPreview2 != null) {
            l = Long.valueOf(montageBucketPreview2.A04.A03);
        }
        return 11T.A0O(valueOf, l);
    }
}
