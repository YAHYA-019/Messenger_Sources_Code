package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.82a, reason: invalid class name */
/* loaded from: 82a.class */
public final class C82a extends C04v implements 5PP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C82a() {
        this("Spotify", null);
        this.A00 = 0;
    }

    public C82a(C5vw c5vw, 6Pp r303, List list) {
        this.A00 = 2;
        11T.A0F(c5vw, 2);
        this.A03 = r303;
        this.A02 = c5vw;
        this.A01 = list;
    }

    public C82a(ThreadKey threadKey, ImmutableList immutableList, Integer num) {
        this.A00 = 1;
        this.A03 = num;
        this.A02 = threadKey;
        this.A01 = immutableList;
    }

    public C82a(CharSequence charSequence, Integer num) {
        this.A00 = 0;
        this.A02 = charSequence;
        this.A03 = null;
        this.A01 = num;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "RTC_VIDEO_CALL";
            case 2:
                return "RTC_MISSED_AUDIO_CALL";
            case 3:
                return "RTC_MISSED_VIDEO_CALL";
            case 4:
                return "RTC_GROUP_AUDIO_CALL";
            case 5:
                return "RTC_GROUP_VIDEO_CALL";
            case 6:
                return "RTC_MISSED_GROUP_AUDIO_CALL";
            case 7:
                return "RTC_MISSED_GROUP_VIDEO_CALL";
            default:
                return "RTC_AUDIO_CALL";
        }
    }

    public boolean equals(Object obj) {
        C82a c82a;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C82a)) {
                    return false;
                }
                C82a c82a2 = (C82a) obj;
                return c82a2.A00 == 0 && 11T.A0O(this.A02, c82a2.A02) && 11T.A0O(this.A03, c82a2.A03) && this.A01 == c82a2.A01;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C82a)) {
                    return false;
                }
                c82a = (C82a) obj;
                if (c82a.A00 != 1 || this.A03 != c82a.A03) {
                    return false;
                }
                break;
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C82a)) {
                    return false;
                }
                c82a = (C82a) obj;
                if (c82a.A00 != 2 || !11T.A0O(this.A03, c82a.A03)) {
                    return false;
                }
                break;
        }
        return 11T.A0O(this.A02, c82a.A02) && 11T.A0O(this.A01, c82a.A01);
    }

    public int hashCode() {
        int i;
        int hashCode;
        switch (this.A00) {
            case 0:
                int hashCode2 = this.A02.hashCode() * 31;
                Object obj = this.A03;
                i = 0;
                hashCode = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
                Integer num = (Integer) this.A01;
                if (num != null) {
                    i = 7mL.A00(num);
                    break;
                }
                break;
            case 1:
                Integer num2 = (Integer) this.A03;
                i = (((A00(num2).hashCode() + num2.intValue()) * 31) + this.A02.hashCode()) * 31;
                hashCode = this.A01.hashCode();
                break;
            default:
                Object obj2 = this.A03;
                i = AnonymousClass002.A05(this.A02, (obj2 == null ? 0 : obj2.hashCode()) * 31);
                hashCode = this.A01.hashCode();
                break;
        }
        return hashCode + i;
    }

    public String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("XmaCallMetadata(xmaCallContentType=");
        Integer num = (Integer) this.A03;
        sb.append(num != null ? A00(num) : "null");
        sb.append(AbE.A00(16));
        sb.append(this.A02);
        sb.append(", participantIds=");
        return AnonymousClass002.A0K(this.A01, sb);
    }
}
