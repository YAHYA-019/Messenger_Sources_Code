package org.webrtc;

import X.0Pz;
import X.AnonymousClass001;
import java.util.Iterator;
import java.util.List;

/* loaded from: MediaConstraints.class */
public class MediaConstraints {
    public final List mandatory = AnonymousClass001.A0s();
    public final List optional = AnonymousClass001.A0s();

    public String toString() {
        List list = this.mandatory;
        StringBuilder sb = new StringBuilder("[");
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next();
            sb.length();
            throw AnonymousClass001.A0Q("toString");
        }
        String A0W = 0Pz.A0W("[", "]");
        List list2 = this.optional;
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it2 = list2.iterator();
        if (!it2.hasNext()) {
            return 0Pz.A0v("mandatory: ", A0W, ", optional: ", 0Pz.A0W("[", "]"));
        }
        it2.next();
        sb2.length();
        throw AnonymousClass001.A0Q("toString");
    }
}
