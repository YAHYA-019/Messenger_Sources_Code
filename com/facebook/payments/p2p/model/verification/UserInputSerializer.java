package com.facebook.payments.p2p.model.verification;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: UserInputSerializer.class */
public class UserInputSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), UserInput.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        UserInput userInput = (UserInput) obj;
        if (userInput == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "first_name", userInput.mFirstName);
        AbstractC11224vw.A0D(r302, "last_name", userInput.mLastName);
        AbstractC11224vw.A0D(r302, "card_first_six", userInput.mCardFirstSix);
        AbstractC11224vw.A0D(r302, "dob_year", userInput.mDobYear);
        AbstractC11224vw.A0D(r302, "dob_month", userInput.mDobMonth);
        AbstractC11224vw.A0D(r302, "dob_day", userInput.mDobDay);
        AbstractC11224vw.A0D(r302, "ssn_last_four", userInput.mSsnLastFour);
        r302.A0Y();
    }
}
