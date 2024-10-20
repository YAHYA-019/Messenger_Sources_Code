package X;

import com.facebook.fbservice.service.OperationResult;
import com.facebook.messaging.media.folder.LocalMediaFolderResult;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: D2f.class */
public final class D2f implements Function {
    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        OperationResult operationResult = (OperationResult) obj;
        if (operationResult == null) {
            return null;
        }
        LocalMediaFolderResult localMediaFolderResult = (LocalMediaFolderResult) operationResult.A07();
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du it = localMediaFolderResult.A00.iterator();
        while (it.hasNext()) {
            AbH.A1V(builder, it);
        }
        return ImmutableList.copyOf((Collection) builder.build());
    }
}
