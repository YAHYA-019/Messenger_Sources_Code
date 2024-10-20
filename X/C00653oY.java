package X;

import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.messages.GenericAdminMessageInfo;
import com.facebook.messaging.model.messages.Message;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.3oY, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3oY.class */
public final class C00653oY {
    public final C1q7 A03 = (C1q7) 1Bi.A03(16822);
    public final C00663oZ A00 = (C00663oZ) 1Bi.A03(32770);
    public final C00673oa A02 = (C00673oa) 1Bi.A03(32771);
    public final C00i A01 = new 1BQ(84456);

    public static C5ak A00(C00653oY c00653oY, Message message) {
        C5aj c5aj = C5aj.$redex_init_class;
        C1q8 A04 = message.A04();
        switch (A04.ordinal()) {
            case 1:
            case 28:
            case 29:
                if (message.A1m == null) {
                    ImmutableList immutableList = message.A0r;
                    if (immutableList.size() != 1 || ((Attachment) immutableList.get(0)).A04 != 48P.A0A) {
                        ImmutableList A03 = 5Q0.A03(message);
                        if (A03.size() != 1 || ((MediaResource) A03.get(0)).A0Q != 5HP.A0G) {
                            C00663oZ c00663oZ = c00653oY.A00;
                            return c00663oZ.A04(message) ? C5ak.PHOTOS : C00663oZ.A01(message) ? C5ak.VIDEO_CLIP : c00663oZ.A02(message) ? C5ak.AUDIO_CLIP : c00663oZ.A03(message) ? C5ak.PAYMENT : message.A07 != null ? C5ak.COMMERCE : C5ak.NORMAL;
                        }
                    }
                }
                return C5ak.STICKER;
            case 2:
            case 3:
                return C5ak.GROUP_MEMBERSHIP_CHANGE;
            case 4:
                return C5ak.GROUP_NAME_CHANGE;
            case 5:
            case 8:
                return C5ak.GROUP_IMAGE_CHANGE;
            case 6:
            case 7:
                return C5ak.VIDEO_CALL;
            case 9:
            case 11:
            case 12:
            case 13:
            case 17:
            case 18:
            case 19:
            case 22:
                return C5ak.ADMIN;
            case 10:
            case 23:
                return C5ak.CALL_LOG;
            case 14:
            case 15:
            case 16:
                return C5ak.VOIP_CALL;
            case 20:
            case 21:
                return C5ak.TELEPHONE_COMMUNICATION_LOG;
            case 24:
            case 26:
            case 27:
            default:
                0fH.A18("MessageClassifier", "Unexpected message type: %s", new Object[]{A04.name()});
                return C5ak.UNKNOWN;
            case 25:
                return C5ak.TYPING_INDICATOR;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0143, code lost:
    
        if (X.C00673oa.A02(r0) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x019b, code lost:
    
        if (r0.A03() != false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A01(com.facebook.messaging.model.messages.Message r302) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C00653oY.A01(com.facebook.messaging.model.messages.Message):java.lang.String");
    }

    public boolean A02(Message message) {
        C5ak A00 = A00(this, message);
        boolean z = true;
        if (A00 != C5ak.GROUP_MEMBERSHIP_CHANGE && A00 != C5ak.GROUP_NAME_CHANGE && A00 != C5ak.GROUP_IMAGE_CHANGE) {
            if (C1q7.A0R(message) || this.A03.A0v(message) || C1q7.A0F(message) || C1q7.A0b(message) || C1q7.A0c(message) || C1q7.A0d(message) || C1q7.A0a(message)) {
                return false;
            }
            if (message != null) {
                GenericAdminMessageInfo genericAdminMessageInfo = message.A0C;
                if (genericAdminMessageInfo != null && "MN_REF_SEND_TEXT".equals(genericAdminMessageInfo.A0I)) {
                    return false;
                }
                ImmutableMap immutableMap = message.A13;
                if (immutableMap.containsValue("chex:c2c") || immutableMap.containsValue("marketplace:care")) {
                    return false;
                }
            }
            if (A00 != C5ak.ADMIN) {
                z = false;
            }
        }
        return z;
    }
}
