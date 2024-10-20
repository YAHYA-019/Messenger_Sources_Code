package X;

import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.Arz, reason: case insensitive filesystem */
/* loaded from: Arz.class */
public final class C1765Arz extends C04v {
    public final ThreadSummary A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Long A04;
    public final String A05;
    public final String A06;

    public C1765Arz(ThreadSummary threadSummary, Integer num, Integer num2, Integer num3, Long l, String str, String str2) {
        this.A05 = str;
        this.A04 = l;
        this.A00 = threadSummary;
        this.A06 = str2;
        this.A03 = num;
        this.A01 = num2;
        this.A02 = num3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1765Arz)) {
                return false;
            }
            C1765Arz c1765Arz = (C1765Arz) obj;
            if (!11T.A0O(this.A05, c1765Arz.A05) || !11T.A0O(this.A04, c1765Arz.A04) || !11T.A0O(this.A00, c1765Arz.A00) || !11T.A0O(this.A06, c1765Arz.A06) || this.A03 != c1765Arz.A03 || !11T.A0O(this.A01, c1765Arz.A01) || this.A02 != c1765Arz.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str;
        int hashCode;
        int A05 = ((((((1BL.A05(this.A05) * 31) + AnonymousClass001.A02(this.A04)) * 31) + AnonymousClass001.A02(this.A00)) * 31) + 1BL.A05(this.A06)) * 31;
        int intValue = this.A03.intValue();
        switch (intValue) {
            case 1:
                str = "MESSAGE_LIST";
                break;
            case 2:
                str = "THREAD_DEEPLINKING";
                break;
            case 3:
                str = "NO_RESULTS";
                break;
            case 4:
                str = "INTEGRATED_MESSAGE_SEARCH";
                break;
            case 5:
                str = "SEARCH_IN_CONVERSATION";
                break;
            default:
                str = "THREAD_LIST";
                break;
        }
        int A07 = (7zR.A07(str, intValue, A05) + AnonymousClass001.A02(this.A01)) * 31;
        Integer num = this.A02;
        if (num == null) {
            hashCode = 0;
        } else {
            int intValue2 = num.intValue();
            hashCode = (1 != intValue2 ? "PREV" : "NEXT").hashCode() + intValue2;
        }
        return (A07 + hashCode) * 31;
    }
}
