package com.facebook.api.growth.contactimporter;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: PhonebookLookupResultContactSerializer.class */
public class PhonebookLookupResultContactSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), PhonebookLookupResultContact.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        PhonebookLookupResultContact phonebookLookupResultContact = (PhonebookLookupResultContact) obj;
        if (phonebookLookupResultContact == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, phonebookLookupResultContact.name);
        long j = phonebookLookupResultContact.recordId;
        r302.A0o("record_id");
        r302.A0g(j);
        AbstractC11224vw.A0D(r302, "email", phonebookLookupResultContact.email);
        AbstractC11224vw.A0D(r302, "cell", phonebookLookupResultContact.phone);
        long j2 = phonebookLookupResultContact.userId;
        r302.A0o(ErrorReportingConstants.USER_ID_KEY);
        r302.A0g(j2);
        boolean z = phonebookLookupResultContact.isFriend;
        r302.A0o("is_friend");
        r302.A0v(z);
        AbstractC11224vw.A0D(r302, "pic_square_with_logo", phonebookLookupResultContact.profilePic);
        long j3 = phonebookLookupResultContact.ordinal;
        r302.A0o("ordinal");
        r302.A0g(j3);
        AbstractC11224vw.A0D(r302, "native_name", phonebookLookupResultContact.nativeName);
        int i = phonebookLookupResultContact.mutualFriends;
        r302.A0o("mutual_friends");
        r302.A0f(i);
        r302.A0Y();
    }
}
