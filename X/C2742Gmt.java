package X;

import android.os.Parcelable;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.messaging.composer.params.ComposerInitParamsSpec$ComposerLaunchSource;
import com.facebook.messaging.stickers.keyboardopenparams.StickerLSKeyboardOpenParams;
import com.facebook.messaging.stickers.keyboardopenparams.StickerPackOpenParams;
import com.facebook.messaging.stickers.keyboardopenparams.StickerSuggestionsOpenParams;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* renamed from: X.Gmt, reason: case insensitive filesystem */
/* loaded from: Gmt.class */
public final class C2742Gmt extends IV9 {
    public final JGa A00;

    public C2742Gmt(JGa jGa) {
        this.A00 = jGa;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, X.Gml] */
    /* JADX WARN: Type inference failed for: r0v48, types: [android.view.View, X.Gml] */
    public static void A00(C2742Gmt c2742Gmt, ParcelableSecondaryData parcelableSecondaryData) {
        StickerLSKeyboardOpenParams stickerLSKeyboardOpenParams;
        C2736Gml c2736Gml;
        String str;
        if (parcelableSecondaryData != null && (stickerLSKeyboardOpenParams = (StickerLSKeyboardOpenParams) ParcelableSecondaryData.A00(parcelableSecondaryData, StickerLSKeyboardOpenParams.class, null)) != null) {
            int intValue = stickerLSKeyboardOpenParams.A00.intValue();
            if (intValue == 1) {
                c2736Gml = (C2736Gml) ((IV9) c2742Gmt).A00;
                str = "avatar_tab_id";
            } else if (intValue == 2) {
                c2736Gml = (C2736Gml) ((IV9) c2742Gmt).A00;
                str = "search_tab_id";
            } else {
                if (intValue == 4) {
                    ?? r0 = (C2736Gml) ((IV9) c2742Gmt).A00;
                    Parcelable A00 = ParcelableSecondaryData.A00(parcelableSecondaryData, StickerPackOpenParams.class, null);
                    A00.getClass();
                    String str2 = ((StickerPackOpenParams) A00).A00;
                    ComposerInitParamsSpec$ComposerLaunchSource composerInitParamsSpec$ComposerLaunchSource = ((IV9) c2742Gmt).A01;
                    C2736Gml.A0C(r0, str2);
                    if (r0.A0F == null) {
                        r0.A0F = 7zR.A0s();
                    }
                    ((I1j) 4YU.A0p(r0.A0R)).A01(composerInitParamsSpec$ComposerLaunchSource, r0.A04, r0.A0F, str2, GOo.A1V((View) r0));
                    return;
                }
                if (intValue == 5) {
                    C2736Gml c2736Gml2 = (C2736Gml) ((IV9) c2742Gmt).A00;
                    Parcelable A002 = ParcelableSecondaryData.A00(parcelableSecondaryData, StickerSuggestionsOpenParams.class, null);
                    A002.getClass();
                    String str3 = ((StickerSuggestionsOpenParams) A002).A00;
                    C2736Gml.A0C(c2736Gml2, "search_tab_id");
                    HGH A003 = C2736Gml.A00(c2736Gml2, c2736Gml2.A00);
                    if (A003 != null && A003.A03().equals("search_tab_id") && (A003 instanceof H0H)) {
                        H0H h0h = (H0H) A003;
                        11T.A0F(str3, 0);
                        H4x h4x = h0h.A04;
                        if (h4x != null) {
                            h4x.A0X(str3);
                            return;
                        } else {
                            h0h.A06 = str3;
                            return;
                        }
                    }
                    return;
                }
            }
            C2736Gml.A0C(c2736Gml, str);
            return;
        }
        ?? r02 = (C2736Gml) ((IV9) c2742Gmt).A00;
        ComposerInitParamsSpec$ComposerLaunchSource composerInitParamsSpec$ComposerLaunchSource2 = ((IV9) c2742Gmt).A01;
        if (r02.A0F == null) {
            r02.A0F = 7zR.A0s();
        }
        ((I1j) 4YU.A0p(r02.A0R)).A01(composerInitParamsSpec$ComposerLaunchSource2, r02.A04, r02.A0F, null, GOo.A1V((View) r02));
    }

    public void A02(06Z r302) {
        C2736Gml c2736Gml = (C2736Gml) ((IV9) this).A00;
        c2736Gml.A01 = r302;
        1Du it = c2736Gml.A0E.iterator();
        while (it.hasNext()) {
            ((HGH) it.next()).A06(r302);
        }
    }

    public void A03(LifecycleOwner lifecycleOwner) {
        C2736Gml c2736Gml = (C2736Gml) ((IV9) this).A00;
        c2736Gml.A02 = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(c2736Gml);
        1Du it = c2736Gml.A0E.iterator();
        while (it.hasNext()) {
            ((HGH) it.next()).A07(lifecycleOwner);
        }
        C2736Gml.A08(c2736Gml);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, X.Gml] */
    public void C3C(ParcelableSecondaryData parcelableSecondaryData) {
        ?? r0 = (C2736Gml) ((IV9) this).A00;
        r0.A0B.A00();
        ((I5X) 1Lo.A06(4YV.A0C(r0.getContext()), 116062)).A04.clear();
        r0.A0F = 7zR.A0s();
        A00(this, parcelableSecondaryData);
    }
}
