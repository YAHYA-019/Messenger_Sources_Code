package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Aez, reason: case insensitive filesystem */
/* loaded from: Aez.class */
public final class C1357Aez extends ClickableSpan {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C1357Aez(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A04 = str;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        switch (this.A00) {
            case 0:
                11T.A0F(view, 0);
                Number number = (Number) this.A01;
                AbJ.A0O((1Br) this.A02).A04(new CommunityMessagingLoggerModel(null, null, String.valueOf(number.longValue()), this.A04, null, null, "see_chat_suggestion_tips", "chat_suggestion_bottom_sheet", "see_chat_suggestion_tips", "channel_list", null, null));
                AlR alR = ((C0E) this.A03).A00;
                int i = AlR.A0v;
                LithoView lithoView = alR.A02;
                if (lithoView == null) {
                    AbF.A1G();
                    throw 0Q8.createAndThrow();
                }
                C5fi.A01(lithoView);
                0D2 baseMigBottomSheetDialogFragment = new BaseMigBottomSheetDialogFragment();
                06Z r0 = alR.mFragmentManager;
                11T.A0A(r0);
                String valueOf = String.valueOf(alR.A0E);
                String str = alR.A0L;
                11T.A0F(valueOf, 1);
                if (C0D1.A01(r0)) {
                    baseMigBottomSheetDialogFragment.A00 = valueOf;
                    baseMigBottomSheetDialogFragment.A01 = str;
                    baseMigBottomSheetDialogFragment.A0m(r0, "ChatSuggestionsEducationTipsBottomSheetDialogFragment");
                    return;
                }
                return;
            case 1:
                Intent A09 = 4YU.A09(7zM.A0D(this.A04));
                A09.putExtra(DKB.A00(25), "fb_instant_games_tos_screen");
                ((08O) this.A03).A02().A0A(((1Iw) this.A01).A0D, A09);
                return;
            case 2:
                Uri uri = null;
                try {
                    uri = C0A2.A03(this.A04);
                } catch (SecurityException unused) {
                }
                Intent A092 = 4YU.A09(uri);
                A092.putExtra(DKB.A00(25), "fb_instant_games_tos_screen");
                ((08O) 7zO.A0p(this.A03)).A02().A0A((Context) this.A01, A092);
                return;
            default:
                try {
                    Uri A03 = C0A2.A03(this.A04);
                    if (A03 != null) {
                        ((FIu) this.A03).A09(((1Iw) this.A01).A0D, A03, C5id.A0F);
                        return;
                    }
                    return;
                } catch (SecurityException unused2) {
                    return;
                }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        2KQ r306;
        Context A06;
        int i = this.A00;
        11T.A0F(textPaint, 0);
        super.updateDrawState(textPaint);
        switch (i) {
            case 0:
                textPaint.setUnderlineText(false);
                return;
            case 1:
                textPaint.setUnderlineText(false);
                textPaint.setColor(((MigColorScheme) this.A02).AZc());
                r306 = 2KQ.A03;
                A06 = 7zN.A06(this.A01);
                break;
            case 2:
                textPaint.setUnderlineText(false);
                textPaint.setColor(((MigColorScheme) this.A02).AZc());
                r306 = 2KQ.A03;
                A06 = (Context) this.A01;
                break;
            default:
                textPaint.setUnderlineText(false);
                textPaint.setColor(((MigColorScheme) this.A02).B4i());
                return;
        }
        textPaint.setTypeface(r306.A00(A06));
    }
}
