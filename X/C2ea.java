package X;

import com.facebook.messaging.inboxsubtabs.plugins.subtabs.itemsupplier.InboxSubtabsItemSupplierImplementation;

/* renamed from: X.2ea, reason: invalid class name */
/* loaded from: 2ea.class */
public final class C2ea implements Runnable {
    public static final String __redex_internal_original_name = "InboxSubtabsItemSupplierImplementation$onSubscribe$1";
    public final /* synthetic */ InboxSubtabsItemSupplierImplementation A00;

    public C2ea(InboxSubtabsItemSupplierImplementation inboxSubtabsItemSupplierImplementation) {
        this.A00 = inboxSubtabsItemSupplierImplementation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A0I.set(true);
    }
}
