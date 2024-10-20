package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fbavatar.config.AvatarConfigRepository;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.composer.OneLineComposerView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.avatar.AvatarSearchSuggestedRow;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.avatarpowerup.AvatarPowerUpSuggestedRow;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.genai.GenAiSearchSuggestedRow;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.recentemoji.RecentEmojiSuggestedRow;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.regularpowerup.RegularPowerUpSuggestedRow;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.sticker.StickerSearchSuggestionRow;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.stickerhint.StickerHintSuggestedRow;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.resources.ui.FbLinearLayout;
import com.facebook.ui.edittext.AnimatedHintsTextLayout;
import com.facebook.widget.FbImageView;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Gms, reason: case insensitive filesystem */
/* loaded from: Gms.class */
public final class C2741Gms extends IV9 {
    public GWZ A00;
    public Hdr A01;
    public MigColorScheme A02;
    public final 06Z A03;
    public final LifecycleOwner A04;
    public final 2S4 A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 6Qb A08;
    public final C01i A09;
    public final 6Qc A0A;
    public final 6Qf A0B;

    public C2741Gms(06Z r302, LifecycleOwner lifecycleOwner, 2S4 r304, 6Qc r305, 6Qb r306, 6Qf r307) {
        11T.A0F(r307, 2);
        7zT.A11(3, r306, r305, r304, r302);
        11T.A0F(lifecycleOwner, 7);
        this.A0B = r307;
        this.A08 = r306;
        this.A0A = r305;
        this.A05 = r304;
        this.A03 = r302;
        this.A04 = lifecycleOwner;
        this.A07 = 1Bu.A00(647);
        this.A06 = 1Bu.A00(646);
        this.A09 = C01g.A00(C03i.A02, new DCz(this, 16));
    }

    public static final void A00(C2741Gms c2741Gms) {
        if (c2741Gms.A00 == null) {
            if (c2741Gms.A02 == null) {
                c2741Gms.A02 = c2741Gms.A0A.A00.A0O.Axg();
            }
            AbR A0J = AbJ.A0J(c2741Gms.A07);
            MigColorScheme migColorScheme = c2741Gms.A02;
            Context A01 = FbInjector.A01();
            AbL.A0y(A0J);
            try {
                GWZ gwz = new GWZ(migColorScheme);
                1Bn.A0K();
                FbInjector.A04(A01);
                c2741Gms.A00 = gwz;
            } catch (Throwable th) {
                1Bn.A0K();
                FbInjector.A04(A01);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v186 */
    /* JADX WARN: Type inference failed for: r0v523, types: [android.view.View[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v525, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v540, types: [android.view.View[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v542, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v557, types: [android.view.View[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v559, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v580, types: [android.view.View[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v582, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.Gmk, android.view.View, java.lang.Object, X.H4B] */
    /* JADX WARN: Type inference failed for: r0v603, types: [android.view.View[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v605, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v626, types: [android.view.View[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v628, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v663, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r314v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r314v5, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r314v6 */
    /* JADX WARN: Type inference failed for: r314v8, types: [java.lang.String] */
    public /* bridge */ /* synthetic */ View A01(ViewGroup viewGroup) {
        String str;
        C0ty c0ty;
        int andIncrement;
        String A0w;
        11T.A0F(viewGroup, 0);
        ?? c2735Gmk = new C2735Gmk(4YU.A08(viewGroup));
        06Z r0 = this.A03;
        LifecycleOwner lifecycleOwner = this.A04;
        FbUserSession A03 = 1Br.A03(c2735Gmk.A0P);
        FbLinearLayout fbLinearLayout = (FbLinearLayout) C09s.A01(c2735Gmk, 2131367144);
        c2735Gmk.A04 = fbLinearLayout;
        if (fbLinearLayout != null) {
            fbLinearLayout.setVisibility(0);
            c2735Gmk.A05 = (AnimatedHintsTextLayout) C09s.A01(c2735Gmk, 2131362041);
            c2735Gmk.A00 = (EditText) C09s.A01(c2735Gmk, 2131367742);
            c2735Gmk.A06 = (FbImageView) C09s.A01(c2735Gmk, 2131367173);
            EditText editText = c2735Gmk.A00;
            if (editText != null) {
                editText.setVisibility(0);
                editText.setTypeface(2KQ.A04.A00(4YU.A08((View) c2735Gmk)));
            }
        }
        c2735Gmk.A02 = new HW9((HPa) C1Y6.A00(c2735Gmk.getContext(), "com_facebook_messaging_suggestedkeyboard_plugins_interfaces_suggestionrow_SuggestedRowInterfaceSpec", "All", new Object[]{A03, c2735Gmk.A0R, new DCz(c2735Gmk, 17), r0, lifecycleOwner, c2735Gmk.A00}));
        ViewGroup viewGroup2 = (ViewGroup) C09s.A01(c2735Gmk, 2131367743);
        C00i c00i = c2735Gmk.A0J.A00;
        int A00 = 2yD.A00(1BK.A0M(c00i), 36604399946635907L);
        int A002 = 2yD.A00(1BK.A0M(c00i), 36604399946570370L);
        int A003 = 2yD.A00(1BK.A0M(c00i), 36604399946701444L);
        int A004 = 2yD.A00(1BK.A0M(c00i), 36604399946766981L);
        int A005 = 2yD.A00(1BK.A0M(c00i), 36604399946832518L);
        int A006 = 2yD.A00(1BK.A0M(c00i), 36604399946898055L);
        int A007 = 2yD.A00(1BK.A0M(c00i), 36604399946963592L);
        03Y A1G = 1BK.A1G("recent_emoji", Integer.valueOf(A003));
        03Y A1G2 = 1BK.A1G("gen_ai_search", Integer.valueOf(A002));
        03Y A1G3 = 1BK.A1G("avatar", Integer.valueOf(A00));
        Integer valueOf = Integer.valueOf(A004);
        int i = 230;
        String A008 = 1BJ.A00(230);
        List A0b = 0QD.A0b(C0s8.A14(A1G, A1G2, A1G3, 1BK.A1G(A008, valueOf), 1BK.A1G("regular_power_ups", Integer.valueOf(A005)), 1BK.A1G("avatar_power_ups", Integer.valueOf(A006)), 1BK.A1G("sticker_hint", Integer.valueOf(A007))), new J4h(7));
        ArrayList A0z = 1BL.A0z(A0b);
        Iterator it = A0b.iterator();
        while (it.hasNext()) {
            A0z.add(((03Y) it.next()).first);
        }
        Set A0f = 0QD.A0f(A0z);
        HW9 hw9 = c2735Gmk.A02;
        if (hw9 == null) {
            str = "suggestionRows";
        } else {
            IEz iEz = hw9.A00.A00;
            String[] strArr = iEz.A08;
            if (strArr == null) {
                i = iEz.A00;
                if (i == -1) {
                    i = IEz.A02(iEz) ? 1 : 0;
                    if (IEz.A00(iEz)) {
                        i++;
                    }
                    if (IEz.A03(iEz)) {
                        i++;
                    }
                    if (IEz.A05(iEz)) {
                        i++;
                    }
                    if (IEz.A04(iEz)) {
                        i++;
                    }
                    if (IEz.A01(iEz)) {
                        i++;
                    }
                    if (IEz.A06(iEz)) {
                        i++;
                    }
                    iEz.A00 = i;
                }
                int i2 = 0;
                strArr = new String[i];
                if (IEz.A02(iEz)) {
                    strArr[0] = "gen_ai_search";
                    i2 = 1;
                }
                if (IEz.A00(iEz)) {
                    strArr[i2] = "avatar";
                    i2++;
                }
                if (IEz.A03(iEz)) {
                    strArr[i2] = "recent_emoji";
                    i2++;
                }
                if (IEz.A05(iEz)) {
                    strArr[i2] = A008;
                    i2++;
                }
                if (IEz.A04(iEz)) {
                    strArr[i2] = "regular_power_ups";
                    i2++;
                }
                if (IEz.A01(iEz)) {
                    strArr[i2] = "avatar_power_ups";
                    i2++;
                }
                if (IEz.A06(iEz)) {
                    strArr[i2] = "sticker_hint";
                }
                iEz.A08 = strArr;
            }
            ArrayList A0s = AnonymousClass001.A0s();
            for (String str2 : strArr) {
                if (!A0f.contains(str2)) {
                    A0s.add(str2);
                }
            }
            ArrayList A0s2 = AnonymousClass001.A0s();
            A0s2.addAll(A0z);
            A0s2.addAll(A0s);
            ArrayList A0s3 = AnonymousClass001.A0s();
            Iterator it2 = A0s2.iterator();
            while (true) {
                str = "suggestionRows";
                if (it2.hasNext()) {
                    String A0i = AnonymousClass001.A0i(it2);
                    HW9 hw92 = c2735Gmk.A02;
                    if (hw92 == null) {
                        break;
                    }
                    IEz iEz2 = hw92.A00.A00;
                    AtomicInteger atomicInteger = C1Y6.A04;
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    1YC r02 = iEz2.A0I;
                    r02.A08("com.facebook.messaging.suggestedkeyboard.plugins.interfaces.suggestionrow.SuggestedRowInterfaceSpec", "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "createViews", andIncrement2);
                    Exception e = null;
                    try {
                        if (A0i.equals("gen_ai_search") && IEz.A02(iEz2)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            A0w = "messaging.suggestedkeyboard.core.composer.rows.genai.GenAiSearchSuggestedRow";
                            r02.A0A("com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.genai.GenAiSearchSuggestedRow", A0w, "com.facebook.messaging.suggestedkeyboard.plugins.interfaces.suggestionrow.SuggestedRowInterfaceSpec", andIncrement, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "com.facebook.messaging.suggestedkeyboard.plugins.core.SuggestedkeyboardCoreKillSwitch", "createViews");
                            try {
                                try {
                                    GenAiSearchSuggestedRow genAiSearchSuggestedRow = iEz2.A03;
                                    c0ty = C0s8.A14(genAiSearchSuggestedRow.A08, genAiSearchSuggestedRow.A09);
                                } catch (Throwable th) {
                                    r02.A04(e, A0w, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "createViews", andIncrement);
                                    throw th;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                throw e;
                            }
                        } else if (A0i.equals("avatar") && IEz.A00(iEz2)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            A0w = "messaging.suggestedkeyboard.core.composer.rows.avatar.AvatarSearchSuggestedRow";
                            r02.A0A("com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.avatar.AvatarSearchSuggestedRow", A0w, "com.facebook.messaging.suggestedkeyboard.plugins.interfaces.suggestionrow.SuggestedRowInterfaceSpec", andIncrement, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "com.facebook.messaging.suggestedkeyboard.plugins.core.SuggestedkeyboardCoreKillSwitch", "createViews");
                            AvatarSearchSuggestedRow avatarSearchSuggestedRow = iEz2.A01;
                            c0ty = C0s8.A14(new View[]{avatarSearchSuggestedRow.A06, avatarSearchSuggestedRow.A03});
                        } else if (A0i.equals("recent_emoji") && IEz.A03(iEz2)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            A0w = "messaging.suggestedkeyboard.core.composer.rows.recentemoji.RecentEmojiSuggestedRow";
                            r02.A0A("com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.recentemoji.RecentEmojiSuggestedRow", A0w, "com.facebook.messaging.suggestedkeyboard.plugins.interfaces.suggestionrow.SuggestedRowInterfaceSpec", andIncrement, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "com.facebook.messaging.suggestedkeyboard.plugins.core.SuggestedkeyboardCoreKillSwitch", "createViews");
                            RecentEmojiSuggestedRow recentEmojiSuggestedRow = iEz2.A04;
                            c0ty = C0s8.A14(new View[]{recentEmojiSuggestedRow.A02, recentEmojiSuggestedRow.A01});
                        } else if (A0i.equals(A008) && IEz.A05(iEz2)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            A0w = "messaging.suggestedkeyboard.core.composer.rows.sticker.StickerSearchSuggestionRow";
                            r02.A0A("com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.sticker.StickerSearchSuggestionRow", A0w, "com.facebook.messaging.suggestedkeyboard.plugins.interfaces.suggestionrow.SuggestedRowInterfaceSpec", andIncrement, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "com.facebook.messaging.suggestedkeyboard.plugins.core.SuggestedkeyboardCoreKillSwitch", "createViews");
                            StickerSearchSuggestionRow stickerSearchSuggestionRow = iEz2.A06;
                            c0ty = C0s8.A14(new View[]{stickerSearchSuggestionRow.A04, stickerSearchSuggestionRow.A02});
                        } else if (A0i.equals("regular_power_ups") && IEz.A04(iEz2)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            A0w = GOp.A19(r02, "createViews", andIncrement);
                            RegularPowerUpSuggestedRow regularPowerUpSuggestedRow = iEz2.A05;
                            c0ty = C0s8.A14(new View[]{regularPowerUpSuggestedRow.A0E, regularPowerUpSuggestedRow.A0B});
                        } else if (A0i.equals("avatar_power_ups") && IEz.A01(iEz2)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            A0w = GOo.A0x(r02, "createViews", andIncrement);
                            AvatarPowerUpSuggestedRow avatarPowerUpSuggestedRow = iEz2.A02;
                            c0ty = C0s8.A14(new View[]{avatarPowerUpSuggestedRow.A0H, avatarPowerUpSuggestedRow.A0E});
                        } else if (A0i.equals("sticker_hint") && IEz.A06(iEz2)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            A0w = GOo.A0w(r02, "createViews", andIncrement);
                            StickerHintSuggestedRow stickerHintSuggestedRow = iEz2.A07;
                            c0ty = C0s8.A14(new View[]{stickerHintSuggestedRow.A08, stickerHintSuggestedRow.A05});
                        } else {
                            r02.A02((Exception) null, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "createViews", andIncrement2);
                            c0ty = C0ty.A00;
                            0QU.A0t(c0ty, A0s3);
                        }
                        r02.A09(A0w, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "createViews", andIncrement);
                        r02.A02((Exception) null, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "createViews", andIncrement2);
                        0QU.A0t(c0ty, A0s3);
                    } catch (Throwable th2) {
                        r02.A02(e, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "createViews", andIncrement2);
                        throw th2;
                    }
                } else {
                    String it3 = A0s3.iterator();
                    while (it3.hasNext()) {
                        GOp.A1J(viewGroup2, (Iterator) it3);
                    }
                    HW9 hw93 = c2735Gmk.A02;
                    if (hw93 != null) {
                        IEz iEz3 = hw93.A00.A00;
                        AtomicInteger atomicInteger2 = C1Y6.A04;
                        int andIncrement3 = atomicInteger2.getAndIncrement();
                        1YC r03 = iEz3.A0I;
                        r03.A08("com.facebook.messaging.suggestedkeyboard.plugins.interfaces.suggestionrow.SuggestedRowInterfaceSpec", "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "onInit", andIncrement3);
                        try {
                            try {
                                if (IEz.A02(iEz3)) {
                                    i = atomicInteger2.getAndIncrement();
                                    it3 = "messaging.suggestedkeyboard.core.composer.rows.genai.GenAiSearchSuggestedRow";
                                    r03.A0A("com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.genai.GenAiSearchSuggestedRow", (String) it3, "com.facebook.messaging.suggestedkeyboard.plugins.interfaces.suggestionrow.SuggestedRowInterfaceSpec", i, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "com.facebook.messaging.suggestedkeyboard.plugins.core.SuggestedkeyboardCoreKillSwitch", "onInit");
                                    try {
                                        GenAiSearchSuggestedRow genAiSearchSuggestedRow2 = iEz3.A03;
                                        06Z r04 = iEz3.A0G;
                                        LifecycleOwner lifecycleOwner2 = iEz3.A0H;
                                        11T.A0F(r04, 0);
                                        11T.A0F(lifecycleOwner2, 1);
                                        IFE ife = genAiSearchSuggestedRow2.A0H;
                                        IgZ igZ = genAiSearchSuggestedRow2.A0E;
                                        GWm gWm = IFE.A01(ife).A07;
                                        if (gWm != null) {
                                            gWm.A07 = igZ;
                                        }
                                        GWm gWm2 = IFE.A01(ife).A07;
                                        if (gWm2 != null) {
                                            gWm2.A04 = r04;
                                        }
                                        GWm gWm3 = IFE.A01(ife).A07;
                                        if (gWm3 != null) {
                                            gWm3.A05 = lifecycleOwner2;
                                        }
                                        r03.A09((String) it3, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "onInit", i);
                                    } catch (Exception e3) {
                                        throw e3;
                                    }
                                }
                                if (IEz.A00(iEz3)) {
                                    int andIncrement4 = atomicInteger2.getAndIncrement();
                                    r03.A0A("com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.avatar.AvatarSearchSuggestedRow", "messaging.suggestedkeyboard.core.composer.rows.avatar.AvatarSearchSuggestedRow", "com.facebook.messaging.suggestedkeyboard.plugins.interfaces.suggestionrow.SuggestedRowInterfaceSpec", andIncrement4, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "com.facebook.messaging.suggestedkeyboard.plugins.core.SuggestedkeyboardCoreKillSwitch", "onInit");
                                    AvatarSearchSuggestedRow avatarSearchSuggestedRow2 = iEz3.A01;
                                    06Z r05 = iEz3.A0G;
                                    LifecycleOwner lifecycleOwner3 = iEz3.A0H;
                                    11T.A0F(r05, 0);
                                    11T.A0F(lifecycleOwner3, 1);
                                    IFE ife2 = avatarSearchSuggestedRow2.A07;
                                    GWm gWm4 = IFE.A01(ife2).A07;
                                    if (gWm4 != null) {
                                        gWm4.A04 = r05;
                                    }
                                    GWm gWm5 = IFE.A01(ife2).A07;
                                    if (gWm5 != null) {
                                        gWm5.A05 = lifecycleOwner3;
                                    }
                                    ((AvatarConfigRepository) 1Br.A0B(avatarSearchSuggestedRow2.A05)).A02(new IS2(avatarSearchSuggestedRow2));
                                    if (((CFy) 1Bn.A0A(68091)).A01(avatarSearchSuggestedRow2.A02, avatarSearchSuggestedRow2.A04)) {
                                        R0C.A00(r05);
                                    }
                                    r03.A09("messaging.suggestedkeyboard.core.composer.rows.avatar.AvatarSearchSuggestedRow", "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "onInit", andIncrement4);
                                }
                                if (IEz.A05(iEz3)) {
                                    int andIncrement5 = atomicInteger2.getAndIncrement();
                                    r03.A0A("com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.sticker.StickerSearchSuggestionRow", "messaging.suggestedkeyboard.core.composer.rows.sticker.StickerSearchSuggestionRow", "com.facebook.messaging.suggestedkeyboard.plugins.interfaces.suggestionrow.SuggestedRowInterfaceSpec", andIncrement5, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "com.facebook.messaging.suggestedkeyboard.plugins.core.SuggestedkeyboardCoreKillSwitch", "onInit");
                                    StickerSearchSuggestionRow stickerSearchSuggestionRow2 = iEz3.A06;
                                    06Z r06 = iEz3.A0G;
                                    LifecycleOwner lifecycleOwner4 = iEz3.A0H;
                                    11T.A0F(r06, 0);
                                    11T.A0F(lifecycleOwner4, 1);
                                    IFE ife3 = stickerSearchSuggestionRow2.A06;
                                    GWm gWm6 = IFE.A01(ife3).A07;
                                    if (gWm6 != null) {
                                        gWm6.A04 = r06;
                                    }
                                    GWm gWm7 = IFE.A01(ife3).A07;
                                    if (gWm7 != null) {
                                        gWm7.A05 = lifecycleOwner4;
                                    }
                                    IgZ igZ2 = new IgZ(stickerSearchSuggestionRow2, 2);
                                    GWm gWm8 = IFE.A01(ife3).A07;
                                    if (gWm8 != null) {
                                        gWm8.A07 = igZ2;
                                    }
                                    r03.A09("messaging.suggestedkeyboard.core.composer.rows.sticker.StickerSearchSuggestionRow", "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "onInit", andIncrement5);
                                }
                                if (IEz.A01(iEz3)) {
                                    int andIncrement6 = atomicInteger2.getAndIncrement();
                                    String A0x = GOo.A0x(r03, "onInit", andIncrement6);
                                    AvatarPowerUpSuggestedRow avatarPowerUpSuggestedRow2 = iEz3.A02;
                                    2aK.A03((Integer) null, 2Zo.A04(false), new AJX(avatarPowerUpSuggestedRow2, (0DR) null, 5), 2Zy.A00(avatarPowerUpSuggestedRow2.A05, 2Zo.A01()), 2);
                                    r03.A09(A0x, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "onInit", andIncrement6);
                                }
                                if (IEz.A06(iEz3)) {
                                    i = atomicInteger2.getAndIncrement();
                                    it3 = GOo.A0w(r03, "onInit", i);
                                    StickerHintSuggestedRow stickerHintSuggestedRow2 = iEz3.A07;
                                    06Z r07 = iEz3.A0G;
                                    LifecycleOwner lifecycleOwner5 = iEz3.A0H;
                                    11T.A0F(r07, 0);
                                    11T.A0F(lifecycleOwner5, 1);
                                    IFE ife4 = stickerHintSuggestedRow2.A09;
                                    GWm gWm9 = IFE.A01(ife4).A07;
                                    if (gWm9 != null) {
                                        gWm9.A04 = r07;
                                    }
                                    GWm gWm10 = IFE.A01(ife4).A07;
                                    if (gWm10 != null) {
                                        gWm10.A05 = lifecycleOwner5;
                                    }
                                    2aK.A03((Integer) null, 2Zo.A04(false), new AJU(stickerHintSuggestedRow2, null, 16), 2Zy.A00(lifecycleOwner5, 2Zo.A01()), 2);
                                    r03.A09((String) it3, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "onInit", i);
                                }
                                r03.A02((Exception) null, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "onInit", andIncrement3);
                                C2735Gmk.A00(c2735Gmk);
                                if (((C1uz) 1Br.A0B(c2735Gmk.A0D)).A02(15)) {
                                    C00i c00i2 = c2735Gmk.A0K.A00;
                                    if (C60t.A00((C60t) c00i2.get()).AZk(36313892654357669L)) {
                                        C60t.A00((C60t) c00i2.get()).AZr(1GD.A07, 36313892654488742L);
                                    }
                                }
                                c2735Gmk.A0f(LightColorScheme.A00());
                                6fA r08 = this.A08.A00.A0H;
                                c2735Gmk.A0n(r08 != null ? r08.A05 : null);
                                A00(this);
                                6PV.A00((6PV) 1Br.A0B(c2735Gmk.A0E)).AZk(36315473202258894L);
                                return c2735Gmk;
                            } catch (Throwable th3) {
                                r03.A04((Exception) null, it3, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "onInit", i);
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            r03.A02((Exception) null, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "onInit", andIncrement3);
                            throw th4;
                        }
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.Gmk, android.view.View] */
    public void C3C(ParcelableSecondaryData parcelableSecondaryData) {
        String str;
        Capabilities capabilities;
        6fA r0;
        ?? r02 = (C2735Gmk) ((IV9) this).A00;
        Hmj hmj = r02.A01;
        ThreadKey threadKey = null;
        if (hmj != null) {
            str = ((OneLineComposerView) hmj.A00.A06.A00).A0Z.A0R.A01().A00;
            if (str == null) {
                str = "";
            }
        } else {
            str = null;
        }
        I4b i4b = (I4b) 1Br.A0B(r02.A0O);
        Hmj hmj2 = r02.A01;
        if (hmj2 != null && (r0 = hmj2.A00.A07.A00.A0H) != null) {
            threadKey = r0.A02;
        }
        boolean A1V = GOo.A1V((View) r02);
        boolean A1T = AnonymousClass001.A1T(str);
        ((I5K) 1Br.A0B(i4b.A01)).A03(true);
        C00i c00i = i4b.A02.A00;
        ((HzA) c00i.get()).A00 = 7zR.A0s();
        HzA hzA = (HzA) c00i.get();
        if (!AnonymousClass001.A1O(hzA.A00.length())) {
            1UG A08 = 1BK.A08(1Br.A02(hzA.A02), 4YT.A00(403));
            if (A08.isSampled()) {
                GOn.A1Q(A08, hzA.A00);
                int i = 5;
                4YU.A1I(A08, "major_entry_point", 5);
                if (!A1T) {
                    i = 0;
                }
                4YU.A1I(A08, "minor_entry_point", i);
                A08.A5H("is_chathead", Boolean.valueOf(A1V));
                A08.A6H("thread_id", Long.valueOf(HzA.A00(threadKey, hzA)));
                A08.BZL();
            }
        }
        GWZ gwz = this.A00;
        if (gwz != null) {
            gwz.A02 = HML.A00;
            gwz.A07();
        }
        GWZ gwz2 = this.A00;
        if (gwz2 != null) {
            gwz2.A07();
        }
        6fA r03 = this.A08.A00.A0H;
        if (r03 == null || (capabilities = r03.A05) == null || !4YU.A1Y(capabilities, ActionId.PRIVACY_VIOLATION)) {
            return;
        }
        AnonymousClass842 A0t = 7zQ.A0t();
        6Qf r04 = this.A0B;
        r04.Bde(C6xf.A03);
        r04.Bde(A0t.A05() ? C6xf.A04 : C6xf.A05);
    }
}
