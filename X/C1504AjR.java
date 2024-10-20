package X;

import com.facebook.assistant.stella.ipc.common.model.StellaPaginatedContactsResult;
import com.facebook.common.callercontext.CallerContext;
import java.util.List;

/* renamed from: X.AjR, reason: case insensitive filesystem */
/* loaded from: AjR.class */
public final class C1504AjR extends StellaPaginatedContactsResult {
    public final /* synthetic */ B9t A00;
    public final /* synthetic */ List A01;

    public C1504AjR(B9t b9t, List list, int i, int i2, boolean z) {
        this.A00 = b9t;
        this.A01 = list;
        this.contacts = new C1502AjP(this);
        if (z) {
            CallerContext callerContext = B9t.A07;
            List list2 = b9t.A02;
            if (i <= 0.0f) {
                throw AnonymousClass001.A0L("pageSize must be a positive number greater than 0");
            }
            this.totalPages = (list2 == null || list2.isEmpty()) ? 1 : (int) Math.ceil(list2.size() / r0);
            this.pageNumber = i2;
        }
    }
}
