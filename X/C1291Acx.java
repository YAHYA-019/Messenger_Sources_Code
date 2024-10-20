package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.style.ForegroundColorSpan;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.model.messages.GenericAdminMessageInfo;
import com.facebook.messaging.model.messages.Message;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.Acx, reason: case insensitive filesystem */
/* loaded from: Acx.class */
public final class C1291Acx {
    public 1BY A00;
    public final C00i A04 = 1BQ.A02(16822);
    public final C15h A07 = DBe.A00(this, ActionId.PREV_ACTIVITY_PAUSE);
    public final C00i A02 = 1BQ.A02(66067);
    public final C00i A03 = 1BQ.A02(66388);
    public final C15h A05 = DBe.A00(this, ActionId.ACTIVITY_RESUME);
    public final C60b A06 = (C60b) 1Bn.A0E((Context) null, (1BY) null, 82380);
    public final C00i A01 = 1BV.A01((1BY) null, 67853);

    public C1291Acx(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public static void A00(Resources resources, 0Dc r302, 5zD r303, Message message, C1291Acx c1291Acx, String str) {
        int i;
        c1291Acx.A04.get();
        if (C1q7.A0F(message)) {
            i = 2131960534;
        } else if (C1q7.A0b(message) || C1q7.A0a(message)) {
            i = 2131959720;
        } else if (C1q7.A0d(message) || C1q7.A0c(message)) {
            i = 2131959723;
        } else {
            i = 2131960510;
            if (C1q7.A0U(message)) {
                i = 2131959545;
            }
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(r303 != null ? r303.Axg().B4i() : resources.getColor(2132214411));
        r302.A02(AbI.A14(resources, str, "%2$s", 2131960503));
        r302.A05(foregroundColorSpan, "%2$s", resources.getString(i), 18);
    }

    public boolean A01(Message message, Capabilities capabilities, Integer num) {
        C1q8 A04;
        C1q8 c1q8;
        GenericAdminMessageInfo genericAdminMessageInfo;
        GenericAdminMessageInfo genericAdminMessageInfo2;
        if (!C1q7.A0k(message) && (A04 = message.A04()) != C1q8.A0J && A04 != C1q8.A0K && A04 != C1q8.A0L && !C1q7.A0l(message) && ((A04 != (c1q8 = C1q8.A04) || (genericAdminMessageInfo2 = message.A0C) == null || !"CONFIRM_FRIEND_REQUEST".equals(genericAdminMessageInfo2.A0I)) && !C1q7.A0g(message))) {
            this.A04.get();
            if (!C1q7.A0F(message) && !C1q7.A0U(message) && !C1q7.A0d(message) && !C1q7.A0c(message) && !C1q7.A0b(message) && !C1q7.A0a(message)) {
                if (A04 != c1q8 || (genericAdminMessageInfo = message.A0C) == null) {
                    return false;
                }
                return 4YT.A00(214).equals(genericAdminMessageInfo.A0I) ? 1BL.A1a(this.A07) : C60b.A00(message, 1BK.A1V(num, 0S2.A00)) && 4YU.A1Y(capabilities, 9) && 1BL.A1a(this.A07);
            }
        }
        return true;
    }
}
