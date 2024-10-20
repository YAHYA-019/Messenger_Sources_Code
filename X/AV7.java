package X;

import com.facebook.acra.constants.ActionId;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* loaded from: AV7.class */
public final class AV7 extends C00q implements Function1 {
    public final int A00;
    public final Object A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AV7(String str, Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public static LinkedHashMap A00(C3029Jgs c3029Jgs, boolean z) {
        Kzj A04 = c3029Jgs.A04();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LEL.A08(A04, linkedHashMap);
        String A00 = DKB.A00(ActionId.QUERY_READY);
        if (z) {
            linkedHashMap.put(A00, String.valueOf(z));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0129, code lost:
    
        if (r0.isEmpty() != false) goto L15;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:118:0x07e7  */
    /* JADX WARN: Type inference failed for: r0v402, types: [com.facebook.messaging.montage.viewer.MontageViewerFragment, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v431, types: [X.Gbz, androidx.fragment.app.Fragment] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 3219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AV7.invoke(java.lang.Object):java.lang.Object");
    }
}
