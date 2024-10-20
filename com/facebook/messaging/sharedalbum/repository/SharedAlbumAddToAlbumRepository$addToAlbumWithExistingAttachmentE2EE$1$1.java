package com.facebook.messaging.sharedalbum.repository;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.11T;
import X.1Br;
import X.2aG;
import X.5HP;
import X.9gK;
import X.AJg;
import X.AR9;
import X.AnonymousClass001;
import X.C03853z9;
import X.C6kg;
import X.Ho4;
import X.HoV;
import android.os.Parcelable;
import com.facebook.messaging.sharedalbum.model.Photos;
import com.facebook.messaging.sharedimage.SharedMedia;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.xapp.messaging.threadview.model.video.VideoAttachment;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: SharedAlbumAddToAlbumRepository$addToAlbumWithExistingAttachmentE2EE$1$1.class */
public final class SharedAlbumAddToAlbumRepository$addToAlbumWithExistingAttachmentE2EE$1$1 extends 0DO implements Function2 {
    public final /* synthetic */ long $albumId;
    public final /* synthetic */ long $entryPoint;
    public final /* synthetic */ Parcelable $mediaItems;
    public final /* synthetic */ long $serverThreadKey;
    public int label;
    public final /* synthetic */ 9gK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedAlbumAddToAlbumRepository$addToAlbumWithExistingAttachmentE2EE$1$1(Parcelable parcelable, 9gK r303, 0DR r304, long j, long j2, long j3) {
        super(2, r304);
        this.$mediaItems = parcelable;
        this.this$0 = r303;
        this.$serverThreadKey = j;
        this.$albumId = j2;
        this.$entryPoint = j3;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new SharedAlbumAddToAlbumRepository$addToAlbumWithExistingAttachmentE2EE$1$1(this.$mediaItems, this.this$0, r303, this.$serverThreadKey, this.$albumId, this.$entryPoint);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object A0B;
        Object A0B2;
        Object A0B3;
        int i;
        Parcelable parcelable;
        Object obj2 = obj;
        0Ds r0 = 0Ds.A02;
        int i2 = this.label;
        if (i2 == 0) {
            0Dt.A00(obj);
            Parcelable parcelable2 = this.$mediaItems;
            if (!(parcelable2 instanceof Photos)) {
                boolean z = parcelable2 instanceof VideoAttachment;
                if (!z) {
                    if (parcelable2 instanceof SharedMedia) {
                        SharedMedia sharedMedia = (SharedMedia) parcelable2;
                        if (sharedMedia.A02.A0Q != 5HP.A0H) {
                            A0B = 1Br.A0B(this.this$0.A01);
                            A0B2 = 1Br.A0B(this.this$0.A05);
                            A0B3 = 1Br.A0B(this.this$0.A04);
                            this.label = 2;
                            i = 13;
                            parcelable = sharedMedia;
                        }
                    }
                    return 04S.A00;
                }
                9gK r02 = this.this$0;
                AR9 ar9 = new AR9(r02, this.$serverThreadKey, this.$albumId, this.$entryPoint);
                if (z) {
                    VideoAttachment videoAttachment = (VideoAttachment) parcelable2;
                    RepositoryHelperKt.A07((HoV) 1Br.A0B(r02.A06), (C6kg) 1Br.A0B(r02.A04), (Ho4) r02.A07.getValue(), (C03853z9) 1Br.A0B(r02.A05), videoAttachment, ar9);
                } else if (parcelable2 instanceof SharedMedia) {
                    MediaResource mediaResource = ((SharedMedia) parcelable2).A02;
                    11T.A0A(mediaResource);
                    RepositoryHelperKt.A06((HoV) 1Br.A0B(r02.A06), (C6kg) 1Br.A0B(r02.A04), mediaResource, (Ho4) r02.A07.getValue(), (C03853z9) 1Br.A0B(r02.A05), ar9);
                }
                return 04S.A00;
            }
            parcelable = parcelable2;
            A0B = 1Br.A0B(this.this$0.A01);
            A0B2 = 1Br.A0B(this.this$0.A05);
            A0B3 = 1Br.A0B(this.this$0.A04);
            this.label = 1;
            i = 12;
            obj2 = 2aG.A00(this, new AJg(A0B2, A0B, A0B3, parcelable, null, i));
            if (obj2 == r0) {
                return r0;
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw AnonymousClass001.A0M();
            }
            0Dt.A00(obj);
        }
        9gK.A00(this.this$0, (List) obj2, this.$serverThreadKey, this.$albumId, this.$entryPoint);
        return 04S.A00;
    }
}
