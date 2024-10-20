package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.expandablecomponent.ExpandableBottomSheetContainer;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.avatar.AvatarSearchSuggestedRow;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.avatarpowerup.AvatarPowerUpSuggestedRow;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.genai.GenAiSearchSuggestedRow;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.regularpowerup.RegularPowerUpSuggestedRow;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.sticker.StickerSearchSuggestionRow;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.stickerhint.StickerHintSuggestedRow;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.resources.ui.FbLinearLayout;
import com.facebook.ui.edittext.AnimatedHintsTextLayout;
import com.facebook.ui.media.contentsearch.ContentSearchResultsView;
import com.facebook.widget.FbImageView;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Gmk, reason: case insensitive filesystem */
/* loaded from: Gmk.class */
public final class C2735Gmk extends H4B {
    public EditText A00;
    public Hmj A01;
    public HW9 A02;
    public MigColorScheme A03;
    public FbLinearLayout A04;
    public AnimatedHintsTextLayout A05;
    public FbImageView A06;
    public Integer A07;
    public boolean A08;
    public boolean A09;
    public Capabilities A0A;
    public String A0B;
    public final View A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final 1Br A0L;
    public final 1Br A0M;
    public final 1Br A0N;
    public final 1Br A0O;
    public final 1Br A0P;
    public final JEs A0Q;
    public final I8b A0R;
    public final FbUserSession A0S;

    /* JADX WARN: Multi-variable type inference failed */
    public C2735Gmk(Context context) {
        super(context, null, 0);
        1Br A0e = 7zM.A0e(context);
        this.A0P = A0e;
        this.A0F = 1Bq.A00(68416);
        this.A0G = 1Bu.A00(68071);
        this.A0K = 1Bu.A00(68017);
        FbUserSession A03 = 1Br.A03(A0e);
        this.A0S = A03;
        this.A0N = 1Lm.A00(context, A03, 116050);
        this.A0O = 1Lm.A00(context, A03, 116051);
        this.A0E = 1Bu.A00(116067);
        this.A0D = 1Bq.A00(66227);
        this.A0M = 1Bu.A00(49988);
        this.A0L = 1Bu.A01(context, 116047);
        this.A0H = 1Bq.A00(16688);
        this.A0J = 1BK.A0C();
        this.A0I = 7zM.A0U();
        this.A0Q = new IUy(this);
        this.A07 = 0S2.A00;
        this.A09 = true;
        this.A03 = LightColorScheme.A00();
        this.A0R = new I8b(this);
        View A0G = 7zM.A0G(LayoutInflater.from(context), this, 2132543411, false);
        this.A0C = A0G;
        A0c(A0G, null);
        IUx iUx = new IUx(this, 1);
        ExpandableBottomSheetContainer expandableBottomSheetContainer = super.A03;
        if (expandableBottomSheetContainer != null) {
            expandableBottomSheetContainer.A02 = iUx;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(C2735Gmk c2735Gmk) {
        if (c2735Gmk.A05 != null) {
            int i = 2131965563;
            if (A03(c2735Gmk)) {
                i = 2131965526;
            }
            String str = c2735Gmk.A0B;
            Context context = c2735Gmk.getContext();
            if (11T.A0O(str, context.getString(i))) {
                return;
            }
            c2735Gmk.A0B = context.getString(i);
            A01(c2735Gmk, (A03(c2735Gmk) && !c2735Gmk.A09 && c2735Gmk.A08) ? 0S2.A01 : 0S2.A0C);
        }
    }

    public static final void A01(C2735Gmk c2735Gmk, Integer num) {
        String str;
        List A03;
        c2735Gmk.A07 = num;
        AnimatedHintsTextLayout animatedHintsTextLayout = c2735Gmk.A05;
        if (animatedHintsTextLayout == null || (str = c2735Gmk.A0B) == null) {
            return;
        }
        if (num.intValue() == 1) {
            1Br.A0C(c2735Gmk.A0G);
            A03 = 7zQ.A0t().A03();
        } else {
            animatedHintsTextLayout.A05();
            A03 = 11T.A03(str);
        }
        animatedHintsTextLayout.A06(A03);
    }

    public static final void A02(C2735Gmk c2735Gmk, boolean z) {
        int andIncrement;
        String A0w;
        c2735Gmk.A08 = z;
        HW9 hw9 = c2735Gmk.A02;
        if (hw9 == null) {
            11T.A0L("suggestionRows");
            throw 0Q8.createAndThrow();
        }
        IEz iEz = hw9.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = iEz.A0I;
        r0.A08("com.facebook.messaging.suggestedkeyboard.plugins.interfaces.suggestionrow.SuggestedRowInterfaceSpec", "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setSearchFocused", andIncrement2);
        Exception e = null;
        try {
            if (IEz.A04(iEz)) {
                andIncrement = atomicInteger.getAndIncrement();
                A0w = GOp.A19(r0, "setSearchFocused", andIncrement);
                try {
                    try {
                        RegularPowerUpSuggestedRow regularPowerUpSuggestedRow = iEz.A05;
                        regularPowerUpSuggestedRow.A01 = z;
                        RegularPowerUpSuggestedRow.A00(regularPowerUpSuggestedRow);
                        r0.A09(A0w, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setSearchFocused", andIncrement);
                    } catch (Throwable th) {
                        r0.A04(e, A0w, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setSearchFocused", andIncrement);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            }
            if (IEz.A01(iEz)) {
                int andIncrement3 = atomicInteger.getAndIncrement();
                String A0x = GOo.A0x(r0, "setSearchFocused", andIncrement3);
                AvatarPowerUpSuggestedRow avatarPowerUpSuggestedRow = iEz.A02;
                avatarPowerUpSuggestedRow.A01 = z;
                AvatarPowerUpSuggestedRow.A00(avatarPowerUpSuggestedRow);
                r0.A09(A0x, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setSearchFocused", andIncrement3);
            }
            if (IEz.A06(iEz)) {
                andIncrement = atomicInteger.getAndIncrement();
                A0w = GOo.A0w(r0, "setSearchFocused", andIncrement);
                StickerHintSuggestedRow stickerHintSuggestedRow = iEz.A07;
                stickerHintSuggestedRow.A02 = z;
                StickerHintSuggestedRow.A00(stickerHintSuggestedRow);
                r0.A09(A0w, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setSearchFocused", andIncrement);
            }
            r0.A02((Exception) null, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setSearchFocused", andIncrement2);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setSearchFocused", andIncrement2);
            throw th2;
        }
    }

    public static final boolean A03(C2735Gmk c2735Gmk) {
        6fA r0;
        Capabilities capabilities = c2735Gmk.A0A;
        if (capabilities == null) {
            return false;
        }
        AnonymousClass842 anonymousClass842 = (AnonymousClass842) 1Br.A0B(c2735Gmk.A0F);
        Hmj hmj = c2735Gmk.A01;
        return anonymousClass842.A08((hmj == null || (r0 = hmj.A00.A07.A00.A0H) == null) ? null : r0.A02, capabilities);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.H4B
    public void A0f(MigColorScheme migColorScheme) {
        int i;
        11T.A0F(migColorScheme, 0);
        super.A0f(migColorScheme);
        this.A03 = migColorScheme;
        HW9 hw9 = this.A02;
        if (hw9 == null) {
            11T.A0L("suggestionRows");
            throw 0Q8.createAndThrow();
        }
        String str = hw9.A00;
        IEz iEz = ((HPa) str).A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = iEz.A0I;
        r0.A08("com.facebook.messaging.suggestedkeyboard.plugins.interfaces.suggestionrow.SuggestedRowInterfaceSpec", "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setColorScheme", andIncrement);
        try {
            try {
                if (IEz.A02(iEz)) {
                    i = atomicInteger.getAndIncrement();
                    str = "messaging.suggestedkeyboard.core.composer.rows.genai.GenAiSearchSuggestedRow";
                    r0.A0A("com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.genai.GenAiSearchSuggestedRow", str, "com.facebook.messaging.suggestedkeyboard.plugins.interfaces.suggestionrow.SuggestedRowInterfaceSpec", i, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "com.facebook.messaging.suggestedkeyboard.plugins.core.SuggestedkeyboardCoreKillSwitch", "setColorScheme");
                    try {
                        GenAiSearchSuggestedRow genAiSearchSuggestedRow = iEz.A03;
                        genAiSearchSuggestedRow.A02 = migColorScheme;
                        2OB r02 = genAiSearchSuggestedRow.A0F;
                        AbG.A1J(r02, migColorScheme);
                        genAiSearchSuggestedRow.A0G.setTextColor(migColorScheme.B4d());
                        IFE ife = genAiSearchSuggestedRow.A0H;
                        ife.A09(migColorScheme);
                        Context context = r02.getContext();
                        final int AmV = migColorScheme.AmV();
                        Resources resources = context.getResources();
                        int i2 = 2132279360;
                        if (((Ho3) 1Br.A0B(genAiSearchSuggestedRow.A0A)).A00()) {
                            i2 = 2132279345;
                        }
                        final int dimensionPixelSize = resources.getDimensionPixelSize(i2) - 1;
                        LithoView A00 = LithoView.A00(context, new 1LH(AmV, dimensionPixelSize) { // from class: X.8f9
                            public final int A00;
                            public final int A01;

                            {
                                this.A00 = AmV;
                                this.A01 = dimensionPixelSize;
                            }

                            public static final C1rh A01(Drawable drawable, C2k6 c2k6, int i3) {
                                2lQ r03 = 2lO.A02;
                                long A0B = 7zO.A0B(i3);
                                2lO A0K = 4YV.A0K(4YV.A0K(7zS.A0g(0S2.A01, A0B), 0S2.A00, A0B), 0S2.A09, 7zP.A0F());
                                return 7zN.A0R(new 8aC(drawable, 36.0f, i3, -1), 7zS.A0L(c2k6), c2k6, A0K);
                            }

                            public 1LI A0s(C2k5 c2k5) {
                                11T.A0F(c2k5, 0);
                                C5bb c5bb = new C5bb(0.0f, this.A00);
                                1Iw r03 = c2k5.A05;
                                DuU A01 = Dzb.A01(r03);
                                A01.A01.A04 = false;
                                A01.A0X();
                                C2sn A0U = 7zQ.A0U(r03);
                                int i3 = this.A01;
                                A0U.A00(A01(c5bb, A0U, i3));
                                A0U.A00(A01(c5bb, A0U, i3));
                                A0U.A00(A01(c5bb, A0U, i3));
                                A0U.A00(A01(c5bb, A0U, i3));
                                A01.A2Y(new C1rh(null, null, null, null, A0U.A01, false));
                                return A01.A2W();
                            }
                        });
                        ContentSearchResultsView A01 = IFE.A01(ife);
                        A01.A02.removeAllViews();
                        A01.A02.addView(A00);
                        r0.A09(str, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setColorScheme", i);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (IEz.A00(iEz)) {
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.avatar.AvatarSearchSuggestedRow", "messaging.suggestedkeyboard.core.composer.rows.avatar.AvatarSearchSuggestedRow", "com.facebook.messaging.suggestedkeyboard.plugins.interfaces.suggestionrow.SuggestedRowInterfaceSpec", andIncrement2, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "com.facebook.messaging.suggestedkeyboard.plugins.core.SuggestedkeyboardCoreKillSwitch", "setColorScheme");
                    AvatarSearchSuggestedRow avatarSearchSuggestedRow = iEz.A01;
                    AbG.A1J(avatarSearchSuggestedRow.A06, migColorScheme);
                    avatarSearchSuggestedRow.A07.A09(migColorScheme);
                    r0.A09("messaging.suggestedkeyboard.core.composer.rows.avatar.AvatarSearchSuggestedRow", "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setColorScheme", andIncrement2);
                }
                if (IEz.A03(iEz)) {
                    int andIncrement3 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.recentemoji.RecentEmojiSuggestedRow", "messaging.suggestedkeyboard.core.composer.rows.recentemoji.RecentEmojiSuggestedRow", "com.facebook.messaging.suggestedkeyboard.plugins.interfaces.suggestionrow.SuggestedRowInterfaceSpec", andIncrement3, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "com.facebook.messaging.suggestedkeyboard.plugins.core.SuggestedkeyboardCoreKillSwitch", "setColorScheme");
                    AbG.A1J(iEz.A04.A02, migColorScheme);
                    r0.A09("messaging.suggestedkeyboard.core.composer.rows.recentemoji.RecentEmojiSuggestedRow", "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setColorScheme", andIncrement3);
                }
                if (IEz.A05(iEz)) {
                    int andIncrement4 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.sticker.StickerSearchSuggestionRow", "messaging.suggestedkeyboard.core.composer.rows.sticker.StickerSearchSuggestionRow", "com.facebook.messaging.suggestedkeyboard.plugins.interfaces.suggestionrow.SuggestedRowInterfaceSpec", andIncrement4, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "com.facebook.messaging.suggestedkeyboard.plugins.core.SuggestedkeyboardCoreKillSwitch", "setColorScheme");
                    StickerSearchSuggestionRow stickerSearchSuggestionRow = iEz.A06;
                    AbG.A1J(stickerSearchSuggestionRow.A04, migColorScheme);
                    stickerSearchSuggestionRow.A06.A09(migColorScheme);
                    r0.A09("messaging.suggestedkeyboard.core.composer.rows.sticker.StickerSearchSuggestionRow", "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setColorScheme", andIncrement4);
                }
                if (IEz.A04(iEz)) {
                    int andIncrement5 = atomicInteger.getAndIncrement();
                    String A19 = GOp.A19(r0, "setColorScheme", andIncrement5);
                    AbG.A1J(iEz.A05.A0E, migColorScheme);
                    r0.A09(A19, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setColorScheme", andIncrement5);
                }
                if (IEz.A01(iEz)) {
                    int andIncrement6 = atomicInteger.getAndIncrement();
                    String A0x = GOo.A0x(r0, "setColorScheme", andIncrement6);
                    AbG.A1J(iEz.A02.A0H, migColorScheme);
                    r0.A09(A0x, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setColorScheme", andIncrement6);
                }
                if (IEz.A06(iEz)) {
                    i = atomicInteger.getAndIncrement();
                    str = GOo.A0w(r0, "setColorScheme", i);
                    StickerHintSuggestedRow stickerHintSuggestedRow = iEz.A07;
                    AbG.A1J(stickerHintSuggestedRow.A08, migColorScheme);
                    stickerHintSuggestedRow.A09.A09(migColorScheme);
                    r0.A09(str, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setColorScheme", i);
                }
                r0.A02((Exception) null, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setColorScheme", andIncrement);
                MigColorScheme.A00(this.A0C, this.A03);
                EditText editText = this.A00;
                if (editText != null) {
                    AbH.A1M(editText, this.A03);
                    editText.setHintTextColor(this.A03.B36());
                    FbImageView fbImageView = this.A06;
                    if (fbImageView != null) {
                        GOo.A1E(fbImageView, C1u3.A4D, 7zP.A0S(this.A0I), this.A03.BEi());
                        editText.setBackground(null);
                        FbLinearLayout fbLinearLayout = this.A04;
                        if (fbLinearLayout != null) {
                            fbLinearLayout.setBackground(new C5bb(7zL.A01(getResources(), 2132279326), this.A03.AmV()));
                        }
                    }
                }
            } catch (Throwable th) {
                r0.A04((Exception) null, str, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setColorScheme", i);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setColorScheme", andIncrement);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0149, code lost:
    
        if (X.GOq.A1Y((X.AnonymousClass842) r0.get()) != false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0n(com.facebook.xapp.messaging.capability.vector.Capabilities r302) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2735Gmk.A0n(com.facebook.xapp.messaging.capability.vector.Capabilities):void");
    }
}
