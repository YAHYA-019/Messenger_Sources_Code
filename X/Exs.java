package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: Exs.class */
public final class Exs {
    public final Integer A00;

    public Exs(Integer num) {
        11T.A0F(num, 2);
        this.A00 = num;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Exs) && this.A00 == ((Exs) obj).A00);
    }

    public int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 0:
                str = "ONE_TO_ONE";
                break;
            case 1:
                str = "GROUP";
                break;
            default:
                str = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                break;
        }
        return (-1672287770) + 7zM.A04(str, intValue);
    }

    public String toString() {
        String str;
        switch (this.A00.intValue()) {
            case 0:
                str = "ONE_TO_ONE";
                break;
            case 1:
                str = "GROUP";
                break;
            default:
                str = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                break;
        }
        return 0Pz.A0w("MetaAIPromptSheetLoggingParams(entryPoint=", "COMPOSER_PLUS", ", threadType=", str, ')');
    }
}
