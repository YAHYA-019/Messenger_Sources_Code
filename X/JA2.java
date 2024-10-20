package X;

import android.content.Context;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: JA2.class */
public final class JA2 extends C00q implements Function1 {
    public final /* synthetic */ Context $c;
    public final /* synthetic */ Function1 $callback;
    public final /* synthetic */ List $images;
    public final /* synthetic */ 0PI $imagesAttemptedToSave;
    public final /* synthetic */ 0PI $imagesSaved;
    public final /* synthetic */ List $mediaUris;
    public final /* synthetic */ boolean $suppressToast;
    public final /* synthetic */ IDb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JA2(Context context, IDb iDb, List list, List list2, Function1 function1, 0PI r307, 0PI r308, boolean z) {
        super(1);
        this.$c = context;
        this.$imagesSaved = r307;
        this.$imagesAttemptedToSave = r308;
        this.$mediaUris = list;
        this.$images = list2;
        this.$suppressToast = z;
        this.this$0 = iDb;
        this.$callback = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        java.util.Map map = (java.util.Map) obj;
        11T.A0F(map, 0);
        String A0b = AnonymousClass001.A0b("save result", map);
        if ((A0b != null && A0b.equals("true")) || 0CV.A0a(AnonymousClass001.A0b("reason for failure", map), this.$c.getString(2131957788), false)) {
            this.$imagesSaved.element++;
        }
        this.$imagesAttemptedToSave.element++;
        Object obj2 = map.get("saved media uri");
        if (obj2 != null) {
            this.$mediaUris.add(obj2);
        }
        if (this.$imagesAttemptedToSave.element == this.$images.size()) {
            if (!this.$suppressToast) {
                ((9aT) 1Br.A0B(this.this$0.A03)).A01(this.$c, new FEd(AnonymousClass001.A1b(Integer.valueOf(this.$imagesSaved.element), this.$imagesAttemptedToSave.element), 2131957796));
            }
            Function1 function1 = this.$callback;
            03Y A1G = 1BK.A1G("save result", "true");
            List list = this.$mediaUris;
            11T.A0F(list, 0);
            function1.invoke(4YW.A0A(DKB.A00(522), 4YV.A0t(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list, (Function1) null), A1G));
        }
        return 04S.A00;
    }
}
