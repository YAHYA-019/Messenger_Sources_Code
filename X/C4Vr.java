package X;

import com.facebook.messaging.settings.plugins.iadrawer.drawerheader.MeSettingsDrawerHeaderImplementation;
import com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.homedrawer.folderitem.MessageRequestsFolderItem;

/* renamed from: X.4Vr, reason: invalid class name */
/* loaded from: 4Vr.class */
public final class C4Vr implements 2OV {
    public final int A00;
    public final Object A01;

    public C4Vr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bkl() {
        ((C4Fm) (this.A00 != 0 ? ((MessageRequestsFolderItem) this.A01).A04 : ((MeSettingsDrawerHeaderImplementation) this.A01).A07).A01).A1a();
    }
}
