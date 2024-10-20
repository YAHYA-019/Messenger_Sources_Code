package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.secure.secrettypes.SecretString;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableList;

/* loaded from: C7H.class */
public final class C7H {
    public 1BY A00;
    public final C00i A01 = 1BQ.A02(32771);

    public C7H(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public ImmutableList A00(FbUserSession fbUserSession, ThreadSummary threadSummary) {
        String str;
        ImmutableList.Builder A0h = 4YU.A0h();
        ImmutableList.Builder A0h2 = 4YU.A0h();
        ImmutableList.Builder A0h3 = 4YU.A0h();
        1BY r0 = this.A00;
        AnonymousClass242 anonymousClass242 = (AnonymousClass242) 1Lo.A04((Context) null, fbUserSession, r0, 16907);
        1Du it = anonymousClass242.A0B(threadSummary).iterator();
        while (it.hasNext()) {
            ParticipantInfo participantInfo = (ParticipantInfo) it.next();
            if (!TextUtils.isEmpty(participantInfo.A00())) {
                String A0D = anonymousClass242.A0D(threadSummary, participantInfo.A0F.id);
                if (Platform.stringIsNullOrEmpty(A0D)) {
                    A0D = ((C28m) 1Lo.A04((Context) null, fbUserSession, r0, 16908)).A01(participantInfo);
                    if (Platform.stringIsNullOrEmpty(A0D)) {
                        A0D = participantInfo.A08.A00;
                    }
                }
                if (!TextUtils.isEmpty(A0D)) {
                    A0h.m11011add((Object) participantInfo.A00());
                    A0h2.m11011add((Object) A0D);
                    SecretString secretString = participantInfo.A0B;
                    if (secretString != null && (str = secretString.A00) != null) {
                        A0h3.m11011add((Object) str);
                    }
                }
            }
        }
        return ImmutableList.of((Object) A0h.build(), (Object) A0h2.build(), (Object) A0h3.build());
    }

    public String A01(Message message) {
        5PR r0 = message.A0B;
        if (r0 != null && r0 != 5PR.A06) {
            switch (r0.ordinal()) {
                case 0:
                    return "text";
                case 1:
                    return "image";
                case 2:
                    return "video";
                case 3:
                case 8:
                    return "audio";
                case 4:
                    return "sticker";
                case 5:
                case 6:
                default:
                    return "unknown";
                case 7:
                    return "gif";
                case 9:
                    return "location";
                case 10:
                    return "link";
            }
        }
        ImmutableList immutableList = C1q7.A07;
        if (message.A1m != null || C1q7.A0n(message)) {
            return "sticker";
        }
        if (C1q7.A0Z(message)) {
            return "location";
        }
        if (C1q7.A0C(message)) {
            return "link";
        }
        ImmutableList immutableList2 = message.A0r;
        if (immutableList2 == null || immutableList2.isEmpty()) {
            return "text";
        }
        Attachment attachment = (Attachment) 1BK.A0r(immutableList2);
        C00i c00i = this.A01;
        c00i.get();
        if (C00673oa.A01(attachment)) {
            return "audio";
        }
        c00i.get();
        String str = attachment.A0L;
        if (str != null && str.startsWith("video/")) {
            return "video";
        }
        c00i.get();
        if (C00673oa.A00(attachment)) {
            return "gif";
        }
        c00i.get();
        return C00673oa.A02(attachment) ? "image" : "unknown";
    }
}
