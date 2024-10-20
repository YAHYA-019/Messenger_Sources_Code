package X;

import com.facebook.contacts.server.FetchContactsResult;
import com.facebook.fbservice.service.OperationResult;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;

/* loaded from: D37.class */
public final class D37 implements Function {
    public static final D37 A00 = new D37();

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        OperationResult operationResult = (OperationResult) obj;
        11T.A0D(operationResult);
        ImmutableList immutableList = ((FetchContactsResult) operationResult.A07()).A01;
        if (immutableList.isEmpty()) {
            return null;
        }
        return 1BK.A0r(immutableList);
    }
}
