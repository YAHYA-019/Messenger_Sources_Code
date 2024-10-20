package com.facebook.pages.common.brandedcontent.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: PageUnitSerializer.class */
public class PageUnitSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), PageUnit.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        PageUnit pageUnit = (PageUnit) obj;
        if (pageUnit == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_ID, pageUnit.id);
        AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, pageUnit.name);
        AbstractC11224vw.A0D(r302, "object_type_name", pageUnit.objectTypeName);
        AbstractC11224vw.A0D(r302, "profile_pic_uri", pageUnit.profilePicUri);
        AbstractC11224vw.A0D(r302, "subject", pageUnit.subtext);
        AbstractC11224vw.A0D(r302, "category", pageUnit.category);
        boolean z = pageUnit.isVerified;
        r302.A0o("is_verified");
        r302.A0v(z);
        AbstractC11224vw.A0D(r302, "direct_share_status", pageUnit.directShareStatus);
        AbstractC11224vw.A0D(r302, "sponsor_relationship", pageUnit.sponsorRelationship);
        r302.A0Y();
    }
}
