package com.facebook.video.plugins;

import X.11T;
import X.1Bi;
import X.6TI;
import X.7zN;
import X.AbR;
import X.C6d6;
import X.DKF;
import X.DKG;
import X.EgA;
import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: SeekBarPreviewThumbnailPlugin.class */
public final class SeekBarPreviewThumbnailPlugin extends C6d6 {
    public final AbR A00;
    public final EgA A01;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeekBarPreviewThumbnailPlugin(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeekBarPreviewThumbnailPlugin(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekBarPreviewThumbnailPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A00 = 7zN.A0C(422);
        this.A01 = (EgA) 1Bi.A03(99561);
    }

    public /* synthetic */ SeekBarPreviewThumbnailPlugin(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    @Override // X.C6d6
    public String A0H() {
        return "SeekBarPreviewThumbnailPlugin";
    }

    @Override // X.C6d6
    public void A0e(6TI r302, boolean z) {
        11T.A0F(r302, 0);
    }
}
