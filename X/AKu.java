package X;

import java.io.File;

/* loaded from: AKu.class */
public final class AKu extends C00q implements C00m {
    public final /* synthetic */ IllegalArgumentException $exception;
    public final /* synthetic */ int $imageHeight;
    public final /* synthetic */ int $imageWidth;
    public final /* synthetic */ String $path;
    public final /* synthetic */ int $targetContainerHeight;
    public final /* synthetic */ int $targetContainerWidth;
    public final /* synthetic */ C3Sm this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKu(C3Sm c3Sm, IllegalArgumentException illegalArgumentException, String str, int i, int i2, int i3, int i4) {
        super(0);
        this.this$0 = c3Sm;
        this.$exception = illegalArgumentException;
        this.$path = str;
        this.$imageWidth = i;
        this.$imageHeight = i2;
        this.$targetContainerWidth = i3;
        this.$targetContainerHeight = i4;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass047 ACu = this.this$0.A00.ACu("decode_file_error", 794504198);
        IllegalArgumentException illegalArgumentException = this.$exception;
        if (illegalArgumentException != null) {
            ACu.Cmr(illegalArgumentException);
        }
        String str = this.$path;
        if (str != null) {
            ACu.A8K("input_path", str);
            File A0E = AnonymousClass001.A0E(this.$path);
            ACu.A8L("file_exists", A0E.exists());
            ACu.A8J("file_size", A0E.length());
        }
        ACu.A8I(JQw.A00(9), this.$imageWidth);
        ACu.A8I(JQw.A00(23), this.$imageHeight);
        ACu.A8I("target_container_width", this.$targetContainerWidth);
        ACu.A8I("target_container_height", this.$targetContainerHeight);
        ACu.report();
        return 04S.A00;
    }
}
