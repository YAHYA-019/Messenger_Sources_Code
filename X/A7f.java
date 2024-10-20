package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.thread.componentcreator.threadview.initparams.ThreadViewAiBotParamsMetadata;
import com.facebook.xapp.messaging.aibot.logging.events.OnAiNullStateCardsClickEvent;
import com.facebook.xapp.messaging.aibot.logging.events.OnAiNullStateCardsImpressionEvent;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* loaded from: A7f.class */
public final class A7f implements 1Vf {
    public final 1Br A00 = 1Bu.A00(68258);
    public final ThreadKey A01;
    public final 5SW A02;
    public final HeterogeneousMap A03;
    public final Context A04;

    public A7f(Context context, ThreadKey threadKey, 5SW r304, HeterogeneousMap heterogeneousMap) {
        this.A04 = context;
        this.A01 = threadKey;
        this.A02 = r304;
        this.A03 = heterogeneousMap;
    }

    public static boolean A00(A7f a7f) {
        ThreadViewAiBotParamsMetadata threadViewAiBotParamsMetadata = (ThreadViewAiBotParamsMetadata) a7f.A03.A00(ThreadViewAiBotParamsMetadata.A0Q);
        if (threadViewAiBotParamsMetadata != null) {
            return threadViewAiBotParamsMetadata.A07;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [int] */
    public void BQC(1Q5 r302, 1Vp r303, String str) {
        3vU A0x;
        String str2;
        98C r321;
        Long valueOf;
        98J r323;
        Long l;
        AnonymousClass983 anonymousClass983;
        String str3;
        String str4;
        boolean A1X = 1BL.A1X(r302, str);
        switch (str.hashCode()) {
            case -1609318010:
                if (str.equals("com.facebook.xapp.messaging.aibot.logging.events.OnAiTypeaheadRowTap")) {
                    3vU.A04((BOj) null, 3vV.A00(this.A01), 7zQ.A0x(this.A00), false, (String) null, (String) null, 0, 17, !A00(this) ? 1 : 0);
                    return;
                }
                throw 4YV.A0f(str);
            case -1449921114:
                if (str.equals("com.facebook.xapp.messaging.aibot.logging.events.OnAiTypeaheadImpression")) {
                    3vU.A04((BOj) null, 3vV.A00(this.A01), 7zQ.A0x(this.A00), false, (String) null, (String) null, A1X ? 1 : 0, 17, !A00(this) ? 1 : 0);
                    return;
                }
                throw 4YV.A0f(str);
            case -1299397666:
                if (str.equals("com.facebook.xapp.messaging.aibot.logging.events.OnSwipeDownFromAiNullState")) {
                    boolean A00 = A00(this);
                    3vU A0x2 = 7zQ.A0x(this.A00);
                    int i = !A00 ? 1 : 0;
                    ThreadKey threadKey = this.A01;
                    3vU.A04(60U.A00(this.A02), 3vV.A00(threadKey), A0x2, false, (String) null, 4YU.A0y(threadKey), 4, 16, i);
                    return;
                }
                throw 4YV.A0f(str);
            case -1190772594:
                if (str.equals("com.facebook.xapp.messaging.aibot.logging.events.OnAiNullStateCardsImpressionEvent")) {
                    OnAiNullStateCardsImpressionEvent onAiNullStateCardsImpressionEvent = (OnAiNullStateCardsImpressionEvent) r302;
                    11T.A0F(onAiNullStateCardsImpressionEvent, 0);
                    this.A03.A00(ThreadViewAiBotParamsMetadata.A0Q);
                    A0x = 7zQ.A0x(this.A00);
                    str2 = onAiNullStateCardsImpressionEvent.A05;
                    r321 = onAiNullStateCardsImpressionEvent.A01;
                    valueOf = Long.valueOf(onAiNullStateCardsImpressionEvent.A00);
                    r323 = onAiNullStateCardsImpressionEvent.A02;
                    l = onAiNullStateCardsImpressionEvent.A03;
                    anonymousClass983 = null;
                    str3 = onAiNullStateCardsImpressionEvent.A06;
                    str4 = onAiNullStateCardsImpressionEvent.A04;
                    break;
                }
                throw 4YV.A0f(str);
            case -1119406006:
                if (str.equals("com.facebook.xapp.messaging.aibot.logging.events.OnNullStateVisible")) {
                    boolean A002 = A00(this);
                    3vU A0x3 = 7zQ.A0x(this.A00);
                    int i2 = !A002 ? 1 : 0;
                    ThreadKey threadKey2 = this.A01;
                    3vU.A04(60U.A00(this.A02), 3vV.A00(threadKey2), A0x3, false, (String) null, 4YU.A0y(threadKey2), A1X ? 1 : 0, 16, i2);
                    return;
                }
                throw 4YV.A0f(str);
            case 133113173:
                if (str.equals("com.facebook.xapp.messaging.aibot.logging.events.OnAiNullStateCardsClickEvent")) {
                    OnAiNullStateCardsClickEvent onAiNullStateCardsClickEvent = (OnAiNullStateCardsClickEvent) r302;
                    A1X = false;
                    11T.A0F(onAiNullStateCardsClickEvent, 0);
                    this.A03.A00(ThreadViewAiBotParamsMetadata.A0Q);
                    A0x = 7zQ.A0x(this.A00);
                    str2 = onAiNullStateCardsClickEvent.A06;
                    r321 = onAiNullStateCardsClickEvent.A00;
                    valueOf = onAiNullStateCardsClickEvent.A03;
                    r323 = onAiNullStateCardsClickEvent.A02;
                    l = onAiNullStateCardsClickEvent.A04;
                    anonymousClass983 = onAiNullStateCardsClickEvent.A01;
                    str3 = onAiNullStateCardsClickEvent.A07;
                    str4 = onAiNullStateCardsClickEvent.A05;
                    break;
                }
                throw 4YV.A0f(str);
            case 294638230:
                if (str.equals("com.facebook.xapp.messaging.aibot.logging.events.OnAINuxInlineDisclosureImpression")) {
                    boolean A003 = A00(this);
                    3vU A0x4 = 7zQ.A0x(this.A00);
                    int i3 = !A003 ? 1 : 0;
                    ThreadKey threadKey3 = this.A01;
                    3vU.A04(60U.A00(this.A02), 3vV.A00(threadKey3), A0x4, false, (String) null, 4YU.A0y(threadKey3), A1X ? 1 : 0, 19, i3);
                    return;
                }
                throw 4YV.A0f(str);
            default:
                throw 4YV.A0f(str);
        }
        EnumC03583yg A004 = 3vV.A00(this.A01);
        BOj bOj = BOj.A0D;
        0DA r0 = new 0DA();
        r0.A07("card_id", str2);
        r0.A01(r321, "card_category");
        r0.A07("category_display_name", str4);
        r0.A06("card_index", valueOf);
        r0.A01(r323, "pill_type");
        r0.A06("pill_index", l);
        r0.A01(anonymousClass983, "media_type");
        3vU.A01(bOj, (AnonymousClass988) null, A004, r0, A0x, (Boolean) null, str3, (String) null, (String) null, (String) null, (String) null, A1X, 45, (-1) << (-1));
    }
}
