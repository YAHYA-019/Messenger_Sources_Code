package X;

import android.os.Bundle;
import com.facebook.messaging.msys.thread.debug.MessageDebugMenuFragment;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

/* loaded from: A3t.class */
public final class A3t implements AYf {
    public final 2Og A00;

    public A3t(2Og r302) {
        this.A00 = r302;
    }

    @Override // X.AYf
    public void C6e(1Iw r302, C5j5 c5j5, C9c2 c9c2, 5vW r305) {
        String obj;
        String str;
        11T.A0F(r305, 2);
        06Z BdK = this.A00.BdK();
        if (BdK != null) {
            5gR r0 = ((5vV) r305).A00;
            11T.A0F(r0, 0);
            Bundle A05 = 1BK.A05();
            C5fu c5fu = (C5fu) r0;
            A05.putString("message_pk", c5fu.A09);
            Bundle A052 = 1BK.A05();
            if (r0 instanceof C5ft) {
                ImmutableList immutableList = ((C5ft) r0).A01;
                A052.putString("photo.size", String.valueOf(immutableList.size()));
                Iterator it = immutableList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        C0s8.A18();
                        throw 0Q8.createAndThrow();
                    }
                    A052.putString(0Pz.A0O("photo[", ']', i), next.toString());
                    i = i2;
                }
                A052.putString("offlineThreadingId", c5fu.A0B);
                A052.putString("sendState", c5fu.A04.toString());
                A052.putString("messageAuthor", c5fu.A05.A07);
                A05.putBundle("data_model_bundle", A052);
                2Ov messageDebugMenuFragment = new MessageDebugMenuFragment();
                messageDebugMenuFragment.setArguments(A05);
                messageDebugMenuFragment.A0m(BdK, "MessageDebugActionDrawerListener");
            }
            if (r0 instanceof 5gR) {
                obj = r0.A00.toString();
                str = "video.attachment";
            } else if (r0 instanceof C5n8) {
                C5n8 c5n8 = (C5n8) r0;
                A052.putString("xma.title", c5n8.A0B);
                A052.putString("xma.subtitle", c5n8.A0A);
                List list = c5n8.A0D;
                A052.putString("xma.ctas.size", String.valueOf(list.size()));
                int i3 = 0;
                for (Object obj2 : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        C0s8.A18();
                        throw 0Q8.createAndThrow();
                    }
                    A052.putString(0Pz.A0O("xma.ctas[", ']', i3), obj2.toString());
                    i3 = i4;
                }
                obj = c5n8.A03.toString();
                str = "xma.defaultCta";
            } else {
                if (!(r0 instanceof 5gP)) {
                    if (r0 instanceof C5v9) {
                        obj = ((C5v9) r0).A00.toString();
                        str = "asset-sticker.photo";
                    }
                    A052.putString("offlineThreadingId", c5fu.A0B);
                    A052.putString("sendState", c5fu.A04.toString());
                    A052.putString("messageAuthor", c5fu.A05.A07);
                    A05.putBundle("data_model_bundle", A052);
                    2Ov messageDebugMenuFragment2 = new MessageDebugMenuFragment();
                    messageDebugMenuFragment2.setArguments(A05);
                    messageDebugMenuFragment2.A0m(BdK, "MessageDebugActionDrawerListener");
                }
                5gP r02 = (5gP) r0;
                A052.putString("sticker.stickerId", r02.A01);
                obj = 4YV.A0u(r02.A00);
                str = "sticker.localSticker";
            }
            A052.putString(str, obj);
            A052.putString("offlineThreadingId", c5fu.A0B);
            A052.putString("sendState", c5fu.A04.toString());
            A052.putString("messageAuthor", c5fu.A05.A07);
            A05.putBundle("data_model_bundle", A052);
            2Ov messageDebugMenuFragment22 = new MessageDebugMenuFragment();
            messageDebugMenuFragment22.setArguments(A05);
            messageDebugMenuFragment22.A0m(BdK, "MessageDebugActionDrawerListener");
        }
    }
}
