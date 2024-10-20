package X;

import com.facebook.messaging.montage.model.art.ImageAsset;
import com.facebook.messaging.montage.model.art.StickerAsset;
import com.facebook.messaging.montage.model.art.TextAsset;
import com.facebook.stickers.model.Sticker;
import com.google.common.collect.ImmutableList;

/* loaded from: I0k.class */
public final class I0k {
    public static ImmutableList A00(ImmutableList immutableList, ImmutableList immutableList2, java.util.Map map) {
        Object stickerAsset;
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            2JX A0D = AbG.A0D(it);
            C2559GhY c2559GhY = (C2559GhY) A0D.A0L(-1890252483, C2559GhY.class, -1095075201);
            if (c2559GhY != null) {
                Sticker sticker = (Sticker) map.get(c2559GhY.A0k());
                if (sticker != null) {
                    stickerAsset = new StickerAsset(A0D, sticker);
                    builder.m11011add(stickerAsset);
                }
            } else {
                2JY A0I = AbF.A0I(A0D, -102393834);
                if (A0I != null && A0I.A0l() != null) {
                    stickerAsset = new ImageAsset(A0D);
                    builder.m11011add(stickerAsset);
                }
            }
        }
        1Du it2 = immutableList2.iterator();
        while (it2.hasNext()) {
            builder.m11011add((Object) new TextAsset(AbG.A0D(it2)));
        }
        return builder.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0194, code lost:
    
        if ("image/webp".equalsIgnoreCase(r0) != false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v78, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r1v15, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r302v0, types: [X.Ghv, X.2JY, com.facebook.graphservice.tree.TreeJNI] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.messaging.montage.model.art.ArtItem A01(X.C2582Ghv r302, X.Hg2 r303, java.util.Map r304) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I0k.A01(X.Ghv, X.Hg2, java.util.Map):com.facebook.messaging.montage.model.art.ArtItem");
    }
}
