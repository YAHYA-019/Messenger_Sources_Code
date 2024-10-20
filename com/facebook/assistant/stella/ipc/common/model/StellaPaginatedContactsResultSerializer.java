package com.facebook.assistant.stella.ipc.common.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: StellaPaginatedContactsResultSerializer.class */
public class StellaPaginatedContactsResultSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), StellaPaginatedContactsResult.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        StellaPaginatedContactsResult stellaPaginatedContactsResult = (StellaPaginatedContactsResult) obj;
        if (stellaPaginatedContactsResult == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A05(r302, c26c, stellaPaginatedContactsResult.contacts, "contacts");
        int i = stellaPaginatedContactsResult.totalPages;
        r302.A0o("totalPages");
        r302.A0f(i);
        int i2 = stellaPaginatedContactsResult.pageNumber;
        r302.A0o("pageNumber");
        r302.A0f(i2);
        r302.A0Y();
    }
}
