package com.facebook.avatar.autogen.presenter;

import X.04S;
import X.0DO;
import X.0DR;
import X.IO7;
import android.graphics.Rect;
import kotlin.jvm.functions.Function2;

/* loaded from: AECapturePresenter$saveImage$1.class */
public final class AECapturePresenter$saveImage$1 extends 0DO implements Function2 {
    public final /* synthetic */ Rect $cropRect;
    public final /* synthetic */ byte[] $data;
    public final /* synthetic */ int $frameHeight;
    public final /* synthetic */ int $frameWidth;
    public final /* synthetic */ int $rotation;
    public int label;
    public final /* synthetic */ IO7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AECapturePresenter$saveImage$1(Rect rect, IO7 io7, 0DR r304, byte[] bArr, int i, int i2, int i3) {
        super(2, r304);
        this.this$0 = io7;
        this.$data = bArr;
        this.$frameWidth = i;
        this.$frameHeight = i2;
        this.$cropRect = rect;
        this.$rotation = i3;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new AECapturePresenter$saveImage$1(this.$cropRect, this.this$0, r303, this.$data, this.$frameWidth, this.$frameHeight, this.$rotation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create(obj, (0DR) obj2).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0298  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.autogen.presenter.AECapturePresenter$saveImage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
