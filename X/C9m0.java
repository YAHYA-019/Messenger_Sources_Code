package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.attachments.ImageAttachmentData;
import com.facebook.messaging.attachments.VideoAttachmentData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;

/* renamed from: X.9m0, reason: invalid class name */
/* loaded from: 9m0.class */
public final class C9m0 {
    public final 1Br A00 = 1BK.A0D();

    public static int A00(C07n c07n, 1UG r302, AnonymousClass622 anonymousClass622, Object obj, Object obj2) {
        r302.A5c(c07n, "event_name");
        r302.A7R("message_id", String.valueOf(obj));
        String str = null;
        if (anonymousClass622.A01() && anonymousClass622.A03.A08 == null) {
            VideoAttachmentData videoAttachmentData = anonymousClass622.A02;
            if (videoAttachmentData != null) {
                str = videoAttachmentData.A0K;
            } else if (anonymousClass622.A03()) {
                List list = anonymousClass622.A0Q;
                11T.A09(list);
                ImageAttachmentData imageAttachmentData = (ImageAttachmentData) 0QD.A0E(list);
                if (imageAttachmentData != null) {
                    str = imageAttachmentData.A0C;
                }
            }
        }
        r302.A7R(4YT.A00(108), String.valueOf(str));
        r302.A0A("is_forward");
        r302.A7R("thread_id", String.valueOf(obj2));
        return A02(anonymousClass622);
    }

    public static final int A01(AnonymousClass622 anonymousClass622) {
        int i = 8;
        if (anonymousClass622.A01()) {
            if (anonymousClass622.A02 != null) {
                i = 19;
            } else {
                if (anonymousClass622.A03()) {
                    return 9;
                }
                if (anonymousClass622.A03.A08 != null) {
                    return 6;
                }
            }
        }
        return i;
    }

    public static final int A02(AnonymousClass622 anonymousClass622) {
        int i;
        ThreadKey threadKey = anonymousClass622.A03.A0V;
        if (threadKey == null) {
            i = (-1) << (-1);
        } else {
            i = 54;
            if (threadKey.A1A()) {
                return 40;
            }
            if (!threadKey.A1C() && threadKey.A1D()) {
                return 35;
            }
        }
        return i;
    }

    public final void A03(AnonymousClass622 anonymousClass622) {
        String str = anonymousClass622.A0L;
        1UG A08 = 1BK.A08(1Br.A02(this.A00), "mwb_cm_inform_treatment_event");
        if (A08.isSampled()) {
            A08.A5c(AnonymousClass989.VIEW_INFO_CLICK, "event_name");
            A08.A7R("message_id", String.valueOf(str));
            int A02 = A02(anonymousClass622);
            if (A02 != ((-1) << (-1))) {
                4YU.A1I(A08, "thread_subtype", A02);
            } else {
                A08.A7R("thread_subtype", (String) null);
            }
            A08.A0A("is_forward");
            A08.BZL();
        }
    }

    public final void A04(AnonymousClass622 anonymousClass622, String str, int i) {
        1UG A08 = 1BK.A08(1Br.A02(this.A00), "mwb_cm_inform_treatment_event");
        int A01 = A01(anonymousClass622);
        String str2 = anonymousClass622.A0L;
        Long A0h = 7zU.A0h(anonymousClass622.A03.A0V);
        if (A08.isSampled()) {
            int A00 = A00(AnonymousClass989.IMPRESSION, A08, anonymousClass622, str2, A0h);
            if (A00 != ((-1) << (-1))) {
                4YU.A1I(A08, "thread_subtype", A00);
            } else {
                A08.A7R("thread_subtype", (String) null);
            }
            4YU.A1I(A08, "message_type", A01);
            0DA r0 = new 0DA();
            r0.A07(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, String.valueOf(str));
            r0.A07(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, String.valueOf(C9eh.A00(Integer.valueOf(i), str)));
            A08.A7T(r0, "inform_treatment");
            A08.BZL();
        }
    }
}
