package X;

import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.messaging.montage.model.art.ArtAsset;
import com.facebook.messaging.montage.model.art.LazyArtAsset;
import com.facebook.messaging.montage.model.montagemetadata.MontageMetadata;
import com.facebook.rsys.audio.gen.AudioStream;
import com.facebook.rsys.video.gen.VideoStream;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: J4h.class */
public final class J4h implements Comparator {
    public final int A00;

    public J4h(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Integer valueOf;
        int i;
        MontageMetadata montageMetadata;
        Float f;
        MontageMetadata montageMetadata2;
        Float f2;
        int i2;
        int i3;
        switch (this.A00) {
            case 0:
                I01 i01 = (I01) obj;
                I01 i012 = (I01) obj2;
                return ((((i012.A03 - i012.A06) + 1) * ((i012.A02 - i012.A05) + 1)) * ((i012.A01 - i012.A04) + 1)) - ((((i01.A03 - i01.A06) + 1) * ((i01.A02 - i01.A05) + 1)) * ((i01.A01 - i01.A04) + 1));
            case 1:
                return Long.signum(C3o5.A08((Map.Entry) obj) - C3o5.A08((Map.Entry) obj2));
            case 2:
                MontageBucketPreview montageBucketPreview = (MontageBucketPreview) obj;
                MontageBucketPreview montageBucketPreview2 = (MontageBucketPreview) obj2;
                long j = montageBucketPreview != null ? montageBucketPreview.A04.A05 : -1;
                long j2 = montageBucketPreview2 != null ? montageBucketPreview2.A04.A05 : -1;
                if (j < j2) {
                    return 1;
                }
                if (j > j2) {
                    return -1;
                }
                return 0;
            case 3:
                MontageBucketPreview montageBucketPreview3 = (MontageBucketPreview) obj;
                MontageBucketPreview montageBucketPreview4 = (MontageBucketPreview) obj2;
                float floatValue = (montageBucketPreview3 == null || (montageMetadata2 = montageBucketPreview3.A04.A0A) == null || (f2 = montageMetadata2.A0C) == null) ? -1.0f : f2.floatValue();
                float floatValue2 = (montageBucketPreview4 == null || (montageMetadata = montageBucketPreview4.A04.A0A) == null || (f = montageMetadata.A0C) == null) ? -1.0f : f.floatValue();
                if (floatValue < floatValue2) {
                    return 1;
                }
                if (floatValue <= floatValue2) {
                    return HO9.A02.compare(montageBucketPreview3, montageBucketPreview4);
                }
                return -1;
            case 4:
                C5nf c5nf = (C5nf) obj2;
                MontageBucketPreview montageBucketPreview5 = (MontageBucketPreview) ((C5nf) obj).A00;
                if (montageBucketPreview5 == null) {
                    i2 = 1003;
                } else if (montageBucketPreview5.A0A) {
                    i2 = 0;
                } else {
                    boolean z = montageBucketPreview5.A09;
                    int i4 = montageBucketPreview5.A00 * 10;
                    i2 = i4 + 2;
                    if (z) {
                        i2 = i4 + 1;
                    }
                }
                MontageBucketPreview montageBucketPreview6 = (MontageBucketPreview) c5nf.A00;
                if (montageBucketPreview6 == null) {
                    i3 = 1003;
                } else if (montageBucketPreview6.A0A) {
                    i3 = 0;
                } else {
                    boolean z2 = montageBucketPreview6.A09;
                    int i5 = montageBucketPreview6.A00 * 10;
                    i3 = i5 + 2;
                    if (z2) {
                        i3 = i5 + 1;
                    }
                }
                if (i2 < i3) {
                    return -1;
                }
                if (i2 > i3) {
                    return 1;
                }
                return 0;
            case 5:
                H9a h9a = ((LazyArtAsset) ((ArtAsset) obj)).A00;
                H9a h9a2 = H9a.TEXT;
                H9a h9a3 = ((LazyArtAsset) ((ArtAsset) obj2)).A00;
                return h9a == h9a2 ? h9a3 == h9a2 ? 0 : 1 : h9a3 == h9a2 ? -1 : 0;
            case 6:
                valueOf = Integer.valueOf(((DI9) obj).B4q());
                i = ((DI9) obj2).B4q();
                break;
            case 7:
                return 0DX.A00((Integer) ((03Y) obj).second, (Integer) ((03Y) obj2).second);
            case 8:
            case 9:
                valueOf = Integer.valueOf(((AudioStream) obj).type);
                i = ((AudioStream) obj2).type;
                break;
            case 10:
            case 11:
                valueOf = Integer.valueOf(((VideoStream) obj).streamInfo.streamType);
                i = ((VideoStream) obj2).streamInfo.streamType;
                break;
            case 12:
                long j3 = ((Huc) obj).A00;
                long j4 = ((Huc) obj2).A00;
                if (j3 < j4) {
                    return -1;
                }
                if (j3 > j4) {
                    return 1;
                }
                return 0;
            case 13:
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                return (((I9V) obj).A03(timeUnit) > ((I9V) obj2).A03(timeUnit) ? 1 : (((I9V) obj).A03(timeUnit) == ((I9V) obj2).A03(timeUnit) ? 0 : -1));
            default:
                return 0;
        }
        return 0DX.A00(valueOf, Integer.valueOf(i));
    }
}
