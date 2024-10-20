package com.facebook.messaging.montage.composer.magicmod.service;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.8Ls;
import X.AnonymousClass001;
import android.graphics.Bitmap;
import com.facebook.auth.usersession.FbUserSession;
import kotlin.jvm.functions.Function1;

/* loaded from: MagicModUploadImageService$getUploadedImageFileHandle$result$1.class */
public final class MagicModUploadImageService$getUploadedImageFileHandle$result$1 extends 0DO implements Function1 {
    public final /* synthetic */ Bitmap $bitmap;
    public final /* synthetic */ FbUserSession $fbUserSession;
    public final /* synthetic */ 8Ls $image;
    public int label;
    public final /* synthetic */ MagicModUploadImageService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagicModUploadImageService$getUploadedImageFileHandle$result$1(Bitmap bitmap, FbUserSession fbUserSession, 8Ls r304, MagicModUploadImageService magicModUploadImageService, 0DR r306) {
        super(1, r306);
        this.this$0 = magicModUploadImageService;
        this.$fbUserSession = fbUserSession;
        this.$image = r304;
        this.$bitmap = bitmap;
    }

    public final 0DR create(0DR r302) {
        MagicModUploadImageService magicModUploadImageService = this.this$0;
        return new MagicModUploadImageService$getUploadedImageFileHandle$result$1(this.$bitmap, this.$fbUserSession, this.$image, magicModUploadImageService, r302);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return create((0DR) obj).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            MagicModUploadImageService magicModUploadImageService = this.this$0;
            FbUserSession fbUserSession = this.$fbUserSession;
            String str = this.$image.A01;
            Bitmap bitmap = this.$bitmap;
            this.label = 1;
            obj = MagicModUploadImageService.A00(bitmap, fbUserSession, magicModUploadImageService, str, this);
            if (obj == r0) {
                return r0;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0M();
            }
            0Dt.A00(obj);
        }
        return obj;
    }
}
