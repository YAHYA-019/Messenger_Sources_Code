package X;

import com.facebook.smartcapture.logging.SmartCaptureQpl;

/* renamed from: X.9mF, reason: invalid class name */
/* loaded from: 9mF.class */
public abstract class C9mF {
    public static final 8LK A00(8Lm r301, String str, String str2, long j) {
        String str3;
        Integer num;
        11T.A0F(r301, 0);
        String A04 = A04((Integer) r301.A04);
        String A01 = A01((Integer) r301.A01);
        String A03 = A03((Integer) r301.A03);
        String A02 = A02((Integer) r301.A02);
        8Jh r0 = (8Jh) r301.A05;
        if (r0 != null && (num = r0.A02) != null) {
            switch (num.intValue()) {
                case 1:
                    str3 = "FLUSH_APPEND";
                    break;
                case 2:
                    str3 = "DURATION_BASED";
                    break;
                default:
                    str3 = "APPEND";
                    break;
            }
        } else {
            str3 = null;
        }
        return new 8LK(A04, A01, A03, A02, str3, ((C96k) r301.A06).name(), str, str2, j);
    }

    public static final String A01(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                return "unspecified";
            }
            if (intValue == 1) {
                return "anticipation";
            }
            if (intValue == 2) {
                return "care";
            }
            if (intValue == 3) {
                return "confused";
            }
            if (intValue == 4) {
                return "laugh";
            }
            if (intValue == 5) {
                return "like";
            }
            if (intValue == 6) {
                return "look_up";
            }
            if (intValue == 7) {
                return "lookat_keyboard";
            }
            if (intValue == 8) {
                return "love";
            }
            if (intValue == 9) {
                return "neutral";
            }
            if (intValue == 10) {
                return "pensive";
            }
            if (intValue == 11) {
                return "puffing";
            }
            if (intValue == 12) {
                return "raise_eyebrows";
            }
            if (intValue == 13) {
                return "sad";
            }
            if (intValue == 14) {
                return "subtle_smile";
            }
            if (intValue == 15) {
                return "surprise";
            }
            if (intValue == 16) {
                return "upset";
            }
            if (intValue == 17) {
                return "waiting";
            }
            if (intValue == 18) {
                return "waiting_nod";
            }
        }
        return AnonymousClass001.A0Z(num, "botAction_", AnonymousClass001.A0k());
    }

    public static final String A02(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                return "unspecified";
            }
            if (intValue == 1) {
                return "high";
            }
            if (intValue == 2) {
                return SmartCaptureQpl.ANNOTATION_KEY_MEDIUM;
            }
            if (intValue == 3) {
                return "weak";
            }
        }
        return AnonymousClass001.A0Z(num, "intensity_", AnonymousClass001.A0k());
    }

    public static final String A03(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                return "unspecified";
            }
            if (intValue == 1) {
                return "affirmative";
            }
            if (intValue == 2) {
                return "angry";
            }
            if (intValue == 3) {
                return "annoyed";
            }
            if (intValue == 4) {
                return "bored";
            }
            if (intValue == 5) {
                return "confused";
            }
            if (intValue == 6) {
                return "content";
            }
            if (intValue == 7) {
                return "disagreeing";
            }
            if (intValue == 8) {
                return "disbelief";
            }
            if (intValue == 9) {
                return "disgusted";
            }
            if (intValue == 10) {
                return "empathic";
            }
            if (intValue == 11) {
                return "enthusiastic";
            }
            if (intValue == 12) {
                return "expectant";
            }
            if (intValue == 13) {
                return "fearful";
            }
            if (intValue == 14) {
                return "funny";
            }
            if (intValue == 15) {
                return "happy";
            }
            if (intValue == 16) {
                return "humored";
            }
            if (intValue == 17) {
                return "impatient";
            }
            if (intValue == 18) {
                return "interested";
            }
            if (intValue == 19) {
                return "irony";
            }
            if (intValue == 20) {
                return "neutral";
            }
            if (intValue == 21) {
                return "polite";
            }
            if (intValue == 22) {
                return "sad";
            }
            if (intValue == 23) {
                return "surprised";
            }
            if (intValue == 24) {
                return "sympathetic";
            }
            if (intValue == 25) {
                return "thinking";
            }
            if (intValue == 26) {
                return "tired";
            }
            if (intValue == 27) {
                return "upset";
            }
            if (intValue == 28) {
                return "wondering";
            }
        }
        return AnonymousClass001.A0Z(num, "sentiment_", AnonymousClass001.A0k());
    }

    public static final String A04(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                return "unknown";
            }
            if (intValue == 1) {
                return "ambient";
            }
            if (intValue == 2) {
                return "engaged";
            }
            if (intValue == 3) {
                return "responding";
            }
            if (intValue == 4) {
                return "thinking";
            }
        }
        return AnonymousClass001.A0Z(num, "state_", AnonymousClass001.A0k());
    }
}
