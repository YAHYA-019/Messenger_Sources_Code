package X;

/* loaded from: AKp.class */
public final class AKp extends C00q implements C00m {
    public final /* synthetic */ int $encodeQuality;
    public final /* synthetic */ int $imageHeight;
    public final /* synthetic */ int $imageWidth;
    public final /* synthetic */ boolean $isHD;
    public final /* synthetic */ int $outputBufferSize;
    public final /* synthetic */ C3Sm this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKp(C3Sm c3Sm, int i, int i2, int i3, int i4, boolean z) {
        super(0);
        this.this$0 = c3Sm;
        this.$encodeQuality = i;
        this.$isHD = z;
        this.$imageWidth = i2;
        this.$imageHeight = i3;
        this.$outputBufferSize = i4;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass047 ACu = this.this$0.A00.ACu("compress_bitmap_error", 794504198);
        ACu.A8I("encode_quality", this.$encodeQuality);
        ACu.A8L("is_hd_image", this.$isHD);
        ACu.A8I(JQw.A00(9), this.$imageWidth);
        ACu.A8I(JQw.A00(23), this.$imageHeight);
        ACu.A8I("output_buffer_size", this.$outputBufferSize);
        ACu.report();
        return 04S.A00;
    }
}
