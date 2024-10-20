package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.stickers.model.StickerPack;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.6yk, reason: invalid class name */
/* loaded from: 6yk.class */
public final class C6yk implements C6ws {
    public final 5Ye A00;

    public C6yk(5Ye r302) {
        this.A00 = r302;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // X.C6ws
    public ListenableFuture AUS(Bundle bundle) {
        Parcelable parcelable = bundle.getParcelable("extra_sticker_pack");
        parcelable.getClass();
        StickerPack stickerPack = (StickerPack) parcelable;
        ?? obj = new Object();
        5Ye r0 = this.A00;
        r0.A00 = new IQM((Object) obj, this, 4);
        r0.A00(new HXv(stickerPack.A08));
        return obj;
    }
}
