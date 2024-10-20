package X;

import com.facebook.stickers.generatedstickers.search.GeneratedStickerSearchFragment;
import com.facebook.stickers.keyboardls.stickergrid.StickerGridView;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Gef, reason: case insensitive filesystem */
/* loaded from: Gef.class */
public final class C2484Gef extends 1RM {
    public final String A00;
    public final boolean A01;
    public final /* synthetic */ GeneratedStickerSearchFragment A02;

    public C2484Gef(GeneratedStickerSearchFragment generatedStickerSearchFragment, String str, boolean z) {
        this.A02 = generatedStickerSearchFragment;
        this.A00 = str;
        this.A01 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.facebook.stickers.generatedstickers.search.GeneratedStickerSearchFragment, androidx.fragment.app.Fragment] */
    public /* bridge */ /* synthetic */ void A02(Object obj) {
        C2636Gjo c2636Gjo = (C2636Gjo) obj;
        11T.A0F(c2636Gjo, 0);
        ?? r0 = this.A02;
        GeneratedStickerSearchFragment.A0C(r0);
        String str = this.A00;
        r0.A0J = str;
        ImmutableList.Builder builder = ImmutableList.builder();
        boolean z = r0.A0Z;
        ImmutableList immutableList = null;
        if (!z) {
            builder.addAll(r0.A0B != null ? StickerGridView.A00((ImmutableList) c2636Gjo.A02, null) : null);
        }
        boolean z2 = this.A01;
        GeneratedStickerSearchFragment.A0C(r0);
        if (AbstractC2326GOr.A0Q(r0).AZk(36320953581649759L) && 11T.A0O(str, r0.A0J) && z2) {
            builder.addAll(r0.A0F);
        }
        if (z) {
            if (r0.A0B != null) {
                immutableList = StickerGridView.A00((ImmutableList) c2636Gjo.A02, null);
            }
            builder.addAll(immutableList);
        }
        ImmutableList build = builder.build();
        r0.A0F = build;
        if (build.isEmpty()) {
            String str2 = c2636Gjo.A03;
            if (str2 == null) {
                str2 = r0.getText(2131957279);
            }
            11T.A0D(str2);
            GeneratedStickerSearchFragment.A0E(r0, str2);
        } else {
            StickerGridView stickerGridView = r0.A0B;
            if (stickerGridView != null) {
                stickerGridView.A0f(null, build, null, str, true);
            }
            if (AbstractC2326GOr.A0Q(r0).AZk(36320953581649759L)) {
                7zP.A0N(r0.A0M).CY4(new IyJ((GeneratedStickerSearchFragment) r0, build), 100);
            }
            GeneratedStickerSearchFragment.A0F(r0, 0S2.A0C);
        }
        GeneratedStickerSearchFragment.A0C(r0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.stickers.generatedstickers.search.GeneratedStickerSearchFragment, androidx.fragment.app.Fragment] */
    public void A03(Throwable th) {
        ?? r0 = this.A02;
        CharSequence text = r0.getText(2131957279);
        11T.A0A(text);
        GeneratedStickerSearchFragment.A0E(r0, text);
        GeneratedStickerSearchFragment.A0C(r0);
    }
}
