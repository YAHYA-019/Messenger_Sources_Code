package com.facebook.photos.local;

import X.04S;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.0Ml;
import X.0Mn;
import X.11T;
import X.1Br;
import X.AnonymousClass001;
import X.I72;
import X.IEb;
import X.RLs;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.ipc.media.MediaItem;
import kotlin.jvm.functions.Function2;

/* loaded from: MediaCursorUtil$getMediaItems$1.class */
public final class MediaCursorUtil$getMediaItems$1 extends 0Ml implements Function2 {
    public final /* synthetic */ boolean $supportsSphericalData;
    public final /* synthetic */ boolean $supportsVideoMetadata;
    public final /* synthetic */ Cursor $this_getMediaItems;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ I72 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCursorUtil$getMediaItems$1(Cursor cursor, I72 i72, 0DR r304, boolean z, boolean z2) {
        super(2, r304);
        this.$this_getMediaItems = cursor;
        this.this$0 = i72;
        this.$supportsSphericalData = z;
        this.$supportsVideoMetadata = z2;
    }

    public final 0DR create(Object obj, 0DR r303) {
        MediaCursorUtil$getMediaItems$1 mediaCursorUtil$getMediaItems$1 = new MediaCursorUtil$getMediaItems$1(this.$this_getMediaItems, this.this$0, r303, this.$supportsSphericalData, this.$supportsVideoMetadata);
        mediaCursorUtil$getMediaItems$1.L$0 = obj;
        return mediaCursorUtil$getMediaItems$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create(obj, (0DR) obj2).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0Mn r306;
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            r306 = (0Mn) this.L$0;
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0M();
            }
            r306 = (0Mn) this.L$0;
            0Dt.A00(obj);
        }
        while (this.$this_getMediaItems.moveToNext()) {
            IEb iEb = (IEb) 1Br.A0B(this.this$0.A00);
            Cursor cursor = this.$this_getMediaItems;
            boolean z = this.$supportsSphericalData;
            boolean z2 = this.$supportsVideoMetadata;
            11T.A0F(cursor, 0);
            MediaItem A09 = iEb.A09(new RLs(cursor, (Uri) null, false), (String) null, (String) null, z, z2);
            this.L$0 = r306;
            this.label = 1;
            if (r306.A00(A09, this) == r0) {
                return r0;
            }
        }
        return 04S.A00;
    }
}
