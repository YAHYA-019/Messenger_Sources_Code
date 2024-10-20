package X;

import com.facebook.assistant.stella.ipc.common.model.StellaPaginatedContactsResult;
import java.util.List;

/* renamed from: X.AjQ, reason: case insensitive filesystem */
/* loaded from: AjQ.class */
public final class C1503AjQ extends StellaPaginatedContactsResult {
    public final /* synthetic */ D33 A00;
    public final /* synthetic */ List A01;

    public C1503AjQ(D33 d33, List list) {
        this.A00 = d33;
        this.A01 = list;
        if (d33.A06) {
            List list2 = d33.A04.A01;
            if (d33.A00 <= 0.0f) {
                throw AnonymousClass001.A0L("pageSize must be a positive number greater than 0");
            }
            this.totalPages = (list2 == null || list2.isEmpty()) ? 1 : (int) Math.ceil(list2.size() / r0);
            this.pageNumber = d33.A01;
        }
        this.contacts = new C1501AjO(this);
    }
}
