package X;

import com.facebook.messaging.photos.editing.ImageLayer;
import com.facebook.messaging.photos.editing.MediaOverlayLayer;
import com.facebook.messaging.photos.editing.SmartStickerLayer;
import com.facebook.messaging.photos.editing.StickerLayer;
import com.facebook.messaging.photos.editing.layer.Layer;
import com.facebook.messaging.photos.editing.layer.TextLayer;
import com.facebook.stickers.model.Sticker;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: Hus.class */
public final class Hus {
    public int A00;
    public ImmutableList A01;
    public int A02;
    public final List A06 = AnonymousClass001.A0s();
    public final HtI A03 = new HtI();
    public final HashMap A05 = AnonymousClass001.A0u();
    public final HashMap A04 = AnonymousClass001.A0u();

    public Layer A00() {
        Preconditions.checkArgument(7zM.A1b(this.A01));
        return (Layer) 1BK.A0r(this.A01);
    }

    public Layer A01(int i) {
        if (i < 0) {
            return null;
        }
        List list = this.A06;
        if (i < list.size()) {
            return (Layer) list.get(i);
        }
        return null;
    }

    public ImmutableList A02(Layer layer) {
        String str = layer.A0B;
        if (str == null) {
            return ImmutableList.of((Object) layer);
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            Layer A0q = GOn.A0q(it);
            if (str.equals(A0q.A0B)) {
                builder.m11011add((Object) A0q);
            }
        }
        return builder.build();
    }

    public ImmutableList A03(Class cls) {
        ImmutableList.Builder builder = ImmutableList.builder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.A06.size()) {
                return builder.build();
            }
            Layer A01 = A01(i2);
            if (A01 != null && cls.isInstance(A01)) {
                builder.m11011add((Object) A01);
            }
            i = i2 + 1;
        }
    }

    public void A04() {
        1Du it = ImmutableList.copyOf((Collection) this.A06).iterator();
        while (it.hasNext()) {
            A06(GOn.A0q(it));
        }
    }

    public void A05(Layer layer) {
        if (layer instanceof TextLayer) {
            this.A00++;
        } else if (layer instanceof StickerLayer) {
            Sticker sticker = ((StickerLayer) layer).A00;
            HashMap hashMap = this.A05;
            String str = sticker.A0F;
            Object obj = hashMap.get(str);
            Integer A0i = 7zN.A0i();
            if (obj == null) {
                hashMap.put(str, A0i);
            } else {
                AnonymousClass001.A1A(str, hashMap, GOq.A0E(str, hashMap) + 1);
            }
            HashMap hashMap2 = this.A04;
            String str2 = sticker.A0H;
            if (hashMap2.get(str2) != null) {
                A0i = Integer.valueOf(GOq.A0E(str2, hashMap2) + 1);
            }
            hashMap2.put(str2, A0i);
        } else if (layer instanceof SmartStickerLayer) {
            this.A02++;
        }
        this.A06.add(layer);
        this.A03.A02(new HUQ(layer));
        if (layer instanceof MediaOverlayLayer) {
            return;
        }
        A07(A02(layer));
    }

    public void A06(Layer layer) {
        List list = this.A06;
        int indexOf = list.indexOf(layer);
        if (indexOf >= 0) {
            if (layer instanceof TextLayer) {
                this.A00--;
            } else if (layer instanceof StickerLayer) {
                Sticker sticker = ((StickerLayer) layer).A00;
                HashMap hashMap = this.A05;
                String str = sticker.A0F;
                if (hashMap.get(str) != null) {
                    AnonymousClass001.A1A(str, hashMap, GOq.A0E(str, hashMap) - 1);
                    if (GOq.A0E(str, hashMap) == 0) {
                        hashMap.remove(str);
                    }
                }
                HashMap hashMap2 = this.A04;
                String str2 = sticker.A0H;
                if (hashMap2.get(str2) != null) {
                    AnonymousClass001.A1A(str2, hashMap2, GOq.A0E(str2, hashMap2) - 1);
                    if (GOq.A0E(str2, hashMap2) == 0) {
                        hashMap2.remove(str2);
                    }
                }
            } else if (layer instanceof SmartStickerLayer) {
                this.A02--;
            }
            list.remove(layer);
            this.A03.A02(new HUQ(layer));
            ImmutableList immutableList = this.A01;
            if (immutableList != null) {
                1Du it = immutableList.iterator();
                while (it.hasNext()) {
                    if (layer == it.next()) {
                        int min = Math.min(AnonymousClass001.A04(list), indexOf);
                        A07(min >= 0 ? A02((Layer) list.get(min)) : null);
                        return;
                    }
                }
            }
        }
    }

    public void A07(ImmutableList immutableList) {
        ImmutableList immutableList2 = this.A01;
        if (immutableList2 == null || !immutableList2.equals(immutableList)) {
            ImmutableList immutableList3 = this.A01;
            this.A01 = immutableList;
            if (immutableList != null) {
                1Du it = immutableList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    List list = this.A06;
                    int indexOf = list.indexOf(next);
                    if ((next instanceof StickerLayer) || (next instanceof ImageLayer)) {
                        list.remove(indexOf);
                        list.add(next);
                    }
                }
            }
            this.A03.A02(new Hb8(immutableList, immutableList3));
        }
    }
}
