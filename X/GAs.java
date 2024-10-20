package X;

import android.util.SparseArray;
import androidx.lifecycle.LiveData;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.otc.models.OtcInput;
import kotlin.jvm.functions.Function1;

/* loaded from: GAs.class */
public final class GAs extends C00q implements Function1 {
    public final /* synthetic */ String $id;
    public final /* synthetic */ LoggingContext $loggingContext;
    public final /* synthetic */ LiveData $mutationLiveData;
    public final /* synthetic */ String $mutationType;
    public final /* synthetic */ OtcInput $otcInput;
    public final /* synthetic */ OtcInput $otcInputForCacheKey;
    public final /* synthetic */ String $productId;
    public final /* synthetic */ SparseArray $state;
    public final /* synthetic */ LZr this$0;
    public final /* synthetic */ boolean $skipValidation = true;
    public final /* synthetic */ String $loggingViewName = "pux_checkout";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GAs(SparseArray sparseArray, LiveData liveData, LZr lZr, LoggingContext loggingContext, OtcInput otcInput, OtcInput otcInput2, String str, String str2, String str3) {
        super(1);
        this.$loggingContext = loggingContext;
        this.$mutationType = str;
        this.this$0 = lZr;
        this.$state = sparseArray;
        this.$otcInput = otcInput;
        this.$productId = str2;
        this.$otcInputForCacheKey = otcInput2;
        this.$mutationLiveData = liveData;
        this.$id = str3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d3, code lost:
    
        if (r309 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e6, code lost:
    
        if (r309 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02b6, code lost:
    
        if (r303 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02ac, code lost:
    
        if (r303 != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x029c  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GAs.invoke(java.lang.Object):java.lang.Object");
    }
}
