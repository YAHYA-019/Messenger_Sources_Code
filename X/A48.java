package X;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharedalbum.model.Photos;

/* loaded from: A48.class */
public final class A48 implements AYf {
    public final Fragment A00;
    public final ThreadKey A01;

    public A48(Fragment fragment, ThreadKey threadKey) {
        this.A01 = threadKey;
        this.A00 = fragment;
    }

    @Override // X.AYf
    public void C6e(1Iw r302, C5j5 c5j5, C9c2 c9c2, 5vW r305) {
        Parcelable parcelable;
        String A13;
        4YV.A1N(r302, r305);
        1BV A0G = 7zU.A0G(r302, 68143);
        5gR r0 = ((5vV) r305).A00;
        Fragment fragment = this.A00;
        06Z r310 = null;
        if (fragment != null) {
            r310 = fragment.getChildFragmentManager();
        }
        if (r310 == null) {
            A13 = "Tried to add a photo/video message to album but fragmentManager is null";
        } else {
            if (r0 instanceof C5ft) {
                parcelable = new Photos(((C5ft) r0).A01);
            } else {
                if (r0 instanceof 5gR) {
                    parcelable = r0.A00;
                }
                A13 = 7zS.A13(r0, "Tried to add a photo/video message to album that wasn't a PhotoMessage or VideoMessage: ", AnonymousClass001.A0k());
            }
            Parcelable parcelable2 = parcelable;
            if (parcelable2 != null) {
                ((9YA) A0G.get()).A00(parcelable2, r310, this.A01, ((C5fu) r0).A09, "MESSAGE_ACTION");
                return;
            }
            A13 = 7zS.A13(r0, "Tried to add a photo/video message to album that wasn't a PhotoMessage or VideoMessage: ", AnonymousClass001.A0k());
        }
        0fH.A0o("SharedAlbumActionDrawerListener", A13);
    }
}
