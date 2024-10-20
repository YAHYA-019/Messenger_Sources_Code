package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import java.util.Set;

/* loaded from: Ina.class */
public final class Ina implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    public Ina(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        this.A00 = i;
        this.A01 = obj4;
        this.A06 = z;
        this.A04 = obj5;
        this.A05 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
    }

    public void onFailure(Throwable th) {
        if (this.A00 == 0) {
            C68t c68t = (C68t) this.A01;
            Set set = C68t.A0Q;
            C7N c7n = (C7N) c68t.A02.get();
            Message message = (Message) this.A04;
            c7n.A00(0S2.A00, message == null ? null : message.A1V, "fb_deep_link_handle_failed", false);
            return;
        }
        Object obj = this.A02;
        70W r0 = (70W) this.A05;
        if (obj == r0.A06) {
            AnonymousClass047 ACu = ((AnonymousClass046) 1Bn.A0A(16669)).ACu("Downloading audio failed!", 794503196);
            ACu.Cmr(th);
            ACu.A8K("remoteURI", this.A03.toString());
            ACu.report();
            r0.A07 = 0S2.A0C;
            JN5 jn5 = r0.A05;
            if (jn5 != null) {
                jn5.C1G();
            }
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (this.A00 != 0) {
            Uri uri = (Uri) obj;
            Object obj2 = this.A02;
            70W r0 = (70W) this.A05;
            if (obj2 == r0.A06) {
                70W.A02(uri, r0);
                if (this.A06) {
                    return;
                }
                r0.A04((FbUserSession) this.A01, (C5j5) this.A04);
                return;
            }
            return;
        }
        Boolean bool = (Boolean) obj;
        if (this.A06) {
            boolean booleanValue = bool.booleanValue();
            C68t c68t = (C68t) this.A01;
            Set set = C68t.A0Q;
            7Lt r02 = (7Lt) c68t.A0B.get();
            Message message = (Message) this.A04;
            Context context = (Context) this.A02;
            if (booleanValue) {
                r02.A0G(context, (Intent) this.A03, message);
            } else {
                r02.A0J(context, message);
            }
        }
        boolean booleanValue2 = bool.booleanValue();
        String str = booleanValue2 ? null : "fb_deep_link_handle_failed";
        C68t c68t2 = (C68t) this.A01;
        Set set2 = C68t.A0Q;
        C7N c7n = (C7N) c68t2.A02.get();
        Message message2 = (Message) this.A04;
        c7n.A00(0S2.A00, message2 == null ? null : message2.A1V, str, booleanValue2);
    }
}
