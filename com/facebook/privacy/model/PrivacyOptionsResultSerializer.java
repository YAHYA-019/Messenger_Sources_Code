package com.facebook.privacy.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: PrivacyOptionsResultSerializer.class */
public class PrivacyOptionsResultSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), PrivacyOptionsResult.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        PrivacyOptionsResult privacyOptionsResult = (PrivacyOptionsResult) obj;
        if (privacyOptionsResult == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A06(r302, c26c, "basic_privacy_options", privacyOptionsResult.basicPrivacyOptions);
        AbstractC11224vw.A06(r302, c26c, "friend_list_privacy_options", privacyOptionsResult.friendListPrivacyOptions);
        AbstractC11224vw.A06(r302, c26c, "primary_option_indices", privacyOptionsResult.primaryOptionIndices);
        AbstractC11224vw.A06(r302, c26c, "expandable_privacy_option_indices", privacyOptionsResult.expandablePrivacyOptionIndices);
        int i = privacyOptionsResult.selectedPrivacyOptionIndex;
        r302.A0o("selected_privacy_option_index");
        r302.A0f(i);
        AbstractC11224vw.A05(r302, c26c, privacyOptionsResult.selectedPrivacyOption, "selected_privacy_option");
        AbstractC11224vw.A05(r302, c26c, privacyOptionsResult.defaultPrivacyInfo, "default_privacy_info");
        AbstractC11224vw.A06(r302, c26c, "audience_picker_description_override", privacyOptionsResult.audiencePickerDescriptionFromServer);
        AbstractC11224vw.A0D(r302, "privacy_write_id", privacyOptionsResult.privacyWriteId);
        int i2 = privacyOptionsResult.recentPrivacyOptionIndex;
        r302.A0o("recent_privacy_option_index");
        r302.A0f(i2);
        AbstractC11224vw.A05(r302, c26c, privacyOptionsResult.recentPrivacyOption, "recent_privacy_option");
        boolean z = privacyOptionsResult.isSelectedOptionExternal;
        r302.A0o("is_selected_option_external");
        r302.A0v(z);
        boolean z2 = privacyOptionsResult.isResultFromServer;
        r302.A0o("is_result_from_server");
        r302.A0v(z2);
        r302.A0Y();
    }
}
