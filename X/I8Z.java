package X;

import android.graphics.Color;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.messaging.montage.model.art.ArtAsset;
import com.facebook.messaging.montage.model.art.ArtItem;
import com.facebook.messaging.montage.model.art.ImageAsset;
import com.facebook.messaging.montage.model.art.LazyArtAsset;
import com.facebook.messaging.montage.model.art.StickerAsset;
import com.facebook.messaging.montage.model.art.TextAsset;
import com.facebook.messaging.photos.editing.ImageLayer;
import com.facebook.messaging.photos.editing.SmartStickerLayer;
import com.facebook.messaging.photos.editing.layer.Layer;
import com.facebook.messaging.photos.editing.layer.TextLayer;
import com.facebook.stickers.model.Sticker;
import java.text.DateFormat;
import java.util.Date;

/* loaded from: I8Z.class */
public final class I8Z {
    public final 1GS A00 = (1GS) 1Bi.A03(16504);

    public static final Hiu A00(ArtAsset artAsset) {
        11T.A0F(artAsset, 0);
        float f = artAsset.A00().A03;
        float f2 = artAsset.A00().A00;
        float f3 = artAsset.A00().A01;
        float f4 = artAsset.A00().A02;
        HA0 ha0 = artAsset.A00().A04;
        11T.A09(ha0);
        H9b h9b = artAsset.A00().A05;
        11T.A09(h9b);
        H9c h9c = artAsset.A00().A06;
        11T.A09(h9c);
        return new Hiu(ha0, h9b, h9c, f, f2, f3, f4);
    }

    public static final Hiu A01(ArtAsset artAsset) {
        11T.A0F(artAsset, 0);
        float f = artAsset.A01().A03;
        float f2 = artAsset.A01().A00;
        float f3 = artAsset.A01().A01;
        float f4 = artAsset.A01().A02;
        HA0 ha0 = artAsset.A01().A04;
        11T.A09(ha0);
        H9b h9b = artAsset.A01().A05;
        11T.A09(h9b);
        H9c h9c = artAsset.A01().A06;
        11T.A09(h9c);
        return new Hiu(ha0, h9b, h9c, f, f2, f3, f4);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [com.facebook.messaging.photos.editing.SmartStickerLayer, com.facebook.messaging.photos.editing.LocationSmartStickerLayer] */
    public SmartStickerLayer A02(ArtItem artItem, int i) {
        HB0 hb0 = artItem.A03;
        if (!AnonymousClass001.A1T(hb0)) {
            return null;
        }
        int ordinal = hb0.ordinal();
        if (ordinal == 0) {
            ?? smartStickerLayer = new SmartStickerLayer(this.A00, artItem);
            smartStickerLayer.A00 = i;
            return smartStickerLayer;
        }
        if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            return new SmartStickerLayer(this.A00, artItem);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v76, types: [com.facebook.messaging.photos.editing.layer.Layer, com.facebook.messaging.photos.editing.StickerLayer] */
    public Layer A03(ArtAsset artAsset, ArtItem artItem, Integer num) {
        String str;
        int i;
        H9J h9j;
        if (artAsset instanceof TextAsset) {
            TextAsset textAsset = (TextAsset) artAsset;
            Integer num2 = 0S2.A00;
            boolean z = true;
            boolean z2 = false;
            if (num != num2) {
                z2 = true;
                z = false;
            }
            boolean z3 = ((LazyArtAsset) textAsset).A04;
            String A0r = z3 ? ((2JY) ((LazyArtAsset) textAsset).A03).A0r(951530617) : textAsset.A02;
            if (textAsset.A06() == HA1.TIME) {
                A0r = DateFormat.getTimeInstance(3, this.A00.A05()).format(new Date());
                z = false;
            }
            float A03 = textAsset.A03();
            float A02 = textAsset.A02();
            Hiu A00 = A00(artAsset);
            Hiu A01 = A01(artAsset);
            if (z3) {
                2JY r0 = (2JY) ((LazyArtAsset) textAsset).A03;
                i = Color.parseColor(0Pz.A0W("#", r0.A0r(94842723)));
                h9j = "dominant_color_of_sticker".equalsIgnoreCase(r0.A0r(2051717984)) ? H9J.A02 : H9J.A01;
            } else {
                i = textAsset.A00;
                h9j = textAsset.A01;
            }
            return new TextLayer(textAsset.A05(), artItem, h9j, textAsset.A06(), A00, A01, A0r, num2, textAsset.A04(), A03, A02, i, z2, z);
        }
        if (artAsset instanceof StickerAsset) {
            StickerAsset stickerAsset = (StickerAsset) artAsset;
            float A032 = stickerAsset.A03();
            float A022 = stickerAsset.A02();
            Hiu A002 = A00(artAsset);
            Hiu A012 = A01(artAsset);
            Sticker sticker = stickerAsset.A00;
            ?? layer = new Layer(artItem, A002, A012, stickerAsset.A04(), A032, A022);
            layer.A00 = sticker;
            return layer;
        }
        if (!(artAsset instanceof ImageAsset)) {
            return null;
        }
        ImageAsset imageAsset = (ImageAsset) artAsset;
        float A033 = imageAsset.A03();
        float A023 = imageAsset.A02();
        Hiu A003 = A00(artAsset);
        Hiu A013 = A01(artAsset);
        if (imageAsset.A04) {
            2JY A0I = AbF.A0I((2JY) imageAsset.A03, -102393834);
            str = A0I == null ? null : A0I.A0l();
        } else {
            str = imageAsset.A00;
        }
        String A04 = imageAsset.A04();
        Object obj = imageAsset.A03;
        return new ImageLayer(artItem, A003, A013, str, A04, A033, A023, obj == null ? false : ((TreeJNI) obj).getBooleanValue(1738762375), false, false);
    }
}
