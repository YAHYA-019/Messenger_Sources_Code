package com.facebook.ipc.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: FacebookUserCoverPhotoSerializer.class */
public class FacebookUserCoverPhotoSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), FacebookUserCoverPhoto.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        FacebookUserCoverPhoto facebookUserCoverPhoto = (FacebookUserCoverPhoto) obj;
        if (facebookUserCoverPhoto == null) {
            r302.A0Z();
        }
        r302.A0b();
        long j = facebookUserCoverPhoto.coverID;
        r302.A0o("cover_id");
        r302.A0g(j);
        AbstractC11224vw.A0D(r302, Property.SYMBOL_Z_ORDER_SOURCE, facebookUserCoverPhoto.source);
        float f = facebookUserCoverPhoto.offsetX;
        r302.A0o("offset_x");
        r302.A0e(f);
        float f2 = facebookUserCoverPhoto.offsetY;
        r302.A0o("offset_y");
        r302.A0e(f2);
        r302.A0Y();
    }
}
