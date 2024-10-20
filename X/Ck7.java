package X;

import android.content.Context;
import com.facebook.messaging.model.messages.Message;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableMap;
import java.util.concurrent.ExecutorService;

/* loaded from: Ck7.class */
public final /* synthetic */ class Ck7 implements 7Yx {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ CNa A01;
    public final /* synthetic */ Message A02;
    public final /* synthetic */ 5T0 A03;
    public final /* synthetic */ UserKey A04;
    public final /* synthetic */ ImmutableMap A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ ExecutorService A0A;

    public /* synthetic */ Ck7(Context context, CNa cNa, Message message, 5T0 r305, UserKey userKey, ImmutableMap immutableMap, String str, String str2, String str3, String str4, ExecutorService executorService) {
        this.A03 = r305;
        this.A01 = cNa;
        this.A00 = context;
        this.A06 = str;
        this.A02 = message;
        this.A05 = immutableMap;
        this.A07 = str2;
        this.A08 = str3;
        this.A09 = str4;
        this.A04 = userKey;
        this.A0A = executorService;
    }

    public final void CHY(User user) {
        5T0 r0 = this.A03;
        CNa cNa = this.A01;
        Context context = this.A00;
        String str = this.A06;
        Message message = this.A02;
        ImmutableMap immutableMap = this.A05;
        String str2 = this.A07;
        String str3 = this.A08;
        String str4 = this.A09;
        UserKey userKey = this.A04;
        ExecutorService executorService = this.A0A;
        if (user != null) {
            1Kd.A0F(new D4i(context, message, r0, userKey, immutableMap, str, str2, str3, str4), cNa.A03(r0.A01, user, false), executorService);
        }
    }
}
