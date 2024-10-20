package X;

import com.facebook.xapp.messaging.threadview.model.writewithai.WriteWithAiMetadata;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5qv, reason: invalid class name */
/* loaded from: 5qv.class */
public final class C5qv implements C5g0 {
    @Override // X.C5g0
    public List AmB(C5fv c5fv) {
        ArrayList arrayList = new ArrayList();
        WriteWithAiMetadata writeWithAiMetadata = (WriteWithAiMetadata) c5fv.AxW(C5qw.A00);
        if (writeWithAiMetadata != null && writeWithAiMetadata.A00 && (c5fv instanceof 5gC)) {
            arrayList.add(HCE.A0e);
        }
        return arrayList;
    }
}
