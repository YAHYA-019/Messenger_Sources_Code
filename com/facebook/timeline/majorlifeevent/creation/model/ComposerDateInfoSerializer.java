package com.facebook.timeline.majorlifeevent.creation.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: ComposerDateInfoSerializer.class */
public class ComposerDateInfoSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), ComposerDateInfo.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        ComposerDateInfo composerDateInfo = (ComposerDateInfo) obj;
        if (composerDateInfo == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A05(r302, c26c, composerDateInfo.startDate, "start_date");
        boolean z = composerDateInfo.isCurrent;
        r302.A0o("is_current");
        r302.A0v(z);
        r302.A0Y();
    }
}
