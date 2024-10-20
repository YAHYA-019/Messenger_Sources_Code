package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.Constants;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.sdk.mca.MailboxSDK$MediaSendOptions;
import com.facebook.stickers.model.Sticker;
import com.facebook.xapp.messaging.composer.broadcast.sdk.sender.sticker.SdkStickerMessageSendBinder$sendStickerPackMessage$1;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.List;

/* renamed from: X.724, reason: invalid class name */
/* loaded from: 724.class */
public final class AnonymousClass724 implements 5Q4 {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 71Q A0D;
    public final 5oZ A0E;
    public final HeterogeneousMap A0F;
    public final C71b A0G;
    public final List A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final FbUserSession A0K;

    public AnonymousClass724(Context context, FbUserSession fbUserSession, 5oZ r304, HeterogeneousMap heterogeneousMap, C71b c71b, List list, boolean z, boolean z2) {
        11T.A0F(context, 1);
        11T.A0F(heterogeneousMap, 2);
        11T.A0F(fbUserSession, 3);
        11T.A0F(r304, 4);
        11T.A0F(c71b, 8);
        this.A00 = context;
        this.A0F = heterogeneousMap;
        this.A0K = fbUserSession;
        this.A0E = r304;
        this.A0J = z;
        this.A0I = z2;
        this.A0H = list;
        this.A0G = c71b;
        this.A04 = 1Bu.A01(context, 68319);
        this.A07 = 1Lm.A00(context, fbUserSession, 65961);
        this.A0C = 1Bq.A00(Constants.LOAD_RESULT_PGO);
        this.A0B = 1Bu.A01(context, 100216);
        this.A05 = 1Bu.A01(context, 67775);
        this.A09 = 1Bq.A00(68077);
        this.A0A = 1Bu.A01(context, 362);
        this.A06 = 1Bu.A01(context, 68925);
        this.A08 = 1Bu.A01(context, 66962);
        this.A0D = new 71Q(list);
        this.A01 = 1Lm.A00(context, fbUserSession, 66197);
        this.A03 = 1Bu.A00(83905);
        this.A02 = 1Bu.A00(115224);
    }

    public static final LoggingOption A00(ThreadKey threadKey, AnonymousClass539 anonymousClass539, AnonymousClass724 anonymousClass724, C5fv c5fv, String str, String str2) {
        long A00;
        Long A0e;
        1Br.A0C(anonymousClass724.A06);
        Integer valueOf = anonymousClass539 != null ? Integer.valueOf(anonymousClass539.id) : null;
        Integer valueOf2 = Integer.valueOf(anonymousClass724.A0E.B9x(threadKey, false));
        C5fu c5fu = (C5fu) c5fv;
        String str3 = c5fu.A0A;
        String str4 = c5fu.A0B;
        if (str4 == null || (A0e = 0CW.A0e(str4)) == null) {
            1Br.A0C(anonymousClass724.A0C);
            A00 = 0Mt.A00();
        } else {
            A00 = A0e.longValue();
        }
        return 5Q5.A00((PrivacyContext) null, valueOf, valueOf2, Long.valueOf(A00), str3, str2, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c4, code lost:
    
        if (r0 != 1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(X.5Qb r301, com.facebook.stickers.model.Sticker r302, X.AnonymousClass724 r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass724.A01(X.5Qb, com.facebook.stickers.model.Sticker, X.724, boolean):void");
    }

    public boolean BQg(C5fv c5fv) {
        11T.A0F(c5fv, 0);
        return c5fv instanceof 5gP;
    }

    public void Ckt(ThreadKey threadKey, AnonymousClass539 anonymousClass539, 7TA r304, C5fv c5fv, String str, String str2, boolean z) {
        11T.A0H(threadKey, r304);
        11T.A0F(c5fv, 2);
        5gP r311 = c5fv instanceof 5gP ? (5gP) c5fv : null;
        if (r311 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        if (threadKey.A12()) {
            Sticker sticker = r311.A00;
            if (sticker == null) {
                throw AnonymousClass001.A0L("Required value was null.");
            }
            2aK.A03((Integer) null, (0DE) null, new SdkStickerMessageSendBinder$sendStickerPackMessage$1(threadKey, sticker, anonymousClass539, this, ((82O) 1Br.A0B(this.A0A)).A0c(threadKey), r311, str, str2, null), 2Zy.A01(2Zo.A00()), 3);
            return;
        }
        if (!threadKey.A1N() && !threadKey.A1P() && !threadKey.A0y()) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Sticker send for ");
            A0k.append(threadKey.A06);
            throw AnonymousClass002.A0F(AnonymousClass000.A00(ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES), A0k);
        }
        String str3 = r311.A0A;
        if (str3 != null) {
            this.A0E.Bc6(this.A00, threadKey, str3, 6Bl.A04(r311.A01));
        }
        5P8 r0 = (5P8) 1Br.A0B(this.A07);
        1Br.A0C(this.A09);
        String A00 = 5QA.A00(threadKey);
        Long A0n = 1BK.A0n(r311.A01);
        7wG r02 = 7wG.A00;
        7fM AxW = r311.AxW(r02);
        Integer num = null;
        String str4 = AxW != null ? AxW.A01 : null;
        7fM AxW2 = r311.AxW(r02);
        if (AxW2 != null) {
            num = Integer.valueOf(AxW2.A00);
        }
        r0.A0M(A00(threadKey, anonymousClass539, this, r311, str, str2), (MailboxSDK$MediaSendOptions) null, 7TC.A00.A00(r311), A0n, num, (Number) null, (Number) null, A00, (String) null, str4, ((C5fy) 1Br.A0B(this.A08)).A00(threadKey, r311, null, this.A0H)).A01.addResultCallback(new A1c(r311, this, 23));
    }
}
