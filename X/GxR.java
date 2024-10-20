package X;

import com.facebook.rsys.groupexpansion.gen.GroupExpansionCompletedCallback;
import com.facebook.rsys.groupexpansion.gen.GroupExpansionProxy;
import java.util.ArrayList;

/* loaded from: GxR.class */
public final class GxR extends GroupExpansionProxy {
    public final GroupExpansionProxy A00;

    public GxR(GroupExpansionProxy groupExpansionProxy) {
        this.A00 = groupExpansionProxy;
    }

    @Override // com.facebook.rsys.groupexpansion.gen.GroupExpansionProxy
    public void expand(String str, String str2, ArrayList arrayList, ArrayList arrayList2, int i, int i2, GroupExpansionCompletedCallback groupExpansionCompletedCallback) {
        11T.A0H(str, str2);
        7zP.A1L(arrayList2, 3, groupExpansionCompletedCallback);
        4zI.A03.A07("OrcaGroupExpansionProxy", "Expand call with expansion proxy; expansionType: %d", AnonymousClass001.A1a(i));
        this.A00.expand(str, str2, arrayList, arrayList2, i, i2, groupExpansionCompletedCallback);
    }
}
