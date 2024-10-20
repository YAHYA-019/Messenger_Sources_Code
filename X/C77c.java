package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.aibot.nux.AiBotMentionsNuxBrazilFragment;
import com.facebook.messaging.aibot.nux.AiBotMentionsNuxFragmentV2;
import com.facebook.messaging.aibot.nux.AiBotNuxUtils$fetchAIChatNuxConsent$2;
import com.facebook.messaging.aibot.nux.model.AiBotNuxStatus;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.thread.aibot.repository.MetaAiRepository;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.xapp.messaging.browser.model.MessengerInAppBrowserLaunchParam;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.77c, reason: invalid class name */
/* loaded from: 77c.class */
public final class C77c {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final C01i A05;
    public final 1De A06;
    public final 1Br A07 = 1Bq.A00(66409);
    public final 1Br A08 = 1Bq.A00(66421);

    public C77c(1De r302) {
        this.A06 = r302;
        1BY r0 = r302.A00;
        this.A01 = 1Bu.A03(r0, 16979);
        this.A04 = 1Bu.A03(r0, 67680);
        this.A00 = 1Bu.A03(r0, 68258);
        1Br A00 = 1Bq.A00(66351);
        this.A02 = A00;
        this.A03 = 1Lm.A03(((1Fv) A00.A00.get()).A04(), r0, 65869);
        this.A05 = C01g.A00(C03i.A02, C77e.A00);
    }

    public static final SpannableString A00(Context context, C77c c77c, AnonymousClass969 anonymousClass969) {
        String string = context.getString(2131960174);
        11T.A0A(string);
        ClickableSpan A02 = c77c.A02(context, anonymousClass969, A03(c77c).A04());
        String string2 = context.getString(2131960173);
        11T.A0A(string2);
        String BCz = 1qI.A02(A03(c77c)).BCz(36885746080613982L, 1BJ.A00(188));
        11T.A0A(BCz);
        ClickableSpan A022 = c77c.A02(context, anonymousClass969, BCz);
        String string3 = context.getString(2131960175, string, string2);
        11T.A0A(string3);
        0Dc r0 = new 0Dc(context.getResources());
        r0.A02(string3);
        r0.A05(A02, string, string, 33);
        r0.A05(A022, string2, string2, 33);
        return new SpannableString(r0.A01);
    }

    public static final SpannableString A01(Context context, C77c c77c, boolean z) {
        int i;
        String A0u = 1BK.A0u(context, 2131952607);
        if (z) {
            i = 2131952542;
        } else {
            i = 2131952563;
            if (1qI.A02(A03(c77c)).AZk(36322796135139298L)) {
                i = 2131952564;
            }
        }
        String A0v = 1BK.A0v(context, A0u, i);
        11T.A0D(A0v);
        0Dc r0 = new 0Dc(context.getResources());
        r0.A02(A0v);
        c77c.A0F(context, r0);
        return new SpannableString(r0.A01);
    }

    private final ClickableSpan A02(final Context context, final AnonymousClass969 anonymousClass969, final String str) {
        final int i = 0;
        return ((CFx) this.A04.A00.get()).A01(context, new View.OnClickListener(context, this, anonymousClass969, str, i) { // from class: X.9pb
            public final int A00;
            public final Object A01;
            public final Object A02;
            public final Object A03;
            public final String A04;

            {
                this.A00 = i;
                this.A02 = this;
                this.A01 = context;
                this.A04 = str;
                this.A03 = anonymousClass969;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05;
                int i2;
                if (this.A00 != 0) {
                    A05 = 0FI.A05(-1975154323);
                    Context context2 = (Context) this.A01;
                    7XZ.A01(BOQ.A04, (ThreadKey) this.A02);
                    String str2 = this.A04;
                    Intent intent = new Intent();
                    intent.setData(4YU.A0F(str2));
                    intent.putExtra(AbE.A00(21), EnumC3499Mfu.A0n.mValue);
                    0LS.A0A(context2, intent);
                    i2 = 1507316186;
                } else {
                    A05 = 0FI.A05(247989873);
                    C77c.A06((Context) this.A01, (C77c) this.A02, (AnonymousClass969) this.A03, this.A04, true);
                    i2 = -1887699887;
                }
                0FI.A0B(i2, A05);
            }
        }, (MigColorScheme) this.A01.A00.get());
    }

    public static final 1qI A03(C77c c77c) {
        return (1qI) c77c.A07.A00.get();
    }

    public static final 1qK A04(C77c c77c) {
        return (1qK) c77c.A08.A00.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r310v0 */
    /* JADX WARN: Type inference failed for: r310v1 */
    /* JADX WARN: Type inference failed for: r310v2, types: [android.text.SpannableStringBuilder] */
    public static final CharSequence A05(Context context, C77c c77c, AnonymousClass969 anonymousClass969, C54U c54u, boolean z) {
        CharSequence A08;
        int length;
        int i;
        if (c54u != null) {
            String str = c54u.A00;
            List<C82g> list = c54u.A01;
            if (str != null && (length = str.length()) != 0 && !list.isEmpty()) {
                A08 = new SpannableStringBuilder(str);
                for (C82g c82g : list) {
                    int i2 = c82g.A02;
                    int i3 = c82g.A01;
                    String str2 = c82g.A03;
                    if (i2 >= 0 && i3 > 0 && (i = i2 + i3) <= length && str2 != null && str2.length() != 0) {
                        A08.setSpan(c77c.A02(context, anonymousClass969, str2), i2, i, 33);
                    }
                }
                return A08;
            }
        }
        11T.A0F(context, 0);
        if (!z) {
            return A00(context, c77c, anonymousClass969);
        }
        A08 = c77c.A08(context, anonymousClass969);
        return A08;
    }

    public static final void A06(Context context, C77c c77c, AnonymousClass969 anonymousClass969, String str, boolean z) {
        1BV r0 = new 1BV(c77c.A06.A00, 68729);
        try {
            Uri A03 = C0A2.A03(str);
            if (A03 != null) {
                C76 c76 = (C76) r0.get();
                C5id c5id = MessengerInAppBrowserLaunchParam.A0E.A02;
                11T.A09(c5id);
                c76.A01(context, A03, c5id);
                if (!z || anonymousClass969 == null) {
                    return;
                }
                int ordinal = anonymousClass969.ordinal();
                if (ordinal == 3) {
                    3vU.A0A((3vU) 1Br.A0B(c77c.A00), str, 20);
                    return;
                }
                if (ordinal == 0) {
                    ((3vU) 1Br.A0B(c77c.A00)).A0K(BOj.A04, str, 1);
                } else if (ordinal == 1) {
                    ((3vU) 1Br.A0B(c77c.A00)).A0K(BOj.A0D, str, 0);
                } else if (ordinal == 5) {
                    ((3vU) 1Br.A0B(c77c.A00)).A0D(0, "ai_terms");
                }
            }
        } catch (SecurityException unused) {
        }
    }

    public static final void A07(BOj bOj, 1pI r302, boolean z) {
        if (1qI.A01((1qI) 1Bi.A03(66409)).A01()) {
            8H3.A08.A00(bOj, r302, z);
        } else {
            8H4.A0A.A00(bOj, r302, z);
        }
    }

    public final SpannableString A08(Context context, AnonymousClass969 anonymousClass969) {
        String string = context.getString(2131960235);
        11T.A0A(string);
        String BCz = 1qI.A02(A03(this)).BCz(36885746085856865L, "https://www.facebook.com/privacy/dialog/ai-partners");
        11T.A0A(BCz);
        ClickableSpan A02 = A02(context, anonymousClass969, BCz);
        String string2 = context.getString(2131960233);
        11T.A0A(string2);
        String BCz2 = 1qI.A02(A03(this)).BCz(36885746085922402L, DKB.A00(15));
        11T.A0A(BCz2);
        ClickableSpan A022 = A02(context, anonymousClass969, BCz2);
        String string3 = context.getString(2131960234);
        11T.A0A(string3);
        String BCz3 = 1qI.A02(A03(this)).BCz(36885746085987939L, 7zK.A00(94));
        11T.A0A(BCz3);
        ClickableSpan A023 = A02(context, anonymousClass969, BCz3);
        String string4 = context.getString(2131960174);
        11T.A0A(string4);
        ClickableSpan A024 = A02(context, anonymousClass969, A03(this).A04());
        String string5 = context.getString(2131960232);
        11T.A0A(string5);
        String BCz4 = A03(this).A00.BCz(72904342545563894L, "https://www.facebook.com/help/contact/6359191084165019");
        11T.A0A(BCz4);
        ClickableSpan A025 = A02(context, anonymousClass969, BCz4);
        int i = 2131960236;
        if (1qI.A02(A03(this)).AZk(36322796135925734L)) {
            i = 2131960240;
        }
        String string6 = context.getString(i, "share_text_placeholder", "privacy_policy_text_placeholder", "rights_text_placeholder", "ai_objection_text");
        11T.A0A(string6);
        String string7 = context.getString(2131952563, "ai_terms_text_placeholder");
        11T.A0A(string7);
        0Dc r0 = new 0Dc(context.getResources());
        r0.A02(string6);
        r0.A02("\n\n");
        r0.A02(string7);
        r0.A05(A02, "share_text_placeholder", string, 33);
        r0.A05(A022, "privacy_policy_text_placeholder", string2, 33);
        r0.A05(A023, "rights_text_placeholder", string3, 33);
        r0.A05(A024, "ai_terms_text_placeholder", string4, 33);
        r0.A05(A025, "ai_objection_text", string5, 33);
        return new SpannableString(r0.A01);
    }

    public final AiBotNuxStatus A09(Context context, AnonymousClass969 anonymousClass969, boolean z) {
        4nD r0 = ((MetaAiRepository) 1Br.A0B(this.A03)).A00;
        return r0 == null ? new AiBotNuxStatus("", false) : new AiBotNuxStatus(A05(context, this, anonymousClass969, r0.A00, z), r0.A01);
    }

    public final 8NJ A0A(final BOj bOj, final 1Iw r303, MigColorScheme migColorScheme, final 3vU r305, final Function1 function1) {
        8Ll r321;
        boolean A1X = 1BL.A1X(r303, migColorScheme);
        final 1qI r0 = (1qI) 1Bi.A03(66409);
        C8xf c8xf = new C8xf(null, 2132411122);
        boolean A01 = 1qI.A01(r0).A01();
        8Ll[] r02 = new 8Ll[3];
        if (A01) {
            r02[0] = new 8Ll(C1u3.A4M, r303.A0D(2131967493), r303.A0D(2131967490), (String) null, 8);
            r02[A1X ? 1 : 0] = new 8Ll(C1u3.A61, r303.A0D(2131967494), r303.A0D(2131967491), (String) null, 8);
            C1u3 c1u3 = C1u3.A3N;
            String A0D = r303.A0D(2131967495);
            Context context = r303.A0D;
            11T.A0A(context);
            String A0v = 1BK.A0v(context, 1BK.A0u(context, 2131952515), 2131967492);
            11T.A0A(A0v);
            0Dc r03 = new 0Dc(context.getResources());
            r03.A02(A0v);
            A0F(context, r03);
            r321 = new 8Ll(c1u3, A0D, new SpannableString(r03.A01), (String) null, 8);
        } else {
            r02[0] = new 8Ll(C1u3.A3C, r303.A0D(2131952558), r303.A0D(2131952553), (String) null, 8);
            r02[A1X ? 1 : 0] = new 8Ll(C1u3.A61, r303.A0D(2131952559), r303.A0D(2131952554), (String) null, 8);
            r321 = new 8Ll(C1u3.A3N, r303.A0D(2131952560), r303.A0D(2131952555), (String) null, 8);
        }
        r02[2] = r321;
        List A14 = C0s8.A14(r02);
        int i = 2131952562;
        if (1qI.A01(r0).A01()) {
            i = 2131952557;
        }
        String A0D2 = r303.A0D(i);
        11T.A0D(A0D2);
        8Lf r04 = new 8Lf(new View.OnClickListener() { // from class: X.9pe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = 0FI.A05(1140469425);
                3vU.A06(bOj, r305, "ok", 11);
                1qK A0V = 7zR.A0V();
                if (1qI.A02(r0).AZk(36322796124325741L)) {
                    1Ql.A01(7zO.A0b(A0V), 1qK.A02(A0V).A00(1BJ.A00(76)), true);
                    FbSharedPreferences A012 = 1qK.A01(A0V);
                    1M0 A02 = 1qK.A02(A0V);
                    String A00 = 1BJ.A00(935);
                    if (!1BK.A1T(A012, A02.A00(A00))) {
                        1Ql.A01(7zO.A0b(A0V), 1qK.A02(A0V).A00(A00), true);
                        this.A0C(7zL.A0A(r303));
                    }
                } else {
                    A0V.A05();
                }
                Function1 function12 = function1;
                11T.A0D(view);
                function12.invoke(view);
                0FI.A0B(2002643486, A05);
            }
        }, new C9pa(0, bOj, this, r305, r303), A0D2, r303.A0D(2131952561));
        int i2 = 2131952565;
        if (1qI.A01(r0).A01()) {
            i2 = 2131967496;
        }
        String A0D3 = r303.A0D(i2);
        Context context2 = r303.A0D;
        11T.A0A(context2);
        SpannableString A012 = A01(context2, this, 1qI.A01(r0).A01());
        11T.A0D(A0D3);
        return new 8NJ(r04, c8xf, (CharSequence) null, A012, A0D3, A14, A1X);
    }

    public void A0B(Context context) {
        11T.A0F(context, 0);
        A04(this).A05();
        A0C(context);
    }

    public final void A0C(Context context) {
        2aK.A03((Integer) null, 2Zo.A02(0S2.A01), new C82s(this, context, null, 3), (2aI) this.A05.getValue(), 2);
    }

    public final void A0D(Context context) {
        String BCz = 1qI.A02(A03(this)).BCz(36885746075960924L, "https://www.facebook.com/help/messenger-app/671966618200379?ref=ipl");
        11T.A0A(BCz);
        A06(context, this, null, BCz, false);
    }

    public void A0E(Context context, View view, int i) {
        11T.A0F(context, 0);
        if (1qI.A02(A03(this)).AZk(36322796134287318L)) {
            1qK A04 = A04(this);
            if (1qK.A01(A04).ArU(1qK.A02(A04).A00("ai_bot_composer_gallery_disclaimer_impression_count"), 0) < 2yD.A00(1qI.A02(A03(this)), 36604271110855234L)) {
                String A0u = 1BK.A0u(context, 2131952607);
                String A0v = 1BK.A0v(context, A0u, 2131952625);
                11T.A0A(A0v);
                ClickableSpan A02 = A02(context, AnonymousClass969.A04, A03(this).A04());
                0Dc r0 = new 0Dc(context.getResources());
                r0.A02(A0v);
                r0.A05(A02, A0u, A0u, 33);
                L5Q A00 = KXg.A00(view, new SpannableString(r0.A01), 0);
                JYg jYg = ((LBS) A00.A01).A0D;
                View findViewById = jYg.findViewById(2131367431);
                11T.A0I(findViewById, JQw.A00(1));
                ((TextView) findViewById).setMovementMethod(LinkMovementMethod.getInstance());
                A00.A05((-1) >>> 1);
                C00i c00i = this.A01.A00;
                A00.A06(((MigColorScheme) c00i.get()).B4i());
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(64.0f);
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(((MigColorScheme) c00i.get()).Abp());
                jYg.setBackground(gradientDrawable);
                jYg.setTranslationY(-i);
                jYg.setElevation(Float.MAX_VALUE);
                A00.A02();
                1qK A042 = A04(this);
                int ArU = 1qK.A01(A042).ArU(1qK.A02(A042).A00("ai_bot_composer_gallery_disclaimer_impression_count"), 0);
                1Ql edit = 1qK.A01(A042).edit();
                edit.CaE(1qK.A02(A042).A00("ai_bot_composer_gallery_disclaimer_impression_count"), ArU + 1);
                edit.commit();
                ((3vU) 1Br.A0B(this.A00)).A0D(1, (String) null);
            }
        }
    }

    public final void A0F(Context context, 0Dc r303) {
        String A0u = 1BK.A0u(context, 2131952515);
        String BCz = 1qI.A02(A03(this)).BCz(36885746080613982L, 1BJ.A00(188));
        11T.A0A(BCz);
        ClickableSpan A02 = A02(context, null, BCz);
        String A0u2 = 1BK.A0u(context, 2131952607);
        ClickableSpan A022 = A02(context, null, A03(this).A04());
        r303.A05(A02, A0u, A0u, 33);
        r303.A05(A022, A0u2, A0u2, 33);
    }

    public final void A0G(Context context, AnonymousClass969 anonymousClass969, Function1 function1, boolean z) {
        0fH.A0j("AiBotNuxUtils", "fetchAIChatNuxConsent");
        2aK.A03((Integer) null, (0DE) null, new AiBotNuxUtils$fetchAIChatNuxConsent$2(context, this, anonymousClass969, null, function1, z), (2aI) this.A05.getValue(), 3);
    }

    public void A0H(06Z r302, BOj bOj, ThreadKey threadKey, C00m c00m, C00m c00m2) {
        0D2 r313;
        String str;
        11T.A0F(r302, 0);
        if (A04(this).A0A() || (threadKey != null && threadKey.A0y())) {
            c00m.invoke();
            return;
        }
        if (1qI.A02(A03(this)).AZk(36322796135925734L)) {
            94S r0 = MigBottomSheetDialogFragment.A01;
            9QP r02 = new 9QP(this, c00m, c00m2);
            r313 = new AiBotMentionsNuxBrazilFragment();
            Bundle A05 = 1BK.A05();
            A05.putSerializable(7zK.A00(ActionId.MESSENGER_THREAD_LIST_LOADED), bOj);
            A05.putParcelable(7zK.A00(ActionId.MESSENGER_THREAD_LIST_DISPLAYED), threadKey);
            r313.setArguments(A05);
            r313.A00 = r02;
            str = "AiBotMentionsNuxBrazilFragment";
        } else if (1qI.A02(A03(this)).AZk(36322796135139298L)) {
            94S r03 = MigBottomSheetDialogFragment.A01;
            BoT boT = new BoT(this, c00m, c00m2);
            r313 = new AiBotMentionsNuxFragmentV2();
            Bundle A052 = 1BK.A05();
            A052.putSerializable("AiBotMentionsNuxFragmentV2.entry_point", bOj);
            A052.putParcelable("AiBotMentionsNuxFragmentV2.thread_key", threadKey);
            r313.setArguments(A052);
            r313.A00 = boT;
            str = "AiBotMentionsNuxFragmentV2";
        } else {
            BoU boU = new BoU(this, c00m, c00m2);
            r313 = new 2Ov();
            Bundle A053 = 1BK.A05();
            A053.putSerializable("AiBotMentionsNuxFragment.entry_point", bOj);
            A053.putParcelable("AiBotMentionsNuxFragment.thread_key", threadKey);
            r313.setArguments(A053);
            r313.A00 = boU;
            str = "AiBotMentionsNuxFragment";
        }
        r313.A0m(r302, str);
    }

    public final boolean A0I(Context context) {
        03Y A04 = ((MetaAiRepository) this.A03.A00.get()).A04();
        boolean booleanValue = ((Boolean) A04.first).booleanValue();
        if (((Boolean) A04.second).booleanValue()) {
            A0C(context);
        }
        return booleanValue;
    }
}
