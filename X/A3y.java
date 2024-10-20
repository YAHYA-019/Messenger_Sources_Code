package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.xapp.messaging.threadview.model.photo.Photo;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: A3y.class */
public final class A3y implements AYf {
    public final Fragment A00;

    public A3y(Fragment fragment) {
        this.A00 = fragment;
    }

    @Override // X.AYf
    public void C6e(1Iw r302, C5j5 c5j5, C9c2 c9c2, 5vW r305) {
        11T.A0F(r302, 0);
        1BK.A1J(r305, 2, c9c2);
        C5fv c5fv = ((5vV) r305).A00;
        if (!(c5fv instanceof C5ft)) {
            0fH.A0o("SaveAllImagesActionDrawerListener", 7zS.A13(c5fv, "Tried to save a photo message that wasn't a PhotoMessage: ", AnonymousClass001.A0k()));
            return;
        }
        C5ft c5ft = (C5ft) c5fv;
        if (c5ft != null) {
            Context context = r302.A0D;
            IDb iDb = (IDb) 7zN.A0k(context, 67683);
            ImmutableList immutableList = c5ft.A01;
            ArrayList A0z = 1BL.A0z(immutableList);
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                Photo photo = (Photo) it.next();
                String str = photo.A0E;
                11T.A0A(str);
                A0z.add(new 8L1(str, photo.A0D, photo.A0B, 2));
            }
            iDb.A07(context, this.A00, A0z, AVF.A01(c9c2, 8), false);
        }
    }
}
