package com.facebook.contacts.graphql;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: ContactPhoneSerializer.class */
public class ContactPhoneSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), ContactPhone.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        ContactPhone contactPhone = (ContactPhone) obj;
        if (contactPhone == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_ID, contactPhone.mId);
        AbstractC11224vw.A0D(r302, "label", contactPhone.mLabel);
        AbstractC11224vw.A0D(r302, "displayNumber", contactPhone.mDisplayNumber);
        AbstractC11224vw.A0D(r302, "universalNumber", contactPhone.mUniversalNumber);
        boolean z = contactPhone.mIsVerified;
        r302.A0o("isVerified");
        r302.A0v(z);
        r302.A0Y();
    }
}
