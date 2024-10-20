package X;

import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: Jyl.class */
public final class Jyl extends Jym {
    public static final BitSet A00 = new BitSet(0);
    public static final long serialVersionUID = 1;
    public final java.util.Map fieldBitIndex;
    public final java.util.Map subtypeFingerprints;

    public Jyl(C26L c26l, 24S r303, 24S r304, MKA mka, Collection collection) {
        super(null, r303, r304, mka, null, false);
        this.fieldBitIndex = AnonymousClass001.A0u();
        boolean A09 = c26l.A09(AnonymousClass260.A02);
        HashMap A0u = AnonymousClass001.A0u();
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            3eR r0 = (3eR) it.next();
            List A01 = AnonymousClass251.A01(c26l._base._classIntrospector.A03(c26l, c26l._base._typeFactory.A09(r0._class), c26l));
            BitSet bitSet = new BitSet(A01.size() + i);
            Iterator it2 = A01.iterator();
            while (it2.hasNext()) {
                String A0M = ((AnonymousClass687) it2.next()).A0M();
                A0M = A09 ? A0M.toLowerCase() : A0M;
                Number A0o = 1BK.A0o(A0M, this.fieldBitIndex);
                if (A0o == null) {
                    A0o = Integer.valueOf(i);
                    i++;
                    this.fieldBitIndex.put(A0M, A0o);
                }
                bitSet.set(A0o.intValue());
            }
            Object put = A0u.put(bitSet, r0._class.getName());
            if (put != null) {
                throw JQy.A0k("Subtypes %s and %s have the same signature and cannot be uniquely deduced.", new Object[]{put, r0._class.getName()});
            }
        }
        this.subtypeFingerprints = A0u;
    }

    public Jyl(68U r302, Jyl jyl) {
        super(r302, jyl);
        this.fieldBitIndex = jyl.fieldBitIndex;
        this.subtypeFingerprints = jyl.subtypeFingerprints;
    }
}
