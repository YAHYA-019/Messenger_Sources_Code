package com.facebook.messaging.avatar.avatardetail.plugins.threadsettings.avatardetailbutton;

import X.0Du;
import X.0Xs;
import X.1BL;
import X.1BY;
import X.1Lo;
import X.5Ww;
import X.C8R;
import X.COp;
import X.QAP;
import android.content.Context;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.avatar.avatardetail.repository.AvatarDetailConfigRepository;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: AvatarDetailButton.class */
public final class AvatarDetailButton {
    public final Context A00;
    public final ThreadKey A01;
    public final User A02;
    public final FbUserSession A03;

    public AvatarDetailButton(Context context, FbUserSession fbUserSession, ThreadKey threadKey, User user) {
        1BL.A1H(context, fbUserSession, threadKey);
        this.A00 = context;
        this.A03 = fbUserSession;
        this.A01 = threadKey;
        this.A02 = user;
    }

    public static final Uri A00(Context context, FbUserSession fbUserSession, String str) {
        Uri uri = null;
        if (str != null) {
            ConcurrentHashMap concurrentHashMap = ((AvatarDetailConfigRepository) 1Lo.A04(context, fbUserSession, (1BY) null, 68715)).A04;
            Object obj = concurrentHashMap.get(str);
            if (obj == null) {
                obj = 0Du.A00((Object) null);
                Object putIfAbsent = concurrentHashMap.putIfAbsent(str, obj);
                if (putIfAbsent != null) {
                    obj = putIfAbsent;
                }
            }
            QAP qap = (QAP) ((0Xs) obj).getValue();
            if (qap != null) {
                uri = qap.A00;
            }
        }
        return uri;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.COp, java.lang.Object] */
    public final C8R A01() {
        ?? obj = new Object();
        COp.A02((COp) obj, this, 32);
        COp.A01(5Ww.A00().migButtonIconName, (COp) obj);
        ((COp) obj).A01 = 2131953089;
        ((COp) obj).A00 = 2131953089;
        Context context = this.A00;
        FbUserSession fbUserSession = this.A03;
        User user = this.A02;
        ((COp) obj).A02 = A00(context, fbUserSession, user != null ? user.A13 : null);
        return new C8R((COp) obj);
    }
}
