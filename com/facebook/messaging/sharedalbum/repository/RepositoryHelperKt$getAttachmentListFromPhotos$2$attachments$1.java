package com.facebook.messaging.sharedalbum.repository;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.C03853z9;
import X.C6kg;
import X.I4Y;
import com.facebook.messaging.sharedalbum.model.Photos;
import kotlin.jvm.functions.Function2;

/* loaded from: RepositoryHelperKt$getAttachmentListFromPhotos$2$attachments$1.class */
public final class RepositoryHelperKt$getAttachmentListFromPhotos$2$attachments$1 extends 0DO implements Function2 {
    public final /* synthetic */ I4Y $imageFetcher;
    public final /* synthetic */ C6kg $mediaResourceUtil;
    public final /* synthetic */ Photos $photoList;
    public final /* synthetic */ C03853z9 $tamAttachmentUtil;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepositoryHelperKt$getAttachmentListFromPhotos$2$attachments$1(Photos photos, C6kg c6kg, C03853z9 c03853z9, I4Y i4y, 0DR r306) {
        super(2, r306);
        this.$photoList = photos;
        this.$imageFetcher = i4y;
        this.$tamAttachmentUtil = c03853z9;
        this.$mediaResourceUtil = c6kg;
    }

    public final 0DR create(Object obj, 0DR r303) {
        Photos photos = this.$photoList;
        I4Y i4y = this.$imageFetcher;
        return new RepositoryHelperKt$getAttachmentListFromPhotos$2$attachments$1(photos, this.$mediaResourceUtil, this.$tamAttachmentUtil, i4y, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00c8 -> B:6:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.sharedalbum.repository.RepositoryHelperKt$getAttachmentListFromPhotos$2$attachments$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
